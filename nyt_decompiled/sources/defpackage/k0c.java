package defpackage;

/* loaded from: classes3.dex */
public final class k0c {
    private final w9c a;
    private final ncc b;

    public k0c(w9c w9cVar, ncc nccVar) {
        this.a = w9cVar;
        this.b = nccVar;
    }

    public final w9c a() {
        return this.a;
    }

    final ncc b() {
        return this.b;
    }

    final tfc c() {
        ncc nccVar = this.b;
        return nccVar != null ? new tfc(nccVar, pgb.f) : new tfc(new j0c(this), pgb.f);
    }
}
