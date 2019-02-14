import java.text.DecimalFormat;

public abstract class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }
    public Product(String code,String description,int price){
        super();
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Get and set accessors for the code, description, and price instance variables


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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}