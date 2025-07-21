package com.nytimes.android.recentlyviewed;

import androidx.paging.PagedList;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.c28;
import defpackage.d44;
import defpackage.ei1;
import defpackage.os6;
import defpackage.qq3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr6;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.rxkotlin.SubscribersKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class RecentlyViewingFetchingProxy implements ei1 {
    public static final a Companion = new a(null);
    private final zr6 a;
    private final os6 b;
    private final qq3 c;
    private final CompositeDisposable d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RecentlyViewingFetchingProxy a(d44 d44Var, os6 os6Var, qq3 qq3Var) {
            zq3.h(d44Var, "host");
            zq3.h(os6Var, "manager");
            zq3.h(qq3Var, "internalPreferences");
            RecentlyViewingFetchingProxy recentlyViewingFetchingProxy = new RecentlyViewingFetchingProxy((zr6) d44Var, os6Var, qq3Var);
            d44Var.getLifecycle().a(recentlyViewingFetchingProxy);
            return recentlyViewingFetchingProxy;
        }

        private a() {
        }
    }

    public RecentlyViewingFetchingProxy(zr6 zr6Var, os6 os6Var, qq3 qq3Var) {
        zq3.h(zr6Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        zq3.h(os6Var, "manager");
        zq3.h(qq3Var, "internalPreferences");
        this.a = zr6Var;
        this.b = os6Var;
        this.c = qq3Var;
        this.d = new CompositeDisposable();
    }

    public final void b() {
        c28.a(this.d, SubscribersKt.subscribeBy$default(this.b.b(this.c.b()), new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewingFetchingProxy$fetchRecentlyViewedAssets$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zr6 zr6Var;
                zq3.h(th, QueryKeys.TOKEN);
                zr6Var = RecentlyViewingFetchingProxy.this.a;
                zr6Var.s(th);
            }
        }, (qs2) null, new ss2() { // from class: com.nytimes.android.recentlyviewed.RecentlyViewingFetchingProxy$fetchRecentlyViewedAssets$2
            {
                super(1);
            }

            public final void b(PagedList pagedList) {
                zr6 zr6Var;
                zq3.h(pagedList, "assets");
                zr6Var = RecentlyViewingFetchingProxy.this.a;
                zr6Var.d0(pagedList);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((PagedList) obj);
                return ww8.a;
            }
        }, 2, (Object) null));
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.d.clear();
    }
}
