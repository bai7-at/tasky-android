package kotlin.jvm.internal;

import defpackage.gv3;
import defpackage.lv3;
import defpackage.uu3;
import defpackage.zt6;

/* loaded from: classes5.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements gv3 {
    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected uu3 computeReflected() {
        return zt6.g(this);
    }

    @Override // defpackage.lv3
    public lv3.a getGetter() {
        ((gv3) getReflected()).getGetter();
        return null;
    }

    @Override // defpackage.gt2
    public Object invoke(Object obj, Object obj2) {
        return f(obj, obj2);
    }
}
