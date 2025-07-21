package defpackage;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.o2;
import com.google.android.gms.internal.ads.p2;
import com.google.android.gms.internal.ads.r2;
import com.google.android.gms.internal.ads.s2;
import com.google.android.gms.internal.ads.t2;
import com.google.android.gms.internal.ads.u2;
import com.google.android.gms.internal.ads.v2;
import com.google.android.gms.internal.ads.zzfjc;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
final class j3e implements i3e {
    private final ConcurrentHashMap a;
    private final zzfjc b;
    private final l3e c = new l3e();

    public j3e(zzfjc zzfjcVar) {
        this.a = new ConcurrentHashMap(zzfjcVar.zzd);
        this.b = zzfjcVar;
    }

    private final void e() {
        Parcelable.Creator<zzfjc> creator = zzfjc.CREATOR;
        if (((Boolean) pla.c().a(mpa.s6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.zzb);
            sb.append(" PoolCollection");
            sb.append(this.c.b());
            int i = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((t3e) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((h3e) entry.getValue()).b(); i2++) {
                    sb.append("[O]");
                }
                for (int b = ((h3e) entry.getValue()).b(); b < this.b.zzd; b++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((h3e) entry.getValue()).g());
                sb.append("\n");
            }
            while (i < this.b.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            fgb.b(sb.toString());
        }
    }

    @Override // defpackage.i3e
    public final synchronized boolean a(t3e t3eVar) {
        h3e h3eVar = (h3e) this.a.get(t3eVar);
        if (h3eVar == null) {
            return true;
        }
        return h3eVar.b() < this.b.zzd;
    }

    @Override // defpackage.i3e
    public final t3e b(zzl zzlVar, String str, zzw zzwVar) {
        return new u3e(zzlVar, str, new w9b(this.b.zza).a().k, this.b.zzf, zzwVar);
    }

    @Override // defpackage.i3e
    public final synchronized boolean c(t3e t3eVar, s3e s3eVar) {
        boolean h;
        try {
            h3e h3eVar = (h3e) this.a.get(t3eVar);
            s3eVar.d = dyf.b().currentTimeMillis();
            if (h3eVar == null) {
                zzfjc zzfjcVar = this.b;
                h3e h3eVar2 = new h3e(zzfjcVar.zzd, zzfjcVar.zze * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
                if (this.a.size() == this.b.zzc) {
                    int i = this.b.zzg;
                    int i2 = i - 1;
                    t3e t3eVar2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.a.entrySet()) {
                            if (((h3e) entry.getValue()).c() < j) {
                                j = ((h3e) entry.getValue()).c();
                                t3eVar2 = (t3e) entry.getKey();
                            }
                        }
                        if (t3eVar2 != null) {
                            this.a.remove(t3eVar2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.a.entrySet()) {
                            if (((h3e) entry2.getValue()).d() < j) {
                                j = ((h3e) entry2.getValue()).d();
                                t3eVar2 = (t3e) entry2.getKey();
                            }
                        }
                        if (t3eVar2 != null) {
                            this.a.remove(t3eVar2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.a.entrySet()) {
                            if (((h3e) entry3.getValue()).a() < i3) {
                                i3 = ((h3e) entry3.getValue()).a();
                                t3eVar2 = (t3e) entry3.getKey();
                            }
                        }
                        if (t3eVar2 != null) {
                            this.a.remove(t3eVar2);
                        }
                    }
                    this.c.g();
                }
                this.a.put(t3eVar, h3eVar2);
                this.c.d();
                h3eVar = h3eVar2;
            }
            h = h3eVar.h(s3eVar);
            this.c.c();
            k3e a = this.c.a();
            g4e f = h3eVar.f();
            p2 L = v2.L();
            n2 L2 = o2.L();
            L2.q(2);
            t2 L3 = u2.L();
            L3.n(a.a);
            L3.o(a.b);
            L3.p(f.b);
            L2.p(L3);
            L.n(L2);
            s3eVar.a.zzb().c().s0((v2) L.i());
            e();
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    @Override // defpackage.i3e
    public final synchronized s3e d(t3e t3eVar) {
        s3e s3eVar;
        try {
            h3e h3eVar = (h3e) this.a.get(t3eVar);
            if (h3eVar != null) {
                s3eVar = h3eVar.e();
                if (s3eVar == null) {
                    this.c.e();
                }
                g4e f = h3eVar.f();
                if (s3eVar != null) {
                    p2 L = v2.L();
                    n2 L2 = o2.L();
                    L2.q(2);
                    r2 L3 = s2.L();
                    L3.n(f.a);
                    L3.o(f.b);
                    L2.n(L3);
                    L.n(L2);
                    s3eVar.a.zzb().c().u0((v2) L.i());
                }
                e();
            } else {
                this.c.f();
                e();
                s3eVar = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return s3eVar;
    }

    @Override // defpackage.i3e
    public final zzfjc zza() {
        return this.b;
    }
}
