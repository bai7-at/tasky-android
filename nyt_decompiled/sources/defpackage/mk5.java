package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class mk5 {
    private static final b e = new a();
    private final Object a;
    private final b b;
    private final String c;
    private volatile byte[] d;

    class a implements b {
        a() {
        }

        @Override // mk5.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private mk5(String str, Object obj, b bVar) {
        this.c = z06.b(str);
        this.a = obj;
        this.b = (b) z06.d(bVar);
    }

    public static mk5 a(String str, Object obj, b bVar) {
        return new mk5(str, obj, bVar);
    }

    private static b b() {
        return e;
    }

    private byte[] d() {
        if (this.d == null) {
            this.d = this.c.getBytes(ov3.a);
        }
        return this.d;
    }

    public static mk5 e(String str) {
        return new mk5(str, null, b());
    }

    public static mk5 f(String str, Object obj) {
        return new mk5(str, obj, b());
    }

    public Object c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof mk5) {
            return this.c.equals(((mk5) obj).c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.c + "'}";
    }
}
