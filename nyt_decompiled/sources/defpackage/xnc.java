package defpackage;

import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzgaa;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class xnc {
    private final zzgaa a;
    private final List b = new ArrayList();
    private ByteBuffer[] c = new ByteBuffer[0];
    private cpc d;
    private cpc e;
    private boolean f;

    public xnc(zzgaa zzgaaVar) {
        this.a = zzgaaVar;
        cpc cpcVar = cpc.e;
        this.d = cpcVar;
        this.e = cpcVar;
        this.f = false;
    }

    private final int i() {
        return this.c.length - 1;
    }

    private final void j(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= i()) {
                int i2 = i + 1;
                if (!this.c[i].hasRemaining()) {
                    grc grcVar = (grc) this.b.get(i);
                    if (!grcVar.zzh()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : grc.a;
                        long remaining = byteBuffer2.remaining();
                        grcVar.a(byteBuffer2);
                        this.c[i] = grcVar.zzb();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z2 = true;
                        if (remaining2 <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.c[i].hasRemaining() && i < i()) {
                        ((grc) this.b.get(i2)).zzd();
                    }
                }
                i = i2;
            }
        } while (z);
    }

    public final cpc a(cpc cpcVar) {
        if (cpcVar.equals(cpc.e)) {
            throw new zzds("Unhandled input format:", cpcVar);
        }
        for (int i = 0; i < this.a.size(); i++) {
            grc grcVar = (grc) this.a.get(i);
            cpc b = grcVar.b(cpcVar);
            if (grcVar.zzg()) {
                wad.f(!b.equals(cpc.e));
                cpcVar = b;
            }
        }
        this.e = cpcVar;
        return cpcVar;
    }

    public final ByteBuffer b() {
        if (!h()) {
            return grc.a;
        }
        ByteBuffer byteBuffer = this.c[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(grc.a);
        return this.c[i()];
    }

    public final void c() {
        this.b.clear();
        this.d = this.e;
        this.f = false;
        for (int i = 0; i < this.a.size(); i++) {
            grc grcVar = (grc) this.a.get(i);
            grcVar.zzc();
            if (grcVar.zzg()) {
                this.b.add(grcVar);
            }
        }
        this.c = new ByteBuffer[this.b.size()];
        for (int i2 = 0; i2 <= i(); i2++) {
            this.c[i2] = ((grc) this.b.get(i2)).zzb();
        }
    }

    public final void d() {
        if (!h() || this.f) {
            return;
        }
        this.f = true;
        ((grc) this.b.get(0)).zzd();
    }

    public final void e(ByteBuffer byteBuffer) {
        if (!h() || this.f) {
            return;
        }
        j(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnc)) {
            return false;
        }
        xnc xncVar = (xnc) obj;
        if (this.a.size() != xncVar.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i) != xncVar.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        for (int i = 0; i < this.a.size(); i++) {
            grc grcVar = (grc) this.a.get(i);
            grcVar.zzc();
            grcVar.zzf();
        }
        this.c = new ByteBuffer[0];
        cpc cpcVar = cpc.e;
        this.d = cpcVar;
        this.e = cpcVar;
        this.f = false;
    }

    public final boolean g() {
        return this.f && ((grc) this.b.get(i())).zzh() && !this.c[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.b.isEmpty();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
