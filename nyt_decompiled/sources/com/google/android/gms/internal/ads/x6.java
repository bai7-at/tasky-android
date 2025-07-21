package com.google.android.gms.internal.ads;

import defpackage.k1f;
import defpackage.m1f;
import defpackage.p0f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class x6 extends yh implements x1f {
    private static final k1f zzb = new v6();
    private static final x6 zzd;
    private int zzB;
    private int zzC;
    private long zzD;
    private int zzE;
    private long zzQ;
    private int zzR;
    private int zzS;
    private i7 zzT;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private boolean zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private int zzx;
    private String zzh = "";
    private p0f zzl = yh.t();
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzy = "";
    private String zzz = "";
    private m1f zzA = yh.v();
    private String zzF = "";
    private String zzG = "";
    private String zzH = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";

    static {
        x6 x6Var = new x6();
        zzd = x6Var;
        yh.D(x6.class, x6Var);
    }

    private x6() {
    }

    public static w6 L() {
        return (w6) zzd.k();
    }

    static /* synthetic */ void N(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzO = str;
    }

    static /* synthetic */ void O(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzP = str;
    }

    static /* synthetic */ void S(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzs = str;
    }

    static /* synthetic */ void T(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzv = str;
    }

    static /* synthetic */ void U(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzw = str;
    }

    static /* synthetic */ void W(x6 x6Var, Iterable iterable) {
        m1f m1fVar = x6Var.zzA;
        if (!m1fVar.zzc()) {
            x6Var.zzA = yh.w(m1fVar);
        }
        rg.g(iterable, x6Var.zzA);
    }

    static /* synthetic */ void Z(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzF = str;
    }

    static /* synthetic */ void a0(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzG = str;
    }

    static /* synthetic */ void b0(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzK = str;
    }

    static /* synthetic */ void d0(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzM = str;
    }

    static /* synthetic */ void e0(x6 x6Var, String str) {
        str.getClass();
        x6Var.zzN = str;
    }

    static /* synthetic */ void h0(x6 x6Var, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        x6Var.zzB = i - 2;
    }

    static /* synthetic */ void i0(x6 x6Var, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        x6Var.zzE = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzd, "\u0000)\u0000\u0001\u0001))\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0000", new Object[]{"zze", "zzf", "zzm", "zzn", "zzr", "zzs", "zzv", "zzw", "zzx", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzt", "zzu", "zzy", "zzz", "zzA", "zzH", "zzI", "zzJ", "zzQ", "zzh", "zzi", "zzj", "zzk", "zzo", "zzp", "zzq", "zzl", "zzR", "zzS", "zzg", "zzT"});
        }
        if (i2 == 3) {
            return new x6();
        }
        v6 v6Var = null;
        if (i2 == 4) {
            return new w6(v6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
