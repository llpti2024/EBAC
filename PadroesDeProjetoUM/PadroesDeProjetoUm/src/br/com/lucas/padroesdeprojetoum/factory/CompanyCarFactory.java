package br.com.lucas.padroesdeprojetoum.factory;

public class CompanyCarFactory extends Factory {


    @Override
    Car retrieveCar(String requestedGrade) {
        switch(requestedGrade) {
            case "A":
                return new Tesla(1000, "full", "blue","Tesla");
            case "B":
                return new Audi(800, "full", "red", "Audi");
            default:
                System.out.println("The requested car was unfortunately not available.");
            return null;
        }
    }
}
