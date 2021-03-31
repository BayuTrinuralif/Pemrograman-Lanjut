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
public class BinaryConverter {
    public static void main(String[ ] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.println(Integer.toBinaryString(x));
}
}
public class Convertor
{
public static String toBinary(int num)
{
String binary="";
while(num>0)
{
binary=(num%2)+binary;
num/=2;
}
return binary;
}
}
