package com.comscore.util.cpp;

import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;

/* loaded from: classes2.dex */
public abstract class CppJavaBinder {
    private int a = 0;

    static {
        Setup.setUp();
    }

    protected abstract void destroyCppObject();

    protected void finalize() throws Throwable {
        super.finalize();
        destroyCppObject();
    }

    protected int getExceptionCounter() {
        return this.a;
    }

    protected void printException(Throwable th) {
        Logger.e("Error using the native library: ", th);
        this.a++;
    }
}
