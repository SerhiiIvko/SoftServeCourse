package com.softserve.ivko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ParamsHandler {
    private final static String PARAMS_DELIMITER = "-D";

    String[] handleParams(String[] args) throws IllegalArgumentException {
        List<String> params = new ArrayList<>();
        int index = 0;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            if (index < args.length && !args[index].equals(PARAMS_DELIMITER)) {
                stringBuilder.append(args[index]).append(" ");
            } else if (index > 0) {
                params.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
            index++;
        } while (index <= args.length);
        System.out.println(Arrays.toString(params.toArray(new String[0])));
        return params.toArray(new String[0]);
    }
}