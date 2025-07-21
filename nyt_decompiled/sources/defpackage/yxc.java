package defpackage;

import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class yxc {
    private final jxc a;
    private final hsc b;
    private final Object c = new Object();
    private final List d = new ArrayList();
    private boolean e;

    yxc(jxc jxcVar, hsc hscVar) {
        this.a = jxcVar;
        this.b = hscVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List list) {
        String str;
        gsc a;
        zzbvg zzbvgVar;
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    zzbpd zzbpdVar = (zzbpd) it2.next();
                    if (((Boolean) pla.c().a(mpa.j9)).booleanValue()) {
                        gsc a2 = this.b.a(zzbpdVar.zza);
                        if (a2 != null && (zzbvgVar = a2.c) != null) {
                            str = zzbvgVar.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    boolean z = ((Boolean) pla.c().a(mpa.k9)).booleanValue() && (a = this.b.a(zzbpdVar.zza)) != null && a.d;
                    List list2 = this.d;
                    String str3 = zzbpdVar.zza;
                    list2.add(new xxc(str3, str2, this.b.c(str3), zzbpdVar.zzb ? 1 : 0, zzbpdVar.zzd, zzbpdVar.zzc, z));
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            try {
                if (!this.e) {
                    if (this.a.t()) {
                        d(this.a.g());
                    } else {
                        c();
                    }
                }
                Iterator it2 = this.d.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(((xxc) it2.next()).a());
                }
            } finally {
            }
        }
        return jSONArray;
    }

    public final void c() {
        this.a.s(new wxc(this));
    }
}
