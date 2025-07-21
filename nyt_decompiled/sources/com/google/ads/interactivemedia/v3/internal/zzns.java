package com.google.ads.interactivemedia.v3.internal;

import android.os.StrictMode;

/* loaded from: classes2.dex */
public final class zzns {
    public static Object zza(zzrp zzrpVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzrpVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
