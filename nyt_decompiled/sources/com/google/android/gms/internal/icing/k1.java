package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class k1 {
    private static final Unsafe a;
    private static final Class b;
    private static final boolean c;
    private static final boolean d;
    private static final j1 e;
    private static final boolean f;
    private static final boolean g;
    static final long h;
    static final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    static {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.k1.<clinit>():void");
    }

    static /* synthetic */ boolean A(Object obj, long j) {
        return ((byte) ((e.k(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean B(Object obj, long j) {
        return ((byte) ((e.k(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    private static int E(Class cls) {
        if (g) {
            return e.i(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (g) {
            return e.j(cls);
        }
        return -1;
    }

    private static Field b() {
        int i2 = h.a;
        Field c2 = c(Buffer.class, "effectiveDirectAddress");
        if (c2 != null) {
            return c2;
        }
        Field c3 = c(Buffer.class, "address");
        if (c3 == null || c3.getType() != Long.TYPE) {
            return null;
        }
        return c3;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        j1 j1Var = e;
        int k = j1Var.k(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        j1Var.l(obj, j2, ((255 & b2) << i2) | (k & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        j1 j1Var = e;
        int i2 = (((int) j) & 3) << 3;
        j1Var.l(obj, j2, ((255 & b2) << i2) | (j1Var.k(obj, j2) & (~(255 << i2))));
    }

    static boolean f() {
        return g;
    }

    static boolean g() {
        return f;
    }

    static Object h(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static int i(Object obj, long j) {
        return e.k(obj, j);
    }

    static void j(Object obj, long j, int i2) {
        e.l(obj, j, i2);
    }

    static long k(Object obj, long j) {
        return e.m(obj, j);
    }

    static void l(Object obj, long j, long j2) {
        e.n(obj, j, j2);
    }

    static boolean m(Object obj, long j) {
        return e.b(obj, j);
    }

    static void n(Object obj, long j, boolean z) {
        e.c(obj, j, z);
    }

    static float o(Object obj, long j) {
        return e.d(obj, j);
    }

    static void p(Object obj, long j, float f2) {
        e.e(obj, j, f2);
    }

    static double q(Object obj, long j) {
        return e.f(obj, j);
    }

    static void r(Object obj, long j, double d2) {
        e.g(obj, j, d2);
    }

    static Object s(Object obj, long j) {
        return e.o(obj, j);
    }

    static void t(Object obj, long j, Object obj2) {
        e.p(obj, j, obj2);
    }

    static void u(byte[] bArr, long j, byte b2) {
        e.a(bArr, h + j, b2);
    }

    static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new g1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean w(Class cls) {
        int i2 = h.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ void x(Throwable th) {
        Logger logger = Logger.getLogger(k1.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }
}
