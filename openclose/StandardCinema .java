package openclose;

public class StandardCinema extends Cinema {
    public StandardCinema(double price){
        this.price = price;
    }
    @Override
    Double calculateAdminFee(){
        return this.price * 10/100;
    }
}