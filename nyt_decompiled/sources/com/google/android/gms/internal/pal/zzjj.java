package com.google.android.gms.internal.pal;

import defpackage.z7f;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzjj extends zzjc {
    static final zzjc g = new zzjj(null, new Object[0], 0);
    private final transient Object d;
    final transient Object[] e;
    private final transient int f;

    private zzjj(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zzjj o(int i, Object[] objArr, a3 a3Var) {
        int i2;
        short[] sArr;
        char c;
        char c2;
        byte[] bArr;
        int i3 = i;
        Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (zzjj) g;
        }
        Object obj = null;
        int i4 = 1;
        if (i3 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            v2.a(obj2, obj3);
            return new zzjj(null, objArr2, 1);
        }
        z7f.b(i3, objArr2.length >> 1, "index");
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i3 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            v2.a(obj4, obj5);
            c = 1;
            c2 = 2;
        } else {
            int i5 = i2 - 1;
            char c3 = 65535;
            if (i2 <= 128) {
                byte[] bArr2 = new byte[i2];
                Arrays.fill(bArr2, (byte) -1);
                int i6 = 0;
                int i7 = 0;
                while (i6 < i3) {
                    int i8 = i6 + i6;
                    int i9 = i7 + i7;
                    Object obj6 = objArr2[i8];
                    obj6.getClass();
                    Object obj7 = objArr2[i8 ^ i4];
                    obj7.getClass();
                    v2.a(obj6, obj7);
                    int a = w2.a(obj6.hashCode());
                    while (true) {
                        int i10 = a & i5;
                        int i11 = bArr2[i10] & 255;
                        if (i11 == 255) {
                            bArr2[i10] = (byte) i9;
                            if (i7 < i6) {
                                objArr2[i9] = obj6;
                                objArr2[i9 ^ 1] = obj7;
                            }
                            i7++;
                        } else {
                            if (obj6.equals(objArr2[i11])) {
                                int i12 = i11 ^ 1;
                                Object obj8 = objArr2[i12];
                                obj8.getClass();
                                z2 z2Var = new z2(obj6, obj7, obj8);
                                objArr2[i12] = obj7;
                                obj = z2Var;
                                break;
                            }
                            a = i10 + 1;
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 == i3) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i7), obj};
                    c2 = 2;
                    c = 1;
                    obj = bArr;
                }
            } else if (i2 <= 32768) {
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i3; i14++) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    Object obj9 = objArr2[i15];
                    obj9.getClass();
                    Object obj10 = objArr2[i15 ^ 1];
                    obj10.getClass();
                    v2.a(obj9, obj10);
                    int a2 = w2.a(obj9.hashCode());
                    while (true) {
                        int i17 = a2 & i5;
                        char c4 = (char) sArr[i17];
                        if (c4 == 65535) {
                            sArr[i17] = (short) i16;
                            if (i13 < i14) {
                                objArr2[i16] = obj9;
                                objArr2[i16 ^ 1] = obj10;
                            }
                            i13++;
                        } else {
                            if (obj9.equals(objArr2[c4])) {
                                int i18 = c4 ^ 1;
                                Object obj11 = objArr2[i18];
                                obj11.getClass();
                                z2 z2Var2 = new z2(obj9, obj10, obj11);
                                objArr2[i18] = obj10;
                                obj = z2Var2;
                                break;
                            }
                            a2 = i17 + 1;
                        }
                    }
                }
                if (i13 != i3) {
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i13), obj};
                    c = 1;
                }
                bArr = sArr;
            } else {
                int i19 = 1;
                sArr = new int[i2];
                Arrays.fill((int[]) sArr, -1);
                int i20 = 0;
                int i21 = 0;
                while (i20 < i3) {
                    int i22 = i20 + i20;
                    int i23 = i21 + i21;
                    Object obj12 = objArr2[i22];
                    obj12.getClass();
                    Object obj13 = objArr2[i22 ^ i19];
                    obj13.getClass();
                    v2.a(obj12, obj13);
                    int a3 = w2.a(obj12.hashCode());
                    while (true) {
                        int i24 = a3 & i5;
                        ?? r15 = sArr[i24];
                        if (r15 == c3) {
                            sArr[i24] = i23;
                            if (i21 < i20) {
                                objArr2[i23] = obj12;
                                objArr2[i23 ^ 1] = obj13;
                            }
                            i21++;
                        } else {
                            if (obj12.equals(objArr2[r15])) {
                                int i25 = r15 ^ 1;
                                Object obj14 = objArr2[i25];
                                obj14.getClass();
                                z2 z2Var3 = new z2(obj12, obj13, obj14);
                                objArr2[i25] = obj13;
                                obj = z2Var3;
                                break;
                            }
                            a3 = i24 + 1;
                            c3 = 65535;
                        }
                    }
                    i20++;
                    i19 = 1;
                    c3 = 65535;
                }
                if (i21 != i3) {
                    c = 1;
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i21), obj};
                }
                bArr = sArr;
            }
            c2 = 2;
            c = 1;
            obj = bArr;
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr3 = (Object[]) obj;
            z2 z2Var4 = (z2) objArr3[c2];
            if (a3Var == null) {
                throw z2Var4.a();
            }
            a3Var.c = z2Var4;
            Object obj16 = objArr3[0];
            int intValue = ((Integer) objArr3[c]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj15 = obj16;
            i3 = intValue;
        }
        return new zzjj(obj15, objArr2, i3);
    }

    @Override // com.google.android.gms.internal.pal.zzjc
    final zziw a() {
        return new zzji(this.e, 1, this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.pal.zzjc, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            java.lang.Object[] r1 = r8.e
            int r8 = r8.f
            r2 = 0
            if (r9 != 0) goto Lc
        L9:
            r8 = r2
            goto L9c
        Lc:
            r3 = 1
            if (r8 != r3) goto L22
            r8 = 0
            r8 = r1[r8]
            r8.getClass()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L9
            r8 = r1[r3]
            r8.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r8 = r0 instanceof byte[]
            r4 = -1
            if (r8 == 0) goto L51
            r8 = r0
            byte[] r8 = (byte[]) r8
            int r0 = r8.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.pal.w2.a(r0)
        L38:
            r0 = r0 & r5
            r4 = r8[r0]
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            if (r4 != r6) goto L41
            goto L9
        L41:
            r6 = r1[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L4e
            r8 = r4 ^ 1
            r8 = r1[r8]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r8 = r0 instanceof short[]
            if (r8 == 0) goto L7d
            r8 = r0
            short[] r8 = (short[]) r8
            int r0 = r8.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.pal.w2.a(r0)
        L63:
            r0 = r0 & r5
            short r4 = r8[r0]
            char r4 = (char) r4
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r4 != r6) goto L6d
            goto L9
        L6d:
            r6 = r1[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L7a
            r8 = r4 ^ 1
            r8 = r1[r8]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r8 = r0.length
            int r8 = r8 + r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.pal.w2.a(r5)
        L89:
            r5 = r5 & r8
            r6 = r0[r5]
            if (r6 != r4) goto L90
            goto L9
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r8 = r6 ^ 1
            r8 = r1[r8]
        L9c:
            if (r8 != 0) goto L9f
            return r2
        L9f:
            return r8
        La0:
            int r5 = r5 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.zzjj.get(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.pal.zzjc
    final zzjd j() {
        return new zzjg(this, this.e, 0, this.f);
    }

    @Override // com.google.android.gms.internal.pal.zzjc
    final zzjd l() {
        return new zzjh(this, new zzji(this.e, 0, this.f));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
