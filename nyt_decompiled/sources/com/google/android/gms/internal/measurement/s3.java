package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class s3 {
    private static final Unsafe a;
    private static final Class b;
    private static final boolean c;
    private static final r3 d;
    private static final boolean e;
    private static final boolean f;
    static final long g;
    static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s3.<clinit>():void");
    }

    static boolean A(Class cls) {
        int i = r1.a;
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

    static boolean B(Object obj, long j) {
        return d.g(obj, j);
    }

    static boolean C() {
        return f;
    }

    static boolean D() {
        return e;
    }

    private static int E(Class cls) {
        if (f) {
            return d.h(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f) {
            return d.i(cls);
        }
        return -1;
    }

    private static Field b() {
        int i = r1.a;
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
        r3 r3Var = d;
        int j3 = r3Var.j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        r3Var.n(obj, j2, ((255 & b2) << i) | (j3 & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        r3 r3Var = d;
        int i = (((int) j) & 3) << 3;
        r3Var.n(obj, j2, ((255 & b2) << i) | (r3Var.j(obj, j2) & (~(255 << i))));
    }

    static double f(Object obj, long j) {
        return d.a(obj, j);
    }

    static float g(Object obj, long j) {
        return d.b(obj, j);
    }

    static int h(Object obj, long j) {
        return d.j(obj, j);
    }

    static long i(Object obj, long j) {
        return d.k(obj, j);
    }

    static Object j(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object k(Object obj, long j) {
        return d.m(obj, j);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o3());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(s3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j, boolean z) {
        d.c(obj, j, z);
    }

    static void s(byte[] bArr, long j, byte b2) {
        d.d(bArr, g + j, b2);
    }

    static void t(Object obj, long j, double d2) {
        d.e(obj, j, d2);
    }

    static void u(Object obj, long j, float f2) {
        d.f(obj, j, f2);
    }

    static void v(Object obj, long j, int i) {
        d.n(obj, j, i);
    }

    static void w(Object obj, long j, long j2) {
        d.o(obj, j, j2);
    }

    static void x(Object obj, long j, Object obj2) {
        d.p(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j) {
        return ((byte) ((d.j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j) {
        return ((byte) ((d.j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
