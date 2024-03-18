package server;

import jakarta.xml.ws.Endpoint;

public class ServerTest {
    public static void main(String[] args) {
        ServerImpl server = new ServerImpl();
        Endpoint publish = Endpoint.publish("http://localhost:8082/server/test", server);
        System.out.println(publish.isPublished());
    }
}
