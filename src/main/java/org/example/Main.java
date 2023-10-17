package org.example;

public class Main {
    public static void main(String[] args) {

        URLShortener urlShortener = new URLShortener();

        String longUrl = "https://www.longulrexampleajkdsdkjas.com";
        String shortenedUrl =urlShortener.shortenURL(longUrl);

        System.out.println("URL original: " + longUrl);
        System.out.println("URL acortada: " + shortenedUrl);

    }
}