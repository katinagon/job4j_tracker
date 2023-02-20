package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return i;
            }
        }
        throw new ElementNotFoundException("Элемента " + key + " нет в массиве.");
    }

    public static void main(String[] args) {
        String[] value = {"Bob", "Din", "Harry"};
        try {
            System.out.println(indexOf(value, "Kate"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
