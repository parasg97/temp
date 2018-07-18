package com.example.cardatastorage;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        String vinNo,model,typeOfWork,problem,reason,removedPart,releasedPart,repairMan,informationSource,responsible;
        float torque;
        int option;

        System.out.println("Enter (1) to write data or enter(2) to read data");
        Scanner scan=new Scanner(System.in);
        option=scan.nextInt();
        if(option==1){
            System.out.println("Enter vinNo");
            while(true){
                vinNo=scan.nextLine();
                if(vinNo.length()!=17)
                    System.out.println("Invalid input please try again");
                else
                    break;
            }
            System.out.println("Enter model");
            model=scan.nextLine();
            System.out.println("Enter typeOfWork");
            typeOfWork=scan.nextLine();
            System.out.println("Enter problem");
            problem=scan.nextLine();
            System.out.println("Enter reason");
            reason=scan.nextLine();
            System.out.println("Enter removed part");
            removedPart=scan.nextLine();
            System.out.println("Enter released part");
            releasedPart=scan.nextLine();
            System.out.println("Enter repair man name");
            repairMan=scan.nextLine();
            System.out.println("Enter information source");
            informationSource=scan.nextLine();
            System.out.println("Enter responsible");
            responsible=scan.nextLine();
            System.out.println("Enter torque");
            while(true){
                String temp=scan.next();
                try {
                    torque=Float.parseFloat(temp);
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Invlid input please try again");
                }
            }


            ExcelHandler.writeToExcel(new CarDataModel(vinNo,model,typeOfWork,problem,reason,removedPart,releasedPart,torque,repairMan,informationSource,responsible));

        }
        else if(option==2){
            ExcelHandler.readFromExcel();
        }
    }
}
