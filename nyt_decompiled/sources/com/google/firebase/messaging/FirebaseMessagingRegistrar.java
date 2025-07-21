package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import defpackage.ar0;
import defpackage.bs8;
import defpackage.hi2;
import defpackage.ji2;
import defpackage.km1;
import defpackage.lh4;
import defpackage.nq0;
import defpackage.nz8;
import defpackage.u34;
import defpackage.uh2;
import defpackage.uq0;
import defpackage.xa8;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(uq0 uq0Var) {
        uh2 uh2Var = (uh2) uq0Var.a(uh2.class);
        lh4.a(uq0Var.a(ji2.class));
        return new FirebaseMessaging(uh2Var, null, uq0Var.d(nz8.class), uq0Var.d(HeartBeatInfo.class), (hi2) uq0Var.a(hi2.class), (bs8) uq0Var.a(bs8.class), (xa8) uq0Var.a(xa8.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<nq0> getComponents() {
        return Arrays.asList(nq0.c(FirebaseMessaging.class).b(km1.j(uh2.class)).b(km1.h(ji2.class)).b(km1.i(nz8.class)).b(km1.i(HeartBeatInfo.class)).b(km1.h(bs8.class)).b(km1.j(hi2.class)).b(km1.j(xa8.class)).f(new ar0() { // from class: oi2
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(uq0Var);
                return lambda$getComponents$0;
            }
        }).c().d(), u34.b("fire-fcm", "23.0.4"));
    }
}
