package com.nytimes.android.features.games.gameshub.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.material.ExposedDropdownMenu_androidKt;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.ButtonKt;
import com.nytimes.android.features.games.gameshub.playtab.debug.DebugMenuViewModel;
import com.nytimes.android.features.games.gameshub.progress.api.data.DailyProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.EntitledSpellingBeeProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.MiniProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.NonEntitledSpellingBeeProgress;
import com.nytimes.android.features.games.gameshub.ui.util.AnnotatedStringUtilsKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m37;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ui9;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class DebugMenuProgressItemsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final DebugMenuViewModel debugMenuViewModel, final qs2 qs2Var, Composer composer, final int i) {
        Composer h = composer.h(-981236795);
        if (b.G()) {
            b.S(-981236795, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.ApplyChanges (DebugMenuProgressItems.kt:206)");
        }
        Modifier.a aVar = Modifier.a;
        float f = 32;
        Modifier m = PaddingKt.m(aVar, 0.0f, bu1.g(f), 0.0f, 0.0f, 13, null);
        h.z(693286680);
        rg4 a = m.a(Arrangement.a.f(), Alignment.a.l(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(m);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        ButtonKt.d("Apply Changes To Play Tab", PaddingKt.m(aVar, bu1.g(f), 0.0f, bu1.g(f), 0.0f, 10, null), null, null, new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ApplyChanges$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m377invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m377invoke() {
                qs2.this.mo865invoke();
                debugMenuViewModel.i();
            }
        }, false, h, 54, 44);
        h.R();
        h.t();
        h.R();
        h.R();
        SpacerKt.a(SizeKt.i(aVar, bu1.g(16)), h, 6);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ApplyChanges$2
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
                    DebugMenuProgressItemsKt.a(DebugMenuViewModel.this, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final DebugMenuViewModel debugMenuViewModel, final qs2 qs2Var, final boolean z, Composer composer, final int i) {
        zq3.h(debugMenuViewModel, "viewModel");
        zq3.h(qs2Var, "onDismissRequest");
        Composer h = composer.h(589913792);
        if (b.G()) {
            b.S(589913792, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.DebugMenu (DebugMenuProgressItems.kt:38)");
        }
        h.z(324353418);
        boolean z2 = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A = h.A();
        if (z2 || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$DebugMenu$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m378invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m378invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        AndroidDialog_androidKt.a((qs2) A, null, zr0.b(h, -1359458743, true, new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$DebugMenu$2
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
                    b.S(-1359458743, i2, -1, "com.nytimes.android.features.games.gameshub.ui.components.DebugMenu.<anonymous> (DebugMenuProgressItems.kt:40)");
                }
                Modifier d = BackgroundKt.d(SizeKt.h(Modifier.a, 0.0f, 1, null), eb5.Companion.a(composer2, 8).d(), null, 2, null);
                Alignment.b g = Alignment.a.g();
                DebugMenuViewModel debugMenuViewModel2 = DebugMenuViewModel.this;
                boolean z3 = z;
                qs2 qs2Var2 = qs2Var;
                composer2.z(-483455358);
                rg4 a = d.a(Arrangement.a.g(), g, composer2, 48);
                composer2.z(-1323940314);
                int a2 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c = LayoutKt.c(d);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a3);
                } else {
                    composer2.p();
                }
                Composer a4 = Updater.a(composer2);
                Updater.c(a4, a, companion.e());
                Updater.c(a4, o, companion.g());
                gt2 b = companion.b();
                if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                    a4.q(Integer.valueOf(a2));
                    a4.v(Integer.valueOf(a2), b);
                }
                c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ap0 ap0Var = ap0.a;
                DebugMenuProgressItemsKt.f(debugMenuViewModel2.e(z3).entrySet(), debugMenuViewModel2, composer2, 72);
                DebugMenuProgressItemsKt.g(debugMenuViewModel2, new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$DebugMenu$2$1$1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m379invoke() {
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m379invoke();
                        return ww8.a;
                    }
                }, composer2, 56);
                DebugMenuProgressItemsKt.a(debugMenuViewModel2, qs2Var2, composer2, 8);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 384, 2);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$DebugMenu$3
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
                    DebugMenuProgressItemsKt.b(DebugMenuViewModel.this, qs2Var, z, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void c(final int i, final String str, final Enum[] enumArr, final sy4 sy4Var, final DebugMenuViewModel debugMenuViewModel, final qs2 qs2Var, Composer composer, final int i2) {
        zq3.h(str, "title");
        zq3.h(enumArr, "enumItems");
        zq3.h(sy4Var, "expanded");
        zq3.h(debugMenuViewModel, "viewModel");
        zq3.h(qs2Var, "onExpandedChanged");
        Composer h = composer.h(560361110);
        if (b.G()) {
            b.S(560361110, i2, -1, "com.nytimes.android.features.games.gameshub.ui.components.ExpandableProgressItem (DebugMenuProgressItems.kt:80)");
        }
        h.z(-1845750344);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(AnnotatedStringUtilsKt.c(debugMenuViewModel.f(true, i, enumArr[i]), null, 1, null), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var2 = (sy4) A;
        h.R();
        TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, h, (i2 >> 3) & 14, 0, 131070);
        boolean booleanValue = ((Boolean) sy4Var.getValue()).booleanValue();
        h.z(-1845750000);
        boolean z = (((458752 & i2) ^ 196608) > 131072 && h.S(qs2Var)) || (i2 & 196608) == 131072;
        Object A2 = h.A();
        if (z || A2 == aVar.a()) {
            A2 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ExpandableProgressItem$1$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }

                public final void invoke(boolean z2) {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A2);
        }
        h.R();
        ExposedDropdownMenu_androidKt.a(booleanValue, (ss2) A2, null, zr0.b(h, 1572636460, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ExpandableProgressItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Composer composer2, int i3) {
                String d;
                zq3.h(exposedDropdownMenuBoxScope, "$this$ExposedDropdownMenuBox");
                if (b.G()) {
                    b.S(1572636460, i3, -1, "com.nytimes.android.features.games.gameshub.ui.components.ExpandableProgressItem.<anonymous> (DebugMenuProgressItems.kt:97)");
                }
                d = DebugMenuProgressItemsKt.d(sy4Var2);
                TextFieldKt.a(d, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ExpandableProgressItem$2.1
                    public final void invoke(String str2) {
                        zq3.h(str2, "it");
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return ww8.a;
                    }
                }, null, false, true, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, null, composer2, 24624, 0, 1048556);
                boolean booleanValue2 = ((Boolean) sy4.this.getValue()).booleanValue();
                composer2.z(-1350154874);
                boolean S = composer2.S(sy4.this);
                final sy4 sy4Var3 = sy4.this;
                Object A3 = composer2.A();
                if (S || A3 == Composer.a.a()) {
                    A3 = new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ExpandableProgressItem$2$2$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m380invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m380invoke() {
                            sy4.this.setValue(Boolean.FALSE);
                        }
                    };
                    composer2.q(A3);
                }
                composer2.R();
                final Enum<?>[] enumArr2 = enumArr;
                final DebugMenuViewModel debugMenuViewModel2 = debugMenuViewModel;
                final int i4 = i;
                final sy4 sy4Var4 = sy4.this;
                final sy4 sy4Var5 = sy4Var2;
                exposedDropdownMenuBoxScope.c(booleanValue2, (qs2) A3, null, null, zr0.b(composer2, 1202188733, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ExpandableProgressItem$2.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(zo0 zo0Var, Composer composer3, int i5) {
                        zq3.h(zo0Var, "$this$ExposedDropdownMenu");
                        if ((i5 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1202188733, i5, -1, "com.nytimes.android.features.games.gameshub.ui.components.ExpandableProgressItem.<anonymous>.<anonymous> (DebugMenuProgressItems.kt:102)");
                        }
                        Enum<?>[] enumArr3 = enumArr2;
                        final DebugMenuViewModel debugMenuViewModel3 = debugMenuViewModel2;
                        final int i6 = i4;
                        final sy4 sy4Var6 = sy4Var4;
                        final sy4 sy4Var7 = sy4Var5;
                        for (final Enum<?> r7 : enumArr3) {
                            final String f = debugMenuViewModel3.f(false, i6, r7);
                            AndroidMenu_androidKt.b(new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ExpandableProgressItem$2$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m381invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m381invoke() {
                                    DebugMenuProgressItemsKt.e(sy4Var7, f);
                                    sy4Var6.setValue(Boolean.FALSE);
                                    DebugMenuProgressItemsKt.y(debugMenuViewModel3, i6, r7);
                                }
                            }, null, false, null, null, zr0.b(composer3, -548473030, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ExpandableProgressItem$2$3$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // defpackage.it2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(m37 m37Var, Composer composer4, int i7) {
                                    zq3.h(m37Var, "$this$DropdownMenuItem");
                                    if ((i7 & 81) == 16 && composer4.i()) {
                                        composer4.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(-548473030, i7, -1, "com.nytimes.android.features.games.gameshub.ui.components.ExpandableProgressItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugMenuProgressItems.kt:109)");
                                    }
                                    TextKt.c(f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131070);
                                    if (b.G()) {
                                        b.R();
                                    }
                                }
                            }), composer3, 196608, 30);
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 286720, 12);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((ExposedDropdownMenuBoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h, 3072, 4);
        SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(16)), h, 6);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ExpandableProgressItem$3
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
                    DebugMenuProgressItemsKt.c(i, str, enumArr, sy4Var, debugMenuViewModel, qs2Var, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(sy4 sy4Var) {
        return (String) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(sy4 sy4Var, String str) {
        sy4Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final Set set, final DebugMenuViewModel debugMenuViewModel, Composer composer, final int i) {
        Composer h = composer.h(-663340703);
        if (b.G()) {
            b.S(-663340703, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.ProgressItems (DebugMenuProgressItems.kt:54)");
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(32)), h, 6);
        int i2 = 0;
        for (Object obj : set) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.v();
            }
            Map.Entry entry = (Map.Entry) obj;
            h.z(1271300631);
            Object A = h.A();
            if (A == Composer.a.a()) {
                A = b0.e(Boolean.FALSE, null, 2, null);
                h.q(A);
            }
            final sy4 sy4Var = (sy4) A;
            h.R();
            linkedHashSet.add(sy4Var);
            c(i2, (String) entry.getKey(), (Enum[]) entry.getValue(), sy4Var, debugMenuViewModel, new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ProgressItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m382invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m382invoke() {
                    Iterator<T> it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        ((sy4) it2.next()).setValue(Boolean.FALSE);
                    }
                    sy4Var.setValue(Boolean.valueOf(!((Boolean) r3.getValue()).booleanValue()));
                }
            }, h, 36352);
            i2 = i3;
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$ProgressItems$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    DebugMenuProgressItemsKt.f(set, debugMenuViewModel, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void g(final DebugMenuViewModel debugMenuViewModel, final qs2 qs2Var, Composer composer, final int i) {
        final sy4 sy4Var;
        zq3.h(debugMenuViewModel, "viewModel");
        zq3.h(qs2Var, "onExpandedChanged");
        Composer h = composer.h(580470226);
        if (b.G()) {
            b.S(580470226, i, -1, "com.nytimes.android.features.games.gameshub.ui.components.WordleDebugUI (DebugMenuProgressItems.kt:134)");
        }
        TextKt.c("Wordle Guesses", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, h, 6, 0, 131070);
        h.z(1516114214);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(debugMenuViewModel.g(), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var2 = (sy4) A;
        h.R();
        h.z(1516114304);
        Object A2 = h.A();
        if (A2 == aVar.a()) {
            A2 = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A2);
        }
        final sy4 sy4Var3 = (sy4) A2;
        h.R();
        boolean h2 = h(sy4Var3);
        h.z(1516114429);
        int i2 = (i & ContentType.LONG_FORM_ON_DEMAND) ^ 48;
        boolean z = (i2 > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A3 = h.A();
        if (z || A3 == aVar.a()) {
            A3 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }

                public final void invoke(boolean z2) {
                    boolean h3;
                    qs2.this.mo865invoke();
                    sy4 sy4Var4 = sy4Var3;
                    h3 = DebugMenuProgressItemsKt.h(sy4Var4);
                    DebugMenuProgressItemsKt.i(sy4Var4, !h3);
                }
            };
            h.q(A3);
        }
        h.R();
        ExposedDropdownMenu_androidKt.a(h2, (ss2) A3, null, zr0.b(h, 203108860, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Composer composer2, int i3) {
                ui9 l;
                boolean h3;
                zq3.h(exposedDropdownMenuBoxScope, "$this$ExposedDropdownMenuBox");
                if (b.G()) {
                    b.S(203108860, i3, -1, "com.nytimes.android.features.games.gameshub.ui.components.WordleDebugUI.<anonymous> (DebugMenuProgressItems.kt:147)");
                }
                l = DebugMenuProgressItemsKt.l(sy4.this);
                TextFieldKt.a(String.valueOf(l.d()), new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$2.1
                    public final void invoke(String str) {
                        zq3.h(str, "it");
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return ww8.a;
                    }
                }, null, false, true, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, null, composer2, 24624, 0, 1048556);
                h3 = DebugMenuProgressItemsKt.h(sy4Var3);
                composer2.z(-1081844302);
                final sy4 sy4Var4 = sy4Var3;
                Object A4 = composer2.A();
                if (A4 == Composer.a.a()) {
                    A4 = new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$2$2$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m383invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m383invoke() {
                            DebugMenuProgressItemsKt.i(sy4.this, false);
                        }
                    };
                    composer2.q(A4);
                }
                composer2.R();
                final DebugMenuViewModel debugMenuViewModel2 = debugMenuViewModel;
                final sy4 sy4Var5 = sy4Var3;
                final sy4 sy4Var6 = sy4.this;
                exposedDropdownMenuBoxScope.c(h3, (qs2) A4, null, null, zr0.b(composer2, 992941195, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$2.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(zo0 zo0Var, Composer composer3, int i4) {
                        zq3.h(zo0Var, "$this$ExposedDropdownMenu");
                        if ((i4 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(992941195, i4, -1, "com.nytimes.android.features.games.gameshub.ui.components.WordleDebugUI.<anonymous>.<anonymous> (DebugMenuProgressItems.kt:152)");
                        }
                        List o = i.o(0, 1, 2, 3, 4, 5, 6);
                        final DebugMenuViewModel debugMenuViewModel3 = DebugMenuViewModel.this;
                        final sy4 sy4Var7 = sy4Var5;
                        final sy4 sy4Var8 = sy4Var6;
                        Iterator it2 = o.iterator();
                        while (it2.hasNext()) {
                            final int intValue = ((Number) it2.next()).intValue();
                            AndroidMenu_androidKt.b(new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$2$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m384invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m384invoke() {
                                    boolean h4;
                                    ui9 l2;
                                    ui9 l3;
                                    ui9 l4;
                                    sy4 sy4Var9 = sy4Var7;
                                    h4 = DebugMenuProgressItemsKt.h(sy4Var9);
                                    DebugMenuProgressItemsKt.i(sy4Var9, !h4);
                                    sy4 sy4Var10 = sy4Var8;
                                    l2 = DebugMenuProgressItemsKt.l(sy4Var10);
                                    DebugMenuProgressItemsKt.m(sy4Var10, ui9.c(l2, 0, intValue, false, 5, null));
                                    DebugMenuViewModel debugMenuViewModel4 = debugMenuViewModel3;
                                    l3 = DebugMenuProgressItemsKt.l(sy4Var8);
                                    int d = l3.d();
                                    l4 = DebugMenuProgressItemsKt.l(sy4Var8);
                                    debugMenuViewModel4.k(d, l4.e());
                                }
                            }, null, false, null, null, zr0.b(composer3, -1195177440, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$2$3$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // defpackage.it2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(m37 m37Var, Composer composer4, int i5) {
                                    zq3.h(m37Var, "$this$DropdownMenuItem");
                                    if ((i5 & 81) == 16 && composer4.i()) {
                                        composer4.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(-1195177440, i5, -1, "com.nytimes.android.features.games.gameshub.ui.components.WordleDebugUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugMenuProgressItems.kt:160)");
                                    }
                                    TextKt.c(String.valueOf(intValue), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131070);
                                    if (b.G()) {
                                        b.R();
                                    }
                                }
                            }), composer3, 196608, 30);
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 286768, 12);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((ExposedDropdownMenuBoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h, 3072, 4);
        SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(16)), h, 6);
        h.z(1516115257);
        Object A4 = h.A();
        if (A4 == aVar.a()) {
            A4 = b0.e(Boolean.FALSE, null, 2, null);
            h.q(A4);
        }
        sy4 sy4Var4 = (sy4) A4;
        h.R();
        TextKt.c("Wordle Win", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, h, 6, 0, 131070);
        boolean j = j(sy4Var4);
        h.z(1516115410);
        boolean z2 = (i2 > 32 && h.S(qs2Var)) || (i & 48) == 32;
        Object A5 = h.A();
        if (z2 || A5 == aVar.a()) {
            sy4Var = sy4Var4;
            A5 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }

                public final void invoke(boolean z3) {
                    boolean j2;
                    qs2.this.mo865invoke();
                    sy4 sy4Var5 = sy4Var;
                    j2 = DebugMenuProgressItemsKt.j(sy4Var5);
                    DebugMenuProgressItemsKt.k(sy4Var5, !j2);
                }
            };
            h.q(A5);
        } else {
            sy4Var = sy4Var4;
        }
        h.R();
        ExposedDropdownMenu_androidKt.a(j, (ss2) A5, null, zr0.b(h, 20937957, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Composer composer2, int i3) {
                ui9 l;
                boolean j2;
                zq3.h(exposedDropdownMenuBoxScope, "$this$ExposedDropdownMenuBox");
                if (b.G()) {
                    b.S(20937957, i3, -1, "com.nytimes.android.features.games.gameshub.ui.components.WordleDebugUI.<anonymous> (DebugMenuProgressItems.kt:178)");
                }
                l = DebugMenuProgressItemsKt.l(sy4.this);
                TextFieldKt.a(String.valueOf(l.e()), new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$4.1
                    public final void invoke(String str) {
                        zq3.h(str, "it");
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return ww8.a;
                    }
                }, null, false, true, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, null, composer2, 24624, 0, 1048556);
                j2 = DebugMenuProgressItemsKt.j(sy4Var);
                composer2.z(-1081843331);
                final sy4 sy4Var5 = sy4Var;
                Object A6 = composer2.A();
                if (A6 == Composer.a.a()) {
                    A6 = new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$4$2$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m385invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m385invoke() {
                            DebugMenuProgressItemsKt.k(sy4.this, false);
                        }
                    };
                    composer2.q(A6);
                }
                composer2.R();
                final DebugMenuViewModel debugMenuViewModel2 = debugMenuViewModel;
                final sy4 sy4Var6 = sy4Var;
                final sy4 sy4Var7 = sy4.this;
                exposedDropdownMenuBoxScope.c(j2, (qs2) A6, null, null, zr0.b(composer2, -1159399500, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$4.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(zo0 zo0Var, Composer composer3, int i4) {
                        zq3.h(zo0Var, "$this$ExposedDropdownMenu");
                        if ((i4 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1159399500, i4, -1, "com.nytimes.android.features.games.gameshub.ui.components.WordleDebugUI.<anonymous>.<anonymous> (DebugMenuProgressItems.kt:183)");
                        }
                        final DebugMenuViewModel debugMenuViewModel3 = DebugMenuViewModel.this;
                        final sy4 sy4Var8 = sy4Var6;
                        final sy4 sy4Var9 = sy4Var7;
                        qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt.WordleDebugUI.4.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m386invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m386invoke() {
                                boolean j3;
                                ui9 l2;
                                ui9 l3;
                                ui9 l4;
                                sy4 sy4Var10 = sy4Var8;
                                j3 = DebugMenuProgressItemsKt.j(sy4Var10);
                                DebugMenuProgressItemsKt.k(sy4Var10, !j3);
                                sy4 sy4Var11 = sy4Var9;
                                l2 = DebugMenuProgressItemsKt.l(sy4Var11);
                                DebugMenuProgressItemsKt.m(sy4Var11, ui9.c(l2, 0, 0, true, 3, null));
                                DebugMenuViewModel debugMenuViewModel4 = DebugMenuViewModel.this;
                                l3 = DebugMenuProgressItemsKt.l(sy4Var9);
                                int d = l3.d();
                                l4 = DebugMenuProgressItemsKt.l(sy4Var9);
                                debugMenuViewModel4.k(d, l4.e());
                            }
                        };
                        ComposableSingletons$DebugMenuProgressItemsKt composableSingletons$DebugMenuProgressItemsKt = ComposableSingletons$DebugMenuProgressItemsKt.a;
                        AndroidMenu_androidKt.b(qs2Var2, null, false, null, null, composableSingletons$DebugMenuProgressItemsKt.a(), composer3, 196608, 30);
                        final DebugMenuViewModel debugMenuViewModel4 = DebugMenuViewModel.this;
                        final sy4 sy4Var10 = sy4Var6;
                        final sy4 sy4Var11 = sy4Var7;
                        AndroidMenu_androidKt.b(new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt.WordleDebugUI.4.3.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m387invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m387invoke() {
                                boolean j3;
                                ui9 l2;
                                ui9 l3;
                                ui9 l4;
                                sy4 sy4Var12 = sy4Var10;
                                j3 = DebugMenuProgressItemsKt.j(sy4Var12);
                                DebugMenuProgressItemsKt.k(sy4Var12, !j3);
                                sy4 sy4Var13 = sy4Var11;
                                l2 = DebugMenuProgressItemsKt.l(sy4Var13);
                                DebugMenuProgressItemsKt.m(sy4Var13, ui9.c(l2, 0, 0, false, 3, null));
                                DebugMenuViewModel debugMenuViewModel5 = DebugMenuViewModel.this;
                                l3 = DebugMenuProgressItemsKt.l(sy4Var11);
                                int d = l3.d();
                                l4 = DebugMenuProgressItemsKt.l(sy4Var11);
                                debugMenuViewModel5.k(d, l4.e());
                            }
                        }, null, false, null, null, composableSingletons$DebugMenuProgressItemsKt.b(), composer3, 196608, 30);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 286768, 12);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((ExposedDropdownMenuBoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h, 3072, 4);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.DebugMenuProgressItemsKt$WordleDebugUI$5
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
                    DebugMenuProgressItemsKt.g(DebugMenuViewModel.this, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ui9 l(sy4 sy4Var) {
        return (ui9) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(sy4 sy4Var, ui9 ui9Var) {
        sy4Var.setValue(ui9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(DebugMenuViewModel debugMenuViewModel, int i, Enum r3) {
        debugMenuViewModel.j(i, r3 instanceof EntitledSpellingBeeProgress ? ((EntitledSpellingBeeProgress) r3).getRank() : r3 instanceof NonEntitledSpellingBeeProgress ? ((NonEntitledSpellingBeeProgress) r3).getRank() : r3 instanceof DailyProgress ? r3.name() : r3 instanceof MiniProgress ? r3.name() : r3.name());
    }
}
