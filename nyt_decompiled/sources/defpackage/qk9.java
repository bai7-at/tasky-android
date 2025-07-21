package defpackage;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class qk9 {
    private final String a;
    private final WorkerParameters b;
    private final Throwable c;

    public qk9(String str, WorkerParameters workerParameters, Throwable th) {
        zq3.h(str, "workerClassName");
        zq3.h(workerParameters, "workerParameters");
        zq3.h(th, "throwable");
        this.a = str;
        this.b = workerParameters;
        this.c = th;
    }
}
