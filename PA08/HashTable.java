/*
 * Name: TODO
 * PID: TODO
 */

/**
 * TODO
 * 
 * @author TODO
 * @since TODO
 */
public class HashTable implements IHashTable {

    /* Constants */
    private static final int MIN_INIT_CAPACITY = 10;
    private static final int DEFAULT_CAPACITY = 20;
    private static final double MAX_LOAD_FACTOR = 0.5;

    /* Instance variables */
    private String[] table1, table2; // sub-tables
    private int nElems; // size

    public HashTable() {
        /* TODO */
    }

    public HashTable(int capacity) {
        /* TODO */
    }

    @Override
    public boolean insert(String value) {
        /* TODO */
        return false;
    }

    @Override
    public boolean delete(String value) {
        /* TODO */
        return false;
    }

    @Override
    public boolean lookup(String value) {
        /* TODO */
        return false;
    }

    @Override
    public int size() {
        /* TODO */
        return -1;
    }

    @Override
    public int capacity() {
        /* TODO */
        return -1;
    }

    /**
     * Get the string representation of the hash table.
     *
     * Format Example:
     * | index | table 1 | table 2 |
     * | 0 | Marina | [NULL] |
     * | 1 | [NULL] | DSC30 |
     * | 2 | [NULL] | [NULL] |
     * | 3 | [NULL] | [NULL] |
     * | 4 | [NULL] | [NULL] |
     *
     * @return string representation
     */
    @Override
    public String toString() {
        /* TODO */
        return null;
    }

    /**
     * Get the rehash stats log.
     *
     * Format Example: 
     * Before rehash # 1: load factor 0.80, 3 evictions.
     * Before rehash # 2: load factor 0.75, 5 evictions.
     *
     * @return rehash stats log
     */
    public String getStatsLog() {
        /* TODO */
        return null;
    }

    private void rehash() {
        /* TODO */
    }

    private int hashOne(String value) {
        /* TODO */
        return -1;
    }

    private int hashTwo(String value) {
        return -1;
    }
}
