package br.com.lucas.padroesdeprojetoum.factory;

public class Demo {
    public static void main(String[] args) {
        Customer customerOne = new Customer("B",false);
        Factory factory = getCarFactory(customerOne);
        Car carOne = factory.create(customerOne.getGradeRequest());
        carOne.startEngine();
    }

    private static Factory getCarFactory(Customer customer){
        if(customer.hasCompanyContract()){
            return new CompanyCarFactory();
        }else{
            return new CarFactory();
        }
    }

}