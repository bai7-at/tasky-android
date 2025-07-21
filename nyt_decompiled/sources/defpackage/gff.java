package defpackage;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
final class gff extends FutureTask {
    final /* synthetic */ whf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gff(whf whfVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.a = whfVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        uncaughtExceptionHandler = this.a.a.f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(valueOf);
            Log.e("GAv4", sb.toString());
        }
        super.setException(th);
    }
}
