package com.nytimes.android.section.asset;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.HasHybridProperties;
import com.nytimes.android.section.AssetNotFoundException;
import com.nytimes.android.section.asset.GraphQlAssetFetcher;
import defpackage.h07;
import defpackage.hb6;
import defpackage.ls;
import defpackage.rs;
import defpackage.ss2;
import defpackage.vi;
import defpackage.wd2;
import defpackage.ww8;
import defpackage.yj;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes4.dex */
public final class GraphQlAssetFetcher implements wd2 {
    private final ApolloClient a;
    private final ss2 b;
    private final ss2 c;
    private final rs d;
    private final ls e;
    private final h07 f;

    public GraphQlAssetFetcher(ApolloClient apolloClient, ss2 ss2Var, ss2 ss2Var2, rs rsVar, ls lsVar, h07 h07Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(ss2Var, "anyWorkFactory");
        zq3.h(ss2Var2, "anyWorksFactory");
        zq3.h(rsVar, "parser");
        zq3.h(lsVar, "assetIdentityTransformer");
        zq3.h(h07Var, "resourceRetriever");
        this.a = apolloClient;
        this.b = ss2Var;
        this.c = ss2Var2;
        this.d = rsVar;
        this.e = lsVar;
        this.f = h07Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource k(final Observable observable, final GraphQlAssetFetcher graphQlAssetFetcher) {
        zq3.h(observable, "$id");
        zq3.h(graphQlAssetFetcher, "this$0");
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.section.asset.GraphQlAssetFetcher$fetch$1$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ObservableSource invoke(String str) {
                ApolloClient apolloClient;
                ss2 ss2Var2;
                zq3.h(str, "id");
                apolloClient = GraphQlAssetFetcher.this.a;
                ss2Var2 = GraphQlAssetFetcher.this.b;
                return RxConvertKt.asObservable$default(apolloClient.L((hb6) ss2Var2.invoke(str)).d(), null, 1, null);
            }
        };
        Observable flatMap = observable.flatMap(new Function() { // from class: c23
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource l;
                l = GraphQlAssetFetcher.l(ss2.this, obj);
                return l;
            }
        });
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.section.asset.GraphQlAssetFetcher$fetch$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Asset invoke(yj yjVar) {
                vi.a a;
                rs rsVar;
                zq3.h(yjVar, "it");
                vi.c cVar = (vi.c) yjVar.c;
                if (cVar != null && (a = cVar.a()) != null) {
                    rsVar = graphQlAssetFetcher.d;
                    Asset a2 = rsVar.a(a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                throw new AssetNotFoundException("AnyWork query returned null for uri=" + Observable.this, null, 2, null);
            }
        };
        return flatMap.map(new Function() { // from class: d23
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Asset m;
                m = GraphQlAssetFetcher.m(ss2.this, obj);
                return m;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource l(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (ObservableSource) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Asset m(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (Asset) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Asset asset) {
        if (asset instanceof HasHybridProperties) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new GraphQlAssetFetcher$fetchHybridResources$1(this, asset, null), 2, null);
        }
    }

    @Override // defpackage.wd2
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Single fetch(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        final Observable c = this.e.c(str);
        Single firstOrError = Observable.defer(new Callable() { // from class: a23
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ObservableSource k;
                k = GraphQlAssetFetcher.k(Observable.this, this);
                return k;
            }
        }).firstOrError();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.section.asset.GraphQlAssetFetcher$fetch$2
            {
                super(1);
            }

            public final void b(Asset asset) {
                GraphQlAssetFetcher graphQlAssetFetcher = GraphQlAssetFetcher.this;
                zq3.e(asset);
                graphQlAssetFetcher.o(asset);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Asset) obj);
                return ww8.a;
            }
        };
        Single doOnSuccess = firstOrError.doOnSuccess(new Consumer() { // from class: b23
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GraphQlAssetFetcher.n(ss2.this, obj);
            }
        });
        zq3.g(doOnSuccess, "doOnSuccess(...)");
        return doOnSuccess;
    }
}
