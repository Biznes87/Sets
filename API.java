package sets;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;


public class API extends Sets {
   
    HashMap<Integer, double[]> [] defaultSets;
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
          this.defaultSets=toHashMap(str);
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public HashMap<Integer, double[]>  getSubSets(){          
        return findFinalSet(defaultSets);
    }

    public Double getNearestnumber (){
        Double result = getClosestNum(getSubSets(),number);
        return result;
    }
    
    
}
