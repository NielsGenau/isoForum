package isoForum.immutableData;


public final class Integer {

    private final int value;


    public Integer(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public Integer add(Integer b) {
        return new Integer(getValue()+b.getValue());
    }
}
