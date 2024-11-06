package section8.model;

// Country.java
public class Country {
    private String name;
    private String code;

    public Country() {}

    public void input(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void info() {
        System.out.println("Country Name: " + name);
        System.out.println("Country Code: " + code);
    }

    public String getName() {
        return name;
    }
}
