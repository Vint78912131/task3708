package main.storage;

public interface Storage {
    void add(Object storedObject);

    Object get(long id);
}
