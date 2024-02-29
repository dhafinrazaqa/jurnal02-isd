public class Main {
    public static void main(String[] args) {
        ListBarang list = new ListBarang();
        ListBarang list2 = new ListBarang();

        list.addItem(new ATK("A001", "Pencil", "Evil Pencil", 20));
        list.addItem(new ATK("A002", "Pulpen", "Pulpen Biru", 15));
        list.addItem(new ATK("A003", "Spidol", "Spidol Biru", 10));
        list.addItem(new ATK("B001", "Buku Tulis", "Sidu", 10));
        list.addItem(new ATK("B002", "Kertas", "HVS", 25));

        list2.addItem(new Bag("C001", "Tempat Pencil", "Evil Tempat Pencil", 20));
        list2.addItem(new Bag("C002", "Tas", "Tas 1", 5));
        list2.addItem(new Bag("C003", "Tas", "Tas 2", 5));
        list2.addItem(new Bag("C005", "Tas", "Tas 4", 5));
        list2.addItem(new Bag("C004", "Tas", "Tas 3", 5));

        list2.removeItem(0);
        list2.editItem(0, new Bag("C001", "Tempat Pencil", "Evil Tempat Pencil 2", 20));

        list.print();
        list2.print();
    }
}
