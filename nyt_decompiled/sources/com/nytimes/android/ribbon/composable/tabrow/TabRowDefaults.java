package com.nytimes.android.ribbon.composable.tabrow;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.bu1;
import defpackage.di;
import defpackage.it2;
import defpackage.jf8;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xx1;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class TabRowDefaults {
    public static final TabRowDefaults a = new TabRowDefaults();
    private static final float b = bu1.g(1);
    private static final float c = bu1.g(2);
    private static final float d = bu1.g(52);

    private TabRowDefaults() {
    }

    public final Modifier a(Modifier modifier, final jf8 jf8Var) {
        zq3.h(modifier, "<this>");
        zq3.h(jf8Var, "currentTabPosition");
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: com.nytimes.android.ribbon.composable.tabrow.TabRowDefaults$customTabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), new it2() { // from class: com.nytimes.android.ribbon.composable.tabrow.TabRowDefaults$customTabIndicatorOffset$2
            {
                super(3);
            }

            private static final float b(x08 x08Var) {
                return ((bu1) x08Var.getValue()).n();
            }

            private static final float c(x08 x08Var) {
                return ((bu1) x08Var.getValue()).n();
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                zq3.h(modifier2, "$this$composed");
                composer.z(935663915);
                if (b.G()) {
                    b.S(935663915, i, -1, "com.nytimes.android.ribbon.composable.tabrow.TabRowDefaults.customTabIndicatorOffset.<anonymous> (CustomScrollableTabRow.kt:283)");
                }
                x08 c2 = AnimateAsStateKt.c(jf8.this.c(), di.k(250, 0, xx1.c(), 2, null), "customTabIndicatorWidth", null, composer, 384, 8);
                Modifier s = SizeKt.s(OffsetKt.c(SizeKt.y(SizeKt.h(modifier2, 0.0f, 1, null), Alignment.a.d(), false, 2, null), c(AnimateAsStateKt.c(jf8.this.a(), di.k(250, 0, xx1.c(), 2, null), "customTabIndicatorOffset", null, composer, 384, 8)), 0.0f, 2, null), b(c2));
                if (b.G()) {
                    b.R();
                }
                composer.R();
                return s;
            }
        });
    }
}
