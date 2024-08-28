package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// multiple bound generics:
@Service
public class InjectMultiBoundGenericsListInConstructor {

    StringBuffer rez = new StringBuffer();


    // should inject both fooBar1 and fooBar2 - by type
    // this doesn't work in the SB less than 3.4
    // we don't show the errors, but don't find the injected beans, navigation doesn't work
    @Autowired
    public <T extends ServiceFoo & ServiceBar> InjectMultiBoundGenericsListInConstructor(List<T> impls) {
        impls.forEach(s -> {
            rez.append(s.foo()).append(" ");
            rez.append(s.bar()).append(";");
        });
    }

    public void displayMethod() {
        System.out.println("=========== inject list of generic type components by type =========================");
        System.out.println(rez);
    }

}
