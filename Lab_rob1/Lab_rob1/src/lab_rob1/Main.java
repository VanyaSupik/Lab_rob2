package lab_rob1;

public class Main {
    public static void main(String[] args) {
        AutoSalon autoSalon = new AutoSalon(25.0,20.5, 17);//Створив обєкт класу і ініціалізував через конструктор
        AutoSalon autoSalon1 = new AutoSalon();
        AutoSalon autoSalon2 = new AutoSalon(23);
        AutoSalon autoSalon3 = new AutoSalon(23.1, 24.8);
        autoSalon.cars();
        System.out.println("Площа автосалону: " + autoSalon.square());//Викликав методи
        System.out.println(autoSalon.square(30,25));
        autoSalon.salon(4.0,3);//Метод посилкового типу
        autoSalon.about(2020,"Camaro","Ford","Reno");

        System.out.println();

        Client c = new Client("Volkswagen", "Golf7",25000,true,2.0,"Дизель");
        System.out.println("Бюджет клієнта: " + c.money());
        c.favoriteCar();
        System.out.println(c.money(30000));
        c.carInSalon(c);
        c.about(2.0,"Дизель");

        System.out.println();

        Seller s = new Seller("Іван","Cупик",10,15000);
        s.experienced();
        System.out.println("Імя та Прізвище продавця: " + s.props());
        s.experienced(11);
        s.about(10000,"Fiat","Mazda","Ford-Mustang");//Метод із статичним імям


    }

}
