package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;
import defpackage.cy0;
import defpackage.og8;
import defpackage.qg8;
import defpackage.ue5;
import defpackage.vg8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzhu {
    private final List zza = new ArrayList(0);
    private final qg8 zzb = new qg8();
    private final qg8 zzc = new qg8();
    private final Context zzd;
    private final ExecutorService zze;
    private final zzhc zzf;
    private Integer zzg;

    public zzhu(Context context, ExecutorService executorService, zzhc zzhcVar) {
        this.zzd = context;
        this.zze = executorService;
        this.zzf = zzhcVar;
    }

    public static /* synthetic */ og8 zza(zzhu zzhuVar, og8 og8Var) {
        final List list = (List) og8Var.m();
        return vg8.h(list).i(zzhuVar.zze, new cy0() { // from class: com.google.ads.interactivemedia.v3.internal.zzhl
            @Override // defpackage.cy0
            public final Object then(og8 og8Var2) {
                return list;
            }
        });
    }

    public static /* synthetic */ Void zzd(zzhu zzhuVar, og8 og8Var) {
        zzhuVar.zzc.e(zzhuVar.zza);
        return null;
    }

    private final void zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf zzbfVar, Exception exc) {
        this.zzf.zzb(com.google.ads.interactivemedia.v3.impl.data.zzbe.NATIVE_ESP, zzbfVar, exc);
    }

    private final void zzj(zzhk zzhkVar) {
        this.zza.remove(zzhkVar);
    }

    private static final Exception zzk(zzhk zzhkVar, Exception exc) {
        return new Exception("Exception with SecureSignalsAdapter " + zzhkVar.zze() + ":" + zzhkVar.zzf(), exc);
    }

    public final og8 zzb() {
        this.zzb.a().i(this.zze, new cy0() { // from class: com.google.ads.interactivemedia.v3.internal.zzhr
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                final zzhu zzhuVar = zzhu.this;
                List<zzhk> list = (List) og8Var.m();
                ArrayList arrayList = new ArrayList(list.size());
                for (final zzhk zzhkVar : list) {
                    og8 zzc = zzhkVar.zzc();
                    zzc.d(new ue5() { // from class: com.google.ads.interactivemedia.v3.internal.zzht
                        @Override // defpackage.ue5
                        public final void onFailure(Exception exc) {
                            zzhu.this.zzh(zzhkVar, exc);
                        }
                    });
                    arrayList.add(zzc);
                }
                return arrayList;
            }
        }).k(this.zze, new zzhn(this)).i(this.zze, new zzho(this)).i(this.zze, new cy0() { // from class: com.google.ads.interactivemedia.v3.internal.zzhs
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                zzhu.zzd(zzhu.this, og8Var);
                return null;
            }
        });
        return this.zzc.a();
    }

    public final og8 zzc(List list, Integer num) {
        if (num.intValue() == 0) {
            this.zzb.d(new Exception("No adapters to load"));
            return this.zzb.a();
        }
        this.zzg = num;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            zzhk zzhkVar = null;
            try {
                int i = 0;
                Class<?> cls = Class.forName(str, false, zzhu.class.getClassLoader());
                Class<?>[] interfaces = cls.getInterfaces();
                String name = SecureSignalsAdapter.class.getName();
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (interfaces[i].getName().equals(name)) {
                        zzhkVar = new zzhk((SecureSignalsAdapter) cls.getDeclaredConstructor(null).newInstance(null), str, this.zzd);
                        break;
                    }
                    i++;
                }
            } catch (Throwable unused) {
            }
            if (zzhkVar != null) {
                try {
                    this.zza.add(zzhkVar);
                } catch (Exception e) {
                    zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf.LOAD_ADAPTER, new Exception("Exception with SecureSignalsAdapter ".concat(String.valueOf(str)), e));
                }
            }
        }
        this.zzb.e(this.zza);
        return this.zzb.a();
    }

    public final List zze() {
        try {
            og8 i = this.zzc.a().i(this.zze, new cy0() { // from class: com.google.ads.interactivemedia.v3.internal.zzhm
                @Override // defpackage.cy0
                public final Object then(og8 og8Var) {
                    final zzhu zzhuVar = zzhu.this;
                    List<zzhk> list = (List) og8Var.m();
                    ArrayList arrayList = new ArrayList(list.size());
                    for (final zzhk zzhkVar : list) {
                        arrayList.add(zzhkVar.zzb().d(new ue5() { // from class: com.google.ads.interactivemedia.v3.internal.zzhq
                            @Override // defpackage.ue5
                            public final void onFailure(Exception exc) {
                                zzhu.this.zzg(zzhkVar, exc);
                            }
                        }));
                    }
                    return arrayList;
                }
            }).k(this.zze, new zzhn(this)).i(this.zze, new zzho(this));
            return (List) vg8.a(this.zzg == null ? vg8.e(new ArrayList()) : vg8.j(i, r1.intValue(), TimeUnit.MILLISECONDS).d(new ue5() { // from class: com.google.ads.interactivemedia.v3.internal.zzhp
                @Override // defpackage.ue5
                public final void onFailure(Exception exc) {
                    zzhu.this.zzf(exc);
                }
            }));
        } catch (InterruptedException | ExecutionException unused) {
            return new ArrayList();
        }
    }

    final /* synthetic */ void zzf(Exception exc) {
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf.COLLECT_SIGNALS, exc);
    }

    final /* synthetic */ void zzg(zzhk zzhkVar, Exception exc) {
        zzj(zzhkVar);
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf.COLLECT_SIGNALS, zzk(zzhkVar, exc));
    }

    final /* synthetic */ void zzh(zzhk zzhkVar, Exception exc) {
        zzj(zzhkVar);
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbf.INIT, zzk(zzhkVar, exc));
    }
}
