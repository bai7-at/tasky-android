package com.nytimes.android.preference;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.j;
import androidx.fragment.app.Fragment;
import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.AssetUtils;
import com.nytimes.android.comments.comments.data.store.CommentsStore;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.unfear.reader.composable.PromoLayoutsKt;
import com.nytimes.android.unfear.reader.model.ImageElement;
import com.nytimes.android.unfear.reader.model.a;
import com.nytimes.android.utils.composeutils.PreferenceItemComposableKt;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.ck3;
import defpackage.cm6;
import defpackage.cs0;
import defpackage.d56;
import defpackage.dk3;
import defpackage.du5;
import defpackage.du8;
import defpackage.e52;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.jk;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.n37;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.s42;
import defpackage.s5;
import defpackage.ss2;
import defpackage.tr3;
import defpackage.u32;
import defpackage.vt5;
import defpackage.ww8;
import defpackage.x08;
import defpackage.y25;
import defpackage.y32;
import defpackage.z12;
import defpackage.z87;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class SavedForLaterPreferenceLayoutKt {
    private static final Map a = t.f(du8.a("savedForLaterIcon", new ck3(new vt5(ek8.g(16), ek8.g(16), du5.a.e(), null), ComposableSingletons$SavedForLaterPreferenceLayoutKt.a.a())));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r31, final int r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt.a(java.lang.String, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    public static final void b(final Asset asset, final int i, final ss2 ss2Var, Modifier modifier, Composer composer, final int i2, final int i3) {
        ?? r4;
        float f;
        int i4;
        zq3.h(asset, "asset");
        zq3.h(ss2Var, "onClick");
        Composer h = composer.h(-980531805);
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-980531805, i2, -1, "com.nytimes.android.preference.AssetSmallLayout (SavedForLaterPreferenceLayout.kt:227)");
        }
        Alignment.a aVar = Alignment.a;
        Alignment.c i5 = aVar.i();
        float f2 = 16;
        Modifier j = PaddingKt.j(ClickableKt.e(modifier2, false, null, null, new qs2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$AssetSmallLayout$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m641invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m641invoke() {
                ss2.this.invoke(asset);
            }
        }, 7, null), bu1.g(f2), bu1.g(6));
        h.z(693286680);
        Arrangement arrangement = Arrangement.a;
        rg4 a2 = m.a(arrangement.f(), i5, h, 48);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(j);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a4);
        } else {
            h.p();
        }
        Composer a5 = Updater.a(h);
        Updater.c(a5, a2, companion.e());
        Updater.c(a5, o, companion.g());
        gt2 b = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        Modifier.a aVar2 = Modifier.a;
        Modifier b2 = m37.b(n37Var, aVar2, 1.0f, false, 2, null);
        h.z(-483455358);
        rg4 a6 = d.a(arrangement.g(), aVar.k(), h, 0);
        h.z(-1323940314);
        int a7 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a8 = companion.a();
        it2 c2 = LayoutKt.c(b2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a8);
        } else {
            h.p();
        }
        Composer a9 = Updater.a(h);
        Updater.c(a9, a6, companion.e());
        Updater.c(a9, o2, companion.g());
        gt2 b3 = companion.b();
        if (a9.f() || !zq3.c(a9.A(), Integer.valueOf(a7))) {
            a9.q(Integer.valueOf(a7));
            a9.v(Integer.valueOf(a7), b3);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        String title = asset.getTitle();
        h.z(-1809782740);
        if (title != null) {
            r4 = 0;
            i4 = 48;
            f = f2;
            TextKt.c(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).K(), h, 0, 0, 65534);
        } else {
            r4 = 0;
            f = f2;
            i4 = 48;
        }
        h.R();
        a(DateUtils.getRelativeTimeSpanString(asset.lastUpdated().toInstant().toEpochMilli()).toString(), i, PaddingKt.m(aVar2, 0.0f, bu1.g(4), 0.0f, 0.0f, 13, null), h, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 384, 0);
        h.R();
        h.t();
        h.R();
        h.R();
        d56 c3 = a.c(asset, ImageElement.Dimension.SQUARE_THUMBNAIL, r4, 2, null);
        h.z(580255930);
        if (c3 != null) {
            PromoLayoutsKt.b(c3, SizeKt.n(PaddingKt.m(aVar2, bu1.g(f), 0.0f, 0.0f, 0.0f, 14, null), bu1.g(84)), h, i4 | d56.c, r4);
        }
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
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$AssetSmallLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    SavedForLaterPreferenceLayoutKt.b(Asset.this, i, ss2Var, modifier3, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final z87 z87Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-718642728);
        if ((i & 14) == 0) {
            i2 = (h.S(z87Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-718642728, i2, -1, "com.nytimes.android.preference.SavedForLaterEmpty (SavedForLaterPreferenceLayout.kt:154)");
            }
            androidx.compose.ui.text.a l = l(k48.b(cm6.savedForLater_empty_msg_head, h, 0));
            h.z(-1473459176);
            qs2 k = z87Var.b().g() ? k(z87Var, z87Var.g(), z87Var.d(), h, (i2 & 14) | 512 | (DeepLinkManager.h << 3)) : null;
            h.R();
            PreferenceItemComposableKt.a(null, null, l, a, k, null, null, h, 4102, 98);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$SavedForLaterEmpty$1
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
                    SavedForLaterPreferenceLayoutKt.c(z87.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void d(Composer composer, final int i) {
        Object obj;
        Composer h = composer.h(-1977577874);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1977577874, i, -1, "com.nytimes.android.preference.SavedForLaterPreferenceLayout (SavedForLaterPreferenceLayout.kt:83)");
            }
            h.z(58311503);
            Context applicationContext = ((Context) h.m(AndroidCompositionLocals_androidKt.g())).getApplicationContext();
            h.z(897370989);
            Object A = h.A();
            if (A == Composer.a.a()) {
                try {
                    zq3.e(applicationContext);
                    obj = z12.b(applicationContext, z87.class);
                } catch (Exception unused) {
                    obj = null;
                }
                A = obj;
                h.q(A);
            }
            h.R();
            h.R();
            final z87 z87Var = (z87) A;
            if (z87Var == null || !z87Var.b().g() || z87Var.a().G()) {
                if (b.G()) {
                    b.R();
                }
                cc7 k = h.k();
                if (k != null) {
                    k.a(new gt2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$SavedForLaterPreferenceLayout$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            SavedForLaterPreferenceLayoutKt.d(composer2, gt6.a(i | 1));
                        }
                    });
                    return;
                }
                return;
            }
            NytThemeKt.a(false, null, null, zr0.b(h, -231444770, true, new gt2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$SavedForLaterPreferenceLayout$2
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-231444770, i2, -1, "com.nytimes.android.preference.SavedForLaterPreferenceLayout.<anonymous> (SavedForLaterPreferenceLayout.kt:88)");
                    }
                    final z87 z87Var2 = z87.this;
                    SurfaceKt.a(null, null, 0L, 0L, null, 0.0f, zr0.b(composer2, -734919134, true, new gt2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$SavedForLaterPreferenceLayout$2.1
                        {
                            super(2);
                        }

                        private static final List b(x08 x08Var) {
                            return (List) x08Var.getValue();
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            int i4;
                            if ((i3 & 11) == 2 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(-734919134, i3, -1, "com.nytimes.android.preference.SavedForLaterPreferenceLayout.<anonymous>.<anonymous> (SavedForLaterPreferenceLayout.kt:89)");
                            }
                            Modifier.a aVar = Modifier.a;
                            eb5.a aVar2 = eb5.Companion;
                            Modifier d = BackgroundKt.d(aVar, aVar2.a(composer3, 8).a(), null, 2, null);
                            z87 z87Var3 = z87.this;
                            composer3.z(-483455358);
                            rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                            composer3.z(-1323940314);
                            int a3 = cs0.a(composer3, 0);
                            et0 o = composer3.o();
                            ComposeUiNode.Companion companion = ComposeUiNode.F;
                            qs2 a4 = companion.a();
                            it2 c = LayoutKt.c(d);
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
                            gt2 b = companion.b();
                            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                                a5.q(Integer.valueOf(a3));
                                a5.v(Integer.valueOf(a3), b);
                            }
                            c.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                            composer3.z(2058660585);
                            ap0 ap0Var = ap0.a;
                            PreferenceDividersKt.a(null, composer3, 0, 1);
                            String b2 = k48.b(cm6.savedForLater_section_title, composer3, 0);
                            j p1 = aVar2.c(composer3, 8).p1();
                            float f = 16;
                            TextKt.c(b2, PaddingKt.l(aVar, bu1.g(f), bu1.g(24), bu1.g(f), bu1.g(8)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p1, composer3, 0, 0, 65532);
                            x08 l = y.l(i.l(), new SavedForLaterPreferenceLayoutKt$SavedForLaterPreferenceLayout$2$1$1$assets$2(z87Var3, null), composer3, 70);
                            if (b(l).isEmpty() || !z87Var3.b().g()) {
                                composer3.z(1422744915);
                                i4 = 0;
                                SavedForLaterPreferenceLayoutKt.c(z87Var3, composer3, 0);
                                composer3.R();
                            } else {
                                composer3.z(1422744507);
                                SavedForLaterPreferenceLayoutKt.e(z87Var3, b(l), z87Var3.j(), z87Var3.g(), z87Var3.c(), z87Var3.d(), composer3, (DeepLinkManager.h << 9) | (CommentsStore.$stable << 6) | 294976);
                                composer3.R();
                                i4 = 0;
                            }
                            SpacerKt.a(PaddingKt.m(aVar, 0.0f, bu1.g(20), 0.0f, 0.0f, 13, null), composer3, 6);
                            PreferenceDividersKt.a(null, composer3, i4, 1);
                            composer3.R();
                            composer3.t();
                            composer3.R();
                            composer3.R();
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer2, 1572864, 63);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$SavedForLaterPreferenceLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    SavedForLaterPreferenceLayoutKt.d(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final z87 z87Var, final List list, final CommentsStore commentsStore, final DeepLinkManager deepLinkManager, final tr3 tr3Var, final ET2Scope eT2Scope, Composer composer, final int i) {
        Composer h = composer.h(2085857799);
        if (b.G()) {
            b.S(2085857799, i, -1, "com.nytimes.android.preference.SavedForLaterSmallItems (SavedForLaterPreferenceLayout.kt:186)");
        }
        final ComponentActivity d = s5.d(h, 0);
        final Fragment fragment = (Fragment) h.m(ComposablePreferenceKt.a());
        h.z(1151561939);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Asset asset = (Asset) it2.next();
            b(asset, j(asset, commentsStore, h, 8 | (CommentsStore.$stable << 3) | ((i >> 3) & ContentType.LONG_FORM_ON_DEMAND)), new ss2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$SavedForLaterSmallItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(Asset asset2) {
                    y25 m;
                    zq3.h(asset2, "clickAsset");
                    if (!z87.this.b().g() || d == null) {
                        return;
                    }
                    tr3 tr3Var2 = tr3Var;
                    m = SavedForLaterPreferenceLayoutKt.m(asset2);
                    tr3Var2.b(m, d, fragment);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Asset) obj);
                    return ww8.a;
                }
            }, null, h, 8, 8);
        }
        h.R();
        PreferenceDividersKt.b(PaddingKt.m(Modifier.a, 0.0f, bu1.g(8), 0.0f, 0.0f, 13, null), h, 6, 0);
        String b = k48.b(cm6.savedForLater_seeAll, h, 0);
        h.z(1151562615);
        qs2 k = z87Var.b().g() ? k(z87Var, deepLinkManager, eT2Scope, h, (i & 14) | 512 | (DeepLinkManager.h << 3) | ((i >> 6) & ContentType.LONG_FORM_ON_DEMAND)) : null;
        h.R();
        PreferenceItemComposableKt.b(b, null, null, k, null, null, h, 0, 54);
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$SavedForLaterSmallItems$2
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
                    SavedForLaterPreferenceLayoutKt.e(z87.this, list, commentsStore, deepLinkManager, tr3Var, eT2Scope, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final int j(Asset asset, CommentsStore commentsStore, Composer composer, int i) {
        composer.z(-2028161267);
        if (b.G()) {
            b.S(-2028161267, i, -1, "com.nytimes.android.preference.commentCount (SavedForLaterPreferenceLayout.kt:348)");
        }
        int intValue = ((Number) y.l(0, new SavedForLaterPreferenceLayoutKt$commentCount$1(asset, commentsStore, null), composer, 70).getValue()).intValue();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return intValue;
    }

    private static final qs2 k(final z87 z87Var, final DeepLinkManager deepLinkManager, final ET2Scope eT2Scope, Composer composer, int i) {
        composer.z(-58942108);
        if (b.G()) {
            b.S(-58942108, i, -1, "com.nytimes.android.preference.openSavedForLaterActivity (SavedForLaterPreferenceLayout.kt:303)");
        }
        ComponentActivity d = s5.d(composer, 0);
        zq3.f(d, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        final jk jkVar = (jk) d;
        composer.z(773894976);
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, composer));
            composer.q(eVar);
            A = eVar;
        }
        composer.R();
        final CoroutineScope a2 = ((e) A).a();
        composer.R();
        qs2 qs2Var = new qs2() { // from class: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$openSavedForLaterActivity$1

            @fc1(c = "com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$openSavedForLaterActivity$1$1", f = "SavedForLaterPreferenceLayout.kt", l = {321}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.preference.SavedForLaterPreferenceLayoutKt$openSavedForLaterActivity$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ jk $activity;
                final /* synthetic */ DeepLinkManager $deepLinkManager;
                final /* synthetic */ ET2Scope $et2Scope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ET2Scope eT2Scope, DeepLinkManager deepLinkManager, jk jkVar, by0 by0Var) {
                    super(2, by0Var);
                    this.$et2Scope = eT2Scope;
                    this.$deepLinkManager = deepLinkManager;
                    this.$activity = jkVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$et2Scope, this.$deepLinkManager, this.$activity, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object d;
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        ET2PageScope.DefaultImpls.a(this.$et2Scope, new e52.e(), new s42("section front tap", null, null, null, null, null, null, new y32(null, null, null, null, null, null, 63, null), null, 382, null), new u32(null, "about", "tap", 1, null), null, 8, null);
                        DeepLinkManager deepLinkManager = this.$deepLinkManager;
                        jk jkVar = this.$activity;
                        this.label = 1;
                        d = deepLinkManager.d(jkVar, "nytimes://reader/saved/", "Settings", this);
                        if (d == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                        d = obj;
                    }
                    this.$activity.startActivity((Intent) d);
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m642invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m642invoke() {
                if (z87.this.b().g()) {
                    BuildersKt__Builders_commonKt.launch$default(a2, null, null, new AnonymousClass1(eT2Scope, deepLinkManager, jkVar, null), 3, null);
                }
            }
        };
        if (b.G()) {
            b.R();
        }
        composer.R();
        return qs2Var;
    }

    private static final androidx.compose.ui.text.a l(String str) {
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        List F0 = h.F0(str, new String[]{"^"}, false, 0, 6, null);
        c0064a.i((String) F0.get(0));
        dk3.a(c0064a, "savedForLaterIcon", "Saved for Later");
        c0064a.i((String) F0.get(1));
        return c0064a.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y25 m(Asset asset) {
        return new y25(asset.getUrl(), AssetConstants.ARTICLE_TYPE, asset.getSafeUri(), asset.getSectionContentName(), asset.getSectionDisplayName(), AssetUtils.isInteractive(asset) || AssetUtils.isPromo(asset), false, null, null, NavigationSource.SAVED_SETTINGS, null, null, null, null, null, null, null, null, null, 450816, null);
    }
}
