package com.nytimes.android.comments.comments.mvi.view;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.comments.comments.mvi.FlagType;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CommentsUIState {
    public static final int $stable = 8;
    private final String errorMessage;
    private final List<FlagType> flagOptions;
    private final GetAllRepliesState getAllRepliesState;
    private final boolean isCommentingOpen;
    private final boolean isRegisteredUser;
    private final boolean isReporter;
    private final boolean showEmptyContent;
    private final boolean showFlagAlertDialog;
    private final boolean showFlagSuccessMessage;

    public CommentsUIState() {
        this(false, false, false, false, null, false, false, null, null, 511, null);
    }

    public final boolean component1() {
        return this.isCommentingOpen;
    }

    public final boolean component2() {
        return this.showEmptyContent;
    }

    public final boolean component3() {
        return this.isRegisteredUser;
    }

    public final boolean component4() {
        return this.isReporter;
    }

    public final List<FlagType> component5() {
        return this.flagOptions;
    }

    public final boolean component6() {
        return this.showFlagAlertDialog;
    }

    public final boolean component7() {
        return this.showFlagSuccessMessage;
    }

    public final String component8() {
        return this.errorMessage;
    }

    public final GetAllRepliesState component9() {
        return this.getAllRepliesState;
    }

    public final CommentsUIState copy(boolean z, boolean z2, boolean z3, boolean z4, List<? extends FlagType> list, boolean z5, boolean z6, String str, GetAllRepliesState getAllRepliesState) {
        zq3.h(list, "flagOptions");
        zq3.h(getAllRepliesState, "getAllRepliesState");
        return new CommentsUIState(z, z2, z3, z4, list, z5, z6, str, getAllRepliesState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentsUIState)) {
            return false;
        }
        CommentsUIState commentsUIState = (CommentsUIState) obj;
        return this.isCommentingOpen == commentsUIState.isCommentingOpen && this.showEmptyContent == commentsUIState.showEmptyContent && this.isRegisteredUser == commentsUIState.isRegisteredUser && this.isReporter == commentsUIState.isReporter && zq3.c(this.flagOptions, commentsUIState.flagOptions) && this.showFlagAlertDialog == commentsUIState.showFlagAlertDialog && this.showFlagSuccessMessage == commentsUIState.showFlagSuccessMessage && zq3.c(this.errorMessage, commentsUIState.errorMessage) && zq3.c(this.getAllRepliesState, commentsUIState.getAllRepliesState);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<FlagType> getFlagOptions() {
        return this.flagOptions;
    }

    public final GetAllRepliesState getGetAllRepliesState() {
        return this.getAllRepliesState;
    }

    public final boolean getShowEmptyContent() {
        return this.showEmptyContent;
    }

    public final boolean getShowFlagAlertDialog() {
        return this.showFlagAlertDialog;
    }

    public final boolean getShowFlagSuccessMessage() {
        return this.showFlagSuccessMessage;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Boolean.hashCode(this.isCommentingOpen) * 31) + Boolean.hashCode(this.showEmptyContent)) * 31) + Boolean.hashCode(this.isRegisteredUser)) * 31) + Boolean.hashCode(this.isReporter)) * 31) + this.flagOptions.hashCode()) * 31) + Boolean.hashCode(this.showFlagAlertDialog)) * 31) + Boolean.hashCode(this.showFlagSuccessMessage)) * 31;
        String str = this.errorMessage;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.getAllRepliesState.hashCode();
    }

    public final boolean isCommentingOpen() {
        return this.isCommentingOpen;
    }

    public final boolean isRegisteredUser() {
        return this.isRegisteredUser;
    }

    public final boolean isReporter() {
        return this.isReporter;
    }

    public String toString() {
        return "CommentsUIState(isCommentingOpen=" + this.isCommentingOpen + ", showEmptyContent=" + this.showEmptyContent + ", isRegisteredUser=" + this.isRegisteredUser + ", isReporter=" + this.isReporter + ", flagOptions=" + this.flagOptions + ", showFlagAlertDialog=" + this.showFlagAlertDialog + ", showFlagSuccessMessage=" + this.showFlagSuccessMessage + ", errorMessage=" + this.errorMessage + ", getAllRepliesState=" + this.getAllRepliesState + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentsUIState(boolean z, boolean z2, boolean z3, boolean z4, List<? extends FlagType> list, boolean z5, boolean z6, String str, GetAllRepliesState getAllRepliesState) {
        zq3.h(list, "flagOptions");
        zq3.h(getAllRepliesState, "getAllRepliesState");
        this.isCommentingOpen = z;
        this.showEmptyContent = z2;
        this.isRegisteredUser = z3;
        this.isReporter = z4;
        this.flagOptions = list;
        this.showFlagAlertDialog = z5;
        this.showFlagSuccessMessage = z6;
        this.errorMessage = str;
        this.getAllRepliesState = getAllRepliesState;
    }

    public /* synthetic */ CommentsUIState(boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, boolean z6, String str, GetAllRepliesState getAllRepliesState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? d.C0(FlagType.values()) : list, (i & 32) != 0 ? false : z5, (i & 64) == 0 ? z6 : false, (i & 128) != 0 ? null : str, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? new GetAllRepliesState(false, 0L, 3, null) : getAllRepliesState);
    }
}
