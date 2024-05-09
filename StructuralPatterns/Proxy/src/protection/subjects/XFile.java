package protection.subjects;

public interface XFile {
    void open() throws Exception;
    void write(String content) throws Exception;
    String read() throws Exception;
    void close() throws Exception;
}
