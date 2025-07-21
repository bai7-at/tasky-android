package com.skydoves.balloon.compose;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.comscore.streaming.ContentType;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAlign;
import defpackage.bu1;
import defpackage.c40;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.cz3;
import defpackage.dj7;
import defpackage.et0;
import defpackage.ez3;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hn3;
import defpackage.in3;
import defpackage.it2;
import defpackage.j40;
import defpackage.ju7;
import defpackage.lj7;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.pb;
import defpackage.py1;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yz5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class BalloonKt {

    static final class a implements Runnable {
        final /* synthetic */ ss2 a;
        final /* synthetic */ ComposeView b;

        a(ss2 ss2Var, ComposeView composeView) {
            this.a = ss2Var;
            this.b = composeView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.invoke(this.b);
        }
    }

    public static final void a(Modifier modifier, final Balloon.a aVar, Object obj, ss2 ss2Var, ss2 ss2Var2, gt2 gt2Var, final it2 it2Var, Composer composer, final int i, final int i2) {
        boolean z;
        Object obj2;
        final BalloonComposeView balloonComposeView;
        zq3.h(aVar, "builder");
        zq3.h(it2Var, "content");
        Composer h = composer.h(-851848777);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.a : modifier;
        Object obj3 = (i2 & 4) != 0 ? null : obj;
        ss2 ss2Var3 = (i2 & 8) != 0 ? new ss2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$1
            public final void b(ComposeView composeView) {
                zq3.h(composeView, "it");
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                b((ComposeView) obj4);
                return ww8.a;
            }
        } : ss2Var;
        ss2 ss2Var4 = (i2 & 16) != 0 ? new ss2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$2
            public final void b(j40 j40Var) {
                zq3.h(j40Var, "it");
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                b((j40) obj4);
                return ww8.a;
            }
        } : ss2Var2;
        gt2 gt2Var2 = (i2 & 32) != 0 ? null : gt2Var;
        if (b.G()) {
            b.S(-851848777, i, -1, "com.skydoves.balloon.compose.Balloon (Balloon.kt:76)");
        }
        Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
        View view = (View) h.m(AndroidCompositionLocals_androidKt.k());
        h.z(-492369756);
        Object A = h.A();
        Composer.a aVar2 = Composer.a;
        Object obj4 = A;
        if (A == aVar2.a()) {
            ComposeView composeView = new ComposeView(context, null, 0, 6, null);
            ViewTreeLifecycleOwner.b(composeView, ViewTreeLifecycleOwner.a(view));
            ViewTreeViewModelStoreOwner.b(composeView, ViewTreeViewModelStoreOwner.a(view));
            ViewTreeSavedStateRegistryOwner.b(composeView, ViewTreeSavedStateRegistryOwner.a(view));
            composeView.post(new a(ss2Var3, composeView));
            h.q(composeView);
            obj4 = composeView;
        }
        h.R();
        final ComposeView composeView2 = (ComposeView) obj4;
        c d = cs0.d(h, 0);
        int i3 = i >> 15;
        final x08 o = y.o(gt2Var2, h, i3 & 14);
        boolean z2 = gt2Var2 != null;
        final gt2 gt2Var3 = gt2Var2;
        final ss2 ss2Var5 = ss2Var4;
        UUID uuid = (UUID) RememberSaveableKt.b(new Object[0], null, null, new qs2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$id$1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UUID mo865invoke() {
                return UUID.randomUUID();
            }
        }, h, 3080, 6);
        h.z(1157296644);
        boolean S = h.S(obj3);
        Object A2 = h.A();
        if (S || A2 == aVar2.a()) {
            zq3.e(uuid);
            BalloonComposeView balloonComposeView2 = new BalloonComposeView(composeView2, z2, aVar, uuid);
            if (z2) {
                z = true;
                balloonComposeView2.m(d, zr0.c(-1629600746, true, new it2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$balloonComposeView$1$1$1
                    {
                        super(3);
                    }

                    public final void b(BalloonComposeView balloonComposeView3, Composer composer2, int i4) {
                        zq3.h(balloonComposeView3, "it");
                        if ((i4 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1629600746, i4, -1, "com.skydoves.balloon.compose.Balloon.<anonymous>.<anonymous>.<anonymous> (Balloon.kt:101)");
                        }
                        Modifier d2 = dj7.d(Modifier.a, false, new ss2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$balloonComposeView$1$1$1.1
                            public final void b(lj7 lj7Var) {
                                zq3.h(lj7Var, "$this$semantics");
                                BalloonSemanticsKt.a(lj7Var);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                                b((lj7) obj5);
                                return ww8.a;
                            }
                        }, 1, null);
                        final x08 x08Var = x08.this;
                        BalloonKt.c(d2, zr0.b(composer2, 807728771, true, new gt2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$balloonComposeView$1$1$1.2
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6) {
                                invoke((Composer) obj5, ((Number) obj6).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                gt2 b;
                                if ((i5 & 11) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(807728771, i5, -1, "com.skydoves.balloon.compose.Balloon.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Balloon.kt:104)");
                                }
                                b = BalloonKt.b(x08.this);
                                if (b != null) {
                                    b.invoke(composer3, 0);
                                }
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        }), composer2, 48, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6, Object obj7) {
                        b((BalloonComposeView) obj5, (Composer) obj6, ((Number) obj7).intValue());
                        return ww8.a;
                    }
                }));
            } else {
                z = true;
            }
            h.q(balloonComposeView2);
            obj2 = balloonComposeView2;
        } else {
            z = true;
            obj2 = A2;
        }
        h.R();
        final BalloonComposeView balloonComposeView3 = (BalloonComposeView) obj2;
        ww8 ww8Var = ww8.a;
        h.z(-1159532838);
        boolean C = h.C(ss2Var5) | h.S(balloonComposeView3);
        Object A3 = h.A();
        if (C || A3 == aVar2.a()) {
            A3 = new BalloonKt$Balloon$3$1(ss2Var5, balloonComposeView3, null);
            h.q(A3);
        }
        h.R();
        py1.d(ww8Var, (gt2) A3, h, 70);
        h.z(986536304);
        if (z2 && balloonComposeView3.getBalloonLayoutInfo$balloon_compose_release().getValue() == null) {
            Configuration configuration = (Configuration) h.m(AndroidCompositionLocals_androidKt.f());
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            h.z(-492369756);
            Object A4 = h.A();
            if (A4 == aVar2.a()) {
                A4 = Integer.valueOf((int) fm1Var.f1(bu1.g(configuration.screenWidthDp)));
                h.q(A4);
            }
            h.R();
            final int intValue = ((Number) A4).intValue();
            h.z(-492369756);
            Object A5 = h.A();
            if (A5 == aVar2.a()) {
                A5 = bu1.d(fm1Var.v(aVar.u0() + aVar.Y()));
                h.q(A5);
            }
            h.R();
            final float n = ((bu1) A5).n();
            h.z(-492369756);
            Object A6 = h.A();
            if (A6 == aVar2.a()) {
                A6 = bu1.d(fm1Var.v(aVar.v0() + aVar.Z()));
                h.q(A6);
            }
            h.R();
            final float n2 = ((bu1) A6).n();
            balloonComposeView = balloonComposeView3;
            AndroidPopup_androidKt.c(null, 0L, null, new yz5(false, false, false, null, false, false, 57, null), zr0.b(h, 276797535, z, new gt2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj5, Object obj6) {
                    invoke((Composer) obj5, ((Number) obj6).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(276797535, i4, -1, "com.skydoves.balloon.compose.Balloon.<anonymous> (Balloon.kt:129)");
                    }
                    Modifier m = PaddingKt.m(pb.a(Modifier.a, 0.0f), n, 0.0f, n2, 0.0f, 10, null);
                    composer2.z(-1159531991);
                    boolean d2 = composer2.d(intValue) | composer2.S(balloonComposeView3);
                    final int i5 = intValue;
                    final BalloonComposeView balloonComposeView4 = balloonComposeView3;
                    Object A7 = composer2.A();
                    if (d2 || A7 == Composer.a.a()) {
                        A7 = new ss2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$4$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(cz3 cz3Var) {
                                zq3.h(cz3Var, "coordinates");
                                long a2 = cz3Var.a();
                                int g = hn3.g(a2);
                                int i6 = i5;
                                if (g <= i6) {
                                    i6 = hn3.g(a2);
                                }
                                long a3 = in3.a(i6, hn3.f(cz3Var.a()));
                                balloonComposeView4.o(a3);
                                balloonComposeView4.getBalloonLayoutInfo$balloon_compose_release().setValue(new c40(fd5.o(ez3.f(cz3Var)), fd5.p(ez3.f(cz3Var)), hn3.g(a3), hn3.f(a3)));
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                                b((cz3) obj5);
                                return ww8.a;
                            }
                        };
                        composer2.q(A7);
                    }
                    composer2.R();
                    Modifier a2 = h.a(m, (ss2) A7);
                    gt2 gt2Var4 = gt2Var3;
                    composer2.z(733328855);
                    rg4 g = BoxKt.g(Alignment.a.o(), false, composer2, 0);
                    composer2.z(-1323940314);
                    int a3 = cs0.a(composer2, 0);
                    et0 o2 = composer2.o();
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a4 = companion.a();
                    it2 c = LayoutKt.c(a2);
                    if (composer2.j() == null) {
                        cs0.c();
                    }
                    composer2.G();
                    if (composer2.f()) {
                        composer2.D(a4);
                    } else {
                        composer2.p();
                    }
                    Composer a5 = Updater.a(composer2);
                    Updater.c(a5, g, companion.e());
                    Updater.c(a5, o2, companion.g());
                    gt2 b = companion.b();
                    if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                        a5.q(Integer.valueOf(a3));
                        a5.v(Integer.valueOf(a3), b);
                    }
                    c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                    composer2.z(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                    composer2.z(-233420289);
                    if (gt2Var4 != null) {
                        gt2Var4.invoke(composer2, 0);
                    }
                    composer2.R();
                    composer2.R();
                    composer2.t();
                    composer2.R();
                    composer2.R();
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 27648, 7);
        } else {
            balloonComposeView = balloonComposeView3;
        }
        h.R();
        h.z(-1159531166);
        boolean S2 = h.S(balloonComposeView);
        Object A7 = h.A();
        if (S2 || A7 == aVar2.a()) {
            A7 = new ss2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$5$1
                {
                    super(1);
                }

                public final void b(cz3 cz3Var) {
                    zq3.h(cz3Var, "it");
                    BalloonComposeView balloonComposeView4 = BalloonComposeView.this;
                    BalloonAlign N = balloonComposeView4.getBalloon().N();
                    if (N == null) {
                        N = BalloonAlign.BOTTOM;
                    }
                    balloonComposeView4.n(N, 0, 0);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                    b((cz3) obj5);
                    return ww8.a;
                }
            };
            h.q(A7);
        }
        h.R();
        Modifier a2 = OnRemeasuredModifierKt.a(h.a(modifier2, (ss2) A7), new ss2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$6
            {
                super(1);
            }

            public final void b(long j) {
                ComposeView composeView3 = ComposeView.this;
                ViewGroup.LayoutParams layoutParams = composeView3.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = hn3.g(j);
                layoutParams.height = hn3.f(j);
                composeView3.setLayoutParams(layoutParams);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                b(((hn3) obj5).j());
                return ww8.a;
            }
        });
        h.z(733328855);
        rg4 g = BoxKt.g(Alignment.a.o(), false, h, 0);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o2 = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(a2);
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
        Updater.c(a5, g, companion.e());
        Updater.c(a5, o2, companion.g());
        gt2 b = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        AndroidView_androidKt.b(new ss2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$7$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ComposeView invoke(Context context2) {
                zq3.h(context2, "it");
                return ComposeView.this;
            }
        }, BoxScopeInstance.a.e(Modifier.a), null, h, 0, 4);
        it2Var.invoke(balloonComposeView, h, Integer.valueOf(i3 & ContentType.LONG_FORM_ON_DEMAND));
        h.R();
        h.t();
        h.R();
        h.R();
        py1.a(obj3, new ss2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$8

            public static final class a implements ms1 {
                final /* synthetic */ BalloonComposeView a;
                final /* synthetic */ ComposeView b;

                public a(BalloonComposeView balloonComposeView, ComposeView composeView) {
                    this.a = balloonComposeView;
                    this.b = composeView;
                }

                @Override // defpackage.ms1
                public void dispose() {
                    this.a.l();
                    ComposeView composeView = this.b;
                    ViewTreeSavedStateRegistryOwner.b(composeView, null);
                    ViewTreeLifecycleOwner.b(composeView, null);
                    ViewTreeViewModelStoreOwner.b(composeView, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                zq3.h(ns1Var, "$this$DisposableEffect");
                return new a(BalloonComposeView.this, composeView2);
            }
        }, h, 8);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            final Object obj5 = obj3;
            final ss2 ss2Var6 = ss2Var3;
            k.a(new gt2() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj6, Object obj7) {
                    invoke((Composer) obj6, ((Number) obj7).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    BalloonKt.a(Modifier.this, aVar, obj5, ss2Var6, ss2Var5, gt2Var3, it2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gt2 b(x08 x08Var) {
        return (gt2) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Modifier modifier, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-1755950697);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(-1755950697, i3, -1, "com.skydoves.balloon.compose.BalloonLayout (Balloon.kt:200)");
            }
            BalloonKt$BalloonLayout$1 balloonKt$BalloonLayout$1 = new rg4() { // from class: com.skydoves.balloon.compose.BalloonKt$BalloonLayout$1
                @Override // defpackage.rg4
                public final sg4 d(f fVar, List list, long j) {
                    zq3.h(fVar, "$this$Layout");
                    zq3.h(list, "measurables");
                    long e = fv0.e(j, 0, 0, 0, 0, 10, null);
                    List list2 = list;
                    final ArrayList arrayList = new ArrayList(i.w(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((qg4) it2.next()).W(e));
                    }
                    Iterator it3 = arrayList.iterator();
                    if (!it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int F0 = ((l) it3.next()).F0();
                    while (it3.hasNext()) {
                        int F02 = ((l) it3.next()).F0();
                        if (F0 < F02) {
                            F0 = F02;
                        }
                    }
                    int max = Integer.max(F0, fv0.p(j));
                    Iterator it4 = arrayList.iterator();
                    if (!it4.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int v0 = ((l) it4.next()).v0();
                    while (it4.hasNext()) {
                        int v02 = ((l) it4.next()).v0();
                        if (v0 < v02) {
                            v0 = v02;
                        }
                    }
                    return f.J(fVar, max, Integer.max(v0, fv0.o(j)), null, new ss2() { // from class: com.skydoves.balloon.compose.BalloonKt$BalloonLayout$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(l.a aVar) {
                            zq3.h(aVar, "$this$layout");
                            Iterator<T> it5 = arrayList.iterator();
                            while (it5.hasNext()) {
                                l.a.f(aVar, (l) it5.next(), 0, 0, 0.0f, 4, null);
                            }
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((l.a) obj);
                            return ww8.a;
                        }
                    }, 4, null);
                }
            };
            int i5 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
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
            Updater.c(a4, balloonKt$BalloonLayout$1, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            gt2Var.invoke(h, Integer.valueOf((i6 >> 9) & 14));
            h.R();
            h.t();
            h.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.skydoves.balloon.compose.BalloonKt$BalloonLayout$2
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
                    BalloonKt.c(Modifier.this, gt2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
