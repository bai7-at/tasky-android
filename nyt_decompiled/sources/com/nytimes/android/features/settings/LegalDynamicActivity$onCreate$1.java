package com.nytimes.android.features.settings;

import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.features.settings.legal.LegalUiKt;
import defpackage.gt2;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.u14;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class LegalDynamicActivity$onCreate$1 extends Lambda implements gt2 {
    final /* synthetic */ LegalDynamicActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDynamicActivity$onCreate$1(LegalDynamicActivity legalDynamicActivity) {
        super(2);
        this.this$0 = legalDynamicActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u14 c(x08 x08Var) {
        return (u14) x08Var.getValue();
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return ww8.a;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.i()) {
            composer.K();
            return;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1424026007, i, -1, "com.nytimes.android.features.settings.LegalDynamicActivity.onCreate.<anonymous> (LegalDynamicActivity.kt:38)");
        }
        final x08 b = y.b(this.this$0.O().getState(), null, composer, 8, 1);
        final LegalDynamicActivity legalDynamicActivity = this.this$0;
        NytThemeKt.a(false, null, null, zr0.b(composer, 1181762265, true, new gt2() { // from class: com.nytimes.android.features.settings.LegalDynamicActivity$onCreate$1.1
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
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1181762265, i2, -1, "com.nytimes.android.features.settings.LegalDynamicActivity.onCreate.<anonymous>.<anonymous> (LegalDynamicActivity.kt:41)");
                }
                Modifier c = WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, composer2, 8));
                gt2 b2 = ComposableSingletons$LegalDynamicActivityKt.a.b();
                final x08 x08Var = x08.this;
                final LegalDynamicActivity legalDynamicActivity2 = legalDynamicActivity;
                ScaffoldKt.b(c, null, b2, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(composer2, 1053543003, true, new it2() { // from class: com.nytimes.android.features.settings.LegalDynamicActivity.onCreate.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(ym5 ym5Var, Composer composer3, int i3) {
                        zq3.h(ym5Var, "paddingValues");
                        if ((i3 & 14) == 0) {
                            i3 |= composer3.S(ym5Var) ? 4 : 2;
                        }
                        if ((i3 & 91) == 18 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(1053543003, i3, -1, "com.nytimes.android.features.settings.LegalDynamicActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (LegalDynamicActivity.kt:50)");
                        }
                        u14 c2 = LegalDynamicActivity$onCreate$1.c(x08.this);
                        if (c2 instanceof u14.a) {
                            composer3.z(1907526148);
                            final LegalDynamicActivity legalDynamicActivity3 = legalDynamicActivity2;
                            LegalUiKt.a(ym5Var, new qs2() { // from class: com.nytimes.android.features.settings.LegalDynamicActivity.onCreate.1.1.1.1
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m424invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m424invoke() {
                                    LegalDynamicActivity.this.O().i();
                                }
                            }, composer3, i3 & 14, 0);
                            composer3.R();
                        } else if (c2 instanceof u14.b) {
                            composer3.z(1907526334);
                            LegalUiKt.c(ym5Var, composer3, i3 & 14);
                            composer3.R();
                        } else if (c2 instanceof u14.c) {
                            composer3.z(1907526401);
                            if (LegalDynamicActivity$onCreate$1.c(x08.this).a() == null) {
                                composer3.z(1907526455);
                                final LegalDynamicActivity legalDynamicActivity4 = legalDynamicActivity2;
                                LegalUiKt.a(ym5Var, new qs2() { // from class: com.nytimes.android.features.settings.LegalDynamicActivity.onCreate.1.1.1.2
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m425invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m425invoke() {
                                        LegalDynamicActivity.this.O().i();
                                    }
                                }, composer3, i3 & 14, 0);
                                composer3.R();
                            } else {
                                composer3.z(1907526578);
                                Object a = LegalDynamicActivity$onCreate$1.c(x08.this).a();
                                zq3.e(a);
                                final LegalDynamicActivity legalDynamicActivity5 = legalDynamicActivity2;
                                LegalUiKt.e(ym5Var, (Map) a, new ss2() { // from class: com.nytimes.android.features.settings.LegalDynamicActivity.onCreate.1.1.1.3
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((String) obj);
                                        return ww8.a;
                                    }

                                    public final void invoke(String str) {
                                        zq3.h(str, "url");
                                        LegalDynamicActivity.this.P().c(LegalDynamicActivity.this, str);
                                    }
                                }, composer3, (i3 & 14) | 64, 0);
                                composer3.R();
                            }
                            composer3.R();
                        } else {
                            composer3.z(1907526926);
                            composer3.R();
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer2, 384, 12582912, 131066);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), composer, 3078, 6);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
    }
}
