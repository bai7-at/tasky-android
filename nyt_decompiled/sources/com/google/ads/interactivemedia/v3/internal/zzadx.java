package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzadx extends zzaea {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzadx(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzb(byte b) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            this.zze = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzd(int i, boolean z) throws IOException {
        zzq(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zze(int i, zzadr zzadrVar) throws IOException {
        zzq((i << 3) | 2);
        zzq(zzadrVar.zzd());
        zzadrVar.zzn(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzf(int i, int i2) throws IOException {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzg(int i) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            int i3 = i2 + 1;
            this.zze = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.zze = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.zze = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.zze = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzh(int i, long j) throws IOException {
        zzq((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzi(long j) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i = this.zze;
            int i2 = i + 1;
            this.zze = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.zze = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.zze = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.zze = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.zze = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.zze = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.zze = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.zze = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzj(int i, int i2) throws IOException {
        zzq(i << 3);
        zzk(i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzl(byte[] bArr, int i, int i2) throws IOException {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzm(int i, String str) throws IOException {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i = this.zze;
        try {
            int zzx = zzaea.zzx(str.length() * 3);
            int zzx2 = zzaea.zzx(str.length());
            if (zzx2 != zzx) {
                zzq(zzahy.zze(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzahy.zzd(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + zzx2;
            this.zze = i3;
            int zzd = zzahy.zzd(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzq((zzd - i) - zzx2);
            this.zze = zzd;
        } catch (zzahx e) {
            this.zze = i;
            zzB(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzady(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzo(int i, int i2) throws IOException {
        zzq((i << 3) | i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzp(int i, int i2) throws IOException {
        zzq(i << 3);
        zzq(i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzq(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }
        byte[] bArr2 = this.zzc;
        int i3 = this.zze;
        this.zze = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzr(int i, long j) throws IOException {
        zzq(i << 3);
        zzs(j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzs(long j) throws IOException {
        boolean z;
        z = zzaea.zzd;
        if (z && this.zzd - this.zze >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i = this.zze;
                this.zze = i + 1;
                zzaht.zzn(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i2 = this.zze;
            this.zze = i2 + 1;
            zzaht.zzn(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i3 = this.zze;
                this.zze = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }
        byte[] bArr4 = this.zzc;
        int i4 = this.zze;
        this.zze = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
