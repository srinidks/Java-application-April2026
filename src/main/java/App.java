import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws Exception {

        int port = 8081;

        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }

        final int finalPort = port;   // 🔥 FIX HERE

        HttpServer server = HttpServer.create(new InetSocketAddress(finalPort), 0);

        server.createContext("/", new HttpHandler() {
            public void handle(HttpExchange exchange) throws java.io.IOException {

                String response = "Hello from Jenkins CI/CD on port " + finalPort;

                exchange.sendResponseHeaders(200, response.length());

                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        server.start();
        System.out.println("Server started on port " + finalPort);
    }
}
