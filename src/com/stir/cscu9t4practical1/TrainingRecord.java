// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
private Entry entry;
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor

    // add a record to the list
    public void addEntry(Entry e){
        tr.add(e);
    } // addClass

    // look up the entry of a given day and month
    public String lookupEntry (int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        String result = "No entries found";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay()==d && current.getMonth()==m && current.getYear()==y)
                result = current.getEntry();
        }
        return result;
    } // lookupEntry

    public String LookupEntries (int d, int m, int y) {
        String ResultsNone = "";
        HashMap<String,Entry> entries =  new HashMap<String, Entry>();
        for (Entry i : entries.values()) {
            System.out.println(i);

            if(entries.equals(ResultsNone)){
                System.out.print(entries);}

        }
        


        /* while (entries.hasNext()) {
            Entry current = entries.next();
            if (current.getDay()==d && current.getMonth()==m && current.getYear()==y)
               ResultsNone = current.getEntry();

        }
        if(itr.equals(ResultsNone)){
        System.out.print(itr);}*/

        return ResultsNone;
    }

    // Count the number of entries
    public int getNumberOfEntries(){
        return tr.size();
    }
    // Clear all entries
    public void clearAllEntries(){
        tr.clear();
    }


} // TrainingRecord