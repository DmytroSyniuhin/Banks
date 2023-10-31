public class Banks {
    double[] value = initializeArrayDouble(14);
    String[] nameBanks = new String[]{"ПРИВАТБАНК", "Сенс Банк", "Сітібанк", "ІНГ Банк Україна", "Ощадбанк", "Укрексімбанк", "УКРГАЗБАНК",
            "Райффайзен Банк", "УКРСИББАНК", "ПУМБ", "КРЕДІ АГРІКОЛЬ БАНК", "Південний", "КРЕДОБАНК", "Банк Восток"};
    public static double[] initializeArrayDouble(int a) {

        double[] initializeArrayDouble = new double[a];
        for (int i = 0; i < initializeArrayDouble.length; i++) {
            initializeArrayDouble[i] = 35 + Math.random() * 5;
        }

        return initializeArrayDouble;
    }
}

