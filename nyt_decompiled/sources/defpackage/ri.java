package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.j;

/* loaded from: classes4.dex */
public abstract class ri {
    public static final a a(String str, j jVar, Composer composer, int i) {
        zq3.h(str, "<this>");
        zq3.h(jVar, "style");
        composer.z(64360700);
        if (b.G()) {
            b.S(64360700, i, -1, "com.nytimes.android.designsystem.uicompose.ui.toAnnotatedString (AnnotatedStringUtils.kt:20)");
        }
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        jVar.D();
        c0064a.m(jVar.Q());
        c0064a.n(jVar.R());
        c0064a.i(str);
        c0064a.j();
        c0064a.j();
        a o = c0064a.o();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }
}
