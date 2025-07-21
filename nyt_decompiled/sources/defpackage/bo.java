package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/* loaded from: classes5.dex */
class bo implements iv {
    private final List a = new ArrayList();

    bo() {
    }

    @Override // defpackage.iv
    public iv a(hv hvVar) {
        if (hvVar == null) {
            return this;
        }
        hvVar.forEach(new BiConsumer() { // from class: ao
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                bo.this.d((dv) obj, obj2);
            }
        });
        return this;
    }

    @Override // defpackage.iv
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public iv d(dv dvVar, Object obj) {
        if (dvVar != null && !dvVar.getKey().isEmpty() && obj != null) {
            this.a.add(dvVar);
            this.a.add(obj);
        }
        return this;
    }

    @Override // defpackage.iv
    public hv build() {
        return (this.a.size() != 2 || this.a.get(0) == null) ? zn.n(this.a.toArray()) : new zn(this.a.toArray());
    }
}
