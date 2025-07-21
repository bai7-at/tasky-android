package com.nytimes.android.features.you.youtab.composable.interests;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.SingletonAsyncImageKt;
import com.nytimes.android.interests.InterestPreview;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.ch3;
import defpackage.cs0;
import defpackage.d37;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gk0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.m37;
import defpackage.n37;
import defpackage.oe3;
import defpackage.ol6;
import defpackage.p8;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class CommonComponentsKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r26, final defpackage.qs2 r27, androidx.compose.ui.Modifier r28, boolean r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.interests.CommonComponentsKt.a(java.lang.String, qs2, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final InterestPreview interestPreview, final boolean z, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        long U;
        zq3.h(interestPreview, "interestPreview");
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-928205523);
        Modifier modifier2 = (i2 & 8) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-928205523, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.InterestPreviewCard (CommonComponents.kt:48)");
        }
        Modifier i3 = SizeKt.i(SizeKt.h(modifier2, 0.0f, 1, null), bu1.g(148));
        float g = bu1.g(1);
        if (z) {
            h.z(125046466);
            U = eb5.Companion.a(h, 8).S();
            h.R();
        } else {
            h.z(125046549);
            U = eb5.Companion.a(h, 8).U();
            h.R();
        }
        float f = 5;
        final Modifier modifier3 = modifier2;
        SurfaceKt.a(BackgroundKt.c(BorderKt.f(i3, g, U, d37.c(bu1.g(f))), eb5.Companion.a(h, 8).d(), d37.c(bu1.g(f))), null, 0L, 0L, null, 0.0f, zr0.b(h, -1990776471, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.CommonComponentsKt$InterestPreviewCard$1
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
                Modifier.a aVar;
                eb5.a aVar2;
                Composer composer3;
                eb5.a aVar3;
                int i5;
                long U2;
                long d;
                if ((i4 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1990776471, i4, -1, "com.nytimes.android.features.you.youtab.composable.interests.InterestPreviewCard.<anonymous> (CommonComponents.kt:67)");
                }
                Arrangement arrangement = Arrangement.a;
                Arrangement.f d2 = arrangement.d();
                Modifier.a aVar4 = Modifier.a;
                Modifier f2 = SizeKt.f(aVar4, 0.0f, 1, null);
                eb5.a aVar5 = eb5.Companion;
                Modifier d3 = BackgroundKt.d(f2, aVar5.a(composer2, 8).d(), null, 2, null);
                InterestPreview interestPreview2 = InterestPreview.this;
                final boolean z2 = z;
                final qs2 qs2Var2 = qs2Var;
                composer2.z(693286680);
                Alignment.a aVar6 = Alignment.a;
                rg4 a = m.a(d2, aVar6.l(), composer2, 6);
                composer2.z(-1323940314);
                int a2 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c = LayoutKt.c(d3);
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
                n37 n37Var = n37.a;
                Arrangement.f b2 = arrangement.b();
                Alignment.b g2 = aVar6.g();
                Modifier b3 = AspectRatioKt.b(BackgroundKt.d(SizeKt.d(aVar4, 0.0f, 1, null), aVar5.a(composer2, 8).h(), null, 2, null), 0.89f, false, 2, null);
                composer2.z(-483455358);
                rg4 a5 = d.a(b2, g2, composer2, 54);
                composer2.z(-1323940314);
                int a6 = cs0.a(composer2, 0);
                et0 o2 = composer2.o();
                qs2 a7 = companion.a();
                it2 c2 = LayoutKt.c(b3);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a7);
                } else {
                    composer2.p();
                }
                Composer a8 = Updater.a(composer2);
                Updater.c(a8, a5, companion.e());
                Updater.c(a8, o2, companion.g());
                gt2 b4 = companion.b();
                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                    a8.q(Integer.valueOf(a6));
                    a8.v(Integer.valueOf(a6), b4);
                }
                c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ap0 ap0Var = ap0.a;
                SingletonAsyncImageKt.a(new vg3.a((Context) composer2.m(AndroidCompositionLocals_androidKt.g())).d(interestPreview2.d()).g(re6.ic_placeholder).f(re6.ic_placeholder).c(true).a(), null, AspectRatioKt.b(SizeKt.n(aVar4, bu1.g(84)), 0.1f, false, 2, null), null, null, null, ContentScale.a.e(), 0.0f, null, 0, composer2, 1573304, 952);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                Modifier i6 = PaddingKt.i(aVar4, bu1.g(16));
                composer2.z(693286680);
                rg4 a9 = m.a(arrangement.f(), aVar6.l(), composer2, 0);
                composer2.z(-1323940314);
                int a10 = cs0.a(composer2, 0);
                et0 o3 = composer2.o();
                qs2 a11 = companion.a();
                it2 c3 = LayoutKt.c(i6);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a11);
                } else {
                    composer2.p();
                }
                Composer a12 = Updater.a(composer2);
                Updater.c(a12, a9, companion.e());
                Updater.c(a12, o3, companion.g());
                gt2 b5 = companion.b();
                if (a12.f() || !zq3.c(a12.A(), Integer.valueOf(a10))) {
                    a12.q(Integer.valueOf(a10));
                    a12.v(Integer.valueOf(a10), b5);
                }
                c3.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                Arrangement.f b6 = arrangement.b();
                Alignment.b g3 = aVar6.g();
                Modifier b7 = m37.b(n37Var, SizeKt.d(aVar4, 0.0f, 1, null), 1.0f, false, 2, null);
                composer2.z(-483455358);
                rg4 a13 = d.a(b6, g3, composer2, 54);
                composer2.z(-1323940314);
                int a14 = cs0.a(composer2, 0);
                et0 o4 = composer2.o();
                qs2 a15 = companion.a();
                it2 c4 = LayoutKt.c(b7);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a15);
                } else {
                    composer2.p();
                }
                Composer a16 = Updater.a(composer2);
                Updater.c(a16, a13, companion.e());
                Updater.c(a16, o4, companion.g());
                gt2 b8 = companion.b();
                if (a16.f() || !zq3.c(a16.A(), Integer.valueOf(a14))) {
                    a16.q(Integer.valueOf(a14));
                    a16.v(Integer.valueOf(a14), b8);
                }
                c4.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                composer2.z(-1041629222);
                if (interestPreview2.g()) {
                    aVar2 = aVar5;
                    aVar = aVar4;
                    TextKt.b(k48.b(yk6.interest_opinion, composer2, 0), SizeKt.h(PaddingKt.m(aVar4, 0.0f, 0.0f, 0.0f, bu1.g(5), 7, null), 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar5.c(composer2, 8).g0(), composer2, 48, 0, 65532);
                } else {
                    aVar = aVar4;
                    aVar2 = aVar5;
                }
                composer2.R();
                eb5.a aVar7 = aVar2;
                float f3 = 6;
                TextKt.b(interestPreview2.c(), SizeKt.h(PaddingKt.m(aVar, 0.0f, 0.0f, 0.0f, bu1.g(f3), 7, null), 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar7.c(composer2, 8).h0(), composer2, 48, 0, 65532);
                Modifier.a aVar8 = aVar;
                TextKt.b(interestPreview2.a(), SizeKt.h(aVar8, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar7.c(composer2, 8).f0(), composer2, 48, 0, 65532);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                float g4 = bu1.g(1);
                if (z2) {
                    composer3 = composer2;
                    composer3.z(-330602311);
                    aVar3 = aVar7;
                    i5 = 8;
                    U2 = aVar3.a(composer3, 8).S();
                    composer2.R();
                } else {
                    composer3 = composer2;
                    aVar3 = aVar7;
                    i5 = 8;
                    composer3.z(-330602204);
                    U2 = aVar3.a(composer3, 8).U();
                    composer2.R();
                }
                float f4 = 100;
                Modifier f5 = BorderKt.f(aVar8, g4, U2, d37.c(bu1.g(f4)));
                if (z2) {
                    composer3.z(-330601913);
                    d = aVar3.a(composer3, i5).f();
                    composer2.R();
                } else {
                    composer3.z(-330601794);
                    d = aVar3.a(composer3, i5).d();
                    composer2.R();
                }
                Modifier i7 = PaddingKt.i(SizeKt.n(BackgroundKt.c(f5, d, d37.c(bu1.g(f4))), bu1.g(30)), bu1.g(f3));
                composer3.z(-330601541);
                boolean S = composer3.S(qs2Var2);
                Object A = composer2.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.CommonComponentsKt$InterestPreviewCard$1$1$2$2$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m478invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m478invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer3.q(A);
                }
                composer2.R();
                IconButtonKt.a((qs2) A, i7, false, null, null, zr0.b(composer3, -193946012, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.CommonComponentsKt$InterestPreviewCard$1$1$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer4, int i8) {
                        long l;
                        if ((i8 & 11) == 2 && composer4.i()) {
                            composer4.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-193946012, i8, -1, "com.nytimes.android.features.you.youtab.composable.interests.InterestPreviewCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonComponents.kt:150)");
                        }
                        ch3 a17 = z2 ? gk0.a(oe3.a.a()) : p8.a(oe3.a.a());
                        String b9 = k48.b(yk6.add_content_description, composer4, 0);
                        if (z2) {
                            composer4.z(-1041626814);
                            l = eb5.Companion.a(composer4, 8).o();
                            composer4.R();
                        } else {
                            composer4.z(-1041626706);
                            l = eb5.Companion.a(composer4, 8).l();
                            composer4.R();
                        }
                        IconKt.a(a17, b9, null, l, composer4, 0, 4);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 196608, 28);
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
        }), h, 1572864, 62);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.CommonComponentsKt$InterestPreviewCard$2
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
                    CommonComponentsKt.b(InterestPreview.this, z, qs2Var, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void c(Activity activity) {
        zq3.h(activity, "activity");
        Toast.makeText(activity.getApplicationContext(), ol6.subauth_offline_error, 0).show();
    }
}
