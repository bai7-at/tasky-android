package com.google.android.gms.internal.pal;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.by9;
import defpackage.ev9;
import defpackage.iw9;
import defpackage.mw9;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final class g1 extends c0 implements by9 {
    private static final g1 zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzG;
    private long zzH;
    private long zzI;
    private long zzK;
    private w1 zzN;
    private b zzaD;
    private long zzaJ;
    private long zzaM;
    private boolean zzaP;
    private long zzaR;
    private f2 zzaS;
    private long zzaT;
    private n zzaf;
    private o0 zzah;
    private int zzas;
    private int zzat;
    private int zzau;
    private h2 zzav;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzh = "";
    private String zzi = "";
    private String zzt = "";
    private String zzD = "";
    private String zzE = QueryKeys.FORCE_DECAY;
    private String zzF = "";
    private String zzJ = "";
    private long zzL = -1;
    private long zzM = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = QueryKeys.FORCE_DECAY;
    private String zzV = QueryKeys.FORCE_DECAY;
    private long zzW = -1;
    private int zzX = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzY = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private mw9 zzag = c0.o();
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private String zzaq = QueryKeys.FORCE_DECAY;
    private long zzar = -1;
    private long zzaw = -1;
    private int zzax = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzay = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private String zzaz = QueryKeys.FORCE_DECAY;
    private mw9 zzaA = c0.o();
    private int zzaB = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private mw9 zzaC = c0.o();
    private String zzaE = "";
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaI = -1;
    private long zzaK = -1;
    private String zzaL = "";
    private String zzaN = "";
    private int zzaO = 2;
    private String zzaQ = "";
    private String zzaU = "";

    static {
        g1 g1Var = new g1();
        zzb = g1Var;
        c0.h(g1.class, g1Var);
    }

    private g1() {
    }

    static /* synthetic */ void A0(g1 g1Var, long j) {
        g1Var.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        g1Var.zzv = j;
    }

    static /* synthetic */ void B0(g1 g1Var, long j) {
        g1Var.zze |= 32768;
        g1Var.zzw = j;
    }

    static /* synthetic */ void C(g1 g1Var, long j) {
        g1Var.zzf |= 16;
        g1Var.zzR = j;
    }

    static /* synthetic */ void C0(g1 g1Var, long j) {
        g1Var.zze |= 65536;
        g1Var.zzx = j;
    }

    static /* synthetic */ void D0(g1 g1Var, long j) {
        g1Var.zze |= 524288;
        g1Var.zzA = j;
    }

    static /* synthetic */ void E(g1 g1Var, long j) {
        g1Var.zzf |= 32;
        g1Var.zzS = j;
    }

    static /* synthetic */ void E0(g1 g1Var, long j) {
        g1Var.zze |= Constants.MB;
        g1Var.zzB = j;
    }

    static /* synthetic */ void F(g1 g1Var, long j) {
        g1Var.zzf |= 64;
        g1Var.zzT = j;
    }

    static /* synthetic */ void F0(g1 g1Var, long j) {
        g1Var.zze |= 2097152;
        g1Var.zzC = j;
    }

    static /* synthetic */ void G(g1 g1Var, String str) {
        str.getClass();
        g1Var.zzf |= 128;
        g1Var.zzU = str;
    }

    static /* synthetic */ void H(g1 g1Var, String str) {
        str.getClass();
        g1Var.zzf |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        g1Var.zzV = str;
    }

    static /* synthetic */ void H0(g1 g1Var, String str) {
        str.getClass();
        g1Var.zze |= 4194304;
        g1Var.zzD = str;
    }

    static /* synthetic */ void I(g1 g1Var, long j) {
        g1Var.zzf |= ProgressEvent.PART_FAILED_EVENT_CODE;
        g1Var.zzZ = j;
    }

    static /* synthetic */ void I0(g1 g1Var, String str) {
        str.getClass();
        g1Var.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        g1Var.zzF = str;
    }

    static /* synthetic */ void J(g1 g1Var, long j) {
        g1Var.zzf |= 8192;
        g1Var.zzaa = j;
    }

    static /* synthetic */ void J0(g1 g1Var, long j) {
        g1Var.zze |= 33554432;
        g1Var.zzG = j;
    }

    static /* synthetic */ void K(g1 g1Var, long j) {
        g1Var.zzf |= Http2.INITIAL_MAX_FRAME_SIZE;
        g1Var.zzab = j;
    }

    static /* synthetic */ void K0(g1 g1Var, long j) {
        g1Var.zze |= 67108864;
        g1Var.zzH = j;
    }

    static /* synthetic */ void L(g1 g1Var, n nVar) {
        nVar.getClass();
        g1Var.zzaf = nVar;
        g1Var.zzf |= 262144;
    }

    static /* synthetic */ void L0(g1 g1Var, long j) {
        g1Var.zze |= 134217728;
        g1Var.zzI = j;
    }

    static /* synthetic */ void M(g1 g1Var, n nVar) {
        nVar.getClass();
        mw9 mw9Var = g1Var.zzag;
        if (!mw9Var.zzc()) {
            g1Var.zzag = c0.e(mw9Var);
        }
        g1Var.zzag.add(nVar);
    }

    static /* synthetic */ void M0(g1 g1Var, String str) {
        str.getClass();
        g1Var.zze |= 268435456;
        g1Var.zzJ = str;
    }

    static /* synthetic */ void O(g1 g1Var, o0 o0Var) {
        o0Var.getClass();
        g1Var.zzah = o0Var;
        g1Var.zzf |= 524288;
    }

    static /* synthetic */ void P(g1 g1Var, long j) {
        g1Var.zzf |= 2097152;
        g1Var.zzaj = j;
    }

    static /* synthetic */ void Q(g1 g1Var, long j) {
        g1Var.zzf |= 4194304;
        g1Var.zzak = j;
    }

    static /* synthetic */ void R(g1 g1Var, long j) {
        g1Var.zzf |= 8388608;
        g1Var.zzal = j;
    }

    static /* synthetic */ void S(g1 g1Var, long j) {
        g1Var.zzf |= 67108864;
        g1Var.zzao = j;
    }

    static /* synthetic */ void T(g1 g1Var, long j) {
        g1Var.zzf |= 134217728;
        g1Var.zzap = j;
    }

    static /* synthetic */ void U(g1 g1Var, String str) {
        str.getClass();
        g1Var.zzf |= 268435456;
        g1Var.zzaq = str;
    }

    static /* synthetic */ void V(g1 g1Var, h2 h2Var) {
        h2Var.getClass();
        g1Var.zzav = h2Var;
        g1Var.zzg |= 2;
    }

    static /* synthetic */ void W(g1 g1Var, long j) {
        g1Var.zzg |= 512;
        g1Var.zzaF = j;
    }

    public static h3 X() {
        return (h3) zzb.j();
    }

    static /* synthetic */ void Y(g1 g1Var, long j) {
        g1Var.zzg |= 1024;
        g1Var.zzaG = j;
    }

    static /* synthetic */ void Z(g1 g1Var, long j) {
        g1Var.zzg |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        g1Var.zzaH = j;
    }

    static /* synthetic */ void a0(g1 g1Var, long j) {
        g1Var.zzg |= ProgressEvent.PART_FAILED_EVENT_CODE;
        g1Var.zzaI = j;
    }

    static /* synthetic */ void b0(g1 g1Var, String str) {
        str.getClass();
        g1Var.zzg |= 32768;
        g1Var.zzaL = str;
    }

    static /* synthetic */ void c0(g1 g1Var, String str) {
        str.getClass();
        g1Var.zzg |= 131072;
        g1Var.zzaN = str;
    }

    static /* synthetic */ void d0(g1 g1Var, boolean z) {
        g1Var.zzg |= 524288;
        g1Var.zzaP = z;
    }

    static /* synthetic */ void e0(g1 g1Var, long j) {
        g1Var.zzg |= 2097152;
        g1Var.zzaR = j;
    }

    static /* synthetic */ void h0(g1 g1Var, int i) {
        g1Var.zzX = i - 1;
        g1Var.zzf |= 1024;
    }

    static /* synthetic */ void i0(g1 g1Var, int i) {
        g1Var.zzY = i - 1;
        g1Var.zzf |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
    }

    static /* synthetic */ void j0(g1 g1Var, int i) {
        g1Var.zzae = i - 1;
        g1Var.zzf |= 131072;
    }

    static /* synthetic */ void k0(g1 g1Var, int i) {
        g1Var.zzax = i - 1;
        g1Var.zzg |= 8;
    }

    static /* synthetic */ void l0(g1 g1Var, int i) {
        g1Var.zzay = i - 1;
        g1Var.zzg |= 16;
    }

    static /* synthetic */ void m0(g1 g1Var, int i) {
        g1Var.zzaO = 5;
        g1Var.zzg |= 262144;
    }

    public static g1 o0(byte[] bArr, ev9 ev9Var) {
        return (g1) c0.m(zzb, bArr, ev9Var);
    }

    static /* synthetic */ void r0(g1 g1Var, String str) {
        str.getClass();
        g1Var.zze |= 1;
        g1Var.zzh = str;
    }

    static /* synthetic */ void s(g1 g1Var, long j) {
        g1Var.zze |= 536870912;
        g1Var.zzK = j;
    }

    static /* synthetic */ void s0(g1 g1Var, String str) {
        g1Var.zze |= 2;
        g1Var.zzi = str;
    }

    static /* synthetic */ void t(g1 g1Var, long j) {
        g1Var.zze |= 1073741824;
        g1Var.zzL = j;
    }

    static /* synthetic */ void u(g1 g1Var, long j) {
        g1Var.zze |= RecyclerView.UNDEFINED_DURATION;
        g1Var.zzM = j;
    }

    static /* synthetic */ void u0(g1 g1Var, long j) {
        g1Var.zze |= 4;
        g1Var.zzj = j;
    }

    static /* synthetic */ void v(g1 g1Var, long j) {
        g1Var.zzf |= 2;
        g1Var.zzO = j;
    }

    static /* synthetic */ void v0(g1 g1Var, long j) {
        g1Var.zze |= 16;
        g1Var.zzl = j;
    }

    static /* synthetic */ void w(g1 g1Var, long j) {
        g1Var.zzf |= 4;
        g1Var.zzP = j;
    }

    static /* synthetic */ void w0(g1 g1Var, long j) {
        g1Var.zze |= 32;
        g1Var.zzm = j;
    }

    static /* synthetic */ void x(g1 g1Var, long j) {
        g1Var.zzf |= 8;
        g1Var.zzQ = j;
    }

    static /* synthetic */ void x0(g1 g1Var, long j) {
        g1Var.zze |= 1024;
        g1Var.zzr = j;
    }

    static /* synthetic */ void y0(g1 g1Var, long j) {
        g1Var.zze |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        g1Var.zzs = j;
    }

    static /* synthetic */ void z0(g1 g1Var, long j) {
        g1Var.zze |= 8192;
        g1Var.zzu = j;
    }

    public final boolean f0() {
        return (this.zze & 4194304) != 0;
    }

    public final boolean g0() {
        return (this.zzg & 4194304) != 0;
    }

    public final f2 p0() {
        f2 f2Var = this.zzaS;
        return f2Var == null ? f2.u() : f2Var;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            iw9 iw9Var = t6.a;
            iw9 iw9Var2 = c2.a;
            return c0.g(zzb, "\u0001\\\u0000\u0003\u0001Į\\\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂP\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈQ\u0019ဂU\u001aဌR\u001bဈ\u0016\u001cဇS\u001dဈ\u0018\u001eဈT\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOÉဉVĭဂWĮဈX", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaM", "zzB", "zzC", "zzaN", "zzaR", "zzaO", iw9Var, "zzD", "zzaP", "zzF", "zzaQ", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", n.class, "zzS", "zzT", "zzU", "zzV", "zzX", iw9Var2, "zzY", iw9Var2, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", iw9Var2, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", b2.a, "zzat", d2.a, "zzaq", "zzau", y3.a, "zzav", "zzaw", "zzam", "zzan", "zzax", iw9Var2, "zzW", "zzE", "zzay", iw9Var2, "zzaz", "zzaA", v8.class, "zzaB", iw9Var2, "zzaC", y5.class, "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaS", "zzaT", "zzaU"});
        }
        if (i2 == 3) {
            return new g1();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new h3(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String q0() {
        return this.zzD;
    }
}
