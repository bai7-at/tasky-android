package com.nytimes.subauth.ui.ui.widgets;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.subauth.ui.ui.theme.ColorKt;
import defpackage.bu1;
import defpackage.c37;
import defpackage.cc7;
import defpackage.cf6;
import defpackage.d37;
import defpackage.dj7;
import defpackage.do5;
import defpackage.dy4;
import defpackage.eb0;
import defpackage.ej3;
import defpackage.ek8;
import defpackage.ex7;
import defpackage.f74;
import defpackage.fb0;
import defpackage.fo3;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j98;
import defpackage.jj7;
import defpackage.k48;
import defpackage.l27;
import defpackage.lj7;
import defpackage.m37;
import defpackage.mm6;
import defpackage.nn0;
import defpackage.pb;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ve0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class SSOButtonsKt {
    public static final void a(final boolean z, final qs2 qs2Var, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-850285450);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                z = true;
            }
            if (b.G()) {
                b.S(-850285450, i3, -1, "com.nytimes.subauth.ui.ui.widgets.FacebookSSOButton (SSOButtons.kt:62)");
            }
            Resources resources = ((Context) h.m(AndroidCompositionLocals_androidKt.g())).getResources();
            String b = k48.b(mm6.subauth_email_first_screen_facebook_sso_button_accessibility, h, 0);
            int i5 = cf6.logo_facebook_vector;
            String string = resources.getString(mm6.subauth_email_first_facebook_sso_button_label);
            zq3.g(string, "getString(...)");
            c(i5, string, b, z, qs2Var, h, (i3 << 9) & 64512);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.widgets.SSOButtonsKt$FacebookSSOButton$1
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
                    SSOButtonsKt.a(z, qs2Var, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void b(final boolean z, final qs2 qs2Var, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-1469426461);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                z = true;
            }
            if (b.G()) {
                b.S(-1469426461, i3, -1, "com.nytimes.subauth.ui.ui.widgets.GoogleSSOButton (SSOButtons.kt:44)");
            }
            Resources resources = ((Context) h.m(AndroidCompositionLocals_androidKt.g())).getResources();
            String b = k48.b(mm6.subauth_email_first_screen_google_sso_button_accessibility, h, 0);
            int i5 = cf6.logo_google_vector;
            String string = resources.getString(mm6.subauth_email_first_google_sso_button_label);
            zq3.g(string, "getString(...)");
            c(i5, string, b, z, qs2Var, h, (i3 << 9) & 64512);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.widgets.SSOButtonsKt$GoogleSSOButton$1
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
                    SSOButtonsKt.b(z, qs2Var, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final void c(final int i, final String str, final String str2, final boolean z, final qs2 qs2Var, Composer composer, final int i2) {
        int i3;
        long B;
        Composer composer2;
        zq3.h(str, "label");
        zq3.h(str2, "accessibilityLabel");
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-1709173473);
        if ((i2 & 14) == 0) {
            i3 = (h.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h.S(str2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h.a(z) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= h.S(qs2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i4 = i3;
        if ((46811 & i4) == 9362 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1709173473, i4, -1, "com.nytimes.subauth.ui.ui.widgets.SSOButton (SSOButtons.kt:84)");
            }
            h.z(446015587);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = fo3.a();
                h.q(A);
            }
            dy4 dy4Var = (dy4) A;
            h.R();
            ej3 e = l27.e(false, 0.0f, nn0.b.a(), h, 384, 3);
            x08 a = PressInteractionKt.a(dy4Var, h, 6);
            float f = z ? 1.0f : 0.4f;
            final ex7 a2 = f74.a.a(h, f74.b);
            a aVar2 = a.a;
            if (d(a)) {
                h.z(942190213);
                B = ColorKt.B(j98.a.b(h, 8).x());
                h.R();
            } else {
                h.z(942292079);
                B = ColorKt.B(j98.a.b(h, 8).B());
                h.R();
            }
            ve0 a3 = aVar2.a(B, 0L, 0L, 0L, h, a.l << 12, 14);
            eb0 a4 = fb0.a(bu1.g(1), ColorKt.B(j98.a.b(h, 8).e()));
            c37 c = d37.c(bu1.g(3));
            float f2 = 14;
            ym5 e2 = PaddingKt.e(0.0f, bu1.g(f2), 0.0f, bu1.g(f2), 5, null);
            Modifier b = IndicationKt.b(pb.a(SizeKt.h(Modifier.a, 0.0f, 1, null), f), dy4Var, e);
            h.z(446054919);
            boolean S = h.S(str2);
            Object A2 = h.A();
            if (S || A2 == aVar.a()) {
                A2 = new ss2() { // from class: com.nytimes.subauth.ui.ui.widgets.SSOButtonsKt$SSOButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(lj7 lj7Var) {
                        zq3.h(lj7Var, "$this$semantics");
                        jj7.O(lj7Var, str2);
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
            Modifier c2 = dj7.c(b, true, (ss2) A2);
            h.z(446029988);
            boolean S2 = h.S(a2) | h.S(qs2Var);
            Object A3 = h.A();
            if (S2 || A3 == aVar.a()) {
                A3 = new qs2() { // from class: com.nytimes.subauth.ui.ui.widgets.SSOButtonsKt$SSOButton$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m850invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m850invoke() {
                        ex7 ex7Var = ex7.this;
                        if (ex7Var != null) {
                            ex7Var.c();
                        }
                        qs2Var.mo865invoke();
                    }
                };
                h.q(A3);
            }
            h.R();
            composer2 = h;
            ButtonKt.a((qs2) A3, c2, z, dy4Var, null, c, a4, a3, e2, zr0.b(h, 549259535, true, new it2() { // from class: com.nytimes.subauth.ui.ui.widgets.SSOButtonsKt$SSOButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer3, int i5) {
                    zq3.h(m37Var, "$this$Button");
                    if ((i5 & 81) == 16 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(549259535, i5, -1, "com.nytimes.subauth.ui.ui.widgets.SSOButton.<anonymous> (SSOButtons.kt:119)");
                    }
                    ImageKt.b(do5.d(i, composer3, 0), null, null, null, null, 0.0f, null, composer3, 56, 124);
                    TextKt.e(str, dj7.a(PaddingKt.m(Modifier.a, bu1.g(8), 0.0f, 0.0f, 0.0f, 14, null), new ss2() { // from class: com.nytimes.subauth.ui.ui.widgets.SSOButtonsKt$SSOButton$3.1
                        public final void b(lj7 lj7Var) {
                            zq3.h(lj7Var, "$this$clearAndSetSemantics");
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((lj7) obj);
                            return ww8.a;
                        }
                    }), ColorKt.B(j98.a.b(composer3, 8).C()), ek8.g(16), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 3072, 0, 65520);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), composer2, ((i4 >> 3) & 896) | 805334016, 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.widgets.SSOButtonsKt$SSOButton$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    SSOButtonsKt.c(i, str, str2, z, qs2Var, composer3, i2 | 1);
                }
            });
        }
    }

    private static final boolean d(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }
}
