public class MRUCache extends AbstractCache{
    public MRUCache(int size) {
        super(size);
    }

    @Override
    public void put(Object key, Object val) {
        if (list.size() == this.cacheSize) {
            this.removeLastElement();
        }
        list.addLast(key);
        map.put(key, val);
    }

    @Override
    public Object get(Object key) {
        boolean res = list.remove(key);
        if (res) {
            list.addLast(key);
            return map.get(key);
        }
        return null;
    }

}
