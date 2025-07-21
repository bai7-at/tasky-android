package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.u;

/* loaded from: classes3.dex */
public enum OutputPrefixType implements u.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final u.b internalValueMap = new u.b() { // from class: com.google.crypto.tink.proto.OutputPrefixType.a
    };
    private final int value;

    private static final class b implements u.c {
        static final u.c a = new b();

        private b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.c
        public boolean a(int i) {
            return OutputPrefixType.forNumber(i) != null;
        }
    }

    OutputPrefixType(int i) {
        this.value = i;
    }

    public static OutputPrefixType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
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
    public static OutputPrefixType valueOf(int i) {
        return forNumber(i);
    }
}
