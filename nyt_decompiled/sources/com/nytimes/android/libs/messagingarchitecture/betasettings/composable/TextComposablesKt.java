package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.dh8;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.gv1;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.ph8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class TextComposablesKt {
    public static final void a(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(str, "text");
        Composer h = composer.h(178863026);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(178863026, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.LargeText (TextComposables.kt:19)");
            }
            composer2 = h;
            TextKt.c(str, PaddingKt.m(SizeKt.f(Modifier.a, 0.0f, 1, null), 0.0f, bu1.g(128), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).J(), composer2, (i2 & 14) | 48, 0, 65020);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.TextComposablesKt$LargeText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    TextComposablesKt.a(str, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(str, "fieldName");
        Composer h = composer.h(-602001597);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-602001597, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.TextForField (TextComposables.kt:37)");
            }
            if (str2 == null || h.d0(str2)) {
                composer2 = h;
            } else {
                a.C0064a c0064a = new a.C0064a(0, 1, null);
                int n = c0064a.n(new jy7(0L, 0L, o.b.a(), (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65531, (DefaultConstructorMarker) null));
                try {
                    c0064a.i(str + ": ");
                    ww8 ww8Var = ww8.a;
                    c0064a.k(n);
                    c0064a.i(str2);
                    composer2 = h;
                    TextKt.d(c0064a.o(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                } catch (Throwable th) {
                    c0064a.k(n);
                    throw th;
                }
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.TextComposablesKt$TextForField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    TextComposablesKt.b(str, str2, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
