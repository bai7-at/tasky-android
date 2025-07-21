package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.appset.h;
import defpackage.cy0;
import defpackage.og8;
import defpackage.vg8;
import defpackage.vm;

/* loaded from: classes3.dex */
public final class h implements vm {
    private final vm a;
    private final vm b;

    public h(Context context) {
        this.a = new g(context, GoogleApiAvailabilityLight.getInstance());
        this.b = e.d(context);
    }

    public static /* synthetic */ og8 a(h hVar, og8 og8Var) {
        if (og8Var.q() || og8Var.o()) {
            return og8Var;
        }
        Exception l = og8Var.l();
        if (!(l instanceof ApiException)) {
            return og8Var;
        }
        int statusCode = ((ApiException) l).getStatusCode();
        return (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) ? hVar.b.b() : statusCode == 43000 ? vg8.d(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : statusCode != 15 ? og8Var : vg8.d(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // defpackage.vm
    public final og8 b() {
        return this.a.b().j(new cy0() { // from class: jsf
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                return h.a(h.this, og8Var);
            }
        });
    }
}
