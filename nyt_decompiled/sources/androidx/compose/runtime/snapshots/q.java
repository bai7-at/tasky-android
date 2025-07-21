package androidx.compose.runtime.snapshots;

/* loaded from: classes.dex */
public abstract class q {
    private int a = SnapshotKt.H().f();
    private q b;

    public abstract void c(q qVar);

    public abstract q d();

    public final q e() {
        return this.b;
    }

    public final int f() {
        return this.a;
    }

    public final void g(q qVar) {
        this.b = qVar;
    }

    public final void h(int i) {
        this.a = i;
    }
}
