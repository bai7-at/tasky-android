package io.embrace.android.embracesdk.capture.startup;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.StartupActivity;
import io.embrace.android.embracesdk.capture.startup.StartupTracker;
import io.embrace.android.embracesdk.internal.utils.VersionChecker;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class StartupTracker implements Application.ActivityLifecycleCallbacks {
    public static final Companion Companion = new Companion(null);
    private final AppStartupTraceEmitter appStartupTraceEmitter;
    private boolean isFirstDraw;
    private final InternalEmbraceLogger logger;
    private boolean nullWindowCallbackErrorLogged;
    private final VersionChecker versionChecker;

    public static final class Companion {

        /* JADX INFO: Access modifiers changed from: private */
        static final class PyNextDrawListener implements ViewTreeObserver.OnDrawListener {
            private final Handler handler;
            private boolean invoked;
            private final qs2 onDrawCallback;
            private final View view;

            public PyNextDrawListener(View view, qs2 qs2Var) {
                zq3.h(view, "view");
                zq3.h(qs2Var, "onDrawCallback");
                this.view = view;
                this.onDrawCallback = qs2Var;
                this.handler = new Handler(Looper.getMainLooper());
            }

            public final Handler getHandler() {
                return this.handler;
            }

            public final boolean getInvoked() {
                return this.invoked;
            }

            public final qs2 getOnDrawCallback() {
                return this.onDrawCallback;
            }

            public final View getView() {
                return this.view;
            }

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public void onDraw() {
                if (this.invoked) {
                    return;
                }
                this.invoked = true;
                this.onDrawCallback.mo865invoke();
                this.handler.post(new Runnable() { // from class: io.embrace.android.embracesdk.capture.startup.StartupTracker$Companion$PyNextDrawListener$onDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserver viewTreeObserver = StartupTracker.Companion.PyNextDrawListener.this.getView().getViewTreeObserver();
                        zq3.g(viewTreeObserver, "view.viewTreeObserver");
                        if (viewTreeObserver.isAlive()) {
                            StartupTracker.Companion.PyNextDrawListener.this.getView().getViewTreeObserver().removeOnDrawListener(StartupTracker.Companion.PyNextDrawListener.this);
                        }
                    }
                });
            }

            public final void setInvoked(boolean z) {
                this.invoked = z;
            }
        }

        private static final class PyWindowDelegateCallback implements Window.Callback {
            private final Window.Callback delegate;
            private final List<qs2> onContentChangedCallbacks;

            public PyWindowDelegateCallback(Window.Callback callback) {
                zq3.h(callback, "delegate");
                this.delegate = callback;
                this.onContentChangedCallbacks = new ArrayList();
            }

            @Override // android.view.Window.Callback
            public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                return this.delegate.dispatchGenericMotionEvent(motionEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                return this.delegate.dispatchKeyEvent(keyEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
                return this.delegate.dispatchKeyShortcutEvent(keyEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                return this.delegate.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return this.delegate.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
                return this.delegate.dispatchTrackballEvent(motionEvent);
            }

            public final List<qs2> getOnContentChangedCallbacks() {
                return this.onContentChangedCallbacks;
            }

            @Override // android.view.Window.Callback
            public void onActionModeFinished(ActionMode actionMode) {
                this.delegate.onActionModeFinished(actionMode);
            }

            @Override // android.view.Window.Callback
            public void onActionModeStarted(ActionMode actionMode) {
                this.delegate.onActionModeStarted(actionMode);
            }

            @Override // android.view.Window.Callback
            public void onAttachedToWindow() {
                this.delegate.onAttachedToWindow();
            }

            @Override // android.view.Window.Callback
            public void onContentChanged() {
                i.I(this.onContentChangedCallbacks, new ss2() { // from class: io.embrace.android.embracesdk.capture.startup.StartupTracker$Companion$PyWindowDelegateCallback$onContentChanged$1
                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return Boolean.valueOf(invoke((qs2) obj));
                    }

                    public final boolean invoke(qs2 qs2Var) {
                        zq3.h(qs2Var, "callback");
                        return !((Boolean) qs2Var.mo865invoke()).booleanValue();
                    }
                });
                this.delegate.onContentChanged();
            }

            @Override // android.view.Window.Callback
            public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
                zq3.h(menu, "p1");
                return this.delegate.onCreatePanelMenu(i, menu);
            }

            @Override // android.view.Window.Callback
            @Nullable
            public View onCreatePanelView(int i) {
                return this.delegate.onCreatePanelView(i);
            }

            @Override // android.view.Window.Callback
            public void onDetachedFromWindow() {
                this.delegate.onDetachedFromWindow();
            }

            @Override // android.view.Window.Callback
            public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
                zq3.h(menuItem, "p1");
                return this.delegate.onMenuItemSelected(i, menuItem);
            }

            @Override // android.view.Window.Callback
            public boolean onMenuOpened(int i, @NonNull Menu menu) {
                zq3.h(menu, "p1");
                return this.delegate.onMenuOpened(i, menu);
            }

            @Override // android.view.Window.Callback
            public void onPanelClosed(int i, @NonNull Menu menu) {
                zq3.h(menu, "p1");
                this.delegate.onPanelClosed(i, menu);
            }

            @Override // android.view.Window.Callback
            public boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
                zq3.h(menu, "p2");
                return this.delegate.onPreparePanel(i, view, menu);
            }

            @Override // android.view.Window.Callback
            public boolean onSearchRequested() {
                return this.delegate.onSearchRequested();
            }

            @Override // android.view.Window.Callback
            public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
                this.delegate.onWindowAttributesChanged(layoutParams);
            }

            @Override // android.view.Window.Callback
            public void onWindowFocusChanged(boolean z) {
                this.delegate.onWindowFocusChanged(z);
            }

            @Override // android.view.Window.Callback
            @Nullable
            public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
                return this.delegate.onWindowStartingActionMode(callback);
            }

            @Override // android.view.Window.Callback
            public boolean onSearchRequested(SearchEvent searchEvent) {
                return this.delegate.onSearchRequested(searchEvent);
            }

            @Override // android.view.Window.Callback
            @Nullable
            public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
                return this.delegate.onWindowStartingActionMode(callback, i);
            }
        }

        private Companion() {
        }

        private final void onContentChanged(Window window, qs2 qs2Var) {
            PyWindowDelegateCallback pyWindowDelegateCallback;
            Window.Callback callback = window.getCallback();
            if (callback instanceof PyWindowDelegateCallback) {
                pyWindowDelegateCallback = (PyWindowDelegateCallback) callback;
            } else {
                zq3.g(callback, "currentCallback");
                PyWindowDelegateCallback pyWindowDelegateCallback2 = new PyWindowDelegateCallback(callback);
                window.setCallback(pyWindowDelegateCallback2);
                pyWindowDelegateCallback = pyWindowDelegateCallback2;
            }
            pyWindowDelegateCallback.getOnContentChangedCallbacks().add(qs2Var);
        }

        public final boolean observeForStartup(Activity activity) {
            zq3.h(activity, "$this$observeForStartup");
            return !activity.getClass().isAnnotationPresent(StartupActivity.class);
        }

        public final void onDecorViewReady(Window window, final qs2 qs2Var) {
            zq3.h(window, "$this$onDecorViewReady");
            zq3.h(qs2Var, "onDecorViewReady");
            if (window.getCallback() != null) {
                if (window.peekDecorView() == null) {
                    onContentChanged(window, new qs2() { // from class: io.embrace.android.embracesdk.capture.startup.StartupTracker$Companion$onDecorViewReady$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            return Boolean.valueOf(invoke());
                        }

                        public final boolean invoke() {
                            qs2.this.mo865invoke();
                            return false;
                        }
                    });
                } else {
                    qs2Var.mo865invoke();
                }
            }
        }

        public final void onNextDraw(View view, qs2 qs2Var) {
            zq3.h(view, "$this$onNextDraw");
            zq3.h(qs2Var, "onDrawCallback");
            view.getViewTreeObserver().addOnDrawListener(new PyNextDrawListener(view, qs2Var));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StartupTracker(AppStartupTraceEmitter appStartupTraceEmitter, InternalEmbraceLogger internalEmbraceLogger, VersionChecker versionChecker) {
        zq3.h(appStartupTraceEmitter, "appStartupTraceEmitter");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(versionChecker, "versionChecker");
        this.appStartupTraceEmitter = appStartupTraceEmitter;
        this.logger = internalEmbraceLogger;
        this.versionChecker = versionChecker;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        Companion companion = Companion;
        if (companion.observeForStartup(activity)) {
            AppStartupTraceEmitter.startupActivityInitStart$default(this.appStartupTraceEmitter, null, 1, null);
            if (!this.versionChecker.isAtLeast(29) || this.isFirstDraw) {
                return;
            }
            Window window = activity.getWindow();
            zq3.g(window, "window");
            if (window.getCallback() != null) {
                companion.onDecorViewReady(window, new StartupTracker$onActivityCreated$1(this, window));
            } else {
                if (this.nullWindowCallbackErrorLogged) {
                    return;
                }
                this.logger.log("Fail to attach frame rendering callback because the callback on Window was null", InternalEmbraceLogger.Severity.ERROR, null, false);
                this.nullWindowCallbackErrorLogged = true;
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
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        if (Companion.observeForStartup(activity)) {
            AppStartupTraceEmitter.startupActivityInitStart$default(this.appStartupTraceEmitter, null, 1, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        zq3.h(activity, "activity");
        if (Companion.observeForStartup(activity)) {
            AppStartupTraceEmitter.startupActivityResumed$default(this.appStartupTraceEmitter, null, 1, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        zq3.h(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        zq3.h(activity, "activity");
        if (Companion.observeForStartup(activity)) {
            AppStartupTraceEmitter.startupActivityInitEnd$default(this.appStartupTraceEmitter, null, 1, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        zq3.h(activity, "activity");
    }
}
