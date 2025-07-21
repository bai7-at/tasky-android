package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.j;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class f extends j {
    private final long a;
    private final Integer b;
    private final long c;
    private final byte[] d;
    private final String e;
    private final long f;
    private final NetworkConnectionInfo g;

    static final class b extends j.a {
        private Long a;
        private Integer b;
        private Long c;
        private byte[] d;
        private String e;
        private Long f;
        private NetworkConnectionInfo g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.j.a
        public j a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.j.a
        public j.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.j.a
        public j.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.j.a
        public j.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.j.a
        public j.a e(NetworkConnectionInfo networkConnectionInfo) {
            this.g = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.j.a
        j.a f(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.j.a
        j.a g(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.j.a
        public j.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.j
    public Integer b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.j
    public long c() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.j
    public long d() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.j
    public NetworkConnectionInfo e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.a == jVar.c() && ((num = this.b) != null ? num.equals(jVar.b()) : jVar.b() == null) && this.c == jVar.d()) {
            if (Arrays.equals(this.d, jVar instanceof f ? ((f) jVar).d : jVar.f()) && ((str = this.e) != null ? str.equals(jVar.g()) : jVar.g() == null) && this.f == jVar.h()) {
                NetworkConnectionInfo networkConnectionInfo = this.g;
                if (networkConnectionInfo == null) {
                    if (jVar.e() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(jVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.j
    public byte[] f() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.j
    public String g() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.internal.j
    public long h() {
        return this.f;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i2 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.g;
        return i2 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }

    private f(long j, Integer num, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = networkConnectionInfo;
    }
}
