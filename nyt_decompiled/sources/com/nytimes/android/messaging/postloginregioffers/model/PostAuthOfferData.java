package com.nytimes.android.messaging.postloginregioffers.model;

import androidx.annotation.Keep;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
@Keep
/* loaded from: classes4.dex */
public final class PostAuthOfferData {
    public static final int $stable = 8;
    private final PostRegiLoginOfferConfig allAccess;

    public PostAuthOfferData(@bt3(name = "all_access") PostRegiLoginOfferConfig postRegiLoginOfferConfig) {
        zq3.h(postRegiLoginOfferConfig, "allAccess");
        this.allAccess = postRegiLoginOfferConfig;
    }

    public static /* synthetic */ PostAuthOfferData copy$default(PostAuthOfferData postAuthOfferData, PostRegiLoginOfferConfig postRegiLoginOfferConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            postRegiLoginOfferConfig = postAuthOfferData.allAccess;
        }
        return postAuthOfferData.copy(postRegiLoginOfferConfig);
    }

    public final PostRegiLoginOfferConfig component1() {
        return this.allAccess;
    }

    public final PostAuthOfferData copy(@bt3(name = "all_access") PostRegiLoginOfferConfig postRegiLoginOfferConfig) {
        zq3.h(postRegiLoginOfferConfig, "allAccess");
        return new PostAuthOfferData(postRegiLoginOfferConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostAuthOfferData) && zq3.c(this.allAccess, ((PostAuthOfferData) obj).allAccess);
    }

    public final PostRegiLoginOfferConfig getAllAccess() {
        return this.allAccess;
    }

    public int hashCode() {
        return this.allAccess.hashCode();
    }

    public String toString() {
        return "PostAuthOfferData(allAccess=" + this.allAccess + ")";
    }
}
