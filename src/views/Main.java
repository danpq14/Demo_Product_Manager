package views;

import manager.product.Phone;
import manager.product.Product;
import manager.product.SortProductByPrice;
import productmanager.Manager;
import productmanager.ProductManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> myStore = new ArrayList<>();
        Phone phone1 = new Phone(100, "Iphone1", 200, true, "likenew");
        Phone phone2 = new Phone(101, "Iphone2", 300, true, "likenew");
        Phone phone3 = new Phone(102, "Iphone3", 250, true, "likenew");
        myStore.add(phone1);
        myStore.add(phone2);
        myStore.add(phone3);

        ProductManager<Phone> store = new ProductManager<Phone>(myStore);


        store.add(103, "Iphone4", 250, false, "new");
        System.out.println("Test tính năng hiển thị tất cả sản phẩm");
        store.showAllProduct();
        System.out.println("------------------------");
        System.out.println("Test tính năng sắp xếp lại sản phẩm theo giá từ thấp đến cao");
        store.displayProductAscendingPrice();
        System.out.println("------------------------");
        System.out.println("Test tính năng xóa sản phẩm theo tên và xóa theo ID");
        store.deleteByName("Iphone4");
        store.deleteByID(102);
        store.showAllProduct();
        System.out.println("-------------------------");
        System.out.println("test tính năng tìm kiếm theo ID");
        System.out.println(store.searchByID(101));
    }
}
