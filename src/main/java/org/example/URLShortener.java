package org.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class URLShortener {

    public static String shortenURL(String longUrl) {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(longUrl.getBytes());
            byte[] digest = md.digest();
            String hash = Base64.getUrlEncoder().withoutPadding().encodeToString(digest);
            return hash.substring(0, 5);
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
            return null;
        }
    }
}
