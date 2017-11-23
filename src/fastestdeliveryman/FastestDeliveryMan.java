/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestdeliveryman;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yee_l
 */
public class FastestDeliveryMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ArrayList<String> ResInfo = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("FASTEST DELIEVRYMAN SDN.BHD.");
        System.out.println("MENU MAINTENANCE");
        System.out.println("-----------------------------------\n");

        System.out.println("Modules In Menu Maintenance: ");
        System.out.println("1. ADD");
        System.out.println("2. EDIT");
        System.out.println("3. DELETE");
        System.out.print("Please Select a module to be performed: ");
        int selection = Integer.parseInt(scan.nextLine());

        switch (selection) {
            case 1: {
                System.out.println("----------------------------------");
                System.out.println("MENU MAINTENANCE -- ADD");
                System.out.println("----------------------------------\n");
                
                System.out.println("Add Option: ");
                System.out.println("1. Food Items");
                System.out.println("2. Beverage Items");
                System.out.println("3. Promotional Items");
                System.out.print("Please select one add option to be performed: ");
                int addOptionSelection = Integer.parseInt(scan.nextLine());
            }

        }
    }
    
}
