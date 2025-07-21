package defpackage;

/* loaded from: classes3.dex */
public final class xva {
    private final eie a;
    private final gtd b;
    private kua c;

    public xva(eie eieVar, gtd gtdVar) {
        this.a = eieVar;
        this.b = gtdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized kua f(jua juaVar) {
        kua kuaVar = this.c;
        if (kuaVar != null) {
            return kuaVar;
        }
        kua kuaVar2 = new kua(juaVar);
        this.c = kuaVar2;
        return kuaVar2;
    }

    public final tua c() {
        tva tvaVar = null;
        if (this.b == null) {
            return null;
        }
        return new uva(this, tvaVar);
    }

    public final wua d() {
        return new wva(this, null);
    }
}
