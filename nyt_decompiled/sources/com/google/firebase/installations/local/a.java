package com.google.firebase.installations.local;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.b;

/* loaded from: classes3.dex */
final class a extends com.google.firebase.installations.local.b {
    private final String b;
    private final PersistedInstallation.RegistrationStatus c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;

    static final class b extends b.a {
        private String a;
        private PersistedInstallation.RegistrationStatus b;
        private String c;
        private String d;
        private Long e;
        private Long f;
        private String g;

        @Override // com.google.firebase.installations.local.b.a
        public com.google.firebase.installations.local.b a() {
            String str = "";
            if (this.b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.local.b.a
        public b.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.b.a
        public b.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.b.a
        public b.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.b.a
        public b.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.b.a
        public b.a f(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.b.a
        public b.a g(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.b.a
        public b.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        b() {
        }

        private b(com.google.firebase.installations.local.b bVar) {
            this.a = bVar.d();
            this.b = bVar.g();
            this.c = bVar.b();
            this.d = bVar.f();
            this.e = Long.valueOf(bVar.c());
            this.f = Long.valueOf(bVar.h());
            this.g = bVar.e();
        }
    }

    @Override // com.google.firebase.installations.local.b
    public String b() {
        return this.d;
    }

    @Override // com.google.firebase.installations.local.b
    public long c() {
        return this.f;
    }

    @Override // com.google.firebase.installations.local.b
    public String d() {
        return this.b;
    }

    @Override // com.google.firebase.installations.local.b
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.installations.local.b)) {
            return false;
        }
        com.google.firebase.installations.local.b bVar = (com.google.firebase.installations.local.b) obj;
        String str3 = this.b;
        if (str3 != null ? str3.equals(bVar.d()) : bVar.d() == null) {
            if (this.c.equals(bVar.g()) && ((str = this.d) != null ? str.equals(bVar.b()) : bVar.b() == null) && ((str2 = this.e) != null ? str2.equals(bVar.f()) : bVar.f() == null) && this.f == bVar.c() && this.g == bVar.h()) {
                String str4 = this.h;
                if (str4 == null) {
                    if (bVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(bVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.b
    public String f() {
        return this.e;
    }

    @Override // com.google.firebase.installations.local.b
    public PersistedInstallation.RegistrationStatus g() {
        return this.c;
    }

    @Override // com.google.firebase.installations.local.b
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.b
    public b.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }

    private a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = registrationStatus;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }
}
