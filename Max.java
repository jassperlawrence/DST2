/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst2;

/**
 *
 * @author Jassper
 */
public class Max {
    
    public Max() {
    }
    
    public static  <T extends Comparable<T>> T max(T a,T b,T c){
        T max=a;
        if(b.compareTo(max)>0){
            max=b;
        }
        else if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
    public static void main(String[] args) {
        Max a = new Max();
        System.out.println( a.max(30.0,20.1,50.4)); 
    }
    
}
