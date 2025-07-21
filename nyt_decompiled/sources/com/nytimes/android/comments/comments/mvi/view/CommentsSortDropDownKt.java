package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.comments.mvi.SortingOption;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.gb5;
import defpackage.gk0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.n37;
import defpackage.oe3;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class CommentsSortDropDownKt {
    public static final void CommentsSortByPreview(Composer composer, final int i) {
        Composer h = composer.h(280425574);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(280425574, i, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsSortByPreview (CommentsSortDropDown.kt:137)");
            }
            List C0 = d.C0(SortingOption.values());
            h.z(-906812474);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = b0.e(i.k0(C0), null, 2, null);
                h.q(A);
            }
            final sy4 sy4Var = (sy4) A;
            h.R();
            SortingOption CommentsSortByPreview$lambda$9 = CommentsSortByPreview$lambda$9(sy4Var);
            h.z(-906812234);
            Object A2 = h.A();
            if (A2 == aVar.a()) {
                A2 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDownKt$CommentsSortByPreview$1$1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SortingOption) obj);
                        return ww8.a;
                    }

                    public final void invoke(SortingOption sortingOption) {
                        zq3.h(sortingOption, "it");
                        sy4.this.setValue(sortingOption);
                    }
                };
                h.q(A2);
            }
            h.R();
            CommentsSortDropDown(CommentsSortByPreview$lambda$9, C0, (ss2) A2, h, 448);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDownKt$CommentsSortByPreview$2
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
                    CommentsSortDropDownKt.CommentsSortByPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final SortingOption CommentsSortByPreview$lambda$9(sy4 sy4Var) {
        return (SortingOption) sy4Var.getValue();
    }

    public static final void CommentsSortDropDown(final SortingOption sortingOption, final List<? extends SortingOption> list, final ss2 ss2Var, Composer composer, final int i) {
        zq3.h(sortingOption, "selectedSortingOption");
        zq3.h(list, "sortingOptions");
        zq3.h(ss2Var, "onSortingOptionSelected");
        Composer h = composer.h(421347464);
        if (b.G()) {
            b.S(421347464, i, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDown (CommentsSortDropDown.kt:45)");
        }
        h.z(912708694);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        Modifier.a aVar2 = Modifier.a;
        Modifier i2 = SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), bu1.g(44));
        eb5.a aVar3 = eb5.Companion;
        Modifier d = BackgroundKt.d(i2, aVar3.a(h, 8).a(), null, 2, null);
        h.z(733328855);
        Alignment.a aVar4 = Alignment.a;
        rg4 g = BoxKt.g(aVar4.o(), false, h, 0);
        h.z(-1323940314);
        int a = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 c = LayoutKt.c(d);
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
        Modifier c2 = BoxScopeInstance.a.c(aVar2, aVar4.f());
        Alignment.c i3 = aVar4.i();
        h.z(693286680);
        rg4 a4 = m.a(Arrangement.a.f(), i3, h, 48);
        h.z(-1323940314);
        int a5 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a6 = companion.a();
        it2 c3 = LayoutKt.c(c2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a6);
        } else {
            h.p();
        }
        Composer a7 = Updater.a(h);
        Updater.c(a7, a4, companion.e());
        Updater.c(a7, o2, companion.g());
        gt2 b2 = companion.b();
        if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
            a7.q(Integer.valueOf(a5));
            a7.v(Integer.valueOf(a5), b2);
        }
        c3.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        j jVar = new j(aVar3.a(h, 8).L(), ek8.g(14), null, l.c(l.b.b()), null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ek8.g(18), null, null, null, 0, 0, null, 16646100, null);
        String b3 = k48.b(R.string.comments_screen_sort_by, h, 0);
        o.a aVar5 = o.b;
        TextKt.c(b3, null, 0L, 0L, null, aVar5.e(), null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar, h, 196608, 0, 65502);
        SpacerKt.a(SizeKt.s(aVar2, bu1.g(10)), h, 6);
        String b4 = k48.b(sortingOption.getTitle(), h, 0);
        TextKt.c(b4, ModifierUtilsKt.d(aVar2, b4), 0L, 0L, null, aVar5.a(), null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar, h, 196608, 0, 65500);
        Modifier d2 = ModifierUtilsKt.d(aVar2, "Sort By DropDown");
        h.z(-194059941);
        Object A2 = h.A();
        if (A2 == aVar.a()) {
            A2 = new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDownKt$CommentsSortDropDown$1$1$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m235invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m235invoke() {
                    boolean CommentsSortDropDown$lambda$1;
                    sy4 sy4Var2 = sy4.this;
                    CommentsSortDropDown$lambda$1 = CommentsSortDropDownKt.CommentsSortDropDown$lambda$1(sy4Var2);
                    CommentsSortDropDownKt.CommentsSortDropDown$lambda$2(sy4Var2, !CommentsSortDropDown$lambda$1);
                }
            };
            h.q(A2);
        }
        h.R();
        IconButtonKt.a((qs2) A2, d2, false, null, ComposableSingletons$CommentsSortDropDownKt.INSTANCE.m254getLambda1$comments_release(), h, 24582, 12);
        h.R();
        h.t();
        h.R();
        h.R();
        Modifier y = SizeKt.y(SizeKt.f(aVar2, 0.0f, 1, null), aVar4.c(), false, 2, null);
        h.z(733328855);
        rg4 g2 = BoxKt.g(aVar4.o(), false, h, 0);
        h.z(-1323940314);
        int a8 = cs0.a(h, 0);
        et0 o3 = h.o();
        qs2 a9 = companion.a();
        it2 c4 = LayoutKt.c(y);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a9);
        } else {
            h.p();
        }
        Composer a10 = Updater.a(h);
        Updater.c(a10, g2, companion.e());
        Updater.c(a10, o3, companion.g());
        gt2 b5 = companion.b();
        if (a10.f() || !zq3.c(a10.A(), Integer.valueOf(a8))) {
            a10.q(Integer.valueOf(a8));
            a10.v(Integer.valueOf(a8), b5);
        }
        c4.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        boolean CommentsSortDropDown$lambda$1 = CommentsSortDropDown$lambda$1(sy4Var);
        h.z(-194059308);
        Object A3 = h.A();
        if (A3 == aVar.a()) {
            A3 = new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDownKt$CommentsSortDropDown$1$2$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m236invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m236invoke() {
                    CommentsSortDropDownKt.CommentsSortDropDown$lambda$2(sy4.this, false);
                }
            };
            h.q(A3);
        }
        h.R();
        AndroidMenu_androidKt.a(CommentsSortDropDown$lambda$1, (qs2) A3, null, 0L, null, null, zr0.b(h, -72122775, true, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDownKt$CommentsSortDropDown$1$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i4) {
                zq3.h(zo0Var, "$this$DropdownMenu");
                if ((i4 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-72122775, i4, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDown.<anonymous>.<anonymous>.<anonymous> (CommentsSortDropDown.kt:104)");
                }
                List<SortingOption> list2 = list;
                final ss2 ss2Var2 = ss2Var;
                final sy4 sy4Var2 = sy4Var;
                final SortingOption sortingOption2 = sortingOption;
                for (final SortingOption sortingOption3 : list2) {
                    final String b6 = k48.b(sortingOption3.getTitle(), composer2, 0);
                    composer2.z(-1725150837);
                    boolean S = composer2.S(ss2Var2) | composer2.S(sortingOption3);
                    Object A4 = composer2.A();
                    if (S || A4 == Composer.a.a()) {
                        A4 = new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDownKt$CommentsSortDropDown$1$2$2$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m237invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m237invoke() {
                                ss2.this.invoke(sortingOption3);
                                CommentsSortDropDownKt.CommentsSortDropDown$lambda$2(sy4Var2, false);
                            }
                        };
                        composer2.q(A4);
                    }
                    composer2.R();
                    AndroidMenu_androidKt.b((qs2) A4, null, false, null, null, zr0.b(composer2, -1164468662, true, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDownKt$CommentsSortDropDown$1$2$2$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(m37 m37Var, Composer composer3, int i5) {
                            zq3.h(m37Var, "$this$DropdownMenuItem");
                            if ((i5 & 81) == 16 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(-1164468662, i5, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDown.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommentsSortDropDown.kt:108)");
                            }
                            Modifier.a aVar6 = Modifier.a;
                            TextKt.c(b6, ModifierUtilsKt.d(aVar6, b6), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131068);
                            if (sortingOption2 == sortingOption3) {
                                SpacerKt.a(SizeKt.s(aVar6, bu1.g(10)), composer3, 6);
                                IconKt.a(gk0.a(oe3.a.a()), "Check", SizeKt.n(aVar6, bu1.g(24)), eb5.Companion.a(composer3, 8).l(), composer3, 432, 0);
                            }
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer2, 196608, 30);
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 1572912, 60);
        h.R();
        h.t();
        h.R();
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsSortDropDownKt$CommentsSortDropDown$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    CommentsSortDropDownKt.CommentsSortDropDown(SortingOption.this, list, ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommentsSortDropDown$lambda$1(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CommentsSortDropDown$lambda$2(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }
}
