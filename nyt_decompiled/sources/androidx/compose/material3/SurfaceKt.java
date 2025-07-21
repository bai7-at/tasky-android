package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentMediaFormat;
import defpackage.bd8;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cs0;
import defpackage.dj7;
import defpackage.dy4;
import defpackage.eb0;
import defpackage.et0;
import defpackage.fc1;
import defpackage.fm1;
import defpackage.fo3;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.it2;
import defpackage.jj7;
import defpackage.ju7;
import defpackage.l27;
import defpackage.lj7;
import defpackage.m76;
import defpackage.nn0;
import defpackage.no7;
import defpackage.o76;
import defpackage.pl0;
import defpackage.qs2;
import defpackage.qt6;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zf4;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public abstract class SurfaceKt {
    private static final m76 a = CompositionLocalKt.d(null, new qs2() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        public final float b() {
            return bu1.g(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            return bu1.d(b());
        }
    }, 1, null);

    public static final void a(Modifier modifier, no7 no7Var, long j, long j2, float f, float f2, eb0 eb0Var, final gt2 gt2Var, Composer composer, int i, int i2) {
        composer.z(-513881741);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.a : modifier;
        no7 a2 = (i2 & 2) != 0 ? qt6.a() : no7Var;
        long C = (i2 & 4) != 0 ? zf4.a.a(composer, 6).C() : j;
        long c = (i2 & 8) != 0 ? ColorSchemeKt.c(C, composer, (i >> 6) & 14) : j2;
        float g = (i2 & 16) != 0 ? bu1.g(0) : f;
        float g2 = (i2 & 32) != 0 ? bu1.g(0) : f2;
        eb0 eb0Var2 = (i2 & 64) != 0 ? null : eb0Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-513881741, i, -1, "androidx.compose.material3.Surface (Surface.kt:109)");
        }
        m76 m76Var = a;
        final float g3 = bu1.g(((bu1) composer.m(m76Var)).n() + g);
        final Modifier modifier3 = modifier2;
        final no7 no7Var2 = a2;
        final long j3 = C;
        final eb0 eb0Var3 = eb0Var2;
        final float f3 = g2;
        CompositionLocalKt.b(new o76[]{ContentColorKt.a().c(nn0.j(c)), m76Var.c(bu1.d(g3))}, zr0.b(composer, -70914509, true, new gt2() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            @fc1(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", l = {}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements gt2 {
                int label;

                AnonymousClass3(by0 by0Var) {
                    super(2, by0Var);
                }

                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(fy5 fy5Var, by0 by0Var) {
                    return ((AnonymousClass3) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass3(by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.a.h();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    return ww8.a;
                }
            }

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
                long f4;
                Modifier e;
                if ((i3 & 3) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-70914509, i3, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:115)");
                }
                Modifier modifier4 = Modifier.this;
                no7 no7Var3 = no7Var2;
                f4 = SurfaceKt.f(j3, g3, composer2, 0);
                e = SurfaceKt.e(modifier4, no7Var3, f4, eb0Var3, ((fm1) composer2.m(CompositionLocalsKt.e())).f1(f3));
                Modifier c2 = bd8.c(dj7.c(e, false, new ss2() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                    public final void b(lj7 lj7Var) {
                        jj7.N(lj7Var, true);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((lj7) obj);
                        return ww8.a;
                    }
                }), ww8.a, new AnonymousClass3(null));
                gt2 gt2Var2 = gt2Var;
                composer2.z(733328855);
                rg4 g4 = BoxKt.g(Alignment.a.o(), true, composer2, 48);
                composer2.z(-1323940314);
                int a3 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a4 = companion.a();
                it2 c3 = LayoutKt.c(c2);
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
                Updater.c(a5, g4, companion.e());
                Updater.c(a5, o, companion.g());
                gt2 b = companion.b();
                if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                    a5.q(Integer.valueOf(a3));
                    a5.v(Integer.valueOf(a3), b);
                }
                c3.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                gt2Var2.invoke(composer2, 0);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), composer, 48);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
    }

    public static final void b(final qs2 qs2Var, Modifier modifier, boolean z, no7 no7Var, long j, long j2, float f, float f2, eb0 eb0Var, dy4 dy4Var, final gt2 gt2Var, Composer composer, int i, int i2, int i3) {
        final dy4 dy4Var2;
        composer.z(-789752804);
        final Modifier modifier2 = (i3 & 2) != 0 ? Modifier.a : modifier;
        final boolean z2 = (i3 & 4) != 0 ? true : z;
        final no7 a2 = (i3 & 8) != 0 ? qt6.a() : no7Var;
        final long C = (i3 & 16) != 0 ? zf4.a.a(composer, 6).C() : j;
        long c = (i3 & 32) != 0 ? ColorSchemeKt.c(C, composer, (i >> 12) & 14) : j2;
        float g = (i3 & 64) != 0 ? bu1.g(0) : f;
        float g2 = (i3 & 128) != 0 ? bu1.g(0) : f2;
        final eb0 eb0Var2 = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : eb0Var;
        if ((i3 & 512) != 0) {
            composer.z(-746940902);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                A = fo3.a();
                composer.q(A);
            }
            composer.R();
            dy4Var2 = (dy4) A;
        } else {
            dy4Var2 = dy4Var;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-789752804, i, i2, "androidx.compose.material3.Surface (Surface.kt:215)");
        }
        m76 m76Var = a;
        final float g3 = bu1.g(((bu1) composer.m(m76Var)).n() + g);
        final float f3 = g2;
        CompositionLocalKt.b(new o76[]{ContentColorKt.a().c(nn0.j(c)), m76Var.c(bu1.d(g3))}, zr0.b(composer, 1279702876, true, new gt2() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
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
                long f4;
                Modifier e;
                if ((i4 & 3) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1279702876, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:221)");
                }
                Modifier c2 = InteractiveComponentSizeKt.c(Modifier.this);
                no7 no7Var2 = a2;
                f4 = SurfaceKt.f(C, g3, composer2, 0);
                e = SurfaceKt.e(c2, no7Var2, f4, eb0Var2, ((fm1) composer2.m(CompositionLocalsKt.e())).f1(f3));
                Modifier c3 = ClickableKt.c(e, dy4Var2, l27.e(false, 0.0f, 0L, composer2, 0, 7), z2, null, null, qs2Var, 24, null);
                gt2 gt2Var2 = gt2Var;
                composer2.z(733328855);
                rg4 g4 = BoxKt.g(Alignment.a.o(), true, composer2, 48);
                composer2.z(-1323940314);
                int a3 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a4 = companion.a();
                it2 c4 = LayoutKt.c(c3);
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
                Updater.c(a5, g4, companion.e());
                Updater.c(a5, o, companion.g());
                gt2 b = companion.b();
                if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                    a5.q(Integer.valueOf(a3));
                    a5.v(Integer.valueOf(a3), b);
                }
                c4.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                gt2Var2.invoke(composer2, 0);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), composer, 48);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier e(Modifier modifier, no7 no7Var, long j, eb0 eb0Var, float f) {
        no7 no7Var2;
        Modifier modifier2;
        Modifier c = androidx.compose.ui.graphics.b.c(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, no7Var, false, null, 0L, 0L, 0, 124895, null);
        if (eb0Var != null) {
            no7Var2 = no7Var;
            modifier2 = BorderKt.e(Modifier.a, eb0Var, no7Var2);
        } else {
            no7Var2 = no7Var;
            modifier2 = Modifier.a;
        }
        return pl0.a(BackgroundKt.c(c.h(modifier2), j, no7Var2), no7Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j, float f, Composer composer, int i) {
        composer.z(-2079918090);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:483)");
        }
        long a2 = ColorSchemeKt.a(zf4.a.a(composer, 6), j, f, composer, (i << 3) & ContentMediaFormat.PREVIEW_EPISODE);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return a2;
    }
}
