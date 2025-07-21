package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.p6;
import defpackage.b0g;
import defpackage.b1g;
import defpackage.buf;
import defpackage.cza;
import defpackage.d3g;
import defpackage.e8f;
import defpackage.f6f;
import defpackage.frb;
import defpackage.fyf;
import defpackage.g8f;
import defpackage.glb;
import defpackage.grc;
import defpackage.hye;
import defpackage.k6g;
import defpackage.kff;
import defpackage.kye;
import defpackage.l6a;
import defpackage.lvf;
import defpackage.lxf;
import defpackage.mib;
import defpackage.mpa;
import defpackage.mrf;
import defpackage.myf;
import defpackage.mzf;
import defpackage.n9f;
import defpackage.nib;
import defpackage.npf;
import defpackage.pla;
import defpackage.pt9;
import defpackage.pzc;
import defpackage.q2f;
import defpackage.r5f;
import defpackage.s1g;
import defpackage.tgf;
import defpackage.u1f;
import defpackage.vgf;
import defpackage.vib;
import defpackage.vzf;
import defpackage.wba;
import defpackage.wff;
import defpackage.wib;
import defpackage.wmc;
import defpackage.wxf;
import defpackage.xgf;
import defpackage.xvf;
import defpackage.yfe;
import defpackage.z4g;
import defpackage.zpb;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class p6 extends nib implements f6f, xgf {
    public static final /* synthetic */ int H = 0;
    private final Context c;
    private final h6 d;
    private final k6g e;
    private final vib f;
    private final WeakReference g;
    private final s1g h;
    private n9f i;
    private ByteBuffer j;
    private boolean k;
    private mib l;
    private int m;
    private int n;
    private long r;
    private final String s;
    private final int t;
    private Integer w;
    private final ArrayList x;
    private volatile j6 y;
    private final Object u = new Object();
    private final Set B = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.Q1)).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r5.m == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        r6 = new com.google.android.gms.internal.ads.k6(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        if (r5.j == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        r5 = new com.google.android.gms.internal.ads.n6(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        r4 = r3.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        if (r4.limit() <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
    
        r4 = new byte[r3.j.limit()];
        r3.j.get(r4);
        r5 = new defpackage.elb(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r5.i <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        r6 = new com.google.android.gms.internal.ads.l6(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        r6 = new com.google.android.gms.internal.ads.m6(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (r5.j == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p6(android.content.Context r4, defpackage.vib r5, defpackage.wib r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p6.<init>(android.content.Context, vib, wib, java.lang.Integer):void");
    }

    private final boolean d0() {
        return this.y != null && this.y.t();
    }

    @Override // defpackage.nib
    public final void A(int i) {
        this.d.e(i);
    }

    @Override // defpackage.nib
    public final void B(int i) {
        this.d.f(i);
    }

    @Override // defpackage.nib
    public final void C(mib mibVar) {
        this.l = mibVar;
    }

    @Override // defpackage.nib
    public final void D(int i) {
        this.d.g(i);
    }

    @Override // defpackage.nib
    public final void E(int i) {
        this.d.h(i);
    }

    @Override // defpackage.nib
    public final void F(boolean z) {
        this.i.h(z);
    }

    @Override // defpackage.nib
    public final void G(Integer num) {
        this.w = num;
    }

    @Override // defpackage.nib
    public final void H(boolean z) {
        if (this.i == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.i.k();
            if (i >= 2) {
                return;
            }
            k6g k6gVar = this.e;
            z4g c = k6gVar.m().c();
            c.p(i, !z);
            k6gVar.r(c);
            i++;
        }
    }

    @Override // defpackage.nib
    public final void I(int i) {
        Iterator it2 = this.B.iterator();
        while (it2.hasNext()) {
            g6 g6Var = (g6) ((WeakReference) it2.next()).get();
            if (g6Var != null) {
                g6Var.p(i);
            }
        }
    }

    @Override // defpackage.nib
    public final void J(Surface surface, boolean z) {
        n9f n9fVar = this.i;
        if (n9fVar != null) {
            n9fVar.d(surface);
        }
    }

    @Override // defpackage.nib
    public final void K(float f, boolean z) {
        n9f n9fVar = this.i;
        if (n9fVar != null) {
            n9fVar.b(f);
        }
    }

    @Override // defpackage.nib
    public final void L() {
        this.i.c();
    }

    @Override // defpackage.nib
    public final boolean M() {
        return this.i != null;
    }

    @Override // defpackage.nib
    public final int N() {
        return this.n;
    }

    @Override // defpackage.nib
    public final int P() {
        return this.i.zzf();
    }

    @Override // defpackage.nib
    public final long R() {
        return this.i.zzi();
    }

    @Override // defpackage.nib
    public final long S() {
        return this.m;
    }

    @Override // defpackage.nib
    public final long T() {
        if (d0() && this.y.s()) {
            return Math.min(this.m, this.y.n());
        }
        return 0L;
    }

    @Override // defpackage.nib
    public final long U() {
        return this.i.zzk();
    }

    @Override // defpackage.nib
    public final long V() {
        return this.i.zzl();
    }

    final /* synthetic */ kye W(String str, boolean z) {
        p6 p6Var = true != z ? null : this;
        vib vibVar = this.f;
        return new q6(str, p6Var, vibVar.d, vibVar.f, vibVar.n, vibVar.o);
    }

    final /* synthetic */ kye X(String str, boolean z) {
        p6 p6Var = true != z ? null : this;
        vib vibVar = this.f;
        g6 g6Var = new g6(str, p6Var, vibVar.d, vibVar.f, vibVar.i);
        this.B.add(new WeakReference(g6Var));
        return g6Var;
    }

    final /* synthetic */ kye Y(String str, boolean z) {
        q2f q2fVar = new q2f();
        q2fVar.e(str);
        q2fVar.d(true != z ? null : this);
        q2fVar.b(this.f.d);
        q2fVar.c(this.f.f);
        q2fVar.a(true);
        return q2fVar.zza();
    }

    final /* synthetic */ kye Z(hye hyeVar) {
        kye zza = hyeVar.zza();
        glb glbVar = new glb(this);
        return new j6(this.c, zza, this.s, this.t, this, glbVar);
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void a(frb frbVar, vgf vgfVar) {
    }

    final b0g a0(Uri uri) {
        wba wbaVar = new wba();
        wbaVar.b(uri);
        cza c = wbaVar.c();
        s1g s1gVar = this.h;
        s1gVar.a(this.f.g);
        return s1gVar.b(c);
    }

    @Override // defpackage.f6f
    public final void b(kye kyeVar, u1f u1fVar, boolean z) {
    }

    final /* synthetic */ void b0(boolean z, long j) {
        mib mibVar = this.l;
        if (mibVar != null) {
            mibVar.h(z, j);
        }
    }

    @Override // defpackage.xgf
    public final void c(tgf tgfVar, l6a l6aVar, g8f g8fVar) {
        wib wibVar = (wib) this.g.get();
        if (!((Boolean) pla.c().a(mpa.Q1)).booleanValue() || wibVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = l6aVar.k;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = l6aVar.l;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = l6aVar.i;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        wibVar.t("onMetadataEvent", hashMap);
    }

    final /* synthetic */ wff[] c0(Handler handler, pt9 pt9Var, mrf mrfVar, d3g d3gVar, myf myfVar) {
        fyf fyfVar = fyf.a;
        npf npfVar = npf.c;
        grc[] grcVarArr = new grc[0];
        buf bufVar = new buf();
        if (npfVar == null && npfVar == null) {
            throw new NullPointerException("Both parameters are null");
        }
        Context context = this.c;
        bufVar.c(npfVar);
        bufVar.d(grcVarArr);
        lvf e = bufVar.e();
        lxf lxfVar = lxf.a;
        return new wff[]{new xvf(context, lxfVar, fyfVar, false, handler, mrfVar, e), new b(this.c, lxfVar, fyfVar, 0L, false, handler, pt9Var, -1, 30.0f)};
    }

    @Override // defpackage.xgf
    public final void d(tgf tgfVar, int i, long j) {
        this.n += i;
    }

    @Override // defpackage.f6f
    public final void e(kye kyeVar, u1f u1fVar, boolean z) {
        if (kyeVar instanceof r5f) {
            synchronized (this.u) {
                this.x.add((r5f) kyeVar);
            }
        } else if (kyeVar instanceof j6) {
            this.y = (j6) kyeVar;
            final wib wibVar = (wib) this.g.get();
            if (((Boolean) pla.c().a(mpa.Q1)).booleanValue() && wibVar != null && this.y.q()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.y.s()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.y.r()));
                wxf.l.post(new Runnable() { // from class: flb
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = p6.H;
                        wib.this.t("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // defpackage.f6f
    public final void f(kye kyeVar, u1f u1fVar, boolean z) {
    }

    public final void finalize() {
        nib.u().decrementAndGet();
        if (pzc.m()) {
            pzc.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // defpackage.xgf
    public final void g(tgf tgfVar, int i) {
        mib mibVar = this.l;
        if (mibVar != null) {
            mibVar.c(i);
        }
    }

    @Override // defpackage.xgf
    public final void h(tgf tgfVar, zzce zzceVar) {
        mib mibVar = this.l;
        if (mibVar != null) {
            mibVar.j("onPlayerError", zzceVar);
        }
    }

    @Override // defpackage.f6f
    public final void i(kye kyeVar, u1f u1fVar, boolean z, int i) {
        this.m += i;
    }

    @Override // defpackage.xgf
    public final void j(tgf tgfVar, Object obj, long j) {
        mib mibVar = this.l;
        if (mibVar != null) {
            mibVar.a();
        }
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void k(tgf tgfVar, int i, long j, long j2) {
    }

    @Override // defpackage.xgf
    public final void l(tgf tgfVar, mzf mzfVar, vzf vzfVar, IOException iOException, boolean z) {
        mib mibVar = this.l;
        if (mibVar != null) {
            if (this.f.k) {
                mibVar.g("onLoadException", iOException);
            } else {
                mibVar.j("onLoadError", iOException);
            }
        }
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void m(tgf tgfVar, zpb zpbVar, zpb zpbVar2, int i) {
    }

    @Override // defpackage.xgf
    public final void n(tgf tgfVar, wmc wmcVar) {
        mib mibVar = this.l;
        if (mibVar != null) {
            mibVar.d(wmcVar.a, wmcVar.b);
        }
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void o(tgf tgfVar, e8f e8fVar) {
    }

    @Override // defpackage.xgf
    public final void p(tgf tgfVar, l6a l6aVar, g8f g8fVar) {
        wib wibVar = (wib) this.g.get();
        if (!((Boolean) pla.c().a(mpa.Q1)).booleanValue() || wibVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(l6aVar.s));
        hashMap.put("bitRate", String.valueOf(l6aVar.h));
        hashMap.put("resolution", l6aVar.q + QueryKeys.SCROLL_POSITION_TOP + l6aVar.r);
        String str = l6aVar.k;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = l6aVar.l;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = l6aVar.i;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        wibVar.t("onMetadataEvent", hashMap);
    }

    @Override // defpackage.xgf
    public final /* synthetic */ void q(tgf tgfVar, vzf vzfVar) {
    }

    @Override // defpackage.nib
    public final long r() {
        if (d0()) {
            return 0L;
        }
        return this.m;
    }

    @Override // defpackage.nib
    public final long s() {
        if (d0()) {
            return this.y.o();
        }
        synchronized (this.u) {
            while (!this.x.isEmpty()) {
                long j = this.r;
                Map zze = ((r5f) this.x.remove(0)).zze();
                long j2 = 0;
                if (zze != null) {
                    Iterator it2 = zze.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && yfe.c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.r = j + j2;
            }
        }
        return this.r;
    }

    @Override // defpackage.nib
    public final Integer t() {
        return this.w;
    }

    @Override // defpackage.nib
    public final void w(Uri[] uriArr, String str) {
        x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // defpackage.nib
    public final void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        b0g b1gVar;
        if (this.i != null) {
            this.j = byteBuffer;
            this.k = z;
            int length = uriArr.length;
            if (length == 1) {
                b1gVar = a0(uriArr[0]);
            } else {
                b0g[] b0gVarArr = new b0g[length];
                for (int i = 0; i < uriArr.length; i++) {
                    b0gVarArr[i] = a0(uriArr[i]);
                }
                b1gVar = new b1g(false, false, b0gVarArr);
            }
            this.i.g(b1gVar);
            this.i.zzp();
            nib.v().incrementAndGet();
        }
    }

    @Override // defpackage.nib
    public final void y() {
        n9f n9fVar = this.i;
        if (n9fVar != null) {
            n9fVar.f(this);
            this.i.zzq();
            this.i = null;
            nib.v().decrementAndGet();
        }
    }

    @Override // defpackage.nib
    public final void z(long j) {
        kff kffVar = (kff) this.i;
        kffVar.j(kffVar.zzd(), j, 5, false);
    }
}
