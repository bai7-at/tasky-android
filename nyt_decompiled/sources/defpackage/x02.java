package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x02 {
    private final f12 a;
    private final byte[] b;

    public x02(f12 f12Var, byte[] bArr) {
        if (f12Var == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = f12Var;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public f12 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x02)) {
            return false;
        }
        x02 x02Var = (x02) obj;
        if (this.a.equals(x02Var.a)) {
            return Arrays.equals(this.b, x02Var.b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
