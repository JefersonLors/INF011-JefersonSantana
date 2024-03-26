package protocols;

import interfaces.Protocol;
import interfaces.Request;
import interfaces.Response;

public class HTTPProtocol implements Protocol {
    private String host;
    private int port;

    public HTTPProtocol( String host, int port ){
        this.host = host;
        this.port = port;
    }
    @Override
    public void open() {

    }

    @Override
    public void message(Request request, Response response) {

    }

    @Override
    public void close() {

    }
}
