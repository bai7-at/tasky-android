package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Attribute {
    private final String data;
    private final String key;

    /* JADX WARN: Multi-variable type inference failed */
    public Attribute() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attribute.key;
        }
        if ((i & 2) != 0) {
            str2 = attribute.data;
        }
        return attribute.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.data;
    }

    public final Attribute copy(@bt3(name = "key") String str, @bt3(name = "value") String str2) {
        return new Attribute(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        return zq3.c(this.key, attribute.key) && zq3.c(this.data, attribute.data);
    }

    public final String getData() {
        return this.data;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.data;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Attribute(key=" + this.key + ", data=" + this.data + ")";
    }

    public Attribute(@bt3(name = "key") String str, @bt3(name = "value") String str2) {
        this.key = str;
        this.data = str2;
    }

    public /* synthetic */ Attribute(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
