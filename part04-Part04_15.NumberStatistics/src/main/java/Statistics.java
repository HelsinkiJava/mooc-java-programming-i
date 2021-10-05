
public class Statistics {
    private int count;
    private int number;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.number += number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return number;
    }

    public double average() {
        if (count == 0) {
            return 0;
        } else {
            return (double) number / count;
        }

    }
}
