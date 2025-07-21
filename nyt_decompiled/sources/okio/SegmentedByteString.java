package okio;

import defpackage.ad0;
import defpackage.ji7;
import defpackage.o;
import defpackage.p;
import defpackage.zq3;
import java.security.MessageDigest;
import kotlin.collections.d;

/* loaded from: classes5.dex */
public final class SegmentedByteString extends ByteString {
    private final transient byte[][] e;
    private final transient int[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.d.i());
        zq3.h(bArr, "segments");
        zq3.h(iArr, "directory");
        this.e = bArr;
        this.f = iArr;
    }

    private final ByteString O() {
        return new ByteString(J());
    }

    private final Object writeReplace() {
        ByteString O = O();
        zq3.f(O, "null cannot be cast to non-null type java.lang.Object");
        return O;
    }

    @Override // okio.ByteString
    public ByteString G(int i, int i2) {
        int e = p.e(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (e > E()) {
            throw new IllegalArgumentException(("endIndex=" + e + " > length(" + E() + ')').toString());
        }
        int i3 = e - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + e + " < beginIndex=" + i).toString());
        }
        if (i == 0 && e == E()) {
            return this;
        }
        if (i == e) {
            return ByteString.d;
        }
        int b = o.b(this, i);
        int b2 = o.b(this, e - 1);
        byte[][] bArr = (byte[][]) d.q(N(), b, b2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (b <= b2) {
            int i4 = b;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(M()[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr.length] = M()[N().length + i4];
                if (i4 == b2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = b != 0 ? M()[b - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i - i7);
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    public ByteString I() {
        return O().I();
    }

    @Override // okio.ByteString
    public byte[] J() {
        byte[] bArr = new byte[E()];
        int length = N().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = M()[length + i];
            int i5 = M()[i];
            int i6 = i5 - i2;
            d.f(N()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public void L(ad0 ad0Var, int i, int i2) {
        zq3.h(ad0Var, "buffer");
        int i3 = i + i2;
        int b = o.b(this, i);
        while (i < i3) {
            int i4 = b == 0 ? 0 : M()[b - 1];
            int i5 = M()[b] - i4;
            int i6 = M()[N().length + b];
            int min = Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            ji7 ji7Var = new ji7(N()[b], i7, i7 + min, true, false);
            ji7 ji7Var2 = ad0Var.a;
            if (ji7Var2 == null) {
                ji7Var.g = ji7Var;
                ji7Var.f = ji7Var;
                ad0Var.a = ji7Var;
            } else {
                zq3.e(ji7Var2);
                ji7 ji7Var3 = ji7Var2.g;
                zq3.e(ji7Var3);
                ji7Var3.c(ji7Var);
            }
            i += min;
            b++;
        }
        ad0Var.e1(ad0Var.h1() + i2);
    }

    public final int[] M() {
        return this.f;
    }

    public final byte[][] N() {
        return this.e;
    }

    @Override // okio.ByteString
    public String a() {
        return O().a();
    }

    @Override // okio.ByteString
    public ByteString d(String str) {
        zq3.h(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = N().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = M()[length + i];
            int i4 = M()[i];
            messageDigest.update(N()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        zq3.e(digest);
        return new ByteString(digest);
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.E() == E() && y(0, byteString, 0, E())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public int hashCode() {
        int j = j();
        if (j != 0) {
            return j;
        }
        int length = N().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = M()[length + i];
            int i5 = M()[i];
            byte[] bArr = N()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        A(i2);
        return i2;
    }

    @Override // okio.ByteString
    public int k() {
        return M()[N().length - 1];
    }

    @Override // okio.ByteString
    public String n() {
        return O().n();
    }

    @Override // okio.ByteString
    public int p(byte[] bArr, int i) {
        zq3.h(bArr, "other");
        return O().p(bArr, i);
    }

    @Override // okio.ByteString
    public byte[] s() {
        return J();
    }

    @Override // okio.ByteString
    public byte t(int i) {
        p.b(M()[N().length - 1], i, 1L);
        int b = o.b(this, i);
        return N()[b][(i - (b == 0 ? 0 : M()[b - 1])) + M()[N().length + b]];
    }

    @Override // okio.ByteString
    public String toString() {
        return O().toString();
    }

    @Override // okio.ByteString
    public int v(byte[] bArr, int i) {
        zq3.h(bArr, "other");
        return O().v(bArr, i);
    }

    @Override // okio.ByteString
    public boolean y(int i, ByteString byteString, int i2, int i3) {
        zq3.h(byteString, "other");
        if (i < 0 || i > E() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int b = o.b(this, i);
        while (i < i4) {
            int i5 = b == 0 ? 0 : M()[b - 1];
            int i6 = M()[b] - i5;
            int i7 = M()[N().length + b];
            int min = Math.min(i4, i6 + i5) - i;
            if (!byteString.z(i2, N()[b], i7 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean z(int i, byte[] bArr, int i2, int i3) {
        zq3.h(bArr, "other");
        if (i < 0 || i > E() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int b = o.b(this, i);
        while (i < i4) {
            int i5 = b == 0 ? 0 : M()[b - 1];
            int i6 = M()[b] - i5;
            int i7 = M()[N().length + b];
            int min = Math.min(i4, i6 + i5) - i;
            if (!p.a(N()[b], i7 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }
}
