public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;
    public String getOs(){
    return this.os;
    }
    public void setOs(String os){
    this.os=os;
    }
    public String getProgrammer() {
        return this.programmer;
    }
    public void setProgrammer(String programmer){
        this.programmer=programmer;
    }
    @Override
    public String toString() {
        return  "Code:               " + getCode() + "\n" +
                "Description:        " + getDescription() + "\n" +
                "Os:                 " + getOs() + "\n" +
                "Programmer:         " + getProgrammer() + "\n" +
                "Price:              " + this.getFormattedPrice(getPrice()) + "\n";
    }
}