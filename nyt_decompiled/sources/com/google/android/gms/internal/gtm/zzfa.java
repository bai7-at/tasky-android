package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import defpackage.l94;

@VisibleForTesting
@Deprecated
/* loaded from: classes3.dex */
public abstract class zzfa {
    private static volatile l94 zza = new zzcu();

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzK(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str3 = (String) obj;
                StringBuilder sb = new StringBuilder(str.length() + 1 + str3.length());
                sb.append(str);
                sb.append(":");
                sb.append(str3);
                str2 = sb.toString();
            } else {
                str2 = str;
            }
            Log.e(zzeu.zzc.zzb(), str2);
        }
        l94 l94Var = zza;
        if (l94Var != null) {
            l94Var.error(str);
        }
    }

    public static boolean zzf(int i) {
        return zza != null && zza.getLogLevel() <= i;
    }
}
