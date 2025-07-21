package defpackage;

import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class xj3 {
    private final List a = new ArrayList();

    public final void a(vu3 vu3Var, ss2 ss2Var) {
        zq3.h(vu3Var, "clazz");
        zq3.h(ss2Var, "initializer");
        this.a.add(new oa9(ou3.a(vu3Var), ss2Var));
    }

    public final t.b b() {
        oa9[] oa9VarArr = (oa9[]) this.a.toArray(new oa9[0]);
        return new wj3((oa9[]) Arrays.copyOf(oa9VarArr, oa9VarArr.length));
    }
}
