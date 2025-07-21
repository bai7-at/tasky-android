package com.nytimes.android.ribbon.destinations.wirecutter;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.config.model.RibbonTabEndpoint;
import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.an3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fi9;
import defpackage.gi9;
import defpackage.gt2;
import defpackage.ji9;
import defpackage.ss2;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1", f = "WirecutterViewModel.kt", l = {69, 71, 79, 96}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WirecutterViewModel$refreshWirecutterAssets$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ji9 $data;
    int label;
    final /* synthetic */ WirecutterViewModel this$0;

    @fc1(c = "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1$2", f = "WirecutterViewModel.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements ss2 {
        final /* synthetic */ List<Pair<Asset, Map<String, String>>> $assetsAndAlgos;
        int label;
        final /* synthetic */ WirecutterViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(WirecutterViewModel wirecutterViewModel, List list, by0 by0Var) {
            super(1, by0Var);
            this.this$0 = wirecutterViewModel;
            this.$assetsAndAlgos = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(by0 by0Var) {
            return new AnonymousClass2(this.this$0, this.$assetsAndAlgos, by0Var);
        }

        @Override // defpackage.ss2
        public final Object invoke(by0 by0Var) {
            return ((AnonymousClass2) create(by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                WirecutterViewModel wirecutterViewModel = this.this$0;
                this.label = 1;
                obj = wirecutterViewModel.n(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            fi9 fi9Var = (fi9) obj;
            List P0 = i.P0(this.$assetsAndAlgos, 4);
            List L0 = i.L0(this.$assetsAndAlgos, new an3(4, 6));
            List<Pair> list = P0;
            ArrayList arrayList = new ArrayList(i.w(list, 10));
            for (Pair pair : list) {
                arrayList.add(gi9.b((Asset) pair.c(), (Map) pair.d()));
            }
            List<Pair> list2 = L0;
            ArrayList arrayList2 = new ArrayList(i.w(list2, 10));
            for (Pair pair2 : list2) {
                arrayList2.add(gi9.b((Asset) pair2.c(), (Map) pair2.d()));
            }
            return new ji9(arrayList, arrayList2, fi9Var);
        }
    }

    static final class a implements FlowCollector {
        final /* synthetic */ WirecutterViewModel a;

        a(WirecutterViewModel wirecutterViewModel) {
            this.a = wirecutterViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            MutableStateFlow mutableStateFlow;
            Object value;
            mutableStateFlow = this.a.h;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, downloadState));
            return ww8.a;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RibbonTabEndpoint.values().length];
            try {
                iArr[RibbonTabEndpoint.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RibbonTabEndpoint.PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WirecutterViewModel$refreshWirecutterAssets$1(WirecutterViewModel wirecutterViewModel, ji9 ji9Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = wirecutterViewModel;
        this.$data = ji9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new WirecutterViewModel$refreshWirecutterAssets$1(this.this$0, this.$data, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r14.label
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            kotlin.f.b(r15)
            goto Lc5
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L22:
            kotlin.f.b(r15)
            goto L9f
        L27:
            kotlin.f.b(r15)
            goto L7f
        L2b:
            kotlin.f.b(r15)
            goto L3d
        L2f:
            kotlin.f.b(r15)
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel r15 = r14.this$0
            r14.label = r6
            java.lang.Object r15 = com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel.m(r15, r14)
            if (r15 != r0) goto L3d
            return r0
        L3d:
            com.nytimes.android.api.config.model.RibbonConfigDTO r15 = (com.nytimes.android.api.config.model.RibbonConfigDTO) r15
            if (r15 == 0) goto L46
            com.nytimes.android.api.config.model.RibbonTabEndpoint r15 = r15.getEndpoint()
            goto L47
        L46:
            r15 = r2
        L47:
            r1 = -1
            if (r15 != 0) goto L4c
            r15 = r1
            goto L54
        L4c:
            int[] r7 = com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1.b.a
            int r15 = r15.ordinal()
            r15 = r7[r15]
        L54:
            r7 = 0
            if (r15 == r1) goto L82
            if (r15 == r6) goto L62
            if (r15 != r5) goto L5c
            goto L82
        L5c:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L62:
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel r15 = r14.this$0
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository r8 = com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel.g(r15)
            com.nytimes.android.api.cms.SectionQueryType r11 = com.nytimes.android.api.cms.SectionQueryType.GENERIC_LEGACY_COLLECTION
            ji9 r15 = r14.$data
            if (r15 == 0) goto L70
            r12 = r6
            goto L71
        L70:
            r12 = r7
        L71:
            r14.label = r5
            java.lang.String r9 = "home-packages-wirecutter"
            java.lang.String r10 = "nyt://per/personalized-list/home-packages-wirecutter"
            r13 = r14
            java.lang.Object r15 = r8.j(r9, r10, r11, r12, r13)
            if (r15 != r0) goto L7f
            return r0
        L7f:
            java.util.List r15 = (java.util.List) r15
            goto La1
        L82:
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel r15 = r14.this$0
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository r8 = com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel.g(r15)
            com.nytimes.android.api.cms.SectionQueryType r11 = com.nytimes.android.api.cms.SectionQueryType.LEGACY_COLLECTION
            ji9 r15 = r14.$data
            if (r15 == 0) goto L90
            r12 = r6
            goto L91
        L90:
            r12 = r7
        L91:
            r14.label = r4
            java.lang.String r9 = "home-packages-wirecutter"
            java.lang.String r10 = "nyt://per/personalized-list/home-packages-wirecutter"
            r13 = r14
            java.lang.Object r15 = r8.j(r9, r10, r11, r12, r13)
            if (r15 != r0) goto L9f
            return r0
        L9f:
            java.util.List r15 = (java.util.List) r15
        La1:
            com.nytimes.android.coroutinesutils.DownloadState$Companion r1 = com.nytimes.android.coroutinesutils.DownloadState.Companion
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1$1 r4 = new com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1$1
            ji9 r5 = r14.$data
            r4.<init>()
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1$2 r5 = new com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1$2
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel r6 = r14.this$0
            r5.<init>(r6, r15, r2)
            kotlinx.coroutines.flow.Flow r15 = r1.c(r4, r5)
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1$a r1 = new com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1$a
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel r2 = r14.this$0
            r1.<init>(r2)
            r14.label = r3
            java.lang.Object r14 = r15.collect(r1, r14)
            if (r14 != r0) goto Lc5
            return r0
        Lc5:
            ww8 r14 = defpackage.ww8.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$refreshWirecutterAssets$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((WirecutterViewModel$refreshWirecutterAssets$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
