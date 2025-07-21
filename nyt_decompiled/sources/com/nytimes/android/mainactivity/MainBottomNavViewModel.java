package com.nytimes.android.mainactivity;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.if8;
import defpackage.zq3;
import defpackage.zx8;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class MainBottomNavViewModel extends q {
    private final FeedStore a;
    private final com.nytimes.android.entitlements.a b;
    private final if8 c;
    private final CoroutineDispatcher d;
    private final List e;
    private final MutableStateFlow f;

    public MainBottomNavViewModel(FeedStore feedStore, com.nytimes.android.entitlements.a aVar, if8 if8Var, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(feedStore, "feedStore");
        zq3.h(aVar, "eCommClient");
        zq3.h(if8Var, "tabFragmentProxy");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = feedStore;
        this.b = aVar;
        this.c = if8Var;
        this.d = coroutineDispatcher;
        this.e = if8Var.a();
        this.f = StateFlowKt.MutableStateFlow(if8Var.b());
    }

    public final void i() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new MainBottomNavViewModel$fetchFeed$1(this, null), 3, null);
    }

    public final List j() {
        return this.e;
    }

    public final MutableStateFlow k() {
        return this.f;
    }

    public final zx8 l() {
        List list = (List) this.f.getValue();
        List b = this.c.b();
        if (((List) this.f.getValue()).containsAll(b) && b.size() == ((List) this.f.getValue()).size()) {
            return new zx8(list, b, false);
        }
        this.f.setValue(b);
        return new zx8(list, b, true);
    }
}
