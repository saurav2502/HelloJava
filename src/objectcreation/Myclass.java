package objectcreation;

public abstract class Myclass {
    public abstract int findall(int i);
    public void display(){
        System.out.println("display is called!");
    }
    public String print(String string){
        return string;
    }
}

class SubClass extends Myclass{

    @Override
    public int findall(int i) {
        return i;
    }
}

class Runner{
    public static void main(String[] args) {
        SubClass sb = new SubClass();
        System.out.println(sb.findall(10));
        sb.display();
        sb.print("hello");
    }
}
