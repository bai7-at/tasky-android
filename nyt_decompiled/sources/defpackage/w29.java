package defpackage;

/* loaded from: classes.dex */
final class w29 implements id5 {
    private final id5 b;
    private final int c;
    private final int d;

    public w29(id5 id5Var, int i, int i2) {
        this.b = id5Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.id5
    public int a(int i) {
        int a = this.b.a(i);
        if (a >= 0 && a <= this.c) {
            return a;
        }
        throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i + " -> " + a + " is not in range of original text [0, " + this.c + ']').toString());
    }

    @Override // defpackage.id5
    public int b(int i) {
        int b = this.b.b(i);
        if (b >= 0 && b <= this.d) {
            return b;
        }
        throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i + " -> " + b + " is not in range of transformed text [0, " + this.d + ']').toString());
    }
}
