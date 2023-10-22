package openclose;

public class CinemaCalculations {
    public Double calculateAdminFee(Cinema cinema){
        if(inema instanceof StandardCinema){
            return ((StandardCinema) cinema).price*10/100;
        }else if(inema instanceof DeluxeCinema){
            return ((DeluxeCinema) cinema).price*12/100;
        }else if(inema instanceof PremiumCinema){
            return ((PremiumCinema) cinema).price*20/100;
        }else{
            return 0.0;
        }
    }
}