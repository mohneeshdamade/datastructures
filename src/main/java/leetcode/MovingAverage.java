package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MovingAverage {
    private int size;
    private List queue = new ArrayList<Integer>();
    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        queue.add(val);
        // calculate the sum of the moving window
        int windowSum = 0;
        for(int i = Math.max(0, queue.size() - size); i < queue.size(); i++)
            windowSum += (int)queue.get(i);

        return windowSum * 1.0 / Math.min(queue.size(), size);
    }


    public static void main(String[] args) {
        int size = 3;
        int val = 1;
        MovingAverage obj = new MovingAverage(size);
        double param_1 = obj.next(val);
    }
}


