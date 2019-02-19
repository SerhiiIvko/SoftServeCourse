package com.softserve.ivko;

class ConvertRunner {
    void runApp(){
        ConsoleReader reader = new ConsoleReader();
        ConvertComparator convertComparator = new ConvertComparator();
        if(convertComparator.isConvertCanBeInner(reader)){
            System.out.println("true");
        }
    }
}
