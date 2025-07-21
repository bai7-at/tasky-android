package defpackage;

import io.opentelemetry.sdk.metrics.InstrumentType;

/* loaded from: classes5.dex */
final class t10 extends fm3 {
    private final InstrumentType a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    t10(InstrumentType instrumentType, String str, String str2, String str3, String str4, String str5) {
        this.a = instrumentType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.fm3
    public String c() {
        return this.b;
    }

    @Override // defpackage.fm3
    public InstrumentType d() {
        return this.a;
    }

    @Override // defpackage.fm3
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fm3)) {
            return false;
        }
        fm3 fm3Var = (fm3) obj;
        InstrumentType instrumentType = this.a;
        if (instrumentType != null ? instrumentType.equals(fm3Var.d()) : fm3Var.d() == null) {
            String str = this.b;
            if (str != null ? str.equals(fm3Var.c()) : fm3Var.c() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(fm3Var.e()) : fm3Var.e() == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(fm3Var.f()) : fm3Var.f() == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(fm3Var.h()) : fm3Var.h() == null) {
                            String str5 = this.f;
                            if (str5 == null) {
                                if (fm3Var.g() == null) {
                                    return true;
                                }
                            } else if (str5.equals(fm3Var.g())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fm3
    public String f() {
        return this.d;
    }

    @Override // defpackage.fm3
    public String g() {
        return this.f;
    }

    @Override // defpackage.fm3
    public String h() {
        return this.e;
    }

    public int hashCode() {
        InstrumentType instrumentType = this.a;
        int hashCode = ((instrumentType == null ? 0 : instrumentType.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        return hashCode5 ^ (str5 != null ? str5.hashCode() : 0);
    }
}
