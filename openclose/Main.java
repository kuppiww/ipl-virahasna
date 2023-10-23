package openclose;

public class Main {
    public static void main(String[] args){
        StandardCinema standardCinema = new StandardCinema(100);
        Double adminFee = standardCinema.calculateAdminFee();
        System.out.println(adminFee);
    }
}