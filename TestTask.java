/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author dex
 */
public class TestTask {

    
    private static void solution(){
       int LOW = -1000;
       int HIGH = 1000;
        
        TreeSet b = new TreeSet<>();
        TreeSet f = new TreeSet<>();
        TreeSet s = new TreeSet<>();
        TreeSet t = new TreeSet<>();
        for (int i = 1; i < 10; i++) {
            b.add(i);
            
        }
     
        for (int i = 2; i < 5; i++) {f.add(i);}
        
        for (int i = 3; i < 6; i++) {s.add(i);}
        
        HashMap<Integer,TreeSet> testhash = new HashMap<>();
        testhash.put(1,f); testhash.put(2, b);testhash.put(3, s);
        ArrayList<TreeSet> l = new ArrayList<TreeSet>();
        l.add(f);l.add(b);

        System.out.println(f);
        System.out.println(s);
        System.out.println(b);

        API testApi = new API();
        testApi.setDefaultSets(testhash);
       
        System.out.println(testApi.getSubSets());
       System.out.println(testApi.getNearestnumber());
         MyWindow as = new MyWindow();
         

    }
    
    public static void main(String[] args) {
       MyWindow m = new MyWindow();
       m.setVisible(true);
      // solution();    
    }
    
}
