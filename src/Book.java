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
    @Override
    public boolean equals(Object a){
        Book c = (Book)a;
        if (((Book) a).getAuthor().equalsIgnoreCase(c.getAuthor())) {
            return true;
        } else {
            return false;
        }
    }
}