import gui.GUIFactory;
import gui.WindowsFactory;
import transport.Logistics;
import gui.MacOSFactory;
import transport.RoadLogistics;
import transport.SeaLogistics;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Delivery mode (ROAD or SEA): ");
        String mode = sc.nextLine().trim().toUpperCase();
        if (mode.isEmpty()){
            System.out.println("Delivery mode is not entered. Stopping the process.");
            return;
        }
        Logistics logistics;
        switch (mode){
            case "ROAD":
                logistics = new RoadLogistics();
                break;
            case "SEA":
                logistics = new SeaLogistics();
                break;
            default:
                System.out.println("Invalid delivery mode. Choose ROAD or SEA.");
                return;
        }

        System.out.print("UI platform (WINDOWS or MACOS): ");
        String platform = sc.nextLine().trim().toUpperCase();
        if (platform.isEmpty()){
            System.out.println("UI platform is not entered. Stopping the process.");
            return;
        }

        GUIFactory factory;
        switch (platform){
            case "WINDOWS":
                factory = new WindowsFactory();
                break;
            case "MACOS":
                factory = new MacOSFactory();
                break;
            default:
                System.out.println("Invalid UI platform. Choose WINDOWS or MACOS.");
                return;
        }

        DeliveryApplication app = new DeliveryApplication(factory, logistics);
        app.start();
    }
}
