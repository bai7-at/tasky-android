package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.no9;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
final class l extends q {
    private final Map b;
    final /* synthetic */ zaaw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zaaw zaawVar, Map map) {
        super(zaawVar, null);
        this.c = zaawVar;
        this.b = map;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        boolean z;
        Context context2;
        zabi zabiVar;
        no9 no9Var;
        no9 no9Var2;
        zabi zabiVar2;
        Context context3;
        boolean z2;
        googleApiAvailabilityLight = this.c.zad;
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(googleApiAvailabilityLight);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.b.keySet()) {
            if (client.requiresGooglePlayServices()) {
                z2 = ((i) this.b.get(client)).c;
                if (!z2) {
                    arrayList.add(client);
                }
            }
            arrayList2.add(client);
        }
        int i = 0;
        int i2 = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                Api.Client client2 = (Api.Client) arrayList.get(i);
                context = this.c.zac;
                i2 = zalVar.zab(context, client2);
                i++;
                if (i2 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                Api.Client client3 = (Api.Client) arrayList2.get(i);
                context3 = this.c.zac;
                i2 = zalVar.zab(context3, client3);
                i++;
                if (i2 == 0) {
                    break;
                }
            }
        }
        if (i2 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i2, null);
            zaaw zaawVar = this.c;
            zabiVar2 = zaawVar.zaa;
            zabiVar2.zal(new j(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.c;
        z = zaawVar2.zam;
        if (z) {
            no9Var = zaawVar2.zak;
            if (no9Var != null) {
                no9Var2 = zaawVar2.zak;
                no9Var2.zab();
            }
        }
        for (Api.Client client4 : this.b.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) this.b.get(client4);
            if (client4.requiresGooglePlayServices()) {
                context2 = this.c.zac;
                if (zalVar.zab(context2, client4) != 0) {
                    zaaw zaawVar3 = this.c;
                    zabiVar = zaawVar3.zaa;
                    zabiVar.zal(new k(this, zaawVar3, connectionProgressReportCallbacks));
                }
            }
            client4.connect(connectionProgressReportCallbacks);
        }
    }
}
