package defpackage;

import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class ty1 {
    private static final a e = new a(null);
    private static final long[] f = new long[0];
    private final SerialDescriptor a;
    private final gt2 b;
    private long c;
    private final long[] d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ty1(SerialDescriptor serialDescriptor, gt2 gt2Var) {
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(gt2Var, "readIfAbsent");
        this.a = serialDescriptor;
        this.b = gt2Var;
        int e2 = serialDescriptor.e();
        if (e2 <= 64) {
            this.c = e2 != 64 ? (-1) << e2 : 0L;
            this.d = f;
        } else {
            this.c = 0L;
            this.d = e(e2);
        }
    }

    private final void b(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.d;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    private final int c() {
        int length = this.d.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.d[i];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << numberOfTrailingZeros;
                int i4 = numberOfTrailingZeros + i3;
                if (((Boolean) this.b.invoke(this.a, Integer.valueOf(i4))).booleanValue()) {
                    this.d[i] = j;
                    return i4;
                }
            }
            this.d[i] = j;
            i = i2;
        }
        return -1;
    }

    private final long[] e(int i) {
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            jArr[d.d0(jArr)] = (-1) << i;
        }
        return jArr;
    }

    public final void a(int i) {
        if (i < 64) {
            this.c |= 1 << i;
        } else {
            b(i);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int e2 = this.a.e();
        do {
            long j = this.c;
            if (j == -1) {
                if (e2 > 64) {
                    return c();
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.c |= 1 << numberOfTrailingZeros;
        } while (!((Boolean) this.b.invoke(this.a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
