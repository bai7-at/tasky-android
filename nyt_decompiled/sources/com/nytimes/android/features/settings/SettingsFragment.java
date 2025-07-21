package com.nytimes.android.features.settings;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nytimes.android.BaseAppCompatActivity;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.features.notifications.push.ComposeNotificationsActivity;
import com.nytimes.android.features.settings.SettingsFragment;
import com.nytimes.android.features.settings.c;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.subauth.core.purchase.analytics.CampaignCodeSource;
import com.nytimes.android.textsize.TextSizeActivity;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.a49;
import defpackage.c04;
import defpackage.cb2;
import defpackage.d05;
import defpackage.e44;
import defpackage.e52;
import defpackage.fp6;
import defpackage.g05;
import defpackage.ho6;
import defpackage.i65;
import defpackage.id9;
import defpackage.jc;
import defpackage.jl6;
import defpackage.mt2;
import defpackage.ol6;
import defpackage.pe6;
import defpackage.q3;
import defpackage.qg6;
import defpackage.qs2;
import defpackage.r5;
import defpackage.rn1;
import defpackage.s42;
import defpackage.s96;
import defpackage.ss2;
import defpackage.t83;
import defpackage.tm;
import defpackage.uy3;
import defpackage.vc6;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.yc2;
import defpackage.zq3;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class SettingsFragment extends t83 implements SharedPreferences.OnSharedPreferenceChangeListener, q3 {
    public static final int $stable = 8;
    public AbraManager abraManager;
    public AccountSettingsPresenter accountSettingsPresenter;
    public jc analyticsClient;
    public AppPreferences appPreferences;
    public tm appPreferencesManager;
    public rn1 betaSettingActivityNavigator;
    public com.nytimes.android.entitlements.a eCommClient;
    public ET2CoroutineScope et2Scope;
    public cb2 featureFlagUtil;
    public FeedStore feedStore;
    public yc2 feedback;
    private boolean isConnected;
    public uy3 launchPlpHelper;
    public NetworkStatus networkStatus;
    public i65 nightModeInstaller;
    public PostLoginRegiOfferManager postLoginRegiManager;
    public s96 purrUIClientApi;
    public fp6 reAuthLauncher;
    public SnackbarUtil snackbarUtil;
    public id9 webActivityNavigator;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    private final Preference.d logInOutClick = new Preference.d() { // from class: pm7
        @Override // androidx.preference.Preference.d
        public final boolean a(Preference preference) {
            boolean logInOutClick$lambda$0;
            logInOutClick$lambda$0 = SettingsFragment.logInOutClick$lambda$0(SettingsFragment.this, preference);
            return logInOutClick$lambda$0;
        }
    };
    private final Preference.d subscribeClick = new Preference.d() { // from class: qm7
        @Override // androidx.preference.Preference.d
        public final boolean a(Preference preference) {
            boolean subscribeClick$lambda$1;
            subscribeClick$lambda$1 = SettingsFragment.subscribeClick$lambda$1(SettingsFragment.this, preference);
            return subscribeClick$lambda$1;
        }
    };
    private final c04 accountPreferenceCategory$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$accountPreferenceCategory$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PreferenceCategory mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.account_category_key));
            zq3.e(findPreference);
            return (PreferenceCategory) findPreference;
        }
    });
    private final c04 supportPreferenceCategory$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$supportPreferenceCategory$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PreferenceCategory mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.support_category_key));
            zq3.e(findPreference);
            return (PreferenceCategory) findPreference;
        }
    });
    private final c04 connectAccountPreference$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$connectAccountPreference$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Preference mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.connect_account_key));
            zq3.e(findPreference);
            return findPreference;
        }
    });
    private final c04 userNamePreference$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$userNamePreference$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Preference mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.username_key));
            zq3.e(findPreference);
            return findPreference;
        }
    });
    private final c04 accountSettingsPreference$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$accountSettingsPreference$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Preference mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.account_settings_key));
            zq3.e(findPreference);
            return findPreference;
        }
    });
    private final c04 manageSubPreference$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$manageSubPreference$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Preference mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.manage_subscription_key));
            zq3.e(findPreference);
            return findPreference;
        }
    });
    private final c04 benefitsPreference$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$benefitsPreference$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Preference mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.subscription_benefits_key));
            zq3.e(findPreference);
            return findPreference;
        }
    });
    private final c04 loginPreference$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$loginPreference$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Preference mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.loginOrCreate_key));
            zq3.e(findPreference);
            return findPreference;
        }
    });
    private final c04 subscribePreference$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$subscribePreference$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Preference mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.subscribe_key));
            zq3.e(findPreference);
            return findPreference;
        }
    });
    private final c04 logoutPreference$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$logoutPreference$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Preference mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.logout_key));
            zq3.e(findPreference);
            return findPreference;
        }
    });
    private final c04 manageAccountPreference$delegate = kotlin.c.a(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$manageAccountPreference$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Preference mo865invoke() {
            SettingsFragment settingsFragment = SettingsFragment.this;
            Preference findPreference = settingsFragment.findPreference(settingsFragment.getString(xk6.settings_manage_account_key));
            zq3.e(findPreference);
            return findPreference;
        }
    });

    public static final class a extends d05 {
        a(Class cls) {
            super(cls);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            zq3.h(obj, "aObject");
            SettingsFragment.this.isConnected = true;
        }
    }

    public static final class b extends d05 {
        b(Class cls) {
            super(cls);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            zq3.h(obj, "aObject");
            SettingsFragment.this.isConnected = false;
        }
    }

    public static final class c implements View.OnLayoutChangeListener {
        final /* synthetic */ RecyclerView b;

        public c(RecyclerView recyclerView) {
            this.b = recyclerView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            AppBarLayout appBarLayout = (AppBarLayout) SettingsFragment.this.findViewBy(view, new ss2() { // from class: com.nytimes.android.features.settings.SettingsFragment$onCreateRecyclerView$1$1$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final AppBarLayout invoke(View view2) {
                    zq3.h(view2, "it");
                    return (AppBarLayout) view2.findViewById(qg6.app_bar_layout);
                }
            });
            if (appBarLayout != null) {
                SettingsFragment settingsFragment = SettingsFragment.this;
                zq3.e(this.b);
                settingsFragment.setupAppBarLayout(appBarLayout, this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends View> T findViewBy(View view, ss2 ss2Var) {
        T t = (T) ss2Var.invoke(view);
        if (t != null) {
            return t;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return (T) findViewBy(view2, ss2Var);
        }
        return null;
    }

    private final PreferenceCategory getAccountPreferenceCategory() {
        return (PreferenceCategory) this.accountPreferenceCategory$delegate.getValue();
    }

    private final Preference getAccountSettingsPreference() {
        return (Preference) this.accountSettingsPreference$delegate.getValue();
    }

    private final Preference getBenefitsPreference() {
        return (Preference) this.benefitsPreference$delegate.getValue();
    }

    private final Preference getConnectAccountPreference() {
        return (Preference) this.connectAccountPreference$delegate.getValue();
    }

    private final Preference getLoginPreference() {
        return (Preference) this.loginPreference$delegate.getValue();
    }

    private final Preference getLogoutPreference() {
        return (Preference) this.logoutPreference$delegate.getValue();
    }

    private final Preference getManageAccountPreference() {
        return (Preference) this.manageAccountPreference$delegate.getValue();
    }

    private final Preference getManageSubPreference() {
        return (Preference) this.manageSubPreference$delegate.getValue();
    }

    private final Preference getSubscribePreference() {
        return (Preference) this.subscribePreference$delegate.getValue();
    }

    private final PreferenceCategory getSupportPreferenceCategory() {
        return (PreferenceCategory) this.supportPreferenceCategory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Preference getUserNamePreference() {
        return (Preference) this.userNamePreference$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoginClick() {
        androidx.fragment.app.f activity = getActivity();
        if (activity != null) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new SettingsFragment$handleLoginClick$1$1(this, activity, null), 3, null);
        }
    }

    private final void handleLoginLogoutClick() {
        if (!getECommClient().q()) {
            requireDeviceOnline(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$handleLoginLogoutClick$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m426invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m426invoke() {
                    SettingsFragment.this.handleLoginClick();
                }
            });
            return;
        }
        LogOutDialog logOutDialog = new LogOutDialog();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        zq3.g(parentFragmentManager, "getParentFragmentManager(...)");
        logOutDialog.F(parentFragmentManager);
    }

    private final void handleOnConnectedEvent() {
        Observer subscribeWith = getNetworkStatus().n().subscribeWith(new a(SettingsFragment.class));
        zq3.g(subscribeWith, "subscribeWith(...)");
        this.compositeDisposable.add((Disposable) subscribeWith);
    }

    private final void handleOnDisconnectEvent() {
        Observer subscribeWith = getNetworkStatus().q().subscribeWith(new b(SettingsFragment.class));
        zq3.g(subscribeWith, "subscribeWith(...)");
        this.compositeDisposable.add((Disposable) subscribeWith);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSubscribeClick() {
        ET2PageScope.DefaultImpls.a(getEt2Scope(), new e52.e(), new s42("subscribe", "subscribe", null, null, null, null, null, null, null, 508, null), null, null, 12, null);
        uy3.a.c(getLaunchPlpHelper(), CampaignCodeSource.SUBSCRIBE, RegiInterface.RegiSettings, "Settings", null, 8, null);
    }

    private final Disposable listenToLocaleUpdate() {
        androidx.fragment.app.f activity = getActivity();
        zq3.f(activity, "null cannot be cast to non-null type com.nytimes.android.BaseAppCompatActivity");
        Single<Boolean> forceLocaleUpdate = ((BaseAppCompatActivity) activity).forceLocaleUpdate();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.features.settings.SettingsFragment$listenToLocaleUpdate$1
            {
                super(1);
            }

            public final void b(Boolean bool) {
                SettingsFragment.this.onLocaleChanged();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Boolean) obj);
                return ww8.a;
            }
        };
        Disposable subscribe = forceLocaleUpdate.subscribe(new Consumer() { // from class: um7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingsFragment.listenToLocaleUpdate$lambda$6(ss2.this, obj);
            }
        }, new g05(SettingsFragment.class));
        zq3.g(subscribe, "subscribe(...)");
        return subscribe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenToLocaleUpdate$lambda$6(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean logInOutClick$lambda$0(SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        settingsFragment.handleLoginLogoutClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLocaleChanged() {
        addPreferencesFromResource(ho6.preferences);
        SharedPreferences B = getPreferenceScreen().B();
        if (B != null) {
            B.registerOnSharedPreferenceChangeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void promptForReAuthAndRedirectToSettingsUrl(String str) {
        Context context = getContext();
        if (context != null) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new SettingsFragment$promptForReAuthAndRedirectToSettingsUrl$1$1(this, context, str, null), 3, null);
        }
    }

    private final void reportAutoPlayEventOnPreferenceChange() {
        Preference findPreference = findPreference(getString(jl6.auto_play_video_settings_key));
        if (findPreference != null) {
            findPreference.s0(a49.b(getResources(), pe6.ic_autoplay, requireContext().getTheme()));
            findPreference.x0(new Preference.c() { // from class: xm7
                @Override // androidx.preference.Preference.c
                public final boolean a(Preference preference, Object obj) {
                    boolean reportAutoPlayEventOnPreferenceChange$lambda$7;
                    reportAutoPlayEventOnPreferenceChange$lambda$7 = SettingsFragment.reportAutoPlayEventOnPreferenceChange$lambda$7(SettingsFragment.this, preference, obj);
                    return reportAutoPlayEventOnPreferenceChange$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean reportAutoPlayEventOnPreferenceChange$lambda$7(SettingsFragment settingsFragment, Preference preference, Object obj) {
        zq3.h(settingsFragment, "this$0");
        zq3.f(obj, "null cannot be cast to non-null type kotlin.String");
        settingsFragment.getAppPreferencesManager().a((String) obj);
        return true;
    }

    private final void requireDeviceOnline(qs2 qs2Var) {
        if (this.isConnected) {
            qs2Var.mo865invoke();
            return;
        }
        View view = getView();
        if (view != null) {
            Toast.makeText(view.getContext(), ol6.subauth_offline_error, 0).show();
        }
    }

    private final void setFeedbackClickHandler() {
        Preference findPreference = findPreference(getString(xk6.pref_settings_feedback_key));
        zq3.e(findPreference);
        findPreference.y0(new Preference.d() { // from class: om7
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean feedbackClickHandler$lambda$8;
                feedbackClickHandler$lambda$8 = SettingsFragment.setFeedbackClickHandler$lambda$8(SettingsFragment.this, preference);
                return feedbackClickHandler$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setFeedbackClickHandler$lambda$8(SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        yc2.a.a(settingsFragment.getFeedback(), null, 1, null);
        return true;
    }

    private final void setHelpClickHandler() {
        Preference findPreference = findPreference(getString(xk6.help_key));
        zq3.e(findPreference);
        findPreference.s0(a49.b(getResources(), pe6.ic_about_app, requireContext().getTheme()));
        findPreference.y0(new Preference.d() { // from class: tm7
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean helpClickHandler$lambda$10$lambda$9;
                helpClickHandler$lambda$10$lambda$9 = SettingsFragment.setHelpClickHandler$lambda$10$lambda$9(SettingsFragment.this, preference);
                return helpClickHandler$lambda$10$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setHelpClickHandler$lambda$10$lambda$9(SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        settingsFragment.startActivity(new Intent(settingsFragment.requireContext(), (Class<?>) AboutActivity.class));
        return true;
    }

    private final void setUpPrivacySettings() {
        Preference findPreference = findPreference(getString(xk6.settings_privacy_settings_key));
        if (findPreference != null) {
            findPreference.y0(new Preference.d() { // from class: wm7
                @Override // androidx.preference.Preference.d
                public final boolean a(Preference preference) {
                    boolean upPrivacySettings$lambda$11;
                    upPrivacySettings$lambda$11 = SettingsFragment.setUpPrivacySettings$lambda$11(SettingsFragment.this, preference);
                    return upPrivacySettings$lambda$11;
                }
            });
        }
        if (getActivity() != null) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new SettingsFragment$setUpPrivacySettings$2$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setUpPrivacySettings$lambda$11(SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        s96 purrUIClientApi = settingsFragment.getPurrUIClientApi();
        Context requireContext = settingsFragment.requireContext();
        zq3.g(requireContext, "requireContext(...)");
        settingsFragment.startActivity(purrUIClientApi.a(requireContext));
        return true;
    }

    private final void setupAccountSettingsPreference() {
        getAccountSettingsPreference().y0(new Preference.d() { // from class: rm7
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean z;
                z = SettingsFragment.setupAccountSettingsPreference$lambda$13(SettingsFragment.this, preference);
                return z;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupAccountSettingsPreference$lambda$13(final SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        settingsFragment.requireDeviceOnline(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$setupAccountSettingsPreference$1$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m427invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m427invoke() {
                id9 webActivityNavigator = SettingsFragment.this.getWebActivityNavigator();
                Context requireContext = SettingsFragment.this.requireContext();
                zq3.g(requireContext, "requireContext(...)");
                String string = SettingsFragment.this.getString(xk6.nytAccountSettingsUrl);
                zq3.g(string, "getString(...)");
                webActivityNavigator.c(requireContext, string);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupAppBarLayout(AppBarLayout appBarLayout, RecyclerView recyclerView) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appBarLayout, "translationZ", 0.0f, DeviceUtils.b(4.0f));
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        NestedScrollView nestedScrollView = (NestedScrollView) findViewBy(recyclerView, new ss2() { // from class: com.nytimes.android.features.settings.SettingsFragment$setupAppBarLayout$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NestedScrollView invoke(View view) {
                zq3.h(view, "it");
                if (view instanceof NestedScrollView) {
                    return (NestedScrollView) view;
                }
                return null;
            }
        });
        if (nestedScrollView != null) {
            ViewExtensions.a(nestedScrollView, new mt2() { // from class: com.nytimes.android.features.settings.SettingsFragment$setupAppBarLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(5);
                }

                public final void b(View view, int i, int i2, int i3, int i4) {
                    zq3.h(view, "<anonymous parameter 0>");
                    Ref$BooleanRef ref$BooleanRef2 = Ref$BooleanRef.this;
                    boolean z = ref$BooleanRef2.element;
                    if (!z && i2 > 0) {
                        ref$BooleanRef2.element = !z;
                        ofFloat.start();
                    } else if (z && i2 == 0) {
                        ref$BooleanRef2.element = !z;
                        ofFloat.reverse();
                    }
                }

                @Override // defpackage.mt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    b((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                    return ww8.a;
                }
            });
        }
    }

    private final void setupBetaSettings() {
        final Intent intent;
        final Application application = requireActivity().getApplication();
        boolean z = application.getResources().getBoolean(vc6.show_developer_settings);
        Intent a2 = getBetaSettingActivityNavigator().a();
        if (a2 != null) {
            zq3.e(application);
            intent = r5.a(a2, application);
        } else {
            intent = null;
        }
        Preference findPreference = findPreference(getString(xk6.pref_settings_beta_key));
        zq3.e(findPreference);
        boolean z2 = intent != null;
        if (z && z2) {
            findPreference.y0(new Preference.d() { // from class: bn7
                @Override // androidx.preference.Preference.d
                public final boolean a(Preference preference) {
                    boolean z3;
                    z3 = SettingsFragment.setupBetaSettings$lambda$24(intent, this, application, preference);
                    return z3;
                }
            });
        } else {
            getAccountPreferenceCategory().U0(findPreference);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupBetaSettings$lambda$24(Intent intent, SettingsFragment settingsFragment, Application application, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        if (intent != null) {
            settingsFragment.startActivity(intent);
            return true;
        }
        Toast.makeText(application, "Beta settings not available", 0).show();
        return true;
    }

    private final void setupConnectAccountPreference() {
        getConnectAccountPreference().y0(new Preference.d() { // from class: sm7
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean z;
                z = SettingsFragment.setupConnectAccountPreference$lambda$16(SettingsFragment.this, preference);
                return z;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupConnectAccountPreference$lambda$16(SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        settingsFragment.requireDeviceOnline(new SettingsFragment$setupConnectAccountPreference$1$1(settingsFragment));
        return true;
    }

    private final void setupFontResizePreference() {
        Preference findPreference = findPreference(getString(xk6.pref_text_resize_key));
        if (findPreference != null) {
            findPreference.s0(a49.b(getResources(), pe6.ic_textsize, requireContext().getTheme()));
            findPreference.y0(new Preference.d() { // from class: ym7
                @Override // androidx.preference.Preference.d
                public final boolean a(Preference preference) {
                    boolean z;
                    z = SettingsFragment.setupFontResizePreference$lambda$21$lambda$20(SettingsFragment.this, preference);
                    return z;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupFontResizePreference$lambda$21$lambda$20(SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        androidx.fragment.app.f requireActivity = settingsFragment.requireActivity();
        TextSizeActivity.a aVar = TextSizeActivity.Companion;
        Context requireContext = settingsFragment.requireContext();
        zq3.g(requireContext, "requireContext(...)");
        requireActivity.startActivity(aVar.a(requireContext));
        return true;
    }

    private final void setupHomeDeliveryItemsPreference() {
        Preference findPreference = findPreference(getString(xk6.settings_suspend_delivery_key));
        zq3.e(findPreference);
        Preference findPreference2 = findPreference(getString(xk6.settings_report_missing_key));
        zq3.e(findPreference2);
        findPreference.y0(new Preference.d() { // from class: cn7
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean z;
                z = SettingsFragment.setupHomeDeliveryItemsPreference$lambda$22(SettingsFragment.this, preference);
                return z;
            }
        });
        findPreference2.y0(new Preference.d() { // from class: dn7
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean z;
                z = SettingsFragment.setupHomeDeliveryItemsPreference$lambda$23(SettingsFragment.this, preference);
                return z;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupHomeDeliveryItemsPreference$lambda$22(final SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        settingsFragment.requireDeviceOnline(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$setupHomeDeliveryItemsPreference$1$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m429invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m429invoke() {
                SettingsFragment settingsFragment2 = SettingsFragment.this;
                String string = settingsFragment2.getString(xk6.suspend_delivery_production);
                zq3.g(string, "getString(...)");
                settingsFragment2.promptForReAuthAndRedirectToSettingsUrl(string);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupHomeDeliveryItemsPreference$lambda$23(final SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        settingsFragment.requireDeviceOnline(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$setupHomeDeliveryItemsPreference$2$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m430invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m430invoke() {
                SettingsFragment settingsFragment2 = SettingsFragment.this;
                String string = settingsFragment2.getString(xk6.report_missing_production);
                zq3.g(string, "getString(...)");
                settingsFragment2.promptForReAuthAndRedirectToSettingsUrl(string);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupManageSubPreference() {
        if (!getECommClient().a()) {
            getAccountPreferenceCategory().U0(getManageSubPreference());
            getAccountPreferenceCategory().U0(getBenefitsPreference());
            return;
        }
        final String string = getECommClient().f() ? getString(xk6.playStoreSubscriptionsUrl) : getString(xk6.nyt_my_subscription_url);
        zq3.e(string);
        getAccountPreferenceCategory().M0(getManageSubPreference());
        getAccountPreferenceCategory().M0(getBenefitsPreference());
        getManageSubPreference().y0(new Preference.d() { // from class: zm7
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean z;
                z = SettingsFragment.setupManageSubPreference$lambda$14(SettingsFragment.this, string, preference);
                return z;
            }
        });
        getBenefitsPreference().y0(new Preference.d() { // from class: an7
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean z;
                z = SettingsFragment.setupManageSubPreference$lambda$15(SettingsFragment.this, preference);
                return z;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupManageSubPreference$lambda$14(final SettingsFragment settingsFragment, final String str, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(str, "$url");
        zq3.h(preference, "it");
        settingsFragment.requireDeviceOnline(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$setupManageSubPreference$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m431invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m431invoke() {
                id9 webActivityNavigator = SettingsFragment.this.getWebActivityNavigator();
                Context requireContext = SettingsFragment.this.requireContext();
                zq3.g(requireContext, "requireContext(...)");
                webActivityNavigator.c(requireContext, str);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupManageSubPreference$lambda$15(final SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        settingsFragment.requireDeviceOnline(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$setupManageSubPreference$2$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m432invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m432invoke() {
                id9 webActivityNavigator = SettingsFragment.this.getWebActivityNavigator();
                Context requireContext = SettingsFragment.this.requireContext();
                zq3.g(requireContext, "requireContext(...)");
                String string = SettingsFragment.this.getString(xk6.subscription_benefits_url);
                zq3.g(string, "getString(...)");
                webActivityNavigator.c(requireContext, string);
            }
        });
        return true;
    }

    private final void setupNotificationsPreference() {
        Preference findPreference = findPreference(getString(xk6.key_notifications));
        zq3.e(findPreference);
        findPreference.s0(a49.b(getResources(), pe6.ic_notifications, requireContext().getTheme()));
        findPreference.y0(new Preference.d() { // from class: vm7
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean z;
                z = SettingsFragment.setupNotificationsPreference$lambda$19(SettingsFragment.this, preference);
                return z;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupNotificationsPreference$lambda$19(SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        ComposeNotificationsActivity.a aVar = ComposeNotificationsActivity.Companion;
        androidx.fragment.app.f requireActivity = settingsFragment.requireActivity();
        zq3.g(requireActivity, "requireActivity(...)");
        settingsFragment.startActivity(aVar.a(requireActivity));
        return false;
    }

    private final void showLoggedInPreferences() {
        showLogoutPreference();
        getAccountPreferenceCategory().U0(getConnectAccountPreference());
        getAccountPreferenceCategory().M0(getUserNamePreference());
        getAccountPreferenceCategory().M0(getAccountSettingsPreference());
        getSupportPreferenceCategory().M0(getManageAccountPreference());
        setupAccountSettingsPreference();
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new SettingsFragment$showLoggedInPreferences$1(this, null), 3, null);
    }

    private final void showLoggedOutAccountPreferences() {
        showLoggedOutPreferences();
        getAccountPreferenceCategory().M0(getSubscribePreference());
    }

    private final void showLoggedOutPreferences() {
        showLoginPreference();
        getAccountPreferenceCategory().U0(getConnectAccountPreference());
        getAccountPreferenceCategory().U0(getUserNamePreference());
        getAccountPreferenceCategory().U0(getAccountSettingsPreference());
        getAccountPreferenceCategory().U0(getManageSubPreference());
        getAccountPreferenceCategory().U0(getBenefitsPreference());
        getSupportPreferenceCategory().U0(getManageAccountPreference());
    }

    private final void showLogin() {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new SettingsFragment$showLogin$1(this, null), 3, null);
    }

    private final void showLoginPreference() {
        getAccountPreferenceCategory().U0(getLogoutPreference());
        getAccountPreferenceCategory().M0(getLoginPreference());
    }

    private final void showLogoutPreference() {
        getAccountPreferenceCategory().U0(getLoginPreference());
        getAccountPreferenceCategory().M0(getLogoutPreference());
    }

    private final void showRegisteredAccountPreferences() {
        showLoggedInPreferences();
        getAccountPreferenceCategory().M0(getSubscribePreference());
        getUserNamePreference().C0("");
    }

    private final void showSubscriberAccountPreferences() {
        showLoggedInPreferences();
        getAccountPreferenceCategory().U0(getSubscribePreference());
        getUserNamePreference().B0(xk6.digitalSubscriber);
    }

    private final void showUnlinkedSubscriberPreferences() {
        getAccountPreferenceCategory().M0(getConnectAccountPreference());
        getAccountPreferenceCategory().U0(getUserNamePreference());
        getAccountPreferenceCategory().U0(getSubscribePreference());
        getAccountPreferenceCategory().U0(getLogoutPreference());
        getAccountPreferenceCategory().U0(getAccountSettingsPreference());
        getAccountPreferenceCategory().U0(getBenefitsPreference());
        getAccountPreferenceCategory().U0(getManageSubPreference());
        getAccountPreferenceCategory().U0(getLoginPreference());
        setupConnectAccountPreference();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeClick$lambda$1(final SettingsFragment settingsFragment, Preference preference) {
        zq3.h(settingsFragment, "this$0");
        zq3.h(preference, "it");
        settingsFragment.requireDeviceOnline(new qs2() { // from class: com.nytimes.android.features.settings.SettingsFragment$subscribeClick$1$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m433invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m433invoke() {
                SettingsFragment.this.handleSubscribeClick();
            }
        });
        return true;
    }

    private final void updatePreference(Preference preference, boolean z) {
        if (preference != null) {
            String q = preference.q();
            if (zq3.c(q, getString(jl6.key_bna_vibrate))) {
                ListPreference listPreference = (ListPreference) preference;
                listPreference.C0(listPreference.W0());
            } else if (zq3.c(q, getString(xk6.pref_chosen_theme))) {
                getNightModeInstaller().a();
            }
        }
    }

    public final AbraManager getAbraManager() {
        AbraManager abraManager = this.abraManager;
        if (abraManager != null) {
            return abraManager;
        }
        zq3.z("abraManager");
        return null;
    }

    public final AccountSettingsPresenter getAccountSettingsPresenter() {
        AccountSettingsPresenter accountSettingsPresenter = this.accountSettingsPresenter;
        if (accountSettingsPresenter != null) {
            return accountSettingsPresenter;
        }
        zq3.z("accountSettingsPresenter");
        return null;
    }

    public final jc getAnalyticsClient() {
        jc jcVar = this.analyticsClient;
        if (jcVar != null) {
            return jcVar;
        }
        zq3.z("analyticsClient");
        return null;
    }

    public final AppPreferences getAppPreferences() {
        AppPreferences appPreferences = this.appPreferences;
        if (appPreferences != null) {
            return appPreferences;
        }
        zq3.z("appPreferences");
        return null;
    }

    public final tm getAppPreferencesManager() {
        tm tmVar = this.appPreferencesManager;
        if (tmVar != null) {
            return tmVar;
        }
        zq3.z("appPreferencesManager");
        return null;
    }

    public final rn1 getBetaSettingActivityNavigator() {
        rn1 rn1Var = this.betaSettingActivityNavigator;
        if (rn1Var != null) {
            return rn1Var;
        }
        zq3.z("betaSettingActivityNavigator");
        return null;
    }

    public final com.nytimes.android.entitlements.a getECommClient() {
        com.nytimes.android.entitlements.a aVar = this.eCommClient;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("eCommClient");
        return null;
    }

    public final ET2CoroutineScope getEt2Scope() {
        ET2CoroutineScope eT2CoroutineScope = this.et2Scope;
        if (eT2CoroutineScope != null) {
            return eT2CoroutineScope;
        }
        zq3.z("et2Scope");
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

    public final FeedStore getFeedStore() {
        FeedStore feedStore = this.feedStore;
        if (feedStore != null) {
            return feedStore;
        }
        zq3.z("feedStore");
        return null;
    }

    public final yc2 getFeedback() {
        yc2 yc2Var = this.feedback;
        if (yc2Var != null) {
            return yc2Var;
        }
        zq3.z("feedback");
        return null;
    }

    public final uy3 getLaunchPlpHelper() {
        uy3 uy3Var = this.launchPlpHelper;
        if (uy3Var != null) {
            return uy3Var;
        }
        zq3.z("launchPlpHelper");
        return null;
    }

    public final NetworkStatus getNetworkStatus() {
        NetworkStatus networkStatus = this.networkStatus;
        if (networkStatus != null) {
            return networkStatus;
        }
        zq3.z("networkStatus");
        return null;
    }

    public final i65 getNightModeInstaller() {
        i65 i65Var = this.nightModeInstaller;
        if (i65Var != null) {
            return i65Var;
        }
        zq3.z("nightModeInstaller");
        return null;
    }

    public final PostLoginRegiOfferManager getPostLoginRegiManager() {
        PostLoginRegiOfferManager postLoginRegiOfferManager = this.postLoginRegiManager;
        if (postLoginRegiOfferManager != null) {
            return postLoginRegiOfferManager;
        }
        zq3.z("postLoginRegiManager");
        return null;
    }

    public final s96 getPurrUIClientApi() {
        s96 s96Var = this.purrUIClientApi;
        if (s96Var != null) {
            return s96Var;
        }
        zq3.z("purrUIClientApi");
        return null;
    }

    public final fp6 getReAuthLauncher() {
        fp6 fp6Var = this.reAuthLauncher;
        if (fp6Var != null) {
            return fp6Var;
        }
        zq3.z("reAuthLauncher");
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

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getAccountSettingsPresenter().b(this, e44.a(this));
        handleOnConnectedEvent();
        handleOnDisconnectEvent();
        setFeedbackClickHandler();
        setHelpClickHandler();
        setupFontResizePreference();
        reportAutoPlayEventOnPreferenceChange();
        setupNotificationsPreference();
        setupHomeDeliveryItemsPreference();
        setUpPrivacySettings();
        RecyclerView listView = getListView();
        androidx.fragment.app.f requireActivity = requireActivity();
        zq3.g(requireActivity, "requireActivity(...)");
        listView.addItemDecoration(new PreferenceItemDecoration(requireActivity, pe6.divider_preference_settings, pe6.divider_category_settings, false, 8, null));
        getListView().setLayoutAnimation(null);
        getListView().setItemAnimator(null);
        setupBetaSettings();
        getLoginPreference().y0(this.logInOutClick);
        getLogoutPreference().y0(this.logInOutClick);
        getSubscribePreference().y0(this.subscribeClick);
        setEt2Scope(ET2CoroutineScopeKt.d(this, new SettingsFragment$onActivityCreated$1(null)));
    }

    @Override // androidx.preference.d
    public void onCreatePreferences(Bundle bundle, String str) {
        this.compositeDisposable.add(listenToLocaleUpdate());
    }

    @Override // androidx.preference.d
    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        zq3.h(viewGroup, "parent");
        RecyclerView onCreateRecyclerView = super.onCreateRecyclerView(layoutInflater, viewGroup, bundle);
        zq3.e(onCreateRecyclerView);
        onCreateRecyclerView.addOnLayoutChangeListener(new c(onCreateRecyclerView));
        zq3.g(onCreateRecyclerView, "also(...)");
        return onCreateRecyclerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        SharedPreferences B = getPreferenceScreen().B();
        if (B != null) {
            B.unregisterOnSharedPreferenceChangeListener(this);
        }
        this.compositeDisposable.clear();
        getAccountSettingsPresenter().c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int R0 = getPreferenceScreen().R0();
        for (int i = 0; i < R0; i++) {
            Preference Q0 = getPreferenceScreen().Q0(i);
            zq3.g(Q0, "getPreference(...)");
            if (Q0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) Q0;
                int R02 = preferenceGroup.R0();
                for (int i2 = 0; i2 < R02; i2++) {
                    Preference Q02 = preferenceGroup.Q0(i2);
                    zq3.g(Q02, "getPreference(...)");
                    updatePreference(Q02, true);
                }
            } else {
                updatePreference(Q0, true);
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zq3.h(sharedPreferences, "sharedPreferences");
        if (str != null) {
            updatePreference(findPreference(str), false);
        }
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        setDivider(null);
    }

    @Override // defpackage.q3
    public void render(com.nytimes.android.features.settings.c cVar) {
        zq3.h(cVar, "viewState");
        if (cVar instanceof c.C0294c) {
            showSubscriberAccountPreferences();
            return;
        }
        if (cVar instanceof c.a) {
            showLoggedOutAccountPreferences();
        } else if (cVar instanceof c.d) {
            showUnlinkedSubscriberPreferences();
        } else if (cVar instanceof c.b) {
            showRegisteredAccountPreferences();
        }
    }

    public final void setAbraManager(AbraManager abraManager) {
        zq3.h(abraManager, "<set-?>");
        this.abraManager = abraManager;
    }

    public final void setAccountSettingsPresenter(AccountSettingsPresenter accountSettingsPresenter) {
        zq3.h(accountSettingsPresenter, "<set-?>");
        this.accountSettingsPresenter = accountSettingsPresenter;
    }

    public final void setAnalyticsClient(jc jcVar) {
        zq3.h(jcVar, "<set-?>");
        this.analyticsClient = jcVar;
    }

    public final void setAppPreferences(AppPreferences appPreferences) {
        zq3.h(appPreferences, "<set-?>");
        this.appPreferences = appPreferences;
    }

    public final void setAppPreferencesManager(tm tmVar) {
        zq3.h(tmVar, "<set-?>");
        this.appPreferencesManager = tmVar;
    }

    public final void setBetaSettingActivityNavigator(rn1 rn1Var) {
        zq3.h(rn1Var, "<set-?>");
        this.betaSettingActivityNavigator = rn1Var;
    }

    public final void setECommClient(com.nytimes.android.entitlements.a aVar) {
        zq3.h(aVar, "<set-?>");
        this.eCommClient = aVar;
    }

    public final void setEt2Scope(ET2CoroutineScope eT2CoroutineScope) {
        zq3.h(eT2CoroutineScope, "<set-?>");
        this.et2Scope = eT2CoroutineScope;
    }

    public final void setFeatureFlagUtil(cb2 cb2Var) {
        zq3.h(cb2Var, "<set-?>");
        this.featureFlagUtil = cb2Var;
    }

    public final void setFeedStore(FeedStore feedStore) {
        zq3.h(feedStore, "<set-?>");
        this.feedStore = feedStore;
    }

    public final void setFeedback(yc2 yc2Var) {
        zq3.h(yc2Var, "<set-?>");
        this.feedback = yc2Var;
    }

    public final void setLaunchPlpHelper(uy3 uy3Var) {
        zq3.h(uy3Var, "<set-?>");
        this.launchPlpHelper = uy3Var;
    }

    public final void setNetworkStatus(NetworkStatus networkStatus) {
        zq3.h(networkStatus, "<set-?>");
        this.networkStatus = networkStatus;
    }

    public final void setNightModeInstaller(i65 i65Var) {
        zq3.h(i65Var, "<set-?>");
        this.nightModeInstaller = i65Var;
    }

    public final void setPostLoginRegiManager(PostLoginRegiOfferManager postLoginRegiOfferManager) {
        zq3.h(postLoginRegiOfferManager, "<set-?>");
        this.postLoginRegiManager = postLoginRegiOfferManager;
    }

    public final void setPurrUIClientApi(s96 s96Var) {
        zq3.h(s96Var, "<set-?>");
        this.purrUIClientApi = s96Var;
    }

    public final void setReAuthLauncher(fp6 fp6Var) {
        zq3.h(fp6Var, "<set-?>");
        this.reAuthLauncher = fp6Var;
    }

    public final void setSnackbarUtil(SnackbarUtil snackbarUtil) {
        zq3.h(snackbarUtil, "<set-?>");
        this.snackbarUtil = snackbarUtil;
    }

    public final void setWebActivityNavigator(id9 id9Var) {
        zq3.h(id9Var, "<set-?>");
        this.webActivityNavigator = id9Var;
    }
}
