package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InjectListOfSingleBoundGenericInConstructorByTypeFoo<T extends ServiceFoo> {
    
    final List<T> fooServices;

    // no errors are shown, but no autowired beans are shown, navigation doesn't work
    public InjectListOfSingleBoundGenericInConstructorByTypeFoo(List<T> foos) {
        this.fooServices = foos;
    }
    public void displayMethod() {
        System.out.println("=============== inject list of single-bound generic type components by type: ==========");
        fooServices.forEach(s -> {
            System.out.println(s.foo());
        });
    }
}
