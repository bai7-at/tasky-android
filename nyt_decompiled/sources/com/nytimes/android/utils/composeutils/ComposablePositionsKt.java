package com.nytimes.android.utils.composeutils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.snapshots.k;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import com.comscore.streaming.ContentType;
import com.facebook.AuthenticationTokenClaims;
import defpackage.as0;
import defpackage.bs0;
import defpackage.cc7;
import defpackage.cz3;
import defpackage.du1;
import defpackage.ez3;
import defpackage.fm1;
import defpackage.fu1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hn3;
import defpackage.it2;
import defpackage.kt2;
import defpackage.lh4;
import defpackage.m76;
import defpackage.ml3;
import defpackage.mt2;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class ComposablePositionsKt {
    private static final m76 a = CompositionLocalKt.d(null, new qs2() { // from class: com.nytimes.android.utils.composeutils.ComposablePositionsKt$LocalComposablePositions$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final bs0 mo865invoke() {
            throw new IllegalStateException("Provide a LocalComposablePositions or use a NytTheme {} - see [SampleComposablePositions]");
        }
    }, 1, null);

    public static final void a(final gt2 gt2Var, Composer composer, final int i) {
        zq3.h(gt2Var, "onNewMap");
        Composer h = composer.h(-1604494606);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1604494606, i, -1, "com.nytimes.android.utils.composeutils.LaunchedEffectOnComposablePositions (ComposablePositions.kt:107)");
        }
        py1.d(ww8.a, new ComposablePositionsKt$LaunchedEffectOnComposablePositions$1((bs0) h.m(a), gt2Var, null), h, 70);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.utils.composeutils.ComposablePositionsKt$LaunchedEffectOnComposablePositions$2
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
                    ComposablePositionsKt.a(gt2.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final m76 b() {
        return a;
    }

    public static final Modifier c(Modifier modifier, final String str, final mt2 mt2Var) {
        zq3.h(modifier, "<this>");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(mt2Var, "content");
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: com.nytimes.android.utils.composeutils.ComposablePositionsKt$shareComposablePosition$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), new it2() { // from class: com.nytimes.android.utils.composeutils.ComposablePositionsKt$shareComposablePosition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                zq3.h(modifier2, "$this$composed");
                composer.z(1941513371);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1941513371, i, -1, "com.nytimes.android.utils.composeutils.shareComposablePosition.<anonymous> (ComposablePositions.kt:82)");
                }
                final bs0 bs0Var = (bs0) composer.m(ComposablePositionsKt.b());
                final fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
                composer.z(1441067988);
                boolean S = composer.S(bs0Var) | composer.S(str) | composer.S(mt2Var) | composer.S(fm1Var);
                final String str2 = str;
                final mt2 mt2Var2 = mt2Var;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new ss2() { // from class: com.nytimes.android.utils.composeutils.ComposablePositionsKt$shareComposablePosition$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(final cz3 cz3Var) {
                            zq3.h(cz3Var, "it");
                            k a2 = bs0.this.a();
                            String str3 = str2;
                            long e = ez3.e(cz3Var);
                            long a3 = cz3Var.a();
                            final mt2 mt2Var3 = mt2Var2;
                            a2.put(str3, new as0(cz3Var, e, a3, zr0.c(-2043430450, true, new kt2() { // from class: com.nytimes.android.utils.composeutils.ComposablePositionsKt$shareComposablePosition$2$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                public final void b(Modifier modifier3, qs2 qs2Var, Composer composer2, int i2) {
                                    int i3;
                                    zq3.h(modifier3, "modifier");
                                    zq3.h(qs2Var, "onClick");
                                    if ((i2 & 14) == 0) {
                                        i3 = (composer2.S(modifier3) ? 4 : 2) | i2;
                                    } else {
                                        i3 = i2;
                                    }
                                    if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                        i3 |= composer2.C(qs2Var) ? 32 : 16;
                                    }
                                    if ((i3 & 731) == 146 && composer2.i()) {
                                        composer2.K();
                                        return;
                                    }
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.S(-2043430450, i3, -1, "com.nytimes.android.utils.composeutils.shareComposablePosition.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ComposablePositions.kt:90)");
                                    }
                                    Object m = composer2.m(CompositionLocalsKt.e());
                                    cz3 cz3Var2 = cz3Var;
                                    fm1 fm1Var2 = (fm1) m;
                                    mt2.this.invoke(modifier3, fu1.c(du1.b(fm1Var2.v(hn3.g(cz3Var2.a())), fm1Var2.v(hn3.f(cz3Var2.a())))), qs2Var, composer2, Integer.valueOf((i3 & 14) | ((i3 << 3) & 896)));
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.R();
                                    }
                                }

                                @Override // defpackage.kt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    b((Modifier) obj, (qs2) obj2, (Composer) obj3, ((Number) obj4).intValue());
                                    return ww8.a;
                                }
                            }), fm1Var, null));
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((cz3) obj);
                            return ww8.a;
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                Modifier a2 = h.a(modifier2, (ss2) A);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return a2;
            }
        });
    }

    public static /* synthetic */ Modifier d(Modifier modifier, String str, mt2 mt2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            mt2Var = ComposableSingletons$ComposablePositionsKt.a.a();
        }
        return c(modifier, str, mt2Var);
    }
}
