package com.google.ads.interactivemedia.v3.internal;

import android.os.AsyncTask;

/* loaded from: classes2.dex */
public abstract class zzdb extends AsyncTask {
    private zzdc zza;
    protected final zzct zzd;

    public zzdb(zzct zzctVar) {
        this.zzd = zzctVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzdc zzdcVar = this.zza;
        if (zzdcVar != null) {
            zzdcVar.zza(this);
        }
    }

    public final void zzb(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }
}
