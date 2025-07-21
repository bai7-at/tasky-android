package defpackage;

/* loaded from: classes5.dex */
public abstract class ut7 implements gb8 {
    private final jb8 a = new jb8();

    public final void a(gb8 gb8Var) {
        this.a.a(gb8Var);
    }

    public abstract void b(Throwable th);

    public abstract void c(Object obj);

    @Override // defpackage.gb8
    public final boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    @Override // defpackage.gb8
    public final void unsubscribe() {
        this.a.unsubscribe();
    }
}
