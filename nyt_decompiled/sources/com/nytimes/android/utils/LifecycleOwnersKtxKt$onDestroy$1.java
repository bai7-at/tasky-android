package com.nytimes.android.utils;

import defpackage.d44;
import defpackage.ei1;
import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class LifecycleOwnersKtxKt$onDestroy$1 implements ei1 {
    final /* synthetic */ qs2 a;

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        zq3.h(d44Var, "owner");
        d44Var.getLifecycle().d(this);
        this.a.mo865invoke();
    }
}
