public class ExchangeRate {
    public static void main(String[] args) {

        Banks bank = new Banks();

        double[] value = bank.value;
        String[] nameBanks = bank.nameBanks;

        double max = 0;
        int i = 0;

        for (; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }

        System.out.println("Найвигідніший курс для обміну долларів на гривні 1:" + max);
        System.out.println("Такий курс доступний у наступних банках:");

        for (i = 0; i < value.length; i++) {
            if (value[i] == max) {
                System.out.println(nameBanks[i]);
            }
        }
    }
}
