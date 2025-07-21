package defpackage;

import android.webkit.WebSettings;
import defpackage.lj;

/* loaded from: classes.dex */
public abstract class ge9 {
    private static fe9 a(WebSettings webSettings) {
        return ye9.c().a(webSettings);
    }

    public static void b(WebSettings webSettings, boolean z) {
        if (!se9.O.c()) {
            throw se9.a();
        }
        a(webSettings).a(z);
    }

    public static void c(WebSettings webSettings, int i) {
        lj.h hVar = se9.S;
        if (hVar.b()) {
            pj.d(webSettings, i);
        } else {
            if (!hVar.c()) {
                throw se9.a();
            }
            a(webSettings).b(i);
        }
    }
}
