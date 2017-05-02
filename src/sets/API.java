package sets;

import java.util.ArrayList;

public class API extends Sets {

    SubSetsContainer defaultSets =new SubSetsContainer();
    private double number;
    
    public API(){}
    
    public API(SubSetsContainer defaultSets, double number) {
        this.defaultSets.addAll(defaultSets);
        this.number = number;
    }

    public SubSetsContainer getDefaultSets() {
        return defaultSets;
    }

    public double getNumber() {
        return number;
    }

    public void setDefaultSets(SubSetsContainer defaultSets) {
        this.defaultSets.addAll(defaultSets);
    }

      public void setDefaultSetsFromString(ArrayList<String> str) {
          this.defaultSets=toIntervalSets(str);
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public SubSetsContainer getSubSets(){
        return findFinalSet(defaultSets);
    }

    public Double getNearestnumber (){
        Double result = getClosestNum(getSubSets(),number);
        return result;
    }

}
