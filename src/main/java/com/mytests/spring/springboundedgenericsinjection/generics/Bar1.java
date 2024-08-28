package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.stereotype.Component;


@Component
public class Bar1 implements ServiceBar {
    @Override
    public String bar() {
        return "barOnly - 1";
    }


}
