package defpackage;

/* loaded from: classes3.dex */
public final class buf {
    private boolean b;
    private fuf d;
    private ltf e;
    private npf a = npf.c;
    private final ztf c = ztf.a;

    public final buf c(npf npfVar) {
        this.a = npfVar;
        return this;
    }

    public final buf d(grc[] grcVarArr) {
        this.d = new fuf(grcVarArr);
        return this;
    }

    public final lvf e() {
        wad.f(!this.b);
        this.b = true;
        if (this.d == null) {
            this.d = new fuf(new grc[0]);
        }
        jvf jvfVar = null;
        if (this.e == null) {
            this.e = new ltf(null);
        }
        return new lvf(this, jvfVar);
    }
}
