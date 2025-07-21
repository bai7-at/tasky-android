package com.airbnb.android.showkase.ui;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavDestination;
import com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt;
import com.airbnb.android.showkase.models.ShowkaseCategory;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.h04;
import defpackage.hr7;
import defpackage.jk;
import defpackage.kt2;
import defpackage.n25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class ShowkaseCategoriesScreenKt {
    public static final void a(final sy4 sy4Var, final n25 n25Var, final Map map, Composer composer, final int i) {
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        zq3.h(map, "categoryMetadataMap");
        Composer h = composer.h(-1029290343);
        if (b.G()) {
            b.S(-1029290343, i, -1, "com.airbnb.android.showkase.ui.ShowkaseCategoriesScreen (ShowkaseCategoriesScreen.kt:18)");
        }
        Object m = h.m(AndroidCompositionLocals_androidKt.g());
        zq3.f(m, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        final jk jkVar = (jk) m;
        LazyDslKt.a(null, null, null, false, null, null, null, false, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1
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
                final List X0 = i.X0(map.entrySet());
                final sy4 sy4Var2 = sy4Var;
                final n25 n25Var2 = n25Var;
                final ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$1 showkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(X0.size(), null, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i2) {
                        return ss2.this.invoke(X0.get(i2));
                    }
                }, zr0.c(-632812321, true, new kt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$invoke$$inlined$items$default$4
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
                        Map.Entry entry = (Map.Entry) X0.get(i2);
                        final ShowkaseCategory showkaseCategory = (ShowkaseCategory) entry.getKey();
                        int intValue = ((Number) entry.getValue()).intValue();
                        Locale locale = Locale.getDefault();
                        String name = showkaseCategory.name();
                        zq3.g(locale, "defaultLocale");
                        String lowerCase = name.toLowerCase(locale);
                        zq3.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        if (lowerCase.length() > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append((Object) kotlin.text.a.d(lowerCase.charAt(0), locale));
                            String substring = lowerCase.substring(1);
                            zq3.g(substring, "this as java.lang.String).substring(startIndex)");
                            sb.append(substring);
                            lowerCase = sb.toString();
                        }
                        String str = lowerCase + " (" + intValue + ")";
                        final sy4 sy4Var3 = sy4Var2;
                        final n25 n25Var3 = n25Var2;
                        CommonComponentsKt.a(str, new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$1$1

                            public /* synthetic */ class a {
                                public static final /* synthetic */ int[] a;

                                static {
                                    int[] iArr = new int[ShowkaseCategory.values().length];
                                    iArr[ShowkaseCategory.COMPONENTS.ordinal()] = 1;
                                    iArr[ShowkaseCategory.COLORS.ordinal()] = 2;
                                    iArr[ShowkaseCategory.TYPOGRAPHY.ordinal()] = 3;
                                    a = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m143invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m143invoke() {
                                ShowkaseBrowserScreenMetadataKt.d(sy4.this, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$1$1$1.1
                                    @Override // defpackage.ss2
                                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                    public final hr7 invoke(hr7 hr7Var) {
                                        zq3.h(hr7Var, "$this$update");
                                        return hr7.b(hr7Var, null, null, null, null, false, null, 14, null);
                                    }
                                });
                                int i5 = a.a[showkaseCategory.ordinal()];
                                if (i5 == 1) {
                                    ShowkaseBrowserAppKt.w(n25Var3, ShowkaseCurrentScreen.COMPONENT_GROUPS);
                                } else if (i5 == 2) {
                                    ShowkaseBrowserAppKt.w(n25Var3, ShowkaseCurrentScreen.COLOR_GROUPS);
                                } else {
                                    if (i5 != 3) {
                                        return;
                                    }
                                    ShowkaseBrowserAppKt.w(n25Var3, ShowkaseCurrentScreen.TYPOGRAPHY_GROUPS);
                                }
                            }
                        }, composer2, 0);
                    }
                }));
            }
        }, h, 0, 255);
        BackButtonHandlerKt.a(new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m144invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m144invoke() {
                ShowkaseCategoriesScreenKt.c(jk.this, sy4Var);
            }
        }, h, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseCategoriesScreenKt$ShowkaseCategoriesScreen$3
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
                ShowkaseCategoriesScreenKt.a(sy4.this, n25Var, map, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(jk jkVar, sy4 sy4Var) {
        if (((hr7) sy4Var.getValue()).g()) {
            ShowkaseBrowserScreenMetadataKt.b(sy4Var);
        } else {
            jkVar.finish();
        }
    }

    public static final void d(sy4 sy4Var, n25 n25Var, qs2 qs2Var) {
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        zq3.h(n25Var, "navController");
        zq3.h(qs2Var, "onBackPressOnRoot");
        if (((hr7) sy4Var.getValue()).g()) {
            ShowkaseBrowserScreenMetadataKt.b(sy4Var);
            return;
        }
        NavDestination E = n25Var.E();
        if (E != null && E.q() == n25Var.G().Q()) {
            qs2Var.mo865invoke();
        } else {
            ShowkaseBrowserScreenMetadataKt.a(sy4Var);
            ShowkaseBrowserAppKt.w(n25Var, ShowkaseCurrentScreen.SHOWKASE_CATEGORIES);
        }
    }
}
