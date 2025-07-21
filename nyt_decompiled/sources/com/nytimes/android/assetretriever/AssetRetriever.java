package com.nytimes.android.assetretriever;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.b04;
import defpackage.by0;
import defpackage.c04;
import defpackage.et;
import defpackage.fc1;
import defpackage.h07;
import defpackage.pt;
import defpackage.qs2;
import defpackage.st;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Single;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.rx2.RxSingleKt;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class AssetRetriever {
    public static final a Companion = new a(null);
    private final b04 a;
    private final b04 b;
    private final h07 c;
    private final b04 d;
    private final CoroutineDispatcher e;
    private final NYTUser f;
    private final c04 g;
    private final c04 h;
    private final c04 i;
    private final CoroutineScope j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AssetRetriever(b04 b04Var, b04 b04Var2, h07 h07Var, b04 b04Var3, CoroutineDispatcher coroutineDispatcher, NYTUser nYTUser) {
        zq3.h(b04Var, "lazyRepository");
        zq3.h(b04Var2, "lazyAssetDownloader");
        zq3.h(h07Var, "resourceRetriever");
        zq3.h(b04Var3, "lazyAssetRetrieverWorkerScheduler");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(nYTUser, "nytUser");
        this.a = b04Var;
        this.b = b04Var2;
        this.c = h07Var;
        this.d = b04Var3;
        this.e = coroutineDispatcher;
        this.f = nYTUser;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: com.nytimes.android.assetretriever.AssetRetriever$repository$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h mo865invoke() {
                b04 b04Var4;
                b04Var4 = AssetRetriever.this.a;
                return (h) b04Var4.get();
            }
        });
        this.h = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: com.nytimes.android.assetretriever.AssetRetriever$assetDownloader$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AssetDownloader mo865invoke() {
                b04 b04Var4;
                b04Var4 = AssetRetriever.this.b;
                return (AssetDownloader) b04Var4.get();
            }
        });
        this.i = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: com.nytimes.android.assetretriever.AssetRetriever$assetRetrieverWorkerScheduler$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final pt mo865invoke() {
                b04 b04Var4;
                b04Var4 = AssetRetriever.this.d;
                return (pt) b04Var4.get();
            }
        });
        this.j = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        h();
    }

    private final void h() {
        final SharedFlow h = this.f.h();
        FlowKt.launchIn(FlowKt.onEach(new Flow() { // from class: com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1

            /* renamed from: com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1$2", f = "AssetRetriever.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        boolean r0 = r6 instanceof com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1$2$1 r0 = (com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1$2$1 r0 = new com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r6 = (com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType) r6
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r2 = com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType.LOGIN_STATUS_CHANGED
                        if (r6 == r2) goto L41
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r2 = com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType.LOGIN_STATUS_AND_ENTITLEMENTS_CHANGED
                        if (r6 != r2) goto L4a
                    L41:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L4a
                        return r1
                    L4a:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.assetretriever.AssetRetriever$clearOnLoginChanged$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, new AssetRetriever$clearOnLoginChanged$2(this, null)), this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetDownloader k() {
        return (AssetDownloader) this.h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pt l() {
        return (pt) this.i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h m() {
        return (h) this.g.getValue();
    }

    public final Object i(e eVar, String str, by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.e, new AssetRetriever$deleteAssetSourceOfType$2(this, eVar, str, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    public final Object j(String str, long j, by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.e, new AssetRetriever$deleteAssetSourcesWithOldId$2(this, str, j, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    public final Object n(List list, st stVar, st[] stVarArr, by0 by0Var) {
        NYTLogger.d("Prefetching " + list.size() + " assets", new Object[0]);
        List G0 = kotlin.collections.i.G0(kotlin.collections.d.C0(stVarArr), stVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            m().r((et) it2.next(), G0);
        }
        Object b = l().b(by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    public final Object o(e eVar, Instant instant, st[] stVarArr, by0 by0Var) {
        return BuildersKt.withContext(this.e, new AssetRetriever$retrieveAsset$2(stVarArr, this, eVar, instant, null), by0Var);
    }

    public final Single p(e eVar, Instant instant, st... stVarArr) {
        zq3.h(eVar, "assetIdentifier");
        zq3.h(stVarArr, "sources");
        return RxSingleKt.rxSingle$default(null, new AssetRetriever$retrieveAssetAsSingle$1(this, eVar, instant, stVarArr, null), 1, null);
    }

    public final Object q(List list, st stVar, st[] stVarArr, by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.e, new AssetRetriever$saveAssets$2(stVarArr, stVar, list, this, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }
}
