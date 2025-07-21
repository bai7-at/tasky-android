package defpackage;

import android.location.Location;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.internal.ads.zzbjb;
import defpackage.s15;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class p4b implements a25 {
    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final zzbjb g;
    private final boolean i;
    private final String k;
    private final List h = new ArrayList();
    private final Map j = new HashMap();

    public p4b(Date date, int i, Set set, Location location, boolean z, int i2, zzbjb zzbjbVar, List list, boolean z2, int i3, String str) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = zzbjbVar;
        this.i = z2;
        this.k = str;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.h.add(str2);
                }
            }
        }
    }

    @Override // defpackage.a25
    public final t15 a() {
        return zzbjb.t0(this.g);
    }

    @Override // defpackage.dp4
    public final int b() {
        return this.f;
    }

    @Override // defpackage.dp4
    public final boolean c() {
        return this.i;
    }

    @Override // defpackage.dp4
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.a25
    public final s15 e() {
        s15.a aVar = new s15.a();
        zzbjb zzbjbVar = this.g;
        if (zzbjbVar == null) {
            return aVar.a();
        }
        int i = zzbjbVar.zza;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    aVar.e(zzbjbVar.zzg);
                    aVar.d(zzbjbVar.zzh);
                }
                aVar.g(zzbjbVar.zzb);
                aVar.c(zzbjbVar.zzc);
                aVar.f(zzbjbVar.zzd);
                return aVar.a();
            }
            zzfk zzfkVar = zzbjbVar.zzf;
            if (zzfkVar != null) {
                aVar.h(new h89(zzfkVar));
            }
        }
        aVar.b(zzbjbVar.zze);
        aVar.g(zzbjbVar.zzb);
        aVar.c(zzbjbVar.zzc);
        aVar.f(zzbjbVar.zzd);
        return aVar.a();
    }

    @Override // defpackage.a25
    public final boolean f() {
        return this.h.contains("6");
    }

    @Override // defpackage.dp4
    public final Set g() {
        return this.c;
    }

    @Override // defpackage.a25
    public final Map zza() {
        return this.j;
    }

    @Override // defpackage.a25
    public final boolean zzb() {
        return this.h.contains("3");
    }
}
