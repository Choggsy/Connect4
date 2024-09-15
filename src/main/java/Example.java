import static java.util.Objects.requireNonNull;

public class Example {

    public String hello(final String name) {
        requireNonNull(name, "name can not be null");
        return "Hello " + name;
    }
}
