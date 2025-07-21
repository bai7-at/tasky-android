package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import defpackage.qg8;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class g extends zaa {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ qg8 b;
    final /* synthetic */ InstallStatusListener c;
    final /* synthetic */ zay d;

    g(zay zayVar, AtomicReference atomicReference, qg8 qg8Var, InstallStatusListener installStatusListener) {
        this.d = zayVar;
        this.a = atomicReference;
        this.b = qg8Var;
        this.c = installStatusListener;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.a.set(moduleInstallResponse);
        }
        TaskUtil.trySetResultOrApiException(status, null, this.b);
        if (!status.isSuccess() || (moduleInstallResponse != null && moduleInstallResponse.zaa())) {
            this.d.doUnregisterEventListener(ListenerHolders.createListenerKey(this.c, InstallStatusListener.class.getSimpleName()), 27306);
        }
    }
}
