package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.u;

/* loaded from: classes3.dex */
public enum KeyStatusType implements u.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final u.b internalValueMap = new u.b() { // from class: com.google.crypto.tink.proto.KeyStatusType.a
    };
    private final int value;

    private static final class b implements u.c {
        static final u.c a = new b();

        private b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.c
        public boolean a(int i) {
            return KeyStatusType.forNumber(i) != null;
        }
    }

    KeyStatusType(int i) {
        this.value = i;
    }

    public static KeyStatusType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static u.b internalGetValueMap() {
        return internalValueMap;
    }

    public static u.c internalGetVerifier() {
        return b.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static KeyStatusType valueOf(int i) {
        return forNumber(i);
    }
}
