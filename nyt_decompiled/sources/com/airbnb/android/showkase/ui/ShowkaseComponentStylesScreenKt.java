package com.airbnb.android.showkase.ui;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gr7;
import defpackage.gt2;
import defpackage.h04;
import defpackage.hr7;
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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes.dex */
public abstract class ShowkaseComponentStylesScreenKt {
    public static final void b(final Map map, final sy4 sy4Var, final n25 n25Var, Composer composer, final int i) {
        zq3.h(map, "groupedComponentMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        Composer h = composer.h(-627798939);
        if (b.G()) {
            b.S(-627798939, i, -1, "com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreen (ShowkaseComponentStylesScreen.kt:14)");
        }
        List list = (List) map.get(((hr7) sy4Var.getValue()).e());
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                throw null;
            }
            final List N0 = i.N0(arrayList, new Comparator() { // from class: ir7
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c;
                    lh4.a(obj);
                    lh4.a(obj2);
                    c = ShowkaseComponentStylesScreenKt.c(null, null);
                    return c;
                }
            });
            if (N0 != null) {
                final List f = f(N0, sy4Var);
                LazyDslKt.a(null, null, null, false, null, null, null, false, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1
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
                        final List<gr7> list2 = f;
                        final List<gr7> list3 = N0;
                        final sy4 sy4Var2 = sy4Var;
                        final n25 n25Var2 = n25Var;
                        final ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$1 showkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$1
                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final Void invoke(Object obj) {
                                return null;
                            }
                        };
                        lazyListScope.b(list2.size(), null, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$3
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
                        }, zr0.c(-632812321, true, new kt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$1$invoke$$inlined$items$default$4
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
                                int i5 = i4 & 14;
                                lh4.a(list2.get(i2));
                                if (((i5 | (composer2.S(null) ? 32 : 16)) & 721) != 144) {
                                    throw null;
                                }
                                if (!composer2.i()) {
                                    throw null;
                                }
                                composer2.K();
                            }
                        }));
                    }
                }, h, 0, 255);
                BackButtonHandlerKt.a(new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m146invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m146invoke() {
                        ShowkaseComponentStylesScreenKt.e(sy4.this, n25Var);
                    }
                }, h, 0);
                if (b.G()) {
                    b.R();
                }
                cc7 k = h.k();
                if (k == null) {
                    return;
                }
                k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$3
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
                        ShowkaseComponentStylesScreenKt.b(map, sy4Var, n25Var, composer2, i | 1);
                    }
                });
                return;
            }
        }
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 == null) {
            return;
        }
        k2.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$ShowkaseComponentStylesScreen$componentStylesList$3
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
                ShowkaseComponentStylesScreenKt.b(map, sy4Var, n25Var, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(gr7 gr7Var, gr7 gr7Var2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(sy4 sy4Var, n25 n25Var) {
        if (((hr7) sy4Var.getValue()).g()) {
            ShowkaseBrowserScreenMetadataKt.b(sy4Var);
        } else {
            ShowkaseBrowserScreenMetadataKt.d(sy4Var, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseComponentStylesScreenKt$back$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final hr7 invoke(hr7 hr7Var) {
                    zq3.h(hr7Var, "$this$update");
                    return hr7.b(hr7Var, null, null, null, null, false, null, 11, null);
                }
            });
            ShowkaseBrowserAppKt.w(n25Var, ShowkaseCurrentScreen.COMPONENTS_IN_A_GROUP);
        }
    }

    private static final List f(List list, sy4 sy4Var) {
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

    public static final boolean g(String str, String... strArr) {
        zq3.h(str, "searchQuery");
        zq3.h(strArr, "properties");
        for (String str2 : strArr) {
            if (h.N(str2, str, true)) {
                return true;
            }
        }
        return false;
    }
}
