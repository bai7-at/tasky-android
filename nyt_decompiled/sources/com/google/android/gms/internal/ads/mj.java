package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class mj {
    private static final Unsafe a;
    private static final Class b;
    private static final boolean c;
    private static final lj d;
    private static final boolean e;
    private static final boolean f;
    static final long g;
    private static final long h;
    static final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:15:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    static {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mj.<clinit>():void");
    }

    static void A(Object obj, long j, float f2) {
        d.h(obj, j, f2);
    }

    static void B(Object obj, long j, int i2) {
        d.a.putInt(obj, j, i2);
    }

    static void C(Object obj, long j, long j2) {
        d.a.putLong(obj, j, j2);
    }

    static void D(Object obj, long j, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean E(Object obj, long j) {
        return ((byte) ((d.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean F(Object obj, long j) {
        return ((byte) ((d.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static boolean G(Class cls) {
        int i2 = ug.a;
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

    static boolean H(Object obj, long j) {
        return d.i(obj, j);
    }

    static boolean a() {
        return f;
    }

    static boolean b() {
        return e;
    }

    private static int c(Class cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int d(Class cls) {
        if (f) {
            return d.a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field e() {
        int i2 = ug.a;
        Field f2 = f(Buffer.class, "effectiveDirectAddress");
        if (f2 != null) {
            return f2;
        }
        Field f3 = f(Buffer.class, "address");
        if (f3 == null || f3.getType() != Long.TYPE) {
            return null;
        }
        return f3;
    }

    private static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j, byte b2) {
        lj ljVar = d;
        long j2 = (-4) & j;
        int i2 = ljVar.a.getInt(obj, j2);
        int i3 = ((~((int) j)) & 3) << 3;
        ljVar.a.putInt(obj, j2, ((255 & b2) << i3) | (i2 & (~(255 << i3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Object obj, long j, byte b2) {
        lj ljVar = d;
        long j2 = (-4) & j;
        int i2 = (((int) j) & 3) << 3;
        ljVar.a.putInt(obj, j2, ((255 & b2) << i2) | (ljVar.a.getInt(obj, j2) & (~(255 << i2))));
    }

    static byte i(long j) {
        return d.a(j);
    }

    static double j(Object obj, long j) {
        return d.b(obj, j);
    }

    static float k(Object obj, long j) {
        return d.c(obj, j);
    }

    static int l(Object obj, long j) {
        return d.a.getInt(obj, j);
    }

    static long m(ByteBuffer byteBuffer) {
        lj ljVar = d;
        return ljVar.a.getLong(byteBuffer, h);
    }

    static long n(Object obj, long j) {
        return d.a.getLong(obj, j);
    }

    static Object o(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object p(Object obj, long j) {
        return d.a.getObject(obj, j);
    }

    static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ij());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void r(Throwable th) {
        Logger.getLogger(mj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void w(long j, byte[] bArr, long j2, long j3) {
        d.d(j, bArr, j2, j3);
    }

    static void x(Object obj, long j, boolean z) {
        d.e(obj, j, z);
    }

    static void y(byte[] bArr, long j, byte b2) {
        d.f(bArr, g + j, b2);
    }

    static void z(Object obj, long j, double d2) {
        d.g(obj, j, d2);
    }
}
