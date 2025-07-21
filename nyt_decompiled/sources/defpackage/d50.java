package defpackage;

import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class d50 implements a {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private b d;

    protected d50(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public final void i(sq8 sq8Var) {
        ur.e(sq8Var);
        if (this.b.contains(sq8Var)) {
            return;
        }
        this.b.add(sq8Var);
        this.c++;
    }

    protected final void s(int i) {
        b bVar = (b) z19.j(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            ((sq8) this.b.get(i2)).e(this, bVar, this.a, i);
        }
    }

    protected final void t() {
        b bVar = (b) z19.j(this.d);
        for (int i = 0; i < this.c; i++) {
            ((sq8) this.b.get(i)).b(this, bVar, this.a);
        }
        this.d = null;
    }

    protected final void u(b bVar) {
        for (int i = 0; i < this.c; i++) {
            ((sq8) this.b.get(i)).i(this, bVar, this.a);
        }
    }

    protected final void v(b bVar) {
        this.d = bVar;
        for (int i = 0; i < this.c; i++) {
            ((sq8) this.b.get(i)).g(this, bVar, this.a);
        }
    }
}
