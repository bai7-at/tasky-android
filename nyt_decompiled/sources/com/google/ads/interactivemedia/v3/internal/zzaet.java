package com.google.ads.interactivemedia.v3.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ads.interactivemedia.v3.internal.zzaep;
import com.google.ads.interactivemedia.v3.internal.zzaet;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzaet<MessageType extends zzaet<MessageType, BuilderType>, BuilderType extends zzaep<MessageType, BuilderType>> extends zzadb<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzahk zzc = zzahk.zzc();

    private final int zza(zzags zzagsVar) {
        if (zzagsVar != null) {
            return zzagsVar.zza(this);
        }
        return zzagh.zza().zzb(getClass()).zza(this);
    }

    protected static zzaet zzaB(zzaet zzaetVar, zzadr zzadrVar) throws zzafc {
        zzaef zzaefVar = zzaef.zza;
        zzadv zzl = zzadrVar.zzl();
        zzaet zzaA = zzaetVar.zzaA();
        try {
            zzags zzb2 = zzagh.zza().zzb(zzaA.getClass());
            zzb2.zzh(zzaA, zzadw.zzq(zzl), zzaefVar);
            zzb2.zzf(zzaA);
            try {
                zzl.zzm(0);
                zzb(zzaA);
                zzb(zzaA);
                return zzaA;
            } catch (zzafc e) {
                e.zzh(zzaA);
                throw e;
            }
        } catch (zzafc e2) {
            e2.zzh(zzaA);
            throw e2;
        } catch (zzahi e3) {
            zzafc zza = e3.zza();
            zza.zzh(zzaA);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzafc) {
                throw ((zzafc) e4.getCause());
            }
            zzafc zzafcVar = new zzafc(e4);
            zzafcVar.zzh(zzaA);
            throw zzafcVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzafc) {
                throw ((zzafc) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzaet zzaC(zzaet zzaetVar, zzadr zzadrVar, zzaef zzaefVar) throws zzafc {
        zzadv zzl = zzadrVar.zzl();
        zzaet zzaA = zzaetVar.zzaA();
        try {
            zzags zzb2 = zzagh.zza().zzb(zzaA.getClass());
            zzb2.zzh(zzaA, zzadw.zzq(zzl), zzaefVar);
            zzb2.zzf(zzaA);
            try {
                zzl.zzm(0);
                zzb(zzaA);
                return zzaA;
            } catch (zzafc e) {
                e.zzh(zzaA);
                throw e;
            }
        } catch (zzafc e2) {
            e2.zzh(zzaA);
            throw e2;
        } catch (zzahi e3) {
            zzafc zza = e3.zza();
            zza.zzh(zzaA);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzafc) {
                throw ((zzafc) e4.getCause());
            }
            zzafc zzafcVar = new zzafc(e4);
            zzafcVar.zzh(zzaA);
            throw zzafcVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzafc) {
                throw ((zzafc) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzaet zzaD(zzaet zzaetVar, byte[] bArr, zzaef zzaefVar) throws zzafc {
        zzaet zzc = zzc(zzaetVar, bArr, 0, bArr.length, zzaefVar);
        zzb(zzc);
        return zzc;
    }

    protected static zzaey zzaE() {
        return zzaeu.zzf();
    }

    protected static zzaez zzaF() {
        return zzagi.zze();
    }

    protected static zzaez zzaG(zzaez zzaezVar) {
        int size = zzaezVar.size();
        return zzaezVar.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaI(Method method, Object obj, Object... objArr) {
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

    protected static Object zzaJ(zzafz zzafzVar, String str, Object[] objArr) {
        return new zzagj(zzafzVar, str, objArr);
    }

    protected static void zzaM(Class cls, zzaet zzaetVar) {
        zzaetVar.zzaL();
        zzb.put(cls, zzaetVar);
    }

    static zzaet zzaz(Class cls) {
        Map map = zzb;
        zzaet zzaetVar = (zzaet) map.get(cls);
        if (zzaetVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaetVar = (zzaet) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzaetVar == null) {
            zzaetVar = (zzaet) ((zzaet) zzaht.zze(cls)).zzj(6, null, null);
            if (zzaetVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzaetVar);
        }
        return zzaetVar;
    }

    private static zzaet zzb(zzaet zzaetVar) throws zzafc {
        if (zzaetVar == null || zzaetVar.zzaP()) {
            return zzaetVar;
        }
        zzafc zza = new zzahi(zzaetVar).zza();
        zza.zzh(zzaetVar);
        throw zza;
    }

    private static zzaet zzc(zzaet zzaetVar, byte[] bArr, int i, int i2, zzaef zzaefVar) throws zzafc {
        zzaet zzaA = zzaetVar.zzaA();
        try {
            zzags zzb2 = zzagh.zza().zzb(zzaA.getClass());
            zzb2.zzi(zzaA, bArr, 0, i2, new zzade(zzaefVar));
            zzb2.zzf(zzaA);
            return zzaA;
        } catch (zzafc e) {
            e.zzh(zzaA);
            throw e;
        } catch (zzahi e2) {
            zzafc zza = e2.zza();
            zza.zzh(zzaA);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzafc) {
                throw ((zzafc) e3.getCause());
            }
            zzafc zzafcVar = new zzafc(e3);
            zzafcVar.zzh(zzaA);
            throw zzafcVar;
        } catch (IndexOutOfBoundsException unused) {
            zzafc zzi = zzafc.zzi();
            zzi.zzh(zzaA);
            throw zzi;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzagh.zza().zzb(getClass()).zzk(this, (zzaet) obj);
    }

    public final int hashCode() {
        if (zzaQ()) {
            return zzaw();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzaw = zzaw();
        this.zza = zzaw;
        return zzaw;
    }

    public final String toString() {
        return zzagb.zza(this, super.toString());
    }

    final zzaet zzaA() {
        return (zzaet) zzj(4, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final /* synthetic */ zzafy zzaH() {
        return (zzaep) zzj(5, null, null);
    }

    protected final void zzaK() {
        zzagh.zza().zzb(getClass()).zzf(this);
        zzaL();
    }

    final void zzaL() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzaN(int i) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final void zzaO(zzaea zzaeaVar) throws IOException {
        zzagh.zza().zzb(getClass()).zzj(this, zzaeb.zza(zzaeaVar));
    }

    public final boolean zzaP() {
        byte byteValue = ((Byte) zzj(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzagh.zza().zzb(getClass()).zzl(this);
        zzj(2, true != zzl ? null : this, null);
        return zzl;
    }

    final boolean zzaQ() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaga
    public final /* synthetic */ zzafz zzaR() {
        return (zzaet) zzj(6, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadb
    final int zzat(zzags zzagsVar) {
        if (zzaQ()) {
            int zza = zza(zzagsVar);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zza(zzagsVar);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    final int zzaw() {
        return zzagh.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final int zzax() {
        if (zzaQ()) {
            int zza = zza(null);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            i = zza(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i;
        }
        return i;
    }

    protected final zzaep zzay() {
        return (zzaep) zzj(5, null, null);
    }

    protected abstract Object zzj(int i, Object obj, Object obj2);
}
