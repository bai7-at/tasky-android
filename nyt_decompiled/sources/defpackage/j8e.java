package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class j8e {
    private boolean a;

    final void a(Context context) {
        v9e.b(context, "Application Context cannot be null");
        if (this.a) {
            return;
        }
        this.a = true;
        e9e.c().d(context);
        u8e.k().f(context);
        p9e.b(context);
        q9e.d(context);
        t9e.a(context);
        z8e.b().c(context);
        t8e.b().d(context);
    }

    final boolean b() {
        return this.a;
    }
}
