package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zaax implements zabf {
    private final zabi zaa;

    public zaax(zabi zabiVar) {
        this.zaa = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zaa(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zaa.zag.zaa.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final BaseImplementation.ApiMethodImpl zab(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        Iterator it2 = this.zaa.zaa.values().iterator();
        while (it2.hasNext()) {
            ((Api.Client) it2.next()).disconnect();
        }
        this.zaa.zag.zad = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        this.zaa.zaj();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult, Api api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        return true;
    }
}
