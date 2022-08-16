public class Main {
    public static void main(String[] args) {

        long soldProduct[] = {10, 2, 30, 100, 50, 23, 45};


        SalesManager salesManager = new SalesManager(soldProduct);
        salesManager.max();

        System.out.print("Статистика продаж: ");
        System.out.println("Максимальная продажа: " + salesManager.max());
        System.out.println("Минимальная продажа: " + salesManager.min());

        System.out.println("Среднее количество продаж: " + salesManager.avgTrimmed());

    }

}
