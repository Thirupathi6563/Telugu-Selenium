package com.teluguselenium.SeleniumTelugu;

public class typeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Type inference is a concept in which the compiler infers the type of the variable using the value provided.
//This type of the inference only used in local variables.
//This feature is introduced in java 10 version
		
//Var keyword restrictions
	//1. var can be used only in the local variables
	//2. var can't be used for only declaration purpose,instead it should be used along with intiliaztion.
		//Ex: var j; --> if we use like this war then will get compilation error
		var j=10;
	//3. When used with arrays,should not use [] brackets.
		//EX: var[] a=new int[5] -->if we use like this war then will get compilation error 
		var a=new int[5];
		//Ex2: var b={10,20,40}; -->if we use like this war then will get compilation error 
		var b=new int[]{10,20,30};
	//4. var can't be used in In-line array initilaization but specifying the data type 

	}

}
