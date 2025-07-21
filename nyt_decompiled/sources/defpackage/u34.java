package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class u34 {

    public interface a {
        String extract(Object obj);
    }

    public static nq0 b(String str, String str2) {
        return nq0.j(s34.a(str, str2), s34.class);
    }

    public static nq0 c(final String str, final a aVar) {
        return nq0.k(s34.class).b(km1.j(Context.class)).f(new ar0() { // from class: t34
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                s34 d;
                d = u34.d(str, aVar, uq0Var);
                return d;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s34 d(String str, a aVar, uq0 uq0Var) {
        return s34.a(str, aVar.extract((Context) uq0Var.a(Context.class)));
    }
}
