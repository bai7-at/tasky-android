package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* loaded from: classes2.dex */
final class b extends zag {
    private final ListenerHolder a;

    public b(ListenerHolder listenerHolder) {
        this.a = listenerHolder;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.a.notifyListener(new a(this, moduleInstallStatusUpdate));
    }
}
