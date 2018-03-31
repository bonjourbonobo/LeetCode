/*
Note: This is a companion problem to the System Design problem: Design TinyURL.

TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
*/

public class Codec {

    Map<Integer, String> map = new HashMap<Integer, String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Integer code = longUrl.hashCode();
        map.put(code, longUrl);
        return "http://tinyurl.com/" + code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        Integer code = Integer.parseInt(shortUrl.replace("http://tinyurl.com/", ""));
        return map.get(code);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

/*
[備註]

1. 利用Map去存 shortUrl - longUrl，
shortUrl的編號方式，可用HashCode或一個counter來實作。

2. Decode中要拿到key的方式，可以直接取代"http://tinyurl.com/"成""，
也可以取最後一個"/"後的值。
*/

        
        
