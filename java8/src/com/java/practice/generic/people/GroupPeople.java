package com.java.practice.generic.people;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** Group people in each city by set of last names **/

public class GroupPeople {

    public static void main(String[] args) {

        Person p1 = new Person("Shashi", "Bangalore");
        Person p2 = new Person("Kiran", "Bangalore");
        Person p3 = new Person("Rakshitha", "Chennai");
        Person p4 = new Person("Kushika", "Delhi");
        Person p5 = new Person("Shamala", "Delhi");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(x -> x.getCity(),
                Collectors.mapping(x -> x.getLastName(), Collectors.toList())));

        System.out.println(map);



    }

}
