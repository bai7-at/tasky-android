package io.embrace.android.embracesdk.internal.serialization;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class EmbraceUrlJson {
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public EmbraceUrlJson() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EmbraceUrlJson copy$default(EmbraceUrlJson embraceUrlJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embraceUrlJson.url;
        }
        return embraceUrlJson.copy(str);
    }

    public final String component1() {
        return this.url;
    }

    public final EmbraceUrlJson copy(@bt3(name = "url") String str) {
        return new EmbraceUrlJson(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EmbraceUrlJson) && zq3.c(this.url, ((EmbraceUrlJson) obj).url);
        }
        return true;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EmbraceUrlJson(url=" + this.url + ")";
    }

    public EmbraceUrlJson(@bt3(name = "url") String str) {
        this.url = str;
    }

    public /* synthetic */ EmbraceUrlJson(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
