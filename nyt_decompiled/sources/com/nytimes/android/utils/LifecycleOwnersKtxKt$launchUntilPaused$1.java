package com.nytimes.android.utils;

import defpackage.d44;
import defpackage.ei1;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class LifecycleOwnersKtxKt$launchUntilPaused$1 implements ei1 {
    final /* synthetic */ Job a;
    final /* synthetic */ d44 b;

    @Override // defpackage.ei1
    public void onStop(d44 d44Var) {
        zq3.h(d44Var, "owner");
        Job.DefaultImpls.cancel$default(this.a, (CancellationException) null, 1, (Object) null);
        this.b.getLifecycle().d(this);
    }
}
