package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.u04;
import defpackage.v04;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class LazyLayoutPrefetcher_androidKt {
    public static final void a(final u04 u04Var, final LazyLayoutItemContentFactory lazyLayoutItemContentFactory, final SubcomposeLayoutState subcomposeLayoutState, Composer composer, final int i) {
        Composer h = composer.h(1113453182);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1113453182, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:39)");
        }
        View view = (View) h.m(AndroidCompositionLocals_androidKt.k());
        int i2 = SubcomposeLayoutState.f;
        h.z(1618982084);
        boolean S = h.S(subcomposeLayoutState) | h.S(u04Var) | h.S(view);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            h.q(new v04(u04Var, subcomposeLayoutState, lazyLayoutItemContentFactory, view));
        }
        h.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    LazyLayoutPrefetcher_androidKt.a(u04.this, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
