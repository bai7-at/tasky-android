package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import defpackage.ej3;
import defpackage.eo3;
import defpackage.fj3;
import defpackage.yv0;

/* loaded from: classes.dex */
final class i implements ej3 {
    public static final i a = new i();

    private static final class a implements fj3 {
        public static final a a = new a();

        private a() {
        }

        @Override // defpackage.fj3
        public void a(yv0 yv0Var) {
            yv0Var.A1();
        }
    }

    private i() {
    }

    @Override // defpackage.ej3
    public fj3 a(eo3 eo3Var, Composer composer, int i) {
        composer.z(285654452);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(285654452, i, -1, "androidx.compose.foundation.NoIndication.rememberUpdatedInstance (Indication.kt:140)");
        }
        a aVar = a.a;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return aVar;
    }
}
