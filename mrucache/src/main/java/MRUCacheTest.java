import java.util.ArrayList;

public class MRUCacheTest {

    public static void main(String args[])
    {

    AbstractCache mruCache = new MRUCache(3);
    mruCache.put("yahoo","www.Yahoo.com");
    mruCache.put("google","www.google.com");
    mruCache.put("fb","www.facebook.com");
    mruCache.get("yahoo");
    mruCache.put("acasa","www.acasa.com");

    mruCache.toString();
    System.out.println("- Most Recently Used Cache Test - (puts at the the bottom / removes the most recently used items");

        ArrayList<String> listOfKeys = new ArrayList<String>(mruCache.list);
        for (String a: listOfKeys) {
            System.out.println(mruCache.map.get(a));
        }
            
    }
}
