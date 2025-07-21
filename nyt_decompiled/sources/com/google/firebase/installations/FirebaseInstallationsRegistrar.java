package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import defpackage.ar0;
import defpackage.hi2;
import defpackage.km1;
import defpackage.nq0;
import defpackage.t73;
import defpackage.u34;
import defpackage.u73;
import defpackage.uh2;
import defpackage.uq0;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ hi2 lambda$getComponents$0(uq0 uq0Var) {
        return new c((uh2) uq0Var.a(uh2.class), uq0Var.d(u73.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nq0> getComponents() {
        return Arrays.asList(nq0.c(hi2.class).b(km1.j(uh2.class)).b(km1.i(u73.class)).f(new ar0() { // from class: ii2
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                hi2 lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(uq0Var);
                return lambda$getComponents$0;
            }
        }).d(), t73.a(), u34.b("fire-installations", "17.0.3"));
    }
}
