package com.nytimes.android.comments.writenewcomment.data.remote.newcomment;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class SubmitNewCommentResult {
    public static final int $stable = 0;

    public static final class Error extends SubmitNewCommentResult {
        public static final int $stable = 8;
        private String errorMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.errorMessage;
            }
            return error.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Error copy(String str) {
            return new Error(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && zq3.c(this.errorMessage, ((Error) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setErrorMessage(String str) {
            this.errorMessage = str;
        }

        public String toString() {
            return "Error(errorMessage=" + this.errorMessage + ")";
        }

        public Error(String str) {
            super(null);
            this.errorMessage = str;
        }

        public /* synthetic */ Error(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public static final class Loading extends SubmitNewCommentResult {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    public static final class Success extends SubmitNewCommentResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ SubmitNewCommentResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SubmitNewCommentResult() {
    }
}
