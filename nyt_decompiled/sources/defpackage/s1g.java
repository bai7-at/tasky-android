package defpackage;

import com.amazonaws.services.s3.internal.Constants;

/* loaded from: classes3.dex */
public final class s1g implements yzf {
    private final hye a;
    private int b;
    private final r1g c;
    private final j8g d;
    private final cwf e;

    public s1g(hye hyeVar, r1g r1gVar) {
        cwf cwfVar = new cwf();
        j8g j8gVar = new j8g();
        this.a = hyeVar;
        this.c = r1gVar;
        this.e = cwfVar;
        this.d = j8gVar;
        this.b = Constants.MB;
    }

    public final s1g a(int i) {
        this.b = i;
        return this;
    }

    public final u1g b(cza czaVar) {
        czaVar.b.getClass();
        return new u1g(czaVar, this.a, this.c, kwf.a, this.d, this.b, null);
    }
}
