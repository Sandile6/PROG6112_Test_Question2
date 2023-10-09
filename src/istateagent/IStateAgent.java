
package istateagent;

import java.util.Scanner;

interface iEstateAgent {
    String getAgentName();
    double getPropertyPrice();
    double getAgentCommission();
}


abstract class EstateAgent implements iEstateAgent {
    private String agentName;
    private double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    public String getAgentName() {
        return agentName;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public double getAgentCommission() {
        return 0.20 * propertyPrice; 
    }
}

class EstateAgentSales extends EstateAgent {
    public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice);
    }

    public void printPropertyReport() {
        System.out.println("\nEstate Agent Report");
        System.out.println("*********************");
        System.out.println("Estate Agent Name: " + getAgentName());
        System.out.println("Property Price: R" + getPropertyPrice());
        System.out.println("Agent Commission: R" + getAgentCommission());
    }
}


public class IStateAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current estate agent name: ");
        String agentName = scanner.nextLine();

        System.out.print("Enter the property price: R");
        double propertyPrice = scanner.nextDouble();

        EstateAgentSales estateAgentSales = new EstateAgentSales(agentName, propertyPrice);
        estateAgentSales.printPropertyReport();

        scanner.close();
    }
}
