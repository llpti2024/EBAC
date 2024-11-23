package br.com.lucas.padroesdeprojetoum.factory;

public class CarFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Volkswagem(100,"full","blue", "Volkswagen");
            case "B":
                return new Toyota(900, "full", "blue", "Toyota" );
            default:
                System.out.println("THe requested car was unfortunately not available.");

            return null;
        }
    }
}
