package com.nytimes.android.features.settings;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.features.settings.AboutFragment;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ae0;
import defpackage.cb2;
import defpackage.d96;
import defpackage.e44;
import defpackage.ho6;
import defpackage.i34;
import defpackage.id9;
import defpackage.kk6;
import defpackage.l83;
import defpackage.mz1;
import defpackage.pl6;
import defpackage.qd6;
import defpackage.qg6;
import defpackage.qv6;
import defpackage.vc6;
import defpackage.xk6;
import defpackage.xx0;
import defpackage.yc2;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import java.util.Locale;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class AboutFragment extends l83 {
    public AbraManager abraManager;
    public ae0 buildInfo;
    private final CompositeDisposable f = new CompositeDisposable();
    public cb2 featureFlagUtil;
    public yc2 feedback;
    public yc2 feedbackHelper;
    public Flow<String> firebaseInstanceIdFlow;
    public d96 purrManagerClient;
    public qv6 remoteConfig;
    public SettingsPageEventSender settingsPageEventSender;
    public SnackbarUtil snackbarUtil;
    public id9 webActivityNavigator;

    private final String k1() {
        return kotlin.text.h.f("\n            Build Type: " + getResources().getString(kk6.com_nytimes_android_build_type) + "\n            Build Info: " + l1().b() + "\n            Build Date: " + l1().a() + "\n            Expiration Date: " + l1().c() + "\n            Default Locale: " + Locale.getDefault() + "\n            Config source: " + p1().h() + "\n            ");
    }

    private final Preference o1(int i) {
        Preference findPreference = findPreference(getString(i));
        zq3.e(findPreference);
        return findPreference;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String q1() {
        /*
            r3 = this;
            r0 = 0
            androidx.fragment.app.f r3 = r3.getActivity()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            if (r3 == 0) goto L19
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            r2 = 0
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            goto L1a
        L15:
            r3 = move-exception
            com.nytimes.android.logging.NYTLogger.h(r3)
        L19:
            r3 = r0
        L1a:
            if (r3 == 0) goto L1f
            java.lang.String r1 = r3.versionName
            goto L20
        L1f:
            r1 = r0
        L20:
            if (r3 == 0) goto L28
            int r3 = r3.versionCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L28:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " ("
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.settings.AboutFragment.q1():java.lang.String");
    }

    private final void r1() {
        String a = new mz1(null, 1, null).a();
        Preference o1 = o1(xk6.settings_embrace_id_key);
        if (a.length() <= 0) {
            o1.C0(getString(xk6.settings_embrace_id_default));
            return;
        }
        o1.C0(a);
        Context context = getContext();
        if (context != null) {
            xx0.b(context, new AboutFragment$initEmbracePref$1(o1, this, a));
        }
    }

    private final void s1() {
        FlowKt.launchIn(FlowKt.onEach(n1(), new AboutFragment$initFirebasePref$1(o1(xk6.settings_firebase_id_key), this, null)), e44.a(this));
    }

    private final void t1(String str) {
        try {
            androidx.fragment.app.f activity = getActivity();
            if (activity != null) {
                getWebActivityNavigator().c(activity, str);
            }
        } catch (ActivityNotFoundException e) {
            NYTLogger.h(e);
            SnackbarUtil.y(getSnackbarUtil(), pl6.feedback_browser_launch_failed, 0, 2, null);
        }
    }

    private final void u1() {
        o1(xk6.settings_faq_key).y0(new Preference.d() { // from class: g0
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean v1;
                v1 = AboutFragment.v1(AboutFragment.this, preference);
                return v1;
            }
        });
        o1(xk6.settings_feedback_key).y0(new Preference.d() { // from class: h0
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean w1;
                w1 = AboutFragment.w1(AboutFragment.this, preference);
                return w1;
            }
        });
        o1(xk6.settings_tos_key).y0(new Preference.d() { // from class: i0
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean x1;
                x1 = AboutFragment.x1(AboutFragment.this, preference);
                return x1;
            }
        });
        o1(xk6.settings_legal_key).y0(new Preference.d() { // from class: j0
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean y1;
                y1 = AboutFragment.y1(AboutFragment.this, preference);
                return y1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v1(AboutFragment aboutFragment, Preference preference) {
        zq3.h(aboutFragment, "this$0");
        zq3.h(preference, "it");
        String string = aboutFragment.getString(xk6.faq_url);
        zq3.g(string, "getString(...)");
        aboutFragment.t1(string);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w1(AboutFragment aboutFragment, Preference preference) {
        zq3.h(aboutFragment, "this$0");
        zq3.h(preference, "it");
        aboutFragment.m1().b(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x1(AboutFragment aboutFragment, Preference preference) {
        zq3.h(aboutFragment, "this$0");
        zq3.h(preference, "it");
        String string = aboutFragment.getString(xk6.tos_url);
        zq3.g(string, "getString(...)");
        aboutFragment.t1(string);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y1(AboutFragment aboutFragment, Preference preference) {
        zq3.h(aboutFragment, "this$0");
        zq3.h(preference, "it");
        if (aboutFragment.getFeatureFlagUtil().x()) {
            aboutFragment.startActivity(new Intent(aboutFragment.requireActivity(), (Class<?>) LegalDynamicActivity.class));
            return true;
        }
        FragmentManager fragmentManager = aboutFragment.getFragmentManager();
        if (fragmentManager == null) {
            return true;
        }
        fragmentManager.p().g("Legal").b(qg6.pref_container, new i34()).h();
        return true;
    }

    public final AbraManager getAbraManager() {
        AbraManager abraManager = this.abraManager;
        if (abraManager != null) {
            return abraManager;
        }
        zq3.z("abraManager");
        return null;
    }

    public final cb2 getFeatureFlagUtil() {
        cb2 cb2Var = this.featureFlagUtil;
        if (cb2Var != null) {
            return cb2Var;
        }
        zq3.z("featureFlagUtil");
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

    public final id9 getWebActivityNavigator() {
        id9 id9Var = this.webActivityNavigator;
        if (id9Var != null) {
            return id9Var;
        }
        zq3.z("webActivityNavigator");
        return null;
    }

    public final ae0 l1() {
        ae0 ae0Var = this.buildInfo;
        if (ae0Var != null) {
            return ae0Var;
        }
        zq3.z("buildInfo");
        return null;
    }

    public final yc2 m1() {
        yc2 yc2Var = this.feedbackHelper;
        if (yc2Var != null) {
            return yc2Var;
        }
        zq3.z("feedbackHelper");
        return null;
    }

    public final Flow n1() {
        Flow<String> flow = this.firebaseInstanceIdFlow;
        if (flow != null) {
            return flow;
        }
        zq3.z("firebaseInstanceIdFlow");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(getResources().getColor(qd6.ds_times_white));
        }
        Preference findPreference = findPreference(getString(xk6.settings_build_key));
        if (findPreference != null) {
            findPreference.C0(k1());
            findPreference.p0(true);
        }
        s1();
        r1();
    }

    @Override // androidx.preference.d
    public void onCreatePreferences(Bundle bundle, String str) {
        Preference findPreference;
        addPreferencesFromResource(ho6.about);
        if (!getResources().getBoolean(vc6.display_detailed_build_information) && (findPreference = findPreference(getString(xk6.settings_build_key))) != null) {
            getPreferenceScreen().U0(findPreference);
        }
        Preference findPreference2 = findPreference(getString(xk6.settings_version_key));
        if (findPreference2 != null) {
            findPreference2.C0(q1());
        }
        Preference findPreference3 = findPreference(getString(xk6.settings_ab_version_key));
        if (findPreference3 != null) {
            findPreference3.C0(kotlin.text.h.f("\n            Bundled: " + getAbraManager().getBundledRulesVersion() + "\n            Current: " + getAbraManager().getRulesVersion() + "\n        "));
        }
        u1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f.clear();
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        ET2CoroutineScopeKt.d(this, new AboutFragment$onViewCreated$1(this, null));
    }

    public final qv6 p1() {
        qv6 qv6Var = this.remoteConfig;
        if (qv6Var != null) {
            return qv6Var;
        }
        zq3.z("remoteConfig");
        return null;
    }
}
