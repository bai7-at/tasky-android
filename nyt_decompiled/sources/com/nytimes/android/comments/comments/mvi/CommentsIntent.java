package com.nytimes.android.comments.comments.mvi;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class CommentsIntent {
    public static final int $stable = 0;

    public static final class CommentTabChanged extends CommentsIntent {
        public static final int $stable = 0;
        private final CommentTab commentTab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommentTabChanged(CommentTab commentTab) {
            super(null);
            zq3.h(commentTab, "commentTab");
            this.commentTab = commentTab;
        }

        public static /* synthetic */ CommentTabChanged copy$default(CommentTabChanged commentTabChanged, CommentTab commentTab, int i, Object obj) {
            if ((i & 1) != 0) {
                commentTab = commentTabChanged.commentTab;
            }
            return commentTabChanged.copy(commentTab);
        }

        public final CommentTab component1() {
            return this.commentTab;
        }

        public final CommentTabChanged copy(CommentTab commentTab) {
            zq3.h(commentTab, "commentTab");
            return new CommentTabChanged(commentTab);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommentTabChanged) && this.commentTab == ((CommentTabChanged) obj).commentTab;
        }

        public final CommentTab getCommentTab() {
            return this.commentTab;
        }

        public int hashCode() {
            return this.commentTab.hashCode();
        }

        public String toString() {
            return "CommentTabChanged(commentTab=" + this.commentTab + ")";
        }
    }

    public static final class ConfirmFlagComment extends CommentsIntent {
        public static final int $stable = 0;
        private final boolean isCommentThread;

        public ConfirmFlagComment() {
            this(false, 1, null);
        }

        public static /* synthetic */ ConfirmFlagComment copy$default(ConfirmFlagComment confirmFlagComment, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = confirmFlagComment.isCommentThread;
            }
            return confirmFlagComment.copy(z);
        }

        public final boolean component1() {
            return this.isCommentThread;
        }

        public final ConfirmFlagComment copy(boolean z) {
            return new ConfirmFlagComment(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmFlagComment) && this.isCommentThread == ((ConfirmFlagComment) obj).isCommentThread;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCommentThread);
        }

        public final boolean isCommentThread() {
            return this.isCommentThread;
        }

        public String toString() {
            return "ConfirmFlagComment(isCommentThread=" + this.isCommentThread + ")";
        }

        public ConfirmFlagComment(boolean z) {
            super(null);
            this.isCommentThread = z;
        }

        public /* synthetic */ ConfirmFlagComment(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    public static final class DismissErrorMessage extends CommentsIntent {
        public static final int $stable = 0;
        public static final DismissErrorMessage INSTANCE = new DismissErrorMessage();

        private DismissErrorMessage() {
            super(null);
        }
    }

    public static final class DismissFlagComment extends CommentsIntent {
        public static final int $stable = 0;
        private final boolean isCommentThread;

        public DismissFlagComment() {
            this(false, 1, null);
        }

        public static /* synthetic */ DismissFlagComment copy$default(DismissFlagComment dismissFlagComment, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dismissFlagComment.isCommentThread;
            }
            return dismissFlagComment.copy(z);
        }

        public final boolean component1() {
            return this.isCommentThread;
        }

        public final DismissFlagComment copy(boolean z) {
            return new DismissFlagComment(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DismissFlagComment) && this.isCommentThread == ((DismissFlagComment) obj).isCommentThread;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCommentThread);
        }

        public final boolean isCommentThread() {
            return this.isCommentThread;
        }

        public String toString() {
            return "DismissFlagComment(isCommentThread=" + this.isCommentThread + ")";
        }

        public DismissFlagComment(boolean z) {
            super(null);
            this.isCommentThread = z;
        }

        public /* synthetic */ DismissFlagComment(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    public static final class DismissFlagSuccessMessage extends CommentsIntent {
        public static final int $stable = 0;
        public static final DismissFlagSuccessMessage INSTANCE = new DismissFlagSuccessMessage();

        private DismissFlagSuccessMessage() {
            super(null);
        }
    }

    public static final class FlagComment extends CommentsIntent {
        public static final int $stable = 0;
        private final long commentID;
        private final String flagOption;
        private final boolean isCommentThread;

        public /* synthetic */ FlagComment(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, (i & 4) != 0 ? false : z);
        }

        public static /* synthetic */ FlagComment copy$default(FlagComment flagComment, long j, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = flagComment.commentID;
            }
            if ((i & 2) != 0) {
                str = flagComment.flagOption;
            }
            if ((i & 4) != 0) {
                z = flagComment.isCommentThread;
            }
            return flagComment.copy(j, str, z);
        }

        public final long component1() {
            return this.commentID;
        }

        public final String component2() {
            return this.flagOption;
        }

        public final boolean component3() {
            return this.isCommentThread;
        }

        public final FlagComment copy(long j, String str, boolean z) {
            zq3.h(str, "flagOption");
            return new FlagComment(j, str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlagComment)) {
                return false;
            }
            FlagComment flagComment = (FlagComment) obj;
            return this.commentID == flagComment.commentID && zq3.c(this.flagOption, flagComment.flagOption) && this.isCommentThread == flagComment.isCommentThread;
        }

        public final long getCommentID() {
            return this.commentID;
        }

        public final String getFlagOption() {
            return this.flagOption;
        }

        public int hashCode() {
            return (((Long.hashCode(this.commentID) * 31) + this.flagOption.hashCode()) * 31) + Boolean.hashCode(this.isCommentThread);
        }

        public final boolean isCommentThread() {
            return this.isCommentThread;
        }

        public String toString() {
            return "FlagComment(commentID=" + this.commentID + ", flagOption=" + this.flagOption + ", isCommentThread=" + this.isCommentThread + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlagComment(long j, String str, boolean z) {
            super(null);
            zq3.h(str, "flagOption");
            this.commentID = j;
            this.flagOption = str;
            this.isCommentThread = z;
        }
    }

    public static final class FlagReply extends CommentsIntent {
        public static final int $stable = 0;
        private final long commentID;
        private final String flagOption;
        private final boolean isCommentThread;
        private final long replyID;

        public /* synthetic */ FlagReply(long j, long j2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, str, (i & 8) != 0 ? false : z);
        }

        public static /* synthetic */ FlagReply copy$default(FlagReply flagReply, long j, long j2, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = flagReply.commentID;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = flagReply.replyID;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = flagReply.flagOption;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                z = flagReply.isCommentThread;
            }
            return flagReply.copy(j3, j4, str2, z);
        }

        public final long component1() {
            return this.commentID;
        }

        public final long component2() {
            return this.replyID;
        }

        public final String component3() {
            return this.flagOption;
        }

        public final boolean component4() {
            return this.isCommentThread;
        }

        public final FlagReply copy(long j, long j2, String str, boolean z) {
            zq3.h(str, "flagOption");
            return new FlagReply(j, j2, str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlagReply)) {
                return false;
            }
            FlagReply flagReply = (FlagReply) obj;
            return this.commentID == flagReply.commentID && this.replyID == flagReply.replyID && zq3.c(this.flagOption, flagReply.flagOption) && this.isCommentThread == flagReply.isCommentThread;
        }

        public final long getCommentID() {
            return this.commentID;
        }

        public final String getFlagOption() {
            return this.flagOption;
        }

        public final long getReplyID() {
            return this.replyID;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.commentID) * 31) + Long.hashCode(this.replyID)) * 31) + this.flagOption.hashCode()) * 31) + Boolean.hashCode(this.isCommentThread);
        }

        public final boolean isCommentThread() {
            return this.isCommentThread;
        }

        public String toString() {
            return "FlagReply(commentID=" + this.commentID + ", replyID=" + this.replyID + ", flagOption=" + this.flagOption + ", isCommentThread=" + this.isCommentThread + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlagReply(long j, long j2, String str, boolean z) {
            super(null);
            zq3.h(str, "flagOption");
            this.commentID = j;
            this.replyID = j2;
            this.flagOption = str;
            this.isCommentThread = z;
        }
    }

    public static final class GetAllReplies extends CommentsIntent {
        public static final int $stable = 0;
        private final long commentID;

        public GetAllReplies(long j) {
            super(null);
            this.commentID = j;
        }

        public static /* synthetic */ GetAllReplies copy$default(GetAllReplies getAllReplies, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = getAllReplies.commentID;
            }
            return getAllReplies.copy(j);
        }

        public final long component1() {
            return this.commentID;
        }

        public final GetAllReplies copy(long j) {
            return new GetAllReplies(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetAllReplies) && this.commentID == ((GetAllReplies) obj).commentID;
        }

        public final long getCommentID() {
            return this.commentID;
        }

        public int hashCode() {
            return Long.hashCode(this.commentID);
        }

        public String toString() {
            return "GetAllReplies(commentID=" + this.commentID + ")";
        }
    }

    public static final class GetCommentThread extends CommentsIntent {
        public static final int $stable = 0;
        private final long commentParentId;

        public GetCommentThread(long j) {
            super(null);
            this.commentParentId = j;
        }

        public static /* synthetic */ GetCommentThread copy$default(GetCommentThread getCommentThread, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = getCommentThread.commentParentId;
            }
            return getCommentThread.copy(j);
        }

        public final long component1() {
            return this.commentParentId;
        }

        public final GetCommentThread copy(long j) {
            return new GetCommentThread(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCommentThread) && this.commentParentId == ((GetCommentThread) obj).commentParentId;
        }

        public final long getCommentParentId() {
            return this.commentParentId;
        }

        public int hashCode() {
            return Long.hashCode(this.commentParentId);
        }

        public String toString() {
            return "GetCommentThread(commentParentId=" + this.commentParentId + ")";
        }
    }

    public static final class GetCommentThreadReplies extends CommentsIntent {
        public static final int $stable = 0;
        private final long commentID;

        public GetCommentThreadReplies(long j) {
            super(null);
            this.commentID = j;
        }

        public static /* synthetic */ GetCommentThreadReplies copy$default(GetCommentThreadReplies getCommentThreadReplies, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = getCommentThreadReplies.commentID;
            }
            return getCommentThreadReplies.copy(j);
        }

        public final long component1() {
            return this.commentID;
        }

        public final GetCommentThreadReplies copy(long j) {
            return new GetCommentThreadReplies(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCommentThreadReplies) && this.commentID == ((GetCommentThreadReplies) obj).commentID;
        }

        public final long getCommentID() {
            return this.commentID;
        }

        public int hashCode() {
            return Long.hashCode(this.commentID);
        }

        public String toString() {
            return "GetCommentThreadReplies(commentID=" + this.commentID + ")";
        }
    }

    public static final class RecommendComment extends CommentsIntent {
        public static final int $stable = 0;
        private final long commentID;
        private final boolean recommended;

        public RecommendComment(long j, boolean z) {
            super(null);
            this.commentID = j;
            this.recommended = z;
        }

        public static /* synthetic */ RecommendComment copy$default(RecommendComment recommendComment, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = recommendComment.commentID;
            }
            if ((i & 2) != 0) {
                z = recommendComment.recommended;
            }
            return recommendComment.copy(j, z);
        }

        public final long component1() {
            return this.commentID;
        }

        public final boolean component2() {
            return this.recommended;
        }

        public final RecommendComment copy(long j, boolean z) {
            return new RecommendComment(j, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendComment)) {
                return false;
            }
            RecommendComment recommendComment = (RecommendComment) obj;
            return this.commentID == recommendComment.commentID && this.recommended == recommendComment.recommended;
        }

        public final long getCommentID() {
            return this.commentID;
        }

        public final boolean getRecommended() {
            return this.recommended;
        }

        public int hashCode() {
            return (Long.hashCode(this.commentID) * 31) + Boolean.hashCode(this.recommended);
        }

        public String toString() {
            return "RecommendComment(commentID=" + this.commentID + ", recommended=" + this.recommended + ")";
        }
    }

    public static final class RecommendReply extends CommentsIntent {
        public static final int $stable = 0;
        private final long commentID;
        private final boolean recommended;
        private final long replyID;

        public RecommendReply(long j, long j2, boolean z) {
            super(null);
            this.commentID = j;
            this.replyID = j2;
            this.recommended = z;
        }

        public static /* synthetic */ RecommendReply copy$default(RecommendReply recommendReply, long j, long j2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = recommendReply.commentID;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = recommendReply.replyID;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                z = recommendReply.recommended;
            }
            return recommendReply.copy(j3, j4, z);
        }

        public final long component1() {
            return this.commentID;
        }

        public final long component2() {
            return this.replyID;
        }

        public final boolean component3() {
            return this.recommended;
        }

        public final RecommendReply copy(long j, long j2, boolean z) {
            return new RecommendReply(j, j2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendReply)) {
                return false;
            }
            RecommendReply recommendReply = (RecommendReply) obj;
            return this.commentID == recommendReply.commentID && this.replyID == recommendReply.replyID && this.recommended == recommendReply.recommended;
        }

        public final long getCommentID() {
            return this.commentID;
        }

        public final boolean getRecommended() {
            return this.recommended;
        }

        public final long getReplyID() {
            return this.replyID;
        }

        public int hashCode() {
            return (((Long.hashCode(this.commentID) * 31) + Long.hashCode(this.replyID)) * 31) + Boolean.hashCode(this.recommended);
        }

        public String toString() {
            return "RecommendReply(commentID=" + this.commentID + ", replyID=" + this.replyID + ", recommended=" + this.recommended + ")";
        }
    }

    public static final class Refresh extends CommentsIntent {
        public static final int $stable = 0;
        public static final Refresh INSTANCE = new Refresh();

        private Refresh() {
            super(null);
        }
    }

    public static final class ShareComment {
        public static final int $stable = 0;
        private final long commentID;

        public ShareComment(long j) {
            this.commentID = j;
        }

        public static /* synthetic */ ShareComment copy$default(ShareComment shareComment, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = shareComment.commentID;
            }
            return shareComment.copy(j);
        }

        public final long component1() {
            return this.commentID;
        }

        public final ShareComment copy(long j) {
            return new ShareComment(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShareComment) && this.commentID == ((ShareComment) obj).commentID;
        }

        public final long getCommentID() {
            return this.commentID;
        }

        public int hashCode() {
            return Long.hashCode(this.commentID);
        }

        public String toString() {
            return "ShareComment(commentID=" + this.commentID + ")";
        }
    }

    public static final class SortOptionChanged extends CommentsIntent {
        public static final int $stable = 0;
        private final SortingOption sortingOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SortOptionChanged(SortingOption sortingOption) {
            super(null);
            zq3.h(sortingOption, "sortingOption");
            this.sortingOption = sortingOption;
        }

        public static /* synthetic */ SortOptionChanged copy$default(SortOptionChanged sortOptionChanged, SortingOption sortingOption, int i, Object obj) {
            if ((i & 1) != 0) {
                sortingOption = sortOptionChanged.sortingOption;
            }
            return sortOptionChanged.copy(sortingOption);
        }

        public final SortingOption component1() {
            return this.sortingOption;
        }

        public final SortOptionChanged copy(SortingOption sortingOption) {
            zq3.h(sortingOption, "sortingOption");
            return new SortOptionChanged(sortingOption);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SortOptionChanged) && this.sortingOption == ((SortOptionChanged) obj).sortingOption;
        }

        public final SortingOption getSortingOption() {
            return this.sortingOption;
        }

        public int hashCode() {
            return this.sortingOption.hashCode();
        }

        public String toString() {
            return "SortOptionChanged(sortingOption=" + this.sortingOption + ")";
        }
    }

    public /* synthetic */ CommentsIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CommentsIntent() {
    }
}
