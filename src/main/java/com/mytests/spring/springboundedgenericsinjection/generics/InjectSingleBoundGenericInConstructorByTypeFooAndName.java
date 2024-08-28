package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.stereotype.Service;

@Service
public class InjectSingleBoundGenericInConstructorByTypeFooAndName<T extends ServiceFoo> {

    final T fooService;

    // error is shown: `Could not autowire. No beans of 'T' type found.`
    public InjectSingleBoundGenericInConstructorByTypeFooAndName(final T foo1) {
        this.fooService = foo1;
    }
    public void displayMethod() {
        System.out.println("============ inject single-bound generic type component by type + parameter name: =============");
        System.out.println(fooService.foo());
    }
}
