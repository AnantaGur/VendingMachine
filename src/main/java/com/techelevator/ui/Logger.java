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

    public void write(String logMessage){
        this.writer.println(logMessage);
        this.writer.flush();
        this.writer.close();
    }

}
