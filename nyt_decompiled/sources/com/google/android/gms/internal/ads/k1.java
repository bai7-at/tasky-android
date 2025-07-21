package com.google.android.gms.internal.ads;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.o0f;
import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public final class k1 extends yh implements x1f {
    private static final k1 zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        k1 k1Var = new k1();
        zzb = k1Var;
        yh.D(k1.class, k1Var);
    }

    private k1() {
    }

    public static j1 L() {
        return (j1) zzb.k();
    }

    static /* synthetic */ void N(k1 k1Var, long j) {
        k1Var.zzd |= 1;
        k1Var.zze = j;
    }

    static /* synthetic */ void O(k1 k1Var, long j) {
        k1Var.zzd |= 2;
        k1Var.zzf = j;
    }

    static /* synthetic */ void P(k1 k1Var, long j) {
        k1Var.zzd |= 4;
        k1Var.zzg = j;
    }

    static /* synthetic */ void Q(k1 k1Var, long j) {
        k1Var.zzd |= 8;
        k1Var.zzh = j;
    }

    static /* synthetic */ void R(k1 k1Var) {
        k1Var.zzd &= -9;
        k1Var.zzh = -1L;
    }

    static /* synthetic */ void S(k1 k1Var, long j) {
        k1Var.zzd |= 16;
        k1Var.zzi = j;
    }

    static /* synthetic */ void T(k1 k1Var, long j) {
        k1Var.zzd |= 32;
        k1Var.zzj = j;
    }

    static /* synthetic */ void U(k1 k1Var, long j) {
        k1Var.zzd |= 128;
        k1Var.zzl = j;
    }

    static /* synthetic */ void V(k1 k1Var, long j) {
        k1Var.zzd |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        k1Var.zzm = j;
    }

    static /* synthetic */ void W(k1 k1Var, long j) {
        k1Var.zzd |= 512;
        k1Var.zzn = j;
    }

    static /* synthetic */ void X(k1 k1Var, long j) {
        k1Var.zzd |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        k1Var.zzp = j;
    }

    static /* synthetic */ void Y(k1 k1Var, long j) {
        k1Var.zzd |= ProgressEvent.PART_FAILED_EVENT_CODE;
        k1Var.zzq = j;
    }

    static /* synthetic */ void Z(k1 k1Var, long j) {
        k1Var.zzd |= 8192;
        k1Var.zzr = j;
    }

    static /* synthetic */ void a0(k1 k1Var, long j) {
        k1Var.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        k1Var.zzs = j;
    }

    static /* synthetic */ void b0(k1 k1Var, long j) {
        k1Var.zzd |= 32768;
        k1Var.zzt = j;
    }

    static /* synthetic */ void c0(k1 k1Var, long j) {
        k1Var.zzd |= 65536;
        k1Var.zzu = j;
    }

    static /* synthetic */ void d0(k1 k1Var, long j) {
        k1Var.zzd |= 131072;
        k1Var.zzv = j;
    }

    static /* synthetic */ void e0(k1 k1Var, long j) {
        k1Var.zzd |= 262144;
        k1Var.zzw = j;
    }

    static /* synthetic */ void f0(k1 k1Var, int i) {
        k1Var.zzk = i - 1;
        k1Var.zzd |= 64;
    }

    static /* synthetic */ void g0(k1 k1Var, int i) {
        k1Var.zzo = i - 1;
        k1Var.zzd |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            o0f o0fVar = t1.a;
            return yh.A(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", o0fVar, "zzl", "zzm", "zzn", "zzo", o0fVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new k1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new j1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
