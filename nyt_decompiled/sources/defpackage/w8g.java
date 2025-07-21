package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class w8g {
    public static final n8g d = new n8g(0, -9223372036854775807L, null);
    public static final n8g e = new n8g(1, -9223372036854775807L, null);
    public static final n8g f = new n8g(2, -9223372036854775807L, null);
    public static final n8g g = new n8g(3, -9223372036854775807L, null);
    private final ExecutorService a = khe.d("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private p8g b;
    private IOException c;

    public w8g(String str) {
    }

    public static n8g b(boolean z, long j) {
        return new n8g(z ? 1 : 0, j, null);
    }

    public final long a(r8g r8gVar, k8g k8gVar, int i) {
        Looper myLooper = Looper.myLooper();
        wad.b(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new p8g(this, myLooper, r8gVar, k8gVar, i, elapsedRealtime).c(0L);
        return elapsedRealtime;
    }

    public final void g() {
        p8g p8gVar = this.b;
        wad.b(p8gVar);
        p8gVar.a(false);
    }

    public final void h() {
        this.c = null;
    }

    public final void i(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        p8g p8gVar = this.b;
        if (p8gVar != null) {
            p8gVar.b(i);
        }
    }

    public final void j(t8g t8gVar) {
        p8g p8gVar = this.b;
        if (p8gVar != null) {
            p8gVar.a(true);
        }
        this.a.execute(new v8g(t8gVar));
        this.a.shutdown();
    }

    public final boolean k() {
        return this.c != null;
    }

    public final boolean l() {
        return this.b != null;
    }
}
