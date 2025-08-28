package br.com.mariojp.solid.srp;

public class TaxCalculator {

    private final double taxa;

    public TaxCalculator() {
        String string = System.getProperty("tax.rate", "0.10");
        this.taxa = Double.parseDouble(string);
    }

    public double calculaTaxa(double subtotal) {
        return subtotal * taxa;
    }

}
