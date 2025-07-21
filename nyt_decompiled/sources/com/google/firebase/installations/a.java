package com.google.firebase.installations;

import com.google.firebase.installations.f;

/* loaded from: classes3.dex */
final class a extends f {
    private final String a;
    private final long b;
    private final long c;

    static final class b extends f.a {
        private String a;
        private Long b;
        private Long c;

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.a == null) {
                str = " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.b()) && this.b == fVar.d() && this.c == fVar.c();
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }

    private a(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
