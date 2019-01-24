package task2;

public class WordsContainer {
    private String[] hundreds =
             {"Сто", "Двести", "Триста", "Четыреста", "Пятьсот", "Шестьсот", "Семьсот", "Восемьсот", "Девятьсот"};
    private String[] tens =
             {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private String[] ones =
             {"один", "два", "три ", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    private String[] dozens =
            {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
                    "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

    public String[] getHundreds() {
        return hundreds;
    }

    public String[] getTens() {
        return tens;
    }

    public String[] getOnes() {
        return ones;
    }

    public String[] getDozens() {
        return dozens;
    }
}