package io.embrace.android.embracesdk.session.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.StartupActivity;
import io.embrace.android.embracesdk.capture.orientation.OrientationService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ActivityLifecycleTracker implements ActivityTracker {
    public static final Companion Companion = new Companion(null);
    private static final String ERROR_FAILED_TO_NOTIFY = "Failed to notify ActivityLifecycleTracker listener";
    private final Application application;
    private volatile WeakReference<Activity> currentActivity;
    private final CopyOnWriteArrayList<ActivityLifecycleListener> listeners;
    private final InternalEmbraceLogger logger;
    private final OrientationService orientationService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ActivityLifecycleTracker(Application application, OrientationService orientationService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(application, "application");
        zq3.h(orientationService, "orientationService");
        zq3.h(internalEmbraceLogger, "logger");
        this.application = application;
        this.orientationService = orientationService;
        this.logger = internalEmbraceLogger;
        application.registerActivityLifecycleCallbacks(this);
        this.listeners = new CopyOnWriteArrayList<>();
        this.currentActivity = new WeakReference<>(null);
    }

    private final void updateOrientationWithActivity(Activity activity) {
        try {
            OrientationService orientationService = this.orientationService;
            Resources resources = activity.getResources();
            zq3.g(resources, "activity.resources");
            orientationService.onOrientationChanged(Integer.valueOf(resources.getConfiguration().orientation));
        } catch (Exception e) {
            this.logger.log("Failed to register an orientation change", InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityTracker
    public void addListener(ActivityLifecycleListener activityLifecycleListener) {
        zq3.h(activityLifecycleListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.listeners.contains(activityLifecycleListener)) {
            return;
        }
        this.listeners.addIfAbsent(activityLifecycleListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.logger.log("Shutting down EmbraceActivityService", InternalEmbraceLogger.Severity.DEBUG, null, true);
            this.application.unregisterActivityLifecycleCallbacks(this);
            this.listeners.clear();
        } catch (Exception e) {
            this.logger.log("Error when closing EmbraceActivityService", InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityTracker
    public Activity getForegroundActivity() {
        Activity activity = this.currentActivity.get();
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    public final CopyOnWriteArrayList<ActivityLifecycleListener> getListeners() {
        return this.listeners;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        updateStateWithActivity(activity);
        updateOrientationWithActivity(activity);
        Iterator it2 = i.X0(this.listeners).iterator();
        while (it2.hasNext()) {
            try {
                ((ActivityLifecycleListener) it2.next()).onActivityCreated(activity, bundle);
            } catch (Exception e) {
                this.logger.log(ERROR_FAILED_TO_NOTIFY, InternalEmbraceLogger.Severity.DEBUG, e, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        zq3.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        zq3.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        zq3.h(activity, "activity");
        if (activity.getClass().isAnnotationPresent(StartupActivity.class)) {
            return;
        }
        Iterator it2 = i.X0(this.listeners).iterator();
        while (it2.hasNext()) {
            try {
                ((ActivityLifecycleListener) it2.next()).applicationStartupComplete();
            } catch (Exception e) {
                this.logger.log(ERROR_FAILED_TO_NOTIFY, InternalEmbraceLogger.Severity.DEBUG, e, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        zq3.h(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        zq3.h(activity, "activity");
        updateStateWithActivity(activity);
        Iterator it2 = i.X0(this.listeners).iterator();
        while (it2.hasNext()) {
            try {
                ((ActivityLifecycleListener) it2.next()).onView(activity);
            } catch (Exception e) {
                this.logger.log(ERROR_FAILED_TO_NOTIFY, InternalEmbraceLogger.Severity.DEBUG, e, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        zq3.h(activity, "activity");
        Iterator it2 = i.X0(this.listeners).iterator();
        while (it2.hasNext()) {
            try {
                ((ActivityLifecycleListener) it2.next()).onViewClose(activity);
            } catch (Exception e) {
                this.logger.log(ERROR_FAILED_TO_NOTIFY, InternalEmbraceLogger.Severity.DEBUG, e, true);
            }
        }
    }

    public final synchronized void updateStateWithActivity(Activity activity) {
        this.currentActivity = new WeakReference<>(activity);
    }
}
