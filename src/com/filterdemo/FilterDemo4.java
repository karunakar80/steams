package com.filterdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class FilterDemo4 {

	public static void main(String[] args) {
		
		List<Product> productList=new ArrayList<Product>();
		
		productList.add(new Product(1,"HP Laptop",25000));
		productList.add(new Product(1,"Dell Laptop",30000));
		productList.add(new Product(1,"Sony Laptop",23000));
		productList.add(new Product(1,"Apple Laptop",90000));
		
		

		productList.stream().filter(p->p.price>25000).forEach(p->System.out.println(p.price+ " "+p.name));
		
	}

}
