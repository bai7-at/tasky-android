package com.nytimes.android.features.you.youtab;

import android.app.Activity;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.f;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.MutableStateFlowKtxKt;
import com.nytimes.android.features.you.youtab.b;
import com.nytimes.android.features.you.youtab.c;
import com.nytimes.android.features.you.youtab.d;
import com.nytimes.android.interests.InterestsManager;
import com.nytimes.android.interests.InterestsOnboardingManager;
import com.nytimes.android.interests.InterestsPreferencesStore;
import com.nytimes.android.interests.OnboardingToolTipState;
import com.nytimes.android.interests.UserInterestsApiError;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.recentlyviewed.room.AssetDatabase;
import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.bq3;
import defpackage.bs3;
import defpackage.by0;
import defpackage.cb2;
import defpackage.fc1;
import defpackage.fp3;
import defpackage.hm9;
import defpackage.id9;
import defpackage.il6;
import defpackage.pm9;
import defpackage.q22;
import defpackage.qs2;
import defpackage.sp3;
import defpackage.tb1;
import defpackage.td4;
import defpackage.tp0;
import defpackage.tr3;
import defpackage.uo6;
import defpackage.uq7;
import defpackage.ww8;
import defpackage.y25;
import defpackage.yk6;
import defpackage.z58;
import defpackage.zq3;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class YouScreenViewModel extends q {
    public static final a Companion = new a(null);
    public static final int l0 = 8;
    private final StateFlow B;
    private final StateFlow H;
    private final MutableStateFlow L;
    private final StateFlow M;
    private final MutableStateFlow N;
    private final StateFlow Q;
    private final MutableStateFlow S;
    private final StateFlow X;
    private final MutableStateFlow Y;
    private final StateFlow Z;
    private final z58 a;
    private final cb2 b;
    private final YouEventSender c;
    private final bs3 d;
    private final RecentlyViewedManager e;
    private final MutableStateFlow e0;
    private final SavedManager f;
    private final StateFlow f0;
    private final tr3 g;
    private final MutableStateFlow g0;
    private final NetworkStatus h;
    private final StateFlow h0;
    private final DeepLinkManager i;
    private final MutableStateFlow i0;
    private final uq7 j;
    private final StateFlow j0;
    private final AssetDatabase k;
    private Job k0;
    private final td4 l;
    private final id9 m;
    private final TimeStampUtil n;
    private final InterestsManager r;
    private final InterestsOnboardingManager s;
    private final AppPreferences t;
    private final Subauth u;
    private final MutableStateFlow w;
    private final StateFlow x;
    private final MutableStateFlow y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SortOrder.values().length];
            try {
                iArr[SortOrder.YOUR_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortOrder.MOST_RECENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d(Long.valueOf(((com.nytimes.android.interests.db.a) obj2).i()), Long.valueOf(((com.nytimes.android.interests.db.a) obj).i()));
        }
    }

    public YouScreenViewModel(z58 z58Var, cb2 cb2Var, YouEventSender youEventSender, bs3 bs3Var, RecentlyViewedManager recentlyViewedManager, SavedManager savedManager, tr3 tr3Var, NetworkStatus networkStatus, DeepLinkManager deepLinkManager, uq7 uq7Var, AssetDatabase assetDatabase, td4 td4Var, id9 id9Var, TimeStampUtil timeStampUtil, InterestsManager interestsManager, InterestsOnboardingManager interestsOnboardingManager, AppPreferences appPreferences, Subauth subauth) {
        zq3.h(z58Var, "subauthClient");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(youEventSender, "eventSender");
        zq3.h(bs3Var, "iterateSurveyReporter");
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        zq3.h(savedManager, "savedManager");
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(deepLinkManager, "deepLinkManager");
        zq3.h(uq7Var, "sharingManager");
        zq3.h(assetDatabase, "assetDatabase");
        zq3.h(td4Var, "mainActivityNavigator");
        zq3.h(id9Var, "webActivityNavigator");
        zq3.h(timeStampUtil, "timeStampUtil");
        zq3.h(interestsManager, "interestsManager");
        zq3.h(interestsOnboardingManager, "interestsOnboardingManager");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(subauth, "subauth");
        this.a = z58Var;
        this.b = cb2Var;
        this.c = youEventSender;
        this.d = bs3Var;
        this.e = recentlyViewedManager;
        this.f = savedManager;
        this.g = tr3Var;
        this.h = networkStatus;
        this.i = deepLinkManager;
        this.j = uq7Var;
        this.k = assetDatabase;
        this.l = td4Var;
        this.m = id9Var;
        this.n = timeStampUtil;
        this.r = interestsManager;
        this.s = interestsOnboardingManager;
        this.t = appPreferences;
        this.u = subauth;
        DownloadState.c cVar = DownloadState.c.b;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(cVar);
        this.w = MutableStateFlow;
        this.x = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(cVar);
        this.y = MutableStateFlow2;
        this.B = FlowKt.asStateFlow(MutableStateFlow2);
        this.H = interestsOnboardingManager.c();
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(cVar);
        this.L = MutableStateFlow3;
        this.M = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(cVar);
        this.N = MutableStateFlow4;
        this.Q = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(c.b.a);
        this.S = MutableStateFlow5;
        this.X = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow a2 = MutableStateFlowKtxKt.a(p1(), r.a(this), T(z58Var.h().d(), z58Var.o(), z58Var.h().u()));
        this.Y = a2;
        this.Z = FlowKt.asStateFlow(a2);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(P());
        this.e0 = MutableStateFlow6;
        this.f0 = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.g0 = MutableStateFlow7;
        this.h0 = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(new d.c(""));
        this.i0 = MutableStateFlow8;
        this.j0 = FlowKt.asStateFlow(MutableStateFlow8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DownloadState I(DownloadState downloadState) {
        List j1;
        DownloadState downloadState2 = DownloadState.c.b;
        if (!zq3.c(downloadState, downloadState2)) {
            if (downloadState instanceof DownloadState.a) {
                return downloadState;
            }
            if (downloadState instanceof DownloadState.b) {
                DownloadState.b bVar = (DownloadState.b) downloadState;
                fp3 c2 = ((bq3) bVar.a()).c();
                zq3.e(c2);
                List j12 = j1(c2);
                Instant b2 = ((bq3) bVar.a()).b();
                fp3 c3 = ((bq3) bVar.a()).c();
                zq3.e(c3);
                Instant ofEpochSecond = Instant.ofEpochSecond(c3.b());
                zq3.g(ofEpochSecond, "ofEpochSecond(...)");
                downloadState2 = new DownloadState.b(new b.a(j12, b2, ofEpochSecond), bVar.d(), bVar.c());
            } else if (downloadState instanceof DownloadState.d) {
                DownloadState.d dVar = (DownloadState.d) downloadState;
                fp3 c4 = ((bq3) dVar.a()).c();
                zq3.e(c4);
                List j13 = j1(c4);
                Instant b3 = ((bq3) dVar.a()).b();
                fp3 c5 = ((bq3) dVar.a()).c();
                zq3.e(c5);
                Instant ofEpochSecond2 = Instant.ofEpochSecond(c5.b());
                zq3.g(ofEpochSecond2, "ofEpochSecond(...)");
                downloadState2 = new DownloadState.d(new b.a(j13, b3, ofEpochSecond2));
            } else {
                if (!(downloadState instanceof DownloadState.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                DownloadState.e eVar = (DownloadState.e) downloadState;
                if (!((bq3) eVar.a()).a().isEmpty()) {
                    fp3 c6 = ((bq3) eVar.a()).c();
                    zq3.e(c6);
                    List j14 = j1(c6);
                    Instant b4 = ((bq3) eVar.a()).b();
                    fp3 c7 = ((bq3) eVar.a()).c();
                    zq3.e(c7);
                    Instant ofEpochSecond3 = Instant.ofEpochSecond(c7.b());
                    zq3.g(ofEpochSecond3, "ofEpochSecond(...)");
                    downloadState2 = new DownloadState.b(new b.a(j14, b4, ofEpochSecond3), ((q22) i.k0(((bq3) eVar.a()).a())).b(), new UserInterestsApiError(((q22) i.k0(((bq3) eVar.a()).a())).b()));
                } else if (this.h.g()) {
                    int i = b.a[P().ordinal()];
                    if (i == 1) {
                        fp3 c8 = ((bq3) eVar.a()).c();
                        zq3.e(c8);
                        j1 = j1(c8);
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fp3 c9 = ((bq3) eVar.a()).c();
                        zq3.e(c9);
                        j1 = i.N0(c9.a(), new c());
                    }
                    Instant b5 = ((bq3) eVar.a()).b();
                    fp3 c10 = ((bq3) eVar.a()).c();
                    zq3.e(c10);
                    Instant ofEpochSecond4 = Instant.ofEpochSecond(c10.b());
                    zq3.g(ofEpochSecond4, "ofEpochSecond(...)");
                    downloadState2 = new DownloadState.e(new b.a(j1, b5, ofEpochSecond4));
                } else {
                    fp3 c11 = ((bq3) eVar.a()).c();
                    zq3.e(c11);
                    List j15 = j1(c11);
                    Instant b6 = ((bq3) eVar.a()).b();
                    fp3 c12 = ((bq3) eVar.a()).c();
                    zq3.e(c12);
                    Instant ofEpochSecond5 = Instant.ofEpochSecond(c12.b());
                    zq3.g(ofEpochSecond5, "ofEpochSecond(...)");
                    downloadState2 = new DownloadState.b(new b.a(j15, b6, ofEpochSecond5), "No Internet Connection on fetch with non stale data in cache", null, 4, null);
                }
            }
        }
        return downloadState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|(1:14)(4:20|(2:23|21)|24|25)|15|16|17))|34|6|7|(0)(0)|12|(0)(0)|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        r4.L.setValue(new com.nytimes.android.coroutinesutils.DownloadState.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0049, B:14:0x0053, B:15:0x0087, B:20:0x0056, B:21:0x0067, B:23:0x006d, B:25:0x007b, B:29:0x003a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0049, B:14:0x0053, B:15:0x0087, B:20:0x0056, B:21:0x0067, B:23:0x006d, B:25:0x007b, B:29:0x003a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.features.you.youtab.YouScreenViewModel$getSavedItems$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.features.you.youtab.YouScreenViewModel$getSavedItems$1 r0 = (com.nytimes.android.features.you.youtab.YouScreenViewModel$getSavedItems$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.you.youtab.YouScreenViewModel$getSavedItems$1 r0 = new com.nytimes.android.features.you.youtab.YouScreenViewModel$getSavedItems$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.features.you.youtab.YouScreenViewModel r4 = (com.nytimes.android.features.you.youtab.YouScreenViewModel) r4
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L49
        L2d:
            r5 = move-exception
            goto L90
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            com.nytimes.android.saved.SavedManager r5 = r4.f     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            r2 = 0
            r3 = 5
            java.lang.Object r5 = r5.getAssets(r2, r3, r0)     // Catch: java.lang.Exception -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L2d
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.L     // Catch: java.lang.Exception -> L2d
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L56
            com.nytimes.android.features.you.youtab.e$b r5 = com.nytimes.android.features.you.youtab.e.b.a     // Catch: java.lang.Exception -> L2d
            goto L87
        L56:
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L2d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2d
            r2 = 10
            int r2 = kotlin.collections.i.w(r5, r2)     // Catch: java.lang.Exception -> L2d
            r1.<init>(r2)     // Catch: java.lang.Exception -> L2d
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L2d
        L67:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L2d
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L2d
            com.nytimes.android.api.cms.Asset r2 = (com.nytimes.android.api.cms.Asset) r2     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = r2.youTabImageUrl()     // Catch: java.lang.Exception -> L2d
            r1.add(r2)     // Catch: java.lang.Exception -> L2d
            goto L67
        L7b:
            com.nytimes.android.saved.SavedManager r5 = r4.f     // Catch: java.lang.Exception -> L2d
            int r5 = r5.size()     // Catch: java.lang.Exception -> L2d
            com.nytimes.android.features.you.youtab.e$a r2 = new com.nytimes.android.features.you.youtab.e$a     // Catch: java.lang.Exception -> L2d
            r2.<init>(r1, r5)     // Catch: java.lang.Exception -> L2d
            r5 = r2
        L87:
            com.nytimes.android.coroutinesutils.DownloadState$e r1 = new com.nytimes.android.coroutinesutils.DownloadState$e     // Catch: java.lang.Exception -> L2d
            r1.<init>(r5)     // Catch: java.lang.Exception -> L2d
            r0.setValue(r1)     // Catch: java.lang.Exception -> L2d
            goto L9a
        L90:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r4.L
            com.nytimes.android.coroutinesutils.DownloadState$a r0 = new com.nytimes.android.coroutinesutils.DownloadState$a
            r0.<init>(r5)
            r4.setValue(r0)
        L9a:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.YouScreenViewModel.M(by0):java.lang.Object");
    }

    private final SortOrder P() {
        SortOrder sortOrder;
        String l = this.t.l("InterestSortingType", SortOrder.MOST_RECENT.getLabel());
        SortOrder[] values = SortOrder.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                sortOrder = null;
                break;
            }
            sortOrder = values[i];
            if (zq3.c(sortOrder.getLabel(), l)) {
                break;
            }
            i++;
        }
        return sortOrder == null ? SortOrder.MOST_RECENT : sortOrder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pm9 T(String str, Set set, String str2) {
        String b2;
        if (str == null) {
            return null;
        }
        b2 = hm9.b(set);
        if (str2 == null) {
            str2 = "";
        }
        return new pm9(str, b2, str2);
    }

    private final void W(String str) {
        this.t.f(str, false);
    }

    public static /* synthetic */ void a0(YouScreenViewModel youScreenViewModel, com.nytimes.android.features.you.youtab.b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        youScreenViewModel.Z(bVar, z);
    }

    private final void b0(com.nytimes.android.features.you.youtab.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), Dispatchers.getIO(), null, new YouScreenViewModel$loadRecentlyViewed$1(aVar, this, null), 2, null);
    }

    private final void c0(e eVar) {
        Job launch$default;
        Job job;
        Job job2 = this.k0;
        if (job2 != null && job2.isActive() && (job = this.k0) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (eVar != null) {
            this.L.setValue(new DownloadState.d(eVar));
        } else {
            this.L.setValue(DownloadState.c.b);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new YouScreenViewModel$loadSaved$1(this, null), 3, null);
        this.k0 = launch$default;
    }

    static /* synthetic */ void d0(YouScreenViewModel youScreenViewModel, e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = null;
        }
        youScreenViewModel.c0(eVar);
    }

    private final boolean i1(String str) {
        return this.t.n(str, false);
    }

    private final List j1(fp3 fp3Var) {
        List a2 = fp3Var.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(a2, 10)), 16));
        for (Object obj : a2) {
            linkedHashMap.put(Integer.valueOf(((com.nytimes.android.interests.db.a) obj).d()), obj);
        }
        List c2 = fp3Var.c();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c2.iterator();
        while (it2.hasNext()) {
            com.nytimes.android.interests.db.a aVar = (com.nytimes.android.interests.db.a) linkedHashMap.get(Integer.valueOf(((Number) it2.next()).intValue()));
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void n1(YouScreenViewModel youScreenViewModel, com.nytimes.android.features.you.youtab.c cVar, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        youScreenViewModel.m1(cVar, num, str);
    }

    private final StateFlow p1() {
        final SharedFlow h = this.a.h().h();
        return FlowKt.stateIn(new Flow() { // from class: com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1

            /* renamed from: com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ YouScreenViewModel b;

                @fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1$2", f = "YouScreenViewModel.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, YouScreenViewModel youScreenViewModel) {
                    this.a = flowCollector;
                    this.b = youScreenViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, defpackage.by0 r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1$2$1 r0 = (com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1$2$1 r0 = new com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r9)
                        goto L82
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        kotlin.f.b(r9)
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.a
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r8 = (com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType) r8
                        com.nytimes.android.features.you.youtab.YouScreenViewModel r8 = r7.b
                        z58 r8 = r8.R()
                        boolean r8 = r8.q()
                        r2 = 0
                        if (r8 == 0) goto L6c
                        com.nytimes.android.features.you.youtab.YouScreenViewModel r8 = r7.b
                        z58 r4 = r8.R()
                        java.lang.String r4 = r4.L()
                        com.nytimes.android.features.you.youtab.YouScreenViewModel r5 = r7.b
                        z58 r5 = r5.R()
                        java.util.Set r5 = r5.o()
                        com.nytimes.android.features.you.youtab.YouScreenViewModel r6 = r7.b
                        z58 r6 = r6.R()
                        com.nytimes.android.subauth.core.api.client.NYTUser r6 = r6.h()
                        java.lang.String r6 = r6.u()
                        pm9 r8 = com.nytimes.android.features.you.youtab.YouScreenViewModel.o(r8, r4, r5, r6)
                        goto L6d
                    L6c:
                        r8 = r2
                    L6d:
                        com.nytimes.android.features.you.youtab.YouScreenViewModel r4 = r7.b
                        com.nytimes.android.features.you.youtab.YouScreenViewModel.d0(r4, r2, r3, r2)
                        com.nytimes.android.features.you.youtab.YouScreenViewModel r7 = r7.b
                        r4 = 0
                        r5 = 3
                        com.nytimes.android.features.you.youtab.YouScreenViewModel.a0(r7, r2, r4, r5, r2)
                        r0.label = r3
                        java.lang.Object r7 = r9.emit(r8, r0)
                        if (r7 != r1) goto L82
                        return r1
                    L82:
                        ww8 r7 = defpackage.ww8.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.YouScreenViewModel$userLoginChanged$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, r.a(this), SharingStarted.Companion.getEagerly(), T(this.a.h().d(), this.a.o(), this.a.h().u()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(com.nytimes.android.interests.db.a r8, java.lang.String r9, defpackage.by0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.nytimes.android.features.you.youtab.YouScreenViewModel$reloadInterest$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.features.you.youtab.YouScreenViewModel$reloadInterest$1 r0 = (com.nytimes.android.features.you.youtab.YouScreenViewModel$reloadInterest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.you.youtab.YouScreenViewModel$reloadInterest$1 r0 = new com.nytimes.android.features.you.youtab.YouScreenViewModel$reloadInterest$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.features.you.youtab.YouScreenViewModel r7 = (com.nytimes.android.features.you.youtab.YouScreenViewModel) r7
            kotlin.f.b(r10)
            goto L56
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.f.b(r10)
            boolean r10 = r7.i1(r9)
            if (r10 == 0) goto L59
            com.nytimes.android.interests.InterestsManager r10 = r7.r
            int r8 = r8.d()
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = r10.o(r8, r0)
            if (r10 != r1) goto L56
            return r1
        L56:
            r8 = r10
            com.nytimes.android.interests.db.a r8 = (com.nytimes.android.interests.db.a) r8
        L59:
            kotlinx.coroutines.flow.MutableStateFlow r10 = r7.w
            java.lang.Object r10 = r10.getValue()
            com.nytimes.android.coroutinesutils.DownloadState r10 = (com.nytimes.android.coroutinesutils.DownloadState) r10
            java.lang.Object r10 = r10.a()
            com.nytimes.android.features.you.youtab.b r10 = (com.nytimes.android.features.you.youtab.b) r10
            boolean r0 = r10 instanceof com.nytimes.android.features.you.youtab.b.a
            if (r0 == 0) goto Lb3
            boolean r0 = r7.i1(r9)
            if (r0 == 0) goto Lb3
            r1 = r10
            com.nytimes.android.features.you.youtab.b$a r1 = (com.nytimes.android.features.you.youtab.b.a) r1
            java.util.List r10 = r1.d()
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.List r2 = kotlin.collections.i.a1(r10)
            java.util.Iterator r10 = r2.iterator()
            r0 = 0
        L83:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r10.next()
            com.nytimes.android.interests.db.a r3 = (com.nytimes.android.interests.db.a) r3
            int r3 = r3.d()
            int r4 = r8.d()
            if (r3 != r4) goto L9a
            goto L9e
        L9a:
            int r0 = r0 + 1
            goto L83
        L9d:
            r0 = -1
        L9e:
            r2.set(r0, r8)
            kotlinx.coroutines.flow.MutableStateFlow r10 = r7.w
            com.nytimes.android.coroutinesutils.DownloadState$e r0 = new com.nytimes.android.coroutinesutils.DownloadState$e
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            com.nytimes.android.features.you.youtab.b$a r1 = com.nytimes.android.features.you.youtab.b.a.b(r1, r2, r3, r4, r5, r6)
            r0.<init>(r1)
            r10.setValue(r0)
        Lb3:
            r7.W(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.YouScreenViewModel.s0(com.nytimes.android.interests.db.a, java.lang.String, by0):java.lang.Object");
    }

    public final String A(long j) {
        String format = new SimpleDateFormat("MMMM d", Locale.getDefault()).format(new Date(j));
        zq3.g(format, "format(...)");
        return format;
    }

    public void A0(int i) {
        this.c.g(i);
    }

    public final StateFlow B() {
        return this.j0;
    }

    public void B0(int i, String str) {
        zq3.h(str, "interestURL");
        this.c.i(i, str);
    }

    public final YouEventSender C() {
        return this.c;
    }

    public void C0(int i) {
        this.c.j(i);
    }

    public final cb2 D() {
        return this.b;
    }

    public void D0(int i, String str) {
        zq3.h(str, "filterName");
        this.c.k(i, str);
    }

    public final StateFlow E() {
        return this.Q;
    }

    public void E0() {
        this.c.l();
    }

    public final StateFlow F() {
        return this.s.b();
    }

    public void F0() {
        this.c.m();
    }

    public final StateFlow G() {
        return this.B;
    }

    public void G0(int i) {
        this.c.q(i);
    }

    public final StateFlow H() {
        return this.x;
    }

    public void H0() {
        this.c.r();
    }

    public void I0() {
        this.c.s();
    }

    public final bs3 J() {
        return this.d;
    }

    public void J0() {
        this.c.t();
    }

    public final StateFlow K() {
        return this.H;
    }

    public void K0() {
        this.c.u();
    }

    public final RecentlyViewedManager L() {
        return this.e;
    }

    public void L0() {
        this.c.v();
    }

    public void M0(List list, List list2) {
        zq3.h(list, "selectedInterestsIds");
        zq3.h(list2, "sectionTitles");
        this.c.w(list, list2);
    }

    public final StateFlow N() {
        return this.M;
    }

    public void N0() {
        this.c.x();
    }

    public final StateFlow O() {
        return this.h0;
    }

    public void O0() {
        this.c.y();
    }

    public void P0(int i) {
        this.c.A(i);
    }

    public final StateFlow Q() {
        return this.f0;
    }

    public void Q0(int i, String str) {
        zq3.h(str, "interestURL");
        this.c.C(i, str);
    }

    public final z58 R() {
        return this.a;
    }

    public void R0(int i, String str) {
        zq3.h(str, "interestURL");
        this.c.D(i, str);
    }

    public final StateFlow S() {
        return this.X;
    }

    public void S0() {
        this.c.E();
    }

    public void T0(int i, String str) {
        zq3.h(str, "interestURL");
        this.c.I(i, str);
    }

    public final StateFlow U() {
        return this.Z;
    }

    public void U0() {
        this.c.J();
    }

    public final boolean V() {
        return this.h.g();
    }

    public void V0() {
        this.c.K();
    }

    public void W0(Interest.PersonalizedItem personalizedItem, int i) {
        zq3.h(personalizedItem, "item");
        this.c.L(personalizedItem, i);
    }

    public final boolean X(Context context) {
        zq3.h(context, "context");
        return tb1.c(this.t.k(context.getString(il6.ITERATE_YOU_TAB_SCROLL_EVENT), 0L));
    }

    public void X0() {
        this.c.M();
    }

    public final void Y() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new YouScreenViewModel$loadInterestPreviews$1(this, null), 3, null);
    }

    public void Y0(SortOrder sortOrder) {
        zq3.h(sortOrder, "sort");
        this.c.N(sortOrder);
    }

    public final void Z(com.nytimes.android.features.you.youtab.b bVar, boolean z) {
        if (bVar != null) {
            this.w.setValue(new DownloadState.d(bVar));
        } else {
            this.w.setValue(DownloadState.c.b);
        }
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new YouScreenViewModel$loadInterests$1(this, z, bVar, null), 3, null);
    }

    public void Z0(SortOrder sortOrder) {
        zq3.h(sortOrder, "sort");
        this.c.O(sortOrder);
    }

    public void a1(SortOrder sortOrder, SortOrder sortOrder2) {
        zq3.h(sortOrder, "previousSort");
        zq3.h(sortOrder2, "newSort");
        this.c.P(sortOrder, sortOrder2);
    }

    public void b1() {
        this.c.Q();
    }

    public void c1(int i, String str) {
        zq3.h(str, "interestURL");
        this.c.R(i, str);
    }

    public void d1(int i) {
        this.c.S(i);
    }

    public final void e0() {
        b0((com.nytimes.android.features.you.youtab.a) ((DownloadState) this.Q.getValue()).a());
        c0((e) ((DownloadState) this.M.getValue()).a());
    }

    public final void e1(List list, qs2 qs2Var) {
        zq3.h(list, "interests");
        zq3.h(qs2Var, "onError");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new YouScreenViewModel$setOnboardingUserInterests$1(this, list, qs2Var, null), 3, null);
    }

    public final void f0() {
        this.s.e();
        a0(this, null, false, 3, null);
    }

    public final boolean f1(long j) {
        return this.b.u() && j > this.t.k("lastSeenUserInterests", InterestsPreferencesStore.Companion.a());
    }

    public final void g0(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        if (componentActivity != null) {
            this.g.a(componentActivity, y25Var);
        }
    }

    public final boolean g1() {
        return this.s.h();
    }

    public final void h0(String str) {
        zq3.h(str, "answerId");
        MutableStateFlow mutableStateFlow = this.i0;
        mutableStateFlow.setValue(new d.c(str));
    }

    public final boolean h1(Long l) {
        if (this.b.v()) {
            return l != null && l.longValue() > this.t.k("lastSeenUserInterests", InterestsPreferencesStore.Companion.a());
        }
        return false;
    }

    public final void i0() {
        this.t.f("newsQuizInterestRefresh", true);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new YouScreenViewModel$newsQuizInitialed$1(this, null), 3, null);
    }

    public final void j0(OnboardingToolTipState onboardingToolTipState) {
        zq3.h(onboardingToolTipState, TransferTable.COLUMN_STATE);
        this.s.g(onboardingToolTipState);
    }

    public final boolean k0(Context context) {
        zq3.h(context, "context");
        this.c.p();
        if (!this.h.g()) {
            return false;
        }
        id9 id9Var = this.m;
        String string = context.getString(yk6.nytAccountSettingsUrl);
        zq3.g(string, "getString(...)");
        id9Var.c(context, string);
        return true;
    }

    public final void k1(sp3 sp3Var, List list) {
        zq3.h(sp3Var, "allInterests");
        zq3.h(list, "selectedTopics");
        YouEventSender youEventSender = this.c;
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((Number) it2.next()).intValue()));
        }
        youEventSender.z(arrayList);
        this.s.j(sp3Var, list);
    }

    public final boolean l0(Context context) {
        zq3.h(context, "context");
        this.c.c();
        if (!this.h.g()) {
            return false;
        }
        this.g0.setValue(Boolean.TRUE);
        id9 id9Var = this.m;
        String string = context.getString(yk6.nytChangeNameUrl);
        zq3.g(string, "getString(...)");
        id9Var.c(context, string);
        return true;
    }

    public final void l1(List list, qs2 qs2Var) {
        zq3.h(list, "updatedList");
        zq3.h(qs2Var, "onError");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new YouScreenViewModel$updateList$1(this, list, qs2Var, null), 3, null);
    }

    public final boolean m0(Context context, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "url");
        zq3.h(str2, "answerId");
        if (!this.h.g()) {
            return false;
        }
        i0();
        this.m.c(context, str + "?selected_answers=" + str2);
        return true;
    }

    public final void m1(com.nytimes.android.features.you.youtab.c cVar, Integer num, String str) {
        zq3.h(cVar, "newState");
        if (zq3.c(cVar, c.a.a) && num != null) {
            int intValue = num.intValue();
            if (str == null) {
                str = "";
            }
            y0(intValue, str);
        }
        this.S.setValue(cVar);
    }

    public final void n0() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new YouScreenViewModel$onReturnFromNamePrompt$1(this, null), 3, null);
    }

    public final void o0(Activity activity) {
        zq3.h(activity, "activity");
        this.l.f(activity);
    }

    public final void o1(SortOrder sortOrder, SortOrder sortOrder2) {
        zq3.h(sortOrder, "currentSortOrder");
        zq3.h(sortOrder2, "newSortOrder");
        this.e0.setValue(sortOrder2);
        this.t.d("InterestSortingType", sortOrder2.getLabel());
        a1(sortOrder, sortOrder2);
        a0(this, (com.nytimes.android.features.you.youtab.b) ((DownloadState) this.x.getValue()).a(), false, 2, null);
    }

    @Override // androidx.lifecycle.q
    protected void onCleared() {
        this.t.c("lastSeenUserInterests", Instant.now().getEpochSecond());
        super.onCleared();
    }

    public final void p0(f fVar, CoroutineScope coroutineScope) {
        zq3.h(fVar, "activity");
        zq3.h(coroutineScope, "scope");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new YouScreenViewModel$openRecentlyViewedActivity$1(this, fVar, null), 3, null);
    }

    public final void q0(f fVar, CoroutineScope coroutineScope) {
        zq3.h(fVar, "activity");
        zq3.h(coroutineScope, "scope");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new YouScreenViewModel$openSavedForLaterActivity$1(this, fVar, null), 3, null);
    }

    public final boolean q1() {
        return this.s.k();
    }

    public final Object r0(com.nytimes.android.interests.db.a aVar, by0 by0Var) {
        return s0(aVar, "flashbackInterestUpdateScore", by0Var);
    }

    public final Object t0(com.nytimes.android.interests.db.a aVar, by0 by0Var) {
        return s0(aVar, "newsQuizInterestRefresh", by0Var);
    }

    public final Object u0(com.nytimes.android.interests.db.a aVar, by0 by0Var) {
        return s0(aVar, "booksInterestRefresh", by0Var);
    }

    public final void v0(com.nytimes.android.interests.db.a aVar, qs2 qs2Var) {
        zq3.h(aVar, "interest");
        zq3.h(qs2Var, "onError");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new YouScreenViewModel$removeInterest$1(this, aVar, qs2Var, null), 3, null);
    }

    public final void w(List list, qs2 qs2Var) {
        zq3.h(list, "interests");
        zq3.h(qs2Var, "onError");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new YouScreenViewModel$addInterestsToUser$1(this, list, qs2Var, null), 3, null);
    }

    public void w0() {
        this.c.b();
    }

    public final void x() {
        this.t.f("booksInterestRefresh", true);
    }

    public void x0() {
        this.c.d();
    }

    public final void y(String str, String str2) {
        zq3.h(str, "selectedAnswerId");
        zq3.h(str2, "correctAnswerId");
        this.i0.setValue(zq3.c(str, str2) ? new d.a(str) : new d.b(str));
    }

    public void y0(int i, String str) {
        zq3.h(str, "url");
        this.c.e(i, str);
    }

    public final void z() {
        this.t.f("flashbackInterestUpdateScore", true);
    }

    public void z0(int i) {
        this.c.f(i);
    }
}
