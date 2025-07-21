package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import defpackage.og8;
import defpackage.qg8;
import defpackage.so;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zal {
    private int zad;
    private final so zab = new so();
    private final qg8 zac = new qg8();
    private boolean zae = false;
    private final so zaa = new so();

    public zal(Iterable iterable) {
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            this.zaa.put(((HasApiKey) it2.next()).getApiKey(), null);
        }
        this.zad = this.zaa.keySet().size();
    }

    public final og8 zaa() {
        return this.zac.a();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.c(this.zab);
            } else {
                this.zac.b(new AvailabilityException(this.zaa));
            }
        }
    }
}
