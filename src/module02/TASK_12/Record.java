package module02.TASK_12;

public class Record<I, N, V> {
    private I id;
    private N name;
    private V value;

    public Record(I id, N name, V value){
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }

    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + this.id +
                ", name=" + this.name +
                ", value=" + this.value +
                '}';
    }
}
