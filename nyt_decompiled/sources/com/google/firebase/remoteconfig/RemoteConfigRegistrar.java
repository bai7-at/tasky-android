package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.google.firebase.remoteconfig.c;
import defpackage.ar0;
import defpackage.hi2;
import defpackage.km1;
import defpackage.nq0;
import defpackage.oc;
import defpackage.u34;
import defpackage.uh2;
import defpackage.uq0;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$getComponents$0(uq0 uq0Var) {
        return new c((Context) uq0Var.a(Context.class), (uh2) uq0Var.a(uh2.class), (hi2) uq0Var.a(hi2.class), ((com.google.firebase.abt.component.a) uq0Var.a(com.google.firebase.abt.component.a.class)).b("frc"), uq0Var.d(oc.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nq0> getComponents() {
        return Arrays.asList(nq0.c(c.class).h(LIBRARY_NAME).b(km1.j(Context.class)).b(km1.j(uh2.class)).b(km1.j(hi2.class)).b(km1.j(com.google.firebase.abt.component.a.class)).b(km1.i(oc.class)).f(new ar0() { // from class: zv6
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                c lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(uq0Var);
                return lambda$getComponents$0;
            }
        }).e().d(), u34.b(LIBRARY_NAME, "21.2.0"));
    }
}
