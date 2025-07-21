package com.airbnb.android.showkase.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.hr7;
import defpackage.lh4;
import defpackage.n25;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ShowkaseComponentDetailScreenKt {
    public static final void a(final Map map, final sy4 sy4Var, final n25 n25Var, Composer composer, final int i) {
        zq3.h(map, "groupedComponentMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        Composer h = composer.h(1434288519);
        if (b.G()) {
            b.S(1434288519, i, -1, "com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreen (ShowkaseComponentDetailScreen.kt:56)");
        }
        List list = (List) map.get(((hr7) sy4Var.getValue()).e());
        if (list == null) {
            if (b.G()) {
                b.R();
            }
            cc7 k = h.k();
            if (k == null) {
                return;
            }
            k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$componentMetadataList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ShowkaseComponentDetailScreenKt.a(map, sy4Var, n25Var, composer2, i | 1);
                }
            });
            return;
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
        lh4.a(null);
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 == null) {
            return;
        }
        k2.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentDetailScreenKt$ShowkaseComponentDetailScreen$componentMetadata$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i2) {
                ShowkaseComponentDetailScreenKt.a(map, sy4Var, n25Var, composer2, i | 1);
            }
        });
    }
}
