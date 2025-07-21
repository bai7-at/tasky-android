package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class gna {
    private final InputStream a;
    private final boolean b;
    private final boolean c;
    private final long d;
    private final boolean e;

    private gna(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.a = inputStream;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = z3;
    }

    public static gna b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new gna(inputStream, z, z2, j, z3);
    }

    public final long a() {
        return this.d;
    }

    public final InputStream c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.c;
    }
}
