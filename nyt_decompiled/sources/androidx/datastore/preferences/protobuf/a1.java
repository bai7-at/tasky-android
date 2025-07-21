package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class a1 {
    private static final Logger a = Logger.getLogger(a1.class.getName());
    private static final Unsafe b = B();
    private static final Class c = androidx.datastore.preferences.protobuf.d.b();
    private static final boolean d = m(Long.TYPE);
    private static final boolean e = m(Integer.TYPE);
    private static final e f = z();
    private static final boolean g = Q();
    private static final boolean h = P();
    static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final long v;
    private static final int w;
    static final boolean x;

    static class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public boolean c(Object obj, long j) {
            return a1.x ? a1.q(obj, j) : a1.r(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public byte d(Object obj, long j) {
            return a1.x ? a1.t(obj, j) : a1.u(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void k(Object obj, long j, boolean z) {
            if (a1.x) {
                a1.F(obj, j, z);
            } else {
                a1.G(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void l(Object obj, long j, byte b) {
            if (a1.x) {
                a1.I(obj, j, b);
            } else {
                a1.J(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void n(Object obj, long j, float f) {
            o(obj, j, Float.floatToIntBits(f));
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public boolean c(Object obj, long j) {
            return a1.x ? a1.q(obj, j) : a1.r(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public byte d(Object obj, long j) {
            return a1.x ? a1.t(obj, j) : a1.u(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void k(Object obj, long j, boolean z) {
            if (a1.x) {
                a1.F(obj, j, z);
            } else {
                a1.G(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void l(Object obj, long j, byte b) {
            if (a1.x) {
                a1.I(obj, j, b);
            } else {
                a1.J(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void n(Object obj, long j, float f) {
            o(obj, j, Float.floatToIntBits(f));
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public boolean c(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public byte d(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public double e(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public float f(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void k(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void l(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void m(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // androidx.datastore.preferences.protobuf.a1.e
        public void n(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }
    }

    private static abstract class e {
        Unsafe a;

        e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j);

        public abstract byte d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract float f(Object obj, long j);

        public final int g(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final Object i(Object obj, long j) {
            return this.a.getObject(obj, j);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j, boolean z);

        public abstract void l(Object obj, long j, byte b);

        public abstract void m(Object obj, long j, double d);

        public abstract void n(Object obj, long j, float f);

        public final void o(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void p(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void q(Object obj, long j, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }
    }

    static {
        long j2 = j(byte[].class);
        i = j2;
        j = j(boolean[].class);
        k = k(boolean[].class);
        l = j(int[].class);
        m = k(int[].class);
        n = j(long[].class);
        o = k(long[].class);
        p = j(float[].class);
        q = k(float[].class);
        r = j(double[].class);
        s = k(double[].class);
        t = j(Object[].class);
        u = k(Object[].class);
        v = o(l());
        w = (int) (j2 & 7);
        x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static Object A(Object obj, long j2) {
        return f.i(obj, j2);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return h;
    }

    static boolean D() {
        return g;
    }

    static void E(Object obj, long j2, boolean z) {
        f.k(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j2, boolean z) {
        I(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j2, boolean z) {
        J(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j2, byte b2) {
        f.l(bArr, i + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int x2 = x(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (x2 & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (x(obj, j3) & (~(255 << i2))));
    }

    static void K(Object obj, long j2, double d2) {
        f.m(obj, j2, d2);
    }

    static void L(Object obj, long j2, float f2) {
        f.n(obj, j2, f2);
    }

    static void M(Object obj, long j2, int i2) {
        f.o(obj, j2, i2);
    }

    static void N(Object obj, long j2, long j3) {
        f.p(obj, j2, j3);
    }

    static void O(Object obj, long j2, Object obj2) {
        f.q(obj, j2, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (androidx.datastore.preferences.protobuf.d.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (androidx.datastore.preferences.protobuf.d.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static Object i(Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int j(Class cls) {
        if (h) {
            return f.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (h) {
            return f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n2;
        if (androidx.datastore.preferences.protobuf.d.c() && (n2 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n2;
        }
        Field n3 = n(Buffer.class, "address");
        if (n3 == null || n3.getType() != Long.TYPE) {
            return null;
        }
        return n3;
    }

    private static boolean m(Class cls) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class cls2 = c;
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

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j2) {
        return f.c(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j2) {
        return t(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j2) {
        return u(obj, j2) != 0;
    }

    static byte s(byte[] bArr, long j2) {
        return f.d(bArr, i + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j2) {
        return (byte) ((x(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j2) {
        return (byte) ((x(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j2) {
        return f.e(obj, j2);
    }

    static float w(Object obj, long j2) {
        return f.f(obj, j2);
    }

    static int x(Object obj, long j2) {
        return f.g(obj, j2);
    }

    static long y(Object obj, long j2) {
        return f.h(obj, j2);
    }

    private static e z() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (d) {
            return new c(unsafe);
        }
        if (e) {
            return new b(unsafe);
        }
        return null;
    }
}
