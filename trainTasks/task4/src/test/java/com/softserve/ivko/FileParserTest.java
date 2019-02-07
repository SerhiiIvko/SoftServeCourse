package com.softserve.ivko;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class FileParserTest {
    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder();

    @Test
    public void parseFile() {

    }

    @Test
    public void getCountOfMatches() throws IOException {
        //GIVEN:
        File tempFile = testFolder.newFile("file.txt");
        File tempFolder = testFolder.newFolder("folder");

        //WHEN:


        //THEN:

    }
}