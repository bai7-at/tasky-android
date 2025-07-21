package com.nytimes.android.textsize;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.font.FontScale;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.c04;
import defpackage.ce5;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class TextSizeActivity extends com.nytimes.android.textsize.a {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private final c04 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context) {
            zq3.h(context, "context");
            return new Intent(context, (Class<?>) TextSizeActivity.class);
        }

        private a() {
        }
    }

    public static final class b extends ce5 {
        b() {
            super(true);
        }

        @Override // defpackage.ce5
        public void handleOnBackPressed() {
            if (isEnabled()) {
                setEnabled(false);
                TextSizeActivity.this.Q().l();
                TextSizeActivity.this.getOnBackPressedDispatcher().l();
            }
        }
    }

    public TextSizeActivity() {
        final qs2 qs2Var = null;
        this.e = new s(zt6.b(TextSizeViewModel.class), new qs2() { // from class: com.nytimes.android.textsize.TextSizeActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.textsize.TextSizeActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.textsize.TextSizeActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
    }

    private final void P() {
        getOnBackPressedDispatcher().h(this, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextSizeViewModel Q() {
        return (TextSizeViewModel) this.e.getValue();
    }

    @Override // com.nytimes.android.textsize.a, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        P();
        Q().j();
        tq0.b(this, null, zr0.c(-319288491, true, new gt2() { // from class: com.nytimes.android.textsize.TextSizeActivity$onCreate$1
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
                    b.S(-319288491, i, -1, "com.nytimes.android.textsize.TextSizeActivity.onCreate.<anonymous> (TextSizeActivity.kt:45)");
                }
                final TextSizeActivity textSizeActivity = TextSizeActivity.this;
                NytThemeKt.a(false, null, null, zr0.b(composer, 32813285, true, new gt2() { // from class: com.nytimes.android.textsize.TextSizeActivity$onCreate$1.1
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
                            b.S(32813285, i2, -1, "com.nytimes.android.textsize.TextSizeActivity.onCreate.<anonymous>.<anonymous> (TextSizeActivity.kt:46)");
                        }
                        final TextSizeActivity textSizeActivity2 = TextSizeActivity.this;
                        yr0 b2 = zr0.b(composer2, 458431736, true, new gt2() { // from class: com.nytimes.android.textsize.TextSizeActivity.onCreate.1.1.1
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 11) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(458431736, i3, -1, "com.nytimes.android.textsize.TextSizeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (TextSizeActivity.kt:48)");
                                }
                                long d = eb5.Companion.a(composer3, 8).d();
                                gt2 a2 = ComposableSingletons$TextSizeActivityKt.a.a();
                                final TextSizeActivity textSizeActivity3 = TextSizeActivity.this;
                                AppBarKt.d(a2, null, zr0.b(composer3, 656086974, true, new gt2() { // from class: com.nytimes.android.textsize.TextSizeActivity.onCreate.1.1.1.1
                                    {
                                        super(2);
                                    }

                                    @Override // defpackage.gt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(Composer composer4, int i4) {
                                        if ((i4 & 11) == 2 && composer4.i()) {
                                            composer4.K();
                                            return;
                                        }
                                        if (b.G()) {
                                            b.S(656086974, i4, -1, "com.nytimes.android.textsize.TextSizeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextSizeActivity.kt:50)");
                                        }
                                        final TextSizeActivity textSizeActivity4 = TextSizeActivity.this;
                                        IconButtonKt.a(new qs2() { // from class: com.nytimes.android.textsize.TextSizeActivity.onCreate.1.1.1.1.1
                                            {
                                                super(0);
                                            }

                                            @Override // defpackage.qs2
                                            /* renamed from: invoke */
                                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                m759invoke();
                                                return ww8.a;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m759invoke() {
                                                TextSizeActivity.this.getOnBackPressedDispatcher().l();
                                            }
                                        }, null, false, null, ComposableSingletons$TextSizeActivityKt.a.b(), composer4, 24576, 14);
                                        if (b.G()) {
                                            b.R();
                                        }
                                    }
                                }), null, d, 0L, 0.0f, composer3, 390, 106);
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        });
                        gt2 c = ComposableSingletons$TextSizeActivityKt.a.c();
                        final TextSizeActivity textSizeActivity3 = TextSizeActivity.this;
                        NytScaffoldKt.a(null, b2, null, 0.0f, c, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, null, null, zr0.b(composer2, -683401434, true, new it2() { // from class: com.nytimes.android.textsize.TextSizeActivity.onCreate.1.1.2
                            {
                                super(3);
                            }

                            private static final FontScale b(x08 x08Var) {
                                return (FontScale) x08Var.getValue();
                            }

                            private static final boolean c(x08 x08Var) {
                                return ((Boolean) x08Var.getValue()).booleanValue();
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }

                            public final void invoke(ym5 ym5Var, Composer composer3, int i3) {
                                zq3.h(ym5Var, "it");
                                if ((i3 & 81) == 16 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(-683401434, i3, -1, "com.nytimes.android.textsize.TextSizeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (TextSizeActivity.kt:60)");
                                }
                                Modifier.a aVar = Modifier.a;
                                Modifier k = PaddingKt.k(ScrollKt.f(aVar, ScrollKt.c(0, composer3, 0, 1), false, null, false, 14, null), bu1.g(20), 0.0f, 2, null);
                                final TextSizeActivity textSizeActivity4 = TextSizeActivity.this;
                                composer3.z(-483455358);
                                rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                                composer3.z(-1323940314);
                                int a3 = cs0.a(composer3, 0);
                                et0 o = composer3.o();
                                ComposeUiNode.Companion companion = ComposeUiNode.F;
                                qs2 a4 = companion.a();
                                it2 c2 = LayoutKt.c(k);
                                if (composer3.j() == null) {
                                    cs0.c();
                                }
                                composer3.G();
                                if (composer3.f()) {
                                    composer3.D(a4);
                                } else {
                                    composer3.p();
                                }
                                Composer a5 = Updater.a(composer3);
                                Updater.c(a5, a2, companion.e());
                                Updater.c(a5, o, companion.g());
                                gt2 b3 = companion.b();
                                if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                                    a5.q(Integer.valueOf(a3));
                                    a5.v(Integer.valueOf(a3), b3);
                                }
                                c2.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                                composer3.z(2058660585);
                                ap0 ap0Var = ap0.a;
                                TextSizeComposablesKt.f(textSizeActivity4.Q().f(), b(y.b(textSizeActivity4.Q().g(), null, composer3, 8, 1)), new ss2() { // from class: com.nytimes.android.textsize.TextSizeActivity$onCreate$1$1$2$1$1
                                    {
                                        super(1);
                                    }

                                    public final void b(FontScale fontScale) {
                                        zq3.h(fontScale, "it");
                                        TextSizeActivity.this.Q().k(fontScale);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        b((FontScale) obj);
                                        return ww8.a;
                                    }
                                }, c(y.b(textSizeActivity4.Q().i(), null, composer3, 8, 1)), new ss2() { // from class: com.nytimes.android.textsize.TextSizeActivity$onCreate$1$1$2$1$2
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke(((Boolean) obj).booleanValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(boolean z) {
                                        TextSizeActivity.this.Q().m(z);
                                    }
                                }, PaddingKt.k(aVar, 0.0f, bu1.g(40), 1, null), composer3, 196616, 0);
                                TextSizeComposablesKt.e(null, composer3, 0, 1);
                                composer3.R();
                                composer3.t();
                                composer3.R();
                                composer3.R();
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        }), composer2, 24624, 0, 6, 1048557);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer, 3072, 7);
                if (b.G()) {
                    b.R();
                }
            }
        }), 1, null);
    }
}
