package com.nytimes.android.features.discovery.discoverytab;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.airbnb.lottie.compose.c;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt;
import com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsRepository;
import defpackage.b04;
import defpackage.by0;
import defpackage.cb2;
import defpackage.cc7;
import defpackage.de4;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hf8;
import defpackage.le6;
import defpackage.nj6;
import defpackage.qk6;
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class DiscoveryTabFactory implements de4 {
    private final b04 a;
    private final cb2 b;
    private final hf8 c;
    private final String d;

    static final class a implements FlowCollector {
        public static final a a = new a();

        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            return ww8.a;
        }
    }

    public DiscoveryTabFactory(b04 b04Var, cb2 cb2Var) {
        zq3.h(b04Var, "sectionCarouselsRepository");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = b04Var;
        this.b = cb2Var;
        this.c = new hf8(Integer.valueOf(le6.ic_browse), qk6.browse_tab_name, Integer.valueOf(qk6.browse_accessibility), "discovery", new LottieAnimationDetail(new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.DiscoveryTabFactory$tabData$1
            public final c b(Composer composer, int i) {
                composer.z(-1564254386);
                if (b.G()) {
                    b.S(-1564254386, i, -1, "com.nytimes.android.features.discovery.discoverytab.DiscoveryTabFactory.tabData.<anonymous> (DiscoveryTabFactory.kt:31)");
                }
                int b = c.a.b(nj6.lottie_sections_tab);
                if (b.G()) {
                    b.R();
                }
                composer.R();
                return c.a.a(b);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((Composer) obj, ((Number) obj2).intValue());
            }
        }, new DiscoveryTabFactory$tabData$2(null)));
        this.d = "section tab";
    }

    @Override // defpackage.de4
    public void a(final fe4 fe4Var, Composer composer, final int i) {
        int i2;
        zq3.h(fe4Var, "mainTabState");
        Composer h = composer.h(-1721597899);
        if ((i & 14) == 0) {
            i2 = (h.S(fe4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1721597899, i2, -1, "com.nytimes.android.features.discovery.discoverytab.DiscoveryTabFactory.Content (DiscoveryTabFactory.kt:51)");
            }
            ET2CoroutineScopeKt.e(null, new DiscoveryTabFactory$Content$1(null), h, 64, 1);
            DiscoveryScreenKt.a(fe4Var, null, null, h, fe4.h | (i2 & 14), 6);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.DiscoveryTabFactory$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DiscoveryTabFactory.this.a(fe4Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    @Override // defpackage.de4
    public Flow b() {
        return de4.a.b(this);
    }

    @Override // defpackage.de4
    public String c() {
        return this.d;
    }

    @Override // defpackage.de4
    public Object d(by0 by0Var) {
        Object collect = ((SectionCarouselsRepository) this.a.get()).b(ParallelDownloadStrategy.FETCH_ALWAYS, DiscoverySectionsUseCase.Companion.a()).collect(a.a, by0Var);
        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
    }

    @Override // defpackage.de4
    public boolean e(Uri uri) {
        zq3.h(uri, "uri");
        return isEnabled() && zq3.c(g(uri), "nytimes://reader/sections");
    }

    @Override // defpackage.de4
    public hf8 f() {
        return this.c;
    }

    public String g(Uri uri) {
        return de4.a.a(this, uri);
    }

    @Override // defpackage.de4
    public boolean isEnabled() {
        return !this.b.F();
    }
}
