package main.storage;

import java.util.HashMap;

public class RemoteStorage implements Storage {
    private long id = 0;
    private HashMap<Long, Object> storageMap = new HashMap<>();

    @Override
    public void add(Object o) {
        storageMap.put(id++, o);
    }

    @Override
    public Object get(long id) {
        System.out.println("Getting a value for id #" + id + " from RemoteStorage...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {

        }
        return storageMap.get(id);
    }
}
