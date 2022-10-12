package lab_rob1;

public class Seller {
    String name;
    String surName;
    int experience;

    public Seller(String name, String surName, int experience) {
        this.name = name;
        this.surName = surName;
        this.experience = experience;
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
    void experienced(int experience, int salary){
        if(experience>10){
            System.out.println("Зарплату підняли в 2x. нова зарплата продавця: "+salary*2);
        }else {
            System.out.println("Зарплата не змінилася "+ salary);
        }


    }

}
