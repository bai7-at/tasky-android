package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b;
import defpackage.d44;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements g {
    private final Object a;
    private final b.a b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = b.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        this.b.a(d44Var, event, this.a);
    }
}
