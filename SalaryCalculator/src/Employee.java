
public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) {
             double taxcalc = salary * (0.3);
            return taxcalc;
        }
        return 0;
    }

    public double bonus() {
        if (workHours > 40) {
            double calc = workHours - 40;
            double result= calc*30;
           return result;
        }
        return 0;
    }
    public double riseSalary() {
        double result = 0;
        result = 2021 - hireYear;
        if (result < 10) {
            double raise = salary * 0.5;
            return raise;
        }
        if (result > 9 && result < 20) {
            double raise = salary * 0.10;
            return raise;
        }
        if(result>19) {
            double raise = salary * 0.15;
            return raise;
        }
        return 0;
    }
    public String toString(){
        System.out.println("==================");
        return "Adı: "+ this.name+"\nMaaşı: "+salary+"\nÇalışma saati: "+this.workHours+"\nBaşlangıç yılı: "+this.hireYear+
                "\nVergi: "+ tax()+"\nBonus: "+bonus()+"\nMaaş Artışı: "+ riseSalary()+
                "\nVergi ve Bonuslarla ile birlikte maaş: "+(salary-tax()+bonus())+
                "\nToplam Maaş: "+(salary-tax()+bonus()+riseSalary());
    }

}
