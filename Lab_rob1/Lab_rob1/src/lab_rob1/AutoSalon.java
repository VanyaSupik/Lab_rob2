package lab_rob1;

public class AutoSalon {
    double length;
    double width;
    int numberOfCars;

    public AutoSalon(double length, double width, int numberOfCars) {
        this.length = length;
        this.width = width;
        this.numberOfCars = numberOfCars;
    }
    public AutoSalon(double length, double width){//Перевизначив конструктори
        this.length = length;
        this.width = width;
    }
    public AutoSalon(){
    }
    public AutoSalon(int numberOfCars){
        this.numberOfCars = numberOfCars;
    }

    void cars(){
        System.out.println("Кількість автомобілів у салоні: " + numberOfCars);
    }
    double square(){
        double s = length*width;
        return s;//Площа автосалону
    }
    int square(int length, int width){
        return length*width;//Перевизначив типізований метод

    }
    AutoSalon salon(double m,int n){
        AutoSalon autoSalon = new AutoSalon(length-m,width-m,numberOfCars-n);//Метод посилкового типу
        return autoSalon;
    }
    void about(int years,String brands){
        if(years<2019){
            System.out.println("Марка старого автомобіля: "+brands);
        }else {
            System.out.println("Немає старого автомобіля");
        }
    }
}
