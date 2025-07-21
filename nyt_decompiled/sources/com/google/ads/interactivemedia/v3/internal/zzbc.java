package com.google.ads.interactivemedia.v3.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class zzbc extends zzaet implements zzaga {
    private static final zzbc zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzbe zzM;
    private zzax zzaC;
    private long zzaI;
    private zzao zzaL;
    private zzaq zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzbl zzaW;
    private zzaz zzae;
    private zzbb zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzbn zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = QueryKeys.FORCE_DECAY;
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = QueryKeys.FORCE_DECAY;
    private String zzU = QueryKeys.FORCE_DECAY;
    private long zzV = -1;
    private int zzW = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzX = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private zzaez zzaf = zzaet.zzaF();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = QueryKeys.FORCE_DECAY;
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzax = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private String zzay = QueryKeys.FORCE_DECAY;
    private zzaez zzaz = zzaet.zzaF();
    private int zzaA = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private zzaez zzaB = zzaet.zzaF();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzbc zzbcVar = new zzbc();
        zzb = zzbcVar;
        zzaet.zzaM(zzbc.class, zzbcVar);
    }

    private zzbc() {
    }

    static /* synthetic */ void zzA(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 134217728;
        zzbcVar.zzH = j;
    }

    static /* synthetic */ void zzB(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= 268435456;
        zzbcVar.zzI = str;
    }

    static /* synthetic */ void zzC(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 536870912;
        zzbcVar.zzJ = j;
    }

    static /* synthetic */ void zzD(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 1073741824;
        zzbcVar.zzK = j;
    }

    static /* synthetic */ void zzE(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= RecyclerView.UNDEFINED_DURATION;
        zzbcVar.zzL = j;
    }

    static /* synthetic */ void zzF(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 2;
        zzbcVar.zzN = j;
    }

    static /* synthetic */ void zzG(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 4;
        zzbcVar.zzO = j;
    }

    static /* synthetic */ void zzH(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 8;
        zzbcVar.zzP = j;
    }

    static /* synthetic */ void zzI(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 16;
        zzbcVar.zzQ = j;
    }

    static /* synthetic */ void zzJ(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 32;
        zzbcVar.zzR = j;
    }

    static /* synthetic */ void zzK(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 64;
        zzbcVar.zzS = j;
    }

    static /* synthetic */ void zzL(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zze |= 128;
        zzbcVar.zzT = str;
    }

    static /* synthetic */ void zzM(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zze |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        zzbcVar.zzU = str;
    }

    static /* synthetic */ void zzN(zzbc zzbcVar, long j) {
        zzbcVar.zze |= ProgressEvent.PART_FAILED_EVENT_CODE;
        zzbcVar.zzY = j;
    }

    static /* synthetic */ void zzO(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 8192;
        zzbcVar.zzZ = j;
    }

    static /* synthetic */ void zzP(zzbc zzbcVar, long j) {
        zzbcVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzbcVar.zzaa = j;
    }

    static /* synthetic */ void zzQ(zzbc zzbcVar, zzaz zzazVar) {
        zzazVar.getClass();
        zzbcVar.zzae = zzazVar;
        zzbcVar.zze |= 262144;
    }

    static /* synthetic */ void zzR(zzbc zzbcVar, zzaz zzazVar) {
        zzazVar.getClass();
        zzaez zzaezVar = zzbcVar.zzaf;
        if (!zzaezVar.zzc()) {
            zzbcVar.zzaf = zzaet.zzaG(zzaezVar);
        }
        zzbcVar.zzaf.add(zzazVar);
    }

    static /* synthetic */ void zzT(zzbc zzbcVar, zzbb zzbbVar) {
        zzbbVar.getClass();
        zzbcVar.zzag = zzbbVar;
        zzbcVar.zze |= 524288;
    }

    static /* synthetic */ void zzU(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 2097152;
        zzbcVar.zzai = j;
    }

    static /* synthetic */ void zzV(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 4194304;
        zzbcVar.zzaj = j;
    }

    static /* synthetic */ void zzW(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 8388608;
        zzbcVar.zzak = j;
    }

    static /* synthetic */ void zzX(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 67108864;
        zzbcVar.zzan = j;
    }

    static /* synthetic */ void zzY(zzbc zzbcVar, long j) {
        zzbcVar.zze |= 134217728;
        zzbcVar.zzao = j;
    }

    static /* synthetic */ void zzZ(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zze |= 268435456;
        zzbcVar.zzap = str;
    }

    public static zzaf zza() {
        return (zzaf) zzb.zzay();
    }

    static /* synthetic */ void zzaa(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= 512;
        zzbcVar.zzaE = j;
    }

    static /* synthetic */ void zzab(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= 1024;
        zzbcVar.zzaF = j;
    }

    static /* synthetic */ void zzac(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        zzbcVar.zzaG = j;
    }

    static /* synthetic */ void zzad(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= ProgressEvent.PART_FAILED_EVENT_CODE;
        zzbcVar.zzaH = j;
    }

    static /* synthetic */ void zzae(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzf |= 32768;
        zzbcVar.zzaK = str;
    }

    static /* synthetic */ void zzaf(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzf |= 4194304;
        zzbcVar.zzaR = str;
    }

    static /* synthetic */ void zzag(zzbc zzbcVar, boolean z) {
        zzbcVar.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzbcVar.zzaT = z;
    }

    static /* synthetic */ void zzah(zzbc zzbcVar, long j) {
        zzbcVar.zzf |= 67108864;
        zzbcVar.zzaV = j;
    }

    static /* synthetic */ void zzam(zzbc zzbcVar, int i) {
        zzbcVar.zzW = i - 1;
        zzbcVar.zze |= 1024;
    }

    static /* synthetic */ void zzan(zzbc zzbcVar, int i) {
        zzbcVar.zzX = i - 1;
        zzbcVar.zze |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
    }

    static /* synthetic */ void zzao(zzbc zzbcVar, int i) {
        zzbcVar.zzad = i - 1;
        zzbcVar.zze |= 131072;
    }

    static /* synthetic */ void zzap(zzbc zzbcVar, int i) {
        zzbcVar.zzaw = i - 1;
        zzbcVar.zzf |= 8;
    }

    static /* synthetic */ void zzaq(zzbc zzbcVar, int i) {
        zzbcVar.zzax = i - 1;
        zzbcVar.zzf |= 16;
    }

    static /* synthetic */ void zzar(zzbc zzbcVar, int i) {
        zzbcVar.zzaP = i - 1;
        zzbcVar.zzf |= Constants.MB;
    }

    static /* synthetic */ void zzas(zzbc zzbcVar, int i) {
        zzbcVar.zzaS = 5;
        zzbcVar.zzf |= 8388608;
    }

    public static zzbc zzc() {
        return zzb;
    }

    public static zzbc zzd(byte[] bArr, zzaef zzaefVar) throws zzafc {
        return (zzbc) zzaet.zzaD(zzb, bArr, zzaefVar);
    }

    static /* synthetic */ void zzh(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= 1;
        zzbcVar.zzg = str;
    }

    static /* synthetic */ void zzi(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= 2;
        zzbcVar.zzh = str;
    }

    static /* synthetic */ void zzk(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 4;
        zzbcVar.zzi = j;
    }

    static /* synthetic */ void zzl(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 16;
        zzbcVar.zzk = j;
    }

    static /* synthetic */ void zzm(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 32;
        zzbcVar.zzl = j;
    }

    static /* synthetic */ void zzn(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 1024;
        zzbcVar.zzq = j;
    }

    static /* synthetic */ void zzo(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        zzbcVar.zzr = j;
    }

    static /* synthetic */ void zzp(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 8192;
        zzbcVar.zzt = j;
    }

    static /* synthetic */ void zzq(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzbcVar.zzu = j;
    }

    static /* synthetic */ void zzr(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 32768;
        zzbcVar.zzv = j;
    }

    static /* synthetic */ void zzs(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 65536;
        zzbcVar.zzw = j;
    }

    static /* synthetic */ void zzt(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 524288;
        zzbcVar.zzz = j;
    }

    static /* synthetic */ void zzu(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= Constants.MB;
        zzbcVar.zzA = j;
    }

    static /* synthetic */ void zzv(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 2097152;
        zzbcVar.zzB = j;
    }

    static /* synthetic */ void zzw(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= 4194304;
        zzbcVar.zzC = str;
    }

    static /* synthetic */ void zzx(zzbc zzbcVar, String str) {
        str.getClass();
        zzbcVar.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzbcVar.zzE = str;
    }

    static /* synthetic */ void zzy(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 33554432;
        zzbcVar.zzF = j;
    }

    static /* synthetic */ void zzz(zzbc zzbcVar, long j) {
        zzbcVar.zzd |= 67108864;
        zzbcVar.zzG = j;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zzf & 134217728) != 0;
    }

    public final int zzal() {
        int zza = zzal.zza(this.zzaS);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    public final zzbl zze() {
        zzbl zzblVar = this.zzaW;
        return zzblVar == null ? zzbl.zzc() : zzblVar;
    }

    public final String zzf() {
        return this.zzaR;
    }

    public final String zzg() {
        return this.zzC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzaex zzaexVar = zzak.zza;
            zzaex zzaexVar2 = zzbi.zza;
            return zzaet.zzaJ(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001aဌW\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^ဌTÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzaexVar, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzaz.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzaexVar2, "zzX", zzaexVar2, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzaexVar2, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzbh.zza, "zzas", zzbj.zza, "zzap", "zzat", zzag.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzaexVar2, "zzV", "zzD", "zzax", zzaexVar2, "zzay", "zzaz", zzav.class, "zzaA", zzaexVar2, "zzaB", zzai.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzas.zza, "zzaW", "zzaX", "zzaY"});
        }
        if (i2 == 3) {
            return new zzbc();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzaf(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
