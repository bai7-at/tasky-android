package com.google.android.gms.internal.ads;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.m1f;
import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class n3 extends yh implements x1f {
    private static final n3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private s4 zzi;
    private h3 zzk;
    private k3 zzl;
    private x3 zzm;
    private m2 zzn;
    private g4 zzo;
    private n5 zzp;
    private v2 zzq;
    private String zzf = "";
    private int zzh = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private m1f zzj = yh.v();

    static {
        n3 n3Var = new n3();
        zzb = n3Var;
        yh.D(n3.class, n3Var);
    }

    private n3() {
    }

    public static m3 N() {
        return (m3) zzb.k();
    }

    static /* synthetic */ void Q(n3 n3Var, String str) {
        str.getClass();
        n3Var.zzd |= 2;
        n3Var.zzf = str;
    }

    static /* synthetic */ void R(n3 n3Var, Iterable iterable) {
        m1f m1fVar = n3Var.zzj;
        if (!m1fVar.zzc()) {
            n3Var.zzj = yh.w(m1fVar);
        }
        rg.g(iterable, n3Var.zzj);
    }

    static /* synthetic */ void T(n3 n3Var, h3 h3Var) {
        h3Var.getClass();
        n3Var.zzk = h3Var;
        n3Var.zzd |= 32;
    }

    static /* synthetic */ void U(n3 n3Var, m2 m2Var) {
        m2Var.getClass();
        n3Var.zzn = m2Var;
        n3Var.zzd |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
    }

    static /* synthetic */ void V(n3 n3Var, g4 g4Var) {
        g4Var.getClass();
        n3Var.zzo = g4Var;
        n3Var.zzd |= 512;
    }

    static /* synthetic */ void W(n3 n3Var, n5 n5Var) {
        n5Var.getClass();
        n3Var.zzp = n5Var;
        n3Var.zzd |= 1024;
    }

    static /* synthetic */ void X(n3 n3Var, v2 v2Var) {
        v2Var.getClass();
        n3Var.zzq = v2Var;
        n3Var.zzd |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", l3.a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new n3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new m3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final m2 L() {
        m2 m2Var = this.zzn;
        return m2Var == null ? m2.M() : m2Var;
    }

    public final h3 M() {
        h3 h3Var = this.zzk;
        return h3Var == null ? h3.M() : h3Var;
    }

    public final String P() {
        return this.zzf;
    }
}
