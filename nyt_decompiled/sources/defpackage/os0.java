package defpackage;

/* loaded from: classes5.dex */
public final class os0 extends ms0 {
    private final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(ku3 ku3Var, boolean z) {
        super(ku3Var);
        zq3.h(ku3Var, "writer");
        this.c = z;
    }

    @Override // defpackage.ms0
    public void m(String str) {
        zq3.h(str, "value");
        if (this.c) {
            super.m(str);
        } else {
            super.j(str);
        }
    }
}
