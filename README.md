# Sets
Приложение для нахождения пересечения до 10 подмножеств и/или любого заданного числа, принадлежащего
пересечению подмножеств, максимально близкое к x (или само число x, если оно принадлежит пересечению подмножеств).

В графической части, для активации окна ввода подмножества нужно поставить соотсветствующую галочку.
Подмножества воодятся либо одним интервалом [x1;x2], либо объединением 2-x интервалов [x1;x2]u[x3;x4].
Для задания интервала от минус бесконечности используется - "-Inf", для плюс бесконечности - "+Inf"

 API реализовано в одноименном классе.
 В API существуют функции для задания числа x,массива интервалов, получения подмножеств, получения числа максимально
 близкого к х.
 Задать массив подмножеств можно либо в стороковом виде ArrayList<String>, либо в виде HashMap<Integer, double[]> [].
 
 Пример использования:
  String str1 = "[-Inf,4]u[6,+Inf]";
        String str2 = "[-Inf,1]u[2,+Inf]";
        String str3 = "[-Inf,3.5]u[5,+Inf]";

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add(str3);arr1.add(str1);arr1.add(str2);
        a.setDefaultSetsFromString(arr1);
        a.getSubSets().print();
        System.out.println(a.getClosestNum(a.getSubSets(),3));

В результате получим  
[-Infinity,1.0]u[2.0,3.5]u[6.0,Infinity]
3.0

Или так:
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

В результате получим  
[-Infinity,0.0]u[9.0,Infinity]
0.0
 
