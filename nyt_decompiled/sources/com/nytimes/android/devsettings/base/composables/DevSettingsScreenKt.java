package com.nytimes.android.devsettings.base.composables;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.base.item.DevSettingXmlItem;
import com.nytimes.android.devsettings.home.DevSettingsXmlActivity;
import com.nytimes.android.devsettings.home.composables.DevSettingsAppBarComposableKt;
import com.nytimes.android.devsettings.search.DevSettingsSearchManager;
import com.nytimes.android.devsettings.utils.ProcessPhoenix;
import defpackage.ag4;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.kt2;
import defpackage.nn0;
import defpackage.o76;
import defpackage.qs2;
import defpackage.sn1;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t5;
import defpackage.tp0;
import defpackage.un1;
import defpackage.wn1;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.yn1;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class DevSettingsScreenKt {
    public static final void a(final wn1 wn1Var, final boolean z, Composer composer, final int i) {
        int i2;
        zq3.h(wn1Var, "item");
        Composer h = composer.h(473588034);
        if ((i & 14) == 0) {
            i2 = (h.S(wn1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.a(z) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(473588034, i2, -1, "com.nytimes.android.devsettings.base.composables.DevSettingItemLayout (DevSettingsScreen.kt:214)");
            }
            if (wn1Var instanceof DevSettingGroupExpandable) {
                h.z(-1607810811);
                DevSettingGroupExpandable devSettingGroupExpandable = (DevSettingGroupExpandable) wn1Var;
                devSettingGroupExpandable.l(z);
                devSettingGroupExpandable.e(h, 8);
                h.R();
            } else if (wn1Var instanceof un1) {
                h.z(2026349102);
                ((un1) wn1Var).e(h, 0);
                h.R();
            } else {
                h.z(-1607675558);
                h.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$DevSettingItemLayout$1
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
                    DevSettingsScreenKt.a(wn1.this, z, composer2, i | 1);
                }
            });
        }
    }

    public static final void b(final DevSettingsSearchManager devSettingsSearchManager, final boolean z, Composer composer, final int i, final int i2) {
        zq3.h(devSettingsSearchManager, "searchManager");
        Composer h = composer.h(-264768463);
        if ((i2 & 2) != 0) {
            z = true;
        }
        if (b.G()) {
            b.S(-264768463, i, -1, "com.nytimes.android.devsettings.base.composables.DevSettingsScreen (DevSettingsScreen.kt:54)");
        }
        x08 b = y.b(devSettingsSearchManager.b(), null, h, 8, 1);
        List d = d(b);
        if (d == null) {
            d = devSettingsSearchManager.a();
        }
        c(d, new ss2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$DevSettingsScreen$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "query");
                DevSettingsSearchManager.this.d(str);
            }
        }, d(b) != null, null, z, h, ((i << 9) & 57344) | 8, 8);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$DevSettingsScreen$2
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
                    DevSettingsScreenKt.b(DevSettingsSearchManager.this, z, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void c(final List list, final ss2 ss2Var, final boolean z, ComponentActivity componentActivity, boolean z2, Composer composer, final int i, final int i2) {
        final ComponentActivity componentActivity2;
        int i3;
        zq3.h(list, "items");
        zq3.h(ss2Var, "onSearchQuery");
        Composer h = composer.h(1506311275);
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            componentActivity2 = t5.d(h, 0);
        } else {
            componentActivity2 = componentActivity;
            i3 = i;
        }
        final boolean z3 = (i2 & 16) != 0 ? true : z2;
        if (b.G()) {
            b.S(1506311275, i3, -1, "com.nytimes.android.devsettings.base.composables.DevSettingsScreen (DevSettingsScreen.kt:72)");
        }
        h.z(1214362835);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e("", null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        boolean z4 = e(sy4Var).length() > 0;
        h.z(1214365236);
        boolean S = h.S(sy4Var);
        Object A2 = h.A();
        if (S || A2 == aVar.a()) {
            A2 = new qs2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$DevSettingsScreen$3$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m347invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m347invoke() {
                    DevSettingsScreenKt.f(sy4.this, "");
                }
            };
            h.q(A2);
        }
        h.R();
        BackHandlerKt.a(z4, (qs2) A2, h, 48, 0);
        final boolean z5 = z3;
        final ComponentActivity componentActivity3 = componentActivity2;
        ScaffoldKt.b(WindowInsetsPaddingKt.c(Modifier.a, p.c(o.a, h, 8)), null, zr0.b(h, 1790742854, true, new gt2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$DevSettingsScreen$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1790742854, i4, -1, "com.nytimes.android.devsettings.base.composables.DevSettingsScreen.<anonymous> (DevSettingsScreen.kt:82)");
                }
                if (z3) {
                    final ComponentActivity componentActivity4 = componentActivity2;
                    DevSettingsAppBarComposableKt.a(new qs2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$DevSettingsScreen$4.1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m348invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m348invoke() {
                            OnBackPressedDispatcher onBackPressedDispatcher;
                            ComponentActivity componentActivity5 = ComponentActivity.this;
                            if (componentActivity5 == null || (onBackPressedDispatcher = componentActivity5.getOnBackPressedDispatcher()) == null) {
                                return;
                            }
                            onBackPressedDispatcher.l();
                        }
                    }, ComposableSingletons$DevSettingsScreenKt.a.a(), null, null, composer2, 48, 12);
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(h, 1521686893, true, new it2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$DevSettingsScreen$5

            public static final class a implements Comparator {
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    String b = ((wn1) obj).b();
                    Locale locale = Locale.ROOT;
                    String lowerCase = b.toLowerCase(locale);
                    zq3.g(lowerCase, "toLowerCase(...)");
                    String lowerCase2 = ((wn1) obj2).b().toLowerCase(locale);
                    zq3.g(lowerCase2, "toLowerCase(...)");
                    return tp0.d(lowerCase, lowerCase2);
                }
            }

            public static final class b implements Comparator {
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    yn1 f = ((wn1) obj).f();
                    String a = f != null ? f.a() : null;
                    yn1 f2 = ((wn1) obj2).f();
                    return tp0.d(a, f2 != null ? f2.a() : null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
            
                if (r1 == androidx.compose.runtime.Composer.a.a()) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(defpackage.ym5 r13, androidx.compose.runtime.Composer r14, int r15) {
                /*
                    Method dump skipped, instructions count: 417
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$DevSettingsScreen$5.invoke(ym5, androidx.compose.runtime.Composer, int):void");
            }
        }), h, 384, 12582912, 131066);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$DevSettingsScreen$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    DevSettingsScreenKt.c(list, ss2Var, z, componentActivity3, z5, composer2, i | 1, i2);
                }
            });
        }
    }

    private static final List d(x08 x08Var) {
        return (List) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(sy4 sy4Var) {
        return (String) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(sy4 sy4Var, String str) {
        sy4Var.setValue(str);
    }

    public static final void g(Composer composer, final int i) {
        Composer h = composer.h(-185128288);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-185128288, i, -1, "com.nytimes.android.devsettings.base.composables.PreferenceApplyChanges (DevSettingsScreen.kt:187)");
            }
            ag4 ag4Var = ag4.a;
            int i2 = ag4.b;
            final long l = ag4Var.a(h, i2).l();
            CompositionLocalKt.b(new o76[]{ContentColorKt.a().c(nn0.j(nn0.r(ColorsKt.a(ag4Var.a(h, i2), l), 1.0f, 0.0f, 0.0f, 0.0f, 14, null)))}, zr0.b(h, 271519584, true, new gt2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$PreferenceApplyChanges$1
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
                    if ((i3 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(271519584, i3, -1, "com.nytimes.android.devsettings.base.composables.PreferenceApplyChanges.<anonymous> (DevSettingsScreen.kt:193)");
                    }
                    final Context context = (Context) composer2.m(AndroidCompositionLocals_androidKt.g());
                    PreferenceItemComposableKt.d("Apply changes", BackgroundKt.d(Modifier.a, l, null, 2, null), "Restart the app - No data will be cleared", new qs2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$PreferenceApplyChanges$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m349invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m349invoke() {
                            ProcessPhoenix.Companion.e(context);
                        }
                    }, null, ComposableSingletons$DevSettingsScreenKt.a.d(), composer2, 196998, 16);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 56);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$PreferenceApplyChanges$2
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
                    DevSettingsScreenKt.g(composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final Map map, final boolean z, Composer composer, final int i) {
        Composer h = composer.h(1676177237);
        if (b.G()) {
            b.S(1676177237, i, -1, "com.nytimes.android.devsettings.base.composables.SettingsList (DevSettingsScreen.kt:144)");
        }
        final x08 b = y.b(sn1.a.a(), null, h, 8, 1);
        LazyDslKt.a(null, null, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$SettingsList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LazyListScope) obj);
                return ww8.a;
            }

            public final void invoke(LazyListScope lazyListScope) {
                zq3.h(lazyListScope, "$this$LazyColumn");
                final x08 x08Var = b;
                LazyListScope.c(lazyListScope, null, null, zr0.c(-863695202, true, new it2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$SettingsList$1.1
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i2) {
                        boolean i3;
                        zq3.h(h04Var, "$this$stickyHeader");
                        if ((i2 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-863695202, i2, -1, "com.nytimes.android.devsettings.base.composables.SettingsList.<anonymous>.<anonymous> (DevSettingsScreen.kt:148)");
                        }
                        i3 = DevSettingsScreenKt.i(x08.this);
                        AnimatedVisibilityKt.f(i3, null, EnterExitTransitionKt.D(null, null, 3, null), null, null, ComposableSingletons$DevSettingsScreenKt.a.b(), composer2, 196992, 26);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                final x08 x08Var2 = b;
                LazyListScope.d(lazyListScope, null, null, zr0.c(-978026431, true, new it2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$SettingsList$1.2
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i2) {
                        boolean i3;
                        zq3.h(h04Var, "$this$item");
                        if ((i2 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-978026431, i2, -1, "com.nytimes.android.devsettings.base.composables.SettingsList.<anonymous>.<anonymous> (DevSettingsScreen.kt:156)");
                        }
                        i3 = DevSettingsScreenKt.i(x08.this);
                        AnimatedVisibilityKt.f(!i3, null, null, null, null, ComposableSingletons$DevSettingsScreenKt.a.c(), composer2, 196608, 30);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                Map<yn1, List<wn1>> map2 = map;
                final boolean z2 = z;
                for (Map.Entry<yn1, List<wn1>> entry : map2.entrySet()) {
                    final yn1 key = entry.getKey();
                    final List<wn1> value = entry.getValue();
                    if (key != null) {
                        LazyListScope.d(lazyListScope, null, null, zr0.c(403125963, true, new it2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$SettingsList$1$3$1
                            {
                                super(3);
                            }

                            @Override // defpackage.it2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return ww8.a;
                            }

                            public final void invoke(h04 h04Var, Composer composer2, int i2) {
                                zq3.h(h04Var, "$this$item");
                                if ((i2 & 81) == 16 && composer2.i()) {
                                    composer2.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(403125963, i2, -1, "com.nytimes.android.devsettings.base.composables.SettingsList.<anonymous>.<anonymous>.<anonymous> (DevSettingsScreen.kt:168)");
                                }
                                DividerKt.a(null, 0L, 0.0f, 0.0f, composer2, 0, 15);
                                PreferenceBasicComposableKt.d(yn1.this.a(), null, true, ag4.a.a(composer2, ag4.b).l(), composer2, 384, 2);
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        }), 3, null);
                    }
                    final DevSettingsScreenKt$SettingsList$1$invoke$lambda$1$$inlined$items$default$1 devSettingsScreenKt$SettingsList$1$invoke$lambda$1$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$SettingsList$1$invoke$lambda$1$$inlined$items$default$1
                        @Override // defpackage.ss2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Void invoke(Object obj) {
                            return null;
                        }
                    };
                    lazyListScope.b(value.size(), null, new ss2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$SettingsList$1$invoke$lambda$1$$inlined$items$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }

                        public final Object invoke(int i2) {
                            return ss2.this.invoke(value.get(i2));
                        }
                    }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$SettingsList$1$invoke$lambda$1$$inlined$items$default$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        @Override // defpackage.kt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                            return ww8.a;
                        }

                        public final void invoke(h04 h04Var, int i2, Composer composer2, int i3) {
                            int i4;
                            zq3.h(h04Var, "$this$items");
                            if ((i3 & 14) == 0) {
                                i4 = (composer2.S(h04Var) ? 4 : 2) | i3;
                            } else {
                                i4 = i3;
                            }
                            if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                i4 |= composer2.d(i2) ? 32 : 16;
                            }
                            if ((i4 & 731) == 146 && composer2.i()) {
                                composer2.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                            }
                            wn1 wn1Var = (wn1) value.get(i2);
                            composer2.z(-1276195626);
                            DevSettingsScreenKt.a(wn1Var, z2, composer2, 0);
                            composer2.R();
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }));
                }
            }
        }, h, 0, 255);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$SettingsList$2
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
                    DevSettingsScreenKt.h(map, z, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    public static final ss2 n(final ComponentActivity componentActivity, Composer composer, int i) {
        composer.z(2083397980);
        if (b.G()) {
            b.S(2083397980, i, -1, "com.nytimes.android.devsettings.base.composables.defaultXmlItemHandler (DevSettingsScreen.kt:127)");
        }
        ss2 ss2Var = componentActivity != null ? new ss2() { // from class: com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt$defaultXmlItemHandler$1
            {
                super(1);
            }

            public final void b(DevSettingXmlItem devSettingXmlItem) {
                zq3.h(devSettingXmlItem, "item");
                DevSettingsXmlActivity.Companion.a(ComponentActivity.this, devSettingXmlItem.getTitle(), devSettingXmlItem.h());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((DevSettingXmlItem) obj);
                return ww8.a;
            }
        } : null;
        if (b.G()) {
            b.R();
        }
        composer.R();
        return ss2Var;
    }
}
