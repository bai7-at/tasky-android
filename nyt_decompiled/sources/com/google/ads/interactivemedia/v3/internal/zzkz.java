package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class zzkz extends BroadcastReceiver {
    final /* synthetic */ zzla zza;

    zzkz(zzla zzlaVar) {
        this.zza = zzlaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
