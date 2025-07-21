package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.video.PlaceholderSurface;

/* loaded from: classes2.dex */
public final class y79 {
    private final qj2 a = new qj2();
    private final b b;
    private final e c;
    private boolean d;
    private Surface e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;

    private static final class a {
        public static void a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                a84.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {

        public interface a {
            void a(Display display);
        }

        void a(a aVar);

        void unregister();
    }

    private static final class c implements b {
        private final WindowManager a;

        private c(WindowManager windowManager) {
            this.a = windowManager;
        }

        public static b b(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // y79.b
        public void a(b.a aVar) {
            aVar.a(this.a.getDefaultDisplay());
        }

        @Override // y79.b
        public void unregister() {
        }
    }

    private static final class d implements b, DisplayManager.DisplayListener {
        private final DisplayManager a;
        private b.a b;

        private d(DisplayManager displayManager) {
            this.a = displayManager;
        }

        private Display b() {
            return this.a.getDisplay(0);
        }

        public static b c(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // y79.b
        public void a(b.a aVar) {
            this.b = aVar;
            this.a.registerDisplayListener(this, z19.w());
            aVar.a(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            b.a aVar = this.b;
            if (aVar == null || i != 0) {
                return;
            }
            aVar.a(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        @Override // y79.b
        public void unregister() {
            this.a.unregisterDisplayListener(this);
            this.b = null;
        }
    }

    private static final class e implements Choreographer.FrameCallback, Handler.Callback {
        private static final e f = new e();
        public volatile long a = -9223372036854775807L;
        private final Handler b;
        private final HandlerThread c;
        private Choreographer d;
        private int e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.c = handlerThread;
            handlerThread.start();
            Handler v = z19.v(handlerThread.getLooper(), this);
            this.b = v;
            v.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.d;
            if (choreographer != null) {
                int i = this.e + 1;
                this.e = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                a84.k("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        public static e d() {
            return f;
        }

        private void f() {
            Choreographer choreographer = this.d;
            if (choreographer != null) {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.a = j;
            ((Choreographer) ur.e(this.d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c();
                return true;
            }
            if (i == 1) {
                b();
                return true;
            }
            if (i != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public y79(Context context) {
        b f = f(context);
        this.b = f;
        this.c = f != null ? e.d() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    private static boolean c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (z19.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private static b f(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b c2 = z19.a >= 17 ? d.c(applicationContext) : null;
        return c2 == null ? c.b(applicationContext) : c2;
    }

    private void n() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            a84.j("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
        }
    }

    private void q() {
        if (z19.a < 30 || this.e == null) {
            return;
        }
        float b2 = this.a.e() ? this.a.b() : this.f;
        float f = this.g;
        if (b2 == f) {
            return;
        }
        if (b2 != -1.0f && f != -1.0f) {
            if (Math.abs(b2 - this.g) < ((!this.a.e() || this.a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b2 == -1.0f && this.a.c() < 30) {
            return;
        }
        this.g = b2;
        r(false);
    }

    private void r(boolean z) {
        Surface surface;
        float f;
        if (z19.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
                if (z && this.h == f) {
                    return;
                }
                this.h = f;
                a.a(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.h = f;
        a.a(surface, f);
    }

    public long b(long j) {
        long j2;
        e eVar;
        if (this.p != -1 && this.a.e()) {
            long a2 = this.q + ((long) ((this.a.a() * (this.m - this.p)) / this.i));
            if (c(j, a2)) {
                j2 = a2;
                this.n = this.m;
                this.o = j2;
                eVar = this.c;
                if (eVar != null || this.k == -9223372036854775807L) {
                    return j2;
                }
                long j3 = eVar.a;
                return j3 == -9223372036854775807L ? j2 : e(j2, j3, this.k) - this.l;
            }
            n();
        }
        j2 = j;
        this.n = this.m;
        this.o = j2;
        eVar = this.c;
        if (eVar != null) {
        }
        return j2;
    }

    public void g(float f) {
        this.f = f;
        this.a.g();
        q();
    }

    public void h(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.a.f(j * 1000);
        q();
    }

    public void i(float f) {
        this.i = f;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.d = true;
        n();
        if (this.b != null) {
            ((e) ur.e(this.c)).a();
            this.b.a(new b.a() { // from class: w79
                @Override // y79.b.a
                public final void a(Display display) {
                    y79.this.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.d = false;
        b bVar = this.b;
        if (bVar != null) {
            bVar.unregister();
            ((e) ur.e(this.c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        d();
        this.e = surface;
        r(true);
    }

    public void o(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        r(true);
    }
}
