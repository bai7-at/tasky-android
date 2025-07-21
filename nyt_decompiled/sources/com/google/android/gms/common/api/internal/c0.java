package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
final class c0 implements Runnable {
    final /* synthetic */ d0 a;

    c0(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        Api.Client client2;
        zabq zabqVar = this.a.a;
        client = zabqVar.zac;
        client2 = zabqVar.zac;
        client.disconnect(client2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
