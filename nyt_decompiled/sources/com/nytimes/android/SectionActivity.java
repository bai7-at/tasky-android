package com.nytimes.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.common.api.GoogleApiClient;
import com.nytimes.android.SectionActivity;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.menu.MenuManager;
import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.sectionfront.SectionFrontFragment;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.widget.CustomSwipeRefreshLayout;
import defpackage.bh7;
import defpackage.c97;
import defpackage.cb2;
import defpackage.ce5;
import defpackage.ee5;
import defpackage.ff7;
import defpackage.gd6;
import defpackage.gg6;
import defpackage.hi6;
import defpackage.im;
import defpackage.jc;
import defpackage.nf7;
import defpackage.pg6;
import defpackage.ss2;
import defpackage.u3;
import defpackage.wg7;
import defpackage.wq5;
import defpackage.ww8;
import defpackage.x3;
import defpackage.xk8;
import defpackage.z58;
import defpackage.zc;
import defpackage.zq3;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SectionActivity extends f implements wg7 {
    public static final a Companion = new a(null);
    public static final int l = 8;
    public jc analyticsClient;
    public zc analyticsEventReporter;
    private ff7 e;
    public z58 eCommClient;
    private CustomSwipeRefreshLayout f;
    public cb2 featureFlagUtil;
    private String g;
    private String h;
    private Toolbar i;
    private boolean j;
    private GoogleApiClient k;
    public MenuManager menuManager;
    public NetworkStatus networkStatus;
    public SavedManager savedManager;
    public nf7 sectionFrontFragmentFactory;
    public bh7 sectionFrontRefresher;

    private static final class SIParams implements Serializable {
        private boolean isRefreshing;

        public final boolean a() {
            return this.isRefreshing;
        }

        public final void b(boolean z) {
            this.isRefreshing = z;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void M() {
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        zq3.g(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        ee5.a(onBackPressedDispatcher, this, true, new ss2() { // from class: com.nytimes.android.SectionActivity$handleBackPressed$1
            {
                super(1);
            }

            public final void b(ce5 ce5Var) {
                zq3.h(ce5Var, "$this$addCallback");
                SectionActivity.this.h0();
                ce5Var.remove();
                SectionActivity.this.getOnBackPressedDispatcher().l();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ce5) obj);
                return ww8.a;
            }
        });
    }

    private final void T() {
        String str = this.g;
        if (str == null) {
            zq3.z("sectionName");
            str = null;
        }
        if (c97.c(str)) {
            X().deleteQueuedItemsBlocking();
        }
    }

    private final void b0(Bundle bundle) {
        if (bundle != null) {
            Fragment k0 = getSupportFragmentManager().k0("CONTENT_FRAGMENT_TAG");
            zq3.f(k0, "null cannot be cast to non-null type com.nytimes.android.sectionfront.util.SectionFragment");
            this.e = (ff7) k0;
            return;
        }
        nf7 Y = Y();
        String str = this.g;
        String str2 = null;
        if (str == null) {
            zq3.z("sectionName");
            str = null;
        }
        String str3 = this.h;
        if (str3 == null) {
            zq3.z("sectionTitle");
        } else {
            str2 = str3;
        }
        Fragment b = Y.b(this, str, str2, this);
        zq3.f(b, "null cannot be cast to non-null type com.nytimes.android.sectionfront.util.SectionFragment");
        ff7 ff7Var = (ff7) b;
        this.e = ff7Var;
        Intent intent = getIntent();
        Bundle arguments = ff7Var.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        wq5.e(intent, arguments);
        getSupportFragmentManager().p().c(pg6.container, ff7Var, "CONTENT_FRAGMENT_TAG").h();
    }

    private final void c0(Bundle bundle) {
        View findViewById = findViewById(pg6.swipe_refresh_layout);
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) findViewById;
        customSwipeRefreshLayout.setColorSchemeResources(gd6.content_primary_alwayslight);
        customSwipeRefreshLayout.setProgressBackgroundColorSchemeResource(gd6.background_primary_alwayslight);
        customSwipeRefreshLayout.setSwipeDelegate(new CustomSwipeRefreshLayout.SwipeDelegate() { // from class: ke7
            @Override // com.nytimes.android.widget.CustomSwipeRefreshLayout.SwipeDelegate
            public final boolean canScrollUp() {
                boolean d0;
                d0 = SectionActivity.d0(SectionActivity.this);
                return d0;
            }
        });
        customSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: le7
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                SectionActivity.e0(SectionActivity.this);
            }
        });
        zq3.g(findViewById, "apply(...)");
        this.f = customSwipeRefreshLayout;
        CustomSwipeRefreshLayout customSwipeRefreshLayout2 = null;
        Serializable serializable = bundle != null ? bundle.getSerializable("SectionActivity.SI_PARAMS") : null;
        SIParams sIParams = serializable instanceof SIParams ? (SIParams) serializable : null;
        if (sIParams != null) {
            CustomSwipeRefreshLayout customSwipeRefreshLayout3 = this.f;
            if (customSwipeRefreshLayout3 == null) {
                zq3.z("swipeRefreshLayout");
            } else {
                customSwipeRefreshLayout2 = customSwipeRefreshLayout3;
            }
            customSwipeRefreshLayout2.setRefreshing(sIParams.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d0(SectionActivity sectionActivity) {
        zq3.h(sectionActivity, "this$0");
        ff7 ff7Var = sectionActivity.e;
        if (ff7Var != null) {
            return ff7Var.canScrollUp();
        }
        throw new IllegalStateException("Should be available");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(SectionActivity sectionActivity) {
        zq3.h(sectionActivity, "this$0");
        sectionActivity.f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(SectionActivity sectionActivity, Object obj) {
        zq3.h(sectionActivity, "this$0");
        String str = sectionActivity.g;
        if (str == null) {
            zq3.z("sectionName");
            str = null;
        }
        if (c97.c(str)) {
            sectionActivity.a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        String stringExtra = getIntent().getStringExtra("previousSectionHeader");
        jc U = U();
        if (stringExtra == null && (stringExtra = this.g) == null) {
            zq3.z("sectionName");
            stringExtra = null;
        }
        U.A(stringExtra);
    }

    private final void i0(String str) {
        Toolbar toolbar = (Toolbar) findViewById(gg6.toolbar);
        toolbar.setOnClickListener(new View.OnClickListener() { // from class: je7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SectionActivity.j0(SectionActivity.this, view);
            }
        });
        this.i = toolbar;
        setSupportActionBar(toolbar);
        x3 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayOptions(14);
            supportActionBar.setTitle(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(SectionActivity sectionActivity, View view) {
        ww8 ww8Var;
        zq3.h(sectionActivity, "this$0");
        ff7 ff7Var = sectionActivity.e;
        if (ff7Var != null) {
            ff7Var.n0(true);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            throw new IllegalStateException("Should be available");
        }
    }

    public final jc U() {
        jc jcVar = this.analyticsClient;
        if (jcVar != null) {
            return jcVar;
        }
        zq3.z("analyticsClient");
        return null;
    }

    public final u3 V() {
        xk8 a2 = new xk8.a().d("Section Page").e(Uri.parse("https://[ENTER-YOUR-URL-HERE]")).a();
        zq3.g(a2, "build(...)");
        u3 a3 = new u3.a("http://schema.org/ViewAction").j(a2).h("http://schema.org/CompletedActionStatus").a();
        zq3.g(a3, "build(...)");
        return a3;
    }

    public final MenuManager W() {
        MenuManager menuManager = this.menuManager;
        if (menuManager != null) {
            return menuManager;
        }
        zq3.z("menuManager");
        return null;
    }

    public final SavedManager X() {
        SavedManager savedManager = this.savedManager;
        if (savedManager != null) {
            return savedManager;
        }
        zq3.z("savedManager");
        return null;
    }

    public final nf7 Y() {
        nf7 nf7Var = this.sectionFrontFragmentFactory;
        if (nf7Var != null) {
            return nf7Var;
        }
        zq3.z("sectionFrontFragmentFactory");
        return null;
    }

    public final bh7 Z() {
        bh7 bh7Var = this.sectionFrontRefresher;
        if (bh7Var != null) {
            return bh7Var;
        }
        zq3.z("sectionFrontRefresher");
        return null;
    }

    public final void a0() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.f;
        if (customSwipeRefreshLayout == null) {
            zq3.z("swipeRefreshLayout");
            customSwipeRefreshLayout = null;
        }
        customSwipeRefreshLayout.setRefreshing(false);
    }

    @Override // defpackage.wg7
    public void e() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.f;
        if (customSwipeRefreshLayout == null) {
            zq3.z("swipeRefreshLayout");
            customSwipeRefreshLayout = null;
        }
        customSwipeRefreshLayout.setRefreshing(true);
    }

    public final void f0() {
        String str = this.g;
        String str2 = null;
        if (str == null) {
            zq3.z("sectionName");
            str = null;
        }
        NYTLogger.d("refresh requested from sectionfront %s", str);
        String str3 = this.g;
        if (str3 == null) {
            zq3.z("sectionName");
            str3 = null;
        }
        if (c97.c(str3)) {
            X().syncCache();
            return;
        }
        ff7 ff7Var = this.e;
        if (ff7Var instanceof SectionFrontFragment) {
            zq3.f(ff7Var, "null cannot be cast to non-null type com.nytimes.android.sectionfront.SectionFrontFragment");
            ((SectionFrontFragment) ff7Var).s1();
        }
        bh7 Z = Z();
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.f;
        if (customSwipeRefreshLayout == null) {
            zq3.z("swipeRefreshLayout");
            customSwipeRefreshLayout = null;
        }
        String str4 = this.g;
        if (str4 == null) {
            zq3.z("sectionName");
        } else {
            str2 = str4;
        }
        Z.l(customSwipeRefreshLayout, str2, new Consumer() { // from class: me7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SectionActivity.g0(SectionActivity.this, obj);
            }
        });
    }

    @Override // defpackage.wg7
    public void o() {
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.f;
        if (customSwipeRefreshLayout == null) {
            zq3.z("swipeRefreshLayout");
            customSwipeRefreshLayout = null;
        }
        customSwipeRefreshLayout.setRefreshing(false);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        ff7 ff7Var;
        super.onActivityResult(i, i2, intent);
        if (i != 20010 || (ff7Var = this.e) == null) {
            return;
        }
        ff7Var.b1();
    }

    @Override // com.nytimes.android.f, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("com.nytimes.android.extra.SECTION_ID");
        zq3.e(stringExtra);
        this.g = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("com.nytimes.android.extra.sectionHeader");
        zq3.e(stringExtra2);
        this.h = stringExtra2;
        setContentView(hi6.activity_section);
        c0(bundle);
        i0(getIntent().getStringExtra("com.nytimes.android.extra.sectionHeader"));
        b0(bundle);
        M();
        this.k = new GoogleApiClient.Builder(this).addApi(im.a).build();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        zq3.h(menu, "menu");
        W().m(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.nytimes.android.f, com.nytimes.android.BaseAppCompatActivity, defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        Toolbar toolbar = this.i;
        if (toolbar != null) {
            toolbar.setOnClickListener(null);
        }
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.f;
        if (customSwipeRefreshLayout == null) {
            zq3.z("swipeRefreshLayout");
            customSwipeRefreshLayout = null;
        }
        customSwipeRefreshLayout.setOnRefreshListener(null);
        CustomSwipeRefreshLayout customSwipeRefreshLayout2 = this.f;
        if (customSwipeRefreshLayout2 == null) {
            zq3.z("swipeRefreshLayout");
            customSwipeRefreshLayout2 = null;
        }
        customSwipeRefreshLayout2.setSwipeDelegate(null);
        Z().j();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        zq3.h(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return W().n(menuItem) || super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().l();
        return true;
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        this.j = true;
        super.onPause();
        T();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        zq3.h(menu, "menu");
        W().o(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.j) {
            this.j = false;
            if (U().h() == 2) {
                U().s("Background");
            }
        }
        U().B(2);
    }

    @Override // androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        zq3.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        SIParams sIParams = new SIParams();
        CustomSwipeRefreshLayout customSwipeRefreshLayout = this.f;
        if (customSwipeRefreshLayout == null) {
            zq3.z("swipeRefreshLayout");
            customSwipeRefreshLayout = null;
        }
        sIParams.b(customSwipeRefreshLayout.isRefreshing());
        bundle.putSerializable("SectionActivity.SI_PARAMS", sIParams);
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, defpackage.jk, androidx.fragment.app.f, android.app.Activity
    public void onStart() {
        super.onStart();
        GoogleApiClient googleApiClient = this.k;
        if (googleApiClient != null) {
            googleApiClient.connect();
            im.c.b(googleApiClient, V());
        }
    }

    @Override // defpackage.jk, androidx.fragment.app.f, android.app.Activity
    public void onStop() {
        super.onStop();
        GoogleApiClient googleApiClient = this.k;
        if (googleApiClient != null) {
            im.c.a(googleApiClient, V());
            googleApiClient.disconnect();
        }
    }
}
