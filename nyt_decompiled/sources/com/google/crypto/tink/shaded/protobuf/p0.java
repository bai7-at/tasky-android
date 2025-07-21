package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
final class p0 implements d0 {
    private final f0 a;
    private final String b;
    private final Object[] c;
    private final int d;

    p0(f0 f0Var, String str, Object[] objArr) {
        this.a = f0Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public f0 b() {
        return this.a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public ProtoSyntax c() {
        return (this.d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    Object[] d() {
        return this.c;
    }

    String e() {
        return this.b;
    }
}
