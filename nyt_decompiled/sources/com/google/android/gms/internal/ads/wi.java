package com.google.android.gms.internal.ads;

import defpackage.w1f;

/* loaded from: classes3.dex */
final class wi implements mi {
    private final w1f a;
    private final String b;
    private final Object[] c;
    private final int d;

    wi(w1f w1fVar, String str, Object[] objArr) {
        this.a = w1fVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i3);
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    final String a() {
        return this.b;
    }

    final Object[] b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final w1f zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final int zzc() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
