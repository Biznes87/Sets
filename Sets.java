/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;


import java.util.*;
import static java.lang.Math.abs;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import static java.math.BigDecimal.ROUND_CEILING;

public class Sets {
 
    protected  double getClosestNum(HashMap<Integer,double[]> hashmap, double num){
        
        double resNum = 0.0;
        SortedMap<Double,Double> hash=new TreeMap<>();
       
       
        for (Map.Entry<Integer,double[]> entry: hashmap.entrySet()) {
            if((num>=entry.getValue()[0])&&(num<=entry.getValue()[1]) ){resNum = num; return resNum;} 
            else{
                hash.put(abs(num-entry.getValue()[0]),entry.getValue()[0]);
                hash.put(abs(num-entry.getValue()[1]),entry.getValue()[1]);
            }
        }
       return  resNum=hash.get(hash.firstKey());
    }
    
    protected HashMap <Integer,double[]>  intersection(HashMap <Integer,double[]> set1,HashMap <Integer,double[]> set2 ){
        
        HashMap <Integer,double[]> resSet = new HashMap<>(); resSet.get(1);
        double [] tmp = new double[2];
        int count = 0;
        for (int i = 0; i < set1.size(); i++) {
            for (int j = 0; j < set2.size(); j++) {
                double a = set1.get(i)[0]; 
                double b = set1.get(i)[1];
                double x = set2.get(j)[0]; double y = set2.get(j)[1];
                if((a>y)||(b<x)){
                  //  resSet.clear();
                }else{if((a>=x)&&(b>=y)){ 
                    resSet.put(count, new double[]{a,y});
                }
                if((a<=x)&&(b<=y)){
                   resSet.put(count, new double[]{x,b});
                }
                if((a>=x)&&(b<=y)){
                   resSet.put(count, new double[]{a,b});
                }
                if((a<=x)&&(b>=y)){
                     resSet.put(count, new double[]{x,y}); 
                }
                count++;}
                
            }           
        }      
       return resSet;
    }
   
    private double[] intervalParse(String str ){
        
        double [] resArr= new double[2];
        
        String[] parts = str.split("\\s|\\[|\\;|\\]");
        
        for (int i = 1; i <parts.length; i++) {
            if(parts[i].equals("-Inf")){resArr[i-1] = Double.NEGATIVE_INFINITY;}
            else if(parts[i].equals("+Inf")){resArr[i-1] = Double.POSITIVE_INFINITY;}
            else{ resArr[i-1] = Double.valueOf(parts[i]);}
        }
        
        return resArr;
    }
    
    protected HashMap<Integer, double[]> [] toHashMap(ArrayList<String> str){
       
       HashMap<Integer, double[]>[] res = new HashMap[str.size()];
       HashMap<Integer, double[]> tmpres = new HashMap<>();
       
       for(int i = 0; i < str.size(); i++){
             if(str.get(i).contains("u")){
                 String[] subSets = str.get(i).split("(\\u0075)");
                 for (int j = 0; j < subSets.length; j++) { 
                     tmpres.put(j,intervalParse(subSets[j]));  
                     
                 }
                 res[i]= new HashMap<Integer, double[]> (tmpres);
             }else {
               tmpres.put(0,intervalParse(str.get(i)));
               res[i]= new HashMap<Integer, double[]> (tmpres);
            }
          tmpres.clear();
       }
      return res;
    }
    
    private boolean uniqCheck (HashMap<Integer, double[]> hashmap, double[] arr){
        boolean flag = true;
        for (Map.Entry <Integer, double[]> entry : hashmap.entrySet()) {
            if ((arr[0] == entry.getValue()[0])&&(arr[1] == entry.getValue()[1])){ 
                flag = false;
            }
        }
        return flag;
    }
   
    protected HashMap<Integer, double[]> findFinalSet(HashMap<Integer, double[]> [] arr){
        
        HashMap<Integer, double[]> finalResult = new HashMap<>();        
        HashMap<Integer, double[]> tmpResult = new HashMap<>();
        HashMap<Integer, double[]> tmp = new HashMap<>();
        int k=0;
        tmpResult.putAll(arr[0]);
        try{
        for (int i = 1; i < arr.length; i++) {
            finalResult.clear();
            tmp.clear();
            tmp.putAll(intersection(tmpResult,arr[i]));
            tmpResult.clear();
            if(!tmp.isEmpty()){
                tmpResult.putAll(tmp);
            
                for (Map.Entry <Integer, double[]> entry : tmpResult.entrySet()) {
                    //Проверка на уникальность добавляемого отрезка
                    if(uniqCheck(finalResult, entry.getValue())){
                        finalResult.put(k,entry.getValue());
                        k++;
                    }     
                }         
            }else {
               finalResult.clear();
               return finalResult;
            }
            tmpResult.clear();
            tmpResult.putAll(finalResult);
        }
        }catch(ArrayIndexOutOfBoundsException e){ 
            finalResult.putAll(tmpResult);
            System.out.println("lalala");
        }
        if(arr.length==1){
             finalResult.putAll(tmpResult);
        }
       
        return finalResult;
    }
    
    
}
