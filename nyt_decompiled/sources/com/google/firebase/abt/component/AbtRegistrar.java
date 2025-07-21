package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.abt.component.a;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ar0;
import defpackage.km1;
import defpackage.nq0;
import defpackage.oc;
import defpackage.u34;
import defpackage.uq0;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(uq0 uq0Var) {
        return new a((Context) uq0Var.a(Context.class), uq0Var.d(oc.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nq0> getComponents() {
        return Arrays.asList(nq0.c(a.class).b(km1.j(Context.class)).b(km1.i(oc.class)).f(new ar0() { // from class: e2
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                a lambda$getComponents$0;
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(uq0Var);
                return lambda$getComponents$0;
            }
        }).d(), u34.b("fire-abt", "21.0.2"));
    }
}
