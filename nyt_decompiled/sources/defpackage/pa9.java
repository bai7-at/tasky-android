package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import defpackage.t21;

/* loaded from: classes.dex */
public abstract class pa9 {
    private static final q a(sa9 sa9Var, Class cls, String str, t.b bVar, t21 t21Var) {
        t tVar = bVar != null ? new t(sa9Var.getViewModelStore(), bVar, t21Var) : sa9Var instanceof d ? new t(sa9Var.getViewModelStore(), ((d) sa9Var).getDefaultViewModelProviderFactory(), t21Var) : new t(sa9Var);
        return str != null ? tVar.b(str, cls) : tVar.a(cls);
    }

    static /* synthetic */ q b(sa9 sa9Var, Class cls, String str, t.b bVar, t21 t21Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bVar = null;
        }
        if ((i & 8) != 0) {
            t21Var = sa9Var instanceof d ? ((d) sa9Var).getDefaultViewModelCreationExtras() : t21.a.b;
        }
        return a(sa9Var, cls, str, bVar, t21Var);
    }

    public static final q c(Class cls, sa9 sa9Var, String str, t.b bVar, t21 t21Var, Composer composer, int i, int i2) {
        zq3.h(cls, "modelClass");
        composer.z(-1439476281);
        if ((i2 & 2) != 0 && (sa9Var = LocalViewModelStoreOwner.a.a(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            bVar = null;
        }
        if ((i2 & 16) != 0) {
            t21Var = sa9Var instanceof d ? ((d) sa9Var).getDefaultViewModelCreationExtras() : t21.a.b;
        }
        q a = a(sa9Var, cls, str, bVar, t21Var);
        composer.R();
        return a;
    }

    public static final /* synthetic */ q d(Class cls, sa9 sa9Var, String str, t.b bVar, Composer composer, int i, int i2) {
        zq3.h(cls, "modelClass");
        composer.z(1324836815);
        if ((i2 & 2) != 0 && (sa9Var = LocalViewModelStoreOwner.a.a(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        q b = b(sa9Var, cls, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : bVar, null, 8, null);
        composer.R();
        return b;
    }
}
