public class Main {
    public static void main(String[] args) {
        int initialScore = 100; // Начальное состояние счета
        int addMoney = 1100; // Пополнение счета
        int priceBonus = 100; // Бонус
        int totalBonus = (addMoney - priceBonus) / priceBonus; // Расчет бонуса

        if (addMoney > 100) {
            initialScore = (initialScore + addMoney + totalBonus + 1);
        } else {
            initialScore = initialScore + addMoney;
        }
        System.out.println("Сумма пополнения - " + addMoney);
        System.out.println("Бонус составил - " + (totalBonus + 1));
        System.out.println("Итоговая сумма - " + initialScore);
    }
}