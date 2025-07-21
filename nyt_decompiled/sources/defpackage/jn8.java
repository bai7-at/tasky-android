package defpackage;

/* loaded from: classes3.dex */
abstract class jn8 {
    static final jn8 b = new us7(null, 0, 0);
    private final jn8 a;

    jn8(jn8 jn8Var) {
        this.a = jn8Var;
    }

    final jn8 a(int i, int i2) {
        return new us7(this, i, i2);
    }

    final jn8 b(int i, int i2) {
        return new j80(this, i, i2);
    }

    abstract void c(l80 l80Var, byte[] bArr);

    final jn8 d() {
        return this.a;
    }
}
