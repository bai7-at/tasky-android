package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public abstract class lsc implements grc {
    protected cpc b;
    protected cpc c;
    private cpc d;
    private cpc e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public lsc() {
        ByteBuffer byteBuffer = grc.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        cpc cpcVar = cpc.e;
        this.d = cpcVar;
        this.e = cpcVar;
        this.b = cpcVar;
        this.c = cpcVar;
    }

    @Override // defpackage.grc
    public final cpc b(cpc cpcVar) {
        this.d = cpcVar;
        this.e = c(cpcVar);
        return zzg() ? this.e : cpc.e;
    }

    protected abstract cpc c(cpc cpcVar);

    protected final ByteBuffer d(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    protected void e() {
    }

    protected void f() {
    }

    protected void g() {
    }

    protected final boolean h() {
        return this.g.hasRemaining();
    }

    @Override // defpackage.grc
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.g;
        this.g = grc.a;
        return byteBuffer;
    }

    @Override // defpackage.grc
    public final void zzc() {
        this.g = grc.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        e();
    }

    @Override // defpackage.grc
    public final void zzd() {
        this.h = true;
        f();
    }

    @Override // defpackage.grc
    public final void zzf() {
        zzc();
        this.f = grc.a;
        cpc cpcVar = cpc.e;
        this.d = cpcVar;
        this.e = cpcVar;
        this.b = cpcVar;
        this.c = cpcVar;
        g();
    }

    @Override // defpackage.grc
    public boolean zzg() {
        return this.e != cpc.e;
    }

    @Override // defpackage.grc
    public boolean zzh() {
        return this.h && this.g == grc.a;
    }
}
