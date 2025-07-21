package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class kaa implements Executor {
    final /* synthetic */ Handler a;

    kaa(maa maaVar, Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
