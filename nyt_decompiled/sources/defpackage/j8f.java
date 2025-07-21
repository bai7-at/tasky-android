package defpackage;

import com.comscore.util.crashreport.CrashReportManager;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;

/* loaded from: classes3.dex */
public final class j8f implements ndf {
    private final s7g a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private int g;
    private boolean h;

    public j8f() {
        s7g s7gVar = new s7g(true, 65536);
        d(2500, 0, "bufferForPlaybackMs", "0");
        d(CrashReportManager.TIME_WINDOW, 0, "bufferForPlaybackAfterRebufferMs", "0");
        d(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        d(50000, CrashReportManager.TIME_WINDOW, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        d(50000, 50000, "maxBufferMs", "minBufferMs");
        d(0, 0, "backBufferDurationMs", "0");
        this.a = s7gVar;
        this.b = khe.F(50000L);
        this.c = khe.F(50000L);
        this.d = khe.F(2500L);
        this.e = khe.F(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
        this.g = 13107200;
        this.f = khe.F(0L);
    }

    private static void d(int i, int i2, String str, String str2) {
        wad.e(i >= i2, str + " cannot be less than " + str2);
    }

    private final void e(boolean z) {
        this.g = 13107200;
        this.h = false;
        if (z) {
            this.a.e();
        }
    }

    @Override // defpackage.ndf
    public final void a(n1c n1cVar, zzf zzfVar, wff[] wffVarArr, z2g z2gVar, o6g[] o6gVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = wffVarArr.length;
            if (i >= 2) {
                int max = Math.max(13107200, i2);
                this.g = max;
                this.a.f(max);
                return;
            } else {
                if (o6gVarArr[i] != null) {
                    i2 += wffVarArr[i].b() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // defpackage.ndf
    public final boolean b(n1c n1cVar, zzf zzfVar, long j, float f, boolean z, long j2) {
        long E = khe.E(j, f);
        long j3 = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || E >= j3 || this.a.a() >= this.g;
    }

    @Override // defpackage.ndf
    public final boolean c(long j, long j2, float f) {
        int a = this.a.a();
        int i = this.g;
        long j3 = this.b;
        if (f > 1.0f) {
            j3 = Math.min(khe.D(j3, f), this.c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = a < i;
            this.h = z;
            if (!z && j2 < 500000) {
                ezd.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || a >= i) {
            this.h = false;
        }
        return this.h;
    }

    @Override // defpackage.ndf
    public final long zza() {
        return this.f;
    }

    @Override // defpackage.ndf
    public final void zzb() {
        e(false);
    }

    @Override // defpackage.ndf
    public final void zzc() {
        e(true);
    }

    @Override // defpackage.ndf
    public final void zzd() {
        e(true);
    }

    @Override // defpackage.ndf
    public final boolean zzf() {
        return false;
    }

    @Override // defpackage.ndf
    public final s7g zzi() {
        return this.a;
    }
}
