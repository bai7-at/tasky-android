package defpackage;

import androidx.compose.material3.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.comscore.streaming.ContentType;
import defpackage.nn0;

/* loaded from: classes.dex */
public final class je3 {
    public static final je3 a = new je3();

    private je3() {
    }

    public final ie3 a(go0 go0Var, Composer composer, int i) {
        composer.z(1437915677);
        if (b.G()) {
            b.S(1437915677, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-defaultIconButtonColors> (IconButton.kt:589)");
        }
        ie3 c = go0Var.c();
        if (c == null) {
            long B = ((nn0) composer.m(ContentColorKt.a())).B();
            nn0.a aVar = nn0.b;
            c = new ie3(aVar.f(), B, aVar.f(), nn0.r(B, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            go0Var.P(c);
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c;
    }

    public final ie3 b(Composer composer, int i) {
        ie3 c;
        composer.z(-1519621781);
        if (b.G()) {
            b.S(-1519621781, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:551)");
        }
        ie3 a2 = a(zf4.a.a(composer, 6), composer, (i << 3) & ContentType.LONG_FORM_ON_DEMAND);
        long B = ((nn0) composer.m(ContentColorKt.a())).B();
        if (nn0.t(a2.e(), B)) {
            if (b.G()) {
                b.R();
            }
            composer.R();
            return a2;
        }
        c = a2.c((r18 & 1) != 0 ? a2.a : 0L, (r18 & 2) != 0 ? a2.b : B, (r18 & 4) != 0 ? a2.c : 0L, (r18 & 8) != 0 ? a2.d : nn0.r(B, 0.38f, 0.0f, 0.0f, 0.0f, 14, null));
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c;
    }
}
