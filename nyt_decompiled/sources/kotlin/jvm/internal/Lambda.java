package kotlin.jvm.internal;

import defpackage.tt2;
import defpackage.zq3;
import defpackage.zt6;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class Lambda<R> implements tt2, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // defpackage.tt2
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String k = zt6.k(this);
        zq3.g(k, "renderLambdaToString(...)");
        return k;
    }
}
