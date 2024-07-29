package realSubjects;

import subjects.XFile;

public class PDFFile implements XFile {
    private String fileContent;
    private String fileName;
    private Boolean itsOpen = false;
    private String filePath;
    private final String fileExtension = ".pdf";

    public PDFFile(String fileName, String path){
        System.out.println("\n<<<< [Creating File] >>>>\n");
        this.fileName = fileName;
        this.filePath = path;
        this.fileContent = "";
    }
    @Override
    public void open() throws Exception{
        this.itsOpen = true;
    }

    @Override
    public void write(String content) throws Exception{
        if( !this.itsOpen ){
            throw new Exception("Is not possible write in unopned file");
        }
        this.fileContent = content;
    }

    @Override
    public String read() throws Exception{
        if( !this.itsOpen ){
            throw new Exception("Is not possible read an unopened file");
        }
        System.out.println("\n<<<< [Reading File] >>>>\n");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File path: " + this.filePath + "/" +this.fileName + this.fileExtension);
        stringBuilder.append("\nContent: " + this.fileContent);
        return stringBuilder.toString();
    }

    @Override
    public void close() throws Exception{
        this.itsOpen = false;
    }
}
