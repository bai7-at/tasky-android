package com.google.android.gms.internal.measurement;

import defpackage.cef;
import defpackage.nbf;
import defpackage.qbf;
import defpackage.tbf;
import defpackage.zdf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class j2 extends p1 {
    private static final Map zza = new ConcurrentHashMap();
    protected m3 zzc = m3.c();
    protected int zzd = -1;

    static j2 h(Class cls) {
        Map map = zza;
        j2 j2Var = (j2) map.get(cls);
        if (j2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                j2Var = (j2) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (j2Var == null) {
            j2Var = (j2) ((j2) s3.j(cls)).q(6, null, null);
            if (j2Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, j2Var);
        }
        return j2Var;
    }

    protected static nbf i() {
        return k2.e();
    }

    protected static qbf j() {
        return q2.c();
    }

    protected static qbf k(qbf qbfVar) {
        int size = qbfVar.size();
        return qbfVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static tbf l() {
        return f3.c();
    }

    protected static tbf m(tbf tbfVar) {
        int size = tbfVar.size();
        return tbfVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object n(Method method, Object obj, Object... objArr) {
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

    protected static Object o(cef cefVar, String str, Object[] objArr) {
        return new g3(cefVar, str, objArr);
    }

    protected static void p(Class cls, j2 j2Var) {
        zza.put(cls, j2Var);
    }

    @Override // defpackage.cef
    public final int O() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza2 = e3.a().b(getClass()).zza(this);
        this.zzd = zza2;
        return zza2;
    }

    @Override // defpackage.cef
    public final /* synthetic */ zdf P() {
        return (i2) q(5, null, null);
    }

    @Override // defpackage.cef
    public final void Q(b2 b2Var) {
        e3.a().b(getClass()).c(this, c2.d(b2Var));
    }

    @Override // defpackage.cef
    public final /* synthetic */ zdf R() {
        i2 i2Var = (i2) q(5, null, null);
        i2Var.g(this);
        return i2Var;
    }

    @Override // defpackage.eef
    public final /* synthetic */ cef a() {
        return (j2) q(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.p1
    final int b() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.p1
    final void d(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return e3.a().b(getClass()).a(this, (j2) obj);
        }
        return false;
    }

    protected final i2 f() {
        return (i2) q(5, null, null);
    }

    public final i2 g() {
        i2 i2Var = (i2) q(5, null, null);
        i2Var.g(this);
        return i2Var;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int zzb = e3.a().b(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    protected abstract Object q(int i, Object obj, Object obj2);

    public final String toString() {
        return y2.a(this, super.toString());
    }
}
