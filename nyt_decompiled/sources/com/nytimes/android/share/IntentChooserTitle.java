package com.nytimes.android.share;

import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.VideoAsset;
import defpackage.dm6;
import defpackage.zl6;

/* loaded from: classes4.dex */
public enum IntentChooserTitle {
    TWITTER(dm6.share_message_twitter),
    VIDEO(zl6.share_message_video),
    ARTICLE(zl6.share_message_article),
    DEFAULT(zl6.share_message_default);

    private final int shareTextResource;

    IntentChooserTitle(int i) {
        this.shareTextResource = i;
    }

    public static IntentChooserTitle fromAsset(Asset asset) {
        return asset instanceof VideoAsset ? VIDEO : asset instanceof ArticleAsset ? ARTICLE : DEFAULT;
    }

    public int getTextResource() {
        return this.shareTextResource;
    }
}
