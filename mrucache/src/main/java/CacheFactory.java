public class CacheFactory {

    public static ICache newInstance(int cacheSize, EvictionStrategy strategy) {
        if (EvictionStrategy.MRU == strategy) {
            return new MRUCache(cacheSize);
        }
        else {
            throw new RuntimeException("Invalid EvictionStrategy");
        }

    }

}