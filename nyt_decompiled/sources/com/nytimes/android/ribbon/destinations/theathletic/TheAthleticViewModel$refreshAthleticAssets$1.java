package com.nytimes.android.ribbon.destinations.theathletic;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import defpackage.an3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ky3;
import defpackage.q29;
import defpackage.qs2;
import defpackage.r73;
import defpackage.rk8;
import defpackage.ss2;
import defpackage.w54;
import defpackage.ww8;
import defpackage.zq;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ribbon.destinations.theathletic.TheAthleticViewModel$refreshAthleticAssets$1", f = "TheAthleticViewModel.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TheAthleticViewModel$refreshAthleticAssets$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ rk8 $data;
    int label;
    final /* synthetic */ TheAthleticViewModel this$0;

    @fc1(c = "com.nytimes.android.ribbon.destinations.theathletic.TheAthleticViewModel$refreshAthleticAssets$1$2", f = "TheAthleticViewModel.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.ribbon.destinations.theathletic.TheAthleticViewModel$refreshAthleticAssets$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements ss2 {
        final /* synthetic */ rk8 $data;
        int label;
        final /* synthetic */ TheAthleticViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TheAthleticViewModel theAthleticViewModel, rk8 rk8Var, by0 by0Var) {
            super(1, by0Var);
            this.this$0 = theAthleticViewModel;
            this.$data = rk8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(by0 by0Var) {
            return new AnonymousClass2(this.this$0, this.$data, by0Var);
        }

        @Override // defpackage.ss2
        public final Object invoke(by0 by0Var) {
            return ((AnonymousClass2) create(by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DestinationAssetRepository destinationAssetRepository;
            ky3 ky3Var;
            String j;
            String k;
            String j2;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                destinationAssetRepository = this.this$0.a;
                boolean z = this.$data != null;
                this.label = 1;
                obj = destinationAssetRepository.l("section/sports", z, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            List list = (List) obj;
            Asset asset = (Asset) i.m0(list);
            zq zqVar = null;
            if (asset != null) {
                TheAthleticViewModel theAthleticViewModel = this.this$0;
                String safeUri = asset.getSafeUri();
                String url = asset.getUrl();
                String title = asset.getTitle();
                String str = title == null ? "" : title;
                String summary = asset.getSummary();
                String str2 = summary == null ? "" : summary;
                String a = q29.a(asset);
                j2 = theAthleticViewModel.j(asset);
                ky3Var = new ky3(str2, a, j2, safeUri, url, str);
            } else {
                ky3Var = null;
            }
            List<Asset> L0 = i.L0(list, new an3(1, 3));
            TheAthleticViewModel theAthleticViewModel2 = this.this$0;
            ArrayList arrayList = new ArrayList(i.w(L0, 10));
            for (Asset asset2 : L0) {
                String safeUri2 = asset2.getSafeUri();
                String url2 = asset2.getUrl();
                String title2 = asset2.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                k = theAthleticViewModel2.k(asset2);
                arrayList.add(new w54(k, safeUri2, url2, title2));
            }
            Asset asset3 = (Asset) i.n0(list, 4);
            if (asset3 != null) {
                TheAthleticViewModel theAthleticViewModel3 = this.this$0;
                String safeUri3 = asset3.getSafeUri();
                String url3 = asset3.getUrl();
                String title3 = asset3.getTitle();
                String str3 = title3 == null ? "" : title3;
                String a2 = q29.a(asset3);
                j = theAthleticViewModel3.j(asset3);
                zqVar = new zq(a2, j, safeUri3, url3, str3);
            }
            List<Asset> e0 = i.e0(list, 5);
            ArrayList arrayList2 = new ArrayList(i.w(e0, 10));
            for (Asset asset4 : e0) {
                String safeUri4 = asset4.getSafeUri();
                String url4 = asset4.getUrl();
                String title4 = asset4.getTitle();
                if (title4 == null) {
                    title4 = "";
                }
                arrayList2.add(new r73(safeUri4, url4, title4));
            }
            return new rk8(ky3Var, arrayList, zqVar, arrayList2);
        }
    }

    static final class a implements FlowCollector {
        final /* synthetic */ TheAthleticViewModel a;

        a(TheAthleticViewModel theAthleticViewModel) {
            this.a = theAthleticViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            MutableStateFlow mutableStateFlow;
            Object value;
            mutableStateFlow = this.a.f;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, downloadState));
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TheAthleticViewModel$refreshAthleticAssets$1(rk8 rk8Var, TheAthleticViewModel theAthleticViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$data = rk8Var;
        this.this$0 = theAthleticViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TheAthleticViewModel$refreshAthleticAssets$1(this.$data, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            DownloadState.Companion companion = DownloadState.Companion;
            final rk8 rk8Var = this.$data;
            Flow c = companion.c(new qs2() { // from class: com.nytimes.android.ribbon.destinations.theathletic.TheAthleticViewModel$refreshAthleticAssets$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final rk8 mo865invoke() {
                    return rk8.this;
                }
            }, new AnonymousClass2(this.this$0, this.$data, null));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (c.collect(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TheAthleticViewModel$refreshAthleticAssets$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
