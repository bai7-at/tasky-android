package okio;

import defpackage.ad0;
import defpackage.an9;
import defpackage.c;
import defpackage.p;
import defpackage.zq3;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final a c = new a(null);
    public static final ByteString d = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private transient int a;
    private transient String b;
    private final byte[] data;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ByteString f(a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = p.c();
            }
            return aVar.e(bArr, i, i2);
        }

        public final ByteString a(String str) {
            zq3.h(str, "<this>");
            byte[] a = okio.a.a(str);
            if (a != null) {
                return new ByteString(a);
            }
            return null;
        }

        public final ByteString b(String str) {
            int e;
            int e2;
            zq3.h(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                e = c.e(str.charAt(i2));
                e2 = c.e(str.charAt(i2 + 1));
                bArr[i] = (byte) ((e << 4) + e2);
            }
            return new ByteString(bArr);
        }

        public final ByteString c(String str, Charset charset) {
            zq3.h(str, "<this>");
            zq3.h(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            zq3.g(bytes, "getBytes(...)");
            return new ByteString(bytes);
        }

        public final ByteString d(String str) {
            zq3.h(str, "<this>");
            ByteString byteString = new ByteString(an9.a(str));
            byteString.B(str);
            return byteString;
        }

        public final ByteString e(byte[] bArr, int i, int i2) {
            zq3.h(bArr, "<this>");
            int f = p.f(bArr, i2);
            p.b(bArr.length, i, f);
            return new ByteString(d.p(bArr, i, f + i));
        }

        public final ByteString g(InputStream inputStream, int i) {
            zq3.h(inputStream, "<this>");
            if (i < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    throw new EOFException();
                }
                i2 += read;
            }
            return new ByteString(bArr);
        }

        private a() {
        }
    }

    public ByteString(byte[] bArr) {
        zq3.h(bArr, "data");
        this.data = bArr;
    }

    public static /* synthetic */ ByteString H(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = p.c();
        }
        return byteString.G(i, i2);
    }

    public static final ByteString c(String str) {
        return c.b(str);
    }

    public static final ByteString e(String str) {
        return c.d(str);
    }

    public static /* synthetic */ int q(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return byteString.o(byteString2, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString g = c.g(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, g.data);
    }

    public static /* synthetic */ int w(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = p.c();
        }
        return byteString.u(byteString2, i);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public final void A(int i) {
        this.a = i;
    }

    public final void B(String str) {
        this.b = str;
    }

    public final ByteString C() {
        return d("SHA-1");
    }

    public final ByteString D() {
        return d("SHA-256");
    }

    public final int E() {
        return k();
    }

    public final boolean F(ByteString byteString) {
        zq3.h(byteString, "prefix");
        return y(0, byteString, 0, byteString.E());
    }

    public ByteString G(int i, int i2) {
        int e = p.e(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (e <= i().length) {
            if (e - i >= 0) {
                return (i == 0 && e == i().length) ? this : new ByteString(d.p(i(), i, e));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + i().length + ')').toString());
    }

    public ByteString I() {
        for (int i = 0; i < i().length; i++) {
            byte b = i()[i];
            if (b >= 65 && b <= 90) {
                byte[] i2 = i();
                byte[] copyOf = Arrays.copyOf(i2, i2.length);
                zq3.g(copyOf, "copyOf(...)");
                copyOf[i] = (byte) (b + 32);
                for (int i3 = i + 1; i3 < copyOf.length; i3++) {
                    byte b2 = copyOf[i3];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i3] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public byte[] J() {
        byte[] i = i();
        byte[] copyOf = Arrays.copyOf(i, i.length);
        zq3.g(copyOf, "copyOf(...)");
        return copyOf;
    }

    public String K() {
        String l = l();
        if (l != null) {
            return l;
        }
        String c2 = an9.c(s());
        B(c2);
        return c2;
    }

    public void L(ad0 ad0Var, int i, int i2) {
        zq3.h(ad0Var, "buffer");
        c.d(this, ad0Var, i, i2);
    }

    public String a() {
        return okio.a.c(i(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            defpackage.zq3.h(r10, r0)
            int r0 = r9.E()
            int r1 = r10.E()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public ByteString d(String str) {
        zq3.h(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, E());
        byte[] digest = messageDigest.digest();
        zq3.e(digest);
        return new ByteString(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.E() == i().length && byteString.z(0, i(), 0, i().length)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(ByteString byteString) {
        zq3.h(byteString, "suffix");
        return y(E() - byteString.E(), byteString, 0, byteString.E());
    }

    public final byte g(int i) {
        return t(i);
    }

    public int hashCode() {
        int j = j();
        if (j != 0) {
            return j;
        }
        int hashCode = Arrays.hashCode(i());
        A(hashCode);
        return hashCode;
    }

    public final byte[] i() {
        return this.data;
    }

    public final int j() {
        return this.a;
    }

    public int k() {
        return i().length;
    }

    public final String l() {
        return this.b;
    }

    public String n() {
        char[] cArr = new char[i().length * 2];
        int i = 0;
        for (byte b : i()) {
            int i2 = i + 1;
            cArr[i] = c.f()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = c.f()[b & 15];
        }
        return h.p(cArr);
    }

    public final int o(ByteString byteString, int i) {
        zq3.h(byteString, "other");
        return p(byteString.s(), i);
    }

    public int p(byte[] bArr, int i) {
        zq3.h(bArr, "other");
        int length = i().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!p.a(i(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] s() {
        return i();
    }

    public byte t(int i) {
        return i()[i];
    }

    public String toString() {
        int c2;
        if (i().length == 0) {
            return "[size=0]";
        }
        c2 = c.c(i(), 64);
        if (c2 != -1) {
            String K = K();
            String substring = K.substring(0, c2);
            zq3.g(substring, "substring(...)");
            String F = h.F(h.F(h.F(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (c2 >= K.length()) {
                return "[text=" + F + ']';
            }
            return "[size=" + i().length + " text=" + F + "…]";
        }
        if (i().length <= 64) {
            return "[hex=" + n() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(i().length);
        sb.append(" hex=");
        ByteString byteString = this;
        int e = p.e(byteString, 64);
        if (e > i().length) {
            throw new IllegalArgumentException(("endIndex > length(" + i().length + ')').toString());
        }
        if (e < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (e != i().length) {
            byteString = new ByteString(d.p(i(), 0, e));
        }
        sb.append(byteString.n());
        sb.append("…]");
        return sb.toString();
    }

    public final int u(ByteString byteString, int i) {
        zq3.h(byteString, "other");
        return v(byteString.s(), i);
    }

    public int v(byte[] bArr, int i) {
        zq3.h(bArr, "other");
        for (int min = Math.min(p.e(this, i), i().length - bArr.length); -1 < min; min--) {
            if (p.a(i(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public final ByteString x() {
        return d("MD5");
    }

    public boolean y(int i, ByteString byteString, int i2, int i3) {
        zq3.h(byteString, "other");
        return byteString.z(i2, i(), i, i3);
    }

    public boolean z(int i, byte[] bArr, int i2, int i3) {
        zq3.h(bArr, "other");
        return i >= 0 && i <= i().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && p.a(i(), i, bArr, i2, i3);
    }
}
