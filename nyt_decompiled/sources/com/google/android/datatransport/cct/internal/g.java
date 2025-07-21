package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.k;
import java.util.List;

/* loaded from: classes2.dex */
final class g extends k {
    private final long a;
    private final long b;
    private final ClientInfo c;
    private final Integer d;
    private final String e;
    private final List f;
    private final QosTier g;

    static final class b extends k.a {
        private Long a;
        private Long b;
        private ClientInfo c;
        private Integer d;
        private String e;
        private List f;
        private QosTier g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a b(ClientInfo clientInfo) {
            this.c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a c(List list) {
            this.f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        k.a d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        k.a e(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a f(QosTier qosTier) {
            this.g = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public k.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public ClientInfo b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public List c() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public Integer d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a == kVar.g() && this.b == kVar.h() && ((clientInfo = this.c) != null ? clientInfo.equals(kVar.b()) : kVar.b() == null) && ((num = this.d) != null ? num.equals(kVar.d()) : kVar.d() == null) && ((str = this.e) != null ? str.equals(kVar.e()) : kVar.e() == null) && ((list = this.f) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
            QosTier qosTier = this.g;
            if (qosTier == null) {
                if (kVar.f() == null) {
                    return true;
                }
            } else if (qosTier.equals(kVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public QosTier f() {
        return this.g;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public long g() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.c;
        int hashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.g;
        return hashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }

    private g(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.a = j;
        this.b = j2;
        this.c = clientInfo;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = qosTier;
    }
}
