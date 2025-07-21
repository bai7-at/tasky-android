package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfi;

/* loaded from: classes2.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {
    private zzfi a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new zzfi();
        }
        zzfi.zzb(context, intent);
    }
}
