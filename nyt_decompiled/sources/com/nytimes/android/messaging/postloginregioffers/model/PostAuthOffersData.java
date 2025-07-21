package com.nytimes.android.messaging.postloginregioffers.model;

import androidx.annotation.Keep;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
@Keep
/* loaded from: classes4.dex */
public final class PostAuthOffersData {
    public static final int $stable = 8;
    private final PostAuthOfferData plo;
    private final PostAuthOfferData pro;

    public PostAuthOffersData(PostAuthOfferData postAuthOfferData, PostAuthOfferData postAuthOfferData2) {
        zq3.h(postAuthOfferData, "plo");
        zq3.h(postAuthOfferData2, "pro");
        this.plo = postAuthOfferData;
        this.pro = postAuthOfferData2;
    }

    public static /* synthetic */ PostAuthOffersData copy$default(PostAuthOffersData postAuthOffersData, PostAuthOfferData postAuthOfferData, PostAuthOfferData postAuthOfferData2, int i, Object obj) {
        if ((i & 1) != 0) {
            postAuthOfferData = postAuthOffersData.plo;
        }
        if ((i & 2) != 0) {
            postAuthOfferData2 = postAuthOffersData.pro;
        }
        return postAuthOffersData.copy(postAuthOfferData, postAuthOfferData2);
    }

    public final PostAuthOfferData component1() {
        return this.plo;
    }

    public final PostAuthOfferData component2() {
        return this.pro;
    }

    public final PostAuthOffersData copy(PostAuthOfferData postAuthOfferData, PostAuthOfferData postAuthOfferData2) {
        zq3.h(postAuthOfferData, "plo");
        zq3.h(postAuthOfferData2, "pro");
        return new PostAuthOffersData(postAuthOfferData, postAuthOfferData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostAuthOffersData)) {
            return false;
        }
        PostAuthOffersData postAuthOffersData = (PostAuthOffersData) obj;
        return zq3.c(this.plo, postAuthOffersData.plo) && zq3.c(this.pro, postAuthOffersData.pro);
    }

    public final PostAuthOfferData getPlo() {
        return this.plo;
    }

    public final PostAuthOfferData getPro() {
        return this.pro;
    }

    public int hashCode() {
        return (this.plo.hashCode() * 31) + this.pro.hashCode();
    }

    public String toString() {
        return "PostAuthOffersData(plo=" + this.plo + ", pro=" + this.pro + ")";
    }
}
