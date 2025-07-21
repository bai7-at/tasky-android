package com.nytimes.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.appbar.AppBarLayout;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.utils.snackbar.a;
import com.nytimes.android.widget.CustomActionBarWrapper;
import com.nytimes.android.widget.CustomToolbar;
import defpackage.ce5;
import defpackage.ee5;
import defpackage.fx3;
import defpackage.hk6;
import defpackage.jk;
import defpackage.oi4;
import defpackage.s74;
import defpackage.ss2;
import defpackage.td4;
import defpackage.ww8;
import defpackage.x3;
import defpackage.xs5;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class BaseAppCompatActivity extends jk implements com.nytimes.android.utils.snackbar.a {
    public static final a Companion = new a(null);
    public CompositeDisposable compositeDisposable;
    public s74 localeUtils;
    public td4 mainActivityNavigator;
    public oi4 mediaLifecycleObserver;
    public ScreenshotTracker screenshotTracker;
    public SnackbarUtil snackbarUtil;
    public fx3 stamper;
    private x3 wrappedActionBar;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(View view, boolean z) {
            zq3.h(view, "toolbar");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            zq3.f(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            AppBarLayout.e eVar = (AppBarLayout.e) layoutParams;
            int i = z ? 5 : 0;
            if (eVar.c() != i) {
                eVar.g(i);
                view.requestLayout();
            }
        }

        private a() {
        }
    }

    private final boolean L() {
        getLocaleUtils().a(this);
        return true;
    }

    private final void M() {
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        zq3.g(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        ee5.a(onBackPressedDispatcher, this, getIntent().getBooleanExtra("com.nytimes.android.extra.STARTMAIN_ON_NAV_UP", false), new ss2() { // from class: com.nytimes.android.BaseAppCompatActivity$handleBackPressed$1
            {
                super(1);
            }

            public final void b(ce5 ce5Var) {
                zq3.h(ce5Var, "$this$addCallback");
                BaseAppCompatActivity.navigateToMainActivity$default(BaseAppCompatActivity.this, null, 1, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ce5) obj);
                return ww8.a;
            }
        });
    }

    private final void N() {
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("isMagicLinkLogin", false)) {
            return;
        }
        String stringExtra = intent.getStringExtra("emailAddress");
        SnackbarUtil snackbarUtil = getSnackbarUtil();
        String string = getString(hk6.magic_login_success, stringExtra);
        zq3.g(string, "getString(...)");
        SnackbarUtil.z(snackbarUtil, string, 0, false, 4, null);
    }

    public static /* synthetic */ void navigateToMainActivity$default(BaseAppCompatActivity baseAppCompatActivity, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToMainActivity");
        }
        if ((i & 1) != 0) {
            bundle = null;
        }
        baseAppCompatActivity.navigateToMainActivity(bundle);
    }

    public static final void setScrollableToolbarEnabled(View view, boolean z) {
        Companion.a(view, z);
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        if (configuration != null) {
            int i = configuration.uiMode;
            configuration.setTo(getBaseContext().getResources().getConfiguration());
            configuration.uiMode = i;
        }
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.jk, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        zq3.h(context, "base");
        super.attachBaseContext(xs5.Companion.d(context));
    }

    public final Single<Boolean> forceLocaleUpdate() {
        Single<Boolean> just = Single.just(Boolean.valueOf(L()));
        zq3.g(just, "just(...)");
        return just;
    }

    public final CompositeDisposable getCompositeDisposable() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        if (compositeDisposable != null) {
            return compositeDisposable;
        }
        zq3.z("compositeDisposable");
        return null;
    }

    public final s74 getLocaleUtils() {
        s74 s74Var = this.localeUtils;
        if (s74Var != null) {
            return s74Var;
        }
        zq3.z("localeUtils");
        return null;
    }

    public final td4 getMainActivityNavigator() {
        td4 td4Var = this.mainActivityNavigator;
        if (td4Var != null) {
            return td4Var;
        }
        zq3.z("mainActivityNavigator");
        return null;
    }

    public final oi4 getMediaLifecycleObserver() {
        oi4 oi4Var = this.mediaLifecycleObserver;
        if (oi4Var != null) {
            return oi4Var;
        }
        zq3.z("mediaLifecycleObserver");
        return null;
    }

    public final ScreenshotTracker getScreenshotTracker() {
        ScreenshotTracker screenshotTracker = this.screenshotTracker;
        if (screenshotTracker != null) {
            return screenshotTracker;
        }
        zq3.z("screenshotTracker");
        return null;
    }

    public final SnackbarUtil getSnackbarUtil() {
        SnackbarUtil snackbarUtil = this.snackbarUtil;
        if (snackbarUtil != null) {
            return snackbarUtil;
        }
        zq3.z("snackbarUtil");
        return null;
    }

    public final fx3 getStamper() {
        fx3 fx3Var = this.stamper;
        if (fx3Var != null) {
            return fx3Var;
        }
        zq3.z("stamper");
        return null;
    }

    @Override // defpackage.jk
    public x3 getSupportActionBar() {
        x3 x3Var = this.wrappedActionBar;
        return x3Var != null ? x3Var : super.getSupportActionBar();
    }

    @Override // com.nytimes.android.utils.snackbar.a
    public boolean isUsingCompose() {
        return a.b.a(this);
    }

    protected final void navigateToMainActivity() {
        navigateToMainActivity$default(this, null, 1, null);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        oi4 mediaLifecycleObserver = getMediaLifecycleObserver();
        Lifecycle lifecycle = getLifecycle();
        zq3.g(lifecycle, "<get-lifecycle>(...)");
        mediaLifecycleObserver.a(lifecycle);
        getLocaleUtils().a(this);
        N();
        M();
    }

    @Override // defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        getCompositeDisposable().clear();
        super.onDestroy();
    }

    @Override // defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        getStamper().c(System.currentTimeMillis());
    }

    public final void setCompositeDisposable(CompositeDisposable compositeDisposable) {
        zq3.h(compositeDisposable, "<set-?>");
        this.compositeDisposable = compositeDisposable;
    }

    public final void setLocaleUtils(s74 s74Var) {
        zq3.h(s74Var, "<set-?>");
        this.localeUtils = s74Var;
    }

    public final void setMainActivityNavigator(td4 td4Var) {
        zq3.h(td4Var, "<set-?>");
        this.mainActivityNavigator = td4Var;
    }

    public final void setMediaLifecycleObserver(oi4 oi4Var) {
        zq3.h(oi4Var, "<set-?>");
        this.mediaLifecycleObserver = oi4Var;
    }

    public final void setScreenshotTracker(ScreenshotTracker screenshotTracker) {
        zq3.h(screenshotTracker, "<set-?>");
        this.screenshotTracker = screenshotTracker;
    }

    public final void setSnackbarUtil(SnackbarUtil snackbarUtil) {
        zq3.h(snackbarUtil, "<set-?>");
        this.snackbarUtil = snackbarUtil;
    }

    public final void setStamper(fx3 fx3Var) {
        zq3.h(fx3Var, "<set-?>");
        this.stamper = fx3Var;
    }

    @Override // defpackage.jk
    public void setSupportActionBar(Toolbar toolbar) {
        CustomActionBarWrapper customActionBarWrapper;
        super.setSupportActionBar(toolbar);
        if (toolbar instanceof CustomToolbar) {
            x3 supportActionBar = getSupportActionBar();
            zq3.e(supportActionBar);
            customActionBarWrapper = new CustomActionBarWrapper(supportActionBar, (CustomToolbar) toolbar);
        } else {
            customActionBarWrapper = null;
        }
        this.wrappedActionBar = customActionBarWrapper;
    }

    protected final void navigateToMainActivity(Bundle bundle) {
        getMainActivityNavigator().b(this, bundle);
        finish();
    }
}
