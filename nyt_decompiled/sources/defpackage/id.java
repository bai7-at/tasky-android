package defpackage;

/* loaded from: classes.dex */
public interface id {
    static /* synthetic */ void b(id idVar, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        idVar.a(f, f2);
    }

    void a(float f, float f2);
}
