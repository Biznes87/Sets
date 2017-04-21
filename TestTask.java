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

    //    String str = "[-Inf,4]u[5,+Inf]";
      //  String str1 = "[2,10]";
        //ArrayList  qwer = new ArrayList();
        //qwer.add(str);qwer.add(str1);
        //Sets s = new Sets();
      //s.toIntervalSets(qwer).print();


    }

    public static void main(String[] args) {
      MyWindow m = new MyWindow();
        m.setVisible(true);
       // solution();
    }
}
