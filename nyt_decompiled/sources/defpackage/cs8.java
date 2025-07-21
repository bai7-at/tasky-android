package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
final class cs8 implements bs8 {
    private final Set a;
    private final as8 b;
    private final fs8 c;

    cs8(Set set, as8 as8Var, fs8 fs8Var) {
        this.a = set;
        this.b = as8Var;
        this.c = fs8Var;
    }

    @Override // defpackage.bs8
    public yr8 a(String str, Class cls, f12 f12Var, br8 br8Var) {
        if (this.a.contains(f12Var)) {
            return new es8(this.b, str, f12Var, br8Var, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", f12Var, this.a));
    }
}
