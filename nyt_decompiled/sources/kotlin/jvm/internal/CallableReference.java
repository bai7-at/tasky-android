package kotlin.jvm.internal;

import defpackage.mv3;
import defpackage.uu3;
import defpackage.wu3;
import defpackage.zt6;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;

/* loaded from: classes5.dex */
public abstract class CallableReference implements uu3, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient uu3 reflected;
    private final String signature;

    private static class NoReceiver implements Serializable {
        private static final NoReceiver a = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return a;
        }
    }

    protected CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.uu3
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.uu3
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public uu3 compute() {
        uu3 uu3Var = this.reflected;
        if (uu3Var != null) {
            return uu3Var;
        }
        uu3 computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract uu3 computeReflected();

    @Override // defpackage.tu3
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.uu3
    public String getName() {
        return this.name;
    }

    public wu3 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? zt6.c(cls) : zt6.b(cls);
    }

    @Override // defpackage.uu3
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected uu3 getReflected() {
        uu3 compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // defpackage.uu3
    public mv3 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.uu3
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.uu3
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.uu3
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.uu3
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.uu3
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.uu3
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
