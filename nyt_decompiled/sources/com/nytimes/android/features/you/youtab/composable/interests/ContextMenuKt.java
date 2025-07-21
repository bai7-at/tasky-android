package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.rx0;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.yr0;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ContextMenuKt {
    public static final void a(final List list, final qs2 qs2Var, Modifier modifier, Alignment alignment, Composer composer, final int i, final int i2) {
        zq3.h(list, "menuItems");
        zq3.h(qs2Var, "onKebabMenuInteraction");
        Composer h = composer.h(-1716798859);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        Alignment n = (i2 & 8) != 0 ? Alignment.a.n() : alignment;
        if (b.G()) {
            b.S(-1716798859, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.ContextMenu (ContextMenu.kt:36)");
        }
        h.z(-1187990410);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        float f = 20;
        Modifier n2 = SizeKt.n(SizeKt.y(SizeKt.b(SizeKt.f(modifier2, 0.0f, 1, null), bu1.g(f), 0.0f, 2, null), n, false, 2, null), bu1.g(f));
        h.z(733328855);
        rg4 g = BoxKt.g(Alignment.a.o(), false, h, 0);
        h.z(-1323940314);
        int a = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 c = LayoutKt.c(n2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a2);
        } else {
            h.p();
        }
        Composer a3 = Updater.a(h);
        Updater.c(a3, g, companion.e());
        Updater.c(a3, o, companion.g());
        gt2 b = companion.b();
        if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
            a3.q(Integer.valueOf(a));
            a3.v(Integer.valueOf(a), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        h.z(-1741148655);
        boolean z = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A2 = h.A();
        if (z || A2 == aVar.a()) {
            A2 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ContextMenuKt$ContextMenu$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m479invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m479invoke() {
                    qs2.this.mo865invoke();
                    ContextMenuKt.c(sy4Var, true);
                }
            };
            h.q(A2);
        }
        qs2 qs2Var2 = (qs2) A2;
        h.R();
        Modifier.a aVar2 = Modifier.a;
        final Alignment alignment2 = n;
        IconButtonKt.a(qs2Var2, SizeKt.n(aVar2, bu1.g(f)), false, null, null, ComposableSingletons$ContextMenuKt.a.a(), h, 196656, 28);
        boolean b2 = b(sy4Var);
        h.z(-1741148120);
        Object A3 = h.A();
        if (A3 == aVar.a()) {
            A3 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ContextMenuKt$ContextMenu$1$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m480invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m480invoke() {
                    ContextMenuKt.c(sy4.this, false);
                }
            };
            h.q(A3);
        }
        h.R();
        Modifier d = BackgroundKt.d(aVar2, eb5.Companion.a(h, 8).d(), null, 2, null);
        yr0 b3 = zr0.b(h, 262059246, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ContextMenuKt$ContextMenu$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$DropdownMenu");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(262059246, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.ContextMenu.<anonymous>.<anonymous> (ContextMenu.kt:65)");
                }
                List<rx0> list2 = list;
                final sy4 sy4Var2 = sy4Var;
                for (final rx0 rx0Var : list2) {
                    yr0 b4 = zr0.b(composer2, 341479240, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ContextMenuKt$ContextMenu$1$3$1$1
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 11) == 2 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(341479240, i4, -1, "com.nytimes.android.features.you.youtab.composable.interests.ContextMenu.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContextMenu.kt:68)");
                            }
                            Modifier h2 = SizeKt.h(SizeKt.w(Modifier.a, null, false, 3, null), 0.0f, 1, null);
                            nn0 c2 = rx0.this.c();
                            composer3.z(2146050749);
                            long l = c2 == null ? eb5.Companion.a(composer3, 8).l() : c2.B();
                            composer3.R();
                            TextKt.b(rx0.this.b(), h2, l, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 48, 0, 131064);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    });
                    composer2.z(1353885527);
                    boolean S = composer2.S(rx0Var);
                    Object A4 = composer2.A();
                    if (S || A4 == Composer.a.a()) {
                        A4 = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ContextMenuKt$ContextMenu$1$3$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m481invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m481invoke() {
                                rx0.this.a().mo865invoke();
                                ContextMenuKt.c(sy4Var2, false);
                            }
                        };
                        composer2.q(A4);
                    }
                    composer2.R();
                    AndroidMenu_androidKt.b(b4, (qs2) A4, null, null, null, false, null, null, null, composer2, 6, 508);
                }
                if (b.G()) {
                    b.R();
                }
            }
        });
        final Modifier modifier3 = modifier2;
        AndroidMenu_androidKt.a(b2, (qs2) A3, d, 0L, null, null, b3, h, 1572912, 56);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ContextMenuKt$ContextMenu$2
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
                    ContextMenuKt.a(list, qs2Var, modifier3, alignment2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    private static final boolean b(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }
}
