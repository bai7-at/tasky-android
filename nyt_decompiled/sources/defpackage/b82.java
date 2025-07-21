package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* loaded from: classes2.dex */
public abstract class b82 {
    public static void a(boolean z, String str) {
        if (!z) {
            throw ParserException.a(str, null);
        }
    }

    public static boolean b(z72 z72Var, byte[] bArr, int i, int i2, boolean z) {
        try {
            return z72Var.e(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int c(z72 z72Var, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int o = z72Var.o(bArr, i + i3, i2 - i3);
            if (o == -1) {
                break;
            }
            i3 += o;
        }
        return i3;
    }

    public static boolean d(z72 z72Var, byte[] bArr, int i, int i2) {
        try {
            z72Var.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(z72 z72Var, int i) {
        try {
            z72Var.p(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
