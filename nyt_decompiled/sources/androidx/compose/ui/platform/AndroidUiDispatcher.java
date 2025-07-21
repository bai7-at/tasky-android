package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.c04;
import defpackage.o63;
import defpackage.qs2;
import defpackage.rg;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    public static final b k = new b(null);
    public static final int l = 8;
    private static final c04 m = kotlin.c.a(new qs2() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext mo865invoke() {
            boolean b2;
            b2 = rg.b();
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(b2 ? Choreographer.getInstance() : (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), o63.a(Looper.getMainLooper()), null);
            return androidUiDispatcher.plus(androidUiDispatcher.e0());
        }
    });
    private static final ThreadLocal n = new a();
    private final Choreographer a;
    private final Handler b;
    private final Object c;
    private final kotlin.collections.c d;
    private List e;
    private List f;
    private boolean g;
    private boolean h;
    private final c i;
    private final androidx.compose.runtime.l j;

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, o63.a(myLooper), null);
            return androidUiDispatcher.plus(androidUiDispatcher.e0());
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            boolean b;
            b = rg.b();
            if (b) {
                return b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.n.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final CoroutineContext b() {
            return (CoroutineContext) AndroidUiDispatcher.m.getValue();
        }

        private b() {
        }
    }

    public static final class c implements Choreographer.FrameCallback, Runnable {
        c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            AndroidUiDispatcher.this.b.removeCallbacks(this);
            AndroidUiDispatcher.this.t0();
            AndroidUiDispatcher.this.m0(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidUiDispatcher.this.t0();
            Object obj = AndroidUiDispatcher.this.c;
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (obj) {
                try {
                    if (androidUiDispatcher.e.isEmpty()) {
                        androidUiDispatcher.c0().removeFrameCallback(this);
                        androidUiDispatcher.h = false;
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private final Runnable f0() {
        Runnable runnable;
        synchronized (this.c) {
            runnable = (Runnable) this.d.x();
        }
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(long j) {
        synchronized (this.c) {
            if (this.h) {
                this.h = false;
                List list = this.e;
                this.e = this.f;
                this.f = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        boolean z;
        do {
            Runnable f0 = f0();
            while (f0 != null) {
                f0.run();
                f0 = f0();
            }
            synchronized (this.c) {
                if (this.d.isEmpty()) {
                    z = false;
                    this.g = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public final void F0(Choreographer.FrameCallback frameCallback) {
        synchronized (this.c) {
            this.e.remove(frameCallback);
        }
    }

    public final Choreographer c0() {
        return this.a;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo937dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.c) {
            try {
                this.d.addLast(runnable);
                if (!this.g) {
                    this.g = true;
                    this.b.post(this.i);
                    if (!this.h) {
                        this.h = true;
                        this.a.postFrameCallback(this.i);
                    }
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final androidx.compose.runtime.l e0() {
        return this.j;
    }

    public final void w0(Choreographer.FrameCallback frameCallback) {
        synchronized (this.c) {
            try {
                this.e.add(frameCallback);
                if (!this.h) {
                    this.h = true;
                    this.a.postFrameCallback(this.i);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.a = choreographer;
        this.b = handler;
        this.c = new Object();
        this.d = new kotlin.collections.c();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.i = new c();
        this.j = new AndroidUiFrameClock(choreographer, this);
    }
}
