package com.nytimes.android;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.nytimes.android.BaseAppCompatActivity;
import com.nytimes.android.WebActivity;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.fragment.AssetArgs;
import com.nytimes.android.fragment.WebViewFragment;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.menu.MenuManager;
import com.nytimes.android.messaging.dock.DockConfig;
import com.nytimes.android.messaging.dock.DockView;
import defpackage.cb2;
import defpackage.e52;
import defpackage.ei6;
import defpackage.gg6;
import defpackage.i4;
import defpackage.jc;
import defpackage.ng6;
import defpackage.nk6;
import defpackage.qs2;
import defpackage.qv6;
import defpackage.s42;
import defpackage.tg6;
import defpackage.u32;
import defpackage.uy3;
import defpackage.ww8;
import defpackage.x3;
import defpackage.y32;
import defpackage.zq3;
import defpackage.zs1;

/* loaded from: classes2.dex */
public final class WebActivity extends h implements com.nytimes.android.articlefront.a {
    public i4 activityAnalytics;
    public jc analyticsClient;
    public zs1 dockDeepLinkHandler;
    public ET2Scope et2Scope;
    public cb2 featureFlagUtil;
    public uy3 launchProductLandingHelper;
    public MenuManager menuManager;
    public qv6 remoteConfig;

    private final void V(String str, boolean z, boolean z2) {
        getSupportFragmentManager().p().b(ng6.container, WebViewFragment.Companion.a(new AssetArgs(null, str, null, null, 0, null, getIntent().getBooleanExtra("com.nytimes.android.extra.FORCE_LOAD_IN_APP", false), z, z2, false, null, 1596, null))).h();
    }

    private final void W(String str, String str2) {
        ET2PageScope.DefaultImpls.a(T(), new e52.e(), new s42("dock", "AND_DOCK_CORE", null, null, str, str2, null, new y32(str, null, null, "button", null, null, 54, null), str, 76, null), new u32(null, "dock", "tap", 1, null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(DockView dockView, WebActivity webActivity, int i, View view) {
        zq3.h(webActivity, "this$0");
        String locationLink = dockView.getLocationLink();
        if (locationLink == null || locationLink.length() == 0) {
            webActivity.Z();
            NYTLogger.g("GMAX: dockView.setOnClickListener fail: link " + locationLink, new Object[0]);
            return;
        }
        webActivity.W(dockView.getCta(), dockView.getLocationLink());
        webActivity.S().a(locationLink);
        i4 Q = webActivity.Q();
        String cta = dockView.getCta();
        if (cta == null) {
            cta = "";
        }
        Q.b(webActivity, i, locationLink, "AND_DOCK_CORE", cta);
        if (webActivity.S().b()) {
            return;
        }
        webActivity.Z();
    }

    private final void Y(String str, boolean z) {
        setSupportActionBar((Toolbar) findViewById(ng6.toolbar));
        x3 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayOptions(14);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            if (z) {
                supportActionBar.setDisplayShowTitleEnabled(false);
                supportActionBar.setDisplayShowCustomEnabled(true);
                supportActionBar.setCustomView(ei6.action_bar_sports_title);
            } else {
                supportActionBar.setDisplayShowCustomEnabled(false);
                supportActionBar.setDisplayShowTitleEnabled(true);
                if (str == null) {
                    str = "";
                }
                supportActionBar.setTitle(str);
            }
        }
    }

    private final void Z() {
        a.C0012a c0012a = new a.C0012a(this);
        c0012a.f(getString(nk6.dock_dialog_error_message));
        c0012a.setPositiveButton(nk6.dialog_btn_ok, new DialogInterface.OnClickListener() { // from class: fd9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WebActivity.a0(dialogInterface, i);
            }
        });
        c0012a.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public final i4 Q() {
        i4 i4Var = this.activityAnalytics;
        if (i4Var != null) {
            return i4Var;
        }
        zq3.z("activityAnalytics");
        return null;
    }

    public final jc R() {
        jc jcVar = this.analyticsClient;
        if (jcVar != null) {
            return jcVar;
        }
        zq3.z("analyticsClient");
        return null;
    }

    public final zs1 S() {
        zs1 zs1Var = this.dockDeepLinkHandler;
        if (zs1Var != null) {
            return zs1Var;
        }
        zq3.z("dockDeepLinkHandler");
        return null;
    }

    public final ET2Scope T() {
        ET2Scope eT2Scope = this.et2Scope;
        if (eT2Scope != null) {
            return eT2Scope;
        }
        zq3.z("et2Scope");
        return null;
    }

    public final MenuManager U() {
        MenuManager menuManager = this.menuManager;
        if (menuManager != null) {
            return menuManager;
        }
        zq3.z("menuManager");
        return null;
    }

    @Override // com.nytimes.android.articlefront.a
    public void j(boolean z, final int i, DockConfig dockConfig) {
        zq3.h(dockConfig, "dockConfig");
        final DockView dockView = (DockView) findViewById(tg6.dock_container);
        if (!z) {
            dockView.show(false);
        } else {
            dockView.showMessage(new qs2() { // from class: com.nytimes.android.WebActivity$setBottomViewEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m194invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m194invoke() {
                    i4 Q = WebActivity.this.Q();
                    WebActivity webActivity = WebActivity.this;
                    DockView dockView2 = dockView;
                    zq3.g(dockView2, "$dockView");
                    Q.e(webActivity, dockView2, i);
                }
            }, dockConfig);
            dockView.setOnClickListener(new View.OnClickListener() { // from class: gd9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WebActivity.X(DockView.this, this, i, view);
                }
            });
        }
    }

    @Override // com.nytimes.android.articlefront.a
    public void k(boolean z) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(gg6.collapsing_toolbar);
        BaseAppCompatActivity.a aVar = BaseAppCompatActivity.Companion;
        zq3.e(collapsingToolbarLayout);
        aVar.a(collapsingToolbarLayout, z);
    }

    @Override // com.nytimes.android.h, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ei6.web_holder);
        String stringExtra = getIntent().getStringExtra("com.nytimes.android.extra.URL");
        String stringExtra2 = getIntent().getStringExtra("sectionTitle");
        boolean booleanExtra = getIntent().getBooleanExtra("sectionIsAthleticSectionFront", false);
        if (booleanExtra) {
            ET2CoroutineScopeKt.b(this, new WebActivity$onCreate$1(null));
        }
        boolean booleanExtra2 = getIntent().getBooleanExtra("INTENT_EXTRA_KEY_SHOW_SHARING_OPTION", true);
        if (bundle == null && stringExtra != null) {
            V(stringExtra, zq3.c(stringExtra, getIntent().getStringExtra("com.nytimes.android.extra.METER_OVERRIDE_URL")), booleanExtra2);
        }
        Y(stringExtra2, booleanExtra);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        zq3.h(menu, "menu");
        U().m(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        zq3.h(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            getOnBackPressedDispatcher().l();
        } else if (!U().n(menuItem) && !super.onOptionsItemSelected(menuItem)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        zq3.h(menu, "menu");
        U().o(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        R().B(-1);
    }
}
