package com.google.android.gms.internal.ads;

import defpackage.ave;

/* loaded from: classes3.dex */
public final class zzgpl extends RuntimeException {
    public zzgpl(String str) {
        super(str);
    }

    public static Object a(ave aveVar) {
        try {
            return aveVar.zza();
        } catch (Exception e) {
            throw new zzgpl(e);
        }
    }

    public zzgpl(String str, Throwable th) {
        super(str, th);
    }

    public zzgpl(Throwable th) {
        super(th);
    }
}
