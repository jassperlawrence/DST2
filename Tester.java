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
public class Tester {
    public static void main(String[] args) {
        DST2N1<String>a = new DST2N1<>("Hello","World");
        DST2N1<Double>b = new DST2N1<>(12.4,64.3);
        DST2N1<Integer>c = new DST2N1<>(20,35);
        DST2N1<String>d = new DST2N1<>("Welcome","Welcome");
        DST2N1 []a1= {a,b,c,d};
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i].toString());
            a1[i].display();
            
        }
    }
}
