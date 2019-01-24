package com.softserve.ivko;

import java.io.File;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class FileParser{


    String parseFile(Path path, String search){
        File file = new File(String.valueOf(path));
        int countMatches = 0;
        Pattern pattern = Pattern.compile(search);
//        if (pattern.matcher(search.toCharArray()))
        return null;
    }

    String parseFile(Path path, String search, String replace){
//        File file = new File();

        return null;
    }
}