package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class xee extends yde {
    private final dfe a;
    final /* synthetic */ yee b;

    xee(yee yeeVar, dfe dfeVar) {
        this.b = yeeVar;
        this.a = dfeVar;
    }

    @Override // defpackage.zde
    public final void k0(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        bfe c = cfe.c();
        c.b(i);
        if (string != null) {
            c.a(string);
        }
        this.a.a(c.c());
        if (i == 8157) {
            this.b.c();
        }
    }
}
