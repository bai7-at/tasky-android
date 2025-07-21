package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
final class yee {
    private static final gfe c = new gfe("OverlayDisplayService");
    private static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final ufe a;
    private final String b;

    yee(Context context) {
        if (wfe.a(context)) {
            this.a = new ufe(context.getApplicationContext(), c, "OverlayDisplayService", d, tee.a, null);
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }

    final void c() {
        if (this.a == null) {
            return;
        }
        c.c("unbind LMD display overlay service", new Object[0]);
        this.a.u();
    }

    final void d(pee peeVar, dfe dfeVar) {
        if (this.a == null) {
            c.a("error: %s", "Play Store not found.");
        } else {
            qg8 qg8Var = new qg8();
            this.a.s(new vee(this, qg8Var, peeVar, dfeVar, qg8Var), qg8Var);
        }
    }

    final void e(afe afeVar, dfe dfeVar) {
        if (this.a == null) {
            c.a("error: %s", "Play Store not found.");
            return;
        }
        if (afeVar.g() != null) {
            qg8 qg8Var = new qg8();
            this.a.s(new uee(this, qg8Var, afeVar, dfeVar, qg8Var), qg8Var);
        } else {
            c.a("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            bfe c2 = cfe.c();
            c2.b(8160);
            dfeVar.a(c2.c());
        }
    }

    final void f(ffe ffeVar, dfe dfeVar, int i) {
        if (this.a == null) {
            c.a("error: %s", "Play Store not found.");
        } else {
            qg8 qg8Var = new qg8();
            this.a.s(new wee(this, qg8Var, ffeVar, i, dfeVar, qg8Var), qg8Var);
        }
    }
}
