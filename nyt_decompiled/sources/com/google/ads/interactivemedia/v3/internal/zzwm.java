package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class zzwm {
    static final zzwf zza = zzwe.IDENTITY;
    static final zzxg zzb = zzxf.DOUBLE;
    static final zzxg zzc = zzxf.LAZILY_PARSED_NUMBER;
    public static final /* synthetic */ int zzn = 0;
    final List zzd;
    final zzyn zze;
    final zzwf zzf;
    final Map zzg;
    final boolean zzh;
    final List zzi;
    final List zzj;
    final zzxg zzk;
    final zzxg zzl;
    final List zzm;
    private final ThreadLocal zzo;
    private final ConcurrentMap zzp;
    private final zzyl zzq;
    private final zzzt zzr;

    public zzwm() {
        zzyn zzynVar = zzyn.zza;
        throw null;
    }

    static void zzg(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + String.valueOf(this.zzd) + ",instanceCreators:" + this.zzq.toString() + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r2.zzb(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.zzxi zza(com.google.ads.interactivemedia.v3.internal.zzact r7) {
        /*
            r6 = this;
            java.util.concurrent.ConcurrentMap r0 = r6.zzp
            java.lang.Object r0 = r0.get(r7)
            com.google.ads.interactivemedia.v3.internal.zzxi r0 = (com.google.ads.interactivemedia.v3.internal.zzxi) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.ThreadLocal r0 = r6.zzo
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L21
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal r1 = r6.zzo
            r1.set(r0)
            r1 = 1
            goto L2a
        L21:
            java.lang.Object r1 = r0.get(r7)
            com.google.ads.interactivemedia.v3.internal.zzxi r1 = (com.google.ads.interactivemedia.v3.internal.zzxi) r1
            if (r1 != 0) goto L7e
            r1 = 0
        L2a:
            com.google.ads.interactivemedia.v3.internal.zzwl r2 = new com.google.ads.interactivemedia.v3.internal.zzwl     // Catch: java.lang.Throwable -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L52
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L52
            java.util.List r3 = r6.zzd     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L52
            r4 = 0
        L39:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L54
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L52
            com.google.ads.interactivemedia.v3.internal.zzxj r4 = (com.google.ads.interactivemedia.v3.internal.zzxj) r4     // Catch: java.lang.Throwable -> L52
            com.google.ads.interactivemedia.v3.internal.zzxi r4 = r4.zza(r6, r7)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L39
            r2.zzb(r4)     // Catch: java.lang.Throwable -> L52
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r7 = move-exception
            goto L75
        L54:
            if (r1 == 0) goto L5b
            java.lang.ThreadLocal r2 = r6.zzo
            r2.remove()
        L5b:
            if (r4 == 0) goto L65
            if (r1 == 0) goto L64
            java.util.concurrent.ConcurrentMap r6 = r6.zzp
            r6.putAll(r0)
        L64:
            return r4
        L65:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "GSON (${project.version}) cannot handle "
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
        L75:
            if (r1 != 0) goto L78
            goto L7d
        L78:
            java.lang.ThreadLocal r6 = r6.zzo
            r6.remove()
        L7d:
            throw r7
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzwm.zza(com.google.ads.interactivemedia.v3.internal.zzact):com.google.ads.interactivemedia.v3.internal.zzxi");
    }

    public final zzxi zzb(zzxj zzxjVar, zzact zzactVar) {
        if (!this.zzd.contains(zzxjVar)) {
            zzxjVar = this.zzr;
        }
        boolean z = false;
        for (zzxj zzxjVar2 : this.zzd) {
            if (z) {
                zzxi zza2 = zzxjVar2.zza(this, zzactVar);
                if (zza2 != null) {
                    return zza2;
                }
            } else if (zzxjVar2 == zzxjVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(zzactVar)));
    }

    public final zzacx zzc(Writer writer) throws IOException {
        zzacx zzacxVar = new zzacx(writer);
        zzacxVar.zzm(null);
        zzacxVar.zzn(this.zzh);
        zzacxVar.zzo(false);
        zzacxVar.zzp(false);
        return zzacxVar;
    }

    public final Object zzd(zzacv zzacvVar, zzact zzactVar) throws zzws, zzwz {
        boolean zzr = zzacvVar.zzr();
        boolean z = true;
        zzacvVar.zzo(true);
        try {
            try {
                try {
                    try {
                        zzacvVar.zzt();
                        try {
                            return zza(zzactVar).read(zzacvVar);
                        } catch (EOFException e) {
                            e = e;
                            z = false;
                            if (!z) {
                                throw new zzwz(e);
                            }
                            zzacvVar.zzo(zzr);
                            return null;
                        }
                    } finally {
                        zzacvVar.zzo(zzr);
                    }
                } catch (EOFException e2) {
                    e = e2;
                }
            } catch (IllegalStateException e3) {
                throw new zzwz(e3);
            }
        } catch (IOException e4) {
            throw new zzwz(e4);
        } catch (AssertionError e5) {
            throw new AssertionError("AssertionError (GSON ${project.version}): " + e5.getMessage(), e5);
        }
    }

    public final Object zze(String str, Class cls) throws zzwz {
        Object zzd;
        zzact zza2 = zzact.zza(cls);
        if (str == null) {
            zzd = null;
        } else {
            zzacv zzacvVar = new zzacv(new StringReader(str));
            zzacvVar.zzo(false);
            zzd = zzd(zzacvVar, zza2);
            if (zzd != null) {
                try {
                    if (zzacvVar.zzt() != 10) {
                        throw new zzwz("JSON document was not fully consumed.");
                    }
                } catch (zzacy e) {
                    throw new zzwz(e);
                } catch (IOException e2) {
                    throw new zzws(e2);
                }
            }
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(zzd);
    }

    public final String zzf(Object obj) {
        if (obj == null) {
            zzwr zzwrVar = zzwt.zza;
            StringWriter stringWriter = new StringWriter();
            try {
                zzh(zzwrVar, zzc(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new zzws(e);
            }
        }
        StringWriter stringWriter2 = new StringWriter();
        try {
            zzi(obj, obj.getClass(), zzc(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new zzws(e2);
        }
    }

    public final void zzh(zzwr zzwrVar, zzacx zzacxVar) throws zzws {
        boolean zzs = zzacxVar.zzs();
        zzacxVar.zzo(true);
        boolean zzr = zzacxVar.zzr();
        zzacxVar.zzn(this.zzh);
        boolean zzq = zzacxVar.zzq();
        zzacxVar.zzp(false);
        try {
            try {
                zzaby.zzV.write(zzacxVar, zzwrVar);
            } catch (IOException e) {
                throw new zzws(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON ${project.version}): " + e2.getMessage(), e2);
            }
        } finally {
            zzacxVar.zzo(zzs);
            zzacxVar.zzn(zzr);
            zzacxVar.zzp(zzq);
        }
    }

    public final void zzi(Object obj, Type type2, zzacx zzacxVar) throws zzws {
        zzxi zza2 = zza(zzact.zzb(type2));
        boolean zzs = zzacxVar.zzs();
        zzacxVar.zzo(true);
        boolean zzr = zzacxVar.zzr();
        zzacxVar.zzn(this.zzh);
        boolean zzq = zzacxVar.zzq();
        zzacxVar.zzp(false);
        try {
            try {
                zza2.write(zzacxVar, obj);
            } catch (IOException e) {
                throw new zzws(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON ${project.version}): " + e2.getMessage(), e2);
            }
        } finally {
            zzacxVar.zzo(zzs);
            zzacxVar.zzn(zzr);
            zzacxVar.zzp(zzq);
        }
    }

    zzwm(zzyn zzynVar, zzwf zzwfVar, Map map, boolean z, boolean z2, boolean z3, boolean z4, zzwg zzwgVar, boolean z5, boolean z6, boolean z7, int i, String str, int i2, int i3, List list, List list2, List list3, zzxg zzxgVar, zzxg zzxgVar2, List list4) {
        this.zzo = new ThreadLocal();
        this.zzp = new ConcurrentHashMap();
        this.zze = zzynVar;
        this.zzf = zzwfVar;
        this.zzg = map;
        zzyl zzylVar = new zzyl(map, true, list4);
        this.zzq = zzylVar;
        this.zzh = true;
        this.zzi = list;
        this.zzj = list2;
        this.zzk = zzxgVar;
        this.zzl = zzxgVar2;
        this.zzm = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzaby.zzW);
        arrayList.add(zzaaa.zza(zzxgVar));
        arrayList.add(zzynVar);
        arrayList.addAll(list3);
        arrayList.add(zzaby.zzC);
        arrayList.add(zzaby.zzm);
        arrayList.add(zzaby.zzg);
        arrayList.add(zzaby.zzi);
        arrayList.add(zzaby.zzk);
        zzxi zzxiVar = zzaby.zzt;
        arrayList.add(zzaby.zzc(Long.TYPE, Long.class, zzxiVar));
        arrayList.add(zzaby.zzc(Double.TYPE, Double.class, new zzwh(this)));
        arrayList.add(zzaby.zzc(Float.TYPE, Float.class, new zzwi(this)));
        arrayList.add(zzzx.zza(zzxgVar2));
        arrayList.add(zzaby.zzo);
        arrayList.add(zzaby.zzq);
        arrayList.add(zzaby.zzb(AtomicLong.class, new zzwj(zzxiVar).nullSafe()));
        arrayList.add(zzaby.zzb(AtomicLongArray.class, new zzwk(zzxiVar).nullSafe()));
        arrayList.add(zzaby.zzs);
        arrayList.add(zzaby.zzx);
        arrayList.add(zzaby.zzE);
        arrayList.add(zzaby.zzG);
        arrayList.add(zzaby.zzb(BigDecimal.class, zzaby.zzz));
        arrayList.add(zzaby.zzb(BigInteger.class, zzaby.zzA));
        arrayList.add(zzaby.zzb(zzyq.class, zzaby.zzB));
        arrayList.add(zzaby.zzI);
        arrayList.add(zzaby.zzK);
        arrayList.add(zzaby.zzO);
        arrayList.add(zzaby.zzQ);
        arrayList.add(zzaby.zzU);
        arrayList.add(zzaby.zzM);
        arrayList.add(zzaby.zzd);
        arrayList.add(zzzq.zza);
        arrayList.add(zzaby.zzS);
        if (zzacs.zza) {
            arrayList.add(zzacs.zze);
            arrayList.add(zzacs.zzd);
            arrayList.add(zzacs.zzf);
        }
        arrayList.add(zzzm.zza);
        arrayList.add(zzaby.zzb);
        arrayList.add(new zzzo(zzylVar));
        arrayList.add(new zzzv(zzylVar, false));
        zzzt zzztVar = new zzzt(zzylVar);
        this.zzr = zzztVar;
        arrayList.add(zzztVar);
        arrayList.add(zzaby.zzX);
        arrayList.add(new zzaag(zzylVar, zzwfVar, zzynVar, zzztVar, list4));
        this.zzd = Collections.unmodifiableList(arrayList);
    }
}
