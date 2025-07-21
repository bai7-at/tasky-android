package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.cs0;
import defpackage.cy4;
import defpackage.et0;
import defpackage.gt2;
import defpackage.h26;
import defpackage.it2;
import defpackage.ju7;
import defpackage.ow7;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.xr0;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Arrays;
import kotlin.text.h;

/* loaded from: classes.dex */
public final class PreviewActivity extends ComponentActivity {
    private final String a = "PreviewActivity";

    private final void y(String str) {
        Log.d(this.a, "PreviewActivity has composable " + str);
        final String a1 = h.a1(str, '.', null, 2, null);
        final String T0 = h.T0(str, '.', null, 2, null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            z(a1, T0, stringExtra);
            return;
        }
        Log.d(this.a, "Previewing '" + T0 + "' without a parameter provider.");
        tq0.b(this, null, zr0.c(-840626948, true, new gt2() { // from class: androidx.compose.ui.tooling.PreviewActivity$setComposableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
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
                if (b.G()) {
                    b.S(-840626948, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:76)");
                }
                xr0.a.g(a1, T0, composer, new Object[0]);
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
    }

    private final void z(final String str, final String str2, String str3) {
        Log.d(this.a, "Previewing '" + str2 + "' with parameter provider: '" + str3 + '\'');
        final Object[] b = h26.b(h26.a(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (b.length > 1) {
            tq0.b(this, null, zr0.c(-861939235, true, new gt2() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
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
                    if (b.G()) {
                        b.S(-861939235, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:109)");
                    }
                    composer.z(-492369756);
                    Object A = composer.A();
                    if (A == Composer.a.a()) {
                        A = ow7.a(0);
                        composer.q(A);
                    }
                    composer.R();
                    final cy4 cy4Var = (cy4) A;
                    final Object[] objArr = b;
                    yr0 b2 = zr0.b(composer, 958604965, true, new gt2() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.1
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
                            if (b.G()) {
                                b.S(958604965, i2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:123)");
                            }
                            gt2 a = ComposableSingletons$PreviewActivity_androidKt.a.a();
                            final cy4 cy4Var2 = cy4.this;
                            final Object[] objArr2 = objArr;
                            FloatingActionButtonKt.a(a, new qs2() { // from class: androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m101invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m101invoke() {
                                    cy4 cy4Var3 = cy4.this;
                                    cy4Var3.f((cy4Var3.d() + 1) % objArr2.length);
                                }
                            }, null, null, null, null, 0L, 0L, null, composer2, 6, 508);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    });
                    final String str4 = str;
                    final String str5 = str2;
                    final Object[] objArr2 = b;
                    ScaffoldKt.b(null, null, null, null, null, b2, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(composer, 57310875, true, new it2() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(ym5 ym5Var, Composer composer2, int i2) {
                            if ((i2 & 14) == 0) {
                                i2 |= composer2.S(ym5Var) ? 4 : 2;
                            }
                            if ((i2 & 91) == 18 && composer2.i()) {
                                composer2.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(57310875, i2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:113)");
                            }
                            Modifier h = PaddingKt.h(Modifier.a, ym5Var);
                            String str6 = str4;
                            String str7 = str5;
                            Object[] objArr3 = objArr2;
                            cy4 cy4Var2 = cy4Var;
                            composer2.z(733328855);
                            rg4 g = BoxKt.g(Alignment.a.o(), false, composer2, 0);
                            composer2.z(-1323940314);
                            int a = cs0.a(composer2, 0);
                            et0 o = composer2.o();
                            ComposeUiNode.Companion companion = ComposeUiNode.F;
                            qs2 a2 = companion.a();
                            it2 c = LayoutKt.c(h);
                            if (composer2.j() == null) {
                                cs0.c();
                            }
                            composer2.G();
                            if (composer2.f()) {
                                composer2.D(a2);
                            } else {
                                composer2.p();
                            }
                            Composer a3 = Updater.a(composer2);
                            Updater.c(a3, g, companion.e());
                            Updater.c(a3, o, companion.g());
                            gt2 b3 = companion.b();
                            if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                                a3.q(Integer.valueOf(a));
                                a3.v(Integer.valueOf(a), b3);
                            }
                            c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                            composer2.z(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                            xr0.a.g(str6, str7, composer2, objArr3[cy4Var2.d()]);
                            composer2.R();
                            composer2.t();
                            composer2.R();
                            composer2.R();
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer, 196608, 12582912, 131039);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), 1, null);
        } else {
            tq0.b(this, null, zr0.c(-1901447514, true, new gt2() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
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
                    if (b.G()) {
                        b.S(-1901447514, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:134)");
                    }
                    xr0 xr0Var = xr0.a;
                    String str4 = str;
                    String str5 = str2;
                    Object[] objArr = b;
                    xr0Var.g(str4, str5, composer, Arrays.copyOf(objArr, objArr.length));
                    if (b.G()) {
                        b.R();
                    }
                }
            }), 1, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.a, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        y(stringExtra);
    }
}
