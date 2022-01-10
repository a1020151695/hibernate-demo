package com.hibernatedemo.dao;

import com.hibernatedemo.entity.Order;
import org.hibernate.*;

import java.util.List;

/**
 * @author Cola
 * @description
 * @date 2022/1/10
 * @email 1020151695@qq.com
 */
public class ManageOrder {

    public static SessionFactory factory=null;

    /**
    * @author cola
    * @description 添加订单
    * @date 2022/1/10
    * @email 1020151695@qq.com
    */
    public int addOrder(String title){
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx=session.beginTransaction();
            Order order = new Order();
            order.setTitle(title);
            session.save(order);
            tx.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 1;
    }

    /**
    * @author cola
    * @description 更新订单
    * @date 2022/1/10
    * @email 1020151695@qq.com
    */
    public int updateOrder(Integer id,String title){
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx=session.beginTransaction();
            Order order = new Order(id,title);
            session.update(order);
            tx.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 1;
    }

    /**
    * @author cola
    * @description 删除订单
    * @date 2022/1/10
    * @email 1020151695@qq.com
    */
    public int deleteOrder(Integer id){
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx=session.beginTransaction();
            Order order = session.get(Order.class,id);
            session.delete(order);
            tx.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 1;
    }

    /**
    * @author cola
    * @description 获取所有订单
    * @date 2022/1/10
    * @email 1020151695@qq.com
    */
    public int getOrders(){
        Session session = factory.openSession();
        Transaction tx = null;
        String sql = "FROM Order";
        try {
            tx=session.beginTransaction();
            List<Order> orders= session.createQuery(sql).list();
            for(Order order : orders){
                System.out.println(order);
            }
            tx.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return 1;
    }
}
