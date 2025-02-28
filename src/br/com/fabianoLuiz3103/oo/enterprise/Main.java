package br.com.fabianoLuiz3103.oo.enterprise;

public class Main {

    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    private static void printEmployee(Employee employee){

        System.out.printf("======= %s =======\n", employee.getClass().getSimpleName()); //pega o nome da classe sem o pacote
        if(employee instanceof Manager manager){
            manager.setCode("3456");
            manager.setName("João");
            manager.setLogin("joao");
            manager.setSenha("123456");
            manager.setSalary(5000);
            manager.setComission(2500);

            System.out.println(manager.getSalary());
            System.out.println(manager.getComission());
            System.out.println(manager.getCode());
            System.out.println(manager.getName());
            System.out.println(manager.getLogin());
            System.out.println(manager.getSenha());
        }
        if(employee instanceof Salesman salesman){
            salesman.setCode("9644");
            salesman.setName("Bruno");
            salesman.setPercentForSale(((Salesman) employee).getPercentForSale());
            salesman.setSalary(1500);
            salesman.setSoldAmount(1000);
            salesman.setPercentForSale(10);

            System.out.println(salesman.getSalary());
            System.out.println(salesman.getSoldAmount());
            System.out.println(salesman.getPercentForSale());
            System.out.println(salesman.getCode());
            System.out.println(salesman.getName());
            System.out.println(salesman.getPercentForSale());
        }
        System.out.println("==============");
        System.out.println(employee.getFullSalary());
        System.out.println(employee.getFullSalary(3560));
    }
}
