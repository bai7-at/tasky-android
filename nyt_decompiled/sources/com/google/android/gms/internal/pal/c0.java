package com.google.android.gms.internal.pal;

import defpackage.ev9;
import defpackage.kw9;
import defpackage.mw9;
import defpackage.xx9;
import defpackage.zx9;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class c0 extends d {
    private static final Map zzb = new ConcurrentHashMap();
    protected j1 zzc = j1.c();
    protected int zzd = -1;

    private static c0 d(c0 c0Var) {
        if (c0Var == null || c0Var.i()) {
            return c0Var;
        }
        zzadi a = new zzafh(c0Var).a();
        a.h(c0Var);
        throw a;
    }

    protected static mw9 e(mw9 mw9Var) {
        int size = mw9Var.size();
        return mw9Var.zzd(size == 0 ? 10 : size + size);
    }

    static Object f(Method method, Object obj, Object... objArr) {
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

    protected static Object g(zx9 zx9Var, String str, Object[] objArr) {
        return new b1(zx9Var, str, objArr);
    }

    protected static void h(Class cls, c0 c0Var) {
        zzb.put(cls, c0Var);
    }

    static c0 k(Class cls) {
        Map map = zzb;
        c0 c0Var = (c0) map.get(cls);
        if (c0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c0Var = (c0) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (c0Var == null) {
            c0Var = (c0) ((c0) p1.j(cls)).q(6, null, null);
            if (c0Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, c0Var);
        }
        return c0Var;
    }

    protected static c0 l(c0 c0Var, zzaby zzabyVar, ev9 ev9Var) {
        p k = zzabyVar.k();
        c0 c0Var2 = (c0) c0Var.q(4, null, null);
        try {
            d1 b = z0.a().b(c0Var2.getClass());
            b.b(c0Var2, q.n(k), ev9Var);
            b.zzf(c0Var2);
            try {
                k.g(0);
                d(c0Var2);
                return c0Var2;
            } catch (zzadi e) {
                e.h(c0Var2);
                throw e;
            }
        } catch (zzadi e2) {
            e2.h(c0Var2);
            throw e2;
        } catch (zzafh e3) {
            zzadi a = e3.a();
            a.h(c0Var2);
            throw a;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzadi) {
                throw ((zzadi) e4.getCause());
            }
            zzadi zzadiVar = new zzadi(e4);
            zzadiVar.h(c0Var2);
            throw zzadiVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzadi) {
                throw ((zzadi) e5.getCause());
            }
            throw e5;
        }
    }

    protected static c0 m(c0 c0Var, byte[] bArr, ev9 ev9Var) {
        c0 r = r(c0Var, bArr, 0, bArr.length, ev9Var);
        d(r);
        return r;
    }

    protected static kw9 n() {
        return e0.e();
    }

    protected static mw9 o() {
        return a1.c();
    }

    private static c0 r(c0 c0Var, byte[] bArr, int i, int i2, ev9 ev9Var) {
        c0 c0Var2 = (c0) c0Var.q(4, null, null);
        try {
            d1 b = z0.a().b(c0Var2.getClass());
            b.a(c0Var2, bArr, 0, i2, new g(ev9Var));
            b.zzf(c0Var2);
            if (c0Var2.zza == 0) {
                return c0Var2;
            }
            throw new RuntimeException();
        } catch (zzadi e) {
            e.h(c0Var2);
            throw e;
        } catch (zzafh e2) {
            zzadi a = e2.a();
            a.h(c0Var2);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzadi) {
                throw ((zzadi) e3.getCause());
            }
            zzadi zzadiVar = new zzadi(e3);
            zzadiVar.h(c0Var2);
            throw zzadiVar;
        } catch (IndexOutOfBoundsException unused) {
            zzadi i3 = zzadi.i();
            i3.h(c0Var2);
            throw i3;
        }
    }

    @Override // defpackage.zx9
    public final void A(s sVar) {
        z0.a().b(getClass()).c(this, t.d(sVar));
    }

    @Override // defpackage.zx9
    public final int B() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza = z0.a().b(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    @Override // defpackage.by9
    public final /* synthetic */ zx9 a() {
        return (c0) q(6, null, null);
    }

    @Override // com.google.android.gms.internal.pal.d
    final int b() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.pal.d
    final void c(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return z0.a().b(getClass()).zzk(this, (c0) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = z0.a().b(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final boolean i() {
        byte byteValue = ((Byte) q(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = z0.a().b(getClass()).zzl(this);
        q(2, true != zzl ? null : this, null);
        return zzl;
    }

    protected final b0 j() {
        return (b0) q(5, null, null);
    }

    @Override // defpackage.zx9
    public final /* synthetic */ xx9 p() {
        b0 b0Var = (b0) q(5, null, null);
        b0Var.e(this);
        return b0Var;
    }

    protected abstract Object q(int i, Object obj, Object obj2);

    public final String toString() {
        return t0.a(this, super.toString());
    }

    @Override // defpackage.zx9
    public final /* synthetic */ xx9 y() {
        return (b0) q(5, null, null);
    }
}
