package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.b;

/* loaded from: classes.dex */
public final class el1 extends sk9 {
    public static final el1 a = new el1();

    private el1() {
    }

    @Override // defpackage.sk9
    public /* bridge */ /* synthetic */ b a(Context context, String str, WorkerParameters workerParameters) {
        return (b) e(context, str, workerParameters);
    }

    public Void e(Context context, String str, WorkerParameters workerParameters) {
        zq3.h(context, "appContext");
        zq3.h(str, "workerClassName");
        zq3.h(workerParameters, "workerParameters");
        return null;
    }
}
