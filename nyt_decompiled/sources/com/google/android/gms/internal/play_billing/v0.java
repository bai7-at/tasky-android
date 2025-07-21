package com.google.android.gms.internal.play_billing;

import defpackage.sbc;

/* loaded from: classes3.dex */
final class v0 implements m0 {
    private final sbc a;
    private final String b;
    private final Object[] c;
    private final int d;

    v0(sbc sbcVar, String str, Object[] objArr) {
        this.a = sbcVar;
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

    @Override // com.google.android.gms.internal.play_billing.m0
    public final sbc zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.play_billing.m0
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.m0
    public final int zzc() {
        return (this.d & 1) != 0 ? 1 : 2;
    }
}
