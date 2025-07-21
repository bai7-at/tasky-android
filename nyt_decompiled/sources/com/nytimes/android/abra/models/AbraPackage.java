package com.nytimes.android.abra.models;

import com.nytimes.android.abra.utilities.JsonExtensionsKt;
import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AbraPackage {
    private final long expirationMS;
    private final String jsCode;
    private final qs2 nowTSProvider;
    private final String rules;
    private final c04 rulesVersion$delegate;
    private final long timestamp;

    public AbraPackage(String str, String str2, long j, long j2, qs2 qs2Var) {
        zq3.h(str, "rules");
        zq3.h(str2, "jsCode");
        zq3.h(qs2Var, "nowTSProvider");
        this.rules = str;
        this.jsCode = str2;
        this.timestamp = j;
        this.expirationMS = j2;
        this.nowTSProvider = qs2Var;
        this.rulesVersion$delegate = c.a(new qs2() { // from class: com.nytimes.android.abra.models.AbraPackage$rulesVersion$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                return Integer.valueOf(JsonExtensionsKt.getAbraVersion(AbraPackage.this.getRules()));
            }
        });
    }

    public static /* synthetic */ AbraPackage copy$default(AbraPackage abraPackage, String str, String str2, long j, long j2, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abraPackage.rules;
        }
        if ((i & 2) != 0) {
            str2 = abraPackage.jsCode;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = abraPackage.timestamp;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = abraPackage.expirationMS;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            qs2Var = abraPackage.nowTSProvider;
        }
        return abraPackage.copy(str, str3, j3, j4, qs2Var);
    }

    public final String component1() {
        return this.rules;
    }

    public final String component2() {
        return this.jsCode;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final long component4() {
        return this.expirationMS;
    }

    public final qs2 component5() {
        return this.nowTSProvider;
    }

    public final AbraPackage copy(String str, String str2, long j, long j2, qs2 qs2Var) {
        zq3.h(str, "rules");
        zq3.h(str2, "jsCode");
        zq3.h(qs2Var, "nowTSProvider");
        return new AbraPackage(str, str2, j, j2, qs2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbraPackage)) {
            return false;
        }
        AbraPackage abraPackage = (AbraPackage) obj;
        return zq3.c(this.rules, abraPackage.rules) && zq3.c(this.jsCode, abraPackage.jsCode) && this.timestamp == abraPackage.timestamp && this.expirationMS == abraPackage.expirationMS && zq3.c(this.nowTSProvider, abraPackage.nowTSProvider);
    }

    public final long getExpirationMS() {
        return this.expirationMS;
    }

    public final boolean getExpired() {
        return ((Number) this.nowTSProvider.mo865invoke()).longValue() - this.timestamp > this.expirationMS;
    }

    public final String getJsCode() {
        return this.jsCode;
    }

    public final qs2 getNowTSProvider() {
        return this.nowTSProvider;
    }

    public final String getRules() {
        return this.rules;
    }

    public final int getRulesVersion() {
        return ((Number) this.rulesVersion$delegate.getValue()).intValue();
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((this.rules.hashCode() * 31) + this.jsCode.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Long.hashCode(this.expirationMS)) * 31) + this.nowTSProvider.hashCode();
    }

    public String toString() {
        return "AbraPackage(rules=" + this.rules + ", jsCode=" + this.jsCode + ", timestamp=" + this.timestamp + ", expirationMS=" + this.expirationMS + ", nowTSProvider=" + this.nowTSProvider + ")";
    }

    public /* synthetic */ AbraPackage(String str, String str2, long j, long j2, qs2 qs2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? 3600000L : j2, (i & 16) != 0 ? new qs2() { // from class: com.nytimes.android.abra.models.AbraPackage.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Long mo865invoke() {
                return Long.valueOf(System.currentTimeMillis());
            }
        } : qs2Var);
    }
}
