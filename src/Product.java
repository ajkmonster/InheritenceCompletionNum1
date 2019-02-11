import java.text.DecimalFormat;

public class Product extends Main{

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.00"); // Set your desired format here.
        return df.format(price);
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}