package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.d3b;
import defpackage.d7b;
import defpackage.fgb;
import defpackage.kia;

@KeepForSdk
/* loaded from: classes2.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            d7b i = kia.a().i(this, new d3b());
            if (i == null) {
                fgb.d("OfflineUtils is null");
            } else {
                i.t0(getIntent());
            }
        } catch (RemoteException e) {
            fgb.d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
