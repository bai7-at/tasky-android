package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class ej8 implements dj8 {
    protected final Map a;

    public ej8(Map map) {
        this.a = map;
    }

    @Override // defpackage.dj8, java.lang.Iterable
    public Iterator iterator() {
        return this.a.entrySet().iterator();
    }
}
