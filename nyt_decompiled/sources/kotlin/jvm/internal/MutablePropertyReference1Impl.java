package kotlin.jvm.internal;

import defpackage.al0;
import defpackage.vu3;
import defpackage.wu3;

/* loaded from: classes5.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(wu3 wu3Var, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((al0) wu3Var).a(), str, str2, !(wu3Var instanceof vu3) ? 1 : 0);
    }

    @Override // defpackage.kv3
    public Object get(Object obj) {
        mo869getGetter();
        throw null;
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }
}
