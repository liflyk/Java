package org.kp.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArraysOfString {

	public static void main(String[] args) {
	String[] str= {"Banaras","Hindu","University"};
	List<String> list=Arrays.asList(str);
	//array before reverse
	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
	}

}
