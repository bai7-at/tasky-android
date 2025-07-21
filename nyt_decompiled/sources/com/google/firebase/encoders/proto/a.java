package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes3.dex */
public final class a {
    private int a;
    private Protobuf.IntEncoding b = Protobuf.IntEncoding.DEFAULT;

    /* renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    private static final class C0215a implements Protobuf {
        private final int a;
        private final Protobuf.IntEncoding b;

        C0215a(int i, Protobuf.IntEncoding intEncoding) {
            this.a = i;
            this.b = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.a == protobuf.tag() && this.b.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding intEncoding() {
            return this.b;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public Protobuf a() {
        return new C0215a(this.a, this.b);
    }

    public a c(int i) {
        this.a = i;
        return this;
    }
}
