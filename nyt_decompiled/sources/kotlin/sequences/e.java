package kotlin.sequences;

import defpackage.ak7;
import defpackage.gt2;
import defpackage.zq3;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class e {

    public static final class a implements ak7 {
        final /* synthetic */ gt2 a;

        public a(gt2 gt2Var) {
            this.a = gt2Var;
        }

        @Override // defpackage.ak7
        public Iterator iterator() {
            return d.a(this.a);
        }
    }

    public static Iterator a(gt2 gt2Var) {
        zq3.h(gt2Var, "block");
        c cVar = new c();
        cVar.i(kotlin.coroutines.intrinsics.a.b(gt2Var, cVar, cVar));
        return cVar;
    }

    public static ak7 b(gt2 gt2Var) {
        zq3.h(gt2Var, "block");
        return new a(gt2Var);
    }
}
