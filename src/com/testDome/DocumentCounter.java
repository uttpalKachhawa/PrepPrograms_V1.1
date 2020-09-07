package com.testDome;

/**
 * @author 703238043 on Jul, 2020
 */
public class DocumentCounter {

    public static class Counter {
        private int count = 0;
        private int increment;

        public Counter(int increment) {
            this.increment = increment;
        }

        public int getAndIncrement() {
            this.count += this.increment;
            return this.count;
        }

    }

    public static class DocumentNameCreator  {
        private String prefix;
        private Counter counter;
        private DocumentNameCreator(String prefix,Counter counter) {
            this.prefix = prefix;
            this.counter=counter;
        }

        public String getNewDocumentName(Counter counter) {
            return prefix + counter.getAndIncrement();
        }
    }
}
