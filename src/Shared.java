
public class Shared {

        private int mCount;
        
        Shared () {
            mCount = 0;
        }

        public void increment () {
            mCount++;
        }

        public void decrement () {
            mCount--;
        }

        public int getValue() {
            return mCount;
        }

        public synchronized void safeIncrement () {
            mCount++;
        }

        public synchronized void safeDecerement() {
            mCount--;
        }

        public synchronized int safetGetValue () {
            return mCount;
        }



}
