package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class MaterialTheme_androidKt {
    public static final void a(final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1322912246);
        if ((i & 14) == 0) {
            i2 = (h.C(gt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1322912246, i2, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            gt2Var.invoke(h, Integer.valueOf(i2 & 14));
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.MaterialTheme_androidKt$PlatformMaterialTheme$1
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
                    MaterialTheme_androidKt.a(gt2.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
