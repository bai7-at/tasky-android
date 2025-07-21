package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes3.dex */
final class js9 implements Choreographer.FrameCallback, Handler.Callback {
    private static final js9 f = new js9();
    public volatile long a = -9223372036854775807L;
    private final Handler b;
    private final HandlerThread c;
    private Choreographer d;
    private int e;

    private js9() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.b = handler;
        handler.sendEmptyMessage(0);
    }

    public static js9 a() {
        return f;
    }

    public final void b() {
        this.b.sendEmptyMessage(1);
    }

    public final void c() {
        this.b.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a = j;
        Choreographer choreographer = this.d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                ezd.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.d;
            if (choreographer != null) {
                int i2 = this.e + 1;
                this.e = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.d;
        if (choreographer2 != null) {
            int i3 = this.e - 1;
            this.e = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.a = -9223372036854775807L;
            }
        }
        return true;
    }
}
