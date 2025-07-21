package io.embrace.android.embracesdk.arch.destination;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class SpanAttributeData {
    private final String key;
    private final String value;

    public SpanAttributeData(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ SpanAttributeData copy$default(SpanAttributeData spanAttributeData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spanAttributeData.key;
        }
        if ((i & 2) != 0) {
            str2 = spanAttributeData.value;
        }
        return spanAttributeData.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final SpanAttributeData copy(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        return new SpanAttributeData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanAttributeData)) {
            return false;
        }
        SpanAttributeData spanAttributeData = (SpanAttributeData) obj;
        return zq3.c(this.key, spanAttributeData.key) && zq3.c(this.value, spanAttributeData.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SpanAttributeData(key=" + this.key + ", value=" + this.value + ")";
    }
}
