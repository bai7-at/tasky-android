package defpackage;

/* loaded from: classes.dex */
public abstract class ni {
    public static final ii a(float f) {
        return new ii(f);
    }

    public static final ji b(float f, float f2) {
        return new ji(f, f2);
    }

    public static final ki c(float f, float f2, float f3) {
        return new ki(f, f2, f3);
    }

    public static final li d(float f, float f2, float f3, float f4) {
        return new li(f, f2, f3, f4);
    }

    public static final mi e(mi miVar) {
        mi g = g(miVar);
        int b = g.b();
        for (int i = 0; i < b; i++) {
            g.e(i, miVar.a(i));
        }
        return g;
    }

    public static final void f(mi miVar, mi miVar2) {
        int b = miVar.b();
        for (int i = 0; i < b; i++) {
            miVar.e(i, miVar2.a(i));
        }
    }

    public static final mi g(mi miVar) {
        mi c = miVar.c();
        zq3.f(c, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c;
    }
}
