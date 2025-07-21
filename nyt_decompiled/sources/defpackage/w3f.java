package defpackage;

/* loaded from: classes3.dex */
public final class w3f implements v3f, l3f {
    private static final w3f b = new w3f(null);
    private final Object a;

    private w3f(Object obj) {
        this.a = obj;
    }

    public static v3f a(Object obj) {
        d4f.a(obj, "instance cannot be null");
        return new w3f(obj);
    }

    public static v3f b(Object obj) {
        return obj == null ? b : new w3f(obj);
    }

    @Override // defpackage.l4f
    public final Object zzb() {
        return this.a;
    }
}
