package counter;

public class CounterImpl implements Counter {
    private int value = 0;

    @Override
    public void inc() {
        value++;
    }

    @Override
    public int get() {
        return value;
    }
}
