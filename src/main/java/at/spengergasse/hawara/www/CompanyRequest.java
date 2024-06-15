package at.spengergasse.hawara.www;

import java.time.LocalDate;

public record CompanyRequest(String name, Float amountOfShares, Float valuePerShare, LocalDate lastDividendPayment) {

    public static CompanyRequest base(){
        return new CompanyRequest("", (float) 0, (float) 0, LocalDate.now());
    }
}