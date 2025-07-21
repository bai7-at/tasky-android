package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.ada;
import defpackage.n1f;
import defpackage.o0f;
import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final class n1 extends yh implements x1f {
    private static final n1 zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private p1 zzM;
    private i1 zzaC;
    private long zzaI;
    private b1 zzaL;
    private d1 zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private w1 zzaW;
    private k1 zzae;
    private m1 zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private y1 zzau;
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
    private n1f zzaf = yh.x();
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
    private n1f zzaz = yh.x();
    private int zzaA = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private n1f zzaB = yh.x();
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
        n1 n1Var = new n1();
        zzb = n1Var;
        yh.D(n1.class, n1Var);
    }

    private n1() {
    }

    static /* synthetic */ void A0(n1 n1Var, int i) {
        n1Var.zzad = i - 1;
        n1Var.zze |= 131072;
    }

    static /* synthetic */ void B0(n1 n1Var, int i) {
        n1Var.zzaw = i - 1;
        n1Var.zzf |= 8;
    }

    static /* synthetic */ void C0(n1 n1Var, int i) {
        n1Var.zzax = i - 1;
        n1Var.zzf |= 16;
    }

    static /* synthetic */ void D0(n1 n1Var, int i) {
        n1Var.zzaP = i - 1;
        n1Var.zzf |= Constants.MB;
    }

    static /* synthetic */ void E0(n1 n1Var, int i) {
        n1Var.zzaS = 5;
        n1Var.zzf |= 8388608;
    }

    public static n1 G0() {
        return zzb;
    }

    public static n1 I0(byte[] bArr, ph phVar) {
        return (n1) yh.s(zzb, bArr, phVar);
    }

    static /* synthetic */ void L(n1 n1Var, long j) {
        n1Var.zzd |= 134217728;
        n1Var.zzH = j;
    }

    static /* synthetic */ void M(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzd |= 268435456;
        n1Var.zzI = str;
    }

    static /* synthetic */ void M0(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzd |= 1;
        n1Var.zzg = str;
    }

    static /* synthetic */ void N(n1 n1Var, long j) {
        n1Var.zzd |= 536870912;
        n1Var.zzJ = j;
    }

    static /* synthetic */ void N0(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzd |= 2;
        n1Var.zzh = str;
    }

    static /* synthetic */ void O(n1 n1Var, long j) {
        n1Var.zzd |= 1073741824;
        n1Var.zzK = j;
    }

    static /* synthetic */ void O0(n1 n1Var, long j) {
        n1Var.zzd |= 4;
        n1Var.zzi = j;
    }

    static /* synthetic */ void P(n1 n1Var, long j) {
        n1Var.zzd |= RecyclerView.UNDEFINED_DURATION;
        n1Var.zzL = j;
    }

    static /* synthetic */ void P0(n1 n1Var, long j) {
        n1Var.zzd |= 16;
        n1Var.zzk = j;
    }

    static /* synthetic */ void Q(n1 n1Var, long j) {
        n1Var.zze |= 2;
        n1Var.zzN = j;
    }

    static /* synthetic */ void Q0(n1 n1Var, long j) {
        n1Var.zzd |= 32;
        n1Var.zzl = j;
    }

    static /* synthetic */ void R(n1 n1Var, long j) {
        n1Var.zze |= 4;
        n1Var.zzO = j;
    }

    static /* synthetic */ void R0(n1 n1Var, long j) {
        n1Var.zzd |= 1024;
        n1Var.zzq = j;
    }

    static /* synthetic */ void S(n1 n1Var, long j) {
        n1Var.zze |= 8;
        n1Var.zzP = j;
    }

    static /* synthetic */ void S0(n1 n1Var, long j) {
        n1Var.zzd |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        n1Var.zzr = j;
    }

    static /* synthetic */ void T(n1 n1Var, long j) {
        n1Var.zze |= 16;
        n1Var.zzQ = j;
    }

    static /* synthetic */ void T0(n1 n1Var, long j) {
        n1Var.zzd |= 8192;
        n1Var.zzt = j;
    }

    static /* synthetic */ void U(n1 n1Var, long j) {
        n1Var.zze |= 32;
        n1Var.zzR = j;
    }

    static /* synthetic */ void U0(n1 n1Var, long j) {
        n1Var.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        n1Var.zzu = j;
    }

    static /* synthetic */ void V(n1 n1Var, long j) {
        n1Var.zze |= 64;
        n1Var.zzS = j;
    }

    static /* synthetic */ void V0(n1 n1Var, long j) {
        n1Var.zzd |= 32768;
        n1Var.zzv = j;
    }

    static /* synthetic */ void W(n1 n1Var, String str) {
        str.getClass();
        n1Var.zze |= 128;
        n1Var.zzT = str;
    }

    static /* synthetic */ void W0(n1 n1Var, long j) {
        n1Var.zzd |= 65536;
        n1Var.zzw = j;
    }

    static /* synthetic */ void X(n1 n1Var, String str) {
        str.getClass();
        n1Var.zze |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        n1Var.zzU = str;
    }

    static /* synthetic */ void X0(n1 n1Var, long j) {
        n1Var.zzd |= 524288;
        n1Var.zzz = j;
    }

    static /* synthetic */ void Y(n1 n1Var, long j) {
        n1Var.zze |= ProgressEvent.PART_FAILED_EVENT_CODE;
        n1Var.zzY = j;
    }

    static /* synthetic */ void Y0(n1 n1Var, long j) {
        n1Var.zzd |= Constants.MB;
        n1Var.zzA = j;
    }

    static /* synthetic */ void Z(n1 n1Var, long j) {
        n1Var.zze |= 8192;
        n1Var.zzZ = j;
    }

    static /* synthetic */ void Z0(n1 n1Var, long j) {
        n1Var.zzd |= 2097152;
        n1Var.zzB = j;
    }

    static /* synthetic */ void a0(n1 n1Var, long j) {
        n1Var.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        n1Var.zzaa = j;
    }

    static /* synthetic */ void a1(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzd |= 4194304;
        n1Var.zzC = str;
    }

    static /* synthetic */ void b0(n1 n1Var, k1 k1Var) {
        k1Var.getClass();
        n1Var.zzae = k1Var;
        n1Var.zze |= 262144;
    }

    static /* synthetic */ void b1(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        n1Var.zzE = str;
    }

    static /* synthetic */ void c0(n1 n1Var, k1 k1Var) {
        k1Var.getClass();
        n1f n1fVar = n1Var.zzaf;
        if (!n1fVar.zzc()) {
            n1Var.zzaf = yh.y(n1fVar);
        }
        n1Var.zzaf.add(k1Var);
    }

    static /* synthetic */ void c1(n1 n1Var, long j) {
        n1Var.zzd |= 33554432;
        n1Var.zzF = j;
    }

    static /* synthetic */ void d1(n1 n1Var, long j) {
        n1Var.zzd |= 67108864;
        n1Var.zzG = j;
    }

    static /* synthetic */ void e0(n1 n1Var, m1 m1Var) {
        m1Var.getClass();
        n1Var.zzag = m1Var;
        n1Var.zze |= 524288;
    }

    static /* synthetic */ void f0(n1 n1Var, long j) {
        n1Var.zze |= 2097152;
        n1Var.zzai = j;
    }

    static /* synthetic */ void g0(n1 n1Var, long j) {
        n1Var.zze |= 4194304;
        n1Var.zzaj = j;
    }

    static /* synthetic */ void h0(n1 n1Var, long j) {
        n1Var.zze |= 8388608;
        n1Var.zzak = j;
    }

    static /* synthetic */ void i0(n1 n1Var, long j) {
        n1Var.zze |= 67108864;
        n1Var.zzan = j;
    }

    static /* synthetic */ void j0(n1 n1Var, long j) {
        n1Var.zze |= 134217728;
        n1Var.zzao = j;
    }

    static /* synthetic */ void k0(n1 n1Var, String str) {
        str.getClass();
        n1Var.zze |= 268435456;
        n1Var.zzap = str;
    }

    public static u0 l0() {
        return (u0) zzb.k();
    }

    static /* synthetic */ void m0(n1 n1Var, long j) {
        n1Var.zzf |= 512;
        n1Var.zzaE = j;
    }

    static /* synthetic */ void n0(n1 n1Var, long j) {
        n1Var.zzf |= 1024;
        n1Var.zzaF = j;
    }

    static /* synthetic */ void o0(n1 n1Var, long j) {
        n1Var.zzf |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        n1Var.zzaG = j;
    }

    static /* synthetic */ void p0(n1 n1Var, long j) {
        n1Var.zzf |= ProgressEvent.PART_FAILED_EVENT_CODE;
        n1Var.zzaH = j;
    }

    static /* synthetic */ void q0(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzf |= 32768;
        n1Var.zzaK = str;
    }

    static /* synthetic */ void r0(n1 n1Var, String str) {
        str.getClass();
        n1Var.zzf |= 4194304;
        n1Var.zzaR = str;
    }

    static /* synthetic */ void s0(n1 n1Var, boolean z) {
        n1Var.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        n1Var.zzaT = z;
    }

    static /* synthetic */ void t0(n1 n1Var, long j) {
        n1Var.zzf |= 67108864;
        n1Var.zzaV = j;
    }

    static /* synthetic */ void y0(n1 n1Var, int i) {
        n1Var.zzW = i - 1;
        n1Var.zze |= 1024;
    }

    static /* synthetic */ void z0(n1 n1Var, int i) {
        n1Var.zzX = i - 1;
        n1Var.zze |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            o0f o0fVar = y0.a;
            o0f o0fVar2 = t1.a;
            return yh.A(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", o0fVar, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", k1.class, "zzR", "zzS", "zzT", "zzU", "zzW", o0fVar2, "zzX", o0fVar2, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", o0fVar2, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", s1.a, "zzas", u1.a, "zzap", "zzat", v0.a, "zzau", "zzav", "zzal", "zzam", "zzaw", o0fVar2, "zzV", "zzD", "zzax", o0fVar2, "zzay", "zzaz", g1.class, "zzaA", o0fVar2, "zzaB", x0.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", e1.a, "zzaW", "zzaX", "zzaY"});
        }
        if (i2 == 3) {
            return new n1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new u0(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final w1 J0() {
        w1 w1Var = this.zzaW;
        return w1Var == null ? w1.N() : w1Var;
    }

    public final String K0() {
        return this.zzaR;
    }

    public final String L0() {
        return this.zzC;
    }

    public final boolean u0() {
        return this.zzaT;
    }

    public final boolean v0() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean w0() {
        return (this.zzf & 134217728) != 0;
    }

    public final int x0() {
        int a = ada.a(this.zzaS);
        if (a == 0) {
            return 3;
        }
        return a;
    }
}
