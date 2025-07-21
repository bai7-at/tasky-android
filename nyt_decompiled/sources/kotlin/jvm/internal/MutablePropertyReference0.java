package kotlin.jvm.internal;

import defpackage.dv3;
import defpackage.ev3;
import defpackage.iv3;
import defpackage.jv3;
import defpackage.uu3;
import defpackage.zt6;

/* loaded from: classes5.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements ev3 {
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected uu3 computeReflected() {
        return zt6.e(this);
    }

    @Override // defpackage.jv3
    public Object getDelegate() {
        return ((ev3) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ iv3.a getGetter() {
        mo867getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ dv3 getSetter() {
        mo868getSetter();
        return null;
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public Object mo865invoke() {
        return get();
    }

    @Override // defpackage.jv3
    /* renamed from: getGetter, reason: collision with other method in class */
    public jv3.a mo867getGetter() {
        ((ev3) getReflected()).mo867getGetter();
        return null;
    }

    @Override // defpackage.ev3
    /* renamed from: getSetter, reason: collision with other method in class */
    public ev3.a mo868getSetter() {
        ((ev3) getReflected()).mo868getSetter();
        return null;
    }
}
