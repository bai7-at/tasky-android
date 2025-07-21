package com.chartbeat.androidsdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import defpackage.gb8;
import defpackage.jc5;
import defpackage.wa8;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class ForegroundTracker implements Application.ActivityLifecycleCallbacks {
    private static final long CHECK_STATUS_DELAY_MS = 500;
    private static final String TAG = "ForegroundTracker";
    private static ForegroundTracker instance;
    private static Object mutex = new Object();
    private gb8 enteredBackgroundSubscription;
    private boolean isForeground = true;
    private boolean paused = false;
    private List<Listener> listeners = new CopyOnWriteArrayList();

    public interface Listener {
        void onBackgrounded();

        void onForegrounded();
    }

    ForegroundTracker() {
    }

    static ForegroundTracker get(Application application) {
        if (instance == null) {
            init(application);
        }
        return instance;
    }

    static ForegroundTracker init(Application application) {
        synchronized (mutex) {
            try {
                if (instance == null) {
                    ForegroundTracker foregroundTracker = new ForegroundTracker();
                    instance = foregroundTracker;
                    application.registerActivityLifecycleCallbacks(foregroundTracker);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return instance;
    }

    void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    boolean appIsForeground() {
        return this.isForeground;
    }

    boolean isInBackground() {
        return !this.isForeground;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        try {
            this.paused = true;
            gb8 gb8Var = this.enteredBackgroundSubscription;
            if (gb8Var != null && !gb8Var.isUnsubscribed()) {
                this.enteredBackgroundSubscription.unsubscribe();
            }
            this.enteredBackgroundSubscription = jc5.q(500L, TimeUnit.MILLISECONDS).n(new wa8() { // from class: com.chartbeat.androidsdk.ForegroundTracker.1
                @Override // defpackage.uc5
                public void onCompleted() {
                }

                @Override // defpackage.uc5
                public void onError(Throwable th) {
                    Logger.d(ForegroundTracker.TAG, th.getMessage());
                }

                @Override // defpackage.uc5
                public void onNext(Long l) {
                    if (!ForegroundTracker.this.isForeground || !ForegroundTracker.this.paused) {
                        Logger.d(ForegroundTracker.TAG, "still appIsForeground");
                        return;
                    }
                    ForegroundTracker.this.isForeground = false;
                    Logger.d(ForegroundTracker.TAG, "went background");
                    Iterator it2 = ForegroundTracker.this.listeners.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((Listener) it2.next()).onBackgrounded();
                        } catch (Exception e) {
                            Logger.d(ForegroundTracker.TAG, e.getMessage());
                        }
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            this.paused = false;
            boolean z = this.isForeground;
            this.isForeground = true;
            gb8 gb8Var = this.enteredBackgroundSubscription;
            if (gb8Var != null && !gb8Var.isUnsubscribed()) {
                this.enteredBackgroundSubscription.unsubscribe();
                this.enteredBackgroundSubscription = null;
            }
            if (z) {
                Logger.d(TAG, "still foreground");
                return;
            }
            Logger.d(TAG, "went foreground");
            Iterator<Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().onForegrounded();
                } catch (Exception e) {
                    Logger.d(TAG, e.getMessage());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    static ForegroundTracker get(Context context) {
        ForegroundTracker foregroundTracker = instance;
        if (foregroundTracker != null) {
            return foregroundTracker;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            init((Application) applicationContext);
        }
        throw new IllegalStateException("ForegroundMonitor is not initialised and cannot obtain the Application context");
    }

    static ForegroundTracker get() {
        ForegroundTracker foregroundTracker = instance;
        if (foregroundTracker != null) {
            return foregroundTracker;
        }
        throw new IllegalStateException("ForegroundMonitor is not initialised - invoke at least once with parameterised init/get");
    }
}
