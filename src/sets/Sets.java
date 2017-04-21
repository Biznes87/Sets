package sets;


import java.util.*;
import static java.lang.Math.abs;

public  class Sets {

    protected  double getClosestNum(SubSetsContainer inters, double num){ //получаем ближайшее число к указанному

        double resNum=0.0;
        SortedMap<Double,Double> hash=new TreeMap<>();
        try {
            for (int i=0; i<inters.getSize();i++){
                for(int j =0; j<inters.getSubSet(i).getSize(); j++) {

                    if (inters.getSubSet(i).contains(num)) { //если какой либо интервал подмножеств контейнера содержит число,
                                                            //то возвращаем это число
                        resNum = num;
                        return resNum;
                    } else {
                        //иначе,добавляем модуль разности между числом и крайней точкой интервалов в качестве ключа TreeMap, а
                        //значением становится крайняя точка
                        hash.put(abs(num - inters.getSubSet(i).getInterval(j).getLeft()), inters.getSubSet(i).getInterval(j).getLeft());
                        hash.put(abs(num - inters.getSubSet(i).getInterval(j).getRight()), inters.getSubSet(i).getInterval(j).getRight());
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

    private Interval intervalParse(String str ){ //получаем Интревал из Строки
        
        Interval  resArr= new Interval();
        
        String[] parts = str.split("\\s|\\[|\\,|\\]");

            if(parts[1].equals("-Inf")){
                resArr.replace(Double.NEGATIVE_INFINITY,Double.valueOf(parts[2]));
            }
            else if(parts[2].equals("+Inf")){
                resArr.replace(Double.valueOf(parts[1]),Double.POSITIVE_INFINITY);
            }
            else{
                resArr.replace(Double.valueOf(parts[1]),Double.valueOf(parts[2]));
            }

        return resArr;
    }

    protected SubSetsContainer toIntervalSets(ArrayList<String> str){ //преобразуем список из строк в Контейнер подмножеств

        SubSetsContainer res = new SubSetsContainer();
        SubSet tmpres = new SubSet();

        for(int i = 0; i < str.size(); i++){
            if(str.get(i).contains("u")){//если есть объединение
                String[] subSets = str.get(i).split("(\\u0075)");
                for (int j = 0; j < subSets.length; j++) { //перебирем строки, превращая каждую в Интревал
                    tmpres.add(intervalParse(subSets[j]));
                }
                res.addSubSet(new SubSet(tmpres));
            }else {
                tmpres.add(intervalParse(str.get(i)));
                res.addSubSet(new SubSet(tmpres));
            }
            tmpres.clear();
        }
        return res;
    }

    private boolean uniqCheck (SubSetsContainer is, SubSet sub) { //проверка уникальности, добавляемого в Контейнер подмножества
        boolean flag = true;

        for (int i = 0; i < is.getSize(); i++) {
            if (is.getSubSet(i).equal(sub)){flag=false;}
        }
        return flag;
    }


    protected SubSetsContainer findFinalSet(SubSetsContainer arr){ //находим результирующее подмножество и помещаем в Контейнер

        SubSetsContainer finalResult = new SubSetsContainer();
        SubSetsContainer tmpResult = new SubSetsContainer();
        SubSetsContainer tmp = new SubSetsContainer();
        SubSetsContainer tmpSub =  new SubSetsContainer();
        int k=0;

        try{//
            tmpResult.addSubSet(arr.getSubSet(0)); //добавляем 1 подмножество в Контенер временный
            for (int i = 1; i < arr.getSize(); i++) {
                finalResult.clear();
                tmp.clear();
                tmp.addSubSet(intersection(tmpResult.getSubSet(0),arr.getSubSet(i))); //добавлем во второй временный контейнер результат пересечения 0го
                //подмножества 1го временного контейнера и iго подмножества входного Контейнера
                tmpResult.clear();
                if(!tmp.isEmpty()){ //если 2й временный Контейнер не пуст(так как если он пуст то пересечений нет)
                   tmpResult.addSubSet(tmp.getSubSet(0));
                    Iterator<SubSet> iter = tmpResult.iterator();
                    while(iter.hasNext()){
                        tmpSub.clear();
                            tmpSub.addSubSet(iter.next());
                            if(uniqCheck(finalResult, tmpSub.getSubSet(0))){//если подмножество уникально, то добавляем в результирующий Контейнер
                            finalResult.addSubSet(tmpSub.getSubSet(0));
                            }
                    }

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
        if(arr.getSize()==1){
            finalResult.addAll(tmpResult);
        }
        return finalResult;
    }
}
