package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.p0f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class ul extends yh implements x1f {
    private static final ul zzb;
    private int zzd;
    private int zze;
    private yk zzg;
    private cl zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private p0f zzj = yh.t();
    private String zzk = "";
    private n1f zzm = yh.x();

    static {
        ul ulVar = new ul();
        zzb = ulVar;
        yh.D(ul.class, ulVar);
    }

    private ul() {
    }

    public static tl M() {
        return (tl) zzb.k();
    }

    static /* synthetic */ void P(ul ulVar, int i) {
        ulVar.zzd |= 1;
        ulVar.zze = i;
    }

    static /* synthetic */ void Q(ul ulVar, String str) {
        str.getClass();
        ulVar.zzd |= 2;
        ulVar.zzf = str;
    }

    static /* synthetic */ void R(ul ulVar, yk ykVar) {
        ykVar.getClass();
        ulVar.zzg = ykVar;
        ulVar.zzd |= 4;
    }

    static /* synthetic */ void S(ul ulVar, String str) {
        str.getClass();
        n1f n1fVar = ulVar.zzm;
        if (!n1fVar.zzc()) {
            ulVar.zzm = yh.y(n1fVar);
        }
        ulVar.zzm.add(str);
    }

    static /* synthetic */ void T(ul ulVar, int i) {
        ulVar.zzl = i - 1;
        ulVar.zzd |= 64;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", sl.a, "zzm"});
        }
        if (i2 == 3) {
            return new ul();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new tl(wjVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int L() {
        return this.zzm.size();
    }

    public final String O() {
        return this.zzf;
    }
}
