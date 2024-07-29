package proxies.virtualXFileProxy;

import realSubjects.PDFFile;
import subjects.XFile;

public class PDFVirtualProxy implements XFile {
    private PDFFile pdfFile;
    private String fileName;
    private String filePath;
    private String content;
    private boolean contentIsDeprecated = false;

    public PDFVirtualProxy(String fileName, String filePath){
        this.fileName = fileName;
        this.filePath = filePath;
    }

    @Override
    public void open() throws Exception {
        this.createIfNecessary();
        this.contentIsDeprecated = true;
        this.pdfFile.open();
    }

    @Override
    public void write(String content) throws Exception {
        this.createIfNecessary();
        this.pdfFile.write(content);
        this.contentIsDeprecated = true;
    }

    @Override
    public String read() throws Exception {
        this.createIfNecessary();

        if( this.contentIsDeprecated == false ){
            return this.content;
        }

        this.content = this.pdfFile.read();
        this.contentIsDeprecated = false;
        return this.content;
    }

    @Override
    public void close() throws Exception {
        this.createIfNecessary();
        this.contentIsDeprecated = true;
        this.pdfFile.close();
    }

    private void createIfNecessary(){
        if( pdfFile == null ){
            this.pdfFile = new PDFFile(fileName, filePath);
        }
    }

}
