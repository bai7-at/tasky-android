package defpackage;

/* loaded from: classes2.dex */
public final class xe4 implements pk7 {
    private final h42 a;
    private final pk7 b;

    public xe4(h42 h42Var, pk7 pk7Var) {
        zq3.h(h42Var, "eventMapper");
        zq3.h(pk7Var, "serializer");
        this.a = h42Var;
        this.b = pk7Var;
    }

    @Override // defpackage.pk7
    public String serialize(Object obj) {
        zq3.h(obj, "model");
        Object b = this.a.b(obj);
        if (b == null) {
            return null;
        }
        return this.b.serialize(b);
    }
}
