package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class oa7 extends sw3 {
    private final qa7 i;

    public oa7(List list) {
        super(list);
        this.i = new qa7();
    }

    @Override // defpackage.p50
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public qa7 i(rw3 rw3Var, float f) {
        Object obj;
        qa7 qa7Var;
        Object obj2 = rw3Var.b;
        if (obj2 == null || (obj = rw3Var.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qa7 qa7Var2 = (qa7) obj2;
        qa7 qa7Var3 = (qa7) obj;
        cd4 cd4Var = this.e;
        if (cd4Var != null && (qa7Var = (qa7) cd4Var.b(rw3Var.g, rw3Var.h.floatValue(), qa7Var2, qa7Var3, f, e(), f())) != null) {
            return qa7Var;
        }
        this.i.d(nu4.i(qa7Var2.b(), qa7Var3.b(), f), nu4.i(qa7Var2.c(), qa7Var3.c(), f));
        return this.i;
    }
}
