package com.nytimes.android.comments.comments.mvi.view;

import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import com.nytimes.android.comments.comments.mvi.FlagType;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CommentThreadUIState {
    public static final int $stable = 8;
    private final Comment commentThread;
    private final List<FlagType> flagOptions;
    private final boolean isLoading;
    private final boolean isReporter;
    private final boolean showFlagAlertDialog;
    private final boolean showFlagSuccessMessage;

    public CommentThreadUIState() {
        this(null, null, false, false, false, false, 63, null);
    }

    public static /* synthetic */ CommentThreadUIState copy$default(CommentThreadUIState commentThreadUIState, Comment comment, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            comment = commentThreadUIState.commentThread;
        }
        if ((i & 2) != 0) {
            list = commentThreadUIState.flagOptions;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z = commentThreadUIState.isLoading;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = commentThreadUIState.isReporter;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = commentThreadUIState.showFlagAlertDialog;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = commentThreadUIState.showFlagSuccessMessage;
        }
        return commentThreadUIState.copy(comment, list2, z5, z6, z7, z4);
    }

    public final Comment component1() {
        return this.commentThread;
    }

    public final List<FlagType> component2() {
        return this.flagOptions;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final boolean component4() {
        return this.isReporter;
    }

    public final boolean component5() {
        return this.showFlagAlertDialog;
    }

    public final boolean component6() {
        return this.showFlagSuccessMessage;
    }

    public final CommentThreadUIState copy(Comment comment, List<? extends FlagType> list, boolean z, boolean z2, boolean z3, boolean z4) {
        zq3.h(list, "flagOptions");
        return new CommentThreadUIState(comment, list, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentThreadUIState)) {
            return false;
        }
        CommentThreadUIState commentThreadUIState = (CommentThreadUIState) obj;
        return zq3.c(this.commentThread, commentThreadUIState.commentThread) && zq3.c(this.flagOptions, commentThreadUIState.flagOptions) && this.isLoading == commentThreadUIState.isLoading && this.isReporter == commentThreadUIState.isReporter && this.showFlagAlertDialog == commentThreadUIState.showFlagAlertDialog && this.showFlagSuccessMessage == commentThreadUIState.showFlagSuccessMessage;
    }

    public final Comment getCommentThread() {
        return this.commentThread;
    }

    public final List<FlagType> getFlagOptions() {
        return this.flagOptions;
    }

    public final boolean getShowFlagAlertDialog() {
        return this.showFlagAlertDialog;
    }

    public final boolean getShowFlagSuccessMessage() {
        return this.showFlagSuccessMessage;
    }

    public int hashCode() {
        Comment comment = this.commentThread;
        return ((((((((((comment == null ? 0 : comment.hashCode()) * 31) + this.flagOptions.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isReporter)) * 31) + Boolean.hashCode(this.showFlagAlertDialog)) * 31) + Boolean.hashCode(this.showFlagSuccessMessage);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isReporter() {
        return this.isReporter;
    }

    public String toString() {
        return "CommentThreadUIState(commentThread=" + this.commentThread + ", flagOptions=" + this.flagOptions + ", isLoading=" + this.isLoading + ", isReporter=" + this.isReporter + ", showFlagAlertDialog=" + this.showFlagAlertDialog + ", showFlagSuccessMessage=" + this.showFlagSuccessMessage + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentThreadUIState(Comment comment, List<? extends FlagType> list, boolean z, boolean z2, boolean z3, boolean z4) {
        zq3.h(list, "flagOptions");
        this.commentThread = comment;
        this.flagOptions = list;
        this.isLoading = z;
        this.isReporter = z2;
        this.showFlagAlertDialog = z3;
        this.showFlagSuccessMessage = z4;
    }

    public /* synthetic */ CommentThreadUIState(Comment comment, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : comment, (i & 2) != 0 ? d.C0(FlagType.values()) : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) == 0 ? z4 : false);
    }
}
