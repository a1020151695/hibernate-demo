package com.hibernatedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Cola
 * @description 订单实体类
 * @date 2022/1/10
 * @email 1020151695@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    /**
     * 订单编号
     */
    private Integer id;

    /**
     * 订单内容
     */
    private String title;
}
