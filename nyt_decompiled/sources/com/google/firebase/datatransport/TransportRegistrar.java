package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import defpackage.ar0;
import defpackage.bs8;
import defpackage.hs8;
import defpackage.km1;
import defpackage.nq0;
import defpackage.u34;
import defpackage.uq0;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ bs8 lambda$getComponents$0(uq0 uq0Var) {
        hs8.f((Context) uq0Var.a(Context.class));
        return hs8.c().g(a.h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nq0> getComponents() {
        return Arrays.asList(nq0.c(bs8.class).b(km1.j(Context.class)).f(new ar0() { // from class: gs8
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                bs8 lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(uq0Var);
                return lambda$getComponents$0;
            }
        }).d(), u34.b("fire-transport", "18.1.3"));
    }
}
