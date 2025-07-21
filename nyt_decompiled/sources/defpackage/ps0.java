package defpackage;

/* loaded from: classes5.dex */
public final class ps0 extends ms0 {
    private final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(ku3 ku3Var, boolean z) {
        super(ku3Var);
        zq3.h(ku3Var, "writer");
        this.c = z;
    }

    @Override // defpackage.ms0
    public void d(byte b) {
        boolean z = this.c;
        String e = hv8.e(hv8.b(b));
        if (z) {
            m(e);
        } else {
            j(e);
        }
    }

    @Override // defpackage.ms0
    public void h(int i) {
        boolean z = this.c;
        String unsignedString = Integer.toUnsignedString(lv8.b(i));
        if (z) {
            m(unsignedString);
        } else {
            j(unsignedString);
        }
    }

    @Override // defpackage.ms0
    public void i(long j) {
        boolean z = this.c;
        String unsignedString = Long.toUnsignedString(pv8.b(j));
        if (z) {
            m(unsignedString);
        } else {
            j(unsignedString);
        }
    }

    @Override // defpackage.ms0
    public void k(short s) {
        boolean z = this.c;
        String e = aw8.e(aw8.b(s));
        if (z) {
            m(e);
        } else {
            j(e);
        }
    }
}
