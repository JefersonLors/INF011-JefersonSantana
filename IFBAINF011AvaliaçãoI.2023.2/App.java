import protocols.HTTPProtocol;
import requests.HTTPRequest;
import responses.HTTPResponse;

public class App {
    public static void main( String[] args ){
        HTTPProtocol httpProtocol = new HTTPProtocol( "201.652.362.222", 1324 );
        httpProtocol.message(new HTTPRequest(), new HTTPResponse());
    }
}
