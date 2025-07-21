package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public final class yc3 implements ba2 {
    private final mc3 a;
    private final p76 b;

    public yc3(mc3 mc3Var, p76 p76Var) {
        this.a = mc3Var;
        this.b = p76Var;
    }

    public static yc3 a(mc3 mc3Var, p76 p76Var) {
        return new yc3(mc3Var, p76Var);
    }

    public static JsonAdapter c(mc3 mc3Var, i iVar) {
        return (JsonAdapter) g16.e(mc3Var.b(iVar));
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonAdapter get() {
        return c(this.a, (i) this.b.get());
    }
}
