package com.airbnb.android.showkase.ui;

import android.content.Context;
import android.content.res.Configuration;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt;
import com.airbnb.android.showkase.models.ShowkaseCategory;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.aj8;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d44;
import defpackage.dj7;
import defpackage.du8;
import defpackage.ek8;
import defpackage.fe5;
import defpackage.fm1;
import defpackage.fr7;
import defpackage.gm6;
import defpackage.gr7;
import defpackage.gt2;
import defpackage.hr7;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kj8;
import defpackage.lh4;
import defpackage.lj7;
import defpackage.m25;
import defpackage.mj7;
import defpackage.n25;
import defpackage.n37;
import defpackage.nn0;
import defpackage.o23;
import defpackage.o76;
import defpackage.qs2;
import defpackage.qt6;
import defpackage.r99;
import defpackage.rg4;
import defpackage.rq1;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.to0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class ShowkaseBrowserAppKt {
    private static final float a = bu1.g(16);

    public static final class a implements fe5 {
        final /* synthetic */ d44 a;

        a(d44 d44Var) {
            this.a = d44Var;
        }

        @Override // defpackage.d44
        public Lifecycle getLifecycle() {
            Lifecycle lifecycle = this.a.getLifecycle();
            zq3.g(lifecycle, "lifecycleOwner.lifecycle");
            return lifecycle;
        }

        @Override // defpackage.fe5
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return new OnBackPressedDispatcher();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Modifier modifier, final String str, final String str2, final String str3, final String str4, Composer composer, final int i) {
        int i2;
        String str5;
        Composer h = composer.h(-203770364);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(str2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.S(str3) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= h.S(str4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i2) == 9362 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-203770364, i2, -1, "com.airbnb.android.showkase.ui.AppBarTitle (ShowkaseBrowserApp.kt:227)");
            }
            Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
            if (zq3.c(str, ShowkaseCurrentScreen.SHOWKASE_CATEGORIES.name())) {
                h.z(-979808491);
                String string = context.getString(gm6.showkase_title);
                zq3.g(string, "context.getString(R.string.showkase_title)");
                i(string, modifier, h, (i2 << 3) & ContentType.LONG_FORM_ON_DEMAND);
                h.R();
            } else if (zq3.c(str, ShowkaseCurrentScreen.COMPONENT_GROUPS.name())) {
                h.z(-979808329);
                String string2 = context.getString(gm6.components_category);
                zq3.g(string2, "context.getString(R.string.components_category)");
                i(string2, modifier, h, (i2 << 3) & ContentType.LONG_FORM_ON_DEMAND);
                h.R();
            } else if (zq3.c(str, ShowkaseCurrentScreen.COLOR_GROUPS.name())) {
                h.z(-979808166);
                String string3 = context.getString(gm6.colors_category);
                zq3.g(string3, "context.getString(R.string.colors_category)");
                i(string3, modifier, h, (i2 << 3) & ContentType.LONG_FORM_ON_DEMAND);
                h.R();
            } else if (zq3.c(str, ShowkaseCurrentScreen.TYPOGRAPHY_GROUPS.name())) {
                h.z(-979808002);
                String string4 = context.getString(gm6.typography_category);
                zq3.g(string4, "context.getString(R.string.typography_category)");
                i(string4, modifier, h, (i2 << 3) & ContentType.LONG_FORM_ON_DEMAND);
                h.R();
            } else if (ShowkaseBrowserScreenMetadataKt.c(str)) {
                h.z(-979807868);
                i(str2 == null ? "currentGroup" : str2, modifier, h, (i2 << 3) & ContentType.LONG_FORM_ON_DEMAND);
                h.R();
            } else {
                if (zq3.c(str, ShowkaseCurrentScreen.COMPONENT_STYLES.name())) {
                    h.z(-979807718);
                    i(str3 != null ? str3 : "", modifier, h, (i2 << 3) & ContentType.LONG_FORM_ON_DEMAND);
                    h.R();
                } else if (zq3.c(str, ShowkaseCurrentScreen.COMPONENT_DETAIL.name())) {
                    h.z(-979807568);
                    if (str4 != null) {
                        str5 = "[" + str4 + "]";
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    i((str3 != null ? str3 : "") + " " + str5, modifier, h, (i2 << 3) & ContentType.LONG_FORM_ON_DEMAND);
                    h.R();
                } else {
                    h.z(-979807341);
                    h.R();
                }
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$AppBarTitle$1
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
                ShowkaseBrowserAppKt.a(Modifier.this, str, str2, str3, str4, composer2, i | 1);
            }
        });
    }

    public static final void b(final n25 n25Var, final sy4 sy4Var, Composer composer, final int i) {
        Modifier d;
        NavDestination e;
        zq3.h(n25Var, "navController");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        Composer h = composer.h(990989688);
        if (b.G()) {
            b.S(990989688, i, -1, "com.airbnb.android.showkase.ui.ShowkaseAppBar (ShowkaseBrowserApp.kt:118)");
        }
        NavBackStackEntry c = c(NavHostControllerKt.d(n25Var, h, 8));
        String v = (c == null || (e = c.e()) == null) ? null : e.v();
        Modifier.a aVar = Modifier.a;
        d = androidx.compose.ui.graphics.b.d(SizeKt.h(aVar, 0.0f, 1, null), (r39 & 1) != 0 ? 1.0f : 0.0f, (r39 & 2) != 0 ? 1.0f : 0.0f, (r39 & 4) == 0 ? 0.0f : 1.0f, (r39 & 8) != 0 ? 0.0f : 0.0f, (r39 & 16) != 0 ? 0.0f : 0.0f, (r39 & 32) != 0 ? 0.0f : 4.0f, (r39 & 64) != 0 ? 0.0f : 0.0f, (r39 & 128) != 0 ? 0.0f : 0.0f, (r39 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0 ? 0.0f : 0.0f, (r39 & 512) != 0 ? 8.0f : 0.0f, (r39 & 1024) != 0 ? e.b.a() : 0L, (r39 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? qt6.a() : null, (r39 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? false : false, (r39 & 8192) != 0 ? null : null, (r39 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? o23.a() : 0L, (r39 & 32768) != 0 ? o23.a() : 0L);
        Modifier i2 = PaddingKt.i(d, rq1.b());
        Arrangement.f d2 = Arrangement.a.d();
        Alignment.c i3 = Alignment.a.i();
        h.z(693286680);
        rg4 a2 = m.a(d2, i3, h, 54);
        h.z(-1323940314);
        fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
        r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 b = LayoutKt.b(i2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        h.H();
        Composer a4 = Updater.a(h);
        Updater.c(a4, a2, companion.e());
        Updater.c(a4, fm1Var, companion.c());
        Updater.c(a4, layoutDirection, companion.d());
        Updater.c(a4, r99Var, companion.h());
        h.c();
        b.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        h.z(-678309503);
        n37 n37Var = n37.a;
        boolean g = ((hr7) sy4Var.getValue()).g();
        String e2 = ((hr7) sy4Var.getValue()).e();
        String c2 = ((hr7) sy4Var.getValue()).c();
        String d3 = ((hr7) sy4Var.getValue()).d();
        String f = ((hr7) sy4Var.getValue()).f();
        int i4 = (i >> 3) & 14;
        h.z(1157296644);
        boolean S = h.S(sy4Var);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            A = new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBar$1$1$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }

                public final void invoke(String str) {
                    zq3.h(str, "it");
                    sy4 sy4Var2 = sy4.this;
                    sy4Var2.setValue(hr7.b((hr7) sy4Var2.getValue(), null, null, null, null, false, str, 31, null));
                }
            };
            h.q(A);
        }
        h.R();
        ss2 ss2Var = (ss2) A;
        Modifier g2 = SizeKt.g(aVar, 0.75f);
        h.z(1157296644);
        boolean S2 = h.S(sy4Var);
        Object A2 = h.A();
        if (S2 || A2 == Composer.a.a()) {
            A2 = new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBar$1$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m140invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m140invoke() {
                    sy4 sy4Var2 = sy4.this;
                    sy4Var2.setValue(hr7.b((hr7) sy4Var2.getValue(), null, null, null, null, false, null, 47, null));
                }
            };
            h.q(A2);
        }
        h.R();
        qs2 qs2Var = (qs2) A2;
        h.z(1157296644);
        boolean S3 = h.S(sy4Var);
        Object A3 = h.A();
        if (S3 || A3 == Composer.a.a()) {
            A3 = new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBar$1$3$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m141invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m141invoke() {
                    sy4 sy4Var2 = sy4.this;
                    sy4Var2.setValue(hr7.b((hr7) sy4Var2.getValue(), null, null, null, null, false, "", 31, null));
                }
            };
            h.q(A3);
        }
        h.R();
        e(g, e2, c2, d3, v, f, ss2Var, g2, qs2Var, (qs2) A3, h, 12582912, 0);
        d(sy4Var, v, SizeKt.g(aVar, 0.25f), h, i4 | 384, 0);
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBar$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i5) {
                ShowkaseBrowserAppKt.b(n25.this, sy4Var, composer2, i | 1);
            }
        });
    }

    private static final NavBackStackEntry c(x08 x08Var) {
        return (NavBackStackEntry) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final sy4 sy4Var, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-532055190);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(sy4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(modifier) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(-532055190, i3, -1, "com.airbnb.android.showkase.ui.ShowkaseAppBarActions (ShowkaseBrowserApp.kt:340)");
            }
            if (!((hr7) sy4Var.getValue()).g() && !zq3.c(str, ShowkaseCurrentScreen.COMPONENT_DETAIL.name()) && !zq3.c(str, ShowkaseCurrentScreen.SHOWKASE_CATEGORIES.name())) {
                Modifier a2 = TestTagKt.a(modifier, "SearchIcon");
                h.z(1157296644);
                boolean S = h.S(sy4Var);
                Object A = h.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBarActions$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m142invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m142invoke() {
                            sy4 sy4Var2 = sy4.this;
                            sy4Var2.setValue(hr7.b((hr7) sy4Var2.getValue(), null, null, null, null, true, null, 47, null));
                        }
                    };
                    h.q(A);
                }
                h.R();
                IconButtonKt.a((qs2) A, a2, false, null, ComposableSingletons$ShowkaseBrowserAppKt.a.d(), h, 24576, 12);
            }
            if (b.G()) {
                b.R();
            }
        }
        final Modifier modifier2 = modifier;
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBarActions$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i5) {
                ShowkaseBrowserAppKt.d(sy4.this, str, modifier2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final boolean r23, final java.lang.String r24, final java.lang.String r25, final java.lang.String r26, final java.lang.String r27, final java.lang.String r28, final defpackage.ss2 r29, androidx.compose.ui.Modifier r30, final defpackage.qs2 r31, final defpackage.qs2 r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt.e(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ss2, androidx.compose.ui.Modifier, qs2, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void f(final n25 n25Var, final Map map, final Map map2, final Map map3, final sy4 sy4Var, Composer composer, final int i) {
        zq3.h(n25Var, "navController");
        zq3.h(map, "groupedComponentMap");
        zq3.h(map2, "groupedColorsMap");
        zq3.h(map3, "groupedTypographyMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        Composer h = composer.h(-1969216089);
        if (b.G()) {
            b.S(-1969216089, i, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent (ShowkaseBrowserApp.kt:365)");
        }
        NavHostKt.c(n25Var, x(map2, map3, map), null, null, new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((m25) obj);
                return ww8.a;
            }

            public final void invoke(m25 m25Var) {
                zq3.h(m25Var, "$this$NavHost");
                ShowkaseBrowserAppKt.v(m25Var, n25.this, sy4Var, map2, map3, map);
            }
        }, h, 8, 12);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$2
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
                ShowkaseBrowserAppKt.f(n25.this, map, map2, map3, sy4Var, composer2, i | 1);
            }
        });
    }

    public static final void g(final Map map, final Map map2, final Map map3, final sy4 sy4Var, Composer composer, final int i) {
        zq3.h(map, "groupedComponentMap");
        zq3.h(map2, "groupedColorsMap");
        zq3.h(map3, "groupedTypographyMap");
        zq3.h(sy4Var, "showkaseBrowserScreenMetadata");
        Composer h = composer.h(-2126429196);
        if (b.G()) {
            b.S(-2126429196, i, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserApp (ShowkaseBrowserApp.kt:68)");
        }
        Configuration configuration = new Configuration((Configuration) h.m(AndroidCompositionLocals_androidKt.f()));
        configuration.uiMode = 16;
        d44 d44Var = (d44) h.m(AndroidCompositionLocals_androidKt.i());
        h.z(-492369756);
        Object A = h.A();
        if (A == Composer.a.a()) {
            A = new a(d44Var);
            h.q(A);
        }
        h.R();
        CompositionLocalKt.b(new o76[]{AndroidCompositionLocals_androidKt.f().c(configuration), InspectionModeKt.a().c(Boolean.TRUE), LocalOnBackPressedDispatcherOwner.a.b((a) A)}, zr0.b(h, -291100876, true, new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBrowserApp$1
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
                    b.S(-291100876, i2, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserApp.<anonymous> (ShowkaseBrowserApp.kt:91)");
                }
                final n25 e = NavHostControllerKt.e(new Navigator[0], composer2, 8);
                final sy4 sy4Var2 = sy4.this;
                final int i3 = i;
                yr0 b = zr0.b(composer2, 1795087183, true, new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBrowserApp$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        if ((i4 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1795087183, i4, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserApp.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:95)");
                        }
                        ShowkaseBrowserAppKt.b(n25.this, sy4Var2, composer3, ((i3 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | 8);
                        if (b.G()) {
                            b.R();
                        }
                    }
                });
                final Map<String, List<gr7>> map4 = map;
                final Map<String, List<fr7>> map5 = map2;
                final Map<String, List<Object>> map6 = map3;
                final sy4 sy4Var3 = sy4.this;
                final int i4 = i;
                ScaffoldKt.b(null, null, b, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, zr0.b(composer2, 1649952694, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBrowserApp$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(ym5 ym5Var, Composer composer3, int i5) {
                        zq3.h(ym5Var, "it");
                        if ((i5 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1649952694, i5, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserApp.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:98)");
                        }
                        Modifier d = BackgroundKt.d(SizeKt.f(Modifier.a, 0.0f, 1, null), to0.a(), null, 2, null);
                        n25 n25Var = n25.this;
                        Map<String, List<gr7>> map7 = map4;
                        Map<String, List<fr7>> map8 = map5;
                        Map<String, List<Object>> map9 = map6;
                        sy4 sy4Var4 = sy4Var3;
                        int i6 = i4;
                        composer3.z(-483455358);
                        rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                        composer3.z(-1323940314);
                        fm1 fm1Var = (fm1) composer3.m(CompositionLocalsKt.e());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                        r99 r99Var = (r99) composer3.m(CompositionLocalsKt.p());
                        ComposeUiNode.Companion companion = ComposeUiNode.F;
                        qs2 a3 = companion.a();
                        it2 b2 = LayoutKt.b(d);
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
                        b2.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                        composer3.z(2058660585);
                        composer3.z(-1163856341);
                        ap0 ap0Var = ap0.a;
                        ShowkaseBrowserAppKt.f(n25Var, map7, map8, map9, sy4Var4, composer3, ((i6 << 3) & 57344) | 4680);
                        composer3.R();
                        composer3.R();
                        composer3.t();
                        composer3.R();
                        composer3.R();
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 100663680, 12582912, 130811);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 56);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBrowserApp$2
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
                ShowkaseBrowserAppKt.g(map, map2, map3, sy4Var, composer2, i | 1);
            }
        });
    }

    public static final void h(final String str, final ss2 ss2Var, final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        final int i2;
        Composer composer2;
        zq3.h(ss2Var, "searchQueryValueChange");
        zq3.h(qs2Var, "onCloseSearchFieldClick");
        zq3.h(qs2Var2, "onClearSearchField");
        Composer h = composer.h(-1908680628);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(ss2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(qs2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.S(qs2Var2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i2 & 5851) == 1170 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1908680628, i2, -1, "com.airbnb.android.showkase.ui.ShowkaseSearchField (ShowkaseBrowserApp.kt:296)");
            }
            String str2 = str == null ? "" : str;
            composer2 = h;
            String str3 = str2;
            TextFieldKt.b(str3, ss2Var, SizeKt.h(TestTagKt.a(Modifier.a, "SearchTextField"), 0.0f, 1, null), false, false, new j(nn0.b.a(), ek8.g(18), o.b.j(), null, null, androidx.compose.ui.text.font.e.b.a(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262104, null), ComposableSingletons$ShowkaseBrowserAppKt.a.a(), null, zr0.b(h, 2000616166, true, new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseSearchField$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(2000616166, i3, -1, "com.airbnb.android.showkase.ui.ShowkaseSearchField.<anonymous> (ShowkaseBrowserApp.kt:318)");
                    }
                    IconButtonKt.a(qs2.this, TestTagKt.a(Modifier.a, "close_search_bar_tag"), false, null, ComposableSingletons$ShowkaseBrowserAppKt.a.b(), composer3, ((i2 >> 6) & 14) | 24624, 12);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), zr0.b(h, -2125207355, true, new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseSearchField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-2125207355, i3, -1, "com.airbnb.android.showkase.ui.ShowkaseSearchField.<anonymous> (ShowkaseBrowserApp.kt:327)");
                    }
                    qs2 qs2Var3 = qs2.this;
                    Modifier a2 = TestTagKt.a(Modifier.a, "clear_search_field");
                    String str4 = str;
                    IconButtonKt.a(qs2Var3, a2, !(str4 == null || str4.length() == 0), null, ComposableSingletons$ShowkaseBrowserAppKt.a.c(), composer3, ((i2 >> 9) & 14) | 24624, 8);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), false, null, null, null, false, 0, null, null, TextFieldDefaults.a.l(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, h, 0, 0, 48, 2097151), composer2, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 907542912, 0, 261272);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseSearchField$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer3, int i3) {
                ShowkaseBrowserAppKt.h(str, ss2Var, qs2Var, qs2Var2, composer3, i | 1);
            }
        });
    }

    public static final void i(final String str, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(str, "string");
        zq3.h(modifier, "modifier");
        Composer h = composer.h(437228438);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(modifier) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(437228438, i2, -1, "com.airbnb.android.showkase.ui.ToolbarTitle (ShowkaseBrowserApp.kt:267)");
            }
            h.z(-492369756);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = b0.e(0, null, 2, null);
                h.q(A);
            }
            h.R();
            final sy4 sy4Var = (sy4) A;
            Modifier k = PaddingKt.k(Modifier.a, 0.0f, a, 1, null);
            h.z(1157296644);
            boolean S = h.S(sy4Var);
            Object A2 = h.A();
            if (S || A2 == aVar.a()) {
                A2 = new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ToolbarTitle$1$1
                    {
                        super(1);
                    }

                    public final void b(lj7 lj7Var) {
                        zq3.h(lj7Var, "$this$semantics");
                        mj7.a.a(lj7Var, ((Number) sy4.this.getValue()).intValue());
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((lj7) obj);
                        return ww8.a;
                    }
                };
                h.q(A2);
            }
            h.R();
            Modifier h2 = modifier.h(dj7.d(k, false, (ss2) A2, 1, null));
            j jVar = new j(0L, ek8.g(20), o.b.a(), null, null, androidx.compose.ui.text.font.e.b.b(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null);
            int b = kj8.a.b();
            h.z(1157296644);
            boolean S2 = h.S(sy4Var);
            Object A3 = h.A();
            if (S2 || A3 == aVar.a()) {
                A3 = new ss2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ToolbarTitle$2$1
                    {
                        super(1);
                    }

                    public final void b(aj8 aj8Var) {
                        zq3.h(aj8Var, "it");
                        sy4.this.setValue(Integer.valueOf(aj8Var.n()));
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((aj8) obj);
                        return ww8.a;
                    }
                };
                h.q(A3);
            }
            h.R();
            composer2 = h;
            TextKt.e(str, h2, 0L, 0L, null, null, null, 0L, null, null, 0L, b, false, 3, (ss2) A3, jVar, composer2, i2 & 14, 3120, 6140);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = composer2.k();
        if (k2 == null) {
            return;
        }
        k2.a(new gt2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ToolbarTitle$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer3, int i3) {
                ShowkaseBrowserAppKt.i(str, modifier, composer3, i | 1);
            }
        });
    }

    private static final void o(m25 m25Var, final n25 n25Var, final Map map, final sy4 sy4Var) {
        NavGraphBuilderKt.d(m25Var, ShowkaseCurrentScreen.COLOR_GROUPS.name(), null, null, zr0.c(-660398709, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$colorsNavGraph$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(-660398709, i, -1, "com.airbnb.android.showkase.ui.colorsNavGraph.<anonymous> (ShowkaseBrowserApp.kt:475)");
                }
                ShowkaseGroupsScreenKt.a(map, sy4Var, n25Var, composer, 520);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), 6, null);
        NavGraphBuilderKt.d(m25Var, ShowkaseCurrentScreen.COLORS_IN_A_GROUP.name(), null, null, zr0.c(-1878132812, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$colorsNavGraph$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(-1878132812, i, -1, "com.airbnb.android.showkase.ui.colorsNavGraph.<anonymous> (ShowkaseBrowserApp.kt:482)");
                }
                ShowkaseColorsInAGroupScreenKt.a(map, sy4Var, n25Var, composer, 520);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), 6, null);
    }

    private static final void p(m25 m25Var, final n25 n25Var, final Map map, final sy4 sy4Var) {
        NavGraphBuilderKt.d(m25Var, ShowkaseCurrentScreen.COMPONENT_GROUPS.name(), null, null, zr0.c(1903329841, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$componentsNavGraph$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(1903329841, i, -1, "com.airbnb.android.showkase.ui.componentsNavGraph.<anonymous> (ShowkaseBrowserApp.kt:440)");
                }
                ShowkaseGroupsScreenKt.b(map, sy4Var, n25Var, composer, 520);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), 6, null);
        NavGraphBuilderKt.d(m25Var, ShowkaseCurrentScreen.COMPONENTS_IN_A_GROUP.name(), null, null, zr0.c(1713512410, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$componentsNavGraph$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(1713512410, i, -1, "com.airbnb.android.showkase.ui.componentsNavGraph.<anonymous> (ShowkaseBrowserApp.kt:447)");
                }
                ShowkaseComponentsInAGroupScreenKt.a(map, sy4Var, n25Var, composer, 520);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), 6, null);
        NavGraphBuilderKt.d(m25Var, ShowkaseCurrentScreen.COMPONENT_STYLES.name(), null, null, zr0.c(-704185991, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$componentsNavGraph$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(-704185991, i, -1, "com.airbnb.android.showkase.ui.componentsNavGraph.<anonymous> (ShowkaseBrowserApp.kt:454)");
                }
                ShowkaseComponentStylesScreenKt.b(map, sy4Var, n25Var, composer, 520);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), 6, null);
        NavGraphBuilderKt.d(m25Var, ShowkaseCurrentScreen.COMPONENT_DETAIL.name(), null, null, zr0.c(1173082904, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$componentsNavGraph$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(1173082904, i, -1, "com.airbnb.android.showkase.ui.componentsNavGraph.<anonymous> (ShowkaseBrowserApp.kt:461)");
                }
                ShowkaseComponentDetailScreenKt.a(map, sy4Var, n25Var, composer, 520);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), 6, null);
    }

    private static final int q(Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Iterable iterable = (Iterable) ((Map.Entry) it2.next()).getValue();
            new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = iterable.iterator();
            if (it3.hasNext()) {
                lh4.a(it3.next());
                throw null;
            }
            i.B(arrayList, arrayList2);
        }
        return arrayList.size();
    }

    private static final int r(Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            i.B(arrayList, (List) ((Map.Entry) it2.next()).getValue());
        }
        return arrayList.size();
    }

    private static final void s(m25 m25Var, final n25 n25Var, final Map map, final Map map2, final Map map3, final sy4 sy4Var) {
        NavGraphBuilderKt.d(m25Var, ShowkaseCurrentScreen.SHOWKASE_CATEGORIES.name(), null, null, zr0.c(141639882, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$fullNavGraph$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                Map t;
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(141639882, i, -1, "com.airbnb.android.showkase.ui.fullNavGraph.<anonymous> (ShowkaseBrowserApp.kt:519)");
                }
                sy4 sy4Var2 = sy4.this;
                n25 n25Var2 = n25Var;
                t = ShowkaseBrowserAppKt.t(map, map2, map3);
                ShowkaseCategoriesScreenKt.a(sy4Var2, n25Var2, t, composer, 576);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), 6, null);
        p(m25Var, n25Var, map, sy4Var);
        o(m25Var, n25Var, map2, sy4Var);
        y(m25Var, n25Var, map3, sy4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map t(Map map, Map map2, Map map3) {
        return t.m(du8.a(ShowkaseCategory.COMPONENTS, Integer.valueOf(q(map))), du8.a(ShowkaseCategory.COLORS, Integer.valueOf(r(map2))), du8.a(ShowkaseCategory.TYPOGRAPHY, Integer.valueOf(r(map3))));
    }

    private static final boolean u(Map map, Map map2, Map map3) {
        return !map.values().isEmpty() && map2.isEmpty() && map3.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(m25 m25Var, n25 n25Var, sy4 sy4Var, Map map, Map map2, Map map3) {
        if (u(map3, map, map2)) {
            p(m25Var, n25Var, map3, sy4Var);
            return;
        }
        if (u(map, map2, map3)) {
            o(m25Var, n25Var, map, sy4Var);
        } else if (u(map2, map, map3)) {
            y(m25Var, n25Var, map2, sy4Var);
        } else {
            s(m25Var, n25Var, map3, map, map2, sy4Var);
        }
    }

    public static final void w(n25 n25Var, ShowkaseCurrentScreen showkaseCurrentScreen) {
        zq3.h(n25Var, "<this>");
        zq3.h(showkaseCurrentScreen, "destinationScreen");
        NavController.T(n25Var, showkaseCurrentScreen.name(), null, null, 6, null);
    }

    private static final String x(Map map, Map map2, Map map3) {
        return u(map3, map, map2) ? ShowkaseCurrentScreen.COMPONENT_GROUPS.name() : u(map, map2, map3) ? ShowkaseCurrentScreen.COLOR_GROUPS.name() : u(map2, map, map3) ? ShowkaseCurrentScreen.TYPOGRAPHY_GROUPS.name() : ShowkaseCurrentScreen.SHOWKASE_CATEGORIES.name();
    }

    private static final void y(m25 m25Var, final n25 n25Var, final Map map, final sy4 sy4Var) {
        NavGraphBuilderKt.d(m25Var, ShowkaseCurrentScreen.TYPOGRAPHY_GROUPS.name(), null, null, zr0.c(-1228707702, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$typographyNavGraph$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(-1228707702, i, -1, "com.airbnb.android.showkase.ui.typographyNavGraph.<anonymous> (ShowkaseBrowserApp.kt:496)");
                }
                ShowkaseGroupsScreenKt.d(map, sy4Var, n25Var, composer, 520);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), 6, null);
        NavGraphBuilderKt.d(m25Var, ShowkaseCurrentScreen.TYPOGRAPHY_IN_A_GROUP.name(), null, null, zr0.c(-1418525133, true, new it2() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$typographyNavGraph$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(-1418525133, i, -1, "com.airbnb.android.showkase.ui.typographyNavGraph.<anonymous> (ShowkaseBrowserApp.kt:503)");
                }
                ShowkaseTypographyInAGroupScreenKt.a(map, sy4Var, n25Var, composer, 520);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), 6, null);
    }
}
