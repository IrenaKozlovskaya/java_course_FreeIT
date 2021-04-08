public class Array<T> {

    private T[] objects;

    @SafeVarargs
    public Array(T... objects) {
        this.objects = objects;
    }

    public T get(int index) {
        return objects[index];

    }
}
