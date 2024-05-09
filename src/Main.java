package com.engeto.invoice;



import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String item = "Trekové boty Sedmimílovky";
        int quantity = 2;
        double weight = 0.45;
        BigDecimal pricePerPiece = BigDecimal.valueOf(1990);
        LocalDate dateOfIssue = LocalDate.of(2022,4,7);
        boolean isDiscounted = true;

        double totalWeight = quantity * weight;
        System.out.println("Celková hmotnost zásilky: "+ totalWeight + " kg");

        BigDecimal totalPrice =
                  pricePerPiece.multiply(BigDecimal.valueOf(quantity));
        totalPrice = totalPrice.add(BigDecimal.valueOf(45));//k celkové ceně přičteme cenu dopravy
        System.out.println("Celková cena zásilky: "+ totalPrice+ " Kč");
    }

}


/*POZNÁMKY:
název zboží (item),= String
počet kusů (quantity),= int
hmotnost jednoho kusu (weight),= double
a cenu jednoho kusu (price per piece),= BigDecimal
datum vystavení faktury (date),= LocalDate
jestli má zákazníky nárok na slevu (is discounted).= boolean*/