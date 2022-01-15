# 运行

有单元测试

![image-20220110224316606](https://gitee.com/simple_one1/pic/raw/master/image-20220110224316606.png)



# 配置

## pom

```xml
				<dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.20</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>5.4.18.Final</version>
        </dependency>
```



## 数据源

hibernate.cfg.xml



## mapper

Order.hbm.xml



## SessionFactory

这里没有自动装载，也没有别的地方需要注解了



