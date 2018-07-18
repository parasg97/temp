package com.example.cardatastorage;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExcelHandler {
    public static void writeToExcel(CarDataModel car){
        try{
            FileWriter fw=new FileWriter("data");
            fw.write(car.getCurrentDate().toString());
            fw.write(Long.toString(car.getTime()));
            fw.write(car.getVinNo());
            fw.write(car.getModelNo());
            fw.write(car.getTypeOfWork());
            fw.write(car.getProblem());
            fw.write(car.getReason());
            fw.write(car.getReleasedPart());
            fw.write(Float.toString(car.getTorque()));
            fw.write(car.getRepairMan());
            fw.write(car.getInformationSource());
            fw.write(car.getResponsible());
            fw.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }

    public static void readFromExcel(){
        int ch;
        FileReader fr;
        try
        {
            fr = new FileReader("text");
            while ((ch=fr.read())!=-1)
                System.out.print((char)ch);
            fr.close();
        }
        catch (IOException fe)
        {
            System.out.println(fe.toString());
        }

    }
}
