package com.nytimes.android.comments.menu.view;

import android.view.View;
import com.nytimes.android.api.cms.Asset;
import defpackage.by0;
import defpackage.ww8;

/* loaded from: classes4.dex */
public interface MenuCommentsView {
    void clearCommentCount();

    String getTotalCommentsCount();

    View getView();

    Object loadCommentCount(Asset asset, by0<? super ww8> by0Var);
}
