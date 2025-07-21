package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zr0;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class LazySaveableStateHolderKt {
    public static final void a(final it2 it2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(674185128);
        if ((i & 14) == 0) {
            i2 = (h.C(it2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(674185128, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            final androidx.compose.runtime.saveable.a aVar = (androidx.compose.runtime.saveable.a) h.m(SaveableStateRegistryKt.b());
            final LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.b(new Object[]{aVar}, LazySaveableStateHolder.d.a(aVar), null, new qs2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final LazySaveableStateHolder mo865invoke() {
                    return new LazySaveableStateHolder(androidx.compose.runtime.saveable.a.this, t.i());
                }
            }, h, 72, 4);
            CompositionLocalKt.a(SaveableStateRegistryKt.b().c(lazySaveableStateHolder), zr0.b(h, 1863926504, true, new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1
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
                    if ((i3 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(1863926504, i3, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
                    }
                    LazySaveableStateHolder.this.i(SaveableStateHolderKt.a(composer2, 0));
                    it2Var.invoke(LazySaveableStateHolder.this, composer2, 8);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, 56);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2
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
                    LazySaveableStateHolderKt.a(it2.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
