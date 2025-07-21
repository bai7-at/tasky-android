package defpackage;

import kotlin.collections.d;

/* loaded from: classes.dex */
public final class gy4 extends jb4 {
    private int e;

    public gy4(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        j(ta7.e(i));
    }

    private final void e() {
        if (this.c <= 8 || Long.compareUnsigned(pv8.b(pv8.b(this.d) * 32), pv8.b(pv8.b(this.c) * 25)) > 0) {
            n(ta7.c(this.c));
        } else {
            n(ta7.c(this.c));
        }
    }

    private final int f(long j) {
        int hashCode = Long.hashCode(j) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.c;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = i3;
            int i9 = i6;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i4;
                if (this.b[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int g = g(i2);
                if (this.e == 0 && ((this.a[g >> 3] >> ((g & 7) << 3)) & 255) != 254) {
                    e();
                    g = g(i2);
                }
                this.d++;
                int i10 = this.e;
                long[] jArr2 = this.a;
                int i11 = g >> 3;
                long j6 = jArr2[i11];
                int i12 = (g & 7) << 3;
                this.e = i10 - (((j6 >> i12) & 255) == 128 ? 1 : 0);
                jArr2[i11] = (j6 & (~(255 << i12))) | (j3 << i12);
                int i13 = this.c;
                int i14 = ((g - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (j3 << i16);
                return g;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    private final int g(int i) {
        int i2 = this.c;
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

    private final void h() {
        this.e = ta7.a(b()) - this.d;
    }

    private final void i(int i) {
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
        h();
    }

    private final void j(int i) {
        int max = i > 0 ? Math.max(7, ta7.d(i)) : 0;
        this.c = max;
        i(max);
        this.b = new long[max];
    }

    private final void m(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
    }

    private final void n(int i) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.a;
        long[] jArr4 = this.b;
        int i2 = this.c;
        j(i);
        long[] jArr5 = this.b;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr3[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr4[i3];
                int hashCode = Long.hashCode(j) * (-862048943);
                int i4 = hashCode ^ (hashCode << 16);
                int g = g(i4 >>> 7);
                long j2 = i4 & 127;
                long[] jArr6 = this.a;
                int i5 = g >> 3;
                int i6 = (g & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                jArr6[i5] = (jArr6[i5] & (~(255 << i6))) | (j2 << i6);
                int i7 = this.c;
                int i8 = ((g - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr6[i9] = ((~(255 << i10)) & jArr6[i9]) | (j2 << i10);
                jArr5[g] = j;
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
            }
            i3++;
            jArr3 = jArr;
            jArr4 = jArr2;
        }
    }

    public final void k(long j) {
        this.b[f(j)] = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(long r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Long.hashCode(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L41:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5e
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.b
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L58
            goto L68
        L58:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L41
        L5e:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L71
            r10 = -1
        L68:
            if (r10 < 0) goto L6b
            r4 = r11
        L6b:
            if (r4 == 0) goto L70
            r0.m(r10)
        L70:
            return r4
        L71:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy4.l(long):boolean");
    }
}
