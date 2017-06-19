package isoForum.riddle;


public class CodeSmell {

    private Integer value;
    private Smell smell;


    public Integer getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public Smell getSmell() {
        return smell;
    }


    public void setSmell(Smell smell) {
        this.smell = smell;
    }


    public Integer add(Integer addValue) {
        if (addValue == null) {
            return null;
        }
        value += addValue;
        return value;
    }


    public Double getRandomValue() {
        return Math.random() * value;
    }

    public Integer getSum() {
        try {
            return value+smell.getNameAsInteger();
        } catch (Exception e) {
            return null;
            //this should never happen
        }
    }
}


class Smell {

    private String name;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Integer getNameAsInteger() throws Exception {
        try {
            return Integer.parseInt(name);
        } catch (NumberFormatException e) {
             throw new Exception();
        }

    }
}