package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zztn extends zzsr {
    static final zzsr zza = new zztn(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zztn(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zztn zzj(int i, Object[] objArr, zzsq zzsqVar) {
        short[] sArr;
        char c;
        char c2;
        Object[] objArr2;
        int i2 = i;
        Object[] objArr3 = objArr;
        if (i2 == 0) {
            return (zztn) zza;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            zzrv.zzb(obj2, obj3);
            return new zztn(null, objArr3, 1);
        }
        zzrm.zzb(i2, objArr3.length >> 1, "index");
        int zzj = zzst.zzj(i);
        if (i2 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            zzrv.zzb(obj4, obj5);
            c = 1;
            c2 = 2;
        } else {
            int i4 = zzj - 1;
            char c3 = 65535;
            if (zzj <= 128) {
                byte[] bArr = new byte[zzj];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj6 = objArr3[i8];
                    obj6.getClass();
                    Object obj7 = objArr3[i8 ^ i3];
                    obj7.getClass();
                    zzrv.zzb(obj6, obj7);
                    int zzb = zzsi.zzb(obj6.hashCode());
                    while (true) {
                        int i9 = zzb & i4;
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
                                obj8.getClass();
                                zzsp zzspVar = new zzsp(obj6, obj7, obj8);
                                objArr3[i11] = obj7;
                                obj = zzspVar;
                                break;
                            }
                            zzb = i9 + 1;
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
                if (zzj <= 32768) {
                    sArr = new short[zzj];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        int i14 = i12 + i12;
                        int i15 = i13 + i13;
                        Object obj9 = objArr3[i15];
                        obj9.getClass();
                        Object obj10 = objArr3[i15 ^ 1];
                        obj10.getClass();
                        zzrv.zzb(obj9, obj10);
                        int zzb2 = zzsi.zzb(obj9.hashCode());
                        while (true) {
                            int i16 = zzb2 & i4;
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
                                    obj11.getClass();
                                    zzsp zzspVar2 = new zzsp(obj9, obj10, obj11);
                                    objArr3[i17] = obj10;
                                    obj = zzspVar2;
                                    break;
                                }
                                zzb2 = i16 + 1;
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
                    sArr = new int[zzj];
                    Arrays.fill((int[]) sArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i2) {
                        int i21 = i20 + i20;
                        int i22 = i19 + i19;
                        Object obj12 = objArr3[i22];
                        obj12.getClass();
                        Object obj13 = objArr3[i22 ^ i18];
                        obj13.getClass();
                        zzrv.zzb(obj12, obj13);
                        int zzb3 = zzsi.zzb(obj12.hashCode());
                        while (true) {
                            int i23 = zzb3 & i4;
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
                                    obj14.getClass();
                                    zzsp zzspVar3 = new zzsp(obj12, obj13, obj14);
                                    objArr3[i24] = obj13;
                                    obj = zzspVar3;
                                    break;
                                }
                                zzb3 = i23 + 1;
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
            zzsp zzspVar4 = (zzsp) objArr4[c2];
            if (zzsqVar == null) {
                throw zzspVar4.zza();
            }
            zzsqVar.zzc = zzspVar4;
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[c]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i2 = intValue;
        }
        return new zztn(obj15, objArr3, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzsr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzc
            java.lang.Object[] r1 = r8.zzb
            int r8 = r8.zzd
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
            int r0 = com.google.ads.interactivemedia.v3.internal.zzsi.zzb(r0)
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
            int r0 = com.google.ads.interactivemedia.v3.internal.zzsi.zzb(r0)
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
            int r5 = com.google.ads.interactivemedia.v3.internal.zzsi.zzb(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zztn.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    final zzsk zza() {
        return new zztm(this.zzb, 1, this.zzd);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    final zzst zze() {
        return new zztk(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    final zzst zzf() {
        return new zztl(this, new zztm(this.zzb, 0, this.zzd));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsr
    final boolean zzi() {
        return false;
    }
}
