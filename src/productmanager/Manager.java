package productmanager;

public interface Manager<E> {
    void add(int ID, String name, int price, boolean status, String description );
    void edit(int ID, String name, int price, boolean status, String description);
    E deleteByID(int ID);
    E deleteByName(String name);
    String searchByID(int ID);
    String searchByName(String name);
    void displayProductAscendingPrice();
}
