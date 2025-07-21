package com.google.android.gms.internal.icing;

import defpackage.e3d;
import defpackage.i4d;
import defpackage.vcc;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class z extends f {
    private static final Map<Object, z> zzb = new ConcurrentHashMap();
    protected e1 zzc = e1.a();
    protected int zzd = -1;

    static z h(Class cls) {
        Map<Object, z> map = zzb;
        z zVar = map.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zVar == null) {
            zVar = (z) ((z) k1.h(cls)).f(6, null, null);
            if (zVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zVar);
        }
        return zVar;
    }

    protected static void i(Class cls, z zVar) {
        zzb.put(cls, zVar);
    }

    protected static Object j(i4d i4dVar, String str, Object[] objArr) {
        return new x0(i4dVar, str, objArr);
    }

    static Object l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static vcc m() {
        return w0.c();
    }

    protected static vcc n(vcc vccVar) {
        int size = vccVar.size();
        return vccVar.i(size == 0 ? 10 : size + size);
    }

    @Override // defpackage.i4d
    public final void a(r rVar) {
        v0.a().b(getClass()).c(this, s.j(rVar));
    }

    @Override // com.google.android.gms.internal.icing.f
    final int c() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.icing.f
    final void d(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return v0.a().b(getClass()).e(this, (z) obj);
        }
        return false;
    }

    protected abstract Object f(int i, Object obj, Object obj2);

    protected final y g() {
        return (y) f(5, null, null);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = v0.a().b(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    @Override // defpackage.i4d
    public final /* bridge */ /* synthetic */ e3d k() {
        y yVar = (y) f(5, null, null);
        yVar.h(this);
        return yVar;
    }

    public final String toString() {
        return p0.a(this, super.toString());
    }

    @Override // defpackage.m5d
    public final /* bridge */ /* synthetic */ i4d zzm() {
        return (z) f(6, null, null);
    }

    @Override // defpackage.i4d
    public final int zzo() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int b = v0.a().b(getClass()).b(this);
        this.zzd = b;
        return b;
    }
}
