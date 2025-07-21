package com.google.android.gms.internal.pal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzzr extends AbstractMap implements Serializable {
    private static final Comparator a = new x8();
    final Comparator zza;
    d9 zzb;
    int zzc;
    int zzd;
    final d9 zze;
    private z8 zzg;
    private b9 zzh;

    public zzzr() {
        Comparator comparator = a;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = new d9();
        this.zza = comparator;
    }

    private final void i(d9 d9Var, boolean z) {
        while (d9Var != null) {
            d9 d9Var2 = d9Var.b;
            d9 d9Var3 = d9Var.c;
            int i = d9Var2 != null ? d9Var2.h : 0;
            int i2 = d9Var3 != null ? d9Var3.h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                d9 d9Var4 = d9Var3.b;
                d9 d9Var5 = d9Var3.c;
                int i4 = (d9Var4 != null ? d9Var4.h : 0) - (d9Var5 != null ? d9Var5.h : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    l(d9Var);
                } else {
                    m(d9Var3);
                    l(d9Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                d9 d9Var6 = d9Var2.b;
                d9 d9Var7 = d9Var2.c;
                int i5 = (d9Var6 != null ? d9Var6.h : 0) - (d9Var7 != null ? d9Var7.h : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m(d9Var);
                } else {
                    l(d9Var2);
                    m(d9Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                d9Var.h = i + 1;
                if (z) {
                    return;
                }
            } else {
                d9Var.h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            d9Var = d9Var.a;
        }
    }

    private final void j(d9 d9Var, d9 d9Var2) {
        d9 d9Var3 = d9Var.a;
        d9Var.a = null;
        if (d9Var2 != null) {
            d9Var2.a = d9Var3;
        }
        if (d9Var3 == null) {
            this.zzb = d9Var2;
        } else if (d9Var3.b == d9Var) {
            d9Var3.b = d9Var2;
        } else {
            d9Var3.c = d9Var2;
        }
    }

    private final void l(d9 d9Var) {
        d9 d9Var2 = d9Var.b;
        d9 d9Var3 = d9Var.c;
        d9 d9Var4 = d9Var3.b;
        d9 d9Var5 = d9Var3.c;
        d9Var.c = d9Var4;
        if (d9Var4 != null) {
            d9Var4.a = d9Var;
        }
        j(d9Var, d9Var3);
        d9Var3.b = d9Var;
        d9Var.a = d9Var3;
        int max = Math.max(d9Var2 != null ? d9Var2.h : 0, d9Var4 != null ? d9Var4.h : 0) + 1;
        d9Var.h = max;
        d9Var3.h = Math.max(max, d9Var5 != null ? d9Var5.h : 0) + 1;
    }

    private final void m(d9 d9Var) {
        d9 d9Var2 = d9Var.b;
        d9 d9Var3 = d9Var.c;
        d9 d9Var4 = d9Var2.b;
        d9 d9Var5 = d9Var2.c;
        d9Var.b = d9Var5;
        if (d9Var5 != null) {
            d9Var5.a = d9Var;
        }
        j(d9Var, d9Var2);
        d9Var2.c = d9Var;
        d9Var.a = d9Var2;
        int max = Math.max(d9Var3 != null ? d9Var3.h : 0, d9Var5 != null ? d9Var5.h : 0) + 1;
        d9Var.h = max;
        d9Var2.h = Math.max(max, d9Var4 != null ? d9Var4.h : 0) + 1;
    }

    final d9 a(Object obj, boolean z) {
        int i;
        d9 d9Var;
        Comparator comparator = this.zza;
        d9 d9Var2 = this.zzb;
        if (d9Var2 != null) {
            Comparable comparable = comparator == a ? (Comparable) obj : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(d9Var2.f) : comparator.compare(obj, d9Var2.f);
                if (i == 0) {
                    return d9Var2;
                }
                d9 d9Var3 = i < 0 ? d9Var2.b : d9Var2.c;
                if (d9Var3 == null) {
                    break;
                }
                d9Var2 = d9Var3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        d9 d9Var4 = this.zze;
        if (d9Var2 != null) {
            d9Var = new d9(d9Var2, obj, d9Var4, d9Var4.e);
            if (i < 0) {
                d9Var2.b = d9Var;
            } else {
                d9Var2.c = d9Var;
            }
            i(d9Var2, true);
        } else {
            if (comparator == a && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            d9Var = new d9(null, obj, d9Var4, d9Var4.e);
            this.zzb = d9Var;
        }
        this.zzc++;
        this.zzd++;
        return d9Var;
    }

    final d9 c(Map.Entry entry) {
        d9 d = d(entry.getKey());
        if (d == null) {
            return null;
        }
        Object obj = d.g;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return d;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zzb = null;
        this.zzc = 0;
        this.zzd++;
        d9 d9Var = this.zze;
        d9Var.e = d9Var;
        d9Var.d = d9Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    final d9 d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        z8 z8Var = this.zzg;
        if (z8Var != null) {
            return z8Var;
        }
        z8 z8Var2 = new z8(this);
        this.zzg = z8Var2;
        return z8Var2;
    }

    final d9 f(Object obj) {
        d9 d = d(obj);
        if (d != null) {
            h(d, true);
        }
        return d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        d9 d = d(obj);
        if (d != null) {
            return d.g;
        }
        return null;
    }

    final void h(d9 d9Var, boolean z) {
        d9 d9Var2;
        d9 d9Var3;
        int i;
        if (z) {
            d9 d9Var4 = d9Var.e;
            d9Var4.d = d9Var.d;
            d9Var.d.e = d9Var4;
        }
        d9 d9Var5 = d9Var.b;
        d9 d9Var6 = d9Var.c;
        d9 d9Var7 = d9Var.a;
        int i2 = 0;
        if (d9Var5 == null || d9Var6 == null) {
            if (d9Var5 != null) {
                j(d9Var, d9Var5);
                d9Var.b = null;
            } else if (d9Var6 != null) {
                j(d9Var, d9Var6);
                d9Var.c = null;
            } else {
                j(d9Var, null);
            }
            i(d9Var7, false);
            this.zzc--;
            this.zzd++;
            return;
        }
        if (d9Var5.h > d9Var6.h) {
            do {
                d9Var3 = d9Var5;
                d9Var5 = d9Var5.c;
            } while (d9Var5 != null);
        } else {
            do {
                d9Var2 = d9Var6;
                d9Var6 = d9Var6.b;
            } while (d9Var6 != null);
            d9Var3 = d9Var2;
        }
        h(d9Var3, false);
        d9 d9Var8 = d9Var.b;
        if (d9Var8 != null) {
            i = d9Var8.h;
            d9Var3.b = d9Var8;
            d9Var8.a = d9Var3;
            d9Var.b = null;
        } else {
            i = 0;
        }
        d9 d9Var9 = d9Var.c;
        if (d9Var9 != null) {
            i2 = d9Var9.h;
            d9Var3.c = d9Var9;
            d9Var9.a = d9Var3;
            d9Var.c = null;
        }
        d9Var3.h = Math.max(i, i2) + 1;
        j(d9Var, d9Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        b9 b9Var = this.zzh;
        if (b9Var != null) {
            return b9Var;
        }
        b9 b9Var2 = new b9(this);
        this.zzh = b9Var2;
        return b9Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        d9 a2 = a(obj, true);
        Object obj3 = a2.g;
        a2.g = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        d9 f = f(obj);
        if (f != null) {
            return f.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc;
    }
}
