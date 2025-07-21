package com.nytimes.android.ribbon.destinations.lifestyle.appnative;

import androidx.lifecycle.q;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import defpackage.g44;
import defpackage.tr3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class LifestyleViewModel extends q {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final DestinationAssetRepository a;
    private final tr3 b;
    private final MutableStateFlow c;
    private final StateFlow d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LifestyleViewModel(DestinationAssetRepository destinationAssetRepository, tr3 tr3Var) {
        zq3.h(destinationAssetRepository, "store");
        zq3.h(tr3Var, "itemToDetailNavigator");
        this.a = destinationAssetRepository;
        this.b = tr3Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(g44.a());
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
    }
}
