package aufgabe2;

import java.util.Arrays;

/**
 *
 * @author oliverbittel
 */
public class ArrayFrequencyTable extends AbstractFrequencyTable {

    private int size = 0;
    private Word[] fqTable;
    private final int DEFAULT_SIZE = 100;

    public ArrayFrequencyTable() {
        clear();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public final void clear() {
        // throw muss auskommentiert werden!
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        size = 0;
        fqTable = new Word[DEFAULT_SIZE];
    }

    @Override
    public void add(String w, int f) {
        // throw muss auskommentiert werden!
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (w == null || w.isEmpty() || f < 0) {throw new IllegalArgumentException("Ungültige Argumente!");}

        if (fqTable == null) {
            clear();
            fqTable[0] = new Word(w, f);
            size++;
            return;
        }

        if (size >= fqTable.length) {
            fqTable = Arrays.copyOf(fqTable, fqTable.length * 2);
        }

        for (int i = 0; i < size; i++) {
            Word t = fqTable[i];
            if (fqTable[i] != null && fqTable[i].getWord().equals(w)) {
                fqTable[i].addFrequency(f);
                int j = i;
                while (j > 0 && t.getFrequency() > fqTable[j-1].getFrequency() ) {
                    fqTable[j] = fqTable[j-1];
                    j--;
                }

                fqTable[j] = t;
                return;
            }
        }

        int j = size;
        while (j > 0 && f > fqTable[j-1].getFrequency() ) {
            fqTable[j] = fqTable[j-1];
            j--;
        }
        fqTable[j] = new Word(w, f);
        size++;

    }

    @Override
    public Word get(int pos) {
        // throw muss auskommentiert werden!
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (fqTable[pos] == null) ? null : fqTable[pos];
    }

    @Override
    public int get(String w) {
        // throw muss auskommentiert werden!
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < size; i++) {
            if (fqTable[i] == null) continue;
            if (fqTable[i].getWord().equals(w)) {
                return fqTable[i].getFrequency();
            }
        }
        return 0;
    }
}
