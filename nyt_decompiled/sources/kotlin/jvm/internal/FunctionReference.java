package kotlin.jvm.internal;

import defpackage.tt2;
import defpackage.uu3;
import defpackage.xu3;
import defpackage.zq3;
import defpackage.zt6;

/* loaded from: classes5.dex */
public abstract class FunctionReference extends CallableReference implements tt2, xu3 {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected uu3 computeReflected() {
        return zt6.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && zq3.c(getBoundReceiver(), functionReference.getBoundReceiver()) && zq3.c(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof xu3) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.tt2
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.xu3
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.xu3
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.xu3
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.xu3
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, defpackage.uu3
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        uu3 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public xu3 getReflected() {
        return (xu3) super.getReflected();
    }
}
