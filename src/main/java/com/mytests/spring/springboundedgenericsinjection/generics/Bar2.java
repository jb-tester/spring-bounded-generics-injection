package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("b_qualifier")
public class Bar2 implements ServiceBar {
    @Override
    public String bar() {
        return "barOnly - 2";
    }


}
