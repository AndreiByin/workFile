package com.company;

import java.util.ArrayList;

public class Folder extends File {
   private ArrayList <File>  listOfFiles;


    public Folder(String nameFile, int sizeFile, String creatorFile, Status status) {
        super(nameFile, sizeFile, creatorFile, status);

    }

}
