package sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SubSetsContainer implements  Iterable{//Класс контейнер для подмножеств


    private ArrayList<SubSet> arr = new ArrayList<>();
  //  private int size=0; //количесво подмножеств


    public SubSetsContainer(){}

    public SubSetsContainer(Iterable<SubSet> subSets) {
        for (SubSet sub: subSets) {
            arr.add(sub);
        }
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
    public void clear(){arr.clear();} //очистка контейнера

    public void addAll(SubSetsContainer sub){//добавить все подмножество из одного контейнера в другой


        arr.clear();
        for (Object s: sub) {
            arr.add((SubSet) s);
        }
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
                return count< SubSetsContainer.this.arr.size(); //есть следующий, если счетчик меньше размера контейнера
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
