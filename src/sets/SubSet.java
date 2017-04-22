package sets;

import java.util.ArrayList;

public class SubSet { //Класс представляет подмножество. Может состоять как из 1 так и нескольких интервалов.
                        //Можно создать объект этого класса с 1 или 2 интервалами.Чтобы добавить интервалы нужно воспользоваться матодом add

    //private int size=0;  //размер подмножества, то есть сколько в нем интервалов
    private ArrayList<Interval> subSet=new ArrayList<>();


    public int getSize() {
        return subSet.size();
    }

    public SubSet() {}

    public SubSet (SubSet sub){
        sub.getSize();
        if ( sub.getSize() == 1) {
            subSet.add(sub.getInterval(0));
        }
        if( sub.getSize()==2){
            subSet.add(sub.getInterval(0));
            subSet.add(sub.getInterval(1));
        }
    }

    public SubSet(Interval interval){
        subSet.add(interval);
    }

    public SubSet(Interval interval,Interval interval1){

        if(interIntersection(interval,interval1)==null) {
            subSet.add(interval);
            subSet.add(interval1);

        }else {subSet.add(interIntersection(interval,interval1));}

    }

    public void add(Interval interval){
        Interval res = new Interval();
        //добавить интервал в подмножество
        if(subSet.size()>=1){ //для подмножеств в которых 2 и более интервалов
            for (Interval inter:subSet) {
                res=interIntersection(interval,inter);
                if(res!=null){
                           subSet.remove(inter);                                                                                                         //если существуют общие точки
                    subSet.add(new Interval(res.getLeft(),res.getRight()));//заменить интервалы, интервалов из общих точек,
                                                                                                                            // то есть их персечением
                }
            }
            subSet.add(interval);
        }else {subSet.add(interval);}


    }


    private Interval interIntersection(Interval i1, Interval i2){ //Проверка на вхождение 1го из интервалов подмножество в другой
        //Если пересечение существует то возвращаем это пересечение
        boolean flag=false;
        Interval in = new Interval();
        double a = i1.getLeft();   double b = i1.getRight();
        double x = i2.getLeft(); ; double y = i2.getRight();

        if(!((a>y)||(b<x))) {  //условие пересекаемости

            if ((a >= x) && (b > y)) {
                in = new Interval(a,y);
            }
            if ((a < x) && (b <= y)) {
                in = new Interval(x,b);
            }
            if ((a >= x) && (b <= y)) {
                in = new Interval(a,b);
            }
            if ((a < x) && (b > y)) {
                in = new Interval(x,y);
            }
        }else{in = null;}
        return in;
    }


   protected boolean contains(double num){ //содержит ли интервал указанное число

        boolean isContain = false;
        for (Interval inter:subSet) {
            if((num>=inter.getLeft())&&(num<=inter.getRight())) { isContain = true;}
        }
        return isContain;
    }

    public Interval getInterval(int index){

        return subSet.get(index);
    }

    public String print(){ //выводит подмножество на консоль и возвращает выводимую  строку

       String res = "";
        if(getSize()>=2){
           int count=0;
            for (int i=0;i<subSet.size();i++) {
                if (i ==subSet.size()-1) {
                    if(subSet.get(i).getLeft()==subSet.get(i).getRight()) {
                        System.out.println("[" + subSet.get(i).getRight() + "]");
                        res=res +"[" +  subSet.get(i).getRight() + "]";
                    }else {
                        System.out.println("[" + subSet.get(i).getLeft() + "," + subSet.get(i).getRight() + "]");
                        res = res + "[" + subSet.get(i).getLeft() + "," + subSet.get(i).getRight() + "]";
                    }

                }else{
                    if(subSet.get(i).getLeft()==subSet.get(i).getRight()) {
                        System.out.print("[" + subSet.get(i).getRight() + "]"+ "u");
                        res=res +"[" +  subSet.get(i).getRight() + "]"+ "u";
                    }else {
                        System.out.print("[" + subSet.get(i).getLeft() + "," + subSet.get(i).getRight() + "]" + "u");
                        res = res + "[" + subSet.get(i).getLeft() + "," + subSet.get(i).getRight() + "]" + "u";
                    }
                }
                count++;
            }
        }else {
            for (Interval inter : subSet) {
                inter.print();
                res=res +"[" + inter.getLeft() + "," + inter.getRight() + "]";
            }
        }
        return res;
    }

    public boolean isEmpty(){ //проверка на пустоту подмножества

        boolean key=false;
        if(subSet.isEmpty()) key=true;
        return key;
    }

   public  boolean equal (SubSet sub1){

       boolean key=false;
       if((sub1.getSize()==this.getSize())&&(
               sub1.getInterval(0).getLeft()==this.getInterval(0).getLeft())&&(
               sub1.getInterval(0).getRight()==this.getInterval(0).getRight())){
           key=true;
       }
       return key;
   }

    public void clear(){ //очистить подмножество.
        subSet.clear();
    }
}
