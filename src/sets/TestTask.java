package sets;

import java.util.ArrayList;

public class TestTask {

    public static void solution(){

       Interval first=new Interval(Double.NEGATIVE_INFINITY,1);
       Interval sec=new Interval(3,6);

       Interval thi = new Interval(8, Double.POSITIVE_INFINITY);
        SubSet sub = new SubSet(first,sec); sub.add(thi);
        SubSet sub1= new SubSet(new Interval(Double.NEGATIVE_INFINITY,4),new Interval(5, Double.POSITIVE_INFINITY));
        SubSet sub2= new SubSet(new Interval(Double.NEGATIVE_INFINITY,0),new Interval(9, Double.POSITIVE_INFINITY));
        SubSetsContainer inter = new SubSetsContainer();
        inter.addSubSet(sub);inter.addSubSet(sub1);inter.addSubSet(sub2);

        API a= new API();
        a.setDefaultSets(inter);
        a.getSubSets().print();
        System.out.println(a.getClosestNum(a.getSubSets(),3));
/*
        String str1 = "[6,9]"; //[-Inf,10]u[6,+Inf] [-Inf,3.5]u[5,+Inf]  [-Inf,-1]u[2,+Inf]
        String str2 = "[3,4]";
        String str3 = "[-Inf,3.5]u[5,+Inf]";

        ArrayList<String> arr1 = new ArrayList<>();
       // arr1.add(str3);
        arr1.add(str1);arr1.add(str2);
        a.setDefaultSetsFromString(arr1);
        a.getSubSets().print();
        System.out.println(a.getClosestNum(a.getSubSets(),3));
*/
    }

    public static void main(String[] args) {
      MyWindow m = new MyWindow();
        m.setVisible(true);
        //solution();
    }
}
