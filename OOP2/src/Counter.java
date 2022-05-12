public class Counter {
    private int x;

    public Counter() {
        x = 0;
    }
    
    public Counter(int start) {
        x = start;
    }

    public int value() {
        return x;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            x -= decreaseBy;
        }
    }

    public void decrease() {
        x -= 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            x += increaseBy;
        }
    }
    
    public void increase() {
        x += 1;
    }
}

