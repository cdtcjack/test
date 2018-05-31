package com.test.com;

public class TTT {
	public static void main(String[] args) {
		new Child();
	}
}

class Father {
	private int i = 2;

	public Father() {
		destory();
	}

	public void destory() {
		System.out.println(i);
	}
}

class Child extends Father {
	private int i = 3;

	public Child() {
		i = 222;
	}

	public void destory() {
		System.out.println(i);
	}
}
