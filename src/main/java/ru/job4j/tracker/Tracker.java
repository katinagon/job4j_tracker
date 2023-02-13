package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public boolean replace(int id, Item item) {
        if (indexOf(id) != -1) {
            int index = indexOf(id);
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] tempArray = new Item[items.length];
        int size = 0;
        for (Item item : items) {
            if (item != null) {
                tempArray[size] = item;
                size++;
            }
        }
        tempArray = Arrays.copyOf(tempArray, size);
        return tempArray;
    }

    public Item[] findByName(String key) {
        Item[] tempArray = new Item[items.length];
        int size = 0;
        for (Item item : items) {
            if (item != null && key.equals(item.getName())) {
                tempArray[size] = item;
                size++;
            }
        }
        tempArray = Arrays.copyOf(tempArray, size);
        return tempArray;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
}