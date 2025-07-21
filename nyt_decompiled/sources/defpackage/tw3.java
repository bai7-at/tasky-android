package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class tw3 {
    private final Object a;
    private vx1 b;

    public /* synthetic */ tw3(Object obj, vx1 vx1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, vx1Var);
    }

    public final vx1 a() {
        return this.b;
    }

    public final Object b() {
        return this.a;
    }

    public final void c(vx1 vx1Var) {
        this.b = vx1Var;
    }

    public final Pair d(ss2 ss2Var) {
        return du8.a(ss2Var.invoke(this.a), this.b);
    }

    private tw3(Object obj, vx1 vx1Var) {
        this.a = obj;
        this.b = vx1Var;
    }
}
