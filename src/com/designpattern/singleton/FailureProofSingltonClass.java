package com.designpattern.singleton;

import java.io.Serializable;

public class FailureProofSingltonClass implements Serializable, Cloneable {

    private static volatile FailureProofSingltonClass sSoleInstance;

    private FailureProofSingltonClass() {
        if (sSoleInstance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static FailureProofSingltonClass getInstance() {
        if (sSoleInstance == null) {
            synchronized (FailureProofSingltonClass.class) {
                if (sSoleInstance == null) {
                    sSoleInstance = new FailureProofSingltonClass();
                }
            }
        }
        return sSoleInstance;
    }

    protected FailureProofSingltonClass readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
