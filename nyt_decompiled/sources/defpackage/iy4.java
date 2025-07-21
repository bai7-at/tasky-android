package defpackage;

import defpackage.cv3;
import java.util.Map;

/* loaded from: classes.dex */
final class iy4 extends pe4 implements Map.Entry, cv3.a {
    private final rr5 c;
    private Object d;

    public iy4(rr5 rr5Var, Object obj, Object obj2) {
        super(obj, obj2);
        this.c = rr5Var;
        this.d = obj2;
    }

    public void a(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.pe4, java.util.Map.Entry
    public Object getValue() {
        return this.d;
    }

    @Override // defpackage.pe4, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        a(obj);
        this.c.d(getKey(), obj);
        return value;
    }
}
