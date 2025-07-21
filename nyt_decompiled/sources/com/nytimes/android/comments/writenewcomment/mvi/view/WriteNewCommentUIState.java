package com.nytimes.android.comments.writenewcomment.mvi.view;

import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class WriteNewCommentUIState {
    public static final int $stable = 0;
    private final InputData data;
    private final Finish finish;
    private final boolean isLoading;
    private final boolean isVerifiedUser;
    private final boolean showSaveDraftCommentAlertDialog;
    private final boolean showSubmitCommentErrorAlertDialog;
    private final boolean showVerifiedUserError;
    private final String submitCommentErrorMessage;

    public static abstract class Finish {
        public static final int $stable = 0;

        public static final class Discard extends Finish {
            public static final int $stable = 0;
            public static final Discard INSTANCE = new Discard();

            private Discard() {
                super(null);
            }
        }

        public static final class SuccessUnverifiedWithEmail extends Finish {
            public static final int $stable = 0;
            public static final SuccessUnverifiedWithEmail INSTANCE = new SuccessUnverifiedWithEmail();

            private SuccessUnverifiedWithEmail() {
                super(null);
            }
        }

        public static final class SuccessUnverifiedWithoutEmail extends Finish {
            public static final int $stable = 0;
            public static final SuccessUnverifiedWithoutEmail INSTANCE = new SuccessUnverifiedWithoutEmail();

            private SuccessUnverifiedWithoutEmail() {
                super(null);
            }
        }

        public static final class SuccessVerified extends Finish {
            public static final int $stable = 0;
            public static final SuccessVerified INSTANCE = new SuccessVerified();

            private SuccessVerified() {
                super(null);
            }
        }

        public /* synthetic */ Finish(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Finish() {
        }
    }

    public static final class InputData {
        public static final int $stable = 0;
        private final InputField comment;
        private final InputField location;
        private final InputField name;
        private final boolean sendEmailNotification;
        private final String title;

        public static final class InputField {
            public static final int $stable = 0;
            private final InputFieldError error;
            private final boolean isValid;
            private final String message;
            private final String value;

            public InputField() {
                this(null, null, false, null, 15, null);
            }

            public static /* synthetic */ InputField copy$default(InputField inputField, InputFieldError inputFieldError, String str, boolean z, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    inputFieldError = inputField.error;
                }
                if ((i & 2) != 0) {
                    str = inputField.value;
                }
                if ((i & 4) != 0) {
                    z = inputField.isValid;
                }
                if ((i & 8) != 0) {
                    str2 = inputField.message;
                }
                return inputField.copy(inputFieldError, str, z, str2);
            }

            public final InputFieldError component1() {
                return this.error;
            }

            public final String component2() {
                return this.value;
            }

            public final boolean component3() {
                return this.isValid;
            }

            public final String component4() {
                return this.message;
            }

            public final InputField copy(InputFieldError inputFieldError, String str, boolean z, String str2) {
                zq3.h(str, "value");
                return new InputField(inputFieldError, str, z, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InputField)) {
                    return false;
                }
                InputField inputField = (InputField) obj;
                return zq3.c(this.error, inputField.error) && zq3.c(this.value, inputField.value) && this.isValid == inputField.isValid && zq3.c(this.message, inputField.message);
            }

            public final InputFieldError getError() {
                return this.error;
            }

            public final String getMessage() {
                return this.message;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                InputFieldError inputFieldError = this.error;
                int hashCode = (((((inputFieldError == null ? 0 : inputFieldError.hashCode()) * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isValid)) * 31;
                String str = this.message;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final boolean isValid() {
                return this.isValid;
            }

            public String toString() {
                return "InputField(error=" + this.error + ", value=" + this.value + ", isValid=" + this.isValid + ", message=" + this.message + ")";
            }

            public InputField(InputFieldError inputFieldError, String str, boolean z, String str2) {
                zq3.h(str, "value");
                this.error = inputFieldError;
                this.value = str;
                this.isValid = z;
                this.message = str2;
            }

            public /* synthetic */ InputField(InputFieldError inputFieldError, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : inputFieldError, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2);
            }
        }

        public static final class InputFieldError {
            public static final int $stable = 0;
            private final Integer errorId;
            private final String errorMessage;
            private final Integer limit;

            public InputFieldError() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ InputFieldError copy$default(InputFieldError inputFieldError, String str, Integer num, Integer num2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = inputFieldError.errorMessage;
                }
                if ((i & 2) != 0) {
                    num = inputFieldError.errorId;
                }
                if ((i & 4) != 0) {
                    num2 = inputFieldError.limit;
                }
                return inputFieldError.copy(str, num, num2);
            }

            public final String component1() {
                return this.errorMessage;
            }

            public final Integer component2() {
                return this.errorId;
            }

            public final Integer component3() {
                return this.limit;
            }

            public final InputFieldError copy(String str, Integer num, Integer num2) {
                return new InputFieldError(str, num, num2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InputFieldError)) {
                    return false;
                }
                InputFieldError inputFieldError = (InputFieldError) obj;
                return zq3.c(this.errorMessage, inputFieldError.errorMessage) && zq3.c(this.errorId, inputFieldError.errorId) && zq3.c(this.limit, inputFieldError.limit);
            }

            public final Integer getErrorId() {
                return this.errorId;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final Integer getLimit() {
                return this.limit;
            }

            public int hashCode() {
                String str = this.errorMessage;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.errorId;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.limit;
                return hashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            public String toString() {
                return "InputFieldError(errorMessage=" + this.errorMessage + ", errorId=" + this.errorId + ", limit=" + this.limit + ")";
            }

            public InputFieldError(String str, Integer num, Integer num2) {
                this.errorMessage = str;
                this.errorId = num;
                this.limit = num2;
            }

            public /* synthetic */ InputFieldError(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
            }
        }

        public InputData() {
            this(null, null, null, null, false, 31, null);
        }

        public static /* synthetic */ InputData copy$default(InputData inputData, InputField inputField, InputField inputField2, InputField inputField3, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                inputField = inputData.name;
            }
            if ((i & 2) != 0) {
                inputField2 = inputData.location;
            }
            InputField inputField4 = inputField2;
            if ((i & 4) != 0) {
                inputField3 = inputData.comment;
            }
            InputField inputField5 = inputField3;
            if ((i & 8) != 0) {
                str = inputData.title;
            }
            String str2 = str;
            if ((i & 16) != 0) {
                z = inputData.sendEmailNotification;
            }
            return inputData.copy(inputField, inputField4, inputField5, str2, z);
        }

        public final InputField component1() {
            return this.name;
        }

        public final InputField component2() {
            return this.location;
        }

        public final InputField component3() {
            return this.comment;
        }

        public final String component4() {
            return this.title;
        }

        public final boolean component5() {
            return this.sendEmailNotification;
        }

        public final InputData copy(InputField inputField, InputField inputField2, InputField inputField3, String str, boolean z) {
            zq3.h(inputField, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(inputField2, "location");
            zq3.h(inputField3, "comment");
            zq3.h(str, "title");
            return new InputData(inputField, inputField2, inputField3, str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj;
            return zq3.c(this.name, inputData.name) && zq3.c(this.location, inputData.location) && zq3.c(this.comment, inputData.comment) && zq3.c(this.title, inputData.title) && this.sendEmailNotification == inputData.sendEmailNotification;
        }

        public final InputField getComment() {
            return this.comment;
        }

        public final InputField getLocation() {
            return this.location;
        }

        public final InputField getName() {
            return this.name;
        }

        public final boolean getSendEmailNotification() {
            return this.sendEmailNotification;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.location.hashCode()) * 31) + this.comment.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.sendEmailNotification);
        }

        public String toString() {
            return "InputData(name=" + this.name + ", location=" + this.location + ", comment=" + this.comment + ", title=" + this.title + ", sendEmailNotification=" + this.sendEmailNotification + ")";
        }

        public InputData(InputField inputField, InputField inputField2, InputField inputField3, String str, boolean z) {
            zq3.h(inputField, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(inputField2, "location");
            zq3.h(inputField3, "comment");
            zq3.h(str, "title");
            this.name = inputField;
            this.location = inputField2;
            this.comment = inputField3;
            this.title = str;
            this.sendEmailNotification = z;
        }

        public /* synthetic */ InputData(InputField inputField, InputField inputField2, InputField inputField3, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InputField(null, null, false, null, 15, null) : inputField, (i & 2) != 0 ? new InputField(null, null, false, null, 15, null) : inputField2, (i & 4) != 0 ? new InputField(null, null, false, null, 15, null) : inputField3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? true : z);
        }
    }

    public WriteNewCommentUIState() {
        this(null, false, false, null, false, null, false, false, 255, null);
    }

    public final InputData component1() {
        return this.data;
    }

    public final boolean component2() {
        return this.showSaveDraftCommentAlertDialog;
    }

    public final boolean component3() {
        return this.showSubmitCommentErrorAlertDialog;
    }

    public final String component4() {
        return this.submitCommentErrorMessage;
    }

    public final boolean component5() {
        return this.isLoading;
    }

    public final Finish component6() {
        return this.finish;
    }

    public final boolean component7() {
        return this.isVerifiedUser;
    }

    public final boolean component8() {
        return this.showVerifiedUserError;
    }

    public final WriteNewCommentUIState copy(InputData inputData, boolean z, boolean z2, String str, boolean z3, Finish finish, boolean z4, boolean z5) {
        zq3.h(inputData, "data");
        return new WriteNewCommentUIState(inputData, z, z2, str, z3, finish, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteNewCommentUIState)) {
            return false;
        }
        WriteNewCommentUIState writeNewCommentUIState = (WriteNewCommentUIState) obj;
        return zq3.c(this.data, writeNewCommentUIState.data) && this.showSaveDraftCommentAlertDialog == writeNewCommentUIState.showSaveDraftCommentAlertDialog && this.showSubmitCommentErrorAlertDialog == writeNewCommentUIState.showSubmitCommentErrorAlertDialog && zq3.c(this.submitCommentErrorMessage, writeNewCommentUIState.submitCommentErrorMessage) && this.isLoading == writeNewCommentUIState.isLoading && zq3.c(this.finish, writeNewCommentUIState.finish) && this.isVerifiedUser == writeNewCommentUIState.isVerifiedUser && this.showVerifiedUserError == writeNewCommentUIState.showVerifiedUserError;
    }

    public final InputData getData() {
        return this.data;
    }

    public final Finish getFinish() {
        return this.finish;
    }

    public final boolean getShowSaveDraftCommentAlertDialog() {
        return this.showSaveDraftCommentAlertDialog;
    }

    public final boolean getShowSubmitCommentErrorAlertDialog() {
        return this.showSubmitCommentErrorAlertDialog;
    }

    public final boolean getShowVerifiedUserError() {
        return this.showVerifiedUserError;
    }

    public final String getSubmitCommentErrorMessage() {
        return this.submitCommentErrorMessage;
    }

    public int hashCode() {
        int hashCode = ((((this.data.hashCode() * 31) + Boolean.hashCode(this.showSaveDraftCommentAlertDialog)) * 31) + Boolean.hashCode(this.showSubmitCommentErrorAlertDialog)) * 31;
        String str = this.submitCommentErrorMessage;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        Finish finish = this.finish;
        return ((((hashCode2 + (finish != null ? finish.hashCode() : 0)) * 31) + Boolean.hashCode(this.isVerifiedUser)) * 31) + Boolean.hashCode(this.showVerifiedUserError);
    }

    public final boolean isActionButtonEnabled() {
        return this.data.getName().isValid() && this.data.getLocation().isValid() && this.data.getComment().isValid() && !this.isLoading;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isVerifiedUser() {
        return this.isVerifiedUser;
    }

    public String toString() {
        return "WriteNewCommentUIState(data=" + this.data + ", showSaveDraftCommentAlertDialog=" + this.showSaveDraftCommentAlertDialog + ", showSubmitCommentErrorAlertDialog=" + this.showSubmitCommentErrorAlertDialog + ", submitCommentErrorMessage=" + this.submitCommentErrorMessage + ", isLoading=" + this.isLoading + ", finish=" + this.finish + ", isVerifiedUser=" + this.isVerifiedUser + ", showVerifiedUserError=" + this.showVerifiedUserError + ")";
    }

    public WriteNewCommentUIState(InputData inputData, boolean z, boolean z2, String str, boolean z3, Finish finish, boolean z4, boolean z5) {
        zq3.h(inputData, "data");
        this.data = inputData;
        this.showSaveDraftCommentAlertDialog = z;
        this.showSubmitCommentErrorAlertDialog = z2;
        this.submitCommentErrorMessage = str;
        this.isLoading = z3;
        this.finish = finish;
        this.isVerifiedUser = z4;
        this.showVerifiedUserError = z5;
    }

    public /* synthetic */ WriteNewCommentUIState(InputData inputData, boolean z, boolean z2, String str, boolean z3, Finish finish, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InputData(null, null, null, null, false, 31, null) : inputData, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? true : z3, (i & 32) == 0 ? finish : null, (i & 64) != 0 ? false : z4, (i & 128) == 0 ? z5 : false);
    }
}
