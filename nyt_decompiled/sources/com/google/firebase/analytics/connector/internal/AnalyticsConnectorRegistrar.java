package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ar0;
import defpackage.km1;
import defpackage.nq0;
import defpackage.oc;
import defpackage.pc;
import defpackage.u34;
import defpackage.uh2;
import defpackage.uq0;
import defpackage.xa8;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<nq0> getComponents() {
        return Arrays.asList(nq0.c(oc.class).b(km1.j(uh2.class)).b(km1.j(Context.class)).b(km1.j(xa8.class)).f(new ar0() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                oc h;
                h = pc.h((uh2) uq0Var.a(uh2.class), (Context) uq0Var.a(Context.class), (xa8) uq0Var.a(xa8.class));
                return h;
            }
        }).e().d(), u34.b("fire-analytics", "21.0.0"));
    }
}
