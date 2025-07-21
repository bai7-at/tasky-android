package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.a;
import defpackage.ar0;
import defpackage.hi2;
import defpackage.km1;
import defpackage.m11;
import defpackage.nq0;
import defpackage.oc;
import defpackage.u34;
import defpackage.uh2;
import defpackage.uq0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public a b(uq0 uq0Var) {
        return a.b((uh2) uq0Var.a(uh2.class), (hi2) uq0Var.a(hi2.class), uq0Var.e(m11.class), uq0Var.e(oc.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(nq0.c(a.class).b(km1.j(uh2.class)).b(km1.j(hi2.class)).b(km1.a(m11.class)).b(km1.a(oc.class)).f(new ar0() { // from class: r11
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                a b;
                b = CrashlyticsRegistrar.this.b(uq0Var);
                return b;
            }
        }).e().d(), u34.b("fire-cls", "18.2.10"));
    }
}
