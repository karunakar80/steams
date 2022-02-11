package com.filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Karunakarreddy","kumar","sanjaii","anil");
		
		List<String> longnames=new ArrayList<String>();
		//type 1 data fill anoter collection use this type
		/*
		 * longnames=names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
		 * 
		 * System.out.println(longnames);
		 */
		
		//type 2
		//names.stream().filter(n->n.length()>6 && n.length()<8).forEach(n->System.out.println(n));
		
		
		//type 3
		
		names.stream().filter(n->n.length()>6 && n.length()<8).forEach(System.out::println);
		
	}

}
