package com.google.android.gms.internal.ads;

import defpackage.tge;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgbp extends zzgad {
    static final zzgad g = new zzgbp(null, new Object[0], 0);
    private final transient Object d;
    final transient Object[] e;
    private final transient int f;

    private zzgbp(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zzgbp n(int i, Object[] objArr, l9 l9Var) {
        short[] sArr;
        char c;
        char c2;
        Object[] objArr2;
        int i2 = i;
        Object[] objArr3 = objArr;
        if (i2 == 0) {
            return (zzgbp) g;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            Object obj2 = objArr3[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr3[1];
            Objects.requireNonNull(obj3);
            r8.b(obj2, obj3);
            return new zzgbp(null, objArr3, 1);
        }
        tge.b(i2, objArr3.length >> 1, "index");
        int n = zzgaf.n(i);
        if (i2 == 1) {
            Object obj4 = objArr3[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr3[1];
            Objects.requireNonNull(obj5);
            r8.b(obj4, obj5);
            i2 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i4 = n - 1;
            char c3 = 65535;
            if (n <= 128) {
                byte[] bArr = new byte[n];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj6 = objArr3[i8];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr3[i8 ^ i3];
                    Objects.requireNonNull(obj7);
                    r8.b(obj6, obj7);
                    int a = e9.a(obj6.hashCode());
                    while (true) {
                        int i9 = a & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArr3[i7] = obj6;
                                objArr3[i7 ^ 1] = obj7;
                            }
                            i6++;
                        } else {
                            if (obj6.equals(objArr3[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj8 = objArr3[i11];
                                Objects.requireNonNull(obj8);
                                k9 k9Var = new k9(obj6, obj7, obj8);
                                objArr3[i11] = obj7;
                                obj = k9Var;
                                break;
                            }
                            a = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i6), obj};
                    c2 = 2;
                    c = 1;
                }
            } else {
                if (n <= 32768) {
                    sArr = new short[n];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        int i14 = i12 + i12;
                        int i15 = i13 + i13;
                        Object obj9 = objArr3[i15];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr3[i15 ^ 1];
                        Objects.requireNonNull(obj10);
                        r8.b(obj9, obj10);
                        int a2 = e9.a(obj9.hashCode());
                        while (true) {
                            int i16 = a2 & i4;
                            char c4 = (char) sArr[i16];
                            if (c4 == 65535) {
                                sArr[i16] = (short) i14;
                                if (i12 < i13) {
                                    objArr3[i14] = obj9;
                                    objArr3[i14 ^ 1] = obj10;
                                }
                                i12++;
                            } else {
                                if (obj9.equals(objArr3[c4])) {
                                    int i17 = c4 ^ 1;
                                    Object obj11 = objArr3[i17];
                                    Objects.requireNonNull(obj11);
                                    k9 k9Var2 = new k9(obj9, obj10, obj11);
                                    objArr3[i17] = obj10;
                                    obj = k9Var2;
                                    break;
                                }
                                a2 = i16 + 1;
                            }
                        }
                    }
                    if (i12 != i2) {
                        Integer valueOf = Integer.valueOf(i12);
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i18 = 1;
                    sArr = new int[n];
                    Arrays.fill((int[]) sArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i2) {
                        int i21 = i20 + i20;
                        int i22 = i19 + i19;
                        Object obj12 = objArr3[i22];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr3[i22 ^ i18];
                        Objects.requireNonNull(obj13);
                        r8.b(obj12, obj13);
                        int a3 = e9.a(obj12.hashCode());
                        while (true) {
                            int i23 = a3 & i4;
                            ?? r15 = sArr[i23];
                            if (r15 == c3) {
                                sArr[i23] = i21;
                                if (i20 < i19) {
                                    objArr3[i21] = obj12;
                                    objArr3[i21 ^ 1] = obj13;
                                }
                                i20++;
                            } else {
                                if (obj12.equals(objArr3[r15])) {
                                    int i24 = r15 ^ 1;
                                    Object obj14 = objArr3[i24];
                                    Objects.requireNonNull(obj14);
                                    k9 k9Var3 = new k9(obj12, obj13, obj14);
                                    objArr3[i24] = obj13;
                                    obj = k9Var3;
                                    break;
                                }
                                a3 = i23 + 1;
                                c3 = 65535;
                            }
                        }
                        i19++;
                        i18 = 1;
                        c3 = 65535;
                    }
                    if (i20 != i2) {
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i20), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c = 1;
            }
            c2 = 2;
            c = 1;
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr4 = (Object[]) obj;
            k9 k9Var4 = (k9) objArr4[c2];
            if (l9Var == null) {
                throw k9Var4.a();
            }
            l9Var.c = k9Var4;
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[c]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i2 = intValue;
        }
        return new zzgbp(obj15, objArr3, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    final zzfzv a() {
        return new zzgbo(this.e, 1, this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzgad, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r8 = r0
            goto L9c
        L6:
            int r1 = r8.f
            java.lang.Object[] r2 = r8.e
            r3 = 1
            if (r1 != r3) goto L20
            r8 = 0
            r8 = r2[r8]
            java.util.Objects.requireNonNull(r8)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L3
            r8 = r2[r3]
            java.util.Objects.requireNonNull(r8)
            goto L9c
        L20:
            java.lang.Object r8 = r8.d
            if (r8 != 0) goto L25
            goto L3
        L25:
            boolean r1 = r8 instanceof byte[]
            r4 = -1
            if (r1 == 0) goto L51
            r1 = r8
            byte[] r1 = (byte[]) r1
            int r8 = r1.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = com.google.android.gms.internal.ads.e9.a(r8)
        L38:
            r8 = r8 & r5
            r4 = r1[r8]
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            if (r4 != r6) goto L41
            goto L3
        L41:
            r6 = r2[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L4e
            r8 = r4 ^ 1
            r8 = r2[r8]
            goto L9c
        L4e:
            int r8 = r8 + 1
            goto L38
        L51:
            boolean r1 = r8 instanceof short[]
            if (r1 == 0) goto L7d
            r1 = r8
            short[] r1 = (short[]) r1
            int r8 = r1.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = com.google.android.gms.internal.ads.e9.a(r8)
        L63:
            r8 = r8 & r5
            short r4 = r1[r8]
            char r4 = (char) r4
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r4 != r6) goto L6d
            goto L3
        L6d:
            r6 = r2[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L7a
            r8 = r4 ^ 1
            r8 = r2[r8]
            goto L9c
        L7a:
            int r8 = r8 + 1
            goto L63
        L7d:
            int[] r8 = (int[]) r8
            int r1 = r8.length
            int r1 = r1 + r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.ads.e9.a(r5)
        L89:
            r5 = r5 & r1
            r6 = r8[r5]
            if (r6 != r4) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r8 = r6 ^ 1
            r8 = r2[r8]
        L9c:
            if (r8 != 0) goto L9f
            return r0
        L9f:
            return r8
        La0:
            int r5 = r5 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbp.get(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    final zzgaf i() {
        return new zzgbm(this, this.e, 0, this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    final zzgaf j() {
        return new zzgbn(this, new zzgbo(this.e, 0, this.f));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
