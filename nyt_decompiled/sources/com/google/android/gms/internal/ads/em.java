package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;
import java.util.List;

/* loaded from: classes3.dex */
public final class em extends yh implements x1f {
    private static final em zzb;
    private ok zzB;
    private gk zzD;
    private hl zzF;
    private int zzG;
    private long zzJ;
    private dm zzK;
    private int zzd;
    private int zze;
    private int zzf;
    private kk zzj;
    private ql zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private wl zzu;
    private boolean zzv;
    private am zzz;
    private byte zzL = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private n1f zzk = yh.x();
    private n1f zzl = yh.x();
    private String zzm = "";
    private n1f zzp = yh.x();
    private String zzq = "";
    private zzgyl zzt = zzgyl.a;
    private String zzw = "";
    private n1f zzx = yh.x();
    private n1f zzy = yh.x();
    private n1f zzA = yh.x();
    private String zzC = "";
    private n1f zzE = yh.x();
    private n1f zzH = yh.x();
    private n1f zzI = yh.x();

    static {
        em emVar = new em();
        zzb = emVar;
        yh.D(em.class, emVar);
    }

    private em() {
    }

    public static ik L() {
        return (ik) zzb.k();
    }

    static /* synthetic */ void Q(em emVar, String str) {
        str.getClass();
        emVar.zzd |= 4;
        emVar.zzg = str;
    }

    static /* synthetic */ void R(em emVar, String str) {
        str.getClass();
        emVar.zzd |= 8;
        emVar.zzh = str;
    }

    static /* synthetic */ void S(em emVar, kk kkVar) {
        kkVar.getClass();
        emVar.zzj = kkVar;
        emVar.zzd |= 32;
    }

    static /* synthetic */ void T(em emVar, ul ulVar) {
        ulVar.getClass();
        n1f n1fVar = emVar.zzk;
        if (!n1fVar.zzc()) {
            emVar.zzk = yh.y(n1fVar);
        }
        emVar.zzk.add(ulVar);
    }

    static /* synthetic */ void U(em emVar, String str) {
        emVar.zzd |= 64;
        emVar.zzm = str;
    }

    static /* synthetic */ void V(em emVar) {
        emVar.zzd &= -65;
        emVar.zzm = zzb.zzm;
    }

    static /* synthetic */ void W(em emVar, ql qlVar) {
        qlVar.getClass();
        emVar.zzn = qlVar;
        emVar.zzd |= 128;
    }

    static /* synthetic */ void X(em emVar, wl wlVar) {
        wlVar.getClass();
        emVar.zzu = wlVar;
        emVar.zzd |= 8192;
    }

    static /* synthetic */ void Y(em emVar, Iterable iterable) {
        n1f n1fVar = emVar.zzx;
        if (!n1fVar.zzc()) {
            emVar.zzx = yh.y(n1fVar);
        }
        rg.g(iterable, emVar.zzx);
    }

    static /* synthetic */ void Z(em emVar, Iterable iterable) {
        n1f n1fVar = emVar.zzy;
        if (!n1fVar.zzc()) {
            emVar.zzy = yh.y(n1fVar);
        }
        rg.g(iterable, emVar.zzy);
    }

    static /* synthetic */ void a0(em emVar, int i) {
        emVar.zze = i - 1;
        emVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzL);
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001!\u0000\u0001\u0001!!\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", ul.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", rl.a, "zzf", hk.a, "zzj", "zzm", "zzn", "zzt", "zzl", im.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", om.class, "zzB", "zzC", "zzD", "zzE", sk.class, "zzF", "zzG", yl.a, "zzH", kl.class, "zzI", nl.class, "zzJ", "zzK"});
        }
        if (i2 == 3) {
            return new em();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new ik(wjVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzL = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String N() {
        return this.zzm;
    }

    public final String O() {
        return this.zzg;
    }

    public final List P() {
        return this.zzk;
    }
}
