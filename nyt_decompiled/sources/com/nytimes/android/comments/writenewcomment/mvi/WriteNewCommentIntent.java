package com.nytimes.android.comments.writenewcomment.mvi;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class WriteNewCommentIntent {
    public static final int $stable = 0;

    public static final class CloseScreen extends WriteNewCommentIntent {
        public static final int $stable = 0;
        public static final CloseScreen INSTANCE = new CloseScreen();

        private CloseScreen() {
            super(null);
        }
    }

    public static final class DiscardDraftComment extends WriteNewCommentIntent {
        public static final int $stable = 0;
        public static final DiscardDraftComment INSTANCE = new DiscardDraftComment();

        private DiscardDraftComment() {
            super(null);
        }
    }

    public static final class DismissSaveDraftCommentDialog extends WriteNewCommentIntent {
        public static final int $stable = 0;
        public static final DismissSaveDraftCommentDialog INSTANCE = new DismissSaveDraftCommentDialog();

        private DismissSaveDraftCommentDialog() {
            super(null);
        }
    }

    public static final class DismissSubmitCommentErrorAlertDialog extends WriteNewCommentIntent {
        public static final int $stable = 0;
        public static final DismissSubmitCommentErrorAlertDialog INSTANCE = new DismissSubmitCommentErrorAlertDialog();

        private DismissSubmitCommentErrorAlertDialog() {
            super(null);
        }
    }

    public static final class NameClick extends WriteNewCommentIntent {
        public static final int $stable = 0;
        public static final NameClick INSTANCE = new NameClick();

        private NameClick() {
            super(null);
        }
    }

    public static final class OnCommentEntered extends WriteNewCommentIntent {
        public static final int $stable = 0;
        private final String input;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCommentEntered(String str) {
            super(null);
            zq3.h(str, "input");
            this.input = str;
        }

        public static /* synthetic */ OnCommentEntered copy$default(OnCommentEntered onCommentEntered, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onCommentEntered.input;
            }
            return onCommentEntered.copy(str);
        }

        public final String component1() {
            return this.input;
        }

        public final OnCommentEntered copy(String str) {
            zq3.h(str, "input");
            return new OnCommentEntered(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCommentEntered) && zq3.c(this.input, ((OnCommentEntered) obj).input);
        }

        public final String getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return "OnCommentEntered(input=" + this.input + ")";
        }
    }

    public static final class OnEmailMeChecked extends WriteNewCommentIntent {
        public static final int $stable = 0;
        private final boolean checked;

        public OnEmailMeChecked(boolean z) {
            super(null);
            this.checked = z;
        }

        public static /* synthetic */ OnEmailMeChecked copy$default(OnEmailMeChecked onEmailMeChecked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onEmailMeChecked.checked;
            }
            return onEmailMeChecked.copy(z);
        }

        public final boolean component1() {
            return this.checked;
        }

        public final OnEmailMeChecked copy(boolean z) {
            return new OnEmailMeChecked(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnEmailMeChecked) && this.checked == ((OnEmailMeChecked) obj).checked;
        }

        public final boolean getChecked() {
            return this.checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public String toString() {
            return "OnEmailMeChecked(checked=" + this.checked + ")";
        }
    }

    public static final class OnLocationEntered extends WriteNewCommentIntent {
        public static final int $stable = 0;
        private final String input;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLocationEntered(String str) {
            super(null);
            zq3.h(str, "input");
            this.input = str;
        }

        public static /* synthetic */ OnLocationEntered copy$default(OnLocationEntered onLocationEntered, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onLocationEntered.input;
            }
            return onLocationEntered.copy(str);
        }

        public final String component1() {
            return this.input;
        }

        public final OnLocationEntered copy(String str) {
            zq3.h(str, "input");
            return new OnLocationEntered(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLocationEntered) && zq3.c(this.input, ((OnLocationEntered) obj).input);
        }

        public final String getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return "OnLocationEntered(input=" + this.input + ")";
        }
    }

    public static final class OnNameEntered extends WriteNewCommentIntent {
        public static final int $stable = 8;
        private String input;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnNameEntered(String str) {
            super(null);
            zq3.h(str, "input");
            this.input = str;
        }

        public static /* synthetic */ OnNameEntered copy$default(OnNameEntered onNameEntered, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = onNameEntered.input;
            }
            return onNameEntered.copy(str);
        }

        public final String component1() {
            return this.input;
        }

        public final OnNameEntered copy(String str) {
            zq3.h(str, "input");
            return new OnNameEntered(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnNameEntered) && zq3.c(this.input, ((OnNameEntered) obj).input);
        }

        public final String getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public final void setInput(String str) {
            zq3.h(str, "<set-?>");
            this.input = str;
        }

        public String toString() {
            return "OnNameEntered(input=" + this.input + ")";
        }
    }

    public static final class SaveDraftComment extends WriteNewCommentIntent {
        public static final int $stable = 0;
        public static final SaveDraftComment INSTANCE = new SaveDraftComment();

        private SaveDraftComment() {
            super(null);
        }
    }

    public static final class SubmitNewComment extends WriteNewCommentIntent {
        public static final int $stable = 0;
        public static final SubmitNewComment INSTANCE = new SubmitNewComment();

        private SubmitNewComment() {
            super(null);
        }
    }

    public /* synthetic */ WriteNewCommentIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WriteNewCommentIntent() {
    }
}
