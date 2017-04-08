package sets;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;


public class API {
   
    HashMap<Integer, double[]> [] defaultSets;
    private Sets sets = new Sets();
    private double number;
    
    public API(){}
    
    public API(HashMap<Integer, double[]> [] defaultSets, double number) {
        this.defaultSets = defaultSets;
        this.number = number;
    }

    public HashMap<Integer, double[]> [] getDefaultSets() {
        return defaultSets;
    }

    public double getNumber() {
        return number;
    }

    public void setDefaultSets(HashMap<Integer, double[]> [] defaultSets) {
        this.defaultSets=defaultSets;
    }
      public void setDefaultSetsFromString(ArrayList<String> str) {     
          this.defaultSets=sets.toHashMap(str);
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public HashMap<Integer, double[]>  getSubSets(){          
        return sets.findFinalSet(defaultSets);
    }

    public Double getNearestnumber (){
        Double result = sets.getClosestNum(getSubSets(),number);
        return result;
    }
    
    
}
