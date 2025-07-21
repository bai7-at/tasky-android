package androidx.datastore.core;

/* loaded from: classes.dex */
final class a extends d {
    private final Object a;
    private final int b;

    public a(Object obj, int i) {
        super(null);
        this.a = obj;
        this.b = i;
    }

    public final void a() {
        Object obj = this.a;
        if (!((obj != null ? obj.hashCode() : 0) == this.b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object b() {
        return this.a;
    }
}
