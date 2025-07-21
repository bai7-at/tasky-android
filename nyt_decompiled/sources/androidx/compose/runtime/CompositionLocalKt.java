package androidx.compose.runtime;

import defpackage.ax1;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.m76;
import defpackage.o76;
import defpackage.q18;
import defpackage.qs2;
import defpackage.tw7;
import defpackage.ww8;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class CompositionLocalKt {
    public static final void a(final o76 o76Var, final gt2 gt2Var, Composer composer, final int i) {
        Composer h = composer.h(-1350970552);
        if (b.G()) {
            b.S(-1350970552, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:245)");
        }
        h.T(o76Var);
        gt2Var.invoke(h, Integer.valueOf((i >> 3) & 14));
        h.r();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$2
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
                    CompositionLocalKt.a(o76.this, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final o76[] o76VarArr, final gt2 gt2Var, Composer composer, final int i) {
        Composer h = composer.h(-1390796515);
        if (b.G()) {
            b.S(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        h.s(o76VarArr);
        gt2Var.invoke(h, Integer.valueOf((i >> 3) & 14));
        h.M();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1
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
                    o76[] o76VarArr2 = o76VarArr;
                    CompositionLocalKt.b((o76[]) Arrays.copyOf(o76VarArr2, o76VarArr2.length), gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final m76 c(tw7 tw7Var, qs2 qs2Var) {
        return new ax1(tw7Var, qs2Var);
    }

    public static /* synthetic */ m76 d(tw7 tw7Var, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            tw7Var = y.q();
        }
        return c(tw7Var, qs2Var);
    }

    public static final m76 e(qs2 qs2Var) {
        return new q18(qs2Var);
    }
}
