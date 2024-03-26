package interfaces;

public interface BasicResponseRequest {
    void addHeader(String key, String value);
    void addBody(byte[] content);
}
