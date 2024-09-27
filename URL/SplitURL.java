import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class SplitURL {
    public static void main(String[] args) {
        try {
            String urlString = "https://example.com:8080/path/to/resource?query=hello#fragment";
            URI uri = new URI(urlString);
            URL url = uri.toURL();

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Fragment: " + url.getRef());
        } catch (URISyntaxException e) {
            System.out.println("Invalid URL syntax: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
