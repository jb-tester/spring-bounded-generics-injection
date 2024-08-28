package com.mytests.spring.springboundedgenericsinjection.generics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InjectListOfListOfBoundedTypes<T extends ServiceBar> {


    private final List<List<T>> barList;
    private final List<List<T>> qualifiedBarList;

   // error is shown: `Could not autowire. Qualified bean must be of 'List<List<T>>' type.`
    public InjectListOfListOfBoundedTypes(List<List<T>> barList, @Qualifier("qualifiedBarList") List<List<T>> qualifiedBarList) {
        this.barList = barList;
        this.qualifiedBarList = qualifiedBarList;
    }

    public void displayMethod() {
        System.out.println("====== list of list of beans by type =====");
        barList.forEach(s -> {s.forEach(serviceBar -> System.out.println(serviceBar.bar()));});
        System.out.println("-- and with qualifiers: --");
        qualifiedBarList.forEach(s -> {s.forEach(serviceBar -> System.out.println(serviceBar.bar()));});
        System.out.println("===================");
    }

    ;
}
