package com.google.android.gms.internal.play_billing;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.nac;
import defpackage.sbc;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class z extends b {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected b1 zzc = b1.c();

    static z f(Class cls) {
        Map map = zzb;
        z zVar = (z) map.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = (z) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zVar == null) {
            zVar = (z) ((z) h1.j(cls)).q(6, null, null);
            if (zVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zVar);
        }
        return zVar;
    }

    protected static z h(z zVar, byte[] bArr, r rVar) {
        z s = s(zVar, bArr, 0, bArr.length, rVar);
        if (s == null || s.o()) {
            return s;
        }
        zzci a = new zzef(s).a();
        a.f(s);
        throw a;
    }

    static Object i(Method method, Object obj, Object... objArr) {
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

    protected static Object j(sbc sbcVar, String str, Object[] objArr) {
        return new v0(sbcVar, str, objArr);
    }

    protected static void m(Class cls, z zVar) {
        zVar.l();
        zzb.put(cls, zVar);
    }

    private final int r(w0 w0Var) {
        return u0.a().b(getClass()).zza(this);
    }

    private static z s(z zVar, byte[] bArr, int i, int i2, r rVar) {
        z g = zVar.g();
        try {
            w0 b = u0.a().b(g.getClass());
            b.d(g, bArr, 0, i2, new e(rVar));
            b.zzf(g);
            return g;
        } catch (zzci e) {
            e.f(g);
            throw e;
        } catch (zzef e2) {
            zzci a = e2.a();
            a.f(g);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzci) {
                throw ((zzci) e3.getCause());
            }
            zzci zzciVar = new zzci(e3);
            zzciVar.f(g);
            throw zzciVar;
        } catch (IndexOutOfBoundsException unused) {
            zzci g2 = zzci.g();
            g2.f(g);
            throw g2;
        }
    }

    @Override // defpackage.sbc
    public final void a(o oVar) {
        u0.a().b(getClass()).c(this, p.d(oVar));
    }

    @Override // com.google.android.gms.internal.play_billing.b
    final int b(w0 w0Var) {
        if (p()) {
            int zza = w0Var.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = w0Var.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    final int d() {
        return u0.a().b(getClass()).zzb(this);
    }

    protected final y e() {
        return (y) q(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return u0.a().b(getClass()).a(this, (z) obj);
    }

    final z g() {
        return (z) q(4, null, null);
    }

    public final int hashCode() {
        if (p()) {
            return d();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int d = d();
        this.zza = d;
        return d;
    }

    protected final void k() {
        u0.a().b(getClass()).zzf(this);
        l();
    }

    final void l() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void n(int i) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    public final boolean o() {
        byte byteValue = ((Byte) q(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = u0.a().b(getClass()).b(this);
        q(2, true != b ? null : this, null);
        return b;
    }

    final boolean p() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    protected abstract Object q(int i, Object obj, Object obj2);

    public final String toString() {
        return o0.a(this, super.toString());
    }

    @Override // defpackage.sbc
    public final int zze() {
        if (p()) {
            int r = r(null);
            if (r >= 0) {
                return r;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + r);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            i = r(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i;
        }
        return i;
    }

    @Override // defpackage.ycc
    public final /* synthetic */ sbc zzf() {
        return (z) q(6, null, null);
    }

    @Override // defpackage.sbc
    public final /* synthetic */ nac zzk() {
        return (y) q(5, null, null);
    }
}
