public interface ICache {

    public void put(Object key, Object val);

    public Object get(Object key);

    public void invalidate(Object key);

    public void printKeyOrder();
}
