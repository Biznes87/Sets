package sets;

import java.util.*;

import static java.lang.Math.abs;

public class SubSetsContainer{//Класс контейнер для подмножеств


    private ArrayList<SubSet> arr = new ArrayList<>();
  //  private int size=0; //количесво подмножеств


    public SubSetsContainer(){}

    public SubSetsContainer(Iterable<SubSet> subSets) {
        for (SubSet sub: subSets) {
            arr.add(sub);
        }
    }

    public SubSetsContainer(ArrayList<String> str) {
       toIntervalSets(str);
    }


    public int getSize() {
        return arr.size();
    }

    public SubSet getSubSet(int index){
        return arr.get(index);
    }

    public void addSubSet(SubSet sub){//добавляет подмножество

        arr.add(sub);

    }
    private Interval intervalParse(String str ){ //получаем Интревал из Строки

        Interval  resArr= new Interval();

        String[] parts = str.split("\\s|\\[|\\,|\\]");
        if((parts[1].equals("-Inf"))&&(parts[2].equals("+Inf"))){
            resArr = new Interval(Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
            return resArr;
        }

        if(parts[1].equals("-Inf")){
            resArr = new Interval(Double.NEGATIVE_INFINITY,Double.valueOf(parts[2]));
        }
        else if(parts[2].equals("+Inf")){
            resArr = new Interval(Double.valueOf(parts[1]),Double.POSITIVE_INFINITY);
        }
        else{
            resArr = new Interval(Double.valueOf(parts[1]),Double.valueOf(parts[2]));
        }

        return resArr;
    }

    protected void toIntervalSets(ArrayList<String> str){ //преобразуем список из строк в Контейнер подмножеств

       // SubSetsContainer res = new SubSetsContainer();
        SubSet tmpres = new SubSet();

        for(int i = 0; i < str.size(); i++){
            if(str.get(i).contains("u")){//если есть объединение
                String[] subSets = str.get(i).split("(\\u0075)");
                for (int j = 0; j < subSets.length; j++) { //перебирем строки, превращая каждую в Интревал
                    tmpres.add(intervalParse(subSets[j]));
                }
                arr.add(new SubSet(tmpres));
            }else {
                tmpres.add(intervalParse(str.get(i)));
                arr.add(new SubSet(tmpres));
            }
            tmpres.clear();
        }
    }
   // public void clear(){arr.clear();} //очистка контейнера

  /*  public void addAll(SubSetsContainer sub){//добавить все подмножество из одного контейнера в другой


        arr.clear();
        for (Object s: sub) {
            arr.add((SubSet) s);
        }
    }
*/
    public boolean isEmpty(){ //проверка на пустоту контейнера

        boolean key=false;
        if(arr.isEmpty()) key=true;
        return key;
    }

    public String  print(){ //выводит в консоль содержимое контейнера
        String str = "";
        for(SubSet sub: arr){
           str=sub.print();
        }
        return str;
    }


    public SubSet intersection(SubSet set1, SubSet set2 ){      //пересечение подмножеств

        SubSet resSet = new SubSet();

        for (int i = 0; i < set1.getSize(); i++) {
            for (int j = 0; j < set2.getSize(); j++) {
                double a = set1.getInterval(i).getLeft();   double b = set1.getInterval(i).getRight();
                double x = set2.getInterval(j).getLeft(); ; double y = set2.getInterval(j).getRight();

                if(!((a>y)||(b<x))) {  //условие пересекаемости, если не проходит,значит нет пересечения

                    if ((a >= x) && (b > y)) {
                        resSet.add(new Interval(a,y)); //добавляем в результат новый интервал
                    }
                    if ((a < x) && (b <= y)) {
                        resSet.add(new Interval(x,b));
                    }
                    if ((a >= x) && (b <= y)) {
                        resSet.add(new Interval(a,b));
                    }
                    if ((a < x) && (b > y)) {
                        resSet.add(new Interval(x,y));
                    }
                }
            }
        }
        return resSet;
    }

    private boolean uniqCheck (SubSetsContainer is, SubSet sub) { //проверка уникальности, добавляемого в Контейнер подмножества
        boolean flag = true;

        for (int i = 0; i < is.getSize(); i++) {
            if (is.getSubSet(i).equal(sub)){flag=false;}
        }
        return flag;
    }

    public HashSet<SubSet> findFinalSet(){ //находим результирующее подмножество и помещаем в Контейнер


        HashSet<SubSet> finalResult = new   HashSet<>();
        HashSet<SubSet> tmpResult = new   HashSet<>();
        HashSet<SubSet> tmp = new   HashSet<>();

        try{
            tmpResult.add(arr.get(0)); //добавляем 1 подмножество в Контенер временный
            if(arr.size()==1){
                finalResult.addAll(tmpResult);
                return finalResult;
            }
            for (int i = 1; i < arr.size(); i++) {
                finalResult.clear();
                tmp.clear();
                tmp.add(intersection(tmpResult.iterator().next(),arr.get(i))); //добавлем во второй временный контейнер результат пересечения 0го
                //подмножества 1го временного контейнера и iго подмножества входного Контейнера
                tmpResult.clear();
                if(!tmp.isEmpty()){ //если 2й временный Контейнер не пуст(так как если он пуст то пересечений нет)
                    tmpResult.addAll(tmp);
                            finalResult.addAll(tmpResult);
                }else {
                    finalResult.clear();
                    return finalResult;
                }
                tmpResult.clear();
                tmpResult.addAll(finalResult);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return finalResult;
    }

    public SubSetsContainer getSubSets(){
        SubSetsContainer SC = new SubSetsContainer( findFinalSet());
      return SC;
    }


    protected  double getClosestNum( double num){ //получаем ближайшее число к указанному

        double resNum=0.0;
        SortedMap<Double,Double> hash=new TreeMap<>();
        try {
            for (int i=0; i<this.getSize();i++){
                for(int j =0; j<this.getSubSet(i).getSize(); j++) {

                    if (this.getSubSet(i).contains(num)) { //если какой либо интервал подмножеств контейнера содержит число,
                        //то возвращаем это число
                        resNum = num;
                        return resNum;
                    } else {
                        //иначе,добавляем модуль разности между числом и крайней точкой интервалов в качестве ключа TreeMap, а
                        //значением становится крайняя точка
                        hash.put(abs(num - this.getSubSet(i).getInterval(j).getLeft()), this.getSubSet(i).getInterval(j).getLeft());
                        hash.put(abs(num - this.getSubSet(i).getInterval(j).getRight()), this.getSubSet(i).getInterval(j).getRight());
                    }
                }
            }
            return  resNum=hash.get(hash.firstKey());//так как TreeMap сортирована, то берем первое значение
        }catch (NoSuchElementException e){
            System.out.println("нет пересечений");
            resNum=num;
            return resNum;
        }

    }
}
