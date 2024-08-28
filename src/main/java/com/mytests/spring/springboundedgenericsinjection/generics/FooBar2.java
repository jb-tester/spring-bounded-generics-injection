package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("b_qualifier")
public class FooBar2 implements ServiceFoo, ServiceBar {
    @Override
    public String bar() {
       return "bar2";
    }

    @Override
    public String foo() {
        return "foo2";
    }
}
