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
        return  "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    public String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        DecimalFormat format = new DecimalFormat("0.00");
       return format.format(price);
    }
public double getPrice(){
        return this.price;
}
public void setPrice(double price){
        this.price = price;
}
    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
    public String getCode(){
        return this.code;
    }
    public String getDescription(){
        return this.description;
    }
  public void setDescription(String description){
        this.description=description;
  }
  public void setCode(String code){
        this.code=code; }
  public boolean equals(){
        return true;
  }
}