package defpackage;

import java.util.Comparator;
import java.util.function.Function;

/* loaded from: classes5.dex */
final class zn extends lh3 implements hv {
    private static final Comparator c = Comparator.comparing(new Function() { // from class: yn
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((dv) obj).getKey();
        }
    });
    static final hv d = hv.b().build();

    private zn(Object[] objArr, Comparator comparator) {
        super(objArr, comparator);
    }

    static hv n(Object... objArr) {
        for (int i = 0; i < objArr.length; i += 2) {
            dv dvVar = (dv) objArr[i];
            if (dvVar != null && dvVar.getKey().isEmpty()) {
                objArr[i] = null;
            }
        }
        return new zn(objArr, c);
    }

    @Override // defpackage.hv
    public Object h(dv dvVar) {
        return super.i(dvVar);
    }

    zn(Object[] objArr) {
        super(objArr);
    }
}
