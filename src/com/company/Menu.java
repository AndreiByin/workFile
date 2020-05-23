package com.company;


import java.util.Scanner;

public class Menu {

  public static void run() {
     Controller fileControllerObj = new Controller();
      Scanner scanner = new Scanner(System.in);
      String choose = "0";
      while (!(choose.equals("7"))) {

          System.out.println("Enter:\n" +
                  "Number '1' - To create a File.\n" + //Создать фаил
                  "Number '2' - Open a File.\n" + //Открыть фаил
                  "Number '3' - Closed a File.\n" + //Закрыть фаил
                  "Number '4' - Delete a File.\n" +//Удалить фаиа
                  "Number '5' - To create a Folder.\n"+
                  "Number '6' - Print All File. \n"+
                  "Number '7' - Exit");
          choose = scanner.nextLine();
          try {
                Integer.parseInt(choose);

              switch (choose) {
                  case "1":

                  while(!fileControllerObj.fileCreation());
                      break;
                  case "2":
                     while (!fileControllerObj.fileOpen());
                      break;
                  case "3":
                      while (!fileControllerObj.fileClose());
                      break;
                  case "4":
                            fileControllerObj.removeFile();
                      break;
                  case "5":
                    while (!fileControllerObj.folderCreation());
                  case "6":
                      fileControllerObj.printFiles();
                      break;
                  case "7":
                      System.out.println("By-by");
                  default:
                      System.err.println("There is no such item in the menu");//Нет токого пункта в меню
              }
          }
          catch (NumberFormatException e){
              System.out.println(e.getMessage());
          }
      }
  }
}
