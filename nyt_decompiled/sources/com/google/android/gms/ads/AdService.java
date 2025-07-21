package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.d3b;
import defpackage.fgb;
import defpackage.kia;

@KeepForSdk
/* loaded from: classes2.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            kia.a().i(this, new d3b()).t0(intent);
        } catch (RemoteException e) {
            fgb.d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
