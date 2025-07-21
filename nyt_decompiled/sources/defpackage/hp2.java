package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public abstract class hp2 extends lp2 implements dg0 {
    protected hp2() {
    }

    @Override // defpackage.dg0
    public Object b(Object obj, Callable callable) {
        return g().b(obj, callable);
    }

    @Override // defpackage.dg0
    public ConcurrentMap c() {
        return g().c();
    }

    @Override // defpackage.dg0
    public void d(Object obj) {
        g().d(obj);
    }

    @Override // defpackage.dg0
    public Object e(Object obj) {
        return g().e(obj);
    }

    protected abstract dg0 g();

    @Override // defpackage.dg0
    public void put(Object obj, Object obj2) {
        g().put(obj, obj2);
    }
}
