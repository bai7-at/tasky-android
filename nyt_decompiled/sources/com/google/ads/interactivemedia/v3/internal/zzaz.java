package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class zzaz extends zzaet implements zzaga {
    private static final zzaz zzb;
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
        zzaz zzazVar = new zzaz();
        zzb = zzazVar;
        zzaet.zzaM(zzaz.class, zzazVar);
    }

    private zzaz() {
    }

    public static zzay zza() {
        return (zzay) zzb.zzay();
    }

    static /* synthetic */ void zzc(zzaz zzazVar, long j) {
        zzazVar.zzd |= 1;
        zzazVar.zze = j;
    }

    static /* synthetic */ void zzd(zzaz zzazVar, long j) {
        zzazVar.zzd |= 2;
        zzazVar.zzf = j;
    }

    static /* synthetic */ void zze(zzaz zzazVar, long j) {
        zzazVar.zzd |= 4;
        zzazVar.zzg = j;
    }

    static /* synthetic */ void zzf(zzaz zzazVar, long j) {
        zzazVar.zzd |= 8;
        zzazVar.zzh = j;
    }

    static /* synthetic */ void zzg(zzaz zzazVar) {
        zzazVar.zzd &= -9;
        zzazVar.zzh = -1L;
    }

    static /* synthetic */ void zzh(zzaz zzazVar, long j) {
        zzazVar.zzd |= 16;
        zzazVar.zzi = j;
    }

    static /* synthetic */ void zzi(zzaz zzazVar, long j) {
        zzazVar.zzd |= 32;
        zzazVar.zzj = j;
    }

    static /* synthetic */ void zzk(zzaz zzazVar, long j) {
        zzazVar.zzd |= 128;
        zzazVar.zzl = j;
    }

    static /* synthetic */ void zzl(zzaz zzazVar, long j) {
        zzazVar.zzd |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        zzazVar.zzm = j;
    }

    static /* synthetic */ void zzm(zzaz zzazVar, long j) {
        zzazVar.zzd |= 512;
        zzazVar.zzn = j;
    }

    static /* synthetic */ void zzn(zzaz zzazVar, long j) {
        zzazVar.zzd |= ProgressEvent.PART_COMPLETED_EVENT_CODE;
        zzazVar.zzp = j;
    }

    static /* synthetic */ void zzo(zzaz zzazVar, long j) {
        zzazVar.zzd |= ProgressEvent.PART_FAILED_EVENT_CODE;
        zzazVar.zzq = j;
    }

    static /* synthetic */ void zzp(zzaz zzazVar, long j) {
        zzazVar.zzd |= 8192;
        zzazVar.zzr = j;
    }

    static /* synthetic */ void zzq(zzaz zzazVar, long j) {
        zzazVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzazVar.zzs = j;
    }

    static /* synthetic */ void zzr(zzaz zzazVar, long j) {
        zzazVar.zzd |= 32768;
        zzazVar.zzt = j;
    }

    static /* synthetic */ void zzs(zzaz zzazVar, long j) {
        zzazVar.zzd |= 65536;
        zzazVar.zzu = j;
    }

    static /* synthetic */ void zzt(zzaz zzazVar, long j) {
        zzazVar.zzd |= 131072;
        zzazVar.zzv = j;
    }

    static /* synthetic */ void zzu(zzaz zzazVar, long j) {
        zzazVar.zzd |= 262144;
        zzazVar.zzw = j;
    }

    static /* synthetic */ void zzv(zzaz zzazVar, int i) {
        zzazVar.zzk = i - 1;
        zzazVar.zzd |= 64;
    }

    static /* synthetic */ void zzw(zzaz zzazVar, int i) {
        zzazVar.zzo = i - 1;
        zzazVar.zzd |= 1024;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzaex zzaexVar = zzbi.zza;
            return zzaet.zzaJ(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzaexVar, "zzl", "zzm", "zzn", "zzo", zzaexVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new zzaz();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzay(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
