package defpackage;

/* loaded from: classes3.dex */
abstract class jz9 {
    protected final tx9 a;

    protected jz9(tx9 tx9Var) {
        this.a = tx9Var;
    }

    protected abstract boolean a(b9e b9eVar);

    protected abstract boolean b(b9e b9eVar, long j);

    public final boolean c(b9e b9eVar, long j) {
        return a(b9eVar) && b(b9eVar, j);
    }
}
