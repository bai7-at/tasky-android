package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzadt extends zzadv {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    /* synthetic */ zzadt(byte[] bArr, int i, int i2, boolean z, zzads zzadsVar) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = i2 + i;
        this.zzh = i;
        this.zzi = i;
    }

    private final void zzv() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = i - this.zzi;
        int i3 = this.zzk;
        if (i2 <= i3) {
            this.zzg = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzg = i4;
        this.zzf = i - i4;
    }

    public final byte zza() throws IOException {
        int i = this.zzh;
        if (i == this.zzf) {
            throw zzafc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i + 1;
        return bArr[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final int zzb() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final int zzc(int i) throws zzafc {
        if (i < 0) {
            throw zzafc.zzf();
        }
        int i2 = i + (this.zzh - this.zzi);
        if (i2 < 0) {
            throw zzafc.zzg();
        }
        int i3 = this.zzk;
        if (i2 > i3) {
            throw zzafc.zzi();
        }
        this.zzk = i2;
        zzv();
        return i3;
    }

    public final int zzd() throws IOException {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            throw zzafc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final int zze() throws IOException {
        int i;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zze;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzh = i5;
                return i;
            }
        }
        return (int) zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final int zzf() throws IOException {
        if (zzp()) {
            this.zzj = 0;
            return 0;
        }
        int zze = zze();
        this.zzj = zze;
        if ((zze >>> 3) != 0) {
            return zze;
        }
        throw zzafc.zzc();
    }

    public final long zzg() throws IOException {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            throw zzafc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        long j5 = bArr[i + 5];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((j5 & 255) << 40);
    }

    public final long zzh() throws IOException {
        long j;
        long j2;
        int i = this.zzh;
        int i2 = this.zzf;
        if (i2 != i) {
            byte[] bArr = this.zze;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzh = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j3 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j3;
                        } else {
                            i6 = i + 5;
                            long j4 = (bArr[i8] << 28) ^ i9;
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (bArr[i6] << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (bArr[i4] << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (bArr[i10] << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j7 = (j5 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.zzh = i4;
                return j;
            }
        }
        return zzi();
    }

    final long zzi() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zza() & 128) == 0) {
                return j;
            }
        }
        throw zzafc.zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final zzadr zzj() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zze <= i - i2) {
                zzadr zzs = zzadr.zzs(this.zze, i2, zze);
                this.zzh += zze;
                return zzs;
            }
        }
        if (zze == 0) {
            return zzadr.zzb;
        }
        if (zze > 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (zze <= i3 - i4) {
                int i5 = zze + i4;
                this.zzh = i5;
                return new zzado(Arrays.copyOfRange(this.zze, i4, i5));
            }
        }
        if (zze <= 0) {
            throw zzafc.zzf();
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final String zzk() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zze <= i - i2) {
                String str = new String(this.zze, i2, zze, zzafa.zzb);
                this.zzh += zze;
                return str;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze < 0) {
            throw zzafc.zzf();
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final String zzl() throws IOException {
        int zze = zze();
        if (zze > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zze <= i - i2) {
                String zzg = zzahy.zzg(this.zze, i2, zze);
                this.zzh += zze;
                return zzg;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze <= 0) {
            throw zzafc.zzf();
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final void zzm(int i) throws zzafc {
        if (this.zzj != i) {
            throw zzafc.zzb();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final void zzn(int i) {
        this.zzk = i;
        zzv();
    }

    public final void zzo(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i <= i2 - i3) {
                this.zzh = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzafc.zzi();
        }
        throw zzafc.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final boolean zzp() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final boolean zzq() throws IOException {
        return zzh() != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final boolean zzr(int i) throws IOException {
        int zzf;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i3 < 10) {
                    if (zza() < 0) {
                        i3++;
                    }
                }
                throw zzafc.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.zze;
                int i4 = this.zzh;
                this.zzh = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzafc.zze();
            return true;
        }
        if (i2 == 1) {
            zzo(8);
            return true;
        }
        if (i2 == 2) {
            zzo(zze());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzafc.zza();
            }
            zzo(4);
            return true;
        }
        do {
            zzf = zzf();
            if (zzf == 0) {
                break;
            }
        } while (zzr(zzf));
        zzm(((i >>> 3) << 3) | 4);
        return true;
    }
}
