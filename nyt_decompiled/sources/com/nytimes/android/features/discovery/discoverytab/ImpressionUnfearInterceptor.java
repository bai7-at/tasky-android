package com.nytimes.android.features.discovery.discoverytab;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.h;
import defpackage.cc7;
import defpackage.cz3;
import defpackage.dz3;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.j38;
import defpackage.kt2;
import defpackage.l34;
import defpackage.py1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class ImpressionUnfearInterceptor implements com.nytimes.android.unfear.core.composable.a {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final DiscoveryEventTracker a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ImpressionUnfearInterceptor(DiscoveryEventTracker discoveryEventTracker) {
        zq3.h(discoveryEventTracker, "discoveryEventTracker");
        this.a = discoveryEventTracker;
    }

    @Override // com.nytimes.android.unfear.core.composable.a
    public void a(final l34 l34Var, final Modifier modifier, final kt2 kt2Var, Composer composer, final int i) {
        Modifier modifier2;
        zq3.h(l34Var, "obj");
        zq3.h(modifier, "modifier");
        zq3.h(kt2Var, "drawer");
        Composer h = composer.h(-636739546);
        if (b.G()) {
            b.S(-636739546, i, -1, "com.nytimes.android.features.discovery.discoverytab.ImpressionUnfearInterceptor.Intercept (ImpressionUnfearInterceptor.kt:17)");
        }
        h.z(-601775088);
        if (l34Var instanceof j38) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            Flow onEach = FlowKt.onEach(this.a.f(), new ImpressionUnfearInterceptor$Intercept$extraModifier$1(ref$BooleanRef, this, l34Var, null));
            h.z(773894976);
            h.z(-492369756);
            Object A = h.A();
            if (A == Composer.a.a()) {
                e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
                h.q(eVar);
                A = eVar;
            }
            h.R();
            CoroutineScope a2 = ((e) A).a();
            h.R();
            FlowKt.launchIn(onEach, a2);
            modifier2 = h.a(Modifier.a, new ss2() { // from class: com.nytimes.android.features.discovery.discoverytab.ImpressionUnfearInterceptor$Intercept$extraModifier$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(cz3 cz3Var) {
                    DiscoveryEventTracker discoveryEventTracker;
                    zq3.h(cz3Var, "it");
                    if (!dz3.a(cz3Var, 0.5f)) {
                        Ref$BooleanRef.this.element = false;
                        return;
                    }
                    Ref$BooleanRef.this.element = true;
                    discoveryEventTracker = this.a;
                    discoveryEventTracker.j((j38) l34Var);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((cz3) obj);
                    return ww8.a;
                }
            });
        } else {
            modifier2 = Modifier.a;
        }
        h.R();
        kt2Var.invoke(l34Var, modifier.h(modifier2), h, Integer.valueOf((i & 896) | 8));
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.ImpressionUnfearInterceptor$Intercept$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ImpressionUnfearInterceptor.this.a(l34Var, modifier, kt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
