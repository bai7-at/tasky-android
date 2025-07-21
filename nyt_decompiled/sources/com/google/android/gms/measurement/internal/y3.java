package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class y3 {
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;

    public y3(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j;
    }

    public static y3 b(zzaw zzawVar) {
        return new y3(zzawVar.zza, zzawVar.zzc, zzawVar.zzb.G0(), zzawVar.zzd);
    }

    public final zzaw a() {
        return new zzaw(this.a, new zzau(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        return "origin=" + this.b + ",name=" + this.a + ",params=" + this.d.toString();
    }
}
