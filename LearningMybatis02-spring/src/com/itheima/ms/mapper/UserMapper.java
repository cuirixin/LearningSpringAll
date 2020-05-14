package com.itheima.ms.mapper;

import com.itheima.ms.po.User;

/**
 *  
 * <p>
 * Title: UserMapper
 * </p>
 *  
 * <p>
 * Description: TODO(这里用一句话描述这个类的作用) 
 * <p>
 * <p>
 * Company: www.itcast.com
 * </p>
 *  @author 传智.关云长   @date 2015-12-21 下午3:16:06    @version 1.0
 */
public interface UserMapper {
	// 1、 根据用户ID查询用户信息
	public User findUserById(int id) ;
}
