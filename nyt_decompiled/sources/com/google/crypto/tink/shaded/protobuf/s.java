package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
class s implements e0 {
    private static final s a = new s();

    private s() {
    }

    public static s c() {
        return a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public d0 a(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (d0) GeneratedMessageLite.u(cls.asSubclass(GeneratedMessageLite.class)).n();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
