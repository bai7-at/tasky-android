package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class zzaid {
    private int zza = 0;

    public final int zza() {
        return this.zza;
    }

    public final zzaid zzb(Object obj, Object obj2, Comparator comparator) {
        if (this.zza != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.zza = -1;
            return this;
        }
        if (obj2 == null) {
            this.zza = 1;
            return this;
        }
        if (obj.getClass().isArray()) {
            int i = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (this.zza == 0 && jArr != jArr2) {
                    int length = jArr.length;
                    int length2 = jArr2.length;
                    if (length != length2) {
                        this.zza = length >= length2 ? 1 : -1;
                    } else {
                        while (i < jArr.length && this.zza == 0) {
                            this.zza = (jArr[i] > jArr2[i] ? 1 : (jArr[i] == jArr2[i] ? 0 : -1));
                            i++;
                        }
                    }
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (this.zza == 0 && iArr != iArr2) {
                    int length3 = iArr.length;
                    int length4 = iArr2.length;
                    if (length3 != length4) {
                        this.zza = length3 >= length4 ? 1 : -1;
                    } else {
                        for (int i2 = 0; i2 < iArr.length && this.zza == 0; i2++) {
                            int i3 = iArr[i2];
                            int i4 = iArr2[i2];
                            this.zza = i3 == i4 ? 0 : i3 < i4 ? -1 : 1;
                        }
                    }
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (this.zza == 0 && sArr != sArr2) {
                    int length5 = sArr.length;
                    int length6 = sArr2.length;
                    if (length5 != length6) {
                        this.zza = length5 >= length6 ? 1 : -1;
                    } else {
                        while (i < sArr.length && this.zza == 0) {
                            this.zza = sArr[i] - sArr2[i];
                            i++;
                        }
                    }
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (this.zza == 0 && cArr != cArr2) {
                    int length7 = cArr.length;
                    int length8 = cArr2.length;
                    if (length7 != length8) {
                        this.zza = length7 >= length8 ? 1 : -1;
                    } else {
                        while (i < cArr.length && this.zza == 0) {
                            this.zza = cArr[i] - cArr2[i];
                            i++;
                        }
                    }
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (this.zza == 0 && bArr != bArr2) {
                    int length9 = bArr.length;
                    int length10 = bArr2.length;
                    if (length9 != length10) {
                        this.zza = length9 >= length10 ? 1 : -1;
                    } else {
                        while (i < bArr.length && this.zza == 0) {
                            this.zza = bArr[i] - bArr2[i];
                            i++;
                        }
                    }
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (this.zza == 0 && dArr != dArr2) {
                    int length11 = dArr.length;
                    int length12 = dArr2.length;
                    if (length11 != length12) {
                        this.zza = length11 >= length12 ? 1 : -1;
                    } else {
                        while (i < dArr.length && this.zza == 0) {
                            this.zza = Double.compare(dArr[i], dArr2[i]);
                            i++;
                        }
                    }
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (this.zza == 0 && fArr != fArr2) {
                    int length13 = fArr.length;
                    int length14 = fArr2.length;
                    if (length13 != length14) {
                        this.zza = length13 >= length14 ? 1 : -1;
                    } else {
                        while (i < fArr.length && this.zza == 0) {
                            this.zza = Float.compare(fArr[i], fArr2[i]);
                            i++;
                        }
                    }
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (this.zza == 0 && zArr != zArr2) {
                    int length15 = zArr.length;
                    int length16 = zArr2.length;
                    if (length15 != length16) {
                        this.zza = length15 >= length16 ? 1 : -1;
                    } else {
                        while (i < zArr.length && this.zza == 0) {
                            boolean z = zArr[i];
                            if (z != zArr2[i]) {
                                if (z) {
                                    this.zza = 1;
                                } else {
                                    this.zza = -1;
                                }
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (this.zza == 0 && objArr != objArr2) {
                    int length17 = objArr.length;
                    int length18 = objArr2.length;
                    if (length17 != length18) {
                        this.zza = length17 >= length18 ? 1 : -1;
                    } else {
                        while (i < objArr.length && this.zza == 0) {
                            zzb(objArr[i], objArr2[i], null);
                            i++;
                        }
                    }
                }
            }
        } else {
            this.zza = ((Comparable) obj).compareTo(obj2);
        }
        return this;
    }
}
