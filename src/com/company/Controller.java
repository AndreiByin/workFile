package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner scanner;
    ArrayList<File> fileList;
    protected String fileName;

    Controller() {
        scanner = new Scanner(System.in);
        fileList = new ArrayList<>();


    }

    public void printFiles() {

        for (File f : fileList) {

            System.out.println(f.getNameFile());
        }
    }

    public boolean fileCreation() {
                System.out.println("Enter name file");
                String fileName = scanner.nextLine();
                if (Character.isDigit(fileName.charAt(0))) {
                    return false;
                }
                System.out.println("Enter size file");
                int sizeFile = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter creator file");
                String creator = scanner.nextLine();
                System.out.println("Enter status file  '1' - OPEN or '2'- CLOSED");
                String status = scanner.nextLine();
                Status st;
                if (status.equals("2")) {
                    st = Status.CLOSED;
                } else {
                    st = Status.OPEN;
        }
        fileList.add(new File(fileName, sizeFile, creator, st));
        System.out.println("File" + " " + fileName + " " + "create");
        return true;
    }

    boolean fileOpen() {

        System.out.println("Enter name file to open it.");
        boolean result = false;
        int listSize = fileList.size();
        while (!result) {
            fileName = scanner.nextLine();
            for (int i = 0; i < listSize; i++) {
                File element = fileList.get(i);
                if (element.getNameFile().equals(fileName)) {
                    element.setStatus(Status.OPEN);
                    System.out.println("File Open");
                    result = true;
                }
            }
            if (!result) {
                System.err.println("File with this name not found.");
            }
        }
        return true;
    }

    boolean fileClose() {

        System.out.println("Enter name file to closed it.");
        boolean result = false;
        int listSize = fileList.size();
        while (!result) {
            fileName = scanner.nextLine();
            for (int i = 0; i < listSize; i++) {
                File element = fileList.get(i);
                if (element.getNameFile().equals(fileName)) {
                    element.setStatus(Status.CLOSED);
                    System.out.println("File Closed");
                    result = true;
                }
            }
        }
        if (!result) {
            System.err.println("File with this name not found.");
        }
        return true;
    }

    protected void removeFile() {
        System.out.println("Enter a file name to delete!");
        boolean result = false;
        int size = fileList.size();

            fileName = scanner.nextLine();
            for (int i = 0; i < size; i++) {
                File element = fileList.get(i);
                if ((element.getNameFile().equals(fileName)) && (element.getStatus().equals(Status.CLOSED))) {
                    StringBuilder stringBuilder = new StringBuilder(element.getNameFile());
                    stringBuilder.setCharAt(0,'?');
                    element.setNameFile(stringBuilder.toString());
                    System.out.println("File delete!!!");
                } else if (element.getStatus().equals(Status.OPEN)) {
                    System.err.println("To delete a file, please close it.");
                }
            }

        }
    public boolean folderCreation() {
        System.out.println("Enter name Folder");
        String folderName = scanner.nextLine();
        if (Character.isDigit(folderName.charAt(0))) {
            return false;
        }
        System.out.println("Enter size folder");
        int sizeFolder = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter creator folder");
        String creator = scanner.nextLine();
        System.out.println("Enter status folder  '1' - OPEN or '2'- CLOSED");
        String status = scanner.nextLine();
        Status st;
        if (status.equals("2")) {
            st = Status.CLOSED;
        } else {
            st = Status.OPEN;
        }
        fileList.add(new Folder(folderName, sizeFolder, creator, st));
        System.out.println("Folder" + " " + folderName + " " + "create");
        return true;
    }
    }
