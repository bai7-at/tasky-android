package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import defpackage.qg8;

/* loaded from: classes2.dex */
public final class zah extends r0 {
    public final ListenerHolder.ListenerKey zab;

    public zah(ListenerHolder.ListenerKey listenerKey, qg8 qg8Var) {
        super(4, qg8Var);
        this.zab = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq zabqVar) {
        zaci zaciVar = (zaci) zabqVar.zah().get(this.zab);
        return zaciVar != null && zaciVar.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] zab(zabq zabqVar) {
        zaci zaciVar = (zaci) zabqVar.zah().get(this.zab);
        if (zaciVar == null) {
            return null;
        }
        return zaciVar.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void zac(zabq zabqVar) throws RemoteException {
        zaci zaciVar = (zaci) zabqVar.zah().remove(this.zab);
        if (zaciVar == null) {
            this.zaa.e(Boolean.FALSE);
        } else {
            zaciVar.zab.unregisterListener(zabqVar.zaf(), this.zaa);
            zaciVar.zaa.clearListener();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(zaad zaadVar, boolean z) {
    }
}
