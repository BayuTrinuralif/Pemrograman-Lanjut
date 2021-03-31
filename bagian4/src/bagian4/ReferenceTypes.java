/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian4;

/**
 *
 * @author Bayu
 */
public class ReferenceTypes {
    
		public static void main(String[ ] args) {
  Person p = new Person();
  p.setAge(25);
  change(p);
  System.out.println(p.getAge());
}
static void change(Person p) {
  p.setAge(10);
}
}
