package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class hg {
    public static final Shader a(long j, long j2, List list, List list2, int i) {
        e(list, list2);
        int b = b(list);
        return new LinearGradient(fd5.o(j), fd5.p(j), fd5.o(j2), fd5.p(j2), c(list, b), d(list2, list, b), qg.a(i));
    }

    public static final int b(List list) {
        return 0;
    }

    public static final int[] c(List list, int i) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = wn0.k(((nn0) list.get(i2)).B());
        }
        return iArr;
    }

    public static final float[] d(List list, List list2, int i) {
        if (i == 0) {
            if (list != null) {
                return i.U0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int n = i.n(list2);
        int i2 = 1;
        for (int i3 = 1; i3 < n; i3++) {
            long B = ((nn0) list2.get(i3)).B();
            float floatValue = list != null ? ((Number) list.get(i3)).floatValue() : i3 / i.n(list2);
            int i4 = i2 + 1;
            fArr[i2] = floatValue;
            if (nn0.u(B) == 0.0f) {
                i2 += 2;
                fArr[i4] = floatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? ((Number) list.get(i.n(list2))).floatValue() : 1.0f;
        return fArr;
    }

    private static final void e(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
