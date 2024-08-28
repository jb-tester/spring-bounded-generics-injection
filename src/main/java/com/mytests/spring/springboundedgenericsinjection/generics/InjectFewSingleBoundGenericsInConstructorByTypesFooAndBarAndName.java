package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.stereotype.Service;

// multiple single-bounded generics
@Service
public class InjectFewSingleBoundGenericsInConstructorByTypesFooAndBarAndName<T extends ServiceFoo, K extends ServiceBar> {

    private final T service1;
    private final K service2;

    // should navigate to foo1 and bar1 (not to foobar, foo1 or bar2) - parameter names can be used as qualifiers
    // actually errors are shown: `Could not autowire. No beans of 'T'('K') type found.
    public InjectFewSingleBoundGenericsInConstructorByTypesFooAndBarAndName(T foo1, K bar1) {
        this.service1 = foo1;
        this.service2 = bar1;
    }

    public void displayMethod() {
        System.out.println("============ inject multiple single-bound generic types components by type + parameter name ==============");
        System.out.println(service1.foo() + " " + service2.bar());
    }


}
