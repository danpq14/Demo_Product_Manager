package productmanager;

import manager.product.Product;
import manager.product.SortProductByPrice;

import java.util.ArrayList;
import java.util.Collections;


public class ProductManager<E extends Product> implements Manager<E> {

    private ArrayList<E> list;

    public ProductManager() {
    }

    public ProductManager(ArrayList<E> list) {
        this.list = list;
    }

    @Override
    public void add(int ID, String name, int price, boolean status, String description) {
        Product product = new Product(ID, name, price, status, description);
        E newProduct = (E) product;
        list.add(newProduct);
    }

    @Override
    public void edit(int ID, String name, int price, boolean status, String description) {
        for (int i = 0; i < list.size(); i++) {
            int searchID = list.get(i).getID();
            if (searchID == ID) {
                list.get(i).setName(name);
                list.get(i).setPrice(price);
                list.get(i).setStatus(status);
                list.get(i).setDescription(name);
            }
        }
    }

    @Override
    public E deleteByID(int ID) {
        for (int i = 0; i < list.size(); i++) {
            int searchID = list.get(i).getID();
            if (searchID == ID) {
                return list.remove(i);
            }
        }
        return null;
    }
    @Override
    public E deleteByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            String searchName = list.get(i).getName();
            if (searchName == name) {
                return list.remove(i);
            }
        }
        return null;
    }

    @Override
    public void searchByID(int ID) {
        for (int i = 0; i < list.size(); i++) {
            int searchID = list.get(i).getID();
            if (searchID == ID) {
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("Ko tìm thấy sản phẩm có ID như yêu cầu");
    }

    @Override
    public void searchByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            String searchName = list.get(i).getName();
            if (searchName == name) {
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("Ko tìm thấy sản phẩm có tên như yêu cầu");
    }

    @Override
    public void displayProductAscendingPrice () {
        Collections.sort(list, new SortProductByPrice());
        for (Product item : list) {
            System.out.println(item.toString());
        }
    }


    public void showAllProduct(){
        for (E e : list) {
            System.out.println(e.toString());
        }
    }
}
