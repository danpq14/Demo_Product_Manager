package manager.product;

public class Product {
    private int ID;
    private String name;
    private int price;
    private boolean status;
    private String description;

    public Product(int ID, String name, int price, boolean status, String description) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.status = status;
        this.description = description;
    }

    public Product() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        if (status) {
            return "Sẵn sàng";
        }
        return "Ko sẵn sàng";
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ID sản phẩm : " +ID+ " / Tên sản phẩm : "+name+" / Giá sp : "+price+" / Trạng thái : "+getStatus()+ " / Mô tả : "+description;
    }
}
