package defpackage;

import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class zx4 extends pm3 {
    private int f;

    public /* synthetic */ zx4(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final void g() {
        if (this.d <= 8 || Long.compareUnsigned(pv8.b(pv8.b(this.e) * 32), pv8.b(pv8.b(this.d) * 25)) > 0) {
            m(ta7.c(this.d));
        } else {
            m(ta7.c(this.d));
        }
    }

    private final int h(int i) {
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

    private final int i(int i) {
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            int i10 = i7;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int h = h(i3);
                if (this.f == 0 && ((this.a[h >> 3] >> ((h & 7) << 3)) & 255) != 254) {
                    g();
                    h = h(i3);
                }
                this.e++;
                int i11 = this.f;
                long[] jArr2 = this.a;
                int i12 = h >> 3;
                long j5 = jArr2[i12];
                int i13 = (h & 7) << 3;
                this.f = i11 - (((j5 >> i13) & 255) == 128 ? 1 : 0);
                jArr2[i12] = ((~(255 << i13)) & j5) | (j2 << i13);
                int i14 = this.d;
                int i15 = ((h - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j2 << i17);
                return ~h;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    private final void j() {
        this.f = ta7.a(d()) - this.e;
    }

    private final void k(int i) {
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
        j();
    }

    private final void l(int i) {
        int max = i > 0 ? Math.max(7, ta7.d(i)) : 0;
        this.d = max;
        k(max);
        this.b = new int[max];
        this.c = new int[max];
    }

    private final void m(int i) {
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.a;
        int[] iArr2 = this.b;
        int[] iArr3 = this.c;
        int i2 = this.d;
        l(i);
        int[] iArr4 = this.b;
        int[] iArr5 = this.c;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr2[i3];
                int hashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int h = h(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr3 = this.a;
                int i6 = h >> 3;
                int i7 = (h & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i6] = (jArr3[i6] & (~(255 << i7))) | (j << i7);
                int i8 = this.d;
                int i9 = ((h - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr3[i10] = ((~(255 << i11)) & jArr3[i10]) | (j << i11);
                iArr4[h] = i4;
                iArr5[h] = iArr3[i3];
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i3++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    public final void n(int i, int i2) {
        int i3 = i(i);
        if (i3 < 0) {
            i3 = ~i3;
        }
        this.b[i3] = i;
        this.c[i3] = i2;
    }

    public zx4(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        l(ta7.e(i));
    }
}
