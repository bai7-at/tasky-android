package com.nytimes.android.articlefront;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.nytimes.android.BaseAppCompatActivity;
import com.nytimes.android.analytics.event.GatewayEvent;
import com.nytimes.android.articlefront.BaseArticleActivity;
import com.nytimes.android.articlefront.a;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.menu.MenuManager;
import com.nytimes.android.messaging.dock.DockConfig;
import com.nytimes.android.messaging.dock.DockView;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.cb2;
import defpackage.ce5;
import defpackage.e52;
import defpackage.ee5;
import defpackage.i4;
import defpackage.jc;
import defpackage.ng6;
import defpackage.nk6;
import defpackage.qs2;
import defpackage.rb5;
import defpackage.s42;
import defpackage.ss2;
import defpackage.tg6;
import defpackage.u32;
import defpackage.ww8;
import defpackage.x3;
import defpackage.y32;
import defpackage.zq3;
import defpackage.zs1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseArticleActivity extends BaseAppCompatActivity implements a {
    private String a;
    public i4 activityAnalytics;
    public jc analyticsClient;
    public zs1 dockDeepLinkHandler;
    public ET2Scope et2Scope;
    public cb2 featureFlagUtil;
    public MenuManager menuManager;

    private final void M() {
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        zq3.g(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        ee5.a(onBackPressedDispatcher, this, true, new ss2() { // from class: com.nytimes.android.articlefront.BaseArticleActivity$handleBackPressed$1
            {
                super(1);
            }

            public final void b(ce5 ce5Var) {
                zq3.h(ce5Var, "$this$addCallback");
                BaseArticleActivity.this.T().x();
                if (BaseArticleActivity.this.T().l()) {
                    BaseArticleActivity.this.T().m(GatewayEvent.ActionTaken.Back, BaseArticleActivity.this.T().e(), BaseArticleActivity.this.T().f(), null);
                }
                BaseArticleActivity.this.T().z(false);
                ce5Var.remove();
                BaseArticleActivity.this.getOnBackPressedDispatcher().l();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ce5) obj);
                return ww8.a;
            }
        });
    }

    private final void Q(boolean z, final int i, DockConfig dockConfig) {
        final DockView dockView = (DockView) findViewById(tg6.dock_container);
        if (!z) {
            if (dockView != null) {
                dockView.show(false);
            }
        } else {
            if (dockView != null) {
                dockView.showMessage(new qs2() { // from class: com.nytimes.android.articlefront.BaseArticleActivity$configureDock$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m195invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m195invoke() {
                        i4 S = BaseArticleActivity.this.S();
                        BaseArticleActivity baseArticleActivity = BaseArticleActivity.this;
                        DockView dockView2 = dockView;
                        zq3.g(dockView2, "$dockView");
                        S.f(baseArticleActivity, dockView2, i);
                    }
                }, dockConfig);
            }
            if (dockView != null) {
                dockView.setOnClickListener(new View.OnClickListener() { // from class: a50
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseArticleActivity.R(BaseArticleActivity.this, dockView, i, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(BaseArticleActivity baseArticleActivity, DockView dockView, int i, View view) {
        zq3.h(baseArticleActivity, "this$0");
        baseArticleActivity.a0(dockView.getCta(), dockView.getLocationLink());
        baseArticleActivity.V().a(dockView.getLocationLink());
        i4 S = baseArticleActivity.S();
        String locationLink = dockView.getLocationLink();
        String str = locationLink == null ? "" : locationLink;
        String cta = dockView.getCta();
        S.c(baseArticleActivity, i, str, "AND_DOCK_CORE", cta == null ? "" : cta);
        if (baseArticleActivity.V().b()) {
            return;
        }
        baseArticleActivity.d0();
        NYTLogger.g("GMAX: Dock link is not handled: link " + dockView.getLocationLink(), new Object[0]);
    }

    private final void a0(String str, String str2) {
        ET2PageScope.DefaultImpls.a(W(), new e52.e(), new s42("dock", "AND_DOCK_CORE", null, null, str, str2, null, new y32(str, null, null, "button", null, null, 54, null), str, 76, null), new u32(null, "dock", "tap", 1, null), null, 8, null);
    }

    private final void c0() {
        setSupportActionBar((Toolbar) findViewById(ng6.toolbar));
        x3 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayOptions(14);
            supportActionBar.setTitle("");
        }
    }

    private final void d0() {
        a.C0012a c0012a = new a.C0012a(this);
        c0012a.f(getString(nk6.dock_dialog_error_message));
        c0012a.setPositiveButton(nk6.dialog_btn_ok, new DialogInterface.OnClickListener() { // from class: z40
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BaseArticleActivity.e0(dialogInterface, i);
            }
        });
        c0012a.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public final i4 S() {
        i4 i4Var = this.activityAnalytics;
        if (i4Var != null) {
            return i4Var;
        }
        zq3.z("activityAnalytics");
        return null;
    }

    public final jc T() {
        jc jcVar = this.analyticsClient;
        if (jcVar != null) {
            return jcVar;
        }
        zq3.z("analyticsClient");
        return null;
    }

    public final String U() {
        return this.a;
    }

    public final zs1 V() {
        zs1 zs1Var = this.dockDeepLinkHandler;
        if (zs1Var != null) {
            return zs1Var;
        }
        zq3.z("dockDeepLinkHandler");
        return null;
    }

    public final ET2Scope W() {
        ET2Scope eT2Scope = this.et2Scope;
        if (eT2Scope != null) {
            return eT2Scope;
        }
        zq3.z("et2Scope");
        return null;
    }

    public final MenuManager X() {
        MenuManager menuManager = this.menuManager;
        if (menuManager != null) {
            return menuManager;
        }
        zq3.z("menuManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y() {
        c0();
        Toolbar toolbar = (Toolbar) findViewById(ng6.toolbar);
        if (DeviceUtils.G(this) && (toolbar instanceof BottomAppBar)) {
            ((BottomAppBar) toolbar).setHideOnScroll(false);
        }
    }

    public final boolean Z() {
        return rb5.r(this.a) || rb5.o(this.a);
    }

    public final void b0(String str) {
        this.a = str;
    }

    public final cb2 getFeatureFlagUtil() {
        cb2 cb2Var = this.featureFlagUtil;
        if (cb2Var != null) {
            return cb2Var;
        }
        zq3.z("featureFlagUtil");
        return null;
    }

    @Override // com.nytimes.android.articlefront.a
    public void j(boolean z, int i, DockConfig dockConfig) {
        zq3.h(dockConfig, "dockConfig");
        if (Z()) {
            return;
        }
        Q(z, i, dockConfig);
    }

    @Override // com.nytimes.android.articlefront.a
    public void k(boolean z) {
        a.C0235a.a(this, z);
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getIntent().getStringExtra("com.nytimes.android.extra.ASSET_URL");
        M();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        zq3.h(menu, "menu");
        X().m(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        zq3.h(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            return itemId == ng6.subscriberLinkSharing || X().n(menuItem) || super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().l();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        zq3.h(menu, "menu");
        X().o(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        zq3.h(strArr, "permissions");
        zq3.h(iArr, "results");
        super.onRequestPermissionsResult(i, strArr, iArr);
        List x0 = getSupportFragmentManager().x0();
        zq3.g(x0, "getFragments(...)");
        Iterator it2 = x0.iterator();
        while (it2.hasNext()) {
            ((Fragment) it2.next()).onRequestPermissionsResult(i, strArr, iArr);
        }
    }
}
