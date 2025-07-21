package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.d;
import com.google.android.exoplayer2.w0;
import com.google.common.primitives.Ints;
import defpackage.fw1;
import defpackage.gx8;
import defpackage.ur;
import defpackage.z19;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g implements fw1 {
    private final Object a = new Object();
    private w0.f b;
    private i c;
    private a.InterfaceC0194a d;
    private String e;

    private i b(w0.f fVar) {
        a.InterfaceC0194a interfaceC0194a = this.d;
        if (interfaceC0194a == null) {
            interfaceC0194a = new d.b().c(this.e);
        }
        Uri uri = fVar.c;
        o oVar = new o(uri == null ? null : uri.toString(), fVar.h, interfaceC0194a);
        gx8 it2 = fVar.e.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            oVar.e((String) entry.getKey(), (String) entry.getValue());
        }
        DefaultDrmSessionManager a = new DefaultDrmSessionManager.b().e(fVar.a, n.d).b(fVar.f).c(fVar.g).d(Ints.l(fVar.j)).a(oVar);
        a.E(0, fVar.f());
        return a;
    }

    @Override // defpackage.fw1
    public i a(w0 w0Var) {
        i iVar;
        ur.e(w0Var.b);
        w0.f fVar = w0Var.b.c;
        if (fVar == null || z19.a < 18) {
            return i.a;
        }
        synchronized (this.a) {
            try {
                if (!z19.c(fVar, this.b)) {
                    this.b = fVar;
                    this.c = b(fVar);
                }
                iVar = (i) ur.e(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }
}
