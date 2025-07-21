package com.nytimes.subauth.ui.ui.screens.regilite;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.CheckboxKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.composeui.text.LinkableTextKt;
import com.nytimes.subauth.ui.ui.theme.ColorKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cf6;
import defpackage.cs0;
import defpackage.d37;
import defpackage.dh8;
import defpackage.do5;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.i77;
import defpackage.it2;
import defpackage.j98;
import defpackage.ju7;
import defpackage.k48;
import defpackage.mm6;
import defpackage.n37;
import defpackage.p54;
import defpackage.qs2;
import defpackage.r54;
import defpackage.r99;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.uh8;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zu5;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class SuccessScreenKt {
    public static final void a(Modifier modifier, final boolean z, final gt2 gt2Var, final ss2 ss2Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        j d;
        final Modifier modifier3;
        zq3.h(gt2Var, "onWebItem");
        zq3.h(ss2Var, "onCheckChanged");
        Composer h = composer.h(-6384470);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.a(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.S(ss2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        int i5 = i3;
        if ((i5 & 5851) == 1170 && h.i()) {
            h.K();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(-6384470, i5, -1, "com.nytimes.subauth.ui.ui.screens.regilite.AgreementSection (SuccessScreen.kt:275)");
            }
            Modifier a = TestTagKt.a(modifier4, "marketing_opt_in");
            h.z(693286680);
            Arrangement.e f = Arrangement.a.f();
            Alignment.a aVar = Alignment.a;
            rg4 a2 = m.a(f, aVar.l(), h, 0);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 b = LayoutKt.b(a);
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
            Modifier.a aVar2 = Modifier.a;
            Modifier modifier5 = modifier4;
            CheckboxKt.a(z, ss2Var, TestTagKt.a(n37Var.c(SizeKt.n(aVar2, bu1.g(16)), aVar.l()), "marketing_opt_in_checkbox"), false, null, null, h, ((i5 >> 3) & 14) | ((i5 >> 6) & ContentType.LONG_FORM_ON_DEMAND), 56);
            SpacerKt.a(SizeKt.s(aVar2, bu1.g(8)), h, 6);
            j98 j98Var = j98.a;
            String str = (String) j98Var.d(h, 8).l().c();
            List list = (List) j98Var.d(h, 8).l().d();
            d = r21.d((r44 & 1) != 0 ? r21.a.i() : 0L, (r44 & 2) != 0 ? r21.a.m() : 0L, (r44 & 4) != 0 ? r21.a.p() : null, (r44 & 8) != 0 ? r21.a.n() : null, (r44 & 16) != 0 ? r21.a.o() : null, (r44 & 32) != 0 ? r21.a.k() : null, (r44 & 64) != 0 ? r21.a.l() : null, (r44 & 128) != 0 ? r21.a.q() : 0L, (r44 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r21.a.g() : null, (r44 & 512) != 0 ? r21.a.w() : null, (r44 & 1024) != 0 ? r21.a.r() : null, (r44 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r21.a.f() : 0L, (r44 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r21.a.u() : null, (r44 & 8192) != 0 ? r21.a.t() : null, (r44 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r21.b.h()) : null, (r44 & 32768) != 0 ? uh8.g(r21.b.i()) : null, (r44 & 65536) != 0 ? r21.b.e() : 0L, (r44 & 131072) != 0 ? r21.b.j() : null, (r44 & 262144) != 0 ? r21.c : new zu5(false), (r44 & 524288) != 0 ? j98Var.c(h, 8).b().b.f() : null);
            LinkableTextKt.a(str, list, true, gt2Var, n37Var.c(aVar2, aVar.l()), d, ColorKt.B(j98Var.b(h, 8).f()), h, ((i5 << 3) & 7168) | 448, 0);
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            if (b.G()) {
                b.R();
            }
            modifier3 = modifier5;
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.SuccessScreenKt$AgreementSection$2
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
                    SuccessScreenKt.a(Modifier.this, z, gt2Var, ss2Var, composer2, i | 1, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(1863939989);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1863939989, i2, -1, "com.nytimes.subauth.ui.ui.screens.regilite.FacebookImage (SuccessScreen.kt:211)");
            }
            ImageKt.b(do5.d(cf6.logo_facebook_vector, h, 0), k48.b(mm6.subauth_success_icon, h, 0), modifier.h(SizeKt.n(Modifier.a, bu1.g(40))), null, ContentScale.a.e(), 0.0f, null, h, 24584, 104);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.SuccessScreenKt$FacebookImage$1
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
                    SuccessScreenKt.b(Modifier.this, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-649884280);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-649884280, i2, -1, "com.nytimes.subauth.ui.ui.screens.regilite.GoogleImage (SuccessScreen.kt:186)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier h2 = modifier.h(BorderKt.f(SizeKt.n(aVar, bu1.g(40)), bu1.g(1), ColorKt.B(j98.a.b(h, 8).h()), d37.f()));
            Arrangement.f b = Arrangement.a.b();
            Alignment.c i3 = Alignment.a.i();
            h.z(693286680);
            rg4 a = m.a(b, i3, h, 54);
            h.z(-1323940314);
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            r99 r99Var = (r99) h.m(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 b2 = LayoutKt.b(h2);
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
            Updater.c(a3, a, companion.e());
            Updater.c(a3, fm1Var, companion.c());
            Updater.c(a3, layoutDirection, companion.d());
            Updater.c(a3, r99Var, companion.h());
            h.c();
            b2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-678309503);
            n37 n37Var = n37.a;
            ImageKt.b(do5.d(cf6.logo_google_vector, h, 0), k48.b(mm6.subauth_success_icon, h, 0), PaddingKt.i(aVar, bu1.g(8)), null, ContentScale.a.e(), 0.0f, null, h, 24968, 104);
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
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.SuccessScreenKt$GoogleImage$2
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
                    SuccessScreenKt.c(Modifier.this, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final Modifier modifier, final p54 p54Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(126225182);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(p54Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(126225182, i2, -1, "com.nytimes.subauth.ui.ui.screens.regilite.ImageByLireFlowType (SuccessScreen.kt:168)");
            }
            i77 b = p54Var instanceof p54.e ? ((p54.e) p54Var).b() : p54Var instanceof p54.f ? ((p54.f) p54Var).b() : null;
            if (b != null) {
                h.z(-390496600);
                if (b instanceof i77.a) {
                    h.z(-1536615442);
                    b(modifier, h, i2 & 14);
                    h.R();
                } else if (b instanceof i77.b) {
                    h.z(-1536613172);
                    c(modifier, h, i2 & 14);
                    h.R();
                } else {
                    h.z(-1536611475);
                    f(modifier, h, i2 & 14);
                    h.R();
                }
                h.R();
            } else {
                h.z(-390260411);
                f(modifier, h, i2 & 14);
                h.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.SuccessScreenKt$ImageByLireFlowType$1
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
                    SuccessScreenKt.d(Modifier.this, p54Var, composer2, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final Modifier modifier, final String str, final boolean z, Composer composer, final int i) {
        int i2;
        j b;
        String b2;
        j b3;
        Composer composer2;
        Composer h = composer.h(-1285753294);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.a(z) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1285753294, i2, -1, "com.nytimes.subauth.ui.ui.screens.regilite.SSOHeaderText (SuccessScreen.kt:235)");
            }
            h.z(43678937);
            a.C0064a c0064a = new a.C0064a(0, 1, null);
            h.z(43679643);
            j98 j98Var = j98.a;
            b = r13.b((r42 & 1) != 0 ? r13.a.i() : ColorKt.B(j98Var.b(h, 8).c()), (r42 & 2) != 0 ? r13.a.m() : 0L, (r42 & 4) != 0 ? r13.a.p() : null, (r42 & 8) != 0 ? r13.a.n() : null, (r42 & 16) != 0 ? r13.a.o() : null, (r42 & 32) != 0 ? r13.a.k() : null, (r42 & 64) != 0 ? r13.a.l() : null, (r42 & 128) != 0 ? r13.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r13.a.g() : null, (r42 & 512) != 0 ? r13.a.w() : null, (r42 & 1024) != 0 ? r13.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r13.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r13.a.u() : null, (r42 & 8192) != 0 ? r13.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r13.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r13.b.i()) : null, (r42 & 65536) != 0 ? r13.b.e() : 0L, (r42 & 131072) != 0 ? j98Var.c(h, 8).m().b.j() : null);
            int n = c0064a.n(b.R());
            try {
                if (z) {
                    h.z(355873259);
                    b2 = k48.b(mm6.subauth_created_an_account_using, h, 0);
                    h.R();
                } else {
                    h.z(355988207);
                    b2 = k48.b(mm6.subauth_you_are_logged_in_as, h, 0);
                    h.R();
                }
                c0064a.i(b2);
                c0064a.i("\n");
                ww8 ww8Var = ww8.a;
                c0064a.k(n);
                h.R();
                b3 = r13.b((r42 & 1) != 0 ? r13.a.i() : ColorKt.B(j98Var.b(h, 8).c()), (r42 & 2) != 0 ? r13.a.m() : 0L, (r42 & 4) != 0 ? r13.a.p() : o.b.k(), (r42 & 8) != 0 ? r13.a.n() : null, (r42 & 16) != 0 ? r13.a.o() : null, (r42 & 32) != 0 ? r13.a.k() : null, (r42 & 64) != 0 ? r13.a.l() : null, (r42 & 128) != 0 ? r13.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r13.a.g() : null, (r42 & 512) != 0 ? r13.a.w() : null, (r42 & 1024) != 0 ? r13.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r13.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r13.a.u() : null, (r42 & 8192) != 0 ? r13.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r13.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r13.b.i()) : null, (r42 & 65536) != 0 ? r13.b.e() : 0L, (r42 & 131072) != 0 ? j98Var.c(h, 8).m().b.j() : null);
                n = c0064a.n(b3.R());
                try {
                    c0064a.i(str);
                    c0064a.k(n);
                    a o = c0064a.o();
                    h.R();
                    composer2 = h;
                    TextKt.b(o, modifier, 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), j98Var.c(h, 8).m().w(), 0, false, 0, null, null, null, composer2, (i2 << 3) & ContentType.LONG_FORM_ON_DEMAND, 0, 129532);
                    if (b.G()) {
                        b.R();
                    }
                } finally {
                    c0064a.k(n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.SuccessScreenKt$SSOHeaderText$2
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
                    SuccessScreenKt.e(Modifier.this, str, z, composer3, i | 1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1022197066);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1022197066, i2, -1, "com.nytimes.subauth.ui.ui.screens.regilite.SuccessImage (SuccessScreen.kt:223)");
            }
            IconKt.b(do5.d(cf6.subauth_ic_success_icon, h, 0), k48.b(mm6.subauth_success_icon, h, 0), modifier.h(SizeKt.n(Modifier.a, bu1.g(40))), ColorKt.B(j98.a.b(h, 8).c()), h, 8, 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.screens.regilite.SuccessScreenKt$SuccessImage$1
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
                    SuccessScreenKt.f(Modifier.this, composer2, i | 1);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0408  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(androidx.compose.ui.Modifier r90, final com.nytimes.subauth.ui.login.SubauthLoginViewModel r91, androidx.compose.runtime.Composer r92, final int r93, final int r94) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.ui.screens.regilite.SuccessScreenKt.g(androidx.compose.ui.Modifier, com.nytimes.subauth.ui.login.SubauthLoginViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    private static final p54 k(sy4 sy4Var) {
        return (p54) sy4Var.getValue();
    }

    private static final r54 l(x08 x08Var) {
        return (r54) x08Var.getValue();
    }
}
