package defpackage;

import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes5.dex */
public interface hv {
    static iv b() {
        return new bo();
    }

    static hv d() {
        return zn.d;
    }

    static hv f(dv dvVar, Object obj) {
        return (dvVar == null || dvVar.getKey().isEmpty() || obj == null) ? d() : new zn(new Object[]{dvVar, obj});
    }

    Map c();

    void forEach(BiConsumer biConsumer);

    Object h(dv dvVar);

    boolean isEmpty();

    int size();
}
