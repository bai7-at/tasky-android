package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class k9d {
    private final String c;
    private y0e d = null;
    private v0e e = null;
    private zzu f = null;
    private final Map b = Collections.synchronizedMap(new HashMap());
    private final List a = Collections.synchronizedList(new ArrayList());

    public k9d(String str) {
        this.c = str;
    }

    private static String j(v0e v0eVar) {
        return ((Boolean) pla.c().a(mpa.s3)).booleanValue() ? v0eVar.q0 : v0eVar.x;
    }

    private final synchronized void k(v0e v0eVar, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.b;
        String j = j(v0eVar);
        if (map.containsKey(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = v0eVar.w.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, v0eVar.w.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) pla.c().a(mpa.O6)).booleanValue()) {
            str = v0eVar.G;
            str2 = v0eVar.H;
            str3 = v0eVar.I;
            str4 = v0eVar.J;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        zzu zzuVar = new zzu(v0eVar.F, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.a.add(i, zzuVar);
        } catch (IndexOutOfBoundsException e) {
            dyf.q().w(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.b.put(j, zzuVar);
    }

    private final void l(v0e v0eVar, long j, zze zzeVar, boolean z) {
        Map map = this.b;
        String j2 = j(v0eVar);
        if (map.containsKey(j2)) {
            if (this.e == null) {
                this.e = v0eVar;
            }
            zzu zzuVar = (zzu) this.b.get(j2);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) pla.c().a(mpa.P6)).booleanValue() && z) {
                this.f = zzuVar;
            }
        }
    }

    public final zzu a() {
        return this.f;
    }

    public final p6c b() {
        return new p6c(this.e, "", this, this.d, this.c);
    }

    public final List c() {
        return this.a;
    }

    public final void d(v0e v0eVar) {
        k(v0eVar, this.a.size());
    }

    public final void e(v0e v0eVar) {
        int indexOf = this.a.indexOf(this.b.get(j(v0eVar)));
        if (indexOf < 0 || indexOf >= this.b.size()) {
            indexOf = this.a.indexOf(this.f);
        }
        if (indexOf < 0 || indexOf >= this.b.size()) {
            return;
        }
        this.f = (zzu) this.a.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return;
            }
            zzu zzuVar = (zzu) this.a.get(indexOf);
            zzuVar.zzb = 0L;
            zzuVar.zzc = null;
        }
    }

    public final void f(v0e v0eVar, long j, zze zzeVar) {
        l(v0eVar, j, zzeVar, false);
    }

    public final void g(v0e v0eVar, long j, zze zzeVar) {
        l(v0eVar, j, null, true);
    }

    public final synchronized void h(String str, List list) {
        if (this.b.containsKey(str)) {
            int indexOf = this.a.indexOf((zzu) this.b.get(str));
            try {
                this.a.remove(indexOf);
            } catch (IndexOutOfBoundsException e) {
                dyf.q().w(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.b.remove(str);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                k((v0e) it2.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void i(y0e y0eVar) {
        this.d = y0eVar;
    }
}
