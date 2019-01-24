package task2;

public class NumberParserImpl implements INumberParser {

    public String parseNumber(long number) {
        WordsContainer container = new WordsContainer();
        String name = "";
        String tensName = "";
        String onesName = "";
        String hundredsName = "";
        if (number == 0) {
            name = "Ноль";
        }
        if (number % 10 <= 9) {
            for (int i = 0; i < container.getOnes().length; i++) {
                if (number == i + 1) {
                    name = container.getOnes()[i];
                }
            }
        }
        if (number > 9 && number < 20) {
            for (int i = 0; i < container.getDozens().length; i++) {
                if (number % 10 == i) {
                    name = container.getDozens()[i];
                }
            }
        }
        if (number > 19 && number <= 99) {
            for (int i = 0; i < container.getTens().length; i++) {
                if (number / 10 == i + 2) {
                    tensName = container.getTens()[i];
                }
                for (int j = 0; j < container.getOnes().length; j++) {
                    if (number % 10 == j + 1) {
                        onesName = container.getOnes()[j];
                    }
                }
                name = tensName + " " + onesName;
//                name = tensName.concat(onesName);
            }
        }
        if (number > 99 && number <= 999) {
            for (int i = 0; i < container.getHundreds().length; i++) {
                if (number / 100 == i + 1) {
                    hundredsName = container.getHundreds()[i];
                }
            }
            for (int i = 0; i < container.getTens().length; i++) {
                if ((number / 10) % 10 == i + 2) {
                    tensName = container.getTens()[i];
                }
                for (int j = 0; j < container.getOnes().length; j++) {
                    if (number % 10 == j + 1) {
                        onesName = container.getOnes()[j];
                    }
                }
            }
            name = hundredsName + " " + tensName + " " + onesName;
//            name = hundredsName.concat(tensName.concat(onesName));
        }
        return name;
    }


}