package net.study.basic.lesson4;

public class TestHttpClient {
    public static void main(String[] args) {
        HttpClient myClient = new HttpClient("weatherforecast.com", 8080);
        System.out.println(myClient);
        HttpClient myClient2 = new HttpClient("google.com");
        System.out.println(myClient2);
    }


}
