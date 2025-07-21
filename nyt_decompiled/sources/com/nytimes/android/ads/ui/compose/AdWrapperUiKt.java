package com.nytimes.android.ads.ui.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.ads.ui.compose.anim.ShimmerEffectKt;
import com.nytimes.android.ads.ui.compose.theme.DimensKt;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d44;
import defpackage.dh8;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.nn0;
import defpackage.nq1;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.xj6;
import defpackage.z7;
import defpackage.zf4;
import defpackage.zq3;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class AdWrapperUiKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final void b(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-122531327);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(-122531327, i3, -1, "com.nytimes.android.ads.ui.compose.AdLoading (AdWrapperUi.kt:99)");
            }
            zf4 zf4Var = zf4.a;
            int i5 = zf4.b;
            List o = i.o(nn0.j(zf4Var.a(h, i5).o()), nn0.j(zf4Var.a(h, i5).q()), nn0.j(zf4Var.a(h, i5).o()));
            Modifier h2 = SizeKt.h(modifier, 0.0f, 1, null);
            Alignment e = Alignment.a.e();
            h.z(733328855);
            rg4 g = BoxKt.g(e, false, h, 6);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b = LayoutKt.b(h2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            h.H();
            Composer a3 = Updater.a(h);
            Updater.c(a3, g, companion.e());
            Updater.c(a3, fm1Var, companion.c());
            Updater.c(a3, layoutDirection, companion.d());
            Updater.c(a3, r99Var, companion.h());
            h.c();
            b.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            BoxKt.a(ShimmerEffectKt.a(SizeKt.s(SizeKt.i(Modifier.a, ((nq1) h.m(DimensKt.a())).d()), ((nq1) h.m(DimensKt.a())).e()), o), h, 0);
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ads.ui.compose.AdWrapperUiKt$AdLoading$2
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
                    AdWrapperUiKt.b(Modifier.this, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void c(final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-648579100);
        if ((i & 14) == 0) {
            i2 = (h.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-648579100, i2, -1, "com.nytimes.android.ads.ui.compose.AdSlug (AdWrapperUi.kt:159)");
            }
            String upperCase = k48.b(xj6.advertisement_slug, h, 0).toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            zf4 zf4Var = zf4.a;
            int i3 = zf4.b;
            composer2 = h;
            TextKt.c(upperCase, PaddingKt.m(SizeKt.h(Modifier.a, 0.0f, 1, null), 0.0f, ((nq1) h.m(DimensKt.a())).c(), 0.0f, ((nq1) h.m(DimensKt.a())).b(), 5, null), j, zf4Var.c(h, i3).o().p(), null, null, zf4Var.c(h, i3).o().n(), 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, null, null, composer2, (i2 << 6) & 896, 0, 64944);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ads.ui.compose.AdWrapperUiKt$AdSlug$1
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
                    AdWrapperUiKt.c(j, composer3, i | 1);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if ((r15 & 2) != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.z7 r11, final boolean r12, androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ads.ui.compose.AdWrapperUiKt.d(z7, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(z7 z7Var, d44 d44Var, Lifecycle.Event event) {
        zq3.h(z7Var, "$adView");
        zq3.h(d44Var, "<anonymous parameter 0>");
        zq3.h(event, "event");
        int i = a.a[event.ordinal()];
        if (i == 1) {
            z7Var.resume();
        } else {
            if (i != 2) {
                return;
            }
            z7Var.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.d8 r14, androidx.compose.ui.Modifier r15, boolean r16, boolean r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ads.ui.compose.AdWrapperUiKt.f(d8, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
