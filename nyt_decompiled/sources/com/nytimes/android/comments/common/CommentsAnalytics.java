package com.nytimes.android.comments.common;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.e52;
import defpackage.s42;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class CommentsAnalytics {
    public static final int $stable = 8;
    private final ET2Scope et2Scope;

    public CommentsAnalytics(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.et2Scope = eT2Scope;
    }

    private final void sendEvent(String str, String str2) {
        ET2PageScope.DefaultImpls.a(this.et2Scope, new e52.e(), new s42(str, str2, null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    public final void sendChangeTabsEvent(String str) {
        zq3.h(str, "label");
        sendEvent("comment filter", str);
    }

    public final void sendRecommendCommentEvent() {
        sendEvent("recommend comment", "recommend comment");
    }

    public final void sendSortCommentsEvent(String str) {
        zq3.h(str, "label");
        sendEvent("sort comments", str);
    }

    public final void sendViewAllRepliesEvent() {
        sendEvent("view replies", "view replies");
    }

    public final void sendViewCommentsEvent() {
        sendEvent("view comments", "view comments");
    }

    public final void sendViewThreadEvent() {
        sendEvent("comments", "view thread");
    }
}
