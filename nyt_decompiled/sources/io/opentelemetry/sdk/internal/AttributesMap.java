package io.opentelemetry.sdk.internal;

import defpackage.dv;
import defpackage.gv;
import defpackage.hv;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes5.dex */
public final class AttributesMap extends HashMap<dv, Object> implements hv {
    private static final long serialVersionUID = -5072696312123632376L;
    private final long capacity;
    private final int lengthLimit;
    private int totalAddedValues = 0;

    private AttributesMap(long j, int i) {
        this.capacity = j;
        this.lengthLimit = i;
    }

    public static AttributesMap a(long j, int i) {
        return new AttributesMap(j, i);
    }

    @Override // defpackage.hv
    public Map c() {
        return Collections.unmodifiableMap(this);
    }

    @Override // java.util.HashMap, java.util.Map, defpackage.hv
    public void forEach(BiConsumer biConsumer) {
        super.forEach(biConsumer);
    }

    @Override // defpackage.hv
    public Object h(dv dvVar) {
        return super.get(dvVar);
    }

    public int i() {
        return this.totalAddedValues;
    }

    public hv l() {
        return hv.b().a(this).build();
    }

    public void m(dv dvVar, Object obj) {
        this.totalAddedValues++;
        if (size() < this.capacity || containsKey(dvVar)) {
            super.put(dvVar, gv.d(obj, this.lengthLimit));
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return "AttributesMap{data=" + super.toString() + ", capacity=" + this.capacity + ", totalAddedValues=" + this.totalAddedValues + '}';
    }
}
