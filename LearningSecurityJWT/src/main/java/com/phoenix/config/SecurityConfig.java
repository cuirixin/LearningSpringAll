package com.phoenix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * description:
 * date: 2020/5/7 11:34 上午
 * author: phoenix
 * version: 1.0.0
 */
@Configuration
@EnableWebSecurity // 1, 添加spring security过滤器
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public PasswordEncoder myEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 2, 配置用户信息加载
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password(myEncoder().encode("12345")).roles("ADMIN")
                .and()
                .withUser("user").password(myEncoder().encode("12345")).roles("USER");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            // 基于token，不需要csrf
            .csrf().disable()
            // 基于token，不需要session
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
            // 下面开始设置权限
            .authorizeRequests()
            // 需要登录
            .antMatchers("/hello").authenticated()
            // 除上面外的所有请求全部放开
            .anyRequest().permitAll();
    }
}
