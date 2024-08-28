package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InjectListOfSingleBoundGenericInConstructorByTypeBar<T extends ServiceBar> {
    
    final List<T> barServices;

    // no errors are shown, but no autowired beans are shown, navigation doesn't work
    public InjectListOfSingleBoundGenericInConstructorByTypeBar(List<T> bars) {
        this.barServices = bars;
    }
    public void displayMethod() {
        System.out.println("=============== inject list of single-bound generic type components by type: ==========");
        barServices.forEach(s -> {
            System.out.println(s.bar());
        });
    }
}
