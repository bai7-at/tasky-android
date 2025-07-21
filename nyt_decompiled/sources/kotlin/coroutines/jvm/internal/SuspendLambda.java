package kotlin.coroutines.jvm.internal;

import defpackage.by0;
import defpackage.tt2;
import defpackage.zq3;
import defpackage.zt6;

/* loaded from: classes5.dex */
public abstract class SuspendLambda extends ContinuationImpl implements tt2 {
    private final int arity;

    public SuspendLambda(int i, by0 by0Var) {
        super(by0Var);
        this.arity = i;
    }

    @Override // defpackage.tt2
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String j = zt6.j(this);
        zq3.g(j, "renderLambdaToString(...)");
        return j;
    }
}
