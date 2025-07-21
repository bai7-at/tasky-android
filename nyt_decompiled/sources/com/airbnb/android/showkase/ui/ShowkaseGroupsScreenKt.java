package com.airbnb.android.showkase.ui;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gr7;
import defpackage.gt2;
import defpackage.h04;
import defpackage.hr7;
import defpackage.jk;
import defpackage.kt2;
import defpackage.lh4;
import defpackage.n25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;

/* loaded from: classes.dex */
public abstract class ShowkaseGroupsScreenKt {
    public static final void a(final Map map, final sy4 sy4Var, final n25 n25Var, Composer composer, final int i) {
        zq3.h(map, "groupedColorsMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        Composer h = composer.h(1542709814);
        if (b.G()) {
            b.S(1542709814, i, -1, "com.airbnb.android.showkase.ui.ShowkaseColorGroupsScreen (ShowkaseGroupsScreen.kt:96)");
        }
        c(map, sy4Var, n25Var, new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseColorGroupsScreen$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m148invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m148invoke() {
                ShowkaseBrowserAppKt.w(n25.this, ShowkaseCurrentScreen.COLORS_IN_A_GROUP);
            }
        }, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 520);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseColorGroupsScreen$2
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
                ShowkaseGroupsScreenKt.a(map, sy4Var, n25Var, composer2, i | 1);
            }
        });
    }

    public static final void b(final Map map, final sy4 sy4Var, final n25 n25Var, Composer composer, final int i) {
        zq3.h(map, "groupedComponentMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        Composer h = composer.h(-220559280);
        if (b.G()) {
            b.S(-220559280, i, -1, "com.airbnb.android.showkase.ui.ShowkaseComponentGroupsScreen (ShowkaseGroupsScreen.kt:81)");
        }
        c(map, sy4Var, n25Var, new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseComponentGroupsScreen$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m149invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m149invoke() {
                ShowkaseBrowserAppKt.w(n25.this, ShowkaseCurrentScreen.COMPONENTS_IN_A_GROUP);
            }
        }, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 520);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseComponentGroupsScreen$2
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
                ShowkaseGroupsScreenKt.b(map, sy4Var, n25Var, composer2, i | 1);
            }
        });
    }

    public static final void c(final Map map, final sy4 sy4Var, final n25 n25Var, final qs2 qs2Var, Composer composer, final int i) {
        zq3.h(map, "groupedTypographyMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(177457901);
        if (b.G()) {
            b.S(177457901, i, -1, "com.airbnb.android.showkase.ui.ShowkaseGroupsScreen (ShowkaseGroupsScreen.kt:17)");
        }
        final Map e = e(t.h(map), sy4Var);
        LazyDslKt.a(null, null, null, false, null, null, null, false, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1
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
                final List X0 = i.X0(e.entrySet());
                final sy4 sy4Var2 = sy4Var;
                final qs2 qs2Var2 = qs2Var;
                final int i2 = i;
                final ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$1 showkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(X0.size(), null, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i3) {
                        return ss2.this.invoke(X0.get(i3));
                    }
                }, zr0.c(-632812321, true, new kt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, int i3, Composer composer2, int i4) {
                        int i5;
                        zq3.h(h04Var, "$this$items");
                        if ((i4 & 14) == 0) {
                            i5 = (composer2.S(h04Var) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i5 |= composer2.d(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) == 146 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        Map.Entry entry = (Map.Entry) X0.get(i3);
                        final String str = (String) entry.getKey();
                        String str2 = str + " (" + ShowkaseGroupsScreenKt.f((List) entry.getValue()) + ")";
                        composer2.z(1618982084);
                        boolean S = composer2.S(sy4Var2) | composer2.S(str) | composer2.S(qs2Var2);
                        Object A = composer2.A();
                        if (S || A == Composer.a.a()) {
                            final sy4 sy4Var3 = sy4Var2;
                            final qs2 qs2Var3 = qs2Var2;
                            A = new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m150invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m150invoke() {
                                    sy4 sy4Var4 = sy4.this;
                                    final String str3 = str;
                                    ShowkaseBrowserScreenMetadataKt.d(sy4Var4, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$1$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.ss2
                                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                        public final hr7 invoke(hr7 hr7Var) {
                                            zq3.h(hr7Var, "$this$update");
                                            return hr7.b(hr7Var, str3, null, null, null, false, null, 14, null);
                                        }
                                    });
                                    qs2Var3.mo865invoke();
                                }
                            };
                            composer2.q(A);
                        }
                        composer2.R();
                        CommonComponentsKt.a(str2, (qs2) A, composer2, 0);
                    }
                }));
            }
        }, h, 0, 255);
        Object m = h.m(AndroidCompositionLocals_androidKt.g());
        zq3.f(m, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        final jk jkVar = (jk) m;
        BackButtonHandlerKt.a(new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m151invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m151invoke() {
                sy4 sy4Var2 = sy4.this;
                n25 n25Var2 = n25Var;
                final jk jkVar2 = jkVar;
                ShowkaseCategoriesScreenKt.d(sy4Var2, n25Var2, new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m152invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m152invoke() {
                        jk.this.finish();
                    }
                });
            }
        }, h, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseGroupsScreen$3
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
                ShowkaseGroupsScreenKt.c(map, sy4Var, n25Var, qs2Var, composer2, i | 1);
            }
        });
    }

    public static final void d(final Map map, final sy4 sy4Var, final n25 n25Var, Composer composer, final int i) {
        zq3.h(map, "groupedTypographyMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        Composer h = composer.h(946867784);
        if (b.G()) {
            b.S(946867784, i, -1, "com.airbnb.android.showkase.ui.ShowkaseTypographyGroupsScreen (ShowkaseGroupsScreen.kt:111)");
        }
        if (map.size() == 1) {
            h.z(-1768702417);
            ShowkaseBrowserScreenMetadataKt.d(sy4Var, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseTypographyGroupsScreen$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final hr7 invoke(hr7 hr7Var) {
                    zq3.h(hr7Var, "$this$update");
                    return hr7.b(hr7Var, (String) ((Map.Entry) i.j0(map.entrySet())).getKey(), null, null, null, false, null, 62, null);
                }
            });
            ShowkaseTypographyInAGroupScreenKt.a(map, sy4Var, n25Var, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 520);
            h.R();
        } else {
            h.z(-1768702016);
            c(map, sy4Var, n25Var, new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseTypographyGroupsScreen$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m153invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m153invoke() {
                    ShowkaseBrowserAppKt.w(n25.this, ShowkaseCurrentScreen.TYPOGRAPHY_IN_A_GROUP);
                }
            }, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 520);
            h.R();
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseGroupsScreenKt$ShowkaseTypographyGroupsScreen$3
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
                ShowkaseGroupsScreenKt.d(map, sy4Var, n25Var, composer2, i | 1);
            }
        });
    }

    public static final Map e(Map map, sy4 sy4Var) {
        zq3.h(map, "map");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        boolean g = ((hr7) sy4Var.getValue()).g();
        if (!g) {
            return map;
        }
        String f = ((hr7) sy4Var.getValue()).f();
        if (g != (!(f == null || h.d0(f)))) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String f2 = ((hr7) sy4Var.getValue()).f();
            zq3.e(f2);
            if (ShowkaseComponentStylesScreenKt.g(f2, (String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final int f(List list) {
        zq3.h(list, "list");
        List W = i.W(list, gr7.class);
        if (W.isEmpty()) {
            return list.size();
        }
        new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = W.iterator();
        if (!it2.hasNext()) {
            return arrayList.size();
        }
        lh4.a(it2.next());
        throw null;
    }
}
