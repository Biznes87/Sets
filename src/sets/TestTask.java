package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class TestTask {



    public static void solution(){

    //   Interval first=new Interval(Double.NEGATIVE_INFINITY,1);
   //    Interval sec=new Interval(3,6);

   //    Interval thi = new Interval(8, Double.POSITIVE_INFINITY);
  //      SubSet sub = new SubSet(first,sec); sub.add(thi);
   //     SubSet sub1= new SubSet(new Interval(Double.NEGATIVE_INFINITY,4),new Interval(5, Double.POSITIVE_INFINITY));
   //     SubSet sub2= new SubSet(new Interval(Double.NEGATIVE_INFINITY,0),new Interval(9, Double.POSITIVE_INFINITY));
   //     HashSet<SubSet> hash = new HashSet<>(); hash.add(sub);hash.add(sub1);hash.add(sub2);
  //      SubSetsContainer inter = new SubSetsContainer();
     //   inter.addSubSet(sub);inter.addSubSet(sub1);inter.addSubSet(sub2);



/*
        API a= new API();
        a.setDefaultSets(inter);
        a.getSubSets().print();
        System.out.println(a.getClosestNum(a.getSubSets(),3));
        */

        String str1 = "[-100,500]u[1000,3000]"; //[-Inf,10]u[6,+Inf] [-Inf,3.5]u[5,+Inf]  [-Inf,-1]u[2,+Inf]
        String str2 = "[-Inf,1000]u[3000,5000]";
        String str3 = "[-Inf,+Inf]";

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add(str3);
        arr1.add(str1);arr1.add(str2);


        SubSetsContainer inter = new SubSetsContainer(arr1);

        System.out.println(inter.getSubSets().print());
        System.out.println(inter.getSubSets().getClosestNum(1900.0));
    }

    public static void main(String[] args) {
      MyWindow m = new MyWindow();
        m.setVisible(true);
      // solution();
    }
}
