package lps;

import java.util.Date;

abstract class FoodProduct extends Product{
    abstract Date getExpiredDate();
}