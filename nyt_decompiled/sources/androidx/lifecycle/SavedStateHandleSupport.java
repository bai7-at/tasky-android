package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import androidx.savedstate.a;
import defpackage.aa7;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.t21;
import defpackage.x97;
import defpackage.xj3;
import defpackage.zq3;
import defpackage.zt6;

/* loaded from: classes.dex */
public abstract class SavedStateHandleSupport {
    public static final t21.b a = new b();
    public static final t21.b b = new c();
    public static final t21.b c = new a();

    public static final class a implements t21.b {
        a() {
        }
    }

    public static final class b implements t21.b {
        b() {
        }
    }

    public static final class c implements t21.b {
        c() {
        }
    }

    public static final n a(t21 t21Var) {
        zq3.h(t21Var, "<this>");
        aa7 aa7Var = (aa7) t21Var.a(a);
        if (aa7Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        sa9 sa9Var = (sa9) t21Var.a(b);
        if (sa9Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) t21Var.a(c);
        String str = (String) t21Var.a(t.c.d);
        if (str != null) {
            return b(aa7Var, sa9Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final n b(aa7 aa7Var, sa9 sa9Var, String str, Bundle bundle) {
        SavedStateHandlesProvider d = d(aa7Var);
        x97 e = e(sa9Var);
        n nVar = (n) e.e().get(str);
        if (nVar != null) {
            return nVar;
        }
        n a2 = n.f.a(d.b(str), bundle);
        e.e().put(str, a2);
        return a2;
    }

    public static final void c(aa7 aa7Var) {
        zq3.h(aa7Var, "<this>");
        Lifecycle.State b2 = aa7Var.getLifecycle().b();
        if (b2 != Lifecycle.State.INITIALIZED && b2 != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (aa7Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(aa7Var.getSavedStateRegistry(), (sa9) aa7Var);
            aa7Var.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            aa7Var.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesProvider d(aa7 aa7Var) {
        zq3.h(aa7Var, "<this>");
        a.c c2 = aa7Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        SavedStateHandlesProvider savedStateHandlesProvider = c2 instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) c2 : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final x97 e(sa9 sa9Var) {
        zq3.h(sa9Var, "<this>");
        xj3 xj3Var = new xj3();
        xj3Var.a(zt6.b(x97.class), new ss2() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final x97 invoke(t21 t21Var) {
                zq3.h(t21Var, "$this$initializer");
                return new x97();
            }
        });
        return (x97) new t(sa9Var, xj3Var.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", x97.class);
    }
}
