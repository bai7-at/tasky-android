package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.savedstate.a;
import defpackage.aa7;
import defpackage.af5;
import defpackage.ag5;
import defpackage.aq4;
import defpackage.c5;
import defpackage.d44;
import defpackage.d5;
import defpackage.df5;
import defpackage.e5;
import defpackage.fe5;
import defpackage.ix0;
import defpackage.j4;
import defpackage.j5;
import defpackage.l5;
import defpackage.lq4;
import defpackage.lv0;
import defpackage.nb9;
import defpackage.ne5;
import defpackage.ns2;
import defpackage.os2;
import defpackage.pe5;
import defpackage.qs2;
import defpackage.ro8;
import defpackage.sa9;
import defpackage.sq0;
import defpackage.sx4;
import defpackage.t21;
import defpackage.tt5;
import defpackage.ww8;
import defpackage.xp4;
import defpackage.xx4;
import defpackage.z97;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends sq0 implements d44, sa9, androidx.lifecycle.d, aa7, fe5, l5, ne5, ag5, af5, df5, xp4, os2 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final ix0 mContextAwareHelper;
    private t.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final ns2 mFullyDrawnReporter;
    private final h mLifecycleRegistry;
    private final aq4 mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<lv0> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<lv0> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<lv0> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<lv0> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<lv0> mOnTrimMemoryListeners;
    final f mReportFullyDrawnExecutor;
    final z97 mSavedStateRegistryController;
    private u mViewModelStore;

    class a extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$a$a, reason: collision with other inner class name */
        class RunnableC0010a implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ e5.a b;

            RunnableC0010a(int i, e5.a aVar) {
                this.a = i;
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.a, this.b.a());
            }
        }

        class b implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ IntentSender.SendIntentException b;

            b(int i, IntentSender.SendIntentException sendIntentException) {
                this.a = i;
                this.b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.b));
            }
        }

        a() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public void f(int i, e5 e5Var, Object obj, c5 c5Var) {
            Bundle c;
            ComponentActivity componentActivity = ComponentActivity.this;
            e5.a b2 = e5Var.b(componentActivity, obj);
            if (b2 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0010a(i, b2));
                return;
            }
            Intent a = e5Var.a(componentActivity, obj);
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                c = bundleExtra;
            } else {
                c = c5Var != null ? c5Var.c() : null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                j4.s(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                j4.w(componentActivity, a, i, c);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                j4.x(componentActivity, intentSenderRequest.d(), i, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, c);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new b(i, e));
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e2;
                }
            }
        }
    }

    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class e {
        Object a;
        u b;

        e() {
        }
    }

    private interface f extends Executor {
        void a();

        void i(View view);
    }

    class g implements f, ViewTreeObserver.OnDrawListener, Runnable {
        Runnable b;
        final long a = SystemClock.uptimeMillis() + 10000;
        boolean c = false;

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
                this.b = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.f
        public void a() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.c) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.g.this.c();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.f
        public void i(View view) {
            if (this.c) {
                return;
            }
            this.c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.a) {
                    this.c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.b = null;
            if (ComponentActivity.this.mFullyDrawnReporter.c()) {
                this.c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new ix0();
        this.mMenuHostHelper = new aq4(new Runnable() { // from class: oq0
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new h(this);
        z97 a2 = z97.a(this);
        this.mSavedStateRegistryController = a2;
        this.mOnBackPressedDispatcher = null;
        f u = u();
        this.mReportFullyDrawnExecutor = u;
        this.mFullyDrawnReporter = new ns2(u, new qs2() { // from class: pq0
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                ww8 v;
                v = ComponentActivity.this.v();
                return v;
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new a();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.lifecycle.g
            public void h(d44 d44Var, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        c.a(peekDecorView);
                    }
                }
            }
        });
        getLifecycle().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.g
            public void h(d44 d44Var, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.b();
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().a();
                    }
                    ComponentActivity.this.mReportFullyDrawnExecutor.a();
                }
            }
        });
        getLifecycle().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.g
            public void h(d44 d44Var, Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().d(this);
            }
        });
        a2.c();
        SavedStateHandleSupport.c(this);
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new a.c() { // from class: qq0
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle w;
                w = ComponentActivity.this.w();
                return w;
            }
        });
        addOnContextAvailableListener(new pe5() { // from class: rq0
            @Override // defpackage.pe5
            public final void onContextAvailable(Context context) {
                ComponentActivity.this.x(context);
            }
        });
    }

    private f u() {
        return new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ww8 v() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle w() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Context context) {
        Bundle b2 = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b2 != null) {
            this.mActivityResultRegistry.g(b2);
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.i(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.xp4
    public void addMenuProvider(lq4 lq4Var) {
        this.mMenuHostHelper.c(lq4Var);
    }

    @Override // defpackage.ne5
    public final void addOnConfigurationChangedListener(lv0 lv0Var) {
        this.mOnConfigurationChangedListeners.add(lv0Var);
    }

    public final void addOnContextAvailableListener(pe5 pe5Var) {
        this.mContextAwareHelper.a(pe5Var);
    }

    @Override // defpackage.af5
    public final void addOnMultiWindowModeChangedListener(lv0 lv0Var) {
        this.mOnMultiWindowModeChangedListeners.add(lv0Var);
    }

    public final void addOnNewIntentListener(lv0 lv0Var) {
        this.mOnNewIntentListeners.add(lv0Var);
    }

    @Override // defpackage.df5
    public final void addOnPictureInPictureModeChangedListener(lv0 lv0Var) {
        this.mOnPictureInPictureModeChangedListeners.add(lv0Var);
    }

    @Override // defpackage.ag5
    public final void addOnTrimMemoryListener(lv0 lv0Var) {
        this.mOnTrimMemoryListeners.add(lv0Var);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new u();
            }
        }
    }

    @Override // defpackage.l5
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.d
    public t21 getDefaultViewModelCreationExtras() {
        xx4 xx4Var = new xx4();
        if (getApplication() != null) {
            xx4Var.c(t.a.h, getApplication());
        }
        xx4Var.c(SavedStateHandleSupport.a, this);
        xx4Var.c(SavedStateHandleSupport.b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            xx4Var.c(SavedStateHandleSupport.c, getIntent().getExtras());
        }
        return xx4Var;
    }

    @Override // androidx.lifecycle.d
    public t.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new o(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public ns2 getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.a;
        }
        return null;
    }

    @Override // defpackage.d44
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // defpackage.fe5
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new b());
            getLifecycle().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.6
                @Override // androidx.lifecycle.g
                public void h(d44 d44Var, Lifecycle.Event event) {
                    if (event != Lifecycle.Event.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    ComponentActivity.this.mOnBackPressedDispatcher.o(d.a((ComponentActivity) d44Var));
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // defpackage.aa7
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // defpackage.sa9
    public u getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        ViewTreeLifecycleOwner.b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.b(getWindow().getDecorView(), this);
        nb9.a(getWindow().getDecorView(), this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.mActivityResultRegistry.b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<lv0> it2 = this.mOnConfigurationChangedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(configuration);
        }
    }

    @Override // defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        m.e(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<lv0> it2 = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(new sx4(z));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<lv0> it2 = this.mOnNewIntentListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<lv0> it2 = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(new tt5(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.k(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        u uVar = this.mViewModelStore;
        if (uVar == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            uVar = eVar.b;
        }
        if (uVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.a = onRetainCustomNonConfigurationInstance;
        eVar2.b = uVar;
        return eVar2;
    }

    @Override // defpackage.sq0, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof h) {
            ((h) lifecycle).n(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<lv0> it2 = this.mOnTrimMemoryListeners.iterator();
        while (it2.hasNext()) {
            it2.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> j5 registerForActivityResult(e5 e5Var, ActivityResultRegistry activityResultRegistry, d5 d5Var) {
        return activityResultRegistry.j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, e5Var, d5Var);
    }

    @Override // defpackage.xp4
    public void removeMenuProvider(lq4 lq4Var) {
        this.mMenuHostHelper.l(lq4Var);
    }

    @Override // defpackage.ne5
    public final void removeOnConfigurationChangedListener(lv0 lv0Var) {
        this.mOnConfigurationChangedListeners.remove(lv0Var);
    }

    public final void removeOnContextAvailableListener(pe5 pe5Var) {
        this.mContextAwareHelper.e(pe5Var);
    }

    @Override // defpackage.af5
    public final void removeOnMultiWindowModeChangedListener(lv0 lv0Var) {
        this.mOnMultiWindowModeChangedListeners.remove(lv0Var);
    }

    public final void removeOnNewIntentListener(lv0 lv0Var) {
        this.mOnNewIntentListeners.remove(lv0Var);
    }

    @Override // defpackage.df5
    public final void removeOnPictureInPictureModeChangedListener(lv0 lv0Var) {
        this.mOnPictureInPictureModeChangedListeners.remove(lv0Var);
    }

    @Override // defpackage.ag5
    public final void removeOnTrimMemoryListener(lv0 lv0Var) {
        this.mOnTrimMemoryListeners.remove(lv0Var);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ro8.e()) {
                ro8.b("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.b();
            ro8.d();
        } catch (Throwable th) {
            ro8.d();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.i(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(lq4 lq4Var, d44 d44Var) {
        this.mMenuHostHelper.d(lq4Var, d44Var);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(lq4 lq4Var, d44 d44Var, Lifecycle.State state) {
        this.mMenuHostHelper.e(lq4Var, d44Var, state);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<lv0> it2 = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it2.hasNext()) {
                it2.next().accept(new sx4(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<lv0> it2 = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it2.hasNext()) {
                it2.next().accept(new tt5(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> j5 registerForActivityResult(e5 e5Var, d5 d5Var) {
        return registerForActivityResult(e5Var, this.mActivityResultRegistry, d5Var);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.i(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.i(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
