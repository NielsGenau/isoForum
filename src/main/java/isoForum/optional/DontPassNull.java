package isoForum.optional;

/**
 * Created by gen on 16.06.2017.
 */
public final class DontPassNull {
    private final Integer a;


    public DontPassNull(Integer a) {
        this.a = a;
    }


    public Integer getA() {
        return a;
    }


    public Integer add(Integer b) {
        if (b == null) {
            return null;
        }

        return a+b;
    }
}
