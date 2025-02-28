package br.com.fabianoLuiz3103.oo.enterprise;

public non-sealed class Salesman extends Employee {

    private double percentForSale;

    private double soldAmount;

    @Override
    public String getCode() {
        return "SL"+super.getCode();
    }

    @Override
    public double getFullSalary() {
        return super.getSalary() + ((this.percentForSale*this.soldAmount)/100);
    }

    public double getPercentForSale() {
        return percentForSale;
    }

    public void setPercentForSale(double percentForSale) {
        this.percentForSale = percentForSale;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
}
