package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class AppContext {

    @SerializedName("url_scheme")
    private final String urlScheme;
    private final String version;

    public AppContext(String str, String str2) {
        this.urlScheme = str;
        this.version = str2;
    }

    public static /* synthetic */ AppContext copy$default(AppContext appContext, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appContext.urlScheme;
        }
        if ((i & 2) != 0) {
            str2 = appContext.version;
        }
        return appContext.copy(str, str2);
    }

    public final String component1() {
        return this.urlScheme;
    }

    public final String component2() {
        return this.version;
    }

    public final AppContext copy(String str, String str2) {
        return new AppContext(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppContext)) {
            return false;
        }
        AppContext appContext = (AppContext) obj;
        return zq3.c(this.urlScheme, appContext.urlScheme) && zq3.c(this.version, appContext.version);
    }

    public final String getUrlScheme() {
        return this.urlScheme;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.urlScheme;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.version;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AppContext(urlScheme=" + this.urlScheme + ", version=" + this.version + ')';
    }
}
