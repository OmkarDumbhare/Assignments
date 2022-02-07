package com.company;
    abstract class Persistence {
        abstract public String persist();
    }
    class FilePersistence extends Persistence{
        @Override
        public String persist() {
            return "File persistence class called";
        }
    }
    class DatabasePersistence extends Persistence{
        @Override
        public String persist() {
            return "Database persistence class called";
        }
    }

public class Assignment2Q6 {
    public static void main(String[] args) {
        Persistence p =new FilePersistence();
        System.out.println(p.persist());
        Persistence q =new DatabasePersistence();
        System.out.println(q.persist());
    }
}
