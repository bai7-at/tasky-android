package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class i4f {
    private final List a;
    private final List b;

    /* synthetic */ i4f(int i, int i2, h4f h4fVar) {
        this.a = s3f.c(i);
        this.b = s3f.c(i2);
    }

    public final i4f a(e4f e4fVar) {
        this.b.add(e4fVar);
        return this;
    }

    public final i4f b(e4f e4fVar) {
        this.a.add(e4fVar);
        return this;
    }

    public final j4f c() {
        return new j4f(this.a, this.b, null);
    }
}
