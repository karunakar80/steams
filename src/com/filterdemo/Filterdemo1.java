package com.filterdemo;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {

	public static void main(String[] args) {
		
List<Integer> numbersList=Arrays.asList(10,15,20,25,30);
List<Integer> evenNumbersList=new ArrayList<Integer>();

//without using Streams

/*
 * for(int n:numbersList) { 
 * if(n%2==0) 
 * evenNumbersList.add(n);
 * 
 * } 
 * System.out.println(evenNumbersList);
 * 
 */


//1. with streams
/*
 * evenNumbersList=numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
 *  System.out.println(evenNumbersList);
 */

//Elements will not add another collection use this type directly print elements
// numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));

//we  can directly print by using forEach( System.out::println) then it will be useprint case without using lambda expression
numbersList.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
