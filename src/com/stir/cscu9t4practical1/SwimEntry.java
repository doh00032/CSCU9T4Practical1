package com.stir.cscu9t4practical1;

import java.util.ArrayList;
import java.util.List;

public class SwimEntry extends Entry{
    private String where;
    private List<Entry> tr = new ArrayList<Entry>();;

    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String outdoors) {
        super(n, d, m, y, h, min, s, dist);

    }

    public String getWhere() {
        return where;
    }

}
