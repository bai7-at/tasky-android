package com.nytimes.android;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.media.audio.views.AudioOnboardingBar;
import com.nytimes.android.messaging.dock.DockView;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.db;
import defpackage.et0;
import defpackage.fc1;
import defpackage.fg6;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ic3;
import defpackage.it2;
import defpackage.jk;
import defpackage.ju7;
import defpackage.m37;
import defpackage.n37;
import defpackage.pb;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.s5;
import defpackage.tg6;
import defpackage.vn8;
import defpackage.ww8;
import defpackage.z12;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public abstract class AirTrafficControlDebugModeKt {
    public static final void a(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer h = composer.h(775001730);
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
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.a : modifier2;
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(775001730, i3, -1, "com.nytimes.android.AirTrafficControlDebugMode (AirTrafficControlDebugMode.kt:41)");
            }
            ComponentActivity b = s5.b(h, 0);
            zq3.f(b, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            jk jkVar = (jk) b;
            h.z(169908575);
            ComponentActivity b2 = s5.b(h, 0);
            zq3.f(b2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            jk jkVar2 = (jk) b2;
            h.z(1503843850);
            Object A = h.A();
            if (A == Composer.a.a()) {
                A = z12.a(jkVar2, db.class);
                h.q(A);
            }
            h.R();
            h.R();
            db dbVar = (db) A;
            h.z(-483455358);
            Arrangement arrangement = Arrangement.a;
            Arrangement.m g = arrangement.g();
            Alignment.a aVar = Alignment.a;
            rg4 a = androidx.compose.foundation.layout.d.a(g, aVar.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(modifier3);
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
            gt2 b3 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b3);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            Modifier c2 = ap0.a.c(pb.a(Modifier.a, 0.7f), aVar.g());
            h.z(693286680);
            rg4 a5 = androidx.compose.foundation.layout.m.a(arrangement.f(), aVar.l(), h, 0);
            h.z(-1323940314);
            int a6 = cs0.a(h, 0);
            et0 o2 = h.o();
            qs2 a7 = companion.a();
            it2 c3 = LayoutKt.c(c2);
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
            gt2 b4 = companion.b();
            if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                a8.q(Integer.valueOf(a6));
                a8.v(Integer.valueOf(a6), b4);
            }
            c3.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            n37 n37Var = n37.a;
            g(h, 0);
            c(jkVar, h, 8);
            h.R();
            h.t();
            h.R();
            h.R();
            h.z(693286680);
            rg4 a9 = androidx.compose.foundation.layout.m.a(arrangement.f(), aVar.l(), h, 0);
            h.z(-1323940314);
            int a10 = cs0.a(h, 0);
            et0 o3 = h.o();
            qs2 a11 = companion.a();
            it2 c4 = LayoutKt.c(c2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a11);
            } else {
                h.p();
            }
            Composer a12 = Updater.a(h);
            Updater.c(a12, a9, companion.e());
            Updater.c(a12, o3, companion.g());
            gt2 b5 = companion.b();
            if (a12.f() || !zq3.c(a12.A(), Integer.valueOf(a10))) {
                a12.q(Integer.valueOf(a10));
                a12.v(Integer.valueOf(a10), b5);
            }
            c4.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h(dbVar.B(), h, 8);
            f(dbVar.B(), h, 8);
            h.R();
            h.t();
            h.R();
            h.R();
            h.z(693286680);
            rg4 a13 = androidx.compose.foundation.layout.m.a(arrangement.f(), aVar.l(), h, 0);
            h.z(-1323940314);
            int a14 = cs0.a(h, 0);
            et0 o4 = h.o();
            qs2 a15 = companion.a();
            it2 c5 = LayoutKt.c(c2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a15);
            } else {
                h.p();
            }
            Composer a16 = Updater.a(h);
            Updater.c(a16, a13, companion.e());
            Updater.c(a16, o4, companion.g());
            gt2 b6 = companion.b();
            if (a16.f() || !zq3.c(a16.A(), Integer.valueOf(a14))) {
                a16.q(Integer.valueOf(a14));
                a16.v(Integer.valueOf(a14), b6);
            }
            c5.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            d(jkVar, dbVar.g0(), h, 72);
            e(jkVar, h, 8);
            h.R();
            h.t();
            h.R();
            h.R();
            h.R();
            h.t();
            h.R();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$AirTrafficControlDebugMode$2
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
                    AirTrafficControlDebugModeKt.a(Modifier.this, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final String str, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-1416611573);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1416611573, i2, -1, "com.nytimes.android.DebugButton (AirTrafficControlDebugMode.kt:138)");
            }
            composer2 = h;
            ButtonKt.a(qs2Var, PaddingKt.i(Modifier.a, bu1.g(8)), false, null, null, null, null, null, null, zr0.b(h, -293084389, true, new it2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$DebugButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer3, int i3) {
                    zq3.h(m37Var, "$this$Button");
                    if ((i3 & 81) == 16 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-293084389, i3, -1, "com.nytimes.android.DebugButton.<anonymous> (AirTrafficControlDebugMode.kt:143)");
                    }
                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, ((i2 >> 3) & 14) | 805306416, 508);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$DebugButton$2
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
                    AirTrafficControlDebugModeKt.b(str, qs2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Activity activity, Composer composer, final int i) {
        Composer h = composer.h(-37542512);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-37542512, i, -1, "com.nytimes.android.DockDebugButton (AirTrafficControlDebugMode.kt:116)");
        }
        b("Dock", new qs2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$DockDebugButton$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m164invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m164invoke() {
                ((DockView) activity.findViewById(tg6.dock_container)).toggleVisibilityInDebugMode();
            }
        }, h, 6);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$DockDebugButton$2
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
                    AirTrafficControlDebugModeKt.c(activity, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final jk jkVar, final ic3 ic3Var, Composer composer, final int i) {
        Composer h = composer.h(609598686);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(609598686, i, -1, "com.nytimes.android.PodcastDebugButton (AirTrafficControlDebugMode.kt:79)");
        }
        h.z(773894976);
        h.z(-492369756);
        Object A = h.A();
        if (A == Composer.a.a()) {
            androidx.compose.runtime.e eVar = new androidx.compose.runtime.e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A = eVar;
        }
        h.R();
        final CoroutineScope a = ((androidx.compose.runtime.e) A).a();
        h.R();
        b("Podcast", new qs2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$PodcastDebugButton$1

            @fc1(c = "com.nytimes.android.AirTrafficControlDebugModeKt$PodcastDebugButton$1$1", f = "AirTrafficControlDebugMode.kt", l = {86}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.AirTrafficControlDebugModeKt$PodcastDebugButton$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ jk $activity;
                final /* synthetic */ ic3 $hybridLinkHandler;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ic3 ic3Var, jk jkVar, by0 by0Var) {
                    super(2, by0Var);
                    this.$hybridLinkHandler = ic3Var;
                    this.$activity = jkVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$hybridLinkHandler, this.$activity, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.f.b(obj);
                        ic3 ic3Var = this.$hybridLinkHandler;
                        jk jkVar = this.$activity;
                        this.label = 1;
                        if (ic3Var.a(jkVar, "nyt://audio/9ca0404c-fa62-5899-b4de-ee9bac66e3d6", "debug", this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.f.b(obj);
                    }
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
                m165invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m165invoke() {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(ic3Var, jkVar, null), 3, null);
            }
        }, h, 6);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$PodcastDebugButton$2
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
                    AirTrafficControlDebugModeKt.d(jk.this, ic3Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final Activity activity, Composer composer, final int i) {
        Composer h = composer.h(-2072627456);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-2072627456, i, -1, "com.nytimes.android.PodcastOnboardingDebugButton (AirTrafficControlDebugMode.kt:64)");
        }
        b("Podcast Onboarding", new qs2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$PodcastOnboardingDebugButton$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m166invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m166invoke() {
                AudioOnboardingBar audioOnboardingBar = (AudioOnboardingBar) activity.findViewById(fg6.audio_onboarding_bar);
                if (audioOnboardingBar != null) {
                    audioOnboardingBar.a();
                }
            }
        }, h, 6);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$PodcastOnboardingDebugButton$2
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
                    AirTrafficControlDebugModeKt.e(activity, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final vn8 vn8Var, Composer composer, final int i) {
        Composer h = composer.h(1086366188);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1086366188, i, -1, "com.nytimes.android.ResetTooltipDebugButton (AirTrafficControlDebugMode.kt:96)");
        }
        b("Reset Tooltip", new qs2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$ResetTooltipDebugButton$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m167invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m167invoke() {
                vn8.this.i();
            }
        }, h, 6);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$ResetTooltipDebugButton$2
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
                    AirTrafficControlDebugModeKt.f(vn8.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Composer composer, final int i) {
        Composer h = composer.h(491155251);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(491155251, i, -1, "com.nytimes.android.SnackbarDebugButton (AirTrafficControlDebugMode.kt:127)");
            }
            final SnackbarUtil snackbarUtil = (SnackbarUtil) h.m(LocalSnackbarKt.a());
            b("Snackbar", new qs2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$SnackbarDebugButton$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m168invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m168invoke() {
                    SnackbarUtil.z(SnackbarUtil.this, "Snackbar message", 0, false, 6, null);
                }
            }, h, 6);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$SnackbarDebugButton$2
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
                    AirTrafficControlDebugModeKt.g(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final vn8 vn8Var, Composer composer, final int i) {
        Composer h = composer.h(-647809953);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-647809953, i, -1, "com.nytimes.android.TooltipDebugButton (AirTrafficControlDebugMode.kt:106)");
        }
        b("Tooltip", new qs2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$TooltipDebugButton$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m169invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m169invoke() {
                vn8.this.k();
            }
        }, h, 6);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.AirTrafficControlDebugModeKt$TooltipDebugButton$2
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
                    AirTrafficControlDebugModeKt.h(vn8.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
