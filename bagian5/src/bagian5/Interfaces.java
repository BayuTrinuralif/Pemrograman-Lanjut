/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian5;

/**
 *
 * @author Bayu
 */
public class Interfaces {
    
	interface Animal {

   	public void eat();

	}

	class Cat implements Animal
	{
		public void eat()
		{
			System.out.println("Cat eats!");
		}
	}
}
