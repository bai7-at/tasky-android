package defpackage;

/* loaded from: classes3.dex */
public final class vkb extends mkb {
    public vkb(wib wibVar) {
        super(wibVar);
    }

    @Override // defpackage.mkb
    public final void l() {
    }

    @Override // defpackage.mkb
    public final boolean v(String str) {
        String g = tfb.g(str);
        wib wibVar = (wib) this.c.get();
        if (wibVar != null && g != null) {
            wibVar.w(g, this);
        }
        fgb.g("VideoStreamNoopCache is doing nothing.");
        m(str, g, "noop", "Noop cache is a noop.");
        return false;
    }
}
