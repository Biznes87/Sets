package sets;

public class Interval  {  //Класс для создания интервала.

    private double left;
    private double right;

    public void setLeft(double left) {this.left = left;}

    public void setRight(double right) {this.right = right;}

    public double getLeft() {return left;}

    public double getRight() {return right;}

    public Interval(){}

    public Interval(double left, double right) {
        if(validCheck(left,right)) {
            this.left = left;
            this.right = right;
        }
    }

    public void replace(double left, double right){ //фуенкция замены значений интервала
        if(validCheck(left,right)) {
            this.left = left;
            this.right = right;
        }
    }

    private boolean validCheck(double l, double r){ //функция проверки "правильности" интервала. Левое значение не должно быть больше правого
        boolean flag=true;
        if(l>r){
            flag=false;
            throw new IllegalArgumentException("Левое значение больше правого");
        }
        return flag;
    }

    public void print(){
        System.out.println("["+left+";"+right+"]");
    } //вывод интервала на консоль

}

