package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class o {
    private static final m a = new n();
    private static final m b = c();

    static m a() {
        m mVar = b;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static m b() {
        return a;
    }

    private static m c() {
        try {
            return (m) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
