package com.nytimes.android;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Process;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import coil.ImageLoader;
import coil.decode.SvgDecoder;
import com.comscore.streaming.AdvertisementType;
import com.nytimes.android.ads.analytics.AdEventTracker;
import com.nytimes.android.analytics.eventtracker.EventTrackerInitializer;
import com.nytimes.android.entitlements.purr.PurrLoginManager;
import com.nytimes.android.gateway.AnalyticsSubauthHelper;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.libs.iterate.IterateInitializer;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.logging.devsettings.items.NYTLoggingFiltersDevSettingsFactory;
import com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager;
import com.nytimes.android.performancetrackerclientphoenix.event.MainThreadTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.MetricsTracker;
import com.nytimes.android.performancetrackerclientphoenix.monitor.MemoryUsageMonitor;
import com.nytimes.android.push.NotificationChannelHelper;
import com.nytimes.android.push.PushMessageHandler;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.saved.synchronization.SavedListFlyWeight;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.LegacyFileUtils;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.TrackingIdInitializer;
import defpackage.b04;
import defpackage.b97;
import defpackage.bh8;
import defpackage.bp0;
import defpackage.by0;
import defpackage.cb2;
import defpackage.cr5;
import defpackage.d15;
import defpackage.d92;
import defpackage.en0;
import defpackage.fc1;
import defpackage.hx1;
import defpackage.i65;
import defpackage.k65;
import defpackage.kn;
import defpackage.le2;
import defpackage.lh6;
import defpackage.lm;
import defpackage.mx0;
import defpackage.og3;
import defpackage.oh6;
import defpackage.or0;
import defpackage.p83;
import defpackage.pg;
import defpackage.pz4;
import defpackage.qz1;
import defpackage.rj8;
import defpackage.vp6;
import defpackage.vr6;
import defpackage.wc;
import defpackage.ww8;
import defpackage.xj7;
import defpackage.xm;
import defpackage.y74;
import defpackage.yx8;
import defpackage.z58;
import defpackage.zq3;
import io.reactivex.Observable;
import java.util.Calendar;
import java.util.Date;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes2.dex */
public class NYTApplication extends p83 implements bh8 {
    public static final a Companion = new a(null);
    public static final int d = 8;
    public AbraLoginObserver abraLoginObserver;
    public com.nytimes.abtests.a activityReporter;
    public AdEventTracker adEventTracker;
    public AnalyticsSubauthHelper analyticsSubauthHelper;
    public lm appLaunchPerformanceTracker;
    public xm appShortcutManager;
    public CoroutineScope applicationScope;
    private final Lifecycle c = androidx.lifecycle.l.i.a().getLifecycle();
    public bp0 comScoreWrapper;
    public com.nytimes.android.entitlements.a eCommClient;
    public hx1 eCommPerformanceTracker;
    public qz1 embraceInitializer;
    public wc eventManager;
    public EventTrackerInitializer eventTrackerInitializer;
    public d92 facebookLoggerLifecycleCallbacks;
    public cb2 featureFlagUtil;
    public FeedStore feedStore;
    public le2 fileLog;
    public ForegroundStateObserver foregroundStateObserver;
    public IterateInitializer iterateInitializer;
    public LegacyFileUtils legacyFileUtils;
    public y74 lockerCallbacks;
    public LoggingRemoteStreamManager loggingRemoteStreamManager;
    public MainThreadTracker mainThreadTracker;
    public b04 memoryUsageMonitor;
    public MetricsTracker metricsTracker;
    public NetworkStatus networkStatus;
    public i65 nightModeInstaller;
    public k65 nightModeRuntimeApplier;
    public NotificationChannelHelper notificationChannelHelper;
    public b04 okHttpClient;
    public b97 otSync;
    public cr5 performanceTrackerClient;
    public PurrLoginManager purrLoginManager;
    public PushMessageHandler pushMessageHandler;
    public RecentlyViewedManager recentlyViewedManager;
    public b04 resourceRetriever;
    public SavedListFlyWeight savedListFlyWeight;
    public b04 savedManager;
    public SharedPreferences sharedPreferences;
    public kn snackbarAttacher;
    public z58 subauthClient;
    public rj8 textResizeApplier;
    public com.nytimes.android.performancetrackerclientphoenix.tracing.a tracingMetadata;
    public TrackingIdInitializer trackingIdInitializer;
    public yx8 updateWorkerScheduler;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements ComponentCallbacks2 {
        b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            zq3.h(configuration, "newConfig");
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            ((MemoryUsageMonitor) NYTApplication.this.A().get()).m();
        }
    }

    private final void T(Context context) {
        ImageLoader.Builder builder = new ImageLoader.Builder(context);
        or0.a aVar = new or0.a();
        aVar.a(new SvgDecoder.b(false, 1, null));
        en0.c(builder.c(aVar.e()).b());
    }

    private final void V() {
        NYTLogger.v(DeviceUtils.z(this));
        NYTLogger.o(new vp6(this));
        NYTLogger.o(u());
        NYTLoggingFiltersDevSettingsFactory nYTLoggingFiltersDevSettingsFactory = NYTLoggingFiltersDevSettingsFactory.a;
        Context applicationContext = getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        nYTLoggingFiltersDevSettingsFactory.a(applicationContext);
        z().l();
    }

    private final void W() {
        Observable skip = m().r().skip(1L);
        zq3.g(skip, "skip(...)");
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(RxConvertKt.asFlow(skip), new NYTApplication$initSavedManager$1(this, null)), new NYTApplication$initSavedManager$2(null)), j());
        BuildersKt__Builders_commonKt.launch$default(j(), null, null, new NYTApplication$initSavedManager$3(this, null), 3, null);
    }

    private final void Y() {
        final Flow e = t().e();
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(new Flow() { // from class: com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1

            /* renamed from: com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1$2", f = "NYTApplication.kt", l = {AdvertisementType.LIVE}, m = "emit")
                /* renamed from: com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1$2$1 r0 = (com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1$2$1 r0 = new com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        com.nytimes.android.api.cms.LatestFeed r5 = (com.nytimes.android.api.cms.LatestFeed) r5
                        java.util.List r5 = r5.getHybridResources()
                        if (r5 == 0) goto L47
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L47
                        return r1
                    L47:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, new NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2(this, null)), new NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$3(null)), j());
    }

    private final void Z() {
        registerActivityLifecycleCallbacks(y());
        registerActivityLifecycleCallbacks(N());
        registerActivityLifecycleCallbacks(g());
        registerActivityLifecycleCallbacks(s());
        registerActivityLifecycleCallbacks(E());
        registerActivityLifecycleCallbacks(P());
        registerActivityLifecycleCallbacks(Q());
        registerActivityLifecycleCallbacks(S());
    }

    private final void a0() {
        String processName = Application.getProcessName();
        if (zq3.c(getPackageName(), processName)) {
            return;
        }
        WebView.setDataDirectorySuffix(processName);
    }

    private final void b0() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = getSystemService((Class<Object>) AppOpsManager.class);
            zq3.f(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            ((AppOpsManager) systemService).setOnOpNotedCallback(mx0.h(this), pz4.a(new xj7()));
        }
    }

    private final void c0() {
        getPackageManager().getUserBadgedLabel("", Process.myUserHandle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(defpackage.by0 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.nytimes.android.NYTApplication$updateHybridGameConfig$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.android.NYTApplication$updateHybridGameConfig$1 r2 = (com.nytimes.android.NYTApplication$updateHybridGameConfig$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.nytimes.android.NYTApplication$updateHybridGameConfig$1 r2 = new com.nytimes.android.NYTApplication$updateHybridGameConfig$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L4b
            if (r4 != r6) goto L43
            int r0 = r2.I$0
            boolean r3 = r2.Z$0
            java.lang.Object r4 = r2.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.L$1
            com.nytimes.xwords.hybrid.GamesHybridManager r7 = (com.nytimes.xwords.hybrid.GamesHybridManager) r7
            java.lang.Object r2 = r2.L$0
            com.nytimes.android.NYTApplication r2 = (com.nytimes.android.NYTApplication) r2
            kotlin.f.b(r1)
            r8 = r3
            r10 = r4
            r4 = r0
            r0 = r2
        L41:
            r2 = r7
            goto L94
        L43:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4b:
            kotlin.f.b(r1)
            com.nytimes.xwords.hybrid.GamesHybridManager r7 = com.nytimes.xwords.hybrid.GamesHybridManager.a
            com.nytimes.android.entitlements.a r1 = r18.m()
            boolean r1 = r1.b()
            com.nytimes.android.entitlements.a r4 = r18.m()
            java.lang.String r4 = r4.u()
            if (r4 == 0) goto L6a
            int r4 = r4.length()
            if (r4 <= 0) goto L6a
            r4 = r6
            goto L6b
        L6a:
            r4 = r5
        L6b:
            com.nytimes.android.entitlements.a r8 = r18.m()
            java.lang.String r8 = r8.u()
            com.nytimes.android.entitlements.a r9 = r18.m()
            java.lang.String r10 = "NYT-S"
            java.util.List r10 = kotlin.collections.i.e(r10)
            r2.L$0 = r0
            r2.L$1 = r7
            r2.L$2 = r8
            r2.Z$0 = r1
            r2.I$0 = r4
            r2.label = r6
            java.lang.Object r2 = r9.l(r10, r2)
            if (r2 != r3) goto L90
            return r3
        L90:
            r10 = r8
            r8 = r1
            r1 = r2
            goto L41
        L94:
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            com.nytimes.android.entitlements.a r1 = r0.m()
            java.lang.String r14 = r1.g()
            com.nytimes.android.entitlements.a r0 = r0.m()
            java.util.Set r0 = r0.o()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb0
            r0 = 0
        Lb0:
            r15 = r0
            java.util.Set r15 = (java.util.Set) r15
            zu2 r0 = new zu2
            if (r4 == 0) goto Lb9
            r9 = r6
            goto Lba
        Lb9:
            r9 = r5
        Lba:
            r12 = 0
            r16 = 16
            r17 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r2.h(r0)
            ww8 r0 = defpackage.ww8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.NYTApplication.d0(by0):java.lang.Object");
    }

    public final b04 A() {
        b04 b04Var = this.memoryUsageMonitor;
        if (b04Var != null) {
            return b04Var;
        }
        zq3.z("memoryUsageMonitor");
        return null;
    }

    public final MetricsTracker B() {
        MetricsTracker metricsTracker = this.metricsTracker;
        if (metricsTracker != null) {
            return metricsTracker;
        }
        zq3.z("metricsTracker");
        return null;
    }

    public final NetworkStatus C() {
        NetworkStatus networkStatus = this.networkStatus;
        if (networkStatus != null) {
            return networkStatus;
        }
        zq3.z("networkStatus");
        return null;
    }

    public final i65 D() {
        i65 i65Var = this.nightModeInstaller;
        if (i65Var != null) {
            return i65Var;
        }
        zq3.z("nightModeInstaller");
        return null;
    }

    public final k65 E() {
        k65 k65Var = this.nightModeRuntimeApplier;
        if (k65Var != null) {
            return k65Var;
        }
        zq3.z("nightModeRuntimeApplier");
        return null;
    }

    public final b04 F() {
        b04 b04Var = this.okHttpClient;
        if (b04Var != null) {
            return b04Var;
        }
        zq3.z("okHttpClient");
        return null;
    }

    public final b97 G() {
        b97 b97Var = this.otSync;
        if (b97Var != null) {
            return b97Var;
        }
        zq3.z("otSync");
        return null;
    }

    public final PurrLoginManager H() {
        PurrLoginManager purrLoginManager = this.purrLoginManager;
        if (purrLoginManager != null) {
            return purrLoginManager;
        }
        zq3.z("purrLoginManager");
        return null;
    }

    public final PushMessageHandler I() {
        PushMessageHandler pushMessageHandler = this.pushMessageHandler;
        if (pushMessageHandler != null) {
            return pushMessageHandler;
        }
        zq3.z("pushMessageHandler");
        return null;
    }

    public final RecentlyViewedManager J() {
        RecentlyViewedManager recentlyViewedManager = this.recentlyViewedManager;
        if (recentlyViewedManager != null) {
            return recentlyViewedManager;
        }
        zq3.z("recentlyViewedManager");
        return null;
    }

    public final b04 K() {
        b04 b04Var = this.resourceRetriever;
        if (b04Var != null) {
            return b04Var;
        }
        zq3.z("resourceRetriever");
        return null;
    }

    public final SavedListFlyWeight L() {
        SavedListFlyWeight savedListFlyWeight = this.savedListFlyWeight;
        if (savedListFlyWeight != null) {
            return savedListFlyWeight;
        }
        zq3.z("savedListFlyWeight");
        return null;
    }

    public final b04 M() {
        b04 b04Var = this.savedManager;
        if (b04Var != null) {
            return b04Var;
        }
        zq3.z("savedManager");
        return null;
    }

    public final kn N() {
        kn knVar = this.snackbarAttacher;
        if (knVar != null) {
            return knVar;
        }
        zq3.z("snackbarAttacher");
        return null;
    }

    public final z58 O() {
        z58 z58Var = this.subauthClient;
        if (z58Var != null) {
            return z58Var;
        }
        zq3.z("subauthClient");
        return null;
    }

    public final rj8 P() {
        rj8 rj8Var = this.textResizeApplier;
        if (rj8Var != null) {
            return rj8Var;
        }
        zq3.z("textResizeApplier");
        return null;
    }

    public final com.nytimes.android.performancetrackerclientphoenix.tracing.a Q() {
        com.nytimes.android.performancetrackerclientphoenix.tracing.a aVar = this.tracingMetadata;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("tracingMetadata");
        return null;
    }

    public final TrackingIdInitializer R() {
        TrackingIdInitializer trackingIdInitializer = this.trackingIdInitializer;
        if (trackingIdInitializer != null) {
            return trackingIdInitializer;
        }
        zq3.z("trackingIdInitializer");
        return null;
    }

    public final yx8 S() {
        yx8 yx8Var = this.updateWorkerScheduler;
        if (yx8Var != null) {
            return yx8Var;
        }
        zq3.z("updateWorkerScheduler");
        return null;
    }

    protected void U() {
        BuildersKt__Builders_commonKt.launch$default(j(), null, null, new NYTApplication$initHybridSpellingBee$1(this, null), 3, null);
    }

    protected void X() {
    }

    @Override // defpackage.bh8
    public boolean a() {
        return false;
    }

    protected void e() {
        og3.a(this, F());
    }

    public final AbraLoginObserver f() {
        AbraLoginObserver abraLoginObserver = this.abraLoginObserver;
        if (abraLoginObserver != null) {
            return abraLoginObserver;
        }
        zq3.z("abraLoginObserver");
        return null;
    }

    public final com.nytimes.abtests.a g() {
        com.nytimes.abtests.a aVar = this.activityReporter;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("activityReporter");
        return null;
    }

    public final lm h() {
        lm lmVar = this.appLaunchPerformanceTracker;
        if (lmVar != null) {
            return lmVar;
        }
        zq3.z("appLaunchPerformanceTracker");
        return null;
    }

    public final xm i() {
        xm xmVar = this.appShortcutManager;
        if (xmVar != null) {
            return xmVar;
        }
        zq3.z("appShortcutManager");
        return null;
    }

    public final CoroutineScope j() {
        CoroutineScope coroutineScope = this.applicationScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        zq3.z("applicationScope");
        return null;
    }

    public Date k() {
        return new Date(getResources().getInteger(lh6.build_date) * 1000);
    }

    public final bp0 l() {
        bp0 bp0Var = this.comScoreWrapper;
        if (bp0Var != null) {
            return bp0Var;
        }
        zq3.z("comScoreWrapper");
        return null;
    }

    public final com.nytimes.android.entitlements.a m() {
        com.nytimes.android.entitlements.a aVar = this.eCommClient;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("eCommClient");
        return null;
    }

    public final hx1 n() {
        hx1 hx1Var = this.eCommPerformanceTracker;
        if (hx1Var != null) {
            return hx1Var;
        }
        zq3.z("eCommPerformanceTracker");
        return null;
    }

    public final qz1 o() {
        qz1 qz1Var = this.embraceInitializer;
        if (qz1Var != null) {
            return qz1Var;
        }
        zq3.z("embraceInitializer");
        return null;
    }

    @Override // defpackage.p83, android.app.Application
    public void onCreate() {
        pg.a(this);
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate();
        h().t(System.currentTimeMillis() - currentTimeMillis);
        h().o("App Launch");
        h().s("applicationOnCreate");
        R().d();
        o().a();
        b0();
        X();
        c0();
        V();
        a0();
        D().a();
        e();
        d15.c();
        q().b();
        Z();
        H().c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        vr6.c(this, C(), intentFilter, false, 4, null);
        p().d(this);
        l().b();
        i().e();
        Y();
        registerComponentCallbacks(new b());
        n().l();
        G().c();
        f().b(j());
        this.c.a(B());
        this.c.a(v());
        BuildersKt__Builders_commonKt.launch$default(j(), null, null, new NYTApplication$onCreate$4(this, null), 3, null);
        W();
        U();
        T(this);
        w().c();
        I().e();
        h().n("applicationOnCreate");
    }

    public final wc p() {
        wc wcVar = this.eventManager;
        if (wcVar != null) {
            return wcVar;
        }
        zq3.z("eventManager");
        return null;
    }

    public final EventTrackerInitializer q() {
        EventTrackerInitializer eventTrackerInitializer = this.eventTrackerInitializer;
        if (eventTrackerInitializer != null) {
            return eventTrackerInitializer;
        }
        zq3.z("eventTrackerInitializer");
        return null;
    }

    public Date r() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(k());
        calendar.add(5, getResources().getInteger(oh6.daysBeforeAppExpiration));
        Date time = calendar.getTime();
        zq3.g(time, "getTime(...)");
        return time;
    }

    @Override // android.app.Application, android.content.ContextWrapper, android.content.Context
    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        zq3.h(componentCallbacks, "callback");
        String name = componentCallbacks.getClass().getName();
        zq3.g(name, "getName(...)");
        if (kotlin.text.h.K(name, "com.google.android.gms.ads", false, 2, null)) {
            return;
        }
        super.registerComponentCallbacks(componentCallbacks);
    }

    public final d92 s() {
        d92 d92Var = this.facebookLoggerLifecycleCallbacks;
        if (d92Var != null) {
            return d92Var;
        }
        zq3.z("facebookLoggerLifecycleCallbacks");
        return null;
    }

    public final FeedStore t() {
        FeedStore feedStore = this.feedStore;
        if (feedStore != null) {
            return feedStore;
        }
        zq3.z("feedStore");
        return null;
    }

    public final le2 u() {
        le2 le2Var = this.fileLog;
        if (le2Var != null) {
            return le2Var;
        }
        zq3.z("fileLog");
        return null;
    }

    public final ForegroundStateObserver v() {
        ForegroundStateObserver foregroundStateObserver = this.foregroundStateObserver;
        if (foregroundStateObserver != null) {
            return foregroundStateObserver;
        }
        zq3.z("foregroundStateObserver");
        return null;
    }

    public final IterateInitializer w() {
        IterateInitializer iterateInitializer = this.iterateInitializer;
        if (iterateInitializer != null) {
            return iterateInitializer;
        }
        zq3.z("iterateInitializer");
        return null;
    }

    public final LegacyFileUtils x() {
        LegacyFileUtils legacyFileUtils = this.legacyFileUtils;
        if (legacyFileUtils != null) {
            return legacyFileUtils;
        }
        zq3.z("legacyFileUtils");
        return null;
    }

    public final y74 y() {
        y74 y74Var = this.lockerCallbacks;
        if (y74Var != null) {
            return y74Var;
        }
        zq3.z("lockerCallbacks");
        return null;
    }

    public final LoggingRemoteStreamManager z() {
        LoggingRemoteStreamManager loggingRemoteStreamManager = this.loggingRemoteStreamManager;
        if (loggingRemoteStreamManager != null) {
            return loggingRemoteStreamManager;
        }
        zq3.z("loggingRemoteStreamManager");
        return null;
    }
}
