package defpackage;

/* loaded from: classes2.dex */
public abstract class os7 implements cz6 {
    protected final Object a;

    public os7(Object obj) {
        this.a = z06.d(obj);
    }

    @Override // defpackage.cz6
    public final int a() {
        return 1;
    }

    @Override // defpackage.cz6
    public void c() {
    }

    @Override // defpackage.cz6
    public Class d() {
        return this.a.getClass();
    }

    @Override // defpackage.cz6
    public final Object get() {
        return this.a;
    }
}
