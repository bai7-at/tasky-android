package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import defpackage.m1f;
import defpackage.n1f;
import defpackage.p0f;
import defpackage.v1f;
import defpackage.w1f;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class yh extends rg {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected gj zzc = gj.c();

    protected static Object A(w1f w1fVar, String str, Object[] objArr) {
        return new wi(w1fVar, str, objArr);
    }

    protected static void D(Class cls, yh yhVar) {
        yhVar.C();
        zzb.put(cls, yhVar);
    }

    private static yh J(yh yhVar) {
        if (yhVar == null || yhVar.F()) {
            return yhVar;
        }
        zzhag a = new zzhco(yhVar).a();
        a.h(yhVar);
        throw a;
    }

    private static yh K(yh yhVar, byte[] bArr, int i, int i2, ph phVar) {
        yh n = yhVar.n();
        try {
            bj b = ui.a().b(n.getClass());
            b.c(n, bArr, 0, i2, new vg(phVar));
            b.zzf(n);
            return n;
        } catch (zzhag e) {
            e = e;
            if (e.l()) {
                e = new zzhag(e);
            }
            e.h(n);
            throw e;
        } catch (zzhco e2) {
            zzhag a = e2.a();
            a.h(n);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhag) {
                throw ((zzhag) e3.getCause());
            }
            zzhag zzhagVar = new zzhag(e3);
            zzhagVar.h(n);
            throw zzhagVar;
        } catch (IndexOutOfBoundsException unused) {
            zzhag j = zzhag.j();
            j.h(n);
            throw j;
        }
    }

    private final int j(bj bjVar) {
        return ui.a().b(getClass()).zza(this);
    }

    static yh m(Class cls) {
        Map map = zzb;
        yh yhVar = (yh) map.get(cls);
        if (yhVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                yhVar = (yh) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (yhVar == null) {
            yhVar = (yh) ((yh) mj.o(cls)).I(6, null, null);
            if (yhVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, yhVar);
        }
        return yhVar;
    }

    protected static yh o(yh yhVar, zzgyl zzgylVar) {
        ph phVar = ph.c;
        gh t = zzgylVar.t();
        yh n = yhVar.n();
        try {
            bj b = ui.a().b(n.getClass());
            b.d(n, hh.l(t), phVar);
            b.zzf(n);
            try {
                t.B(0);
                J(n);
                J(n);
                return n;
            } catch (zzhag e) {
                e.h(n);
                throw e;
            }
        } catch (zzhag e2) {
            e = e2;
            if (e.l()) {
                e = new zzhag(e);
            }
            e.h(n);
            throw e;
        } catch (zzhco e3) {
            zzhag a = e3.a();
            a.h(n);
            throw a;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzhag) {
                throw ((zzhag) e4.getCause());
            }
            zzhag zzhagVar = new zzhag(e4);
            zzhagVar.h(n);
            throw zzhagVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzhag) {
                throw ((zzhag) e5.getCause());
            }
            throw e5;
        }
    }

    protected static yh p(yh yhVar, byte[] bArr) {
        yh K = K(yhVar, bArr, 0, bArr.length, ph.c);
        J(K);
        return K;
    }

    protected static yh q(yh yhVar, zzgyl zzgylVar, ph phVar) {
        gh t = zzgylVar.t();
        yh n = yhVar.n();
        try {
            bj b = ui.a().b(n.getClass());
            b.d(n, hh.l(t), phVar);
            b.zzf(n);
            try {
                t.B(0);
                J(n);
                return n;
            } catch (zzhag e) {
                e.h(n);
                throw e;
            }
        } catch (zzhag e2) {
            e = e2;
            if (e.l()) {
                e = new zzhag(e);
            }
            e.h(n);
            throw e;
        } catch (zzhco e3) {
            zzhag a = e3.a();
            a.h(n);
            throw a;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzhag) {
                throw ((zzhag) e4.getCause());
            }
            zzhag zzhagVar = new zzhag(e4);
            zzhagVar.h(n);
            throw zzhagVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzhag) {
                throw ((zzhag) e5.getCause());
            }
            throw e5;
        }
    }

    protected static yh r(yh yhVar, InputStream inputStream, ph phVar) {
        gh g = gh.g(inputStream, ProgressEvent.PART_FAILED_EVENT_CODE);
        yh n = yhVar.n();
        try {
            bj b = ui.a().b(n.getClass());
            b.d(n, hh.l(g), phVar);
            b.zzf(n);
            J(n);
            return n;
        } catch (zzhag e) {
            e = e;
            if (e.l()) {
                e = new zzhag(e);
            }
            e.h(n);
            throw e;
        } catch (zzhco e2) {
            zzhag a = e2.a();
            a.h(n);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhag) {
                throw ((zzhag) e3.getCause());
            }
            zzhag zzhagVar = new zzhag(e3);
            zzhagVar.h(n);
            throw zzhagVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzhag) {
                throw ((zzhag) e4.getCause());
            }
            throw e4;
        }
    }

    protected static yh s(yh yhVar, byte[] bArr, ph phVar) {
        yh K = K(yhVar, bArr, 0, bArr.length, phVar);
        J(K);
        return K;
    }

    protected static p0f t() {
        return zh.e();
    }

    protected static p0f u(p0f p0fVar) {
        int size = p0fVar.size();
        return p0fVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static m1f v() {
        return gi.e();
    }

    protected static m1f w(m1f m1fVar) {
        int size = m1fVar.size();
        return m1fVar.zzd(size == 0 ? 10 : size + size);
    }

    protected static n1f x() {
        return vi.c();
    }

    protected static n1f y(n1f n1fVar) {
        int size = n1fVar.size();
        return n1fVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object z(Method method, Object obj, Object... objArr) {
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

    protected final void B() {
        ui.a().b(getClass()).zzf(this);
        C();
    }

    final void C() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void E(int i) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    public final boolean F() {
        byte byteValue = ((Byte) I(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b = ui.a().b(getClass()).b(this);
        I(2, true != b ? null : this, null);
        return b;
    }

    final boolean G() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    final int H() {
        return ui.a().b(getClass()).zzb(this);
    }

    protected abstract Object I(int i, Object obj, Object obj2);

    @Override // defpackage.x1f
    public final /* synthetic */ w1f a() {
        return (yh) I(6, null, null);
    }

    @Override // defpackage.w1f
    public final void b(lh lhVar) {
        ui.a().b(getClass()).e(this, mh.l(lhVar));
    }

    @Override // defpackage.w1f
    public final /* synthetic */ v1f c() {
        return (xh) I(5, null, null);
    }

    @Override // com.google.android.gms.internal.ads.rg
    final int d(bj bjVar) {
        if (G()) {
            int zza = bjVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = bjVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    @Override // defpackage.w1f
    public final int e() {
        if (G()) {
            int j = j(null);
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + j);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            i = j(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ui.a().b(getClass()).a(this, (yh) obj);
    }

    public final int hashCode() {
        if (G()) {
            return H();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int H = H();
        this.zza = H;
        return H;
    }

    protected final xh k() {
        return (xh) I(5, null, null);
    }

    public final xh l() {
        xh xhVar = (xh) I(5, null, null);
        xhVar.g(this);
        return xhVar;
    }

    final yh n() {
        return (yh) I(4, null, null);
    }

    public final String toString() {
        return oi.a(this, super.toString());
    }
}
