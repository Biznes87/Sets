/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;


import java.util.*;
import static java.lang.Math.abs;

public class Sets {
    
    private TreeSet intersect(TreeSet sortSet1, TreeSet sortSet2){
    
        sortSet1.retainAll(sortSet2);
        return sortSet1;
    }

    protected TreeSet resultIntersection(HashMap<Integer,TreeSet> mapOfSets){
       
        TreeSet res = new TreeSet();
        TreeSet tmp = new TreeSet();
        try{
            Set entryset = mapOfSets.entrySet();
    
            Iterator iterator = entryset.iterator();
            Object firstkey = mapOfSets.keySet().toArray()[0];
            Collection firstvalue = mapOfSets.get(firstkey);
            tmp.addAll(firstvalue);
        
            int i = 0;
            while(iterator.hasNext()){
                Map.Entry<Integer, TreeSet> entry = (Map.Entry<Integer, TreeSet>) iterator.next();
                res.clear();
                if(i != 0) {
                    res.addAll(intersect(tmp,entry.getValue()));
                    tmp.clear();
                    tmp.addAll(res);       
                }
                i++;
            }
                if(i==1) res.addAll(tmp);
        }catch (Exception e){
            TreeSet exeptionSet = new TreeSet();
            exeptionSet.add(0);
            exeptionSet.add(1);
            res.addAll(exeptionSet);}
       return res;
    }

    protected HashMap<Integer,TreeSet<Integer>> findSubSets(TreeSet <Integer> res){
        
        HashMap<Integer,TreeSet<Integer>> tets = new HashMap<>();
        TreeSet<Integer> temp = new TreeSet<>();  
        try{
            Iterator<Integer> iterator = res.iterator(); 
            Integer tmp=res.first();
            int i =0;
            while(iterator.hasNext()){
                Integer setElement = iterator.next();
                temp.add(tmp);
                if (iterator.hasNext()==false){
                    temp.add(setElement);
                    tets.put(i,new TreeSet<Integer>(temp));
                    i++;
                    temp.clear();
                }
                if((setElement - tmp) >1) {
                    tets.put(i,new TreeSet<Integer>(temp));
                    i++;
                    temp.clear();
                    temp.add(setElement);
                }
                tmp = setElement;
            }
        }catch (NoSuchElementException e){System.out.println("нет совпадений");}
        
        return tets;
    }
    
    protected  Integer getClosestNum(HashMap<Integer,TreeSet<Integer>> hashmap, Integer num){
        
        Integer resNum = 0;
        SortedMap<Integer,Integer> hash=new TreeMap<>();
        int minIndex;
        for (Map.Entry<Integer,TreeSet<Integer>> entry: hashmap.entrySet()) {
            if( entry.getValue().contains(num)){resNum=num; return  resNum;}
            else{
                hash.put(abs(num-entry.getValue().first()),entry.getValue().first());
                hash.put(abs(num-entry.getValue().last()),entry.getValue().last());
            }
        }
       return  resNum=hash.get(hash.firstKey());
    }
    
}
