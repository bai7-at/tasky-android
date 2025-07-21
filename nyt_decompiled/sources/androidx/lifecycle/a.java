package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.t;
import defpackage.aa7;
import defpackage.t21;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class a extends t.d implements t.b {
    public static final C0083a Companion = new C0083a(null);
    private androidx.savedstate.a b;
    private Lifecycle c;
    private Bundle d;

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    public static final class C0083a {
        public /* synthetic */ C0083a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0083a() {
        }
    }

    public a(aa7 aa7Var, Bundle bundle) {
        zq3.h(aa7Var, "owner");
        this.b = aa7Var.getSavedStateRegistry();
        this.c = aa7Var.getLifecycle();
        this.d = bundle;
    }

    private final q d(String str, Class cls) {
        androidx.savedstate.a aVar = this.b;
        zq3.e(aVar);
        Lifecycle lifecycle = this.c;
        zq3.e(lifecycle);
        SavedStateHandleController b = LegacySavedStateHandleController.b(aVar, lifecycle, str, this.d);
        q e = e(str, cls, b.b());
        e.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
        return e;
    }

    @Override // androidx.lifecycle.t.b
    public q a(Class cls) {
        zq3.h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.c != null) {
            return d(canonicalName, cls);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.t.b
    public q b(Class cls, t21 t21Var) {
        zq3.h(cls, "modelClass");
        zq3.h(t21Var, "extras");
        String str = (String) t21Var.a(t.c.d);
        if (str != null) {
            return this.b != null ? d(str, cls) : e(str, cls, SavedStateHandleSupport.a(t21Var));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.t.d
    public void c(q qVar) {
        zq3.h(qVar, "viewModel");
        androidx.savedstate.a aVar = this.b;
        if (aVar != null) {
            zq3.e(aVar);
            Lifecycle lifecycle = this.c;
            zq3.e(lifecycle);
            LegacySavedStateHandleController.a(qVar, aVar, lifecycle);
        }
    }

    protected abstract q e(String str, Class cls, n nVar);
}
