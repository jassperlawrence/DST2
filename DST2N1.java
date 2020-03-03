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
public class DST2N1 <T>{
    private T t;
    private T u;

    public DST2N1(T t, T u) {
        this.t = t;
        this.u = u;
        
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getU() {
        return u;
    }

    public void setU(T u) {
        this.u = u;
    }

    
    public String toString() {
        return "The parameter values are : "+t+" and "+u;
        
    }
    public void  display(){
        
        if(t instanceof Integer && u instanceof Integer ){
            int n= (Integer )t+(Integer)u;
            System.out.println("The sum of the integer is "+n);
        }
        else if(t instanceof Double && u instanceof Double ){
            double n=(Double)t+(Double)u;
            System.out.println("The sum of the double is "+n);
    }
        else if(t instanceof String && u instanceof String){
            if(t.equals(u)){
                System.out.println("The string is equal");
            }
            else 
                System.out.println("The string is not equal");
        }
    }
}
