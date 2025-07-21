package com.nytimes.android.comments.comments.mvi.view;

import com.nytimes.android.comments.comments.mvi.CommentTab;
import com.nytimes.android.comments.comments.mvi.SortingOption;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CommentsTabsUIState {
    public static final int $stable = 8;
    private final LinkedHashMap<CommentTab, Integer> commentsTabs;
    private final CommentTab selectedCommentTab;
    private final boolean showOfflineMessage;
    private final List<SortingOption> sortingOptions;

    public CommentsTabsUIState() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentsTabsUIState copy$default(CommentsTabsUIState commentsTabsUIState, LinkedHashMap linkedHashMap, CommentTab commentTab, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            linkedHashMap = commentsTabsUIState.commentsTabs;
        }
        if ((i & 2) != 0) {
            commentTab = commentsTabsUIState.selectedCommentTab;
        }
        if ((i & 4) != 0) {
            list = commentsTabsUIState.sortingOptions;
        }
        if ((i & 8) != 0) {
            z = commentsTabsUIState.showOfflineMessage;
        }
        return commentsTabsUIState.copy(linkedHashMap, commentTab, list, z);
    }

    public final LinkedHashMap<CommentTab, Integer> component1() {
        return this.commentsTabs;
    }

    public final CommentTab component2() {
        return this.selectedCommentTab;
    }

    public final List<SortingOption> component3() {
        return this.sortingOptions;
    }

    public final boolean component4() {
        return this.showOfflineMessage;
    }

    public final CommentsTabsUIState copy(LinkedHashMap<CommentTab, Integer> linkedHashMap, CommentTab commentTab, List<? extends SortingOption> list, boolean z) {
        zq3.h(linkedHashMap, "commentsTabs");
        zq3.h(commentTab, "selectedCommentTab");
        zq3.h(list, "sortingOptions");
        return new CommentsTabsUIState(linkedHashMap, commentTab, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentsTabsUIState)) {
            return false;
        }
        CommentsTabsUIState commentsTabsUIState = (CommentsTabsUIState) obj;
        return zq3.c(this.commentsTabs, commentsTabsUIState.commentsTabs) && this.selectedCommentTab == commentsTabsUIState.selectedCommentTab && zq3.c(this.sortingOptions, commentsTabsUIState.sortingOptions) && this.showOfflineMessage == commentsTabsUIState.showOfflineMessage;
    }

    public final LinkedHashMap<CommentTab, Integer> getCommentsTabs() {
        return this.commentsTabs;
    }

    public final CommentTab getSelectedCommentTab() {
        return this.selectedCommentTab;
    }

    public final boolean getShowOfflineMessage() {
        return this.showOfflineMessage;
    }

    public final List<SortingOption> getSortingOptions() {
        return this.sortingOptions;
    }

    public int hashCode() {
        return (((((this.commentsTabs.hashCode() * 31) + this.selectedCommentTab.hashCode()) * 31) + this.sortingOptions.hashCode()) * 31) + Boolean.hashCode(this.showOfflineMessage);
    }

    public String toString() {
        return "CommentsTabsUIState(commentsTabs=" + this.commentsTabs + ", selectedCommentTab=" + this.selectedCommentTab + ", sortingOptions=" + this.sortingOptions + ", showOfflineMessage=" + this.showOfflineMessage + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentsTabsUIState(LinkedHashMap<CommentTab, Integer> linkedHashMap, CommentTab commentTab, List<? extends SortingOption> list, boolean z) {
        zq3.h(linkedHashMap, "commentsTabs");
        zq3.h(commentTab, "selectedCommentTab");
        zq3.h(list, "sortingOptions");
        this.commentsTabs = linkedHashMap;
        this.selectedCommentTab = commentTab;
        this.sortingOptions = list;
        this.showOfflineMessage = z;
    }

    public /* synthetic */ CommentsTabsUIState(LinkedHashMap linkedHashMap, CommentTab commentTab, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap, (i & 2) != 0 ? CommentTab.All : commentTab, (i & 4) != 0 ? d.C0(SortingOption.values()) : list, (i & 8) != 0 ? false : z);
    }
}
