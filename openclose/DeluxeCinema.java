package openclose;

public class DeluxeCinema {
    public DeluxeCinema(double price){
        this.price = price;
    }
    @Override
    Double calculateAdminFee(){
        return this.price * 20/100;
    }
}