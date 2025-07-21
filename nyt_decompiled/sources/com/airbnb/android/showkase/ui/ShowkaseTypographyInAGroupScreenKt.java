package com.airbnb.android.showkase.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.navigation.NavDestination;
import com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.h04;
import defpackage.hr7;
import defpackage.jk;
import defpackage.kt2;
import defpackage.lh4;
import defpackage.n25;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes.dex */
public abstract class ShowkaseTypographyInAGroupScreenKt {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            lh4.a(obj);
            throw null;
        }
    }

    public static final void a(final Map map, final sy4 sy4Var, final n25 n25Var, Composer composer, final int i) {
        List N0;
        zq3.h(map, "groupedTypographyMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        Composer h = composer.h(1717359353);
        if (b.G()) {
            b.S(1717359353, i, -1, "com.airbnb.android.showkase.ui.ShowkaseTypographyInAGroupScreen (ShowkaseTypographyInAGroupScreen.kt:25)");
        }
        Object m = h.m(AndroidCompositionLocals_androidKt.g());
        zq3.f(m, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        final jk jkVar = (jk) m;
        List list = (List) map.get(((hr7) sy4Var.getValue()).e());
        if (list == null || (N0 = i.N0(list, new a())) == null) {
            if (b.G()) {
                b.R();
            }
            cc7 k = h.k();
            if (k == null) {
                return;
            }
            k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$groupTypographyList$2
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
                    ShowkaseTypographyInAGroupScreenKt.a(map, sy4Var, n25Var, composer2, i | 1);
                }
            });
            return;
        }
        final List c = c(N0, (hr7) sy4Var.getValue());
        LazyDslKt.a(TestTagKt.a(SizeKt.f(BackgroundKt.d(Modifier.a, nn0.b.h(), null, 2, null), 0.0f, 1, null), "TypographyInAGroupList"), null, null, false, null, null, null, false, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$1
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
                final List<Object> list2 = c;
                final ShowkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$1$invoke$$inlined$items$default$1 showkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(list2.size(), null, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i2) {
                        return ss2.this.invoke(list2.get(i2));
                    }
                }, zr0.c(-632812321, true, new kt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$1$invoke$$inlined$items$default$4
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
                        Object obj = list2.get(i2);
                        int i5 = i4 & 14;
                        lh4.a(obj);
                        if ((i4 & 14) == 0) {
                            i5 |= composer2.S(h04Var) ? 4 : 2;
                        }
                        if (((i5 | (composer2.S(null) ? 32 : 16)) & 731) != 146) {
                            throw null;
                        }
                        if (!composer2.i()) {
                            throw null;
                        }
                        composer2.K();
                    }
                }));
            }
        }, h, 0, 254);
        BackButtonHandlerKt.a(new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m154invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m154invoke() {
                sy4 sy4Var2 = sy4.this;
                boolean z = map.size() == 1;
                n25 n25Var2 = n25Var;
                final jk jkVar2 = jkVar;
                ShowkaseTypographyInAGroupScreenKt.d(sy4Var2, z, n25Var2, new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m155invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m155invoke() {
                        jk.this.finish();
                    }
                });
            }
        }, h, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 == null) {
            return;
        }
        k2.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseTypographyInAGroupScreenKt$ShowkaseTypographyInAGroupScreen$3
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
                ShowkaseTypographyInAGroupScreenKt.a(map, sy4Var, n25Var, composer2, i | 1);
            }
        });
    }

    private static final List c(List list, hr7 hr7Var) {
        boolean g = hr7Var.g();
        if (!g) {
            return list;
        }
        String f = hr7Var.f();
        if (g != (!(f == null || h.d0(f)))) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return arrayList;
        }
        lh4.a(it2.next());
        zq3.e(hr7Var.f());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, boolean z, n25 n25Var, qs2 qs2Var) {
        if (((hr7) sy4Var.getValue()).g()) {
            ShowkaseBrowserScreenMetadataKt.b(sy4Var);
            return;
        }
        if (!z) {
            ShowkaseBrowserScreenMetadataKt.a(sy4Var);
            ShowkaseBrowserAppKt.w(n25Var, ShowkaseCurrentScreen.TYPOGRAPHY_GROUPS);
            return;
        }
        ShowkaseBrowserScreenMetadataKt.a(sy4Var);
        NavDestination E = n25Var.E();
        if (E == null || E.q() != n25Var.G().Q()) {
            ShowkaseBrowserAppKt.w(n25Var, ShowkaseCurrentScreen.SHOWKASE_CATEGORIES);
        } else {
            qs2Var.mo865invoke();
        }
    }
}
