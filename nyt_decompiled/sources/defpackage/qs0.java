package defpackage;

/* loaded from: classes5.dex */
public final class qs0 extends ms0 {
    private final at3 c;
    private int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(ku3 ku3Var, at3 at3Var) {
        super(ku3Var);
        zq3.h(ku3Var, "writer");
        zq3.h(at3Var, "json");
        this.c = at3Var;
    }

    @Override // defpackage.ms0
    public void b() {
        n(true);
        this.d++;
    }

    @Override // defpackage.ms0
    public void c() {
        n(false);
        j("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            j(this.c.e().k());
        }
    }

    @Override // defpackage.ms0
    public void o() {
        e(' ');
    }

    @Override // defpackage.ms0
    public void p() {
        this.d--;
    }
}
