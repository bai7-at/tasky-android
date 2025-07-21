package com.airbnb.android.showkase.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.ei0;
import defpackage.fm1;
import defpackage.fr7;
import defpackage.gt2;
import defpackage.h04;
import defpackage.hr7;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.lh4;
import defpackage.n25;
import defpackage.n37;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.rq1;
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
public abstract class ShowkaseColorsInAGroupScreenKt {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            lh4.a(obj);
            throw null;
        }
    }

    public static final void a(final Map map, final sy4 sy4Var, final n25 n25Var, Composer composer, final int i) {
        List N0;
        zq3.h(map, "groupedColorsMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        Composer h = composer.h(1290341081);
        if (b.G()) {
            b.S(1290341081, i, -1, "com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreen (ShowkaseColorsInAGroupScreen.kt:32)");
        }
        List list = (List) map.get(((hr7) sy4Var.getValue()).e());
        if (list == null || (N0 = i.N0(list, new a())) == null) {
            if (b.G()) {
                b.R();
            }
            cc7 k = h.k();
            if (k == null) {
                return;
            }
            k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$groupColorsList$2
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
                    ShowkaseColorsInAGroupScreenKt.a(map, sy4Var, n25Var, composer2, i | 1);
                }
            });
            return;
        }
        final List c = c(N0, sy4Var);
        LazyDslKt.a(TestTagKt.a(Modifier.a, "ColorsInAGroupList"), null, null, false, null, null, null, false, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$1
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
                final List<fr7> list2 = c;
                final ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$1$invoke$$inlined$items$default$1 showkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(list2.size(), null, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$1$invoke$$inlined$items$default$3
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
                }, zr0.c(-632812321, true, new kt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$1$invoke$$inlined$items$default$4
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
                            i4 = i3 | (composer2.S(h04Var) ? 4 : 2);
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
                        int i5 = i4 & 14;
                        lh4.a(list2.get(i2));
                        if ((i4 & 14) == 0) {
                            i5 |= composer2.S(h04Var) ? 4 : 2;
                        }
                        fr7 fr7Var = null;
                        if (((i5 | (composer2.S(null) ? 32 : 16)) & 731) == 146 && composer2.i()) {
                            composer2.K();
                        } else {
                            ei0.a(PaddingKt.l(Modifier.a, rq1.c(), rq1.b(), rq1.c(), rq1.b()), null, 0L, 0L, null, 0.0f, zr0.b(composer2, 584603958, true, new gt2(fr7Var) { // from class: com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$1$1$1
                                final /* synthetic */ fr7 $groupColorMetadata;

                                {
                                    super(2);
                                }

                                @Override // defpackage.gt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(Composer composer3, int i6) {
                                    if ((i6 & 11) == 2 && composer3.i()) {
                                        composer3.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(584603958, i6, -1, "com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreen.<anonymous>.<anonymous>.<anonymous> (ShowkaseColorsInAGroupScreen.kt:52)");
                                    }
                                    Modifier i7 = PaddingKt.i(h04.d(h04.this, Modifier.a, 0.0f, 1, null), rq1.c());
                                    Arrangement.f d = Arrangement.a.d();
                                    Alignment.c i8 = Alignment.a.i();
                                    composer3.z(693286680);
                                    rg4 a2 = m.a(d, i8, composer3, 54);
                                    composer3.z(-1323940314);
                                    fm1 fm1Var = (fm1) composer3.m(CompositionLocalsKt.e());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                                    r99 r99Var = (r99) composer3.m(CompositionLocalsKt.p());
                                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                                    qs2 a3 = companion.a();
                                    it2 b = LayoutKt.b(i7);
                                    if (composer3.j() == null) {
                                        cs0.c();
                                    }
                                    composer3.G();
                                    if (composer3.f()) {
                                        composer3.D(a3);
                                    } else {
                                        composer3.p();
                                    }
                                    composer3.H();
                                    Composer a4 = Updater.a(composer3);
                                    Updater.c(a4, a2, companion.e());
                                    Updater.c(a4, fm1Var, companion.c());
                                    Updater.c(a4, layoutDirection, companion.d());
                                    Updater.c(a4, r99Var, companion.h());
                                    composer3.c();
                                    b.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                                    composer3.z(2058660585);
                                    composer3.z(-678309503);
                                    n37 n37Var = n37.a;
                                    throw null;
                                }
                            }), composer2, 1572864, 62);
                        }
                    }
                }));
            }
        }, h, 6, 254);
        BackButtonHandlerKt.a(new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m145invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m145invoke() {
                ShowkaseColorsInAGroupScreenKt.d(sy4.this, n25Var);
            }
        }, h, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 == null) {
            return;
        }
        k2.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$3
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
                ShowkaseColorsInAGroupScreenKt.a(map, sy4Var, n25Var, composer2, i | 1);
            }
        });
    }

    public static final List c(List list, sy4 sy4Var) {
        zq3.h(list, "list");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        boolean g = ((hr7) sy4Var.getValue()).g();
        if (!g) {
            return list;
        }
        String f = ((hr7) sy4Var.getValue()).f();
        if (g != (!(f == null || h.d0(f)))) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return arrayList;
        }
        lh4.a(it2.next());
        zq3.e(((hr7) sy4Var.getValue()).f());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, n25 n25Var) {
        if (((hr7) sy4Var.getValue()).g()) {
            ShowkaseBrowserScreenMetadataKt.b(sy4Var);
        } else {
            ShowkaseBrowserScreenMetadataKt.a(sy4Var);
            ShowkaseBrowserAppKt.w(n25Var, ShowkaseCurrentScreen.COLOR_GROUPS);
        }
    }
}
