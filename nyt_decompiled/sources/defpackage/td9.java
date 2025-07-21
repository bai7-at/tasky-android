package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public class td9 {
    private final vd9[] a;
    private final String b;
    private final byte[] c;
    private final int d;

    public td9(String str, vd9[] vd9VarArr) {
        this.b = str;
        this.c = null;
        this.a = vd9VarArr;
        this.d = 0;
    }

    public String a() {
        return this.b;
    }

    public td9(byte[] bArr, vd9[] vd9VarArr) {
        Objects.requireNonNull(bArr);
        this.c = bArr;
        this.b = null;
        this.a = vd9VarArr;
        this.d = 1;
    }
}
