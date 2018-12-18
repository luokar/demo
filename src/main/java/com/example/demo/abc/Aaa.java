package com.example.demo.abc;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Service
public class Aaa {
    @Bean
    public void aab() {
        Ppp p = new Ppp();
        try {
            BeanUtils.setProperty(p, "a", "haha");
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(p.getA());
    }
}
