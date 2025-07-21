package com.google.android.gms.internal.icing;

import defpackage.i4d;

/* loaded from: classes3.dex */
final class x0 implements n0 {
    private final i4d a;
    private final String b;
    private final Object[] c;
    private final int d;

    x0(i4d i4dVar, String str, Object[] objArr) {
        char charAt;
        this.a = i4dVar;
        this.b = str;
        this.c = objArr;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    charAt = str2.charAt(0);
                    str = str2;
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
                    e = e;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            } catch (StringIndexOutOfBoundsException unused2) {
                char[] cArr = new char[str2.length()];
                str2.getChars(0, str2.length(), cArr, 0);
                String str3 = new String(cArr);
                try {
                    charAt = str3.charAt(0);
                    str = str3;
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e2) {
                    e = e2;
                    str2 = str3;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            }
        }
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

    @Override // com.google.android.gms.internal.icing.n0
    public final boolean zza() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.icing.n0
    public final i4d zzb() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.icing.n0
    public final int zzc() {
        return (this.d & 1) == 1 ? 1 : 2;
    }
}
