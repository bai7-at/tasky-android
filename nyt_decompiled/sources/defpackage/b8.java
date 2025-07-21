package defpackage;

/* loaded from: classes2.dex */
public final class b8 implements z7 {
    private final s6 a;

    public b8(s6 s6Var) {
        this.a = s6Var;
    }

    @Override // defpackage.z7
    public void a(boolean z) {
        s6 view = getView();
        if (view != null) {
            l6.c(view, z);
        }
    }

    @Override // defpackage.z7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s6 getView() {
        return this.a;
    }

    @Override // defpackage.z7
    public void pause() {
        s6 view = getView();
        if (view != null) {
            view.c();
        }
    }

    @Override // defpackage.z7
    public void resume() {
        s6 view = getView();
        if (view != null) {
            view.d();
        }
    }
}
