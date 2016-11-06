package com.daniel;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 101; i++){
			System.out.println("Hallo, Welt!\ndu bist zu "+MathClass.getAdd(i,i)+"% toll");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//TODO: Make gui
		}
	}

}