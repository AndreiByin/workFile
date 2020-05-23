package com.company;

public class File {

   private String nameFile;
   private int sizeFile;
   private String creatorFile;
   private Status status;

File(){

}
    public File(String nameFile, int sizeFile, String creatorFile,Status status) {
            this.nameFile = nameFile;
            this.sizeFile = sizeFile;
            this.creatorFile = creatorFile;
            this.status = status;

    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public int getSizeFile() {
        return sizeFile;
    }

    public void setSizeFile(int sizeFile) {
        this.sizeFile = sizeFile;
    }

    public String getCreatorFile() {
        return creatorFile;
    }

    public void setCreatorFile(String creatorFile) {
        this.creatorFile = creatorFile;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
