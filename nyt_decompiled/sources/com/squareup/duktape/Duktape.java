package com.squareup.duktape;

import java.io.Closeable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class Duktape implements Closeable {
    private long context;

    static {
        System.loadLibrary("duktape");
    }

    private Duktape(long j) {
        this.context = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native Object call(long j, long j2, Object obj, Object[] objArr);

    public static Duktape create() {
        long createContext = createContext();
        if (createContext != 0) {
            return new Duktape(createContext);
        }
        throw new OutOfMemoryError("Cannot create Duktape instance");
    }

    private static native long createContext();

    private native void destroyContext(long j);

    private native Object evaluate(long j, String str, String str2);

    private native long get(long j, String str, Object[] objArr);

    private native void set(long j, String str, Object obj, Object[] objArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        long j = this.context;
        if (j != 0) {
            this.context = 0L;
            destroyContext(j);
        }
    }

    public synchronized Object evaluate(String str, String str2) {
        return evaluate(this.context, str, str2);
    }

    protected synchronized void finalize() {
        if (this.context != 0) {
            Logger.getLogger(Duktape.class.getName()).warning("Duktape instance leaked!");
        }
    }

    public synchronized <T> T get(final String str, final Class<T> cls) {
        final long j;
        try {
            if (!cls.isInterface()) {
                throw new UnsupportedOperationException("Only interfaces can be proxied. Received: " + cls);
            }
            if (cls.getInterfaces().length > 0) {
                throw new UnsupportedOperationException(cls + " must not extend other interfaces");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Method method : cls.getMethods()) {
                if (linkedHashMap.put(method.getName(), method) != null) {
                    throw new UnsupportedOperationException(method.getName() + " is overloaded in " + cls);
                }
            }
            j = get(this.context, str, linkedHashMap.values().toArray());
        } catch (Throwable th) {
            throw th;
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.squareup.duktape.Duktape.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                Object call;
                if (method2.getDeclaringClass() == Object.class) {
                    return method2.invoke(this, objArr);
                }
                synchronized (this) {
                    call = Duktape.this.call(this.context, j, method2, objArr);
                }
                return call;
            }

            public String toString() {
                return String.format("DuktapeProxy{name=%s, type=%s}", str, cls.getName());
            }
        });
    }

    public synchronized <T> void set(String str, Class<T> cls, T t) {
        try {
            if (!cls.isInterface()) {
                throw new UnsupportedOperationException("Only interfaces can be bound. Received: " + cls);
            }
            if (cls.getInterfaces().length > 0) {
                throw new UnsupportedOperationException(cls + " must not extend other interfaces");
            }
            if (!cls.isInstance(t)) {
                throw new IllegalArgumentException(t.getClass() + " is not an instance of " + cls);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Method method : cls.getMethods()) {
                if (linkedHashMap.put(method.getName(), method) != null) {
                    throw new UnsupportedOperationException(method.getName() + " is overloaded in " + cls);
                }
            }
            set(this.context, str, t, linkedHashMap.values().toArray());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object evaluate(String str) {
        return evaluate(this.context, str, "?");
    }
}
