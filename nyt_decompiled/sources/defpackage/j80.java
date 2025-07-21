package defpackage;

/* loaded from: classes3.dex */
final class j80 extends jn8 {
    private final short c;
    private final short d;

    j80(jn8 jn8Var, int i, int i2) {
        super(jn8Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.jn8
    public void c(l80 l80Var, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                l80Var.c(31, 5);
                short s2 = this.d;
                if (s2 > 62) {
                    l80Var.c(s2 - 31, 16);
                } else if (i == 0) {
                    l80Var.c(Math.min((int) s2, 31), 5);
                } else {
                    l80Var.c(s2 - 31, 5);
                }
            }
            l80Var.c(bArr[this.c + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append("::");
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
