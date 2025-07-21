package com.google.ads.interactivemedia.v3.internal;

import com.comscore.streaming.AdvertisementType;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzagr extends zzadr {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzadr zzd;
    private final zzadr zze;
    private final int zzf;
    private final int zzg;

    private static zzadr zzA(zzadr zzadrVar, zzadr zzadrVar2) {
        int zzd = zzadrVar.zzd();
        int zzd2 = zzadrVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzadrVar.zzw(bArr, 0, 0, zzd);
        zzadrVar2.zzw(bArr, 0, zzd, zzd2);
        return new zzado(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    static zzadr zzz(zzadr zzadrVar, zzadr zzadrVar2) {
        if (zzadrVar2.zzd() == 0) {
            return zzadrVar;
        }
        if (zzadrVar.zzd() == 0) {
            return zzadrVar2;
        }
        int zzd = zzadrVar.zzd() + zzadrVar2.zzd();
        if (zzd < 128) {
            return zzA(zzadrVar, zzadrVar2);
        }
        if (zzadrVar instanceof zzagr) {
            zzagr zzagrVar = (zzagr) zzadrVar;
            if (zzagrVar.zze.zzd() + zzadrVar2.zzd() < 128) {
                return new zzagr(zzagrVar.zzd, zzA(zzagrVar.zze, zzadrVar2));
            }
            if (zzagrVar.zzd.zzf() > zzagrVar.zze.zzf() && zzagrVar.zzg > zzadrVar2.zzf()) {
                return new zzagr(zzagrVar.zzd, new zzagr(zzagrVar.zze, zzadrVar2));
            }
        }
        return zzd >= zzc(Math.max(zzadrVar.zzf(), zzadrVar2.zzf()) + 1) ? new zzagr(zzadrVar, zzadrVar2) : zzagn.zza(new zzagn(null), zzadrVar, zzadrVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzadr)) {
            return false;
        }
        zzadr zzadrVar = (zzadr) obj;
        if (this.zzc != zzadrVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzq = zzq();
        int zzq2 = zzadrVar.zzq();
        if (zzq != 0 && zzq2 != 0 && zzq != zzq2) {
            return false;
        }
        zzago zzagoVar = null;
        zzagp zzagpVar = new zzagp(this, zzagoVar);
        zzadn next = zzagpVar.next();
        zzagp zzagpVar2 = new zzagp(zzadrVar, zzagoVar);
        zzadn next2 = zzagpVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd = next.zzd() - i;
            int zzd2 = next2.zzd() - i2;
            int min = Math.min(zzd, zzd2);
            if (!(i == 0 ? next.zzg(next2, i2, min) : next2.zzg(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzagpVar.next();
                i = 0;
            } else {
                i += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzagpVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzagl(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final byte zza(int i) {
        zzadr.zzv(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    protected final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    protected final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadr zzk(int i, int i2) {
        int zzp = zzadr.zzp(i, i2, this.zzc);
        if (zzp == 0) {
            return zzadr.zzb;
        }
        if (zzp == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzadr zzadrVar = this.zzd;
        return new zzagr(zzadrVar.zzk(i, zzadrVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadv zzl() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    protected final String zzm(Charset charset) {
        return new String(zzx(), charset);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    final void zzn(zzadh zzadhVar) throws IOException {
        this.zzd.zzn(zzadhVar);
        this.zze.zzn(zzadhVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean zzo() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzadr zzadrVar = this.zze;
        return zzadrVar.zzj(zzj, 0, zzadrVar.zzd()) == 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    /* renamed from: zzr */
    public final zzadm iterator() {
        return new zzagl(this);
    }

    private zzagr(zzadr zzadrVar, zzadr zzadrVar2) {
        this.zzd = zzadrVar;
        this.zze = zzadrVar2;
        int zzd = zzadrVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzadrVar2.zzd();
        this.zzg = Math.max(zzadrVar.zzf(), zzadrVar2.zzf()) + 1;
    }
}
