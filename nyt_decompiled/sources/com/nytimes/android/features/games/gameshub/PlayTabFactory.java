package com.nytimes.android.features.games.gameshub;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.c;
import com.nytimes.android.designsystem.uicompose.utils.LottieAnimationDetail;
import com.nytimes.android.features.games.gameshub.ui.PlayTabScreenKt;
import defpackage.by0;
import defpackage.cc7;
import defpackage.de4;
import defpackage.fc1;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hf8;
import defpackage.me6;
import defpackage.oj6;
import defpackage.rk6;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class PlayTabFactory implements de4 {
    public static final a Companion = new a(null);
    public static final int d = 8;
    private final PlayTabPreferencesStore a;
    private final hf8 b;
    private final String c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PlayTabFactory(PlayTabPreferencesStore playTabPreferencesStore) {
        zq3.h(playTabPreferencesStore, "playTabPreferencesStore");
        this.a = playTabPreferencesStore;
        this.b = new hf8(Integer.valueOf(me6.ic_play_tab), rk6.games_hub_tab_name, Integer.valueOf(rk6.play_test_tag), "play", new LottieAnimationDetail(new gt2() { // from class: com.nytimes.android.features.games.gameshub.PlayTabFactory$tabData$1
            public final c b(Composer composer, int i) {
                composer.z(-1667909136);
                if (b.G()) {
                    b.S(-1667909136, i, -1, "com.nytimes.android.features.games.gameshub.PlayTabFactory.tabData.<anonymous> (PlayTabFactory.kt:26)");
                }
                int b = c.a.b(oj6.lottie_play_tab);
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
        }, new PlayTabFactory$tabData$2(null)));
        this.c = "play tab";
    }

    @Override // defpackage.de4
    public void a(final fe4 fe4Var, Composer composer, final int i) {
        int i2;
        zq3.h(fe4Var, "mainTabState");
        Composer h = composer.h(1408112279);
        if ((i & 14) == 0) {
            i2 = (h.S(fe4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1408112279, i2, -1, "com.nytimes.android.features.games.gameshub.PlayTabFactory.Content (PlayTabFactory.kt:49)");
            }
            PlayTabScreenKt.c(fe4Var, false, null, null, h, fe4.h | (i2 & 14), 14);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.PlayTabFactory$Content$1
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
                    PlayTabFactory.this.a(fe4Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    @Override // defpackage.de4
    public Flow b() {
        final Flow b = this.a.b();
        return new Flow() { // from class: com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1

            /* renamed from: com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1$2", f = "PlayTabFactory.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                        boolean r0 = r6 instanceof com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1$2$1 r0 = (com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1$2$1 r0 = new com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4c
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        hv5 r5 = (defpackage.hv5) r5
                        boolean r5 = r5.a()
                        if (r5 == 0) goto L41
                        s25$a r5 = s25.a.a
                        goto L43
                    L41:
                        s25$b r5 = s25.b.a
                    L43:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L4c
                        return r1
                    L4c:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.PlayTabFactory$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    @Override // defpackage.de4
    public String c() {
        return this.c;
    }

    @Override // defpackage.de4
    public Object d(by0 by0Var) {
        return de4.a.c(this, by0Var);
    }

    @Override // defpackage.de4
    public boolean e(Uri uri) {
        zq3.h(uri, "uri");
        return (isEnabled() && zq3.c(g(uri), "nytimes://play")) || zq3.c(g(uri), "nytimes://reader/play");
    }

    @Override // defpackage.de4
    public hf8 f() {
        return this.b;
    }

    public String g(Uri uri) {
        return de4.a.a(this, uri);
    }

    @Override // defpackage.de4
    public boolean isEnabled() {
        return true;
    }
}
