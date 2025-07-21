package defpackage;

import com.google.android.gms.internal.ads.zzcc;
import java.io.EOFException;

/* loaded from: classes3.dex */
public abstract class tv9 {
    public static int a(ov9 ov9Var, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int g = ov9Var.g(bArr, i + i3, i2 - i3);
            if (g == -1) {
                break;
            }
            i3 += g;
        }
        return i3;
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw zzcc.a(str, null);
        }
    }

    public static boolean c(ov9 ov9Var, byte[] bArr, int i, int i2, boolean z) {
        try {
            return ov9Var.d(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean d(ov9 ov9Var, byte[] bArr, int i, int i2) {
        try {
            ((bv9) ov9Var).c(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(ov9 ov9Var, int i) {
        try {
            ((bv9) ov9Var).l(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
