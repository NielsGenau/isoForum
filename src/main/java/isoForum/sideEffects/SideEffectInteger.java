package isoForum.sideEffects;

/**
 * Created by gen on 16.06.2017.
 */
public class SideEffectInteger {
    private int value;


    public SideEffectInteger(int value) {
        this.value = value;
    }


    public int add(int b) {
        this.value += b;
        return value;
    }

}
