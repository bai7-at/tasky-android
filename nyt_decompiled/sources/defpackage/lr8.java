package defpackage;

import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class lr8 {
    private final fa2 a;
    private final qu7 b;
    private final fj0 c;
    private final la7 d;
    private final boolean e;
    private final Map f;

    public lr8(fa2 fa2Var, qu7 qu7Var, fj0 fj0Var, la7 la7Var, boolean z, Map map) {
        this.a = fa2Var;
        this.b = qu7Var;
        this.c = fj0Var;
        this.d = la7Var;
        this.e = z;
        this.f = map;
    }

    public final fj0 a() {
        return this.c;
    }

    public final Map b() {
        return this.f;
    }

    public final fa2 c() {
        return this.a;
    }

    public final boolean d() {
        return this.e;
    }

    public final la7 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr8)) {
            return false;
        }
        lr8 lr8Var = (lr8) obj;
        return zq3.c(this.a, lr8Var.a) && zq3.c(this.b, lr8Var.b) && zq3.c(this.c, lr8Var.c) && zq3.c(this.d, lr8Var.d) && this.e == lr8Var.e && zq3.c(this.f, lr8Var.f);
    }

    public final qu7 f() {
        return this.b;
    }

    public int hashCode() {
        fa2 fa2Var = this.a;
        int hashCode = (fa2Var == null ? 0 : fa2Var.hashCode()) * 31;
        qu7 qu7Var = this.b;
        int hashCode2 = (hashCode + (qu7Var == null ? 0 : qu7Var.hashCode())) * 31;
        fj0 fj0Var = this.c;
        int hashCode3 = (hashCode2 + (fj0Var == null ? 0 : fj0Var.hashCode())) * 31;
        la7 la7Var = this.d;
        return ((((hashCode3 + (la7Var != null ? la7Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.e)) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public /* synthetic */ lr8(fa2 fa2Var, qu7 qu7Var, fj0 fj0Var, la7 la7Var, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fa2Var, (i & 2) != 0 ? null : qu7Var, (i & 4) != 0 ? null : fj0Var, (i & 8) != 0 ? null : la7Var, (i & 16) != 0 ? false : z, (i & 32) != 0 ? t.i() : map);
    }
}
