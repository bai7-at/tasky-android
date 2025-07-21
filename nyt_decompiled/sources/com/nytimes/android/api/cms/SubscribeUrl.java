package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class SubscribeUrl {

    /* renamed from: type, reason: collision with root package name */
    private final String f56type;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribeUrl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SubscribeUrl copy$default(SubscribeUrl subscribeUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscribeUrl.f56type;
        }
        if ((i & 2) != 0) {
            str2 = subscribeUrl.url;
        }
        return subscribeUrl.copy(str, str2);
    }

    public final String component1() {
        return this.f56type;
    }

    public final String component2() {
        return this.url;
    }

    public final SubscribeUrl copy(String str, String str2) {
        return new SubscribeUrl(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeUrl)) {
            return false;
        }
        SubscribeUrl subscribeUrl = (SubscribeUrl) obj;
        return zq3.c(this.f56type, subscribeUrl.f56type) && zq3.c(this.url, subscribeUrl.url);
    }

    public final String getType() {
        return this.f56type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.f56type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SubscribeUrl(type=" + this.f56type + ", url=" + this.url + ")";
    }

    public SubscribeUrl(String str, String str2) {
        this.f56type = str;
        this.url = str2;
    }

    public /* synthetic */ SubscribeUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
