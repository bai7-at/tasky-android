package com.google.android.gms.internal.measurement;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.eef;
import defpackage.nbf;
import defpackage.tbf;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final class t0 extends j2 implements eef {
    public static final /* synthetic */ int zza = 0;
    private static final t0 zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private w0 zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private p0 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private tbf zzi = j2.l();
    private tbf zzj = j2.l();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzz = "";
    private String zzB = "";
    private String zzE = "";
    private String zzF = "";
    private tbf zzH = j2.l();
    private String zzI = "";
    private String zzM = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzS = "";
    private nbf zzU = j2.i();
    private String zzX = "";
    private String zzY = "";
    private String zzab = "";
    private String zzae = "";
    private tbf zzaf = j2.l();
    private String zzag = "";

    static {
        t0 t0Var = new t0();
        zze = t0Var;
        j2.p(t0.class, t0Var);
    }

    private t0() {
    }

    static /* synthetic */ void A0(t0 t0Var, Iterable iterable) {
        t0Var.b1();
        p1.c(iterable, t0Var.zzi);
    }

    static /* synthetic */ void B0(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzg |= 8192;
        t0Var.zzae = str;
    }

    static /* synthetic */ void C0(t0 t0Var) {
        t0Var.zzg &= -8193;
        t0Var.zzae = zze.zzae;
    }

    static /* synthetic */ void D0(t0 t0Var, Iterable iterable) {
        tbf tbfVar = t0Var.zzaf;
        if (!tbfVar.zzc()) {
            t0Var.zzaf = j2.m(tbfVar);
        }
        p1.c(iterable, t0Var.zzaf);
    }

    static /* synthetic */ void F0(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzg |= Http2.INITIAL_MAX_FRAME_SIZE;
        t0Var.zzag = str;
    }

    static /* synthetic */ void G0(t0 t0Var, int i) {
        t0Var.b1();
        t0Var.zzi.remove(i);
    }

    static /* synthetic */ void H(t0 t0Var, long j) {
        t0Var.zzf |= 1073741824;
        t0Var.zzO = j;
    }

    static /* synthetic */ void H0(t0 t0Var, int i, c1 c1Var) {
        c1Var.getClass();
        t0Var.c1();
        t0Var.zzj.set(i, c1Var);
    }

    static /* synthetic */ void I(t0 t0Var) {
        t0Var.zzf &= Integer.MAX_VALUE;
        t0Var.zzP = zze.zzP;
    }

    static /* synthetic */ void I0(t0 t0Var, c1 c1Var) {
        c1Var.getClass();
        t0Var.c1();
        t0Var.zzj.add(c1Var);
    }

    static /* synthetic */ void J(t0 t0Var, int i) {
        t0Var.zzg |= 2;
        t0Var.zzR = i;
    }

    static /* synthetic */ void J0(t0 t0Var, Iterable iterable) {
        t0Var.c1();
        p1.c(iterable, t0Var.zzj);
    }

    static /* synthetic */ void K(t0 t0Var, int i, j0 j0Var) {
        j0Var.getClass();
        t0Var.b1();
        t0Var.zzi.set(i, j0Var);
    }

    static /* synthetic */ void L0(t0 t0Var, int i) {
        t0Var.c1();
        t0Var.zzj.remove(i);
    }

    static /* synthetic */ void M(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzg |= 4;
        t0Var.zzS = str;
    }

    static /* synthetic */ void M0(t0 t0Var, long j) {
        t0Var.zzf |= 2;
        t0Var.zzk = j;
    }

    static /* synthetic */ void N(t0 t0Var, w0 w0Var) {
        w0Var.getClass();
        t0Var.zzT = w0Var;
        t0Var.zzg |= 8;
    }

    static /* synthetic */ void N0(t0 t0Var, long j) {
        t0Var.zzf |= 4;
        t0Var.zzl = j;
    }

    static /* synthetic */ void O0(t0 t0Var, long j) {
        t0Var.zzf |= 8;
        t0Var.zzm = j;
    }

    public static s0 O1() {
        return (s0) zze.f();
    }

    static /* synthetic */ void P0(t0 t0Var, long j) {
        t0Var.zzf |= 16;
        t0Var.zzn = j;
    }

    static /* synthetic */ void Q0(t0 t0Var) {
        t0Var.zzf &= -17;
        t0Var.zzn = 0L;
    }

    static /* synthetic */ void R0(t0 t0Var, long j) {
        t0Var.zzf |= 32;
        t0Var.zzo = j;
    }

    static /* synthetic */ void S(t0 t0Var, Iterable iterable) {
        nbf nbfVar = t0Var.zzU;
        if (!nbfVar.zzc()) {
            int size = nbfVar.size();
            t0Var.zzU = nbfVar.zzd(size == 0 ? 10 : size + size);
        }
        p1.c(iterable, t0Var.zzU);
    }

    static /* synthetic */ void S0(t0 t0Var) {
        t0Var.zzf &= -33;
        t0Var.zzo = 0L;
    }

    static /* synthetic */ void T(t0 t0Var, j0 j0Var) {
        j0Var.getClass();
        t0Var.b1();
        t0Var.zzi.add(j0Var);
    }

    static /* synthetic */ void T0(t0 t0Var, String str) {
        t0Var.zzf |= 64;
        t0Var.zzp = "android";
    }

    static /* synthetic */ void U(t0 t0Var, long j) {
        t0Var.zzg |= 16;
        t0Var.zzV = j;
    }

    static /* synthetic */ void U0(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= 128;
        t0Var.zzq = str;
    }

    static /* synthetic */ void V(t0 t0Var, long j) {
        t0Var.zzg |= 32;
        t0Var.zzW = j;
    }

    static /* synthetic */ void V0(t0 t0Var) {
        t0Var.zzf &= -129;
        t0Var.zzq = zze.zzq;
    }

    static /* synthetic */ void W0(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        t0Var.zzr = str;
    }

    static /* synthetic */ void X(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        t0Var.zzu = str;
    }

    static /* synthetic */ void X0(t0 t0Var) {
        t0Var.zzf &= -257;
        t0Var.zzr = zze.zzr;
    }

    static /* synthetic */ void Y(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= ProgressEvent.PART_FAILED_EVENT_CODE;
        t0Var.zzv = str;
    }

    static /* synthetic */ void Y0(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= 512;
        t0Var.zzs = str;
    }

    static /* synthetic */ void Z(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= 8192;
        t0Var.zzw = str;
    }

    static /* synthetic */ void Z0(t0 t0Var, int i) {
        t0Var.zzf |= 1024;
        t0Var.zzt = i;
    }

    static /* synthetic */ void a0(t0 t0Var, long j) {
        t0Var.zzf |= Http2.INITIAL_MAX_FRAME_SIZE;
        t0Var.zzx = j;
    }

    static /* synthetic */ void b0(t0 t0Var, long j) {
        t0Var.zzf |= 32768;
        t0Var.zzy = 64000L;
    }

    private final void b1() {
        tbf tbfVar = this.zzi;
        if (tbfVar.zzc()) {
            return;
        }
        this.zzi = j2.m(tbfVar);
    }

    static /* synthetic */ void c0(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= 65536;
        t0Var.zzz = str;
    }

    private final void c1() {
        tbf tbfVar = this.zzj;
        if (tbfVar.zzc()) {
            return;
        }
        this.zzj = j2.m(tbfVar);
    }

    static /* synthetic */ void d0(t0 t0Var) {
        t0Var.zzf &= -65537;
        t0Var.zzz = zze.zzz;
    }

    static /* synthetic */ void f0(t0 t0Var, boolean z) {
        t0Var.zzf |= 131072;
        t0Var.zzA = z;
    }

    static /* synthetic */ void g0(t0 t0Var) {
        t0Var.zzf &= -131073;
        t0Var.zzA = false;
    }

    static /* synthetic */ void h0(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= 262144;
        t0Var.zzB = str;
    }

    static /* synthetic */ void i0(t0 t0Var) {
        t0Var.zzf &= -262145;
        t0Var.zzB = zze.zzB;
    }

    static /* synthetic */ void j0(t0 t0Var, long j) {
        t0Var.zzf |= 524288;
        t0Var.zzC = j;
    }

    static /* synthetic */ void k0(t0 t0Var, int i) {
        t0Var.zzf |= Constants.MB;
        t0Var.zzD = i;
    }

    static /* synthetic */ void l0(t0 t0Var, String str) {
        t0Var.zzf |= 2097152;
        t0Var.zzE = str;
    }

    static /* synthetic */ void n0(t0 t0Var) {
        t0Var.zzf &= -2097153;
        t0Var.zzE = zze.zzE;
    }

    static /* synthetic */ void o0(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= 4194304;
        t0Var.zzF = str;
    }

    static /* synthetic */ void p0(t0 t0Var, boolean z) {
        t0Var.zzf |= 8388608;
        t0Var.zzG = z;
    }

    static /* synthetic */ void q0(t0 t0Var, Iterable iterable) {
        tbf tbfVar = t0Var.zzH;
        if (!tbfVar.zzc()) {
            t0Var.zzH = j2.m(tbfVar);
        }
        p1.c(iterable, t0Var.zzH);
    }

    static /* synthetic */ void s0(t0 t0Var, String str) {
        str.getClass();
        t0Var.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        t0Var.zzI = str;
    }

    static /* synthetic */ void t0(t0 t0Var, int i) {
        t0Var.zzf |= 33554432;
        t0Var.zzJ = i;
    }

    static /* synthetic */ void u0(t0 t0Var, int i) {
        t0Var.zzf |= 1;
        t0Var.zzh = 1;
    }

    static /* synthetic */ void v0(t0 t0Var) {
        t0Var.zzf &= -268435457;
        t0Var.zzM = zze.zzM;
    }

    static /* synthetic */ void w0(t0 t0Var, long j) {
        t0Var.zzf |= 536870912;
        t0Var.zzN = j;
    }

    static /* synthetic */ void z0(t0 t0Var, String str) {
        t0Var.zzg |= 128;
        t0Var.zzY = str;
    }

    public final String A() {
        return this.zzp;
    }

    public final int A1() {
        return this.zzt;
    }

    public final String B() {
        return this.zzz;
    }

    public final int B1() {
        return this.zzj.size();
    }

    public final String C() {
        return this.zzae;
    }

    public final long C1() {
        return this.zzO;
    }

    public final String D() {
        return this.zzs;
    }

    public final long D1() {
        return this.zzN;
    }

    public final List E() {
        return this.zzH;
    }

    public final long E1() {
        return this.zzC;
    }

    public final List F() {
        return this.zzi;
    }

    public final long F1() {
        return this.zzV;
    }

    public final List G() {
        return this.zzj;
    }

    public final long G1() {
        return this.zzm;
    }

    public final long H1() {
        return this.zzx;
    }

    public final long I1() {
        return this.zzo;
    }

    public final long J1() {
        return this.zzn;
    }

    public final long K1() {
        return this.zzl;
    }

    public final long L1() {
        return this.zzk;
    }

    public final long M1() {
        return this.zzy;
    }

    public final j0 N1(int i) {
        return (j0) this.zzi.get(i);
    }

    public final c1 Q1(int i) {
        return (c1) this.zzj.get(i);
    }

    public final String R1() {
        return this.zzS;
    }

    public final String S1() {
        return this.zzv;
    }

    public final String T1() {
        return this.zzB;
    }

    public final int W() {
        return this.zzJ;
    }

    public final int a1() {
        return this.zzD;
    }

    public final boolean d1() {
        return (this.zzf & 1073741824) != 0;
    }

    public final boolean e1() {
        return (this.zzf & 33554432) != 0;
    }

    public final boolean f1() {
        return (this.zzf & Constants.MB) != 0;
    }

    public final boolean g1() {
        return (this.zzf & 536870912) != 0;
    }

    public final boolean h1() {
        return (this.zzg & 128) != 0;
    }

    public final boolean i1() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean j1() {
        return (this.zzg & 16) != 0;
    }

    public final boolean k1() {
        return (this.zzf & 8) != 0;
    }

    public final boolean l1() {
        return (this.zzf & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
    }

    public final boolean m1() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean n1() {
        return (this.zzf & 32) != 0;
    }

    public final boolean o1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean p1() {
        return (this.zzf & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", j0.class, "zzj", c1.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", f0.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", b0.a, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        if (i2 == 3) {
            return new t0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new s0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    public final boolean q1() {
        return (this.zzg & 2) != 0;
    }

    public final String r() {
        return this.zzu;
    }

    public final boolean r1() {
        return (this.zzf & 8388608) != 0;
    }

    public final String s() {
        return this.zzw;
    }

    public final boolean s1() {
        return (this.zzg & 8192) != 0;
    }

    public final String t() {
        return this.zzY;
    }

    public final boolean t1() {
        return (this.zzf & 4) != 0;
    }

    public final String u() {
        return this.zzr;
    }

    public final boolean u1() {
        return (this.zzf & 1024) != 0;
    }

    public final String v() {
        return this.zzP;
    }

    public final boolean v1() {
        return (this.zzf & 2) != 0;
    }

    public final String w() {
        return this.zzI;
    }

    public final boolean w1() {
        return (this.zzf & 32768) != 0;
    }

    public final String x() {
        return this.zzF;
    }

    public final boolean x0() {
        return this.zzA;
    }

    public final int x1() {
        return this.zzi.size();
    }

    public final String y() {
        return this.zzE;
    }

    public final boolean y0() {
        return this.zzG;
    }

    public final int y1() {
        return this.zzh;
    }

    public final String z() {
        return this.zzq;
    }

    public final int z1() {
        return this.zzR;
    }
}
