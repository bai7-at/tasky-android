package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class w extends zabw {
    private final WeakReference a;

    w(zabe zabeVar) {
        this.a = new WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zabe zabeVar = (zabe) this.a.get();
        if (zabeVar == null) {
            return;
        }
        zabe.zai(zabeVar);
    }
}
