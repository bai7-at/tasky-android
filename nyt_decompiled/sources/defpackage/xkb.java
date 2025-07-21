package defpackage;

import com.google.android.gms.internal.ads.zzfwz;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class xkb extends mkb implements f6f {
    private String d;
    private final vib e;
    private boolean f;
    private final wkb g;
    private final xjb h;
    private ByteBuffer i;
    private boolean j;
    private final Object k;
    private final String l;
    private final int m;
    private boolean n;

    public xkb(wib wibVar, vib vibVar) {
        super(wibVar);
        this.e = vibVar;
        this.g = new wkb();
        this.h = new xjb();
        this.k = new Object();
        this.l = (String) zzfwz.d(wibVar != null ? wibVar.zzr() : null).b("");
        this.m = wibVar != null ? wibVar.zzf() : 0;
    }

    protected static final String B(String str) {
        return "cache:".concat(String.valueOf(tfb.g(str)));
    }

    private final void a() {
        int a = (int) this.g.a();
        int a2 = (int) this.h.a(this.i);
        int position = this.i.position();
        int round = Math.round(a2 * (position / a));
        int O = nib.O();
        int Q = nib.Q();
        String str = this.d;
        p(str, B(str), position, a, round, a2, round > 0, O, Q);
    }

    public final boolean A() {
        return this.n;
    }

    @Override // defpackage.f6f
    public final void b(kye kyeVar, u1f u1fVar, boolean z) {
    }

    @Override // defpackage.f6f
    public final void e(kye kyeVar, u1f u1fVar, boolean z) {
        if (kyeVar instanceof t4f) {
            this.g.b((t4f) kyeVar);
        }
    }

    @Override // defpackage.f6f
    public final void f(kye kyeVar, u1f u1fVar, boolean z) {
    }

    @Override // defpackage.f6f
    public final void i(kye kyeVar, u1f u1fVar, boolean z, int i) {
    }

    @Override // defpackage.mkb
    public final void l() {
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
    
        r21.n = true;
        o(r22, r4, (int) r21.h.a(r21.i));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:? -> B:52:0x00cf). Please report as a decompilation issue!!! */
    @Override // defpackage.mkb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.v(java.lang.String):boolean");
    }

    public final String y() {
        return this.d;
    }

    public final ByteBuffer z() {
        synchronized (this.k) {
            try {
                ByteBuffer byteBuffer = this.i;
                if (byteBuffer != null && !this.j) {
                    byteBuffer.flip();
                    this.j = true;
                }
                this.f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.i;
    }
}
