package defpackage;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class hs3 implements jk7 {
    private final xj0 a;

    public hs3(InputStream inputStream) {
        zq3.h(inputStream, "stream");
        this.a = new xj0(inputStream, yj0.b);
    }

    @Override // defpackage.jk7
    public int a(char[] cArr, int i, int i2) {
        zq3.h(cArr, "buffer");
        return this.a.d(cArr, i, i2);
    }

    public final void b() {
        this.a.e();
    }
}
