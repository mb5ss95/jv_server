

public class Order {

    String name;
    String name2;
    int num;
    Order o;

    public Order(Object o){

        this.o = o;
    }

    public Order(String name, int num, String name2){

        this.name = name;
        this.num = num;
        this.name2 = name2;
    }

    public String get_name(){
        return this.name;
    }
}
