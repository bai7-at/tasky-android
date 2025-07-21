package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzpg {
    public static zzbc zza(Context context, String str, String str2) {
        return new zzpf(context, str, str2).zzb(CrashReportManager.TIME_WINDOW);
    }
}
