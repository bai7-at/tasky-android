package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
class r implements e0 {
    private static final r a = new r();

    private r() {
    }

    public static r c() {
        return a;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public d0 a(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (d0) GeneratedMessageLite.t(cls.asSubclass(GeneratedMessageLite.class)).m();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
