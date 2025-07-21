package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.f0;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class a implements f0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0213a implements f0.a {
        protected static UninitializedMessageException k(f0 f0Var) {
            return new UninitializedMessageException(f0Var);
        }

        protected abstract AbstractC0213a h(a aVar);

        @Override // com.google.crypto.tink.shaded.protobuf.f0.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public AbstractC0213a X0(f0 f0Var) {
            if (d().getClass().isInstance(f0Var)) {
                return h((a) f0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String k(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public ByteString e() {
        try {
            ByteString.g t = ByteString.t(b());
            g(t.b());
            return t.a();
        } catch (IOException e) {
            throw new RuntimeException(this.k("ByteString"), e);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public byte[] f() {
        try {
            byte[] bArr = new byte[b()];
            CodedOutputStream U = CodedOutputStream.U(bArr);
            g(U);
            U.c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(k("byte array"), e);
        }
    }

    abstract int h();

    int i(r0 r0Var) {
        int h = h();
        if (h != -1) {
            return h;
        }
        int d = r0Var.d(this);
        m(d);
        return d;
    }

    UninitializedMessageException l() {
        return new UninitializedMessageException(this);
    }

    abstract void m(int i);
}
