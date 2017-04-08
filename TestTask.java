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
   
  
    String str1 = "[-Inf;4]u[6;+Inf]";
    String str2 = "[-Inf;1]u[2;+Inf]";
    String str3 = "[-Inf;3.5]u[5;+Inf]";
    
    ArrayList<String> arr1 = new ArrayList<>(); 
   
    arr1.add(str3);arr1.add(str1);arr1.add(str2);
    Sets s = new Sets();
        //System.out.println(s.findFinalSet(s.toHashMap(arr1)));
    /*
     double[] min = {Double.NEGATIVE_INFINITY,200};
       double[] max = {300,Double.POSITIVE_INFINITY};
       double[] q = {Double.NEGATIVE_INFINITY,500};
       double[] w = {600,Double.POSITIVE_INFINITY};
       double[] e = {100,1000};
       double[] r = {300,500};
       
        HashMap <Integer,double[]> resSet = new HashMap<>(); 
        HashMap <Integer,double[]> resSet1 = new HashMap<>();
        HashMap <Integer,double[]> resSet3 = new HashMap<>(); 
        HashMap <Integer,double[]> []resSet2 = new HashMap[3];
        resSet.put(0, min);resSet.put(1, max);
        resSet1.put(0, q);resSet1.put(1, w);
        resSet3.put(0, e);resSet3.put(1, r);
        resSet2[0] = resSet; resSet2[1] = resSet1; resSet2[2] = resSet3;
      
        for (HashMap<Integer, double[]> hashMap : resSet2) {
            for (Map.Entry <Integer, double[]> entry : hashMap.entrySet()) {
                System.out.println(Arrays.toString(entry.getValue()));
            }
        }
  */
        System.out.println("###############");
        for (Map.Entry <Integer, double[]> entry : s.findFinalSet(s.toHashMap(arr1)).entrySet()) {
                System.out.println(Arrays.toString(entry.getValue()));
            }
        
               
            API api = new API();
            api.setDefaultSetsFromString(arr1);
            api.setNumber(5);
            System.out.println(api.getNearestnumber());
        
        
     

    }
    
    public static void main(String[] args) {
      MyWindow m = new MyWindow();
       m.setVisible(true);
       //solution();    
    }
    
}
