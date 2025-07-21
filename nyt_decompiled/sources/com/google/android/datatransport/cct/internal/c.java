package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.a;

/* loaded from: classes2.dex */
final class c extends com.google.android.datatransport.cct.internal.a {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;

    static final class b extends a.AbstractC0174a {
        private Integer a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public com.google.android.datatransport.cct.internal.a a() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a b(String str) {
            this.l = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a c(String str) {
            this.j = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a d(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a e(String str) {
            this.h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a f(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a g(String str) {
            this.i = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a h(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a i(String str) {
            this.k = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a j(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a k(String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a l(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.a.AbstractC0174a
        public a.AbstractC0174a m(Integer num) {
            this.a = num;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String b() {
        return this.l;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String c() {
        return this.j;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.a)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.a aVar = (com.google.android.datatransport.cct.internal.a) obj;
        Integer num = this.a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.l;
                                                    if (str11 == null) {
                                                        if (aVar.b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.b())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String f() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String g() {
        return this.i;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String i() {
        return this.k;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String j() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String k() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public String l() {
        return this.e;
    }

    @Override // com.google.android.datatransport.cct.internal.a
    public Integer m() {
        return this.a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.a + ", model=" + this.b + ", hardware=" + this.c + ", device=" + this.d + ", product=" + this.e + ", osBuild=" + this.f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + ", locale=" + this.i + ", country=" + this.j + ", mccMnc=" + this.k + ", applicationBuild=" + this.l + "}";
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }
}
