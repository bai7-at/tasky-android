package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
abstract class i1 {
    static /* bridge */ /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || e(b3) || e(b4)) {
            throw zzci.c();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    static /* bridge */ /* synthetic */ void b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzci.c();
    }

    static /* bridge */ /* synthetic */ void c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || e(b2)) {
            throw zzci.c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    static /* bridge */ /* synthetic */ boolean d(byte b) {
        return b >= 0;
    }

    private static boolean e(byte b) {
        return b > -65;
    }
}
