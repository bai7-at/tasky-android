package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class l0 {
    private static final j0 a = c();
    private static final j0 b = new k0();

    static j0 a() {
        return a;
    }

    static j0 b() {
        return b;
    }

    private static j0 c() {
        try {
            return (j0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
