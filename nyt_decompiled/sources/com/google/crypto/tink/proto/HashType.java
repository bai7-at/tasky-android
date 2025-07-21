package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.u;

/* loaded from: classes3.dex */
public enum HashType implements u.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final u.b internalValueMap = new u.b() { // from class: com.google.crypto.tink.proto.HashType.a
    };
    private final int value;

    private static final class b implements u.c {
        static final u.c a = new b();

        private b() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.c
        public boolean a(int i) {
            return HashType.forNumber(i) != null;
        }
    }

    HashType(int i) {
        this.value = i;
    }

    public static HashType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
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
    public static HashType valueOf(int i) {
        return forNumber(i);
    }
}
