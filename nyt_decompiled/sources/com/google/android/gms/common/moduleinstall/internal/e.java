package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class e extends zaa {
    final /* synthetic */ qg8 a;

    e(zay zayVar, qg8 qg8Var) {
        this.a = qg8Var;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zab(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.a);
    }
}
