package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class zzg extends j {
    final /* synthetic */ BaseGmsClient zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, i, null);
        this.zze = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.j
    protected final void zzb(ConnectionResult connectionResult) {
        if (this.zze.enableLocalFallback() && BaseGmsClient.zzo(this.zze)) {
            BaseGmsClient.zzk(this.zze, 16);
        } else {
            this.zze.zzc.onReportServiceBinding(connectionResult);
            this.zze.onConnectionFailed(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.internal.j
    protected final boolean zzd() {
        this.zze.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}
