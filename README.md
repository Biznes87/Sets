# Sets
Приложение для нахождения пересечения до 10 подмножеств и/или любого заданного числа, принадлежащего
пересечению подмножеств, максимально близкое к x (или само число x, если оно принадлежит пересечению подмножеств).

В графической части, для активации окна ввода подмножества нужно поставить соотсветствующую галочку.
Подмножества воодятся либо одним интервалом [x1,x2], либо объединением 2-x интервалов [x1,x2]u[x3,x4].
Для задания интервала от минус бесконечности используется - "-Inf", для плюс бесконечности - "+Inf".
Например[-Inf,5.6]u[7.8,+Inf]


Задать массив подмножеств можно либо в стороковом виде используя ArrayList<String>: 

        String str1 = "[-100,500]u[1000,3000]"; 
        String str2 = "[-Inf,1000]u[3000,5000]";
        String str3 = "[-Inf,+Inf]";

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add(str3); arr1.add(str1); arr1.add(str2);

        SubSetsContainer inter = new SubSetsContainer(arr1);

        System.out.println(inter.getSubSets().print());
        System.out.println(inter.getSubSets().getClosestNum(1900.0));
        
        Результат:
        
        [-100.0,500.0]u[1000.0]u[3000.0]
        1000.0
Или так:

        SubSet sub1= new SubSet(new Interval(Double.NEGATIVE_INFINITY,4),new Interval(5, Double.POSITIVE_INFINITY));
        SubSet sub2= new SubSet(new Interval(Double.NEGATIVE_INFINITY,0),new Interval(9, Double.POSITIVE_INFINITY));
       
        HashSet<SubSet> hash = new HashSet<>(); hash.add(sub1);hash.add(sub2);
        
        SubSetsContainer inter = new SubSetsContainer(hash);
        System.out.println(inter.getSubSets().print());
        System.out.println(inter.getSubSets().getClosestNum(1900.0));

        В результате получим  
        [-Infinity,0.0]u[9.0,Infinity]
        1900.0
 
