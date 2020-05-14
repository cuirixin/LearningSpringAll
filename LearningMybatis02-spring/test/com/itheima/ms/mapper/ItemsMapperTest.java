package com.itheima.ms.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.ms.po.Items;
import com.itheima.ms.po.ItemsExample;
import com.itheima.ms.po.ItemsExample.Criteria;

/**
 *  
 * <p>
 * Title: ItemsMapperTest
 * </p>
 *  
 * <p>
 * Description: TODO(这里用一句话描述这个类的作用) 
 * <p>
 * <p>
 * Company: www.itcast.com
 * </p>
 *  @author 传智.关云长   @date 2015-12-23 下午5:36:15    @version 1.0
 */
public class ItemsMapperTest {

	private ApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext(
				"spring/applicationContext.xml");
	}

	@Test
	public void testSelectByExample() {
		ItemsMapper mapper = (ItemsMapper) ctx.getBean("itemsMapper");
		
		ItemsExample example = new ItemsExample();
		Criteria criteria = example.createCriteria();
		
		criteria.andNameLike("%背包%");
		
		List<Items> list = mapper.selectByExample(example );
		
		System.out.println(list);
	}

}
