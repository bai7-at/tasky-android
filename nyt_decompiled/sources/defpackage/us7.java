package defpackage;

/* loaded from: classes3.dex */
final class us7 extends jn8 {
    private final short c;
    private final short d;

    us7(jn8 jn8Var, int i, int i2) {
        super(jn8Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.jn8
    void c(l80 l80Var, byte[] bArr) {
        l80Var.c(this.c, this.d);
    }

    public String toString() {
        short s = this.c;
        short s2 = this.d;
        return "<" + Integer.toBinaryString((1 << this.d) | (s & ((1 << s2) - 1)) | (1 << s2)).substring(1) + '>';
    }
}
