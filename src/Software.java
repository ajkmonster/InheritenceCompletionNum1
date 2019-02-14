public final class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;
    public Software(){

    }
    public Software(String code,String description,int price,String programmer, String os){
        super(code,description,price);
        this.programmer=programmer;
        this.os=os;
    }
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
    @Override
    public boolean equals(Object a){
            Software c = (Software)a;
            if (((Software) a).getProgrammer().equalsIgnoreCase(c.getProgrammer())) {
                return true;
            } else {
                return false;
            }
        }
}