/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian3;

/**
 *
 * @author Bayu
 */
public class InitializingArrays {
    public static void main(String[]args)
    {
	//memperbaiki error materi inisialisasi array
        //materi yang 1
        int tmp[ ] = {5, 8, 9, 3};
        System.out.println(tmp[2]);
        
        //materi array yang lain
        double sum = 0.0;
        for (int x = 0; x < 4; x++){
            
            sum += myArray[x];
        }
        System.out.println(sum);
    }
}