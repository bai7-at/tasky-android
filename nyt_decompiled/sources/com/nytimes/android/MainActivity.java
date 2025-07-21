package com.nytimes.android;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.nytimes.android.MainActivity;
import com.nytimes.android.composable.MainActivityScreenKt;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.mainactivity.MainBottomNavUi;
import com.nytimes.android.mainactivity.MainBottomNavViewModel;
import com.nytimes.android.media.audio.AudioDeepLinkHandler;
import com.nytimes.android.notification.SaveIntentHandler;
import com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.OnboardingActivityManager;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.widget.ForcedLogoutAlert;
import defpackage.b04;
import defpackage.b65;
import defpackage.by0;
import defpackage.c04;
import defpackage.cb2;
import defpackage.de4;
import defpackage.e44;
import defpackage.ee4;
import defpackage.fc1;
import defpackage.gm;
import defpackage.gt2;
import defpackage.if8;
import defpackage.jc;
import defpackage.la5;
import defpackage.lm;
import defpackage.ln1;
import defpackage.mm;
import defpackage.mo6;
import defpackage.n25;
import defpackage.qs2;
import defpackage.s96;
import defpackage.ss2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.wc;
import defpackage.wl6;
import defpackage.ww8;
import defpackage.x08;
import defpackage.z58;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import defpackage.zx8;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.annotation.StartupActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@StartupActivity
/* loaded from: classes2.dex */
public final class MainActivity extends e implements ee4 {
    public static final int $stable = 8;
    public b04 analyticsClient;
    public gm appExpirationChecker;
    public AudioDeepLinkHandler audioDeepLinkHandler;
    private final c04 bottomNavViewModel$delegate;
    public ln1 destinationDeeplinkHandler;
    public wc eventManager;
    public cb2 featureFlagUtil;
    public ForcedLogoutAlert forcedLogoutAlert;
    public ForegroundStateObserver foregroundStateObserver;
    public lm launchPerformanceTracker;
    private final MutableSharedFlow<de4> nextTab = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
    public la5 notificationsHelper;
    public OnboardingActivityManager onboardingActivityManager;
    public OneTapLifecycleObserver oneTapLifecycleObserver;
    public s96 purrUI;
    public mo6 raceConditionLogger;
    public SaveIntentHandler saveIntentHandler;
    public SmartLockLifecycleObserver smartLockLifecycleObserver;
    public z58 subauthClient;
    public if8 tabFragmentProxy;
    public MainBottomNavUi ui;
    private final c04 viewModel$delegate;
    private boolean wasPaused;

    public MainActivity() {
        final qs2 qs2Var = null;
        this.viewModel$delegate = new s(zt6.b(MainViewModel.class), new qs2() { // from class: com.nytimes.android.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
        this.bottomNavViewModel$delegate = new s(zt6.b(MainBottomNavViewModel.class), new qs2() { // from class: com.nytimes.android.MainActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.MainActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.MainActivity$special$$inlined$viewModels$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
    }

    private final void checkSavedInstanceState(Bundle bundle) {
        if (bundle != null || ((jc) getAnalyticsClient().get()).j()) {
            return;
        }
        ((jc) getAnalyticsClient().get()).s("Fresh launch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainBottomNavViewModel getBottomNavViewModel() {
        return (MainBottomNavViewModel) this.bottomNavViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainViewModel getViewModel() {
        return (MainViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleFacebookDeeplink() {
        mm.c(this, new mm.b() { // from class: pd4
            @Override // mm.b
            public final void a(mm mmVar) {
                MainActivity.handleFacebookDeeplink$lambda$0(MainActivity.this, mmVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleFacebookDeeplink$lambda$0(MainActivity mainActivity, mm mmVar) {
        zq3.h(mainActivity, "this$0");
        if (mmVar != null) {
            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) IntentFilterActivity.class).setAction("android.intent.action.VIEW").setData(mmVar.g()));
        }
    }

    private final void handleIntent(Intent intent) {
        Object obj;
        handleSaveAction(intent);
        String stringExtra = intent.getStringExtra("com.nytimes.android.EXTRA_MAIN_TAB");
        String stringExtra2 = intent.getStringExtra("com.nytimes.android.EXTRA_SUB_TAB");
        getDestinationDeeplinkHandler().d(b65.Companion.b(intent, true));
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new MainActivity$handleIntent$1(stringExtra2, this, null), 3, null);
        if (stringExtra != null) {
            Iterator it2 = getTabFragmentProxy().b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (zq3.c(((Pair) obj).c(), stringExtra)) {
                        break;
                    }
                }
            }
            Pair pair = (Pair) obj;
            de4 de4Var = pair != null ? (de4) pair.d() : null;
            if (de4Var != null) {
                this.nextTab.tryEmit(de4Var);
            }
        }
    }

    private final void handleSaveAction(Intent intent) {
        if (getSaveIntentHandler().m(intent)) {
            getSaveIntentHandler().i(this, intent);
        }
    }

    private final void onCreateActivity(Bundle bundle) {
        getViewModel().o();
        getAppExpirationChecker().a(this);
        checkSavedInstanceState(bundle);
        OnboardingActivityManager onboardingActivityManager = getOnboardingActivityManager();
        Lifecycle lifecycle = getLifecycle();
        zq3.g(lifecycle, "<get-lifecycle>(...)");
        onboardingActivityManager.n(lifecycle, e44.a(this), bundle);
        getUi().f();
        getAudioDeepLinkHandler().e(getIntent());
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(getSubauthClient().m(), new MainActivity$onCreateActivity$1(this, null)), new MainActivity$onCreateActivity$2(null)), e44.a(this));
        getSaveIntentHandler().g(this);
        Intent intent = getIntent();
        zq3.g(intent, "getIntent(...)");
        handleIntent(intent);
        handleFacebookDeeplink();
    }

    private final void showFTUXNotificationsSnackbar() {
        if (getNotificationsHelper().a()) {
            return;
        }
        SnackbarUtil.g(getSnackbarUtil(), wl6.settings_notifications_declined, wl6.onboarding_notifications_declined_message, 0, 4, null);
    }

    public final b04 getAnalyticsClient() {
        b04 b04Var = this.analyticsClient;
        if (b04Var != null) {
            return b04Var;
        }
        zq3.z("analyticsClient");
        return null;
    }

    public final gm getAppExpirationChecker() {
        gm gmVar = this.appExpirationChecker;
        if (gmVar != null) {
            return gmVar;
        }
        zq3.z("appExpirationChecker");
        return null;
    }

    public final AudioDeepLinkHandler getAudioDeepLinkHandler() {
        AudioDeepLinkHandler audioDeepLinkHandler = this.audioDeepLinkHandler;
        if (audioDeepLinkHandler != null) {
            return audioDeepLinkHandler;
        }
        zq3.z("audioDeepLinkHandler");
        return null;
    }

    public final ln1 getDestinationDeeplinkHandler() {
        ln1 ln1Var = this.destinationDeeplinkHandler;
        if (ln1Var != null) {
            return ln1Var;
        }
        zq3.z("destinationDeeplinkHandler");
        return null;
    }

    public final wc getEventManager() {
        wc wcVar = this.eventManager;
        if (wcVar != null) {
            return wcVar;
        }
        zq3.z("eventManager");
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

    public final ForcedLogoutAlert getForcedLogoutAlert() {
        ForcedLogoutAlert forcedLogoutAlert = this.forcedLogoutAlert;
        if (forcedLogoutAlert != null) {
            return forcedLogoutAlert;
        }
        zq3.z("forcedLogoutAlert");
        return null;
    }

    public final ForegroundStateObserver getForegroundStateObserver() {
        ForegroundStateObserver foregroundStateObserver = this.foregroundStateObserver;
        if (foregroundStateObserver != null) {
            return foregroundStateObserver;
        }
        zq3.z("foregroundStateObserver");
        return null;
    }

    public final lm getLaunchPerformanceTracker() {
        lm lmVar = this.launchPerformanceTracker;
        if (lmVar != null) {
            return lmVar;
        }
        zq3.z("launchPerformanceTracker");
        return null;
    }

    public final la5 getNotificationsHelper() {
        la5 la5Var = this.notificationsHelper;
        if (la5Var != null) {
            return la5Var;
        }
        zq3.z("notificationsHelper");
        return null;
    }

    public final OnboardingActivityManager getOnboardingActivityManager() {
        OnboardingActivityManager onboardingActivityManager = this.onboardingActivityManager;
        if (onboardingActivityManager != null) {
            return onboardingActivityManager;
        }
        zq3.z("onboardingActivityManager");
        return null;
    }

    public final OneTapLifecycleObserver getOneTapLifecycleObserver() {
        OneTapLifecycleObserver oneTapLifecycleObserver = this.oneTapLifecycleObserver;
        if (oneTapLifecycleObserver != null) {
            return oneTapLifecycleObserver;
        }
        zq3.z("oneTapLifecycleObserver");
        return null;
    }

    public final s96 getPurrUI() {
        s96 s96Var = this.purrUI;
        if (s96Var != null) {
            return s96Var;
        }
        zq3.z("purrUI");
        return null;
    }

    public final mo6 getRaceConditionLogger() {
        mo6 mo6Var = this.raceConditionLogger;
        if (mo6Var != null) {
            return mo6Var;
        }
        zq3.z("raceConditionLogger");
        return null;
    }

    public final SaveIntentHandler getSaveIntentHandler() {
        SaveIntentHandler saveIntentHandler = this.saveIntentHandler;
        if (saveIntentHandler != null) {
            return saveIntentHandler;
        }
        zq3.z("saveIntentHandler");
        return null;
    }

    public final SmartLockLifecycleObserver getSmartLockLifecycleObserver() {
        SmartLockLifecycleObserver smartLockLifecycleObserver = this.smartLockLifecycleObserver;
        if (smartLockLifecycleObserver != null) {
            return smartLockLifecycleObserver;
        }
        zq3.z("smartLockLifecycleObserver");
        return null;
    }

    public final z58 getSubauthClient() {
        z58 z58Var = this.subauthClient;
        if (z58Var != null) {
            return z58Var;
        }
        zq3.z("subauthClient");
        return null;
    }

    public final if8 getTabFragmentProxy() {
        if8 if8Var = this.tabFragmentProxy;
        if (if8Var != null) {
            return if8Var;
        }
        zq3.z("tabFragmentProxy");
        return null;
    }

    public final MainBottomNavUi getUi() {
        MainBottomNavUi mainBottomNavUi = this.ui;
        if (mainBottomNavUi != null) {
            return mainBottomNavUi;
        }
        zq3.z("ui");
        return null;
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, com.nytimes.android.utils.snackbar.a
    public boolean isUsingCompose() {
        return true;
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1432) {
            getOnboardingActivityManager().o();
            getOnboardingActivityManager().q();
        }
        if (i == 1433) {
            showFTUXNotificationsSnackbar();
            getOnboardingActivityManager().q();
        }
        if (i == 5) {
            getOnboardingActivityManager().g(i2);
            getOnboardingActivityManager().q();
        }
    }

    @Override // com.nytimes.android.e, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onCreateActivity(bundle);
        tq0.b(this, null, zr0.c(68148681, true, new gt2() { // from class: com.nytimes.android.MainActivity$onCreate$1

            @fc1(c = "com.nytimes.android.MainActivity$onCreate$1$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.MainActivity$onCreate$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ x08 $isInForeground;
                final /* synthetic */ n25 $navController;
                int label;
                final /* synthetic */ MainActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(x08 x08Var, MainActivity mainActivity, n25 n25Var, by0<? super AnonymousClass1> by0Var) {
                    super(2, by0Var);
                    this.$isInForeground = x08Var;
                    this.this$0 = mainActivity;
                    this.$navController = n25Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0<ww8> create(Object obj, by0<?> by0Var) {
                    return new AnonymousClass1(this.$isInForeground, this.this$0, this.$navController, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    MainBottomNavViewModel bottomNavViewModel;
                    MainViewModel viewModel;
                    kotlin.coroutines.intrinsics.a.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    if (((Boolean) this.$isInForeground.getValue()).booleanValue()) {
                        if (DeviceUtils.z(this.this$0)) {
                            viewModel = this.this$0.getViewModel();
                            viewModel.o();
                        }
                        bottomNavViewModel = this.this$0.getBottomNavViewModel();
                        zx8 l = bottomNavViewModel.l();
                        if (l.c()) {
                            mo6 raceConditionLogger = this.this$0.getRaceConditionLogger();
                            final n25 n25Var = this.$navController;
                            final MainActivity mainActivity = this.this$0;
                            raceConditionLogger.d("navigateToMainTab", l, new qs2() { // from class: com.nytimes.android.MainActivity.onCreate.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m171invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m171invoke() {
                                    MainBottomNavViewModel bottomNavViewModel2;
                                    n25 n25Var2 = n25.this;
                                    bottomNavViewModel2 = mainActivity.getBottomNavViewModel();
                                    MainActivityKt.a(n25Var2, (de4) ((Pair) kotlin.collections.i.k0((List) bottomNavViewModel2.k().getValue())).d());
                                }
                            });
                            this.this$0.recreate();
                        }
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(68148681, i, -1, "com.nytimes.android.MainActivity.onCreate.<anonymous> (MainActivity.kt:133)");
                }
                final n25 e = NavHostControllerKt.e(new Navigator[0], composer, 8);
                x08 b = y.b(MainActivity.this.getOnboardingActivityManager().f(), null, composer, 8, 1);
                final MainActivity mainActivity = MainActivity.this;
                qs2 qs2Var = new qs2() { // from class: com.nytimes.android.MainActivity$onCreate$1$onNavigateToNextTab$1

                    @fc1(c = "com.nytimes.android.MainActivity$onCreate$1$onNavigateToNextTab$1$1", f = "MainActivity.kt", l = {140}, m = "invokeSuspend")
                    /* renamed from: com.nytimes.android.MainActivity$onCreate$1$onNavigateToNextTab$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                        final /* synthetic */ n25 $navController;
                        int label;
                        final /* synthetic */ MainActivity this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(MainActivity mainActivity, n25 n25Var, by0<? super AnonymousClass1> by0Var) {
                            super(2, by0Var);
                            this.this$0 = mainActivity;
                            this.$navController = n25Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0<ww8> create(Object obj, by0<?> by0Var) {
                            return new AnonymousClass1(this.this$0, this.$navController, by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableSharedFlow mutableSharedFlow;
                            Object h = kotlin.coroutines.intrinsics.a.h();
                            int i = this.label;
                            if (i == 0) {
                                kotlin.f.b(obj);
                                mutableSharedFlow = this.this$0.nextTab;
                                Flow filterNotNull = FlowKt.filterNotNull(mutableSharedFlow);
                                final n25 n25Var = this.$navController;
                                FlowCollector flowCollector = new FlowCollector() { // from class: com.nytimes.android.MainActivity.onCreate.1.onNavigateToNextTab.1.1.1
                                    public final Object emit(de4 de4Var, by0<? super ww8> by0Var) {
                                        MainActivityKt.a(n25.this, de4Var);
                                        return ww8.a;
                                    }

                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    public /* bridge */ /* synthetic */ Object emit(Object obj2, by0 by0Var) {
                                        return emit((de4) obj2, (by0<? super ww8>) by0Var);
                                    }
                                };
                                this.label = 1;
                                if (filterNotNull.collect(flowCollector, this) == h) {
                                    return h;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.f.b(obj);
                            }
                            return ww8.a;
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
                            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m172invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m172invoke() {
                        BuildersKt__Builders_commonKt.launch$default(e44.a(MainActivity.this), null, null, new AnonymousClass1(MainActivity.this, e, null), 3, null);
                    }
                };
                final MainActivity mainActivity2 = MainActivity.this;
                ss2 ss2Var = new ss2() { // from class: com.nytimes.android.MainActivity$onCreate$1$onNavigateToMainTab$1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return ww8.a;
                    }

                    public final void invoke(String str) {
                        Object obj;
                        MutableSharedFlow mutableSharedFlow;
                        zq3.h(str, "tab");
                        Iterator it2 = MainActivity.this.getTabFragmentProxy().b().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it2.next();
                                if (zq3.c(((Pair) obj).c(), str)) {
                                    break;
                                }
                            }
                        }
                        Pair pair = (Pair) obj;
                        de4 de4Var = pair != null ? (de4) pair.d() : null;
                        if (de4Var != null) {
                            mutableSharedFlow = MainActivity.this.nextTab;
                            mutableSharedFlow.tryEmit(de4Var);
                        }
                    }
                };
                x08 b2 = y.b(MainActivity.this.getForegroundStateObserver().a(), null, composer, 8, 1);
                LifecycleUtilsKt.a(b2.getValue(), new AnonymousClass1(b2, MainActivity.this, e, null), composer, 64);
                if (!((Boolean) b.getValue()).booleanValue()) {
                    MainActivityScreenKt.a(MainActivity.this.getUi(), MainActivity.this.getPurrUI(), e, qs2Var, ss2Var, null, null, composer, 584, 96);
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 1, null);
    }

    @Override // com.nytimes.android.e, com.nytimes.android.BaseAppCompatActivity, defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        getAudioDeepLinkHandler().h();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        zq3.h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent(intent);
        if (getAudioDeepLinkHandler().e(intent)) {
            NYTLogger.l("AudioDeepLinkHandler consumed intent", new Object[0]);
        } else {
            getOnboardingActivityManager().j();
        }
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        this.wasPaused = true;
        getEventManager().e(this);
        getLaunchPerformanceTracker().l();
        super.onPause();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new MainActivity$onResume$1(this, null), 3, null);
        super.onResume();
        getEventManager().c(this);
        getUi().k(this.wasPaused);
        this.wasPaused = false;
        ((jc) getAnalyticsClient().get()).B(0);
        getLaunchPerformanceTracker().r();
        Embrace.getInstance().endAppStartup();
    }

    public final void setAnalyticsClient(b04 b04Var) {
        zq3.h(b04Var, "<set-?>");
        this.analyticsClient = b04Var;
    }

    public final void setAppExpirationChecker(gm gmVar) {
        zq3.h(gmVar, "<set-?>");
        this.appExpirationChecker = gmVar;
    }

    public final void setAudioDeepLinkHandler(AudioDeepLinkHandler audioDeepLinkHandler) {
        zq3.h(audioDeepLinkHandler, "<set-?>");
        this.audioDeepLinkHandler = audioDeepLinkHandler;
    }

    public final void setDestinationDeeplinkHandler(ln1 ln1Var) {
        zq3.h(ln1Var, "<set-?>");
        this.destinationDeeplinkHandler = ln1Var;
    }

    public final void setEventManager(wc wcVar) {
        zq3.h(wcVar, "<set-?>");
        this.eventManager = wcVar;
    }

    public final void setFeatureFlagUtil(cb2 cb2Var) {
        zq3.h(cb2Var, "<set-?>");
        this.featureFlagUtil = cb2Var;
    }

    public final void setForcedLogoutAlert(ForcedLogoutAlert forcedLogoutAlert) {
        zq3.h(forcedLogoutAlert, "<set-?>");
        this.forcedLogoutAlert = forcedLogoutAlert;
    }

    public final void setForegroundStateObserver(ForegroundStateObserver foregroundStateObserver) {
        zq3.h(foregroundStateObserver, "<set-?>");
        this.foregroundStateObserver = foregroundStateObserver;
    }

    public final void setLaunchPerformanceTracker(lm lmVar) {
        zq3.h(lmVar, "<set-?>");
        this.launchPerformanceTracker = lmVar;
    }

    public final void setNotificationsHelper(la5 la5Var) {
        zq3.h(la5Var, "<set-?>");
        this.notificationsHelper = la5Var;
    }

    public final void setOnboardingActivityManager(OnboardingActivityManager onboardingActivityManager) {
        zq3.h(onboardingActivityManager, "<set-?>");
        this.onboardingActivityManager = onboardingActivityManager;
    }

    public final void setOneTapLifecycleObserver(OneTapLifecycleObserver oneTapLifecycleObserver) {
        zq3.h(oneTapLifecycleObserver, "<set-?>");
        this.oneTapLifecycleObserver = oneTapLifecycleObserver;
    }

    public final void setPurrUI(s96 s96Var) {
        zq3.h(s96Var, "<set-?>");
        this.purrUI = s96Var;
    }

    public final void setRaceConditionLogger(mo6 mo6Var) {
        zq3.h(mo6Var, "<set-?>");
        this.raceConditionLogger = mo6Var;
    }

    public final void setSaveIntentHandler(SaveIntentHandler saveIntentHandler) {
        zq3.h(saveIntentHandler, "<set-?>");
        this.saveIntentHandler = saveIntentHandler;
    }

    public final void setSmartLockLifecycleObserver(SmartLockLifecycleObserver smartLockLifecycleObserver) {
        zq3.h(smartLockLifecycleObserver, "<set-?>");
        this.smartLockLifecycleObserver = smartLockLifecycleObserver;
    }

    public final void setSubauthClient(z58 z58Var) {
        zq3.h(z58Var, "<set-?>");
        this.subauthClient = z58Var;
    }

    public final void setTabFragmentProxy(if8 if8Var) {
        zq3.h(if8Var, "<set-?>");
        this.tabFragmentProxy = if8Var;
    }

    public final void setUi(MainBottomNavUi mainBottomNavUi) {
        zq3.h(mainBottomNavUi, "<set-?>");
        this.ui = mainBottomNavUi;
    }
}
