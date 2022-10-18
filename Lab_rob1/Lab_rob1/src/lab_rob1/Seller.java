package lab_rob1;

public class Seller {
    String name;
    String surName;
    int experience;
    int salary;

    public Seller(String name, String surName, int experience, int salary) {
        this.name = name;
        this.surName = surName;
        this.experience = experience;
        this.salary = salary;
    }
    String props(){
        return name + " " + surName;
    }
    void experienced() {
        if(experience > 6) {
            System.out.println("Досвідчений продавець");
        } else {
            System.out.println("Не досвідчений");
        }
    }
    void experienced(int experience){
        if(experience>10){
            System.out.println("Зарплату підняли в 2x. нова зарплата продавця: "+salary*2);
        }else {
            System.out.println("Зарплата не змінилася "+ salary);
        }
    }
    void about(int premium,String...soldCars){
        if(soldCars.length == 3){
            System.out.println("Продавцю нарахована премія "+premium);
        }else {
            System.out.println("Без премії");//Метод із статичним імям
        }
    }
}
