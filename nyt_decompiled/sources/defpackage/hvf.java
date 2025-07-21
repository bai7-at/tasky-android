package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class hvf {
    private final Handler a = new Handler(Looper.myLooper());
    private final AudioTrack.StreamEventCallback b;
    final /* synthetic */ lvf c;

    public hvf(lvf lvfVar) {
        this.c = lvfVar;
        this.b = new fvf(this, lvfVar);
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: ruf
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
