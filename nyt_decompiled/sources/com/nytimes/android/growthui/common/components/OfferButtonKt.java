package com.nytimes.android.growthui.common.components;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.c74;
import defpackage.ca3;
import defpackage.cc7;
import defpackage.d37;
import defpackage.dj7;
import defpackage.ek8;
import defpackage.fb0;
import defpackage.g59;
import defpackage.gt2;
import defpackage.it2;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.l74;
import defpackage.li8;
import defpackage.lj7;
import defpackage.m26;
import defpackage.m37;
import defpackage.m60;
import defpackage.pb8;
import defpackage.ph8;
import defpackage.pl0;
import defpackage.qb8;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.rn8;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ve0;
import defpackage.wh;
import defpackage.wu0;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zc5;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class OfferButtonKt {
    public static final void a(Modifier modifier, final zc5 zc5Var, final String str, final qs2 qs2Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        zq3.h(zc5Var, "offer");
        zq3.h(qs2Var, "action");
        Composer h = composer.h(1920195337);
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
            i3 |= h.S(zc5Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(str) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.S(qs2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        final int i5 = i3;
        if ((i5 & 5851) == 1170 && h.i()) {
            h.K();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(1920195337, i5, -1, "com.nytimes.android.growthui.common.components.OfferButton (OfferButton.kt:47)");
            }
            Modifier b = androidx.compose.animation.b.b(PaddingKt.k(Modifier.a, 0.0f, bu1.g(10), 1, null), null, null, 3, null);
            h.z(-270267587);
            h.z(-3687241);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = new Measurer();
                h.q(A);
            }
            h.R();
            final Measurer measurer = (Measurer) A;
            h.z(-3687241);
            Object A2 = h.A();
            if (A2 == aVar.a()) {
                A2 = new ConstraintLayoutScope();
                h.q(A2);
            }
            h.R();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) A2;
            h.z(-3687241);
            Object A3 = h.A();
            if (A3 == aVar.a()) {
                A3 = b0.e(Boolean.FALSE, null, 2, null);
                h.q(A3);
            }
            h.R();
            Pair f = ConstraintLayoutKt.f(257, constraintLayoutScope, (sy4) A3, measurer, h, 4544);
            rg4 rg4Var = (rg4) f.a();
            final qs2 qs2Var2 = (qs2) f.b();
            final int i6 = 0;
            final Modifier modifier5 = modifier4;
            LayoutKt.a(dj7.d(b, false, new ss2() { // from class: com.nytimes.android.growthui.common.components.OfferButtonKt$OfferButton$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                public final void b(lj7 lj7Var) {
                    zq3.h(lj7Var, "$this$semantics");
                    rn8.a(lj7Var, Measurer.this);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((lj7) obj);
                    return ww8.a;
                }
            }, 1, null), zr0.b(h, -819894182, true, new gt2() { // from class: com.nytimes.android.growthui.common.components.OfferButtonKt$OfferButton$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    if (((i7 & 11) ^ 2) == 0 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    int b2 = ConstraintLayoutScope.this.b();
                    ConstraintLayoutScope.this.c();
                    ConstraintLayoutScope constraintLayoutScope2 = ConstraintLayoutScope.this;
                    composer2.z(1035248708);
                    ConstraintLayoutScope.a f2 = constraintLayoutScope2.f();
                    final wu0 a = f2.a();
                    final wu0 b3 = f2.b();
                    wu0 c = f2.c();
                    ym5 a2 = PaddingKt.a(bu1.g(15));
                    Modifier modifier6 = modifier5;
                    composer2.z(-520790750);
                    boolean S = composer2.S(b3);
                    Object A4 = composer2.A();
                    if (S || A4 == Composer.a.a()) {
                        A4 = new ss2() { // from class: com.nytimes.android.growthui.common.components.OfferButtonKt$OfferButton$1$1$1
                            {
                                super(1);
                            }

                            public final void b(ConstrainScope constrainScope) {
                                zq3.h(constrainScope, "$this$constrainAs");
                                ca3.a.a(constrainScope.g(), wu0.this.e(), bu1.g(14), 0.0f, 4, null);
                                ConstrainScope.c(constrainScope, constrainScope.f(), 0.0f, 2, null);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((ConstrainScope) obj);
                                return ww8.a;
                            }
                        };
                        composer2.q(A4);
                    }
                    composer2.R();
                    Modifier h2 = SizeKt.h(SizeKt.b(constraintLayoutScope2.d(modifier6, a, (ss2) A4), 0.0f, bu1.g(50), 1, null), 0.0f, 1, null);
                    ve0 a3 = a.a.a(c74.a.a(composer2, 6).d().a(), 0L, 0L, 0L, composer2, a.l << 12, 14);
                    qs2 qs2Var3 = qs2Var;
                    final zc5 zc5Var2 = zc5Var;
                    ButtonKt.a(qs2Var3, h2, false, null, null, null, null, a3, a2, zr0.b(composer2, -1461269980, true, new it2() { // from class: com.nytimes.android.growthui.common.components.OfferButtonKt$OfferButton$1$2
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(m37 m37Var, Composer composer3, int i8) {
                            zq3.h(m37Var, "$this$Button");
                            if ((i8 & 81) == 16 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(-1461269980, i8, -1, "com.nytimes.android.growthui.common.components.OfferButton.<anonymous>.<anonymous> (OfferButton.kt:69)");
                            }
                            pb8 d = zc5.this.d();
                            long g = ek8.g(17);
                            o g2 = o.b.g();
                            c74 c74Var = c74.a;
                            TextKt.b(m26.b(null, d, new jy7(c74Var.a(composer3, 6).d().c(), g, g2, (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, 16376, (DefaultConstructorMarker) null), composer3, 0, 1), null, c74Var.a(composer3, 6).d().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, c74Var.b(composer3, 6).q(), composer3, 0, 0, 65530);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer2, ((i5 >> 9) & 14) | 905969664, 124);
                    String str2 = str;
                    boolean z = !(str2 == null || h.d0(str2));
                    Modifier.a aVar2 = Modifier.a;
                    composer2.z(-520755540);
                    boolean S2 = composer2.S(a);
                    Object A5 = composer2.A();
                    if (S2 || A5 == Composer.a.a()) {
                        A5 = new ss2() { // from class: com.nytimes.android.growthui.common.components.OfferButtonKt$OfferButton$1$3$1
                            {
                                super(1);
                            }

                            public final void b(ConstrainScope constrainScope) {
                                zq3.h(constrainScope, "$this$constrainAs");
                                ca3.a.a(constrainScope.g(), constrainScope.f().e(), bu1.g(0), 0.0f, 4, null);
                                g59.a.a(constrainScope.d(), wu0.this.b(), bu1.g(10), 0.0f, 4, null);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((ConstrainScope) obj);
                                return ww8.a;
                            }
                        };
                        composer2.q(A5);
                    }
                    composer2.R();
                    Modifier d = constraintLayoutScope2.d(aVar2, b3, (ss2) A5);
                    final String str3 = str;
                    AnimatedVisibilityKt.f(z, d, null, null, null, zr0.b(composer2, 1296220732, true, new it2() { // from class: com.nytimes.android.growthui.common.components.OfferButtonKt$OfferButton$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((wh) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(wh whVar, Composer composer3, int i8) {
                            zq3.h(whVar, "$this$AnimatedVisibility");
                            if (b.G()) {
                                b.S(1296220732, i8, -1, "com.nytimes.android.growthui.common.components.OfferButton.<anonymous>.<anonymous> (OfferButton.kt:91)");
                            }
                            String str4 = str3;
                            if (str4 == null) {
                                str4 = "";
                            }
                            c74 c74Var = c74.a;
                            TextKt.e(str4, PaddingKt.j(BackgroundKt.d(pl0.a(BorderKt.e(Modifier.a, fb0.a(bu1.g(2), c74Var.a(composer3, 6).e().b()), d37.c(bu1.g(16))), d37.c(bu1.g(100))), c74Var.a(composer3, 6).e().a(), null, 2, null), bu1.g(10), bu1.g(6)), c74Var.a(composer3, 6).e().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c74Var.b(composer3, 6).a(), composer3, 0, 0, 32760);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer2, 196608, 28);
                    boolean a4 = qb8.a(zc5Var.d());
                    composer2.z(-520724698);
                    boolean S3 = composer2.S(a);
                    Object A6 = composer2.A();
                    if (S3 || A6 == Composer.a.a()) {
                        A6 = new ss2() { // from class: com.nytimes.android.growthui.common.components.OfferButtonKt$OfferButton$1$5$1
                            {
                                super(1);
                            }

                            public final void b(ConstrainScope constrainScope) {
                                zq3.h(constrainScope, "$this$constrainAs");
                                ca3.a.a(constrainScope.g(), wu0.this.a(), bu1.g(12), 0.0f, 4, null);
                                ConstrainScope.c(constrainScope, constrainScope.f(), 0.0f, 2, null);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((ConstrainScope) obj);
                                return ww8.a;
                            }
                        };
                        composer2.q(A6);
                    }
                    composer2.R();
                    Modifier d2 = constraintLayoutScope2.d(aVar2, c, (ss2) A6);
                    final zc5 zc5Var3 = zc5Var;
                    AnimatedVisibilityKt.f(a4, d2, null, null, null, zr0.b(composer2, -1032503195, true, new it2() { // from class: com.nytimes.android.growthui.common.components.OfferButtonKt$OfferButton$1$6
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((wh) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(wh whVar, Composer composer3, int i8) {
                            zq3.h(whVar, "$this$AnimatedVisibility");
                            if (b.G()) {
                                b.S(-1032503195, i8, -1, "com.nytimes.android.growthui.common.components.OfferButton.<anonymous>.<anonymous> (OfferButton.kt:114)");
                            }
                            androidx.compose.ui.text.a a5 = m26.a(zc5.this.d(), null, composer3, 0, 2);
                            c74 c74Var = c74.a;
                            TextKt.b(a5, null, c74Var.a(composer3, 6).c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, c74Var.b(composer3, 6).b(), composer3, 0, 0, 65530);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer2, 196608, 28);
                    composer2.R();
                    if (ConstraintLayoutScope.this.b() != b2) {
                        qs2Var2.mo865invoke();
                    }
                }
            }), rg4Var, h, 48, 0);
            h.R();
            if (b.G()) {
                b.R();
            }
            modifier3 = modifier4;
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.common.components.OfferButtonKt$OfferButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    OfferButtonKt.a(Modifier.this, zc5Var, str, qs2Var, composer2, i | 1, i2);
                }
            });
        }
    }
}
