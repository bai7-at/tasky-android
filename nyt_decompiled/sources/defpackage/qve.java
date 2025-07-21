package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class qve implements kye {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private u1f d;

    protected qve(boolean z) {
        this.a = z;
    }

    @Override // defpackage.kye
    public final void h(f6f f6fVar) {
        f6fVar.getClass();
        if (this.b.contains(f6fVar)) {
            return;
        }
        this.b.add(f6fVar);
        this.c++;
    }

    protected final void k() {
        u1f u1fVar = this.d;
        int i = khe.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((f6f) this.b.get(i2)).b(this, u1fVar, this.a);
        }
        this.d = null;
    }

    protected final void l(u1f u1fVar) {
        for (int i = 0; i < this.c; i++) {
            ((f6f) this.b.get(i)).f(this, u1fVar, this.a);
        }
    }

    protected final void m(u1f u1fVar) {
        this.d = u1fVar;
        for (int i = 0; i < this.c; i++) {
            ((f6f) this.b.get(i)).e(this, u1fVar, this.a);
        }
    }

    @Override // defpackage.kye
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    protected final void zzg(int i) {
        u1f u1fVar = this.d;
        int i2 = khe.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((f6f) this.b.get(i3)).i(this, u1fVar, this.a, i);
        }
    }
}
