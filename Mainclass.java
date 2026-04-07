package Currency_converter;

import java.util.Scanner;

class Currency {
    private String currencyName;
    private double rateToUSD;

    public Currency(String currencyName, double rateToUSD) {
        this.currencyName = currencyName;
        this.rateToUSD = rateToUSD;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }
}

class Converter {

    public double convert(Currency fromCurrency, Currency toCurrency, double amount) {
        double amountInUSD = amount / fromCurrency.getRateToUSD();
        return amountInUSD * toCurrency.getRateToUSD();
    }
}

public class Mainclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Currency inr = new Currency("INR", 83.0);
        Currency usd = new Currency("USD", 1.0);
        Currency eur = new Currency("EUR", 0.92);
        Currency gbp = new Currency("GBP", 0.78);

        Converter converter = new Converter();

        System.out.println("=== Currency Converter ===");
        System.out.println("Available currencies: INR, USD, EUR, GBP");

        System.out.print("Enter source currency: ");
        String from = sc.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String to = sc.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Currency fromCurrency = null;
        Currency toCurrency = null;

        if (from.equals("INR")) {
            fromCurrency = inr;
        } else if (from.equals("USD")) {
            fromCurrency = usd;
        } else if (from.equals("EUR")) {
            fromCurrency = eur;
        } else if (from.equals("GBP")) {
            fromCurrency = gbp;
        }

        if (to.equals("INR")) {
            toCurrency = inr;
        } else if (to.equals("USD")) {
            toCurrency = usd;
        } else if (to.equals("EUR")) {
            toCurrency = eur;
        } else if (to.equals("GBP")) {
            toCurrency = gbp;
        }

        if (fromCurrency == null || toCurrency == null) {
            System.out.println("Invalid currency entered.");
        } else {
            double result = converter.convert(fromCurrency, toCurrency, amount);
            System.out.println("Converted Amount: " + result + " " + toCurrency.getCurrencyName());
        }

        sc.close();
    }
}
