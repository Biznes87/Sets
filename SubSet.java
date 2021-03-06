package sets;

import java.util.ArrayList;

public class SubSet { //Класс представляет подмножество. Может состоять как из 1 так и нескольких интервалов.
                        //Можно создать объект этого класса с 1 или 2 интервалами.Чтобы добавить интервалы нужно воспользоваться матодом add

    private int size=0;  //размер подмножества, то есть сколько в нем интервалов
    private ArrayList<Interval> subSet=new ArrayList<>();


    public int getSize() {
        return size;
    }

    public SubSet() {}

    public SubSet (SubSet sub){
        this.size = sub.size;
        if (size == 1) {
            subSet.add(sub.getInterval(0));
        }
        if(size==2){
            subSet.add(sub.getInterval(0));
            subSet.add(sub.getInterval(1));
        }
    }

    public SubSet(Interval interval){

        subSet.add(interval);
        size = subSet.size();
    }

    public SubSet(Interval interval,Interval interval1){

        if(interIntersection(interval,interval1)==null) {
            subSet.add(interval);
            subSet.add(interval1);

        }else {subSet.add(interIntersection(interval,interval1));}
        size = subSet.size();
    }

    public void add(Interval interval){  //добавить интервал в подмножество
        if(subSet.size()>=1){ //для подмножеств в которых 2 и более интервалов
            for (Interval inter:subSet) {
                if(interIntersection(interval,inter)!=null){ //если существуют общие точки
                    inter.replace(interIntersection(interval,inter).getLeft(),interIntersection(interval,inter).getRight());//заменить интервалы, интервалов из общих точек,
                                                                                                                            // то есть их персечением
                };
            }
        }
        subSet.add(interval);
        size = subSet.size();
    }


    private Interval interIntersection(Interval i1, Interval i2){ //Проверка на вхождение 1го из интервалов подмножество в другой
        //Если пересечение существует то возвращаем это пересечение
        boolean flag=false;
        Interval in = new Interval();
        double a = i1.getLeft();   double b = i1.getRight();
        double x = i2.getLeft(); ; double y = i2.getRight();

        if(!((a>y)||(b<x))) {  //условие пересекаемости

            if ((a >= x) && (b > y)) {
                in.replace(a,y);
            }
            if ((a < x) && (b <= y)) {
                in.replace(x,b);
            }
            if ((a >= x) && (b <= y)) {
                in.replace(a,b);
            }
            if ((a < x) && (b > y)) {
                in.replace(x,y);
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
        if(size>=2){
           int count=0;
            for (int i=0;i<subSet.size();i++) {
                if (i ==subSet.size()-1) {
                    System.out.println("[" + subSet.get(i).getLeft() + "," + subSet.get(i).getRight() + "]");
                    res=res +"[" + subSet.get(i).getLeft() + "," + subSet.get(i).getRight() + "]";

                }else{
                    System.out.print("[" + subSet.get(i).getLeft() + "," + subSet.get(i).getRight() + "]" + "u");
                    res=res +"[" + subSet.get(i).getLeft() + "," + subSet.get(i).getRight() + "]" + "u";
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
        size = subSet.size();
    }
}
