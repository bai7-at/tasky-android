package defpackage;

import androidx.compose.animation.core.VectorConvertersKt;

/* loaded from: classes.dex */
public abstract class gi {
    public static final fi a(float f, float f2, long j, long j2, boolean z) {
        return new fi(VectorConvertersKt.d(wk2.a), Float.valueOf(f), ni.a(f2), j, j2, z);
    }

    public static final fi b(hu8 hu8Var, Object obj, Object obj2, long j, long j2, boolean z) {
        return new fi(hu8Var, obj, (mi) hu8Var.a().invoke(obj2), j, j2, z);
    }

    public static /* synthetic */ fi c(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        long j3 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        long j4 = (i & 8) == 0 ? j2 : Long.MIN_VALUE;
        if ((i & 16) != 0) {
            z = false;
        }
        return a(f, f2, j3, j4, z);
    }

    public static final fi e(fi fiVar, float f, float f2, long j, long j2, boolean z) {
        return new fi(fiVar.o(), Float.valueOf(f), ni.a(f2), j, j2, z);
    }

    public static final fi f(fi fiVar, Object obj, mi miVar, long j, long j2, boolean z) {
        return new fi(fiVar.o(), obj, miVar, j, j2, z);
    }

    public static /* synthetic */ fi g(fi fiVar, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ((Number) fiVar.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((ii) fiVar.A()).f();
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            j = fiVar.n();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = fiVar.j();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = fiVar.B();
        }
        return e(fiVar, f, f3, j3, j4, z);
    }

    public static /* synthetic */ fi h(fi fiVar, Object obj, mi miVar, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = fiVar.getValue();
        }
        if ((i & 2) != 0) {
            miVar = ni.e(fiVar.A());
        }
        mi miVar2 = miVar;
        if ((i & 4) != 0) {
            j = fiVar.n();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = fiVar.j();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = fiVar.B();
        }
        return f(fiVar, obj, miVar2, j3, j4, z);
    }

    public static final mi i(hu8 hu8Var, Object obj) {
        mi miVar = (mi) hu8Var.a().invoke(obj);
        miVar.d();
        return miVar;
    }
}
