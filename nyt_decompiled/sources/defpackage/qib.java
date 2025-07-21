package defpackage;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class qib {
    private long b;
    private final long a = TimeUnit.MILLISECONDS.toNanos(((Long) pla.c().a(mpa.D)).longValue());
    private boolean c = true;

    qib() {
    }

    public final void a(SurfaceTexture surfaceTexture, final whb whbVar) {
        if (whbVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.c) {
            long j = timestamp - this.b;
            if (Math.abs(j) < this.a) {
                return;
            }
        }
        this.c = false;
        this.b = timestamp;
        wxf.l.post(new Runnable() { // from class: pib
            @Override // java.lang.Runnable
            public final void run() {
                whb.this.zzk();
            }
        });
    }

    public final void b() {
        this.c = true;
    }
}
