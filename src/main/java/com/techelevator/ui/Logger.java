package com.techelevator.ui;

import java.io.*;

public class Logger {

    private File auditFile;
    private PrintWriter writer;

    public Logger(String pathName){

        this.auditFile = new File(pathName);

        if (!auditFile.exists()){
            try {
                this.writer = new PrintWriter(this.auditFile);
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }

        else {
            try {
                this.writer = new PrintWriter(new FileWriter(this.auditFile, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeSelectItem(String logMessage, String getName,
                                String getId, double totalBalance, double purchaseAmount){
        this.writer.printf("%-20s %-10s %-4s $%-4.2f $%-4.2f\n", logMessage,
                getName, getId, totalBalance, purchaseAmount);
        this.writer.flush();
        this.writer.close();
    }
    public void writeChangeGiven(String logMessage, String changeGiven,
                                double firstBalance, String totalBalance){
        this.writer.printf("%-20s %-15s $%-4.2f %-4s\n", logMessage, changeGiven,
                firstBalance, totalBalance);
        this.writer.flush();
        this.writer.close();
    }
    public void writeFeedMoney(String logMessage, String moneyFed,
                                 double amount, double totalBalance){
        this.writer.printf("%-20s %-15s $%-4.2f $%-4.2s\n", logMessage, moneyFed,
                amount, totalBalance);
        this.writer.flush();
        this.writer.close();
    }

}
