package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public final class d13 extends Lifecycle {
    public static final d13 b = new d13();
    private static final d44 c = new d44() { // from class: c13
        @Override // defpackage.d44
        public final Lifecycle getLifecycle() {
            Lifecycle f;
            f = d13.f();
            return f;
        }
    };

    private d13() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Lifecycle f() {
        return b;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void a(c44 c44Var) {
        if (!(c44Var instanceof ei1)) {
            throw new IllegalArgumentException((c44Var + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        ei1 ei1Var = (ei1) c44Var;
        d44 d44Var = c;
        ei1Var.onCreate(d44Var);
        ei1Var.onStart(d44Var);
        ei1Var.onResume(d44Var);
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State b() {
        return Lifecycle.State.RESUMED;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void d(c44 c44Var) {
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
