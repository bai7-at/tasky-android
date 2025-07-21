package com.nytimes.android.ribbon.destinations.cooking;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.retrofit.CookingApi;
import com.nytimes.android.api.retrofit.CookingContent;
import com.nytimes.android.api.retrofit.ImageCrop;
import com.nytimes.android.api.retrofit.Post;
import com.nytimes.android.api.retrofit.ServiceResponseCard;
import com.nytimes.android.coroutinesutils.CachedParallelStore;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import com.nytimes.android.ribbon.et2.Key;
import defpackage.ai0;
import defpackage.c58;
import defpackage.di0;
import defpackage.du8;
import defpackage.g90;
import defpackage.s42;
import defpackage.s63;
import defpackage.t63;
import defpackage.tr3;
import defpackage.ue4;
import defpackage.y25;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class CookingViewModel extends q {
    public static final a Companion = new a(null);
    public static final int j = 8;
    private final DestinationAssetRepository a;
    private final tr3 b;
    private final s63 c;
    private final DestinationEventTracker d;
    private final CookingApi e;
    private final DestinationTabState f;
    private final MutableStateFlow g;
    private final StateFlow h;
    private final CachedParallelStore i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public CookingViewModel(DestinationAssetRepository destinationAssetRepository, tr3 tr3Var, s63 s63Var, DestinationEventTracker destinationEventTracker, CookingApi cookingApi, DestinationTabState destinationTabState) {
        zq3.h(destinationAssetRepository, "store");
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(s63Var, "handoffManager");
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(cookingApi, "api");
        zq3.h(destinationTabState, "tabState");
        this.a = destinationAssetRepository;
        this.b = tr3Var;
        this.c = s63Var;
        this.d = destinationEventTracker;
        this.e = cookingApi;
        this.f = destinationTabState;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.g = MutableStateFlow;
        this.h = FlowKt.asStateFlow(MutableStateFlow);
        this.i = destinationAssetRepository.g("cooking", CookingViewState.Companion.serializer(), new CookingViewModel$cachedStore$1(this, null));
    }

    public static /* synthetic */ void A(CookingViewModel cookingViewModel, CookingViewState cookingViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cookingViewState = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        cookingViewModel.z(cookingViewState, z);
    }

    private final List n(List list) {
        ImageCrop imageCrop;
        if (list == null) {
            return i.l();
        }
        List<Post> list2 = list;
        int i = 10;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        for (Post post : list2) {
            List d = post.d();
            CookingCarouselModule cookingCarouselModule = null;
            if (d != null) {
                List<ServiceResponseCard> P0 = i.P0(d, 7);
                ArrayList arrayList2 = new ArrayList(i.w(P0, i));
                for (ServiceResponseCard serviceResponseCard : P0) {
                    List e = serviceResponseCard.e();
                    arrayList2.add(new RecipeCardData((e == null || (imageCrop = (ImageCrop) e.get(0)) == null) ? null : imageCrop.a(), serviceResponseCard.f(), serviceResponseCard.c(), new Rating(serviceResponseCard.g(), serviceResponseCard.b()), serviceResponseCard.i(), serviceResponseCard.d(), serviceResponseCard.h()));
                }
                cookingCarouselModule = new CookingCarouselModule(post.h(), arrayList2, post.k());
            }
            arrayList.add(cookingCarouselModule);
            i = 10;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.nytimes.android.api.retrofit.CookingContent r11, defpackage.by0 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$dailyHero$1
            if (r0 == 0) goto L13
            r0 = r12
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$dailyHero$1 r0 = (com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$dailyHero$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$dailyHero$1 r0 = new com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$dailyHero$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.L$0
            com.nytimes.android.api.retrofit.Post r10 = (com.nytimes.android.api.retrofit.Post) r10
            kotlin.f.b(r12)
            goto L54
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.f.b(r12)
            if (r11 == 0) goto L85
            java.util.List r11 = r11.b()
            if (r11 == 0) goto L85
            java.lang.Object r11 = kotlin.collections.i.m0(r11)
            com.nytimes.android.api.retrofit.Post r11 = (com.nytimes.android.api.retrofit.Post) r11
            if (r11 == 0) goto L85
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r12 = r10.s(r11, r0)
            if (r12 != r1) goto L53
            return r1
        L53:
            r10 = r11
        L54:
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r10.f()
            java.lang.String r4 = r10.h()
            java.lang.String r5 = r10.j()
            java.lang.String r6 = r10.c()
            com.nytimes.android.ribbon.destinations.cooking.Rating r7 = new com.nytimes.android.ribbon.destinations.cooking.Rating
            java.lang.Integer r11 = r10.i()
            java.lang.Integer r12 = r10.b()
            r7.<init>(r11, r12)
            java.lang.String r8 = r10.e()
            java.lang.String r9 = r10.k()
            com.nytimes.android.ribbon.destinations.cooking.CookingHeroData r10 = new com.nytimes.android.ribbon.destinations.cooking.CookingHeroData
            java.lang.String r3 = "RECIPE OF THE DAY"
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L8b
        L85:
            com.nytimes.android.ribbon.destinations.cooking.CookingHeroData$Companion r10 = com.nytimes.android.ribbon.destinations.cooking.CookingHeroData.Companion
            com.nytimes.android.ribbon.destinations.cooking.CookingHeroData r10 = r10.a()
        L8b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingViewModel.o(com.nytimes.android.api.retrofit.CookingContent, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a A[PHI: r6
      0x005a: PHI (r6v7 java.lang.Object) = (r6v6 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0057, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchCookingData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchCookingData$1 r0 = (com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchCookingData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchCookingData$1 r0 = new com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchCookingData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel r5 = (com.nytimes.android.ribbon.destinations.cooking.CookingViewModel) r5
            kotlin.f.b(r6)
            goto L4c
        L3c:
            kotlin.f.b(r6)
            com.nytimes.android.api.retrofit.CookingApi r6 = r5.e
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getCookingHomepage(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.util.List r6 = (java.util.List) r6
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r5.y(r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingViewModel.p(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.by0 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchLegacyProgramming$1
            if (r0 == 0) goto L13
            r0 = r11
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchLegacyProgramming$1 r0 = (com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchLegacyProgramming$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchLegacyProgramming$1 r0 = new com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$fetchLegacyProgramming$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r11)
            goto L41
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.f.b(r11)
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository r10 = r10.a
            r0.label = r3
            java.lang.String r11 = "/syndicated/xpn-panel-cooking"
            java.lang.Object r11 = r10.q(r11, r0)
            if (r11 != r1) goto L41
            return r1
        L41:
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r10 = ""
            java.lang.Object r11 = r11.get(r10)
            java.util.List r11 = (java.util.List) r11
            r0 = 0
            if (r11 == 0) goto L56
            r1 = 0
            java.lang.Object r11 = r11.get(r1)
            oz0 r11 = (defpackage.oz0) r11
            goto L57
        L56:
            r11 = r0
        L57:
            if (r11 == 0) goto L8a
            java.lang.String r3 = r11.b()
            if (r3 == 0) goto L8a
            com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData r0 = new com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData
            java.lang.String r2 = r11.d()
            java.lang.String r1 = r11.e()
            if (r1 != 0) goto L6d
            r4 = r10
            goto L6e
        L6d:
            r4 = r1
        L6e:
            java.lang.String r5 = r11.c()
            java.lang.String r10 = r11.a()
            java.lang.String r6 = java.lang.String.valueOf(r10)
            java.lang.String r7 = r11.f()
            java.lang.String r8 = r11.h()
            java.lang.String r9 = r11.g()
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingViewModel.q(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getCookingData$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getCookingData$1 r0 = (com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getCookingData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getCookingData$1 r0 = new com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getCookingData$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData r6 = (com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData) r6
            kotlin.f.b(r7)
            goto L5e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel r6 = (com.nytimes.android.ribbon.destinations.cooking.CookingViewModel) r6
            kotlin.f.b(r7)
            goto L4e
        L40:
            kotlin.f.b(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r6.q(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData r7 = (com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData) r7
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.p(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r5 = r7
            r7 = r6
            r6 = r5
        L5e:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r0 = r7.a()
            com.nytimes.android.ribbon.destinations.cooking.CookingHeroData r0 = (com.nytimes.android.ribbon.destinations.cooking.CookingHeroData) r0
            java.lang.Object r7 = r7.b()
            java.util.List r7 = (java.util.List) r7
            com.nytimes.android.ribbon.destinations.cooking.CookingViewState r1 = new com.nytimes.android.ribbon.destinations.cooking.CookingViewState
            r1.<init>(r0, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingViewModel.r(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(com.nytimes.android.api.retrofit.Post r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getHeroImageUrl$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getHeroImageUrl$1 r0 = (com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getHeroImageUrl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getHeroImageUrl$1 r0 = new com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$getHeroImageUrl$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            com.nytimes.android.api.retrofit.Post r5 = (com.nytimes.android.api.retrofit.Post) r5
            kotlin.f.b(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.f.b(r6)
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository r4 = r4.a
            java.lang.String r6 = r5.k()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.r(r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L69
            java.util.List r4 = r5.g()
            if (r4 == 0) goto L63
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            com.nytimes.android.api.retrofit.ImageCrop r4 = (com.nytimes.android.api.retrofit.ImageCrop) r4
            if (r4 == 0) goto L63
            java.lang.String r4 = r4.a()
        L61:
            r6 = r4
            goto L65
        L63:
            r4 = 0
            goto L61
        L65:
            if (r6 != 0) goto L69
            java.lang.String r6 = ""
        L69:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingViewModel.s(com.nytimes.android.api.retrofit.Post, by0):java.lang.Object");
    }

    private final Pair w(List list) {
        Object obj;
        Object obj2;
        List list2 = list;
        Iterator it2 = list2.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (zq3.c(((CookingContent) obj2).c(), "")) {
                break;
            }
        }
        CookingContent cookingContent = (CookingContent) obj2;
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (zq3.c(((CookingContent) next).c(), "Featured Collections")) {
                obj = next;
                break;
            }
        }
        return du8.a(cookingContent, (CookingContent) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.util.List r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$parseHomepageData$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$parseHomepageData$1 r0 = (com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$parseHomepageData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$parseHomepageData$1 r0 = new com.nytimes.android.ribbon.destinations.cooking.CookingViewModel$parseHomepageData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            com.nytimes.android.api.retrofit.CookingContent r5 = (com.nytimes.android.api.retrofit.CookingContent) r5
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.ribbon.destinations.cooking.CookingViewModel r6 = (com.nytimes.android.ribbon.destinations.cooking.CookingViewModel) r6
            kotlin.f.b(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L5c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.f.b(r7)
            kotlin.Pair r6 = r5.w(r6)
            java.lang.Object r7 = r6.a()
            com.nytimes.android.api.retrofit.CookingContent r7 = (com.nytimes.android.api.retrofit.CookingContent) r7
            java.lang.Object r6 = r6.b()
            com.nytimes.android.api.retrofit.CookingContent r6 = (com.nytimes.android.api.retrofit.CookingContent) r6
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r5.o(r7, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            com.nytimes.android.ribbon.destinations.cooking.CookingHeroData r7 = (com.nytimes.android.ribbon.destinations.cooking.CookingHeroData) r7
            if (r6 == 0) goto L65
            java.util.List r6 = r6.b()
            goto L66
        L65:
            r6 = 0
        L66:
            java.util.List r5 = r5.n(r6)
            kotlin.Pair r5 = defpackage.du8.a(r7, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingViewModel.y(java.util.List, by0):java.lang.Object");
    }

    public final void B(Key key, int i, String str, String str2) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(str, "blockLabel");
        zq3.h(str2, "cardUrl");
        DestinationEventTracker destinationEventTracker = this.d;
        RibbonConfig ribbonConfig = RibbonConfig.COOKING;
        s42 s42Var = new s42("view all recipes", null, null, null, null, null, null, null, "cooking panel", 254, null);
        Pair a2 = du8.a("index", Integer.valueOf(i));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        destinationEventTracker.v(key, ribbonConfig, s42Var, new ue4(du8.a("block", t.m(a2, du8.a("label", lowerCase))), du8.a("card", t.f(du8.a("url", str2)))));
    }

    public final void C(Key key, ComponentActivity componentActivity) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        DestinationEventTracker destinationEventTracker = this.d;
        RibbonConfig ribbonConfig = RibbonConfig.COOKING;
        c58.b bVar = c58.b.a;
        destinationEventTracker.r(key, ribbonConfig, t63.c(bVar, t63.e(bVar, componentActivity != null ? componentActivity.getPackageManager() : null)));
    }

    public final void D(Key key, int i, String str, int i2, String str2, String str3) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(str, "blockLabel");
        zq3.h(str2, "cardContentUrl");
        DestinationEventTracker destinationEventTracker = this.d;
        RibbonConfig ribbonConfig = RibbonConfig.COOKING;
        s42 s42Var = new s42(null, null, null, null, null, null, null, null, "cooking panel", 255, null);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        destinationEventTracker.u(key, ribbonConfig, s42Var, new di0(new g90(lowerCase, null, null, Integer.valueOf(i), 2, null), new ai0(str3, str2, i2, null, null, 24, null), null, 4, null));
    }

    public final StateFlow t() {
        return this.h;
    }

    public final void u() {
        this.c.b(RibbonConfig.COOKING, c58.b.a);
    }

    public final boolean v() {
        return this.f.d(RibbonConfig.COOKING.getId());
    }

    public final void x(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        this.b.a(componentActivity, y25Var);
    }

    public final void z(CookingViewState cookingViewState, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new CookingViewModel$refreshCookingAssets$1(this, z, cookingViewState, null), 3, null);
    }
}
