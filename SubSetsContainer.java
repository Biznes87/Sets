package sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SubSetsContainer implements  Iterable{//Класс контейнер для подмножеств


    private ArrayList<SubSet> arr = new ArrayList<>();
    private int size=0; //количесво подмножеств


    public SubSetsContainer(){}

    public SubSetsContainer(Iterable<SubSet> subSets) {
        for (SubSet sub: subSets) {
            arr.add(sub);
        }
        size = arr.size();
    }

    public int getSize() {
        return size;
    }

    public SubSet getSubSet(int index){
        return arr.get(index);
    }

    public void addSubSet(SubSet sub){//добавляет подмножество

        arr.add(sub);
        size = arr.size();
    }
    public void clear(){arr.clear();size=0;} //очистка контейнера

    public void addAll(SubSetsContainer sub){//добавить все подмножество из одного контейнера в другой

        size=0;
        arr.clear();
        for (Object s: sub) {
            arr.add((SubSet) s);
        }
        size = arr.size();
    }

    public boolean isEmpty(){ //проверка на пустоту контейнера

        boolean key=false;
        if(arr.isEmpty()) key=true;
        return key;
    }

    public void print(){ //выводит в консоль содержимое контейнера

        for(SubSet sub: arr){
            sub.print();
        }
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }
        private  class MyIterator implements Iterator { //реализуем итератор

            int count=0;
            SubSetsContainer current=new SubSetsContainer();

            @Override
            public boolean hasNext() {
                return count< SubSetsContainer.this.size; //есть следующий, если счетчик меньше размера контейнера
            }

            @Override
            public SubSet next() {
                if(!this.hasNext()){
                    throw new NoSuchElementException();
                }
                current.addSubSet(SubSetsContainer.this.getSubSet(count));//в качестве текущего элемента подставляем подмножество,
                                                                          // индекс которого равен счетчику
                count++;
                return current.getSubSet(count-1);
            }
        }
}
