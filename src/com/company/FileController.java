package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FileController {
Scanner scanner;
ArrayList <File> File;

    FileController(){
    scanner = new Scanner(System.in);
    File = new ArrayList<>();
}
 void FileOpen(){
    FileStatus open = FileStatus.OPEN;
    }

    void FileClosed(){
    FileStatus closed = FileStatus.CLOSED;
    }


}

