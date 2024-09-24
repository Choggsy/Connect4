public class Column {

    private final int value;

    private Column(final int value) {
        this.value = value; //Requires no validation due to being a primitive
    }

    public static Column create(final int value) {
        if(value <= 0){
            throw new IndexOutOfBoundsException("column value must be greater than zero");
        }
        return new Column(value);
    }

    public int getValue() {
        return value;
    }
}
