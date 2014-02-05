/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author KCH
 */


public class JavaApplication1 {

   
    public static void main(String[] args) {
        LinkedList<Integer> ciag = new LinkedList<Integer>();
        for(int i=0; i<15; i++){
            ciag.add(new Integer(i));
        }
        
        Random random = new Random();
        for(int i=0; i<15; i++){
            Integer para = random.nextInt(15-i);
            System.out.println((ciag.get(para)+1)+", ");
            ciag.remove(ciag.get(para));
            
        }
        
    }
}
