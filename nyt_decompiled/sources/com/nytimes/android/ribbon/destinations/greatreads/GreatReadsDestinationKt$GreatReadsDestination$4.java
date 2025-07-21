package com.nytimes.android.ribbon.destinations.greatreads;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.et2.Key;
import defpackage.f33;
import defpackage.fm9;
import defpackage.gt2;
import defpackage.i33;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class GreatReadsDestinationKt$GreatReadsDestination$4 extends Lambda implements it2 {
    final /* synthetic */ ComponentActivity $activity;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ fm9 $tracker;
    final /* synthetic */ GreatReadsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GreatReadsDestinationKt$GreatReadsDestination$4(fm9 fm9Var, Modifier modifier, LazyListState lazyListState, GreatReadsViewModel greatReadsViewModel, ComponentActivity componentActivity) {
        super(3);
        this.$tracker = fm9Var;
        this.$modifier = modifier;
        this.$listState = lazyListState;
        this.$viewModel = greatReadsViewModel;
        this.$activity = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(GreatReadsViewModel greatReadsViewModel, Key key, int i, String str, String str2, Map map) {
        greatReadsViewModel.n(key, i, str, str2, map);
    }

    public final void c(i33 i33Var, Composer composer, int i) {
        zq3.h(i33Var, "viewState");
        if (b.G()) {
            b.S(-1374180877, i, -1, "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsDestination.<anonymous> (GreatReadsDestination.kt:51)");
        }
        fm9 fm9Var = this.$tracker;
        if (fm9Var != null) {
            fm9Var.m(RibbonConfig.GREAT_READS.getId());
        }
        final List a = i33Var.a();
        final GreatReadsViewModel greatReadsViewModel = this.$viewModel;
        final ComponentActivity componentActivity = this.$activity;
        final gt2 gt2Var = new gt2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsDestinationKt$GreatReadsDestination$4$onClickItem$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(int i2, GreatReadsLockupData greatReadsLockupData) {
                zq3.h(greatReadsLockupData, "item");
                GreatReadsViewModel.this.j(componentActivity, f33.b(greatReadsLockupData, i2));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b(((Number) obj).intValue(), (GreatReadsLockupData) obj2);
                return ww8.a;
            }
        };
        final GreatReadsViewModel greatReadsViewModel2 = this.$viewModel;
        final ComponentActivity componentActivity2 = this.$activity;
        final qs2 qs2Var = new qs2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsDestinationKt$GreatReadsDestination$4$onFooterClick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m704invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m704invoke() {
                GreatReadsViewModel.this.j(componentActivity2, f33.a());
            }
        };
        Modifier f = SizeKt.f(this.$modifier, 0.0f, 1, null);
        final LazyListState lazyListState = this.$listState;
        final GreatReadsViewModel greatReadsViewModel3 = this.$viewModel;
        LazyDslKt.a(f, lazyListState, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsDestinationKt$GreatReadsDestination$4.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LazyListScope) obj);
                return ww8.a;
            }

            public final void invoke(LazyListScope lazyListScope) {
                zq3.h(lazyListScope, "$this$LazyColumn");
                LazyListState lazyListState2 = LazyListState.this;
                List<GreatReadsLockupData> list = a;
                final GreatReadsViewModel greatReadsViewModel4 = greatReadsViewModel3;
                qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsDestinationKt.GreatReadsDestination.4.1.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        return Boolean.valueOf(GreatReadsViewModel.this.i());
                    }
                };
                gt2 gt2Var2 = gt2Var;
                final GreatReadsViewModel greatReadsViewModel5 = greatReadsViewModel3;
                GreatReadsLockupsKt.c(lazyListScope, lazyListState2, list, qs2Var2, gt2Var2, new it2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsDestinationKt.GreatReadsDestination.4.1.2
                    {
                        super(3);
                    }

                    public final void b(Key key, int i2, GreatReadsLockupData greatReadsLockupData) {
                        zq3.h(key, TransferTable.COLUMN_KEY);
                        zq3.h(greatReadsLockupData, "data");
                        GreatReadsViewModel greatReadsViewModel6 = GreatReadsViewModel.this;
                        String d = greatReadsLockupData.d();
                        String str = d == null ? "" : d;
                        String c = greatReadsLockupData.c();
                        GreatReadsDestinationKt$GreatReadsDestination$4.d(greatReadsViewModel6, key, i2, str, c == null ? "" : c, greatReadsLockupData.i());
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((Key) obj, ((Number) obj2).intValue(), (GreatReadsLockupData) obj3);
                        return ww8.a;
                    }
                });
                LazyListState lazyListState3 = LazyListState.this;
                final GreatReadsViewModel greatReadsViewModel6 = greatReadsViewModel3;
                qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsDestinationKt.GreatReadsDestination.4.1.3
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        return Boolean.valueOf(GreatReadsViewModel.this.i());
                    }
                };
                final GreatReadsViewModel greatReadsViewModel7 = greatReadsViewModel3;
                GreatReadsLockupsKt.d(lazyListScope, lazyListState3, qs2Var3, new ss2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsDestinationKt.GreatReadsDestination.4.1.4
                    {
                        super(1);
                    }

                    public final void b(Key key) {
                        zq3.h(key, TransferTable.COLUMN_KEY);
                        GreatReadsViewModel.this.m(key);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Key) obj);
                        return ww8.a;
                    }
                }, qs2Var);
            }
        }, composer, 0, 252);
        if (b.G()) {
            b.R();
        }
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        c((i33) obj, (Composer) obj2, ((Number) obj3).intValue());
        return ww8.a;
    }
}
