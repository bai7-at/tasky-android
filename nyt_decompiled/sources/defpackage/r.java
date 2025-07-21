package defpackage;

import android.graphics.Bitmap;
import coil.size.Scale;
import defpackage.oq1;
import kotlin.NoWhenBranchMatchedException;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class r {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Scale.values().length];
            iArr[Scale.FILL.ordinal()] = 1;
            iArr[Scale.FIT.ordinal()] = 2;
            a = iArr;
        }
    }

    public static final long a(sd0 sd0Var, ByteString byteString, long j, long j2) {
        if (byteString.E() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        byte g = byteString.g(0);
        long E = j2 - byteString.E();
        long j3 = j;
        while (j3 < E) {
            long M = sd0Var.M(g, j3, E);
            if (M == -1 || sd0Var.W(M, byteString)) {
                return M;
            }
            j3 = M + 1;
        }
        return -1L;
    }

    public static final boolean b(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static final float c(oq1 oq1Var, Scale scale) {
        if (oq1Var instanceof oq1.a) {
            return ((oq1.a) oq1Var).a;
        }
        int i = a.a[scale.ordinal()];
        if (i == 1) {
            return Float.MIN_VALUE;
        }
        if (i == 2) {
            return Float.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Bitmap.Config d(Bitmap.Config config) {
        return (config == null || b(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}
