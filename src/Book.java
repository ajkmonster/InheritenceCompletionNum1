public class Book extends Product {

    private String author;
    private int pages;
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    @Override
    public String toString() {
        return  "Code:               " + getCode() + "\n" +
                "Description:        " + getDescription() + "\n" +
                "Author:             " + getAuthor() + "\n" +
                "Price:              " + this.getFormattedPrice(getPrice()) + "\n";
    }
}