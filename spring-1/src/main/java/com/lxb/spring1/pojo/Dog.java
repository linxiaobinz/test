package com.lxb.spring1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ConfigurationProperties(prefix = "dog")
public class Dog {
    @Value("阿黄")
    private String name;
    @Value("18")
    private Integer age;
}
