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
public class SpecialEncoding<T> {
    
    private T t[],u[];

    public SpecialEncoding(T[] t) {
        this.t = t;
        this.u = u;
    }

    public T[] getT() {
        return t;
    }

    public void setT(T[] t) {
        this.t = t;
    }

    public T[] getU() {
        return u;
    }

    public void setU(T[] u) {
        this.u = u;
    }

    @Override
    public String toString() {
        String n="";
        
        if(t[0] instanceof Integer ){
            for (int i = 0; i < t.length; i++) {
                if((Integer)t[i]==0){
                    n+=" Copy";
                }
                if((Integer)t[i]==1){
                    n+=" Delete";
                }
                if((Integer)t[i]==2){
                    n+=" Insert";
                }
                if((Integer)t[i]==3){
                    n+=" Print";
                }
                if((Integer)t[i]==4){
                    n+=" Rename";
                }
                if((Integer)t[i]==5){
                    n+=" Paste";
                }
        }
    }
        else if(t[0] instanceof Character ){
            
            for (int i = 0; i < t.length; i++) {
               if((Character)t[i]=='C'){
                    n+=" Copy";
                }
                if((Character)t[i]=='D'){
                    n+=" Delete";
                }
                if((Character)t[i]=='I'){
                    n+=" Insert";
                }
                if((Character)t[i]=='P'){
                    n+=" Print";
                }
                if((Character)t[i]=='R'){
                    n+=" Rename";
                }
                if((Character)t[i]=='V'){
                    n+=" Paste";
                }
                
            }
        }
        String display="";
        for (T t1 : t) {
            display+=t1+" ";
        }
        
        return "The code is "+display+"\nThe Command is "+n;
    
}
}
