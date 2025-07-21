package defpackage;

import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzeir;

/* loaded from: classes3.dex */
public final class qdd {
    private final j2e a;
    private final hsc b;
    private final zuc c;
    private final k6e d;

    public qdd(j2e j2eVar, hsc hscVar, zuc zucVar, k6e k6eVar) {
        this.a = j2eVar;
        this.b = hscVar;
        this.c = zucVar;
        this.d = k6eVar;
    }

    public final void a(y0e y0eVar, v0e v0eVar, int i, zzeir zzeirVar, long j) {
        if (((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
            j6e b = j6e.b("adapter_status");
            b.g(y0eVar);
            b.f(v0eVar);
            b.a("adapter_l", String.valueOf(j));
            b.a("sc", Integer.toString(i));
            if (zzeirVar != null) {
                b.a("arec", Integer.toString(zzeirVar.b().zza));
                String a = this.a.a(zzeirVar.getMessage());
                if (a != null) {
                    b.a("areec", a);
                }
            }
            gsc b2 = this.b.b(v0eVar.u);
            if (b2 != null) {
                b.a("ancn", b2.a);
                zzbvg zzbvgVar = b2.b;
                if (zzbvgVar != null) {
                    b.a("adapter_v", zzbvgVar.toString());
                }
                zzbvg zzbvgVar2 = b2.c;
                if (zzbvgVar2 != null) {
                    b.a("adapter_sv", zzbvgVar2.toString());
                }
            }
            this.d.a(b);
            return;
        }
        yuc a2 = this.c.a();
        a2.e(y0eVar);
        a2.d(v0eVar);
        a2.b("action", "adapter_status");
        a2.b("adapter_l", String.valueOf(j));
        a2.b("sc", Integer.toString(i));
        if (zzeirVar != null) {
            a2.b("arec", Integer.toString(zzeirVar.b().zza));
            String a3 = this.a.a(zzeirVar.getMessage());
            if (a3 != null) {
                a2.b("areec", a3);
            }
        }
        gsc b3 = this.b.b(v0eVar.u);
        if (b3 != null) {
            a2.b("ancn", b3.a);
            zzbvg zzbvgVar3 = b3.b;
            if (zzbvgVar3 != null) {
                a2.b("adapter_v", zzbvgVar3.toString());
            }
            zzbvg zzbvgVar4 = b3.c;
            if (zzbvgVar4 != null) {
                a2.b("adapter_sv", zzbvgVar4.toString());
            }
        }
        a2.g();
    }
}
