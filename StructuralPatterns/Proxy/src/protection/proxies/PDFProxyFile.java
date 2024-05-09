package protection.proxies;

import protection.others.Permission;
import protection.others.User;
import protection.subjects.XFile;

public class PDFProxyFile implements XFile {
    private XFile file;
    private User user;

    public PDFProxyFile(XFile file, User user){
        this.file = file;
        this.user = user;
    }
    @Override
    public void open() throws Exception{
        this.file.open();
    }

    @Override
    public void write(String content) throws Exception{
        if( this.user.getPermission() != Permission.ADMIN){
            throw new Exception("Only admin users can write on that file.");
        }
        this.file.write(content);
    }

    @Override
    public String read() throws Exception{
        return this.file.read();
    }

    @Override
    public void close() throws Exception{
        this.file.close();
    }
}
