
public class Main {
    public static void main(String[] args) {
        Employee e1= new Employee("Emre",10000,45,2000);
        Employee e2= new Employee("Adil",2000,50,2020);
        Employee e3= new Employee("Kemal",5000,40,2007);
        String printoscreen1= e1.toString();
        System.out.println(printoscreen1);
        String printoscreen2= e2.toString();
        System.out.println(printoscreen2);
        String printoscreen3= e3.toString();
        System.out.println(printoscreen3);
    }
}