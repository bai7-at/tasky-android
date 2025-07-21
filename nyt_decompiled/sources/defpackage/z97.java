package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class z97 {
    public static final a d = new a(null);
    private final aa7 a;
    private final androidx.savedstate.a b;
    private boolean c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z97 a(aa7 aa7Var) {
            zq3.h(aa7Var, "owner");
            return new z97(aa7Var, null);
        }

        private a() {
        }
    }

    public /* synthetic */ z97(aa7 aa7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(aa7Var);
    }

    public static final z97 a(aa7 aa7Var) {
        return d.a(aa7Var);
    }

    public final androidx.savedstate.a b() {
        return this.b;
    }

    public final void c() {
        Lifecycle lifecycle = this.a.getLifecycle();
        if (lifecycle.b() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(this.a));
        this.b.e(lifecycle);
        this.c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.c) {
            c();
        }
        Lifecycle lifecycle = this.a.getLifecycle();
        if (!lifecycle.b().isAtLeast(Lifecycle.State.STARTED)) {
            this.b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        zq3.h(bundle, "outBundle");
        this.b.g(bundle);
    }

    private z97(aa7 aa7Var) {
        this.a = aa7Var;
        this.b = new androidx.savedstate.a();
    }
}
