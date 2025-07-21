package com.google.android.gms.internal.pal;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.by9;
import defpackage.iw9;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public final class n extends c0 implements by9 {
    private static final n zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        n nVar = new n();
        zzb = nVar;
        c0.h(n.class, nVar);
    }

    private n() {
    }

    static /* synthetic */ void C(n nVar) {
        nVar.zze &= -9;
        nVar.zzi = -1L;
    }

    static /* synthetic */ void E(n nVar, long j) {
        nVar.zze |= 16;
        nVar.zzj = j;
    }

    static /* synthetic */ void F(n nVar, long j) {
        nVar.zze |= 32;
        nVar.zzk = j;
    }

    static /* synthetic */ void G(n nVar, long j) {
        nVar.zze |= 128;
        nVar.zzm = j;
    }

    static /* synthetic */ void H(n nVar, long j) {
        nVar.zze |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        nVar.zzn = j;
    }

    static /* synthetic */ void I(n nVar, long j) {
        nVar.zze |= 512;
        nVar.zzo = j;
    }

    static /* synthetic */ void J(n nVar, long j) {
        nVar.zze |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        nVar.zzq = j;
    }

    static /* synthetic */ void K(n nVar, long j) {
        nVar.zze |= ProgressEvent.PART_FAILED_EVENT_CODE;
        nVar.zzr = j;
    }

    static /* synthetic */ void L(n nVar, long j) {
        nVar.zze |= 8192;
        nVar.zzs = j;
    }

    static /* synthetic */ void M(n nVar, long j) {
        nVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        nVar.zzt = j;
    }

    static /* synthetic */ void N(n nVar, long j) {
        nVar.zze |= 32768;
        nVar.zzu = j;
    }

    static /* synthetic */ void O(n nVar, long j) {
        nVar.zze |= 65536;
        nVar.zzv = j;
    }

    static /* synthetic */ void P(n nVar, long j) {
        nVar.zze |= 131072;
        nVar.zzw = j;
    }

    static /* synthetic */ void Q(n nVar, long j) {
        nVar.zze |= 262144;
        nVar.zzx = j;
    }

    static /* synthetic */ void R(n nVar, int i) {
        nVar.zzl = i - 1;
        nVar.zze |= 64;
    }

    static /* synthetic */ void S(n nVar, int i) {
        nVar.zzp = i - 1;
        nVar.zze |= 1024;
    }

    public static c s() {
        return (c) zzb.j();
    }

    static /* synthetic */ void u(n nVar, long j) {
        nVar.zze |= 1;
        nVar.zzf = j;
    }

    static /* synthetic */ void v(n nVar, long j) {
        nVar.zze |= 2;
        nVar.zzg = j;
    }

    static /* synthetic */ void w(n nVar, long j) {
        nVar.zze |= 4;
        nVar.zzh = j;
    }

    static /* synthetic */ void x(n nVar, long j) {
        nVar.zze |= 8;
        nVar.zzi = j;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            iw9 iw9Var = c2.a;
            return c0.g(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", iw9Var, "zzm", "zzn", "zzo", "zzp", iw9Var, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i2 == 3) {
            return new n();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new c(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
