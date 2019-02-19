package com.softserve.ivko;

import java.io.IOException;

class ParserRunner {

    void runApplication(String[] params) throws IOException, IllegalArgumentException {
        ParamsHandler paramsHandler = new ParamsHandler();
        params = paramsHandler.handleParams(params);
        if (ArgsValidator.isArgsValid(params)) {
            FileParser parser = new FileParser();
            if (params.length == 2) {
                String path = params[0];
                String search = params[1];
                int count = parser.getCountOfMatches(path, search);
                ConsoleMessages.printMessage(ConsoleMessages.STRING_MESSAGE
                        + search
                        + ConsoleMessages.FOUND_MESSAGE
                        + count
                        + ConsoleMessages.COUNT_MESSAGE1);
            }
            if (params.length == 3) {
                String path = params[0];
                String search = params[1];
                String replace = params[2];
                int replacedStringsCount = parser.parseFile(path, search, replace);
                ConsoleMessages.printMessage(ConsoleMessages.STRING_MESSAGE
                        + search
                        + ConsoleMessages.REPLACED_MESSAGE
                        + replace
                        + ConsoleMessages.BRAKE_MESSAGE1
                        + replacedStringsCount
                        + ConsoleMessages.COUNT_MESSAGE2);
            }
        }
    }
}