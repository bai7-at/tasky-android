package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ncf {
    private final Object a;
    private final byte[] b;
    private final int c;
    private final cbf d;
    private final hcf e;
    private final int f;
    private final int g;

    ncf(Object obj, byte[] bArr, int i, int i2, int i3, cbf cbfVar, hcf hcfVar) {
        this.a = obj;
        this.b = Arrays.copyOf(bArr, bArr.length);
        this.f = i;
        this.g = i2;
        this.c = i3;
        this.d = cbfVar;
        this.e = hcfVar;
    }

    public final int a() {
        return this.c;
    }

    public final hcf b() {
        return this.e;
    }

    public final Object c() {
        return this.a;
    }

    public final byte[] d() {
        byte[] bArr = this.b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int e() {
        return this.f;
    }

    public final int f() {
        return this.g;
    }
}
