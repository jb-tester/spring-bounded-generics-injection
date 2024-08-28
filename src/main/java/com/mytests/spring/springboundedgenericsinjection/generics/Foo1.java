package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.stereotype.Component;


@Component
public class Foo1 implements ServiceFoo {


    @Override
    public String foo() {
       return "fooOnly - 1";
    }
}
