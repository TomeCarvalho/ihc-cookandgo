package com.example.trueproject.custom_classes; //

import com.example.trueproject.BuildConfig;

import java.util.Objects;

public class Time implements Comparable<Time> {
    private int h;
    private int min;

    public Time(int min) {
        this.h = min / 60;
        this.min = min % 60;
    }

    public Time(int h, int min) {
        this.h = h;
        this.min = min;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        String ret = "";
        if (h == 0)
            return min + "min";
        return h + "h" + " " + min + "min";
    }

    // returns 1 if longer, 0 if same, -1 if shorter
    @Override
    public int compareTo(Time o) {
        if (h > o.getH())
            return 1;
        if (h == o.getH())
            return Integer.compare(min, o.getMin());
        return -1;
    }
}
