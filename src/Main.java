public class Main {
    public static void main(String[] args) {
        int soldProduct[] = {10, 20, 30, 40, 50};

        SalesManager salesManager = new SalesManager(soldProduct);
        salesManager.max();

        System.out.print("Статистика продаж: ");
        System.out.println(salesManager.max());

    }

}
