package com.nytimes.android.theathletic;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.ButtonKt;
import com.nytimes.android.designsystem.uicompose.composable.LegacyTooltipLayoutKt;
import defpackage.ap0;
import defpackage.bp;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.ch3;
import defpackage.cs0;
import defpackage.cz3;
import defpackage.d37;
import defpackage.do5;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fl0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hn3;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.ke6;
import defpackage.m37;
import defpackage.n37;
import defpackage.nk6;
import defpackage.oe3;
import defpackage.pl0;
import defpackage.qn0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class AthleticComposablesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final int i, final qs2 qs2Var, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer h = composer.h(-1539874351);
        if ((i2 & 14) == 0) {
            i3 = (h.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1539874351, i3, -1, "com.nytimes.android.theathletic.AthleticAppOrDownload (AthleticComposables.kt:153)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier a = pl0.a(PaddingKt.m(aVar, 0.0f, 0.0f, bu1.g(16), 0.0f, 11, null), d37.c(bu1.g(10)));
            h.z(-379166865);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$AthleticAppOrDownload$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m762invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m762invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            Modifier i4 = PaddingKt.i(ClickableKt.e(a, false, null, null, (qs2) A, 7, null), bu1.g(8));
            Alignment.c i5 = Alignment.a.i();
            h.z(693286680);
            rg4 a2 = m.a(Arrangement.a.f(), i5, h, 48);
            h.z(-1323940314);
            int a3 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c = LayoutKt.c(i4);
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
            TextKt.c(k48.b(i, h, i3 & 14), PaddingKt.m(aVar, 0.0f, 0.0f, bu1.g(12), 0.0f, 11, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, eb5.Companion.c(h, 8).f1(), h, 48, 3072, 57340);
            composer2 = h;
            ImageKt.b(do5.d(ke6.ic_the_athletic_brand, composer2, 0), null, null, null, null, 0.0f, null, composer2, 56, 124);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$AthleticAppOrDownload$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    AthleticComposablesKt.a(i, qs2Var, composer3, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final int i, final qs2 qs2Var, final qs2 qs2Var2, final boolean z, final float f, Composer composer, final int i2) {
        int i3;
        Modifier.a aVar;
        int i4;
        Object obj;
        Composer composer2;
        Composer h = composer.h(-1798156458);
        if ((i2 & 14) == 0) {
            i3 = (h.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h.C(qs2Var2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h.a(z) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= h.b(f) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i5 = i3;
        if ((46811 & i5) == 9362 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1798156458, i5, -1, "com.nytimes.android.theathletic.AthleticCharmBracelet (AthleticComposables.kt:74)");
            }
            float g = bu1.g(((Configuration) h.m(AndroidCompositionLocals_androidKt.f())).screenWidthDp);
            Modifier.a aVar2 = Modifier.a;
            Modifier i6 = SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), f);
            h.z(-483455358);
            Arrangement arrangement = Arrangement.a;
            Arrangement.m g2 = arrangement.g();
            Alignment.a aVar3 = Alignment.a;
            rg4 a = d.a(g2, aVar3.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(i6);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            Composer a4 = Updater.a(h);
            Updater.c(a4, a, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            h.z(-1681437032);
            if (z) {
                obj = null;
                aVar = aVar2;
                i4 = i5;
                LegacyTooltipLayoutKt.a(bu1.g(g - bu1.g(44)), eb5.Companion.a(h, 8).b(), 0.0f, h, 0, 4);
            } else {
                aVar = aVar2;
                i4 = i5;
                obj = null;
            }
            h.R();
            Modifier.a aVar4 = aVar;
            Modifier d = SizeKt.d(aVar4, 0.0f, 1, obj);
            Alignment.c i7 = aVar3.i();
            h.z(693286680);
            rg4 a5 = m.a(arrangement.f(), i7, h, 48);
            h.z(-1323940314);
            int a6 = cs0.a(h, 0);
            et0 o2 = h.o();
            qs2 a7 = companion.a();
            it2 c2 = LayoutKt.c(d);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a7);
            } else {
                h.p();
            }
            Composer a8 = Updater.a(h);
            Updater.c(a8, a5, companion.e());
            Updater.c(a8, o2, companion.g());
            gt2 b2 = companion.b();
            if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                a8.q(Integer.valueOf(a6));
                a8.v(Integer.valueOf(a6), b2);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            n37 n37Var = n37.a;
            ch3 a9 = bp.a(oe3.c.a);
            qn0 b3 = qn0.a.b(qn0.b, eb5.Companion.a(h, 8).p(), 0, 2, null);
            Modifier a10 = pl0.a(PaddingKt.m(aVar4, bu1.g(12), 0.0f, bu1.g(3), 0.0f, 10, null), d37.f());
            h.z(-1356192095);
            boolean z2 = (i4 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object A = h.A();
            if (z2 || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$AthleticCharmBracelet$1$1$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m763invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m763invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            ImageKt.a(a9, null, PaddingKt.i(ClickableKt.e(a10, false, null, null, (qs2) A, 7, null), bu1.g(8)), null, null, 0.0f, b3, h, 48, 56);
            composer2 = h;
            SpacerKt.a(m37.b(n37Var, aVar4, 1.0f, false, 2, null), composer2, 0);
            a(i, qs2Var2, composer2, ((i4 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | (i4 & 14));
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$AthleticCharmBracelet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i8) {
                    AthleticComposablesKt.b(i, qs2Var, qs2Var2, z, f, composer3, gt6.a(i2 | 1));
                }
            });
        }
    }

    public static final void c(final ss2 ss2Var, final float f, final int i, final boolean z, final qs2 qs2Var, final qs2 qs2Var2, final qs2 qs2Var3, final qs2 qs2Var4, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        zq3.h(ss2Var, "onMessageHeightChanged");
        zq3.h(qs2Var, "onShowTooltip");
        zq3.h(qs2Var2, "onClickBack");
        zq3.h(qs2Var3, "onClickAthletic");
        zq3.h(qs2Var4, "onClickCloseMessage");
        Composer h = composer.h(1191166773);
        if ((i2 & 14) == 0) {
            i3 = (h.C(ss2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.b(f) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h.d(i) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h.a(z) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i2 & 57344) == 0) {
            i3 |= h.C(qs2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= h.C(qs2Var2) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= h.C(qs2Var3) ? Constants.MB : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= h.C(qs2Var4) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if ((23967451 & i4) == 4793490 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1191166773, i4, -1, "com.nytimes.android.theathletic.AthleticFooter (AthleticComposables.kt:51)");
            }
            int i5 = i4 << 9;
            d(z, qs2Var, qs2Var4, ss2Var, h, ((i4 >> 9) & WebSocketProtocol.PAYLOAD_SHORT) | ((i4 >> 15) & 896) | (i5 & 7168));
            int i6 = i4 >> 12;
            int i7 = ((i4 >> 6) & 14) | (i6 & ContentType.LONG_FORM_ON_DEMAND) | (i6 & 896) | (i4 & 7168) | (i5 & 57344);
            composer2 = h;
            b(i, qs2Var2, qs2Var3, z, f, composer2, i7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$AthleticFooter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i8) {
                    AthleticComposablesKt.c(ss2.this, f, i, z, qs2Var, qs2Var2, qs2Var3, qs2Var4, composer3, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final boolean z, final qs2 qs2Var, final qs2 qs2Var2, final ss2 ss2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(1461001384);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(qs2Var2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.C(ss2Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1461001384, i3, -1, "com.nytimes.android.theathletic.AthleticTooltip (AthleticComposables.kt:116)");
            }
            if (z) {
                qs2Var.mo865invoke();
                final fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
                Modifier.a aVar = Modifier.a;
                h.z(-1757684014);
                boolean S = ((i3 & 7168) == 2048) | h.S(fm1Var);
                Object A = h.A();
                if (S || A == Composer.a.a()) {
                    A = new ss2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$AthleticTooltip$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(cz3 cz3Var) {
                            zq3.h(cz3Var, "it");
                            ss2.this.invoke(bu1.d(fm1Var.v(hn3.f(cz3Var.a()))));
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((cz3) obj);
                            return ww8.a;
                        }
                    };
                    h.q(A);
                }
                h.R();
                Modifier w = SizeKt.w(SizeKt.h(h.a(aVar, (ss2) A), 0.0f, 1, null), null, false, 3, null);
                eb5.a aVar2 = eb5.Companion;
                Modifier d = BackgroundKt.d(w, aVar2.a(h, 8).b(), null, 2, null);
                h.z(693286680);
                Arrangement.e f = Arrangement.a.f();
                Alignment.a aVar3 = Alignment.a;
                rg4 a = m.a(f, aVar3.l(), h, 0);
                h.z(-1323940314);
                int a2 = cs0.a(h, 0);
                et0 o = h.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c = LayoutKt.c(d);
                if (h.j() == null) {
                    cs0.c();
                }
                h.G();
                if (h.f()) {
                    h.D(a3);
                } else {
                    h.p();
                }
                Composer a4 = Updater.a(h);
                Updater.c(a4, a, companion.e());
                Updater.c(a4, o, companion.g());
                gt2 b = companion.b();
                if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                    a4.q(Integer.valueOf(a2));
                    a4.v(Integer.valueOf(a2), b);
                }
                c.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                n37 n37Var = n37.a;
                float f2 = 16;
                TextKt.c(k48.b(nk6.the_athletic_message_content, h, 0), n37Var.c(PaddingKt.l(m37.b(n37Var, aVar, 1.0f, false, 2, null), bu1.g(25), bu1.g(f2), bu1.g(14), bu1.g(f2)), aVar3.i()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).e1(), h, 0, 0, 65532);
                Modifier m = PaddingKt.m(aVar, 0.0f, bu1.g(13), bu1.g(20), 0.0f, 9, null);
                h.z(-935967077);
                boolean z2 = (i3 & 896) == 256;
                Object A2 = h.A();
                if (z2 || A2 == Composer.a.a()) {
                    A2 = new qs2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$AthleticTooltip$2$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m764invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m764invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    h.q(A2);
                }
                h.R();
                IconKt.a(fl0.a(oe3.c.a), null, ClickableKt.e(m, false, null, null, (qs2) A2, 7, null), aVar2.a(h, 8).o(), h, 48, 0);
                h.R();
                h.t();
                h.R();
                h.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$AthleticTooltip$3
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
                    AthleticComposablesKt.d(z, qs2Var, qs2Var2, ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void e(final qs2 qs2Var, final qs2 qs2Var2, Composer composer, final int i) {
        int i2;
        zq3.h(qs2Var, "onClickDownload");
        zq3.h(qs2Var2, "onDismiss");
        Composer h = composer.h(1875584545);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1875584545, i2, -1, "com.nytimes.android.theathletic.TAValuePropInterstitial (AthleticComposables.kt:179)");
            }
            AndroidDialog_androidKt.a(qs2Var2, null, zr0.b(h, 221411754, true, new gt2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$TAValuePropInterstitial$1
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
                    if ((i3 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(221411754, i3, -1, "com.nytimes.android.theathletic.TAValuePropInterstitial.<anonymous> (AthleticComposables.kt:181)");
                    }
                    Modifier.a aVar = Modifier.a;
                    eb5.a aVar2 = eb5.Companion;
                    float f = 16;
                    Modifier m = PaddingKt.m(BackgroundKt.d(aVar, aVar2.a(composer2, 8).d(), null, 2, null), 0.0f, 0.0f, 0.0f, bu1.g(f), 7, null);
                    qs2 qs2Var3 = qs2.this;
                    qs2 qs2Var4 = qs2Var2;
                    composer2.z(-483455358);
                    Arrangement.m g = Arrangement.a.g();
                    Alignment.a aVar3 = Alignment.a;
                    rg4 a = d.a(g, aVar3.k(), composer2, 0);
                    composer2.z(-1323940314);
                    int a2 = cs0.a(composer2, 0);
                    et0 o = composer2.o();
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a3 = companion.a();
                    it2 c = LayoutKt.c(m);
                    if (composer2.j() == null) {
                        cs0.c();
                    }
                    composer2.G();
                    if (composer2.f()) {
                        composer2.D(a3);
                    } else {
                        composer2.p();
                    }
                    Composer a4 = Updater.a(composer2);
                    Updater.c(a4, a, companion.e());
                    Updater.c(a4, o, companion.g());
                    gt2 b = companion.b();
                    if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                        a4.q(Integer.valueOf(a2));
                        a4.v(Integer.valueOf(a2), b);
                    }
                    c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                    composer2.z(2058660585);
                    ap0 ap0Var = ap0.a;
                    Modifier d = BackgroundKt.d(SizeKt.h(aVar, 0.0f, 1, null), aVar2.a(composer2, 8).e(), null, 2, null);
                    composer2.z(733328855);
                    rg4 g2 = BoxKt.g(aVar3.o(), false, composer2, 0);
                    composer2.z(-1323940314);
                    int a5 = cs0.a(composer2, 0);
                    et0 o2 = composer2.o();
                    qs2 a6 = companion.a();
                    it2 c2 = LayoutKt.c(d);
                    if (composer2.j() == null) {
                        cs0.c();
                    }
                    composer2.G();
                    if (composer2.f()) {
                        composer2.D(a6);
                    } else {
                        composer2.p();
                    }
                    Composer a7 = Updater.a(composer2);
                    Updater.c(a7, g2, companion.e());
                    Updater.c(a7, o2, companion.g());
                    gt2 b2 = companion.b();
                    if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                        a7.q(Integer.valueOf(a5));
                        a7.v(Integer.valueOf(a5), b2);
                    }
                    c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                    composer2.z(2058660585);
                    ImageKt.b(do5.d(ke6.theathletic_hero_image, composer2, 0), "", BoxScopeInstance.a.c(aVar, aVar3.e()), null, null, 0.0f, null, composer2, 56, 120);
                    composer2.R();
                    composer2.t();
                    composer2.R();
                    composer2.R();
                    SpacerKt.a(PaddingKt.k(aVar, 0.0f, bu1.g(f), 1, null), composer2, 6);
                    ImageKt.b(do5.d(ke6.the_athletic, composer2, 0), "", ap0Var.c(aVar, aVar3.g()), null, null, 0.0f, null, composer2, 56, 120);
                    float f2 = 12;
                    SpacerKt.a(PaddingKt.k(aVar, 0.0f, bu1.g(f2), 1, null), composer2, 6);
                    TextKt.c(k48.b(nk6.theathletic_value_prop, composer2, 0), PaddingKt.k(aVar, bu1.g(f), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(composer2, 8).g1(), composer2, 48, 0, 65532);
                    SpacerKt.a(PaddingKt.k(aVar, 0.0f, bu1.g(f2), 1, null), composer2, 6);
                    ButtonKt.b(k48.b(nk6.theathletic_download, composer2, 0), PaddingKt.k(aVar, bu1.g(f), 0.0f, 2, null), aVar2.c(composer2, 8).v(), null, false, qs2Var3, composer2, 48, 24);
                    SpacerKt.a(PaddingKt.k(aVar, 0.0f, bu1.g(f2), 1, null), composer2, 6);
                    ButtonKt.d(k48.b(nk6.theathletic_no_thanks, composer2, 0), PaddingKt.k(aVar, bu1.g(f), 0.0f, 2, null), null, aVar2.c(composer2, 8).v(), qs2Var4, false, composer2, 48, 36);
                    SpacerKt.a(PaddingKt.k(aVar, 0.0f, bu1.g(2), 1, null), composer2, 6);
                    composer2.R();
                    composer2.t();
                    composer2.R();
                    composer2.R();
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, ((i2 >> 3) & 14) | 384, 2);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.theathletic.AthleticComposablesKt$TAValuePropInterstitial$2
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
                    AthleticComposablesKt.e(qs2.this, qs2Var2, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
