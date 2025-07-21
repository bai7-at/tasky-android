package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzcp {
    public static void zza(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void zzb(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
