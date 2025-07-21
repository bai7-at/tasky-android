package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class p13 extends sw3 {
    private final n13 i;

    public p13(List list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            n13 n13Var = (n13) ((rw3) list.get(i2)).b;
            if (n13Var != null) {
                i = Math.max(i, n13Var.f());
            }
        }
        this.i = new n13(new float[i], new int[i]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.p50
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public n13 i(rw3 rw3Var, float f) {
        this.i.g((n13) rw3Var.b, (n13) rw3Var.c, f);
        return this.i;
    }
}
