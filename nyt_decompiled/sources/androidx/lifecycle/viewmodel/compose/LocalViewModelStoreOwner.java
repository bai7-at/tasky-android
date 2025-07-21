package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import defpackage.m76;
import defpackage.o76;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class LocalViewModelStoreOwner {
    public static final LocalViewModelStoreOwner a = new LocalViewModelStoreOwner();
    private static final m76 b = CompositionLocalKt.d(null, new qs2() { // from class: androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner$LocalViewModelStoreOwner$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final sa9 mo865invoke() {
            return null;
        }
    }, 1, null);
    public static final int c = 0;

    private LocalViewModelStoreOwner() {
    }

    public final sa9 a(Composer composer, int i) {
        composer.z(-584162872);
        sa9 sa9Var = (sa9) composer.m(b);
        if (sa9Var == null) {
            sa9Var = ViewTreeViewModelStoreOwner.a((View) composer.m(AndroidCompositionLocals_androidKt.k()));
        }
        composer.R();
        return sa9Var;
    }

    public final o76 b(sa9 sa9Var) {
        zq3.h(sa9Var, "viewModelStoreOwner");
        return b.c(sa9Var);
    }
}
