package com.nytimes.subauth.ui.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import com.nytimes.subauth.ui.models.SubauthUiParams;
import com.nytimes.subauth.ui.ui.screens.LireContainerScreenKt;
import defpackage.f68;
import defpackage.gt2;
import defpackage.h51;
import defpackage.jk;
import defpackage.na4;
import defpackage.pc6;
import defpackage.r98;
import defpackage.tq0;
import defpackage.ul8;
import defpackage.v98;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.text.h;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class SubauthLoginActivity extends jk {
    private SubauthUiParams a;
    private SubauthLoginViewModel b;
    public f68 subauthConfig;
    public t.b viewModelFactory;

    private final boolean P(Intent intent, Uri uri) {
        if (zq3.c(intent.getAction(), "android.intent.action.VIEW")) {
            String intent2 = intent.toString();
            zq3.g(intent2, "toString(...)");
            if (!h.d0(intent2) && zq3.c(uri.getEncodedAuthority(), "authorize")) {
                SubauthLoginViewModel subauthLoginViewModel = this.b;
                if (subauthLoginViewModel == null) {
                    zq3.z("viewModel");
                    subauthLoginViewModel = null;
                }
                if (subauthLoginViewModel.V().getValue() instanceof na4.e) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void Q(String str) {
        h51.b i = new h51.b().f(2).g(false).i(true);
        zq3.g(i, "setUrlBarHidingEnabled(...)");
        h51 a = i.a();
        zq3.g(a, "build(...)");
        a.a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", true);
        a.a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
        a.a(this, Uri.parse(str));
    }

    private final void R() {
        if (getResources().getBoolean(pc6.subauth_isPortraitOnly)) {
            setRequestedOrientation(1);
        }
    }

    public final f68 M() {
        f68 f68Var = this.subauthConfig;
        if (f68Var != null) {
            return f68Var;
        }
        zq3.z("subauthConfig");
        return null;
    }

    public final t.b N() {
        t.b bVar = this.viewModelFactory;
        if (bVar != null) {
            return bVar;
        }
        zq3.z("viewModelFactory");
        return null;
    }

    public final void O(na4 na4Var) {
        if (na4Var instanceof na4.f) {
            ul8.a.z("SUBAUTH").a("Exiting Unified LIRE. LireScreenState = Login Success", new Object[0]);
            finish();
            return;
        }
        if (na4Var instanceof na4.h) {
            ul8.a.z("SUBAUTH").a("Exiting Unified LIRE. LireScreenState = Login Success w/ Failed Link", new Object[0]);
            finish();
        } else if (na4Var instanceof na4.g) {
            ul8.a.z("SUBAUTH").a("Exiting Unified LIRE. LireScreenState = Login Success (One Tap)", new Object[0]);
            finish();
        } else if (na4Var instanceof na4.e) {
            Q(((na4.e) na4Var).b());
        }
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v98 a = r98.b.a();
        if (a != null) {
            a.a(this);
        }
        SubauthUiParams subauthUiParams = (SubauthUiParams) getIntent().getParcelableExtra("subauth_ui_params");
        if (subauthUiParams == null) {
            subauthUiParams = new SubauthUiParams(false, false, false, false, null, false, false, null, null, null, 1023, null);
        }
        this.a = subauthUiParams;
        boolean booleanExtra = getIntent().getBooleanExtra("is_email_opt_in_register_flow", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("is_email_opt_in_reglite_flow", false);
        R();
        SubauthLoginViewModel subauthLoginViewModel = (SubauthLoginViewModel) new t(this, N()).a(SubauthLoginViewModel.class);
        this.b = subauthLoginViewModel;
        SubauthLoginViewModel subauthLoginViewModel2 = null;
        if (subauthLoginViewModel == null) {
            zq3.z("viewModel");
            subauthLoginViewModel = null;
        }
        SubauthUiParams subauthUiParams2 = this.a;
        if (subauthUiParams2 == null) {
            zq3.z("subauthUiParams");
            subauthUiParams2 = null;
        }
        subauthLoginViewModel.P0(subauthUiParams2);
        if (booleanExtra || booleanExtra2) {
            SubauthLoginViewModel subauthLoginViewModel3 = this.b;
            if (subauthLoginViewModel3 == null) {
                zq3.z("viewModel");
                subauthLoginViewModel3 = null;
            }
            subauthLoginViewModel3.S(booleanExtra);
        }
        tq0.b(this, null, zr0.c(-1338251091, true, new gt2() { // from class: com.nytimes.subauth.ui.login.SubauthLoginActivity$onCreate$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                SubauthLoginViewModel subauthLoginViewModel4;
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1338251091, i, -1, "com.nytimes.subauth.ui.login.SubauthLoginActivity.onCreate.<anonymous> (SubauthLoginActivity.kt:60)");
                }
                f68 M = SubauthLoginActivity.this.M();
                subauthLoginViewModel4 = SubauthLoginActivity.this.b;
                if (subauthLoginViewModel4 == null) {
                    zq3.z("viewModel");
                    subauthLoginViewModel4 = null;
                }
                LireContainerScreenKt.c(subauthLoginViewModel4, SubauthLoginActivity.this, M, composer, 584);
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
        SubauthLoginViewModel subauthLoginViewModel4 = this.b;
        if (subauthLoginViewModel4 == null) {
            zq3.z("viewModel");
            subauthLoginViewModel4 = null;
        }
        Flow onEach = FlowKt.onEach(subauthLoginViewModel4.V(), new SubauthLoginActivity$onCreate$2(this, null));
        SubauthLoginViewModel subauthLoginViewModel5 = this.b;
        if (subauthLoginViewModel5 == null) {
            zq3.z("viewModel");
            subauthLoginViewModel5 = null;
        }
        FlowKt.launchIn(onEach, r.a(subauthLoginViewModel5));
        SubauthLoginViewModel subauthLoginViewModel6 = this.b;
        if (subauthLoginViewModel6 == null) {
            zq3.z("viewModel");
        } else {
            subauthLoginViewModel2 = subauthLoginViewModel6;
        }
        subauthLoginViewModel2.p0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        zq3.h(intent, "intent");
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data == null || !P(intent, data)) {
            return;
        }
        SubauthLoginViewModel subauthLoginViewModel = this.b;
        if (subauthLoginViewModel == null) {
            zq3.z("viewModel");
            subauthLoginViewModel = null;
        }
        String uri = data.toString();
        zq3.g(uri, "toString(...)");
        subauthLoginViewModel.h0(uri);
    }
}
