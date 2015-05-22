package com.ds;

class Singleton {

    private static Singleton mSingleton = null;
    String dBName;
    String dBUri;
    String dbUser;
    //2 types of locks 1.Intrinsic 2.Class lock

    public static Singleton getSingletonInstance () {
        if ( null == mSingleton) {
            synchronized (Singleton.class) {
                if ( null == mSingleton) {
                    mSingleton = new Singleton ();
                }
            }
        }
        return mSingleton;
    }


    public synchronized static Singleton getSingletonInstanceExp () {
        if ( null == mSingleton) {
            mSingleton = new Singleton ();
        }
        return mSingleton;
    }

    private Singleton () {

    }
}


