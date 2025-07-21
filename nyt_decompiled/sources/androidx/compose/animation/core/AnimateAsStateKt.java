package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import defpackage.bu1;
import defpackage.ci;
import defpackage.di;
import defpackage.fd5;
import defpackage.hn3;
import defpackage.hu8;
import defpackage.ic9;
import defpackage.kt6;
import defpackage.om3;
import defpackage.py1;
import defpackage.qs2;
import defpackage.qz7;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.vm3;
import defpackage.wk2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zt7;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* loaded from: classes.dex */
public abstract class AnimateAsStateKt {
    private static final qz7 a = di.i(0.0f, 0.0f, null, 7, null);
    private static final qz7 b = di.i(0.0f, 0.0f, bu1.d(ic9.a(bu1.b)), 3, null);
    private static final qz7 c = di.i(0.0f, 0.0f, zt7.c(ic9.f(zt7.b)), 3, null);
    private static final qz7 d = di.i(0.0f, 0.0f, fd5.d(ic9.e(fd5.b)), 3, null);
    private static final qz7 e = di.i(0.0f, 0.0f, ic9.g(kt6.e), 3, null);
    private static final qz7 f = di.i(0.0f, 0.0f, Integer.valueOf(ic9.b(om3.a)), 3, null);
    private static final qz7 g = di.i(0.0f, 0.0f, vm3.b(ic9.c(vm3.b)), 3, null);
    private static final qz7 h = di.i(0.0f, 0.0f, hn3.b(ic9.d(hn3.b)), 3, null);

    public static final x08 c(float f2, ci ciVar, String str, ss2 ss2Var, Composer composer, int i, int i2) {
        composer.z(-1407150062);
        ci ciVar2 = (i2 & 2) != 0 ? b : ciVar;
        String str2 = (i2 & 4) != 0 ? "DpAnimation" : str;
        ss2 ss2Var2 = (i2 & 8) != 0 ? null : ss2Var;
        if (b.G()) {
            b.S(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i3 = i << 6;
        x08 e2 = e(bu1.d(f2), VectorConvertersKt.b(bu1.b), ciVar2, null, str2, ss2Var2, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return e2;
    }

    public static final x08 d(float f2, ci ciVar, float f3, String str, ss2 ss2Var, Composer composer, int i, int i2) {
        composer.z(668842840);
        ci ciVar2 = (i2 & 2) != 0 ? a : ciVar;
        float f4 = (i2 & 4) != 0 ? 0.01f : f3;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        ss2 ss2Var2 = (i2 & 16) != 0 ? null : ss2Var;
        if (b.G()) {
            b.S(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        composer.z(841393662);
        if (ciVar2 == a) {
            Float valueOf = Float.valueOf(f4);
            composer.z(1157296644);
            boolean S = composer.S(valueOf);
            Object A = composer.A();
            if (S || A == Composer.a.a()) {
                A = di.i(0.0f, 0.0f, Float.valueOf(f4), 3, null);
                composer.q(A);
            }
            composer.R();
            ciVar2 = (ci) A;
        }
        composer.R();
        int i3 = i << 3;
        x08 e2 = e(Float.valueOf(f2), VectorConvertersKt.d(wk2.a), ciVar2, Float.valueOf(f4), str2, ss2Var2, composer, (i3 & 7168) | (i & 14) | (57344 & i3) | (i3 & 458752), 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return e2;
    }

    public static final x08 e(final Object obj, hu8 hu8Var, ci ciVar, Object obj2, String str, ss2 ss2Var, Composer composer, int i, int i2) {
        ci ciVar2;
        composer.z(-1994373980);
        if ((i2 & 4) != 0) {
            composer.z(-492369756);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                A = di.i(0.0f, 0.0f, null, 7, null);
                composer.q(A);
            }
            composer.R();
            ciVar2 = (ci) A;
        } else {
            ciVar2 = ciVar;
        }
        Object obj3 = (i2 & 8) != 0 ? null : obj2;
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        ss2 ss2Var2 = (i2 & 32) != 0 ? null : ss2Var;
        if (b.G()) {
            b.S(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        composer.z(-492369756);
        Object A2 = composer.A();
        Composer.a aVar = Composer.a;
        if (A2 == aVar.a()) {
            A2 = b0.e(null, null, 2, null);
            composer.q(A2);
        }
        composer.R();
        sy4 sy4Var = (sy4) A2;
        composer.z(-492369756);
        Object A3 = composer.A();
        if (A3 == aVar.a()) {
            A3 = new Animatable(obj, hu8Var, obj3, str2);
            composer.q(A3);
        }
        composer.R();
        Animatable animatable = (Animatable) A3;
        x08 o = y.o(ss2Var2, composer, (i >> 15) & 14);
        if (obj3 != null && (ciVar2 instanceof qz7)) {
            qz7 qz7Var = (qz7) ciVar2;
            if (!zq3.c(qz7Var.h(), obj3)) {
                ciVar2 = di.h(qz7Var.f(), qz7Var.g(), obj3);
            }
        }
        x08 o2 = y.o(ciVar2, composer, 0);
        composer.z(-492369756);
        Object A4 = composer.A();
        if (A4 == aVar.a()) {
            A4 = ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.q(A4);
        }
        composer.R();
        final Channel channel = (Channel) A4;
        py1.h(new qs2() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m15invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15invoke() {
                Channel.this.mo129trySendJP2dKIU(obj);
            }
        }, composer, 0);
        py1.d(channel, new AnimateAsStateKt$animateValueAsState$3(channel, animatable, o2, o, null), composer, 72);
        x08 x08Var = (x08) sy4Var.getValue();
        if (x08Var == null) {
            x08Var = animatable.g();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return x08Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ss2 f(x08 x08Var) {
        return (ss2) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ci g(x08 x08Var) {
        return (ci) x08Var.getValue();
    }
}
