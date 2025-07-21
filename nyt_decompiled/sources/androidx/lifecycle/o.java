package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.t;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.aa7;
import defpackage.ba7;
import defpackage.t21;
import defpackage.xg;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends t.d implements t.b {
    private Application b;
    private final t.b c;
    private Bundle d;
    private Lifecycle e;
    private androidx.savedstate.a f;

    public o(Application application, aa7 aa7Var, Bundle bundle) {
        zq3.h(aa7Var, "owner");
        this.f = aa7Var.getSavedStateRegistry();
        this.e = aa7Var.getLifecycle();
        this.d = bundle;
        this.b = application;
        this.c = application != null ? t.a.f.b(application) : new t.a();
    }

    @Override // androidx.lifecycle.t.b
    public q a(Class cls) {
        zq3.h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.t.b
    public q b(Class cls, t21 t21Var) {
        List list;
        Constructor c;
        List list2;
        zq3.h(cls, "modelClass");
        zq3.h(t21Var, "extras");
        String str = (String) t21Var.a(t.c.d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (t21Var.a(SavedStateHandleSupport.a) == null || t21Var.a(SavedStateHandleSupport.b) == null) {
            if (this.e != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) t21Var.a(t.a.h);
        boolean isAssignableFrom = xg.class.isAssignableFrom(cls);
        if (!isAssignableFrom || application == null) {
            list = ba7.b;
            c = ba7.c(cls, list);
        } else {
            list2 = ba7.a;
            c = ba7.c(cls, list2);
        }
        return c == null ? this.c.b(cls, t21Var) : (!isAssignableFrom || application == null) ? ba7.d(cls, c, SavedStateHandleSupport.a(t21Var)) : ba7.d(cls, c, application, SavedStateHandleSupport.a(t21Var));
    }

    @Override // androidx.lifecycle.t.d
    public void c(q qVar) {
        zq3.h(qVar, "viewModel");
        if (this.e != null) {
            androidx.savedstate.a aVar = this.f;
            zq3.e(aVar);
            Lifecycle lifecycle = this.e;
            zq3.e(lifecycle);
            LegacySavedStateHandleController.a(qVar, aVar, lifecycle);
        }
    }

    public final q d(String str, Class cls) {
        List list;
        Constructor c;
        q d;
        Application application;
        List list2;
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(cls, "modelClass");
        Lifecycle lifecycle = this.e;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = xg.class.isAssignableFrom(cls);
        if (!isAssignableFrom || this.b == null) {
            list = ba7.b;
            c = ba7.c(cls, list);
        } else {
            list2 = ba7.a;
            c = ba7.c(cls, list2);
        }
        if (c == null) {
            return this.b != null ? this.c.a(cls) : t.c.b.a().a(cls);
        }
        androidx.savedstate.a aVar = this.f;
        zq3.e(aVar);
        SavedStateHandleController b = LegacySavedStateHandleController.b(aVar, lifecycle, str, this.d);
        if (!isAssignableFrom || (application = this.b) == null) {
            d = ba7.d(cls, c, b.b());
        } else {
            zq3.e(application);
            d = ba7.d(cls, c, application, b.b());
        }
        d.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
        return d;
    }
}
