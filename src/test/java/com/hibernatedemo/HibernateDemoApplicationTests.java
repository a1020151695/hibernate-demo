package com.hibernatedemo;

import com.hibernatedemo.dao.ManageOrder;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HibernateDemoApplicationTests {
    /**
    * @author cola
    * @description 初始化SessionFactory
    * @date 2022/1/10
    * @email 1020151695@qq.com
    */
    @BeforeAll
    public static void buildSessionFactory(){
        try {
            ManageOrder.factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
    * @author cola
    * @description 测试新增订单
    * @date 2022/1/10
    * @email 1020151695@qq.com
    */
    @Test
    public void testCreate(){
        ManageOrder manageOrder = new ManageOrder();
        assertEquals(manageOrder.addOrder("cola"),1);
    }

    /**
    * @author cola
    * @description 测试dao更新订单
    * @date 2022/1/10
    * @email 1020151695@qq.com
    */
    @Test
    public void testUpdate(){
        ManageOrder manageOrder = new ManageOrder();
        assertEquals(manageOrder.updateOrder(5,"cola"),1);
    }

    /**
    * @author cola
    * @description 测试dao获取所有订单
    * @date 2022/1/10
    * @email 1020151695@qq.com
    */
    @Test
    public void testRead(){
        ManageOrder manageOrder = new ManageOrder();
        System.out.println(manageOrder.getOrders());
    }

    /**
    * @author cola
    * @description 测试dao删除订单
    * @date 2022/1/10
    * @email 1020151695@qq.com
    */
    @Test
    public void testDelete(){
        ManageOrder manageOrder = new ManageOrder();
        assertEquals(manageOrder.deleteOrder(6),1);
    }

}
