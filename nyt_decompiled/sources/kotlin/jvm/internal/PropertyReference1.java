package kotlin.jvm.internal;

import defpackage.iv3;
import defpackage.kv3;
import defpackage.uu3;
import defpackage.zt6;

/* loaded from: classes5.dex */
public abstract class PropertyReference1 extends PropertyReference implements kv3 {
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected uu3 computeReflected() {
        return zt6.i(this);
    }

    @Override // defpackage.kv3
    public Object getDelegate(Object obj) {
        return ((kv3) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ iv3.a getGetter() {
        mo869getGetter();
        return null;
    }

    @Override // defpackage.ss2
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.kv3
    /* renamed from: getGetter, reason: collision with other method in class */
    public kv3.a mo869getGetter() {
        ((kv3) getReflected()).mo869getGetter();
        return null;
    }
}
