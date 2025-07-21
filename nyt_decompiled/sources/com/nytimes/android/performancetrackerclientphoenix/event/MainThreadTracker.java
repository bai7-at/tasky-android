package com.nytimes.android.performancetrackerclientphoenix.event;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.preference.g;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancewatcher.thread.ThreadWatcher;
import com.nytimes.android.performancewatcher.thread.UnresponsiveThreadException;
import defpackage.cr5;
import defpackage.lx8;
import defpackage.qs2;
import defpackage.sl6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class MainThreadTracker {
    private final Application a;
    private final cr5 b;
    private final boolean c;
    private final String d;
    private final SharedPreferences e;

    public static final class a implements lx8 {
        a() {
        }

        @Override // defpackage.lx8
        public void a(UnresponsiveThreadException unresponsiveThreadException) {
            zq3.h(unresponsiveThreadException, "exception");
            MainThreadTracker.this.c().d(AppEvent.toEventConvertible$default(new AppEvent.Error.MainThreadBlocked(unresponsiveThreadException, null, 2, null), null, 1, null));
        }
    }

    public MainThreadTracker(Application application, cr5 cr5Var, boolean z) {
        zq3.h(application, "application");
        zq3.h(cr5Var, "performanceTrackerClient");
        this.a = application;
        this.b = cr5Var;
        this.c = z;
        String string = application.getString(sl6.com_nytimes_android_phoenix_beta_anrLogs);
        zq3.g(string, "getString(...)");
        this.d = string;
        this.e = g.b(application);
        new ThreadWatcher.a(new a(), new qs2() { // from class: com.nytimes.android.performancetrackerclientphoenix.event.MainThreadTracker.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Looper mo865invoke() {
                Looper mainLooper = Looper.getMainLooper();
                zq3.g(mainLooper, "getMainLooper(...)");
                return mainLooper;
            }
        }).a(new qs2() { // from class: com.nytimes.android.performancetrackerclientphoenix.event.MainThreadTracker.2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                boolean z2 = false;
                if (MainThreadTracker.this.d() && MainThreadTracker.this.e.getBoolean(MainThreadTracker.this.d, false)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }).b();
    }

    public final cr5 c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }
}
