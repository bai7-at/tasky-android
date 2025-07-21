package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
final class zzadw implements zzagk {
    private final zzadv zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzadw(zzadv zzadvVar) {
        byte[] bArr = zzafa.zzd;
        this.zza = zzadvVar;
        zzadvVar.zzc = this;
    }

    private final void zzP(Object obj, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzagsVar.zzh(obj, this, zzaefVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzafc.zzg();
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzQ(Object obj, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        int zze = ((zzadt) this.zza).zze();
        zzadv zzadvVar = this.zza;
        if (zzadvVar.zza >= zzadvVar.zzb) {
            throw new zzafc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzc = zzadvVar.zzc(zze);
        this.zza.zza++;
        zzagsVar.zzh(obj, this, zzaefVar);
        this.zza.zzm(0);
        r4.zza--;
        this.zza.zzn(zzc);
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzb() != i) {
            throw zzafc.zzi();
        }
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzafc.zza();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzafc.zzg();
        }
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzafc.zzg();
        }
    }

    public static zzadw zzq(zzadv zzadvVar) {
        zzadw zzadwVar = zzadvVar.zzc;
        return zzadwVar != null ? zzadwVar : new zzadw(zzadvVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzA(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zze = ((zzadt) this.zza).zze();
                zzU(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zze2 = ((zzadt) this.zza).zze();
            zzU(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzg());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        do {
            zzafoVar.zzf(((zzadt) this.zza).zzg());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzB(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaem)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zze = ((zzadt) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzadt) this.zza).zzd())));
                } while (this.zza.zzb() < zzb);
                return;
            }
            if (i != 5) {
                throw zzafc.zza();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((zzadt) this.zza).zzd())));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaem zzaemVar = (zzaem) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zze2 = ((zzadt) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaemVar.zze(Float.intBitsToFloat(((zzadt) this.zza).zzd()));
            } while (this.zza.zzb() < zzb2);
            return;
        }
        if (i2 != 5) {
            throw zzafc.zza();
        }
        do {
            zzaemVar.zze(Float.intBitsToFloat(((zzadt) this.zza).zzd()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    @Deprecated
    public final void zzC(List list, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzafc.zza();
        }
        do {
            Object zze = zzagsVar.zze();
            zzP(zze, zzagsVar, zzaefVar);
            zzagsVar.zzf(zze);
            list.add(zze);
            zzadv zzadvVar = this.zza;
            if (zzadvVar.zzp() || this.zzd != 0) {
                return;
            } else {
                zzf = zzadvVar.zzf();
            }
        } while (zzf == i);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzD(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zze());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zze());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzE(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzh());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzafoVar.zzf(((zzadt) this.zza).zzh());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzF(List list, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzafc.zza();
        }
        do {
            Object zze = zzagsVar.zze();
            zzQ(zze, zzagsVar, zzaefVar);
            zzagsVar.zzf(zze);
            list.add(zze);
            zzadv zzadvVar = this.zza;
            if (zzadvVar.zzp() || this.zzd != 0) {
                return;
            } else {
                zzf = zzadvVar.zzf();
            }
        } while (zzf == i);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzG(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zze = ((zzadt) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            if (i != 5) {
                throw zzafc.zza();
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zze2 = ((zzadt) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zzd());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        if (i2 != 5) {
            throw zzafc.zza();
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zzd());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzH(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zze = ((zzadt) this.zza).zze();
                zzU(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zze2 = ((zzadt) this.zza).zze();
            zzU(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzg());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        do {
            zzafoVar.zzf(((zzadt) this.zza).zzg());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzI(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(zzadv.zzs(((zzadt) this.zza).zze())));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(zzadv.zzs(((zzadt) this.zza).zze())));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzaeuVar.zzg(zzadv.zzs(((zzadt) this.zza).zze()));
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaeuVar.zzg(zzadv.zzs(((zzadt) this.zza).zze()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzJ(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Long.valueOf(zzadv.zzt(((zzadt) this.zza).zzh())));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Long.valueOf(zzadv.zzt(((zzadt) this.zza).zzh())));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzafoVar.zzf(zzadv.zzt(((zzadt) this.zza).zzh()));
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzafoVar.zzf(zzadv.zzt(((zzadt) this.zza).zzh()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    public final void zzK(List list, boolean z) throws IOException {
        int zzf;
        int zzf2;
        if ((this.zzb & 7) != 2) {
            throw zzafc.zza();
        }
        if (!(list instanceof zzafh) || z) {
            do {
                list.add(z ? zzs() : zzr());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafh zzafhVar = (zzafh) list;
        do {
            zzafhVar.zzi(zzp());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzL(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zze());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zze());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzM(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzafo)) {
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzafo zzafoVar = (zzafo) list;
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzh());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzafoVar.zzf(((zzadt) this.zza).zzh());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final boolean zzO() throws IOException {
        int i;
        zzadv zzadvVar = this.zza;
        if (zzadvVar.zzp() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return zzadvVar.zzr(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final double zza() throws IOException {
        zzS(1);
        return Double.longBitsToDouble(((zzadt) this.zza).zzg());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final float zzb() throws IOException {
        zzS(5);
        return Float.intBitsToFloat(((zzadt) this.zza).zzd());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzf();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zze() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzf() throws IOException {
        zzS(5);
        return ((zzadt) this.zza).zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzg() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzh() throws IOException {
        zzS(5);
        return ((zzadt) this.zza).zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzi() throws IOException {
        zzS(0);
        return zzadv.zzs(((zzadt) this.zza).zze());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzj() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzk() throws IOException {
        zzS(1);
        return ((zzadt) this.zza).zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzl() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zzh();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzm() throws IOException {
        zzS(1);
        return ((zzadt) this.zza).zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzn() throws IOException {
        zzS(0);
        return zzadv.zzt(((zzadt) this.zza).zzh());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzo() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zzh();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final zzadr zzp() throws IOException {
        zzS(2);
        return this.zza.zzj();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzl();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzt(Object obj, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        zzS(3);
        zzP(obj, zzagsVar, zzaefVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzu(Object obj, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        zzS(2);
        zzQ(obj, zzagsVar, zzaefVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzv(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzadg)) {
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzq()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzadg zzadgVar = (zzadg) list;
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzadgVar.zze(this.zza.zzq());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzadgVar.zze(this.zza.zzq());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzw(List list) throws IOException {
        int zzf;
        if ((this.zzb & 7) != 2) {
            throw zzafc.zza();
        }
        do {
            list.add(zzp());
            zzadv zzadvVar = this.zza;
            if (zzadvVar.zzp()) {
                return;
            } else {
                zzf = zzadvVar.zzf();
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzx(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaec)) {
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zze = ((zzadt) this.zza).zze();
                zzU(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzadt) this.zza).zzg())));
                } while (this.zza.zzb() < zzb);
                return;
            }
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(((zzadt) this.zza).zzg())));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaec zzaecVar = (zzaec) list;
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zze2 = ((zzadt) this.zza).zze();
            zzU(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaecVar.zze(Double.longBitsToDouble(((zzadt) this.zza).zzg()));
            } while (this.zza.zzb() < zzb2);
            return;
        }
        do {
            zzaecVar.zze(Double.longBitsToDouble(((zzadt) this.zza).zzg()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzy(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzafc.zza();
                }
                int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                } while (this.zza.zzb() < zzb);
                zzR(zzb);
                return;
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 != 2) {
                throw zzafc.zza();
            }
            int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zze());
            } while (this.zza.zzb() < zzb2);
            zzR(zzb2);
            return;
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zze());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzz(List list) throws IOException {
        int zzf;
        int zzf2;
        if (!(list instanceof zzaeu)) {
            int i = this.zzb & 7;
            if (i == 2) {
                int zze = ((zzadt) this.zza).zze();
                zzT(zze);
                int zzb = this.zza.zzb() + zze;
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                } while (this.zza.zzb() < zzb);
                return;
            }
            if (i != 5) {
                throw zzafc.zza();
            }
            do {
                list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                } else {
                    zzf = zzadvVar.zzf();
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        zzaeu zzaeuVar = (zzaeu) list;
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zze2 = ((zzadt) this.zza).zze();
            zzT(zze2);
            int zzb2 = this.zza.zzb() + zze2;
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zzd());
            } while (this.zza.zzb() < zzb2);
            return;
        }
        if (i2 != 5) {
            throw zzafc.zza();
        }
        do {
            zzaeuVar.zzg(((zzadt) this.zza).zzd());
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            } else {
                zzf2 = zzadvVar2.zzf();
            }
        } while (zzf2 == this.zzb);
        this.zzd = zzf2;
    }
}
