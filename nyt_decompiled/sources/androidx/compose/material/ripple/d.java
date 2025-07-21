package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import defpackage.e27;
import defpackage.nn0;
import defpackage.wn0;

/* loaded from: classes.dex */
public interface d {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final e27 a(long j, boolean z) {
            e27 e27Var;
            e27 e27Var2;
            e27 e27Var3;
            if (!z) {
                e27Var = RippleThemeKt.d;
                return e27Var;
            }
            if (wn0.i(j) > 0.5d) {
                e27Var3 = RippleThemeKt.b;
                return e27Var3;
            }
            e27Var2 = RippleThemeKt.c;
            return e27Var2;
        }

        public final long b(long j, boolean z) {
            return (z || ((double) wn0.i(j)) >= 0.5d) ? j : nn0.b.h();
        }
    }

    long a(Composer composer, int i);

    e27 b(Composer composer, int i);
}
