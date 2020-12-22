package com.calculadora.web.models;

import java.util.ArrayList;

public class Calculator {
	private int result;
	private int var;
	ArrayList<Integer> num = new ArrayList<>();
	ArrayList<Character> op = new ArrayList<>();
	
	public Calculator() {}
	
	public void performOperation(int x) {
		num.add(x);
	}
	
	public void performOperation(char y) {
		op.add(y);
		
		if(num.size() >= 2 && y == '=') {
			while(op.size() > 1) {
				for(int i=0; i<op.size(); i++) {
				
					if(op.get(i) == '*') {
						var = num.get(i) * num.get(i+1);
						num.set(i, var);
						num.remove(i+1);
						op.remove(i);
					}
					if(op.get(i) == '/') {
						var = num.get(i) / num.get(i+1);
						num.set(i, var);
						num.remove(i+1);
						op.remove(i);
					}	
				}
			
				for(int j=0; j<op.size(); j++) {
				
					if(op.get(j) == '+') {
						var = num.get(j) + num.get(j+1);
						num.set(j, var);
						num.remove(j+1);
						op.remove(j);
					}
					if(op.get(j) == '-') {
						var = num.get(j) - num.get(j+1);
						num.set(j, var);
						num.remove(j+1);
						op.remove(j);
					}
				}
			}
			this.result = num.get(0);
		}
	}
	public int getResults() {
		return result;
	}
}
