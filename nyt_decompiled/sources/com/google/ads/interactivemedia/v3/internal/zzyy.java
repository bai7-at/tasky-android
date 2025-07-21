package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzyy extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzyr();
    zzyx zza;
    int zzb;
    int zzc;
    final zzyx zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzyt zzh;
    private zzyv zzi;

    public zzyy() {
        this(zze, true);
    }

    private final void zzf(zzyx zzyxVar, boolean z) {
        while (zzyxVar != null) {
            zzyx zzyxVar2 = zzyxVar.zzb;
            zzyx zzyxVar3 = zzyxVar.zzc;
            int i = zzyxVar2 != null ? zzyxVar2.zzi : 0;
            int i2 = zzyxVar3 != null ? zzyxVar3.zzi : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                zzyx zzyxVar4 = zzyxVar3.zzb;
                zzyx zzyxVar5 = zzyxVar3.zzc;
                int i4 = (zzyxVar4 != null ? zzyxVar4.zzi : 0) - (zzyxVar5 != null ? zzyxVar5.zzi : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    zzh(zzyxVar);
                } else {
                    zzi(zzyxVar3);
                    zzh(zzyxVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                zzyx zzyxVar6 = zzyxVar2.zzb;
                zzyx zzyxVar7 = zzyxVar2.zzc;
                int i5 = (zzyxVar6 != null ? zzyxVar6.zzi : 0) - (zzyxVar7 != null ? zzyxVar7.zzi : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    zzi(zzyxVar);
                } else {
                    zzh(zzyxVar2);
                    zzi(zzyxVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                zzyxVar.zzi = i + 1;
                if (z) {
                    return;
                }
            } else {
                zzyxVar.zzi = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zzyxVar = zzyxVar.zza;
        }
    }

    private final void zzg(zzyx zzyxVar, zzyx zzyxVar2) {
        zzyx zzyxVar3 = zzyxVar.zza;
        zzyxVar.zza = null;
        if (zzyxVar2 != null) {
            zzyxVar2.zza = zzyxVar3;
        }
        if (zzyxVar3 == null) {
            this.zza = zzyxVar2;
        } else if (zzyxVar3.zzb == zzyxVar) {
            zzyxVar3.zzb = zzyxVar2;
        } else {
            zzyxVar3.zzc = zzyxVar2;
        }
    }

    private final void zzh(zzyx zzyxVar) {
        zzyx zzyxVar2 = zzyxVar.zzb;
        zzyx zzyxVar3 = zzyxVar.zzc;
        zzyx zzyxVar4 = zzyxVar3.zzb;
        zzyx zzyxVar5 = zzyxVar3.zzc;
        zzyxVar.zzc = zzyxVar4;
        if (zzyxVar4 != null) {
            zzyxVar4.zza = zzyxVar;
        }
        zzg(zzyxVar, zzyxVar3);
        zzyxVar3.zzb = zzyxVar;
        zzyxVar.zza = zzyxVar3;
        int max = Math.max(zzyxVar2 != null ? zzyxVar2.zzi : 0, zzyxVar4 != null ? zzyxVar4.zzi : 0) + 1;
        zzyxVar.zzi = max;
        zzyxVar3.zzi = Math.max(max, zzyxVar5 != null ? zzyxVar5.zzi : 0) + 1;
    }

    private final void zzi(zzyx zzyxVar) {
        zzyx zzyxVar2 = zzyxVar.zzb;
        zzyx zzyxVar3 = zzyxVar.zzc;
        zzyx zzyxVar4 = zzyxVar2.zzb;
        zzyx zzyxVar5 = zzyxVar2.zzc;
        zzyxVar.zzb = zzyxVar5;
        if (zzyxVar5 != null) {
            zzyxVar5.zza = zzyxVar;
        }
        zzg(zzyxVar, zzyxVar2);
        zzyxVar2.zzc = zzyxVar;
        zzyxVar.zza = zzyxVar2;
        int max = Math.max(zzyxVar3 != null ? zzyxVar3.zzi : 0, zzyxVar5 != null ? zzyxVar5.zzi : 0) + 1;
        zzyxVar.zzi = max;
        zzyxVar2.zzi = Math.max(max, zzyxVar4 != null ? zzyxVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzyx zzyxVar = this.zzd;
        zzyxVar.zze = zzyxVar;
        zzyxVar.zzd = zzyxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzc(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzyt zzytVar = this.zzh;
        if (zzytVar != null) {
            return zzytVar;
        }
        zzyt zzytVar2 = new zzyt(this);
        this.zzh = zzytVar2;
        return zzytVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzyx zzc = zzc(obj);
        if (zzc != null) {
            return zzc.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzyv zzyvVar = this.zzi;
        if (zzyvVar != null) {
            return zzyvVar;
        }
        zzyv zzyvVar2 = new zzyv(this);
        this.zzi = zzyvVar2;
        return zzyvVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzyx zza = zza(obj, true);
        Object obj3 = zza.zzh;
        zza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzyx zzd = zzd(obj);
        if (zzd != null) {
            return zzd.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final zzyx zza(Object obj, boolean z) {
        int i;
        zzyx zzyxVar;
        Comparator comparator = this.zzf;
        zzyx zzyxVar2 = this.zza;
        if (zzyxVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(zzyxVar2.zzf) : comparator.compare(obj, zzyxVar2.zzf);
                if (i == 0) {
                    return zzyxVar2;
                }
                zzyx zzyxVar3 = i < 0 ? zzyxVar2.zzb : zzyxVar2.zzc;
                if (zzyxVar3 == null) {
                    break;
                }
                zzyxVar2 = zzyxVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        zzyx zzyxVar4 = this.zzd;
        if (zzyxVar2 != null) {
            zzyxVar = new zzyx(this.zzg, zzyxVar2, obj, zzyxVar4, zzyxVar4.zze);
            if (i < 0) {
                zzyxVar2.zzb = zzyxVar;
            } else {
                zzyxVar2.zzc = zzyxVar;
            }
            zzf(zzyxVar2, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzyxVar = new zzyx(this.zzg, null, obj, zzyxVar4, zzyxVar4.zze);
            this.zza = zzyxVar;
        }
        this.zzb++;
        this.zzc++;
        return zzyxVar;
    }

    final zzyx zzb(Map.Entry entry) {
        zzyx zzc = zzc(entry.getKey());
        if (zzc == null) {
            return null;
        }
        Object obj = zzc.zzh;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return zzc;
        }
        return null;
    }

    final zzyx zzc(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    final zzyx zzd(Object obj) {
        zzyx zzc = zzc(obj);
        if (zzc != null) {
            zze(zzc, true);
        }
        return zzc;
    }

    final void zze(zzyx zzyxVar, boolean z) {
        zzyx zzyxVar2;
        zzyx zzyxVar3;
        int i;
        if (z) {
            zzyx zzyxVar4 = zzyxVar.zze;
            zzyxVar4.zzd = zzyxVar.zzd;
            zzyxVar.zzd.zze = zzyxVar4;
        }
        zzyx zzyxVar5 = zzyxVar.zzb;
        zzyx zzyxVar6 = zzyxVar.zzc;
        zzyx zzyxVar7 = zzyxVar.zza;
        int i2 = 0;
        if (zzyxVar5 == null || zzyxVar6 == null) {
            if (zzyxVar5 != null) {
                zzg(zzyxVar, zzyxVar5);
                zzyxVar.zzb = null;
            } else if (zzyxVar6 != null) {
                zzg(zzyxVar, zzyxVar6);
                zzyxVar.zzc = null;
            } else {
                zzg(zzyxVar, null);
            }
            zzf(zzyxVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzyxVar5.zzi > zzyxVar6.zzi) {
            do {
                zzyxVar3 = zzyxVar5;
                zzyxVar5 = zzyxVar5.zzc;
            } while (zzyxVar5 != null);
        } else {
            do {
                zzyxVar2 = zzyxVar6;
                zzyxVar6 = zzyxVar6.zzb;
            } while (zzyxVar6 != null);
            zzyxVar3 = zzyxVar2;
        }
        zze(zzyxVar3, false);
        zzyx zzyxVar8 = zzyxVar.zzb;
        if (zzyxVar8 != null) {
            i = zzyxVar8.zzi;
            zzyxVar3.zzb = zzyxVar8;
            zzyxVar8.zza = zzyxVar3;
            zzyxVar.zzb = null;
        } else {
            i = 0;
        }
        zzyx zzyxVar9 = zzyxVar.zzc;
        if (zzyxVar9 != null) {
            i2 = zzyxVar9.zzi;
            zzyxVar3.zzc = zzyxVar9;
            zzyxVar9.zza = zzyxVar3;
            zzyxVar.zzc = null;
        }
        zzyxVar3.zzi = Math.max(i, i2) + 1;
        zzg(zzyxVar, zzyxVar3);
    }

    public zzyy(Comparator comparator, boolean z) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z;
        this.zzd = new zzyx(z);
    }

    public zzyy(boolean z) {
        this(zze, false);
    }
}
