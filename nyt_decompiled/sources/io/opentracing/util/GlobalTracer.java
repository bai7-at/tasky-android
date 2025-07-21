package io.opentracing.util;

import defpackage.dp2;
import defpackage.hp8;
import defpackage.tx7;
import defpackage.wx7;
import defpackage.y85;
import defpackage.yb7;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class GlobalTracer implements hp8 {
    private static final GlobalTracer a = new GlobalTracer();
    private static volatile hp8 b = y85.a();
    private static volatile boolean c = false;

    static class a implements Callable {
        final /* synthetic */ hp8 a;

        a(hp8 hp8Var) {
            this.a = hp8Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public hp8 call() {
            return this.a;
        }
    }

    private GlobalTracer() {
    }

    public static hp8 a() {
        return a;
    }

    public static synchronized boolean b(hp8 hp8Var) {
        boolean d;
        synchronized (GlobalTracer.class) {
            h(hp8Var, "Cannot register GlobalTracer. Tracer is null");
            d = d(new a(hp8Var));
        }
        return d;
    }

    public static synchronized boolean d(Callable callable) {
        synchronized (GlobalTracer.class) {
            h(callable, "Cannot register GlobalTracer from provider <null>.");
            if (!isRegistered()) {
                try {
                    try {
                        hp8 hp8Var = (hp8) h(callable.call(), "Cannot register GlobalTracer <null>.");
                        if (!(hp8Var instanceof GlobalTracer)) {
                            b = hp8Var;
                            c = true;
                            return true;
                        }
                    } catch (Exception e) {
                        throw new IllegalStateException("Exception obtaining tracer from provider: " + e.getMessage(), e);
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            return false;
        }
    }

    private static Object h(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean isRegistered() {
        return c;
    }

    @Override // defpackage.hp8
    public hp8.a I(String str) {
        return b.I(str);
    }

    @Override // defpackage.hp8
    public wx7 R0(dp2 dp2Var, Object obj) {
        return b.R0(dp2Var, obj);
    }

    @Override // defpackage.hp8, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b.close();
    }

    @Override // defpackage.hp8
    public yb7 k1(tx7 tx7Var) {
        return b.k1(tx7Var);
    }

    @Override // defpackage.hp8
    public tx7 n() {
        return b.n();
    }

    @Override // defpackage.hp8
    public void n1(wx7 wx7Var, dp2 dp2Var, Object obj) {
        b.n1(wx7Var, dp2Var, obj);
    }

    public String toString() {
        return GlobalTracer.class.getSimpleName() + '{' + b + '}';
    }
}
