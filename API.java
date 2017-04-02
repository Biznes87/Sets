package sets;

import java.util.HashMap;
import java.util.TreeSet;


public class API {

    HashMap<Integer, TreeSet> defaultSets = new HashMap<>();
    private Sets sets = new Sets();
    private int number;
    
    public API(){}
    
    public API(HashMap<Integer, TreeSet> defaultSets, int number) {
        this.defaultSets = defaultSets;
        this.number = number;
    }

    public HashMap<Integer, TreeSet> getDefaultSets() {
        return defaultSets;
    }

    public int getNumber() {
        return number;
    }

    public void setDefaultSets(HashMap<Integer, TreeSet> defaultSets) {
        this.defaultSets.clear();  
        this.defaultSets.putAll(defaultSets);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public HashMap<Integer,TreeSet<Integer>>  getSubSets(){

        HashMap<Integer,TreeSet<Integer>> result = sets.findSubSets(sets.resultIntersection(defaultSets));
        return result;
    }

    public Integer getNearestnumber (){
        Integer result = sets.getClosestNum(getSubSets(),number);
        return result;
    }
}
