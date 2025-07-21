package com.google.android.gms.internal.ads;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.boa;
import defpackage.k1f;
import defpackage.l1f;
import defpackage.o0f;
import defpackage.p0f;
import defpackage.x1f;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class c4 extends yh implements x1f {
    private static final k1f zzb = new a4();
    private static final c4 zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private p0f zzj = yh.t();
    private x3 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        c4 c4Var = new c4();
        zzd = c4Var;
        yh.D(c4.class, c4Var);
    }

    private c4() {
    }

    static /* synthetic */ void L(c4 c4Var, int i) {
        c4Var.zzm = i - 1;
        c4Var.zze |= 64;
    }

    static /* synthetic */ void M(c4 c4Var, int i) {
        c4Var.zzn = i - 1;
        c4Var.zze |= 128;
    }

    static /* synthetic */ void N(c4 c4Var, int i) {
        c4Var.zzp = i - 1;
        c4Var.zze |= 512;
    }

    public static b4 T() {
        return (b4) zzd.k();
    }

    public static c4 V(byte[] bArr) {
        return (c4) yh.p(zzd, bArr);
    }

    static /* synthetic */ void Y(c4 c4Var, long j) {
        c4Var.zze |= 1;
        c4Var.zzf = j;
    }

    static /* synthetic */ void Z(c4 c4Var, long j) {
        c4Var.zze |= 4;
        c4Var.zzh = j;
    }

    static /* synthetic */ void a0(c4 c4Var, long j) {
        c4Var.zze |= 8;
        c4Var.zzi = j;
    }

    static /* synthetic */ void b0(c4 c4Var, Iterable iterable) {
        p0f p0fVar = c4Var.zzj;
        if (!p0fVar.zzc()) {
            c4Var.zzj = yh.u(p0fVar);
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            c4Var.zzj.zzh(((zzbcn) it2.next()).zza());
        }
    }

    static /* synthetic */ void c0(c4 c4Var, x3 x3Var) {
        x3Var.getClass();
        c4Var.zzk = x3Var;
        c4Var.zze |= 16;
    }

    static /* synthetic */ void d0(c4 c4Var, int i) {
        c4Var.zze |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        c4Var.zzo = i;
    }

    static /* synthetic */ void e0(c4 c4Var, zzbec zzbecVar) {
        c4Var.zzq = zzbecVar.zza();
        c4Var.zze |= 1024;
    }

    static /* synthetic */ void f0(c4 c4Var, long j) {
        c4Var.zze |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        c4Var.zzr = j;
    }

    static /* synthetic */ void l0(c4 c4Var, int i) {
        c4Var.zzg = i - 1;
        c4Var.zze |= 2;
    }

    static /* synthetic */ void m0(c4 c4Var, int i) {
        c4Var.zzl = i - 1;
        c4Var.zze |= 32;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            o0f o0fVar = l3.a;
            return yh.A(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", o0fVar, "zzh", "zzi", "zzj", x2.a, "zzk", "zzl", o0fVar, "zzm", o0fVar, "zzn", o0fVar, "zzo", "zzp", o0fVar, "zzq", f4.a, "zzr"});
        }
        if (i2 == 3) {
            return new c4();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new b4(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }

    public final int O() {
        return this.zzo;
    }

    public final long P() {
        return this.zzi;
    }

    public final long Q() {
        return this.zzh;
    }

    public final long R() {
        return this.zzf;
    }

    public final x3 S() {
        x3 x3Var = this.zzk;
        return x3Var == null ? x3.N() : x3Var;
    }

    public final zzbec W() {
        zzbec zzb2 = zzbec.zzb(this.zzq);
        return zzb2 == null ? zzbec.UNSPECIFIED : zzb2;
    }

    public final List X() {
        return new l1f(this.zzj, zzb);
    }

    public final int g0() {
        int a = boa.a(this.zzm);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int h0() {
        int a = boa.a(this.zzn);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int i0() {
        int a = boa.a(this.zzp);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int j0() {
        int a = boa.a(this.zzg);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int k0() {
        int a = boa.a(this.zzl);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
