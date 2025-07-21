package com.google.firebase.database;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import com.google.firebase.database.a;
import defpackage.ar0;
import defpackage.jq3;
import defpackage.km1;
import defpackage.mq3;
import defpackage.nq0;
import defpackage.u34;
import defpackage.uh2;
import defpackage.uq0;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(uq0 uq0Var) {
        return new a((uh2) uq0Var.a(uh2.class), uq0Var.e(mq3.class), uq0Var.e(jq3.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<nq0> getComponents() {
        return Arrays.asList(nq0.c(a.class).b(km1.j(uh2.class)).b(km1.a(mq3.class)).b(km1.a(jq3.class)).f(new ar0() { // from class: ta1
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                a lambda$getComponents$0;
                lambda$getComponents$0 = DatabaseRegistrar.lambda$getComponents$0(uq0Var);
                return lambda$getComponents$0;
            }
        }).d(), u34.b("fire-rtdb", "20.0.5"));
    }
}
