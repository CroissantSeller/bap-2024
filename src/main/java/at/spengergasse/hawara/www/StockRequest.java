package at.spengergasse.hawara.www;

import at.spengergasse.hawara.domain.Company;

import java.time.LocalDate;

public record StockRequest(String stockName, Float value, LocalDate sellDate, LocalDate buyDate, Company company)
{
    public static StockRequest base(){ return new StockRequest("", (float) 0, LocalDate.now(), LocalDate.now(), null); }
}
