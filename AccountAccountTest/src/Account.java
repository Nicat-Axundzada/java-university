public class Account {
    private String name; // instance variable
    int accoutNumber; // default is public

    // constructor initializes name with parameter name
    public Account(String name) // constructor name is class name
    {
        this.name= name;
    }

    // method to set the name in the object
    public void setName(String name) {
        this.name = name;
    }
    // method to retrieve the name from the object
    public String getName() {
        return name;
    }

}