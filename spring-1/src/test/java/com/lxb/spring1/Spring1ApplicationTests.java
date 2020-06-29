package com.lxb.spring1;

import com.lxb.spring1.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan
class Spring1ApplicationTests {
    @Autowired
    Person person; //将person自动注入进来
    @Test
    void contextLoads() {



            System.out.println(person); //打印person信息

    }

}
