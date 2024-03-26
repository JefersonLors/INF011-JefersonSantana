package interfaces;

public interface Protocol {
        void open();
        void message(Request request, Response response);
        void close();
}
