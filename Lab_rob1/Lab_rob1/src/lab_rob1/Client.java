package lab_rob1;

public class Client {
    String brand;//Бренд
    String model;//Модель
    int budget;//Бюджет
    boolean car;
    double volume;
    String fuel;

    public Client(String brand, String model, int budget,boolean car,double volume,String fuel) {
        this.brand = brand;
        this.model = model;
        this.budget = budget;
        this.car = car;
        this.volume = volume;
        this.fuel = fuel;
    }
    int money(){
        return budget;
    }
    void favoriteCar(){
        System.out.println(brand + " " + model);//Улюблений автомобіль
    }
    double money(double budget){
        return budget;//Сума клієнта
    }
    void carInSalon(Client c){
        favoriteCar();//викликав будь який метод з класу
        if(c.car == true){
            System.out.println("Можна оформити купівлю");
        }else {
            System.out.println("Немає в наявності");
        }

    }
    void about(double volumeDemo,String fuelDemo){
        if(volumeDemo==volume & fuelDemo.equals(fuel)){
            System.out.println("Бажаний автомобіль в наявності");
        }else {
            System.out.println("Немає такого автомобіля");//Метод із статичним імям
        }


    }
}
