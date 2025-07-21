package kotlin.jvm.internal;

import defpackage.iv3;
import defpackage.jv3;
import defpackage.uu3;
import defpackage.zt6;

/* loaded from: classes5.dex */
public abstract class PropertyReference0 extends PropertyReference implements jv3 {
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected uu3 computeReflected() {
        return zt6.h(this);
    }

    @Override // defpackage.jv3
    public Object getDelegate() {
        return ((jv3) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ iv3.a getGetter() {
        mo867getGetter();
        return null;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public Object mo865invoke() {
        return get();
    }

    @Override // defpackage.jv3
    /* renamed from: getGetter */
    public jv3.a mo867getGetter() {
        ((jv3) getReflected()).mo867getGetter();
        return null;
    }
}
