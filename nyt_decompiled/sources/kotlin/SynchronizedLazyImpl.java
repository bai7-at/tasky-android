package kotlin;

import defpackage.c04;
import defpackage.qs2;
import defpackage.tv8;
import defpackage.zq3;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
final class SynchronizedLazyImpl<T> implements c04, Serializable {
    private volatile Object _value;
    private qs2 initializer;
    private final Object lock;

    public SynchronizedLazyImpl(qs2 qs2Var, Object obj) {
        zq3.h(qs2Var, "initializer");
        this.initializer = qs2Var;
        this._value = tv8.a;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // defpackage.c04
    public boolean a() {
        return this._value != tv8.a;
    }

    @Override // defpackage.c04
    public Object getValue() {
        Object obj;
        Object obj2 = this._value;
        tv8 tv8Var = tv8.a;
        if (obj2 != tv8Var) {
            return obj2;
        }
        synchronized (this.lock) {
            obj = this._value;
            if (obj == tv8Var) {
                qs2 qs2Var = this.initializer;
                zq3.e(qs2Var);
                obj = qs2Var.mo865invoke();
                this._value = obj;
                this.initializer = null;
            }
        }
        return obj;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(qs2 qs2Var, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qs2Var, (i & 2) != 0 ? null : obj);
    }
}
