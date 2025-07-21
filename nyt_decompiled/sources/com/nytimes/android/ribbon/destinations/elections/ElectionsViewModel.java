package com.nytimes.android.ribbon.destinations.elections;

import androidx.lifecycle.q;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.mn1;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ElectionsViewModel extends q {
    public static final int c = DestinationTabState.g;
    private final DestinationTabState a;
    private final String b;

    public ElectionsViewModel(mn1 mn1Var, DestinationTabState destinationTabState) {
        zq3.h(mn1Var, "environmentHandler");
        zq3.h(destinationTabState, "tabState");
        this.a = destinationTabState;
        this.b = mn1Var.a() ? "https://www.stg.nytimes.com/panel/live/2024-election-guide" : "https://www.nytimes.com/panel/live/2024-election-guide";
    }

    public final String e() {
        return this.b;
    }

    public final boolean f() {
        return this.a.d(RibbonConfig.ELECTION.getId());
    }
}
