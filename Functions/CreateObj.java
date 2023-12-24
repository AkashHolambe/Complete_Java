package Functions;

public class CreateObj {
    public static void main(String[] args) {
        // Create an instance of the Table class
        Table t = new Table();
        
        // Set values for the Table instance using the setValue method
        t.setValue("Black shine", 34000);
        
        // Retrieve and print the values using the getValues method
        t.getValues();
    }
}

// Define the Table class
class Table {
    // Declare instance variables for the Table class
    String name;
    int coast;

    // Method to set values for the Table instance
    public void setValue(String n, int m) {
        this.name = n;
        this.coast = m;
    }

    // Method to retrieve and print values for the Table instance
    public void getValues() {
        System.out.println(this.name + this.coast);
    }
}
