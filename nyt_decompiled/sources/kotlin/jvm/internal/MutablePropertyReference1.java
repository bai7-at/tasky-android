package kotlin.jvm.internal;

import defpackage.fv3;
import defpackage.kv3;
import defpackage.uu3;
import defpackage.zt6;

/* loaded from: classes5.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements fv3 {
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected uu3 computeReflected() {
        return zt6.f(this);
    }

    @Override // defpackage.kv3
    public Object getDelegate(Object obj) {
        return ((fv3) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.kv3
    /* renamed from: getGetter */
    public kv3.a mo869getGetter() {
        ((fv3) getReflected()).mo869getGetter();
        return null;
    }

    @Override // defpackage.ss2
    public Object invoke(Object obj) {
        return get(obj);
    }
}
