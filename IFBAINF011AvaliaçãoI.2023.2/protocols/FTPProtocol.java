package protocols;

import interfaces.Protocol;
import interfaces.Request;
import interfaces.Response;

public class FTPProtocol implements Protocol {

    private String host;
    private int port;

    public FTPProtocol( String host, int port ){
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
