package br.com.fabianoLuiz3103.oo.enterprise;

public non-sealed class Manager extends Employee {

    private String login;

    private String senha;

    private double comission;

    @Override
    public String getCode() {
        return "MN"+super.getCode();
    }

    @Override
    public double getFullSalary() {
        return super.getSalary()+this.comission;
    }

    public double getFullSalary(double extra){
        return this.getFullSalary() + extra;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
}
