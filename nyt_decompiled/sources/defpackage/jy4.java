package defpackage;

import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class jy4 extends yb5 {
    private int f;

    public /* synthetic */ jy4(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final void h() {
        if (this.d <= 8 || Long.compareUnsigned(pv8.b(pv8.b(this.e) * 32), pv8.b(pv8.b(this.d) * 25)) > 0) {
            p(ta7.c(this.d));
        } else {
            p(ta7.c(this.d));
        }
    }

    private final int i(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final int j(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (zq3.c(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int i10 = i(i2);
                if (this.f == 0 && ((this.a[i10 >> 3] >> ((i10 & 7) << 3)) & 255) != 254) {
                    h();
                    i10 = i(i2);
                }
                this.e++;
                int i11 = this.f;
                long[] jArr2 = this.a;
                int i12 = i10 >> 3;
                long j5 = jArr2[i12];
                int i13 = (i10 & 7) << 3;
                this.f = i11 - (((j5 >> i13) & 255) == 128 ? 1 : 0);
                jArr2[i12] = (j5 & (~(255 << i13))) | (j2 << i13);
                int i14 = this.d;
                int i15 = ((i10 - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j2 << i17);
                return ~i10;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    private final void k() {
        this.f = ta7.a(c()) - this.e;
    }

    private final void l(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = ta7.a;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            d.v(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        k();
    }

    private final void m(int i) {
        int max = i > 0 ? Math.max(7, ta7.d(i)) : 0;
        this.d = max;
        l(max);
        this.b = new Object[max];
        this.c = new int[max];
    }

    private final void p(int i) {
        int i2;
        long[] jArr = this.a;
        Object[] objArr = this.b;
        int[] iArr = this.c;
        int i3 = this.d;
        m(i);
        Object[] objArr2 = this.b;
        int[] iArr2 = this.c;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int i6 = i(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr2 = this.a;
                int i7 = i6 >> 3;
                int i8 = (i6 & 7) << 3;
                i2 = i4;
                jArr2[i7] = (jArr2[i7] & (~(255 << i8))) | (j << i8);
                int i9 = this.d;
                int i10 = ((i6 - 7) & i9) + (i9 & 7);
                int i11 = i10 >> 3;
                int i12 = (i10 & 7) << 3;
                jArr2[i11] = (jArr2[i11] & (~(255 << i12))) | (j << i12);
                objArr2[i6] = obj;
                iArr2[i6] = iArr[i2];
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
        }
    }

    public final int n(Object obj, int i, int i2) {
        int j = j(obj);
        if (j < 0) {
            j = ~j;
        } else {
            i2 = this.c[j];
        }
        this.b[j] = obj;
        this.c[j] = i;
        return i2;
    }

    public final void o(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        this.b[i] = null;
    }

    public final void q(Object obj, int i) {
        int j = j(obj);
        if (j < 0) {
            j = ~j;
        }
        this.b[j] = obj;
        this.c[j] = i;
    }

    public jy4(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        m(ta7.e(i));
    }
}
