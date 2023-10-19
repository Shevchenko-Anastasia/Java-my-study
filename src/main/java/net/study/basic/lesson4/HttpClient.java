package net.study.basic.lesson4;

public class HttpClient {
    String host;
    Integer port;

    public HttpClient(){};

    public HttpClient(String host, Integer port){
        this.host = host;
        this.port = port;
    };

    public HttpClient (String host){
        this(host, 80);
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
