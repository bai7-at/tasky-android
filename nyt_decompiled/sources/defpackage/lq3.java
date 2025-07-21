package defpackage;

import io.opentelemetry.api.common.AttributeType;

/* loaded from: classes5.dex */
public final class lq3 implements dv {
    private final AttributeType a;
    private final String b;
    private final int c;

    private lq3(AttributeType attributeType, String str) {
        if (attributeType == null) {
            throw new NullPointerException("Null type");
        }
        this.a = attributeType;
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.b = str;
        this.c = b(attributeType, str);
    }

    private static int b(AttributeType attributeType, String str) {
        return ((attributeType.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static dv c(String str, AttributeType attributeType) {
        if (str == null) {
            str = "";
        }
        return new lq3(attributeType, str);
    }

    public AttributeType d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lq3)) {
            return false;
        }
        lq3 lq3Var = (lq3) obj;
        return this.a.equals(lq3Var.d()) && this.b.equals(lq3Var.getKey());
    }

    @Override // defpackage.dv
    public String getKey() {
        return this.b;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        return this.b;
    }
}
