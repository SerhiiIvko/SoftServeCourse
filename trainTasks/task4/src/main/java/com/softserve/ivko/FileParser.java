package com.softserve.ivko;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class FileParser {

    int parseFile(String path, String searchString, String replaceString) throws IOException {
        int replaceCount = 0;
        Path filePath = Paths.get(path);
        Charset charset = StandardCharsets.UTF_8;
        String content = new String(Files.readAllBytes(filePath), charset);
        while (content.contains(searchString)){
            replaceCount++;
            content = content.replace(searchString, replaceString);
        }
        Files.write(filePath, content.getBytes(charset));
        return replaceCount;
    }

    int getCountOfMatches(String path, String search) throws IOException {
        File file = new File(path);
        int lineNum = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(search)) {
                lineNum++;
            }
        }
        return lineNum;
    }
}