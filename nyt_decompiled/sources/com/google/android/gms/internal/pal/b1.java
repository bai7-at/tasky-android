package com.google.android.gms.internal.pal;

import defpackage.zx9;

/* loaded from: classes3.dex */
final class b1 implements r0 {
    private final zx9 a;
    private final String b;
    private final Object[] c;
    private final int d;

    b1(zx9 zx9Var, String str, Object[] objArr) {
        this.a = zx9Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    final String a() {
        return this.b;
    }

    final Object[] b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.pal.r0
    public final zx9 zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.pal.r0
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.pal.r0
    public final int zzc() {
        return (this.d & 1) == 1 ? 1 : 2;
    }
}
