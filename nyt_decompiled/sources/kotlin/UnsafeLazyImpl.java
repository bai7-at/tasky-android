package kotlin;

import defpackage.c04;
import defpackage.qs2;
import defpackage.tv8;
import defpackage.zq3;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class UnsafeLazyImpl<T> implements c04, Serializable {
    private Object _value;
    private qs2 initializer;

    public UnsafeLazyImpl(qs2 qs2Var) {
        zq3.h(qs2Var, "initializer");
        this.initializer = qs2Var;
        this._value = tv8.a;
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
        if (this._value == tv8.a) {
            qs2 qs2Var = this.initializer;
            zq3.e(qs2Var);
            this._value = qs2Var.mo865invoke();
            this.initializer = null;
        }
        return this._value;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
