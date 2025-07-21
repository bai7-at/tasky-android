package com.nytimes.android.fragment.article;

import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nytimes.android.fragment.WebViewFragment;
import defpackage.e44;
import defpackage.hd3;
import defpackage.na3;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class HybridContentLoader implements na3 {
    private final hd3 a;
    private final WebViewFragment b;

    public HybridContentLoader(hd3 hd3Var, Fragment fragment) {
        zq3.h(hd3Var, "hybridPerformanceTracker");
        zq3.h(fragment, "genericFragment");
        this.a = hd3Var;
        this.b = (WebViewFragment) fragment;
    }

    @Override // defpackage.na3
    public void a() {
        SwipeRefreshLayout u1 = this.b.u1();
        if (u1 != null) {
            u1.setRefreshing(true);
        }
        BuildersKt__Builders_commonKt.launch$default(e44.a(this.b), null, null, new HybridContentLoader$reloadData$1(this, null), 3, null);
    }
}
