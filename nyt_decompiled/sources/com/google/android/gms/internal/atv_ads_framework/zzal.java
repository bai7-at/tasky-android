package com.google.android.gms.internal.atv_ads_framework;

import defpackage.aif;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzal extends zzae {
    static final zzae g = new zzal(null, new Object[0], 0);
    private final transient Object d;
    final transient Object[] e;
    private final transient int f;

    private zzal(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    static zzal i(int i, Object[] objArr, b bVar) {
        int i2;
        short[] sArr;
        Object[] objArr2;
        int i3 = i;
        Object[] objArr3 = objArr;
        if (i3 == 0) {
            return (zzal) g;
        }
        Object obj = null;
        if (i3 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            f.a(obj2, obj3);
            return new zzal(null, objArr3, 1);
        }
        aif.b(i3, objArr3.length >> 1, "index");
        char c = 2;
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
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            f.a(obj4, obj5);
        } else {
            int i4 = i2 - 1;
            char c2 = 65535;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i5 + i5;
                    int i8 = i6 + i6;
                    Object obj6 = objArr3[i8];
                    obj6.getClass();
                    Object obj7 = objArr3[i8 ^ 1];
                    obj7.getClass();
                    f.a(obj6, obj7);
                    int a = g.a(obj6.hashCode());
                    while (true) {
                        int i9 = a & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i5 < i6) {
                                objArr3[i7] = obj6;
                                objArr3[i7 ^ 1] = obj7;
                            }
                            i5++;
                        } else {
                            if (obj6.equals(objArr3[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj8 = objArr3[i11];
                                obj8.getClass();
                                a aVar = new a(obj6, obj7, obj8);
                                objArr3[i11] = obj7;
                                obj = aVar;
                                break;
                            }
                            a = i9 + 1;
                        }
                    }
                }
                if (i5 == i3) {
                    obj = bArr;
                    c = 2;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i5), obj};
                    c = 2;
                }
            } else if (i2 <= 32768) {
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    Object obj9 = objArr3[i15];
                    obj9.getClass();
                    Object obj10 = objArr3[i15 ^ 1];
                    obj10.getClass();
                    f.a(obj9, obj10);
                    int a2 = g.a(obj9.hashCode());
                    while (true) {
                        int i16 = a2 & i4;
                        char c3 = (char) sArr[i16];
                        if (c3 == 65535) {
                            sArr[i16] = (short) i14;
                            if (i12 < i13) {
                                objArr3[i14] = obj9;
                                objArr3[i14 ^ 1] = obj10;
                            }
                            i12++;
                        } else {
                            if (obj9.equals(objArr3[c3])) {
                                int i17 = c3 ^ 1;
                                Object obj11 = objArr3[i17];
                                obj11.getClass();
                                a aVar2 = new a(obj9, obj10, obj11);
                                objArr3[i17] = obj10;
                                obj = aVar2;
                                break;
                            }
                            a2 = i16 + 1;
                        }
                    }
                }
                if (i12 != i3) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i12), obj};
                    obj = objArr2;
                }
                obj = sArr;
                c = 2;
            } else {
                sArr = new int[i2];
                Arrays.fill((int[]) sArr, -1);
                int i18 = 0;
                int i19 = 0;
                while (i18 < i3) {
                    int i20 = i19 + i19;
                    int i21 = i18 + i18;
                    Object obj12 = objArr3[i21];
                    obj12.getClass();
                    Object obj13 = objArr3[i21 ^ 1];
                    obj13.getClass();
                    f.a(obj12, obj13);
                    int a3 = g.a(obj12.hashCode());
                    while (true) {
                        int i22 = a3 & i4;
                        ?? r15 = sArr[i22];
                        if (r15 == c2) {
                            sArr[i22] = i20;
                            if (i19 < i18) {
                                objArr3[i20] = obj12;
                                objArr3[i20 ^ 1] = obj13;
                            }
                            i19++;
                        } else {
                            if (obj12.equals(objArr3[r15])) {
                                int i23 = r15 ^ 1;
                                Object obj14 = objArr3[i23];
                                obj14.getClass();
                                a aVar3 = new a(obj12, obj13, obj14);
                                objArr3[i23] = obj13;
                                obj = aVar3;
                                break;
                            }
                            a3 = i22 + 1;
                            c2 = 65535;
                        }
                    }
                    i18++;
                    c2 = 65535;
                }
                if (i19 != i3) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i19), obj};
                    obj = objArr2;
                }
                obj = sArr;
                c = 2;
            }
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr4 = (Object[]) obj;
            bVar.c = (a) objArr4[c];
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i3 = intValue;
        }
        return new zzal(obj15, objArr3, i3);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzae
    final zzy a() {
        return new zzak(this.e, 1, this.f);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzae
    final zzaf d() {
        return new zzai(this, this.e, 0, this.f);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzae
    final zzaf f() {
        return new zzaj(this, new zzak(this.e, 0, this.f));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.atv_ads_framework.zzae, java.util.Map
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
            int r0 = com.google.android.gms.internal.atv_ads_framework.g.a(r0)
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
            int r0 = com.google.android.gms.internal.atv_ads_framework.g.a(r0)
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
            int r5 = com.google.android.gms.internal.atv_ads_framework.g.a(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.zzal.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
