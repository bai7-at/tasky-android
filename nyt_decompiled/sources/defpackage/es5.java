package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class es5 extends y1 implements gs5 {
    public static final a e = new a(null);
    public static final int f = 8;
    private static final es5 g;
    private final Object b;
    private final Object c;
    private final mr5 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gs5 a() {
            return es5.g;
        }

        private a() {
        }
    }

    static {
        l12 l12Var = l12.a;
        g = new es5(l12Var, l12Var, mr5.d.a());
    }

    public es5(Object obj, Object obj2, mr5 mr5Var) {
        this.b = obj;
        this.c = obj2;
        this.d = mr5Var;
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.d.size();
    }

    @Override // java.util.Collection, java.util.Set, defpackage.gs5
    public gs5 add(Object obj) {
        if (this.d.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new es5(obj, obj, this.d.u(obj, new o54()));
        }
        Object obj2 = this.c;
        Object obj3 = this.d.get(obj2);
        zq3.e(obj3);
        return new es5(this.b, obj, this.d.u(obj2, ((o54) obj3).e(obj)).u(obj, new o54(obj2)));
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new fs5(this.b, this.d);
    }

    @Override // java.util.Collection, java.util.Set, defpackage.gs5
    public gs5 remove(Object obj) {
        o54 o54Var = (o54) this.d.get(obj);
        if (o54Var == null) {
            return this;
        }
        mr5 v = this.d.v(obj);
        if (o54Var.b()) {
            Object obj2 = v.get(o54Var.d());
            zq3.e(obj2);
            v = v.u(o54Var.d(), ((o54) obj2).e(o54Var.c()));
        }
        if (o54Var.a()) {
            Object obj3 = v.get(o54Var.c());
            zq3.e(obj3);
            v = v.u(o54Var.c(), ((o54) obj3).f(o54Var.d()));
        }
        return new es5(!o54Var.b() ? o54Var.c() : this.b, !o54Var.a() ? o54Var.d() : this.c, v);
    }
}
