package defpackage;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public class zo7 extends p50 {
    private final so7 i;
    private final Path j;
    private Path k;
    private Path l;
    private List m;

    public zo7(List list) {
        super(list);
        this.i = new so7();
        this.j = new Path();
    }

    @Override // defpackage.p50
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Path i(rw3 rw3Var, float f) {
        so7 so7Var = (so7) rw3Var.b;
        so7 so7Var2 = (so7) rw3Var.c;
        this.i.c(so7Var, so7Var2 == null ? so7Var : so7Var2, f);
        so7 so7Var3 = this.i;
        List list = this.m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                so7Var3 = ((bp7) this.m.get(size)).c(so7Var3);
            }
        }
        nu4.h(so7Var3, this.j);
        if (this.e == null) {
            return this.j;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        nu4.h(so7Var, this.k);
        if (so7Var2 != null) {
            nu4.h(so7Var2, this.l);
        }
        cd4 cd4Var = this.e;
        float f2 = rw3Var.g;
        float floatValue = rw3Var.h.floatValue();
        Path path = this.k;
        return (Path) cd4Var.b(f2, floatValue, path, so7Var2 == null ? path : this.l, f, e(), f());
    }

    public void r(List list) {
        this.m = list;
    }
}
