package com.nytimes.android.preference;

import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.j;
import androidx.fragment.app.Fragment;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.features.giftsharehub.GiftShareHubActivity;
import com.nytimes.android.unfear.reader.model.ImageElement;
import com.nytimes.android.utils.composeutils.PreferenceItemComposableKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.e52;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h03;
import defpackage.i03;
import defpackage.it2;
import defpackage.j03;
import defpackage.jk;
import defpackage.ju7;
import defpackage.k48;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.s42;
import defpackage.s5;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.z12;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class GiftShareHubPreferenceLayoutKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final j03 j03Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(45838218);
        if ((i & 14) == 0) {
            i2 = (h.S(j03Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(45838218, i2, -1, "com.nytimes.android.preference.Footer (GiftShareHubPreferenceLayout.kt:171)");
            }
            ComponentActivity d = s5.d(h, 0);
            zq3.f(d, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            final jk jkVar = (jk) d;
            Modifier.a aVar = Modifier.a;
            PreferenceDividersKt.b(PaddingKt.m(aVar, 0.0f, bu1.g(8), 0.0f, 0.0f, 13, null), h, 6, 0);
            PreferenceItemComposableKt.b(k48.b(xk6.giftShareHub_seeAll, h, 0), null, null, new qs2() { // from class: com.nytimes.android.preference.GiftShareHubPreferenceLayoutKt$Footer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m638invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m638invoke() {
                    GiftShareHubPreferenceLayoutKt.i(jk.this);
                    GiftShareHubPreferenceLayoutKt.j(j03Var);
                }
            }, null, null, h, 0, 54);
            SpacerKt.a(PaddingKt.m(aVar, 0.0f, bu1.g(20), 0.0f, 0.0f, 13, null), h, 6);
            PreferenceDividersKt.a(null, h, 0, 1);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.preference.GiftShareHubPreferenceLayoutKt$Footer$2
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
                    GiftShareHubPreferenceLayoutKt.a(j03.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final List list, Composer composer, final int i) {
        Object obj;
        zq3.h(list, "gifts");
        Composer h = composer.h(-667256832);
        if (b.G()) {
            b.S(-667256832, i, -1, "com.nytimes.android.preference.GiftShareHubPreferenceLayout (GiftShareHubPreferenceLayout.kt:54)");
        }
        if (!list.isEmpty()) {
            h.z(58311503);
            Context applicationContext = ((Context) h.m(AndroidCompositionLocals_androidKt.g())).getApplicationContext();
            h.z(897370989);
            Object A = h.A();
            if (A == Composer.a.a()) {
                try {
                    zq3.e(applicationContext);
                    obj = z12.b(applicationContext, j03.class);
                } catch (Exception unused) {
                    obj = null;
                }
                A = obj;
                h.q(A);
            }
            h.R();
            h.R();
            final j03 j03Var = (j03) A;
            if (j03Var == null || !j03Var.b().g()) {
                if (b.G()) {
                    b.R();
                }
                cc7 k = h.k();
                if (k != null) {
                    k.a(new gt2() { // from class: com.nytimes.android.preference.GiftShareHubPreferenceLayoutKt$GiftShareHubPreferenceLayout$1
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
                            GiftShareHubPreferenceLayoutKt.b(list, composer2, gt6.a(i | 1));
                        }
                    });
                    return;
                }
                return;
            }
            final ComponentActivity d = s5.d(h, 0);
            final Fragment fragment = (Fragment) h.m(ComposablePreferenceKt.a());
            NytThemeKt.a(false, null, null, zr0.b(h, -319232523, true, new gt2() { // from class: com.nytimes.android.preference.GiftShareHubPreferenceLayoutKt$GiftShareHubPreferenceLayout$2
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
                    if ((i2 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-319232523, i2, -1, "com.nytimes.android.preference.GiftShareHubPreferenceLayout.<anonymous> (GiftShareHubPreferenceLayout.kt:63)");
                    }
                    final List<h03.a> list2 = list;
                    final j03 j03Var2 = j03Var;
                    final ComponentActivity componentActivity = d;
                    final Fragment fragment2 = fragment;
                    SurfaceKt.a(null, null, 0L, 0L, null, 0.0f, zr0.b(composer2, 1595520825, true, new gt2() { // from class: com.nytimes.android.preference.GiftShareHubPreferenceLayoutKt$GiftShareHubPreferenceLayout$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 11) == 2 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(1595520825, i3, -1, "com.nytimes.android.preference.GiftShareHubPreferenceLayout.<anonymous>.<anonymous> (GiftShareHubPreferenceLayout.kt:64)");
                            }
                            Modifier d2 = BackgroundKt.d(Modifier.a, eb5.Companion.a(composer3, 8).a(), null, 2, null);
                            List<h03.a> list3 = list2;
                            final j03 j03Var3 = j03Var2;
                            final ComponentActivity componentActivity2 = componentActivity;
                            final Fragment fragment3 = fragment2;
                            composer3.z(-483455358);
                            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                            composer3.z(-1323940314);
                            int a2 = cs0.a(composer3, 0);
                            et0 o = composer3.o();
                            ComposeUiNode.Companion companion = ComposeUiNode.F;
                            qs2 a3 = companion.a();
                            it2 c = LayoutKt.c(d2);
                            if (composer3.j() == null) {
                                cs0.c();
                            }
                            composer3.G();
                            if (composer3.f()) {
                                composer3.D(a3);
                            } else {
                                composer3.p();
                            }
                            Composer a4 = Updater.a(composer3);
                            Updater.c(a4, a, companion.e());
                            Updater.c(a4, o, companion.g());
                            gt2 b = companion.b();
                            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                                a4.q(Integer.valueOf(a2));
                                a4.v(Integer.valueOf(a2), b);
                            }
                            c.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                            composer3.z(2058660585);
                            ap0 ap0Var = ap0.a;
                            GiftShareHubPreferenceLayoutKt.d(composer3, 0);
                            composer3.z(-1560331349);
                            for (final h03.a aVar : list3) {
                                String c2 = aVar.c();
                                GiftShareHubPreferenceLayoutKt.c(aVar.a(), aVar.f(), aVar.j(), c2 != null ? new ImageElement(aVar.b(), aVar.d(), c2, (String) null, (String) null, 16, (DefaultConstructorMarker) null) : null, new qs2() { // from class: com.nytimes.android.preference.GiftShareHubPreferenceLayoutKt$GiftShareHubPreferenceLayout$2$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m639invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m639invoke() {
                                        if (!j03.this.b().g() || componentActivity2 == null) {
                                            return;
                                        }
                                        j03.this.c().b(i03.a(aVar, "account-page"), componentActivity2, fragment3);
                                    }
                                }, null, composer3, ImageElement.f << 9, 32);
                            }
                            composer3.R();
                            GiftShareHubPreferenceLayoutKt.a(j03Var3, composer3, 0);
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
        }
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.preference.GiftShareHubPreferenceLayoutKt$GiftShareHubPreferenceLayout$3
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
                    GiftShareHubPreferenceLayoutKt.b(list, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r40, final java.lang.String r41, final boolean r42, final com.nytimes.android.unfear.reader.model.ImageElement r43, final defpackage.qs2 r44, androidx.compose.ui.Modifier r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.preference.GiftShareHubPreferenceLayoutKt.c(java.lang.String, java.lang.String, boolean, com.nytimes.android.unfear.reader.model.ImageElement, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Composer composer, final int i) {
        Composer composer2;
        Composer h = composer.h(-2066155488);
        if (i == 0 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-2066155488, i, -1, "com.nytimes.android.preference.Header (GiftShareHubPreferenceLayout.kt:156)");
            }
            PreferenceDividersKt.a(null, h, 0, 1);
            String b = k48.b(xk6.giftShareHub_section_title, h, 0);
            j p1 = eb5.Companion.c(h, 8).p1();
            float f = 16;
            composer2 = h;
            TextKt.c(b, PaddingKt.l(Modifier.a, bu1.g(f), bu1.g(24), bu1.g(f), bu1.g(8)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p1, composer2, 0, 0, 65532);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.preference.GiftShareHubPreferenceLayoutKt$Header$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i2) {
                    GiftShareHubPreferenceLayoutKt.d(composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(jk jkVar) {
        jkVar.startActivity(new Intent(jkVar, (Class<?>) GiftShareHubActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(j03 j03Var) {
        ET2PageScope.DefaultImpls.a(j03Var.d(), new e52.e(), new s42("enter-gift-hub", null, null, null, null, null, null, null, "account-page", 254, null), null, null, 12, null);
    }
}
