package com.nytimes.android.performancewatcher.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import defpackage.c44;
import defpackage.lx8;
import defpackage.qs2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ThreadWatcher implements Handler.Callback, c44 {
    public static final b Companion = new b(null);
    private static HandlerThread e;
    private static Handler f;
    private final lx8 a;
    private final Config b;
    private final ExecutorService c;
    private final com.nytimes.android.performancewatcher.thread.a d;

    public static final class Config {
        private static final a Companion = new a(null);
        private long a = 1;
        private TimeUnit b;
        private long c;
        private TimeUnit d;
        private qs2 e;

        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public Config() {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.b = timeUnit;
            this.c = 4L;
            this.d = timeUnit;
            this.e = new qs2() { // from class: com.nytimes.android.performancewatcher.thread.ThreadWatcher$Config$isLoggingEnabled$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Boolean mo865invoke() {
                    return Boolean.FALSE;
                }
            };
        }

        public final long a() {
            return this.b.toMillis(this.a);
        }

        public final long b() {
            return this.d.toMillis(this.c);
        }

        public final qs2 c() {
            return this.e;
        }

        public final void d(qs2 qs2Var) {
            zq3.h(qs2Var, "<set-?>");
            this.e = qs2Var;
        }
    }

    public static final class a {
        private final lx8 a;
        private final qs2 b;
        private final Config c;

        public a(lx8 lx8Var, qs2 qs2Var) {
            zq3.h(lx8Var, "callback");
            zq3.h(qs2Var, "looper");
            this.a = lx8Var;
            this.b = qs2Var;
            this.c = new Config();
        }

        public final a a(qs2 qs2Var) {
            zq3.h(qs2Var, "value");
            this.c.d(qs2Var);
            return this;
        }

        public final ThreadWatcher b() {
            ThreadWatcher threadWatcher = new ThreadWatcher(this.b, this.a, this.c);
            ThreadWatcher.Companion.c(new Handler(ThreadWatcher.e.getLooper(), threadWatcher));
            l.k().getLifecycle().a(threadWatcher);
            return threadWatcher;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Handler a() {
            return ThreadWatcher.f;
        }

        public final void b(UnresponsiveThreadException unresponsiveThreadException) {
            Message obtainMessage;
            zq3.h(unresponsiveThreadException, "exception");
            Handler a = a();
            if (a == null || (obtainMessage = a.obtainMessage(720897, unresponsiveThreadException)) == null) {
                return;
            }
            obtainMessage.sendToTarget();
        }

        public final void c(Handler handler) {
            ThreadWatcher.f = handler;
        }

        private b() {
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread(ThreadWatcher.class.getSimpleName() + ".Callback");
        handlerThread.start();
        e = handlerThread;
    }

    public ThreadWatcher(qs2 qs2Var, lx8 lx8Var, Config config) {
        zq3.h(qs2Var, "looper");
        zq3.h(lx8Var, "callback");
        zq3.h(config, "config");
        this.a = lx8Var;
        this.b = config;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        zq3.g(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.c = newSingleThreadExecutor;
        this.d = new com.nytimes.android.performancewatcher.thread.a(qs2Var, config);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        zq3.h(message, "msg");
        if (message.what == 720897) {
            lx8 lx8Var = this.a;
            Object obj = message.obj;
            zq3.f(obj, "null cannot be cast to non-null type com.nytimes.android.performancewatcher.thread.UnresponsiveThreadException");
            lx8Var.a((UnresponsiveThreadException) obj);
            return true;
        }
        Handler handler = f;
        if (handler == null) {
            return false;
        }
        handler.handleMessage(message);
        ww8 ww8Var = ww8.a;
        return true;
    }

    @k(Lifecycle.Event.ON_PAUSE)
    public final synchronized void onAppBackgrounded$performance_watcher_release() {
        try {
            if (((Boolean) this.b.c().mo865invoke()).booleanValue()) {
                ul8.a.u("onAppBackgrounded", new Object[0]);
            }
            this.d.c(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    @k(Lifecycle.Event.ON_RESUME)
    public final synchronized void onAppForegrounded$performance_watcher_release() {
        try {
            if (((Boolean) this.b.c().mo865invoke()).booleanValue()) {
                ul8.a.u("onAppForegrounded", new Object[0]);
            }
            synchronized (this.d) {
                try {
                    this.d.c(false);
                    if (this.d.b()) {
                        this.c.execute(this.d);
                    }
                    ww8 ww8Var = ww8.a;
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
