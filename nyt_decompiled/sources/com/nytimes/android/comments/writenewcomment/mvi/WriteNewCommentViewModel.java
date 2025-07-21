package com.nytimes.android.comments.writenewcomment.mvi;

import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult;
import com.nytimes.android.comments.writenewcomment.data.repository.CommenterDetails;
import com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences;
import com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentIntent;
import com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.by0;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s42;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class WriteNewCommentViewModel extends q {
    private static final int MAXIMUM_COMMENT_LENGTH = 1500;
    private static final int MAXIMUM_LOCATION_LENGTH = 40;
    private static final int MAXIMUM_NAME_LENGTH = 40;
    public static final String WRITE_NEW_COMMENT_IS_REPLY = "isReply";
    public static final String WRITE_NEW_COMMENT_PARENT_COMMENT_ID = "parentCommentId";
    public static final String WRITE_NEW_COMMENT_REPLY_NAME = "replyName";
    private String articleUrl;
    private final ET2Scope et2Scope;
    private boolean isReply;
    private MutableStateFlow<WriteNewCommentUIState> mutableState;
    private long parentCommentId;
    private String replyName;
    private final StateFlow<WriteNewCommentUIState> state;
    private final WriteNewCommentRepository writeNewCommentRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @fc1(c = "com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$1", f = "WriteNewCommentViewModel.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass1(by0<? super AnonymousClass1> by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            return WriteNewCommentViewModel.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                WriteNewCommentViewModel writeNewCommentViewModel = WriteNewCommentViewModel.this;
                this.label = 1;
                if (writeNewCommentViewModel.syncCommenterDetails(this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public WriteNewCommentViewModel(WriteNewCommentRepository writeNewCommentRepository, ET2Scope eT2Scope, n nVar) {
        zq3.h(writeNewCommentRepository, "writeNewCommentRepository");
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(nVar, "savedStateHandle");
        this.writeNewCommentRepository = writeNewCommentRepository;
        this.et2Scope = eT2Scope;
        String str = (String) nVar.d("com.nytimes.android.extra.ASSET_URL");
        if (str == null) {
            throw new IllegalStateException("Not possible to write a comment without articleUrl");
        }
        this.articleUrl = str;
        Boolean bool = (Boolean) nVar.d(WRITE_NEW_COMMENT_IS_REPLY);
        this.isReply = bool != null ? bool.booleanValue() : false;
        this.replyName = (String) nVar.d(WRITE_NEW_COMMENT_REPLY_NAME);
        Long l = (Long) nVar.d(WRITE_NEW_COMMENT_PARENT_COMMENT_ID);
        this.parentCommentId = l != null ? l.longValue() : 0L;
        MutableStateFlow<WriteNewCommentUIState> MutableStateFlow = StateFlowKt.MutableStateFlow(new WriteNewCommentUIState(null, false, false, null, false, null, false, false, 255, null));
        this.mutableState = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void dismissUI() {
        WriteNewCommentUIState value;
        WriteNewCommentUIState copy;
        MutableStateFlow<WriteNewCommentUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            copy = r1.copy((r18 & 1) != 0 ? r1.data : null, (r18 & 2) != 0 ? r1.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? r1.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? r1.submitCommentErrorMessage : null, (r18 & 16) != 0 ? r1.isLoading : false, (r18 & 32) != 0 ? r1.finish : WriteNewCommentUIState.Finish.Discard.INSTANCE, (r18 & 64) != 0 ? r1.isVerifiedUser : false, (r18 & 128) != 0 ? value.showVerifiedUserError : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissUIWithSuccess() {
        WriteNewCommentUIState value;
        WriteNewCommentUIState copy;
        MutableStateFlow<WriteNewCommentUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r18 & 1) != 0 ? r2.data : null, (r18 & 2) != 0 ? r2.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? r2.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? r2.submitCommentErrorMessage : null, (r18 & 16) != 0 ? r2.isLoading : false, (r18 & 32) != 0 ? r2.finish : this.mutableState.getValue().isVerifiedUser() ? WriteNewCommentUIState.Finish.SuccessVerified.INSTANCE : this.mutableState.getValue().getData().getSendEmailNotification() ? WriteNewCommentUIState.Finish.SuccessUnverifiedWithEmail.INSTANCE : WriteNewCommentUIState.Finish.SuccessUnverifiedWithoutEmail.INSTANCE, (r18 & 64) != 0 ? r2.isVerifiedUser : false, (r18 & 128) != 0 ? value.showVerifiedUserError : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleSubmitNewCommentResult(defpackage.by0<? super defpackage.ww8> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$1 r0 = (com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$1 r0 = new com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel r5 = (com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel) r5
            kotlin.f.b(r6)
            goto L4a
        L3c:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.submitNewComment(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2 r2 = new com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2
            r2.<init>(r5)
            r5 = 0
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r5 = r6.collect(r2, r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel.handleSubmitNewCommentResult(by0):java.lang.Object");
    }

    private final void onCommentEntered(String str) {
        WriteNewCommentUIState value;
        WriteNewCommentUIState.InputData copy$default;
        WriteNewCommentUIState copy;
        MutableStateFlow<WriteNewCommentUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            WriteNewCommentUIState writeNewCommentUIState = value;
            if (h.d0(str)) {
                copy$default = WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), null, null, writeNewCommentUIState.getData().getComment().copy(new WriteNewCommentUIState.InputData.InputFieldError(null, Integer.valueOf(R.string.write_new_comment_screen_comment_minimum_text_error), null, 5, null), str, false, str.length() + "/1500"), null, false, 27, null);
            } else if (str.length() > 1500) {
                copy$default = WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), null, null, writeNewCommentUIState.getData().getComment().copy(new WriteNewCommentUIState.InputData.InputFieldError(null, Integer.valueOf(R.string.write_new_comment_screen_comment_maximum_text_error), 1500, 1, null), str, false, str.length() + "/1500"), null, false, 27, null);
            } else {
                copy$default = WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), null, null, writeNewCommentUIState.getData().getComment().copy(new WriteNewCommentUIState.InputData.InputFieldError(null, null, null, 5, null), str, true, str.length() + "/1500"), null, false, 27, null);
            }
            copy = writeNewCommentUIState.copy((r18 & 1) != 0 ? writeNewCommentUIState.data : copy$default, (r18 & 2) != 0 ? writeNewCommentUIState.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? writeNewCommentUIState.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? writeNewCommentUIState.submitCommentErrorMessage : null, (r18 & 16) != 0 ? writeNewCommentUIState.isLoading : false, (r18 & 32) != 0 ? writeNewCommentUIState.finish : null, (r18 & 64) != 0 ? writeNewCommentUIState.isVerifiedUser : false, (r18 & 128) != 0 ? writeNewCommentUIState.showVerifiedUserError : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    private final void onEmailMeChecked(boolean z) {
        WriteNewCommentUIState value;
        WriteNewCommentUIState copy;
        MutableStateFlow<WriteNewCommentUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            WriteNewCommentUIState writeNewCommentUIState = value;
            copy = writeNewCommentUIState.copy((r18 & 1) != 0 ? writeNewCommentUIState.data : WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), null, null, null, null, z, 15, null), (r18 & 2) != 0 ? writeNewCommentUIState.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? writeNewCommentUIState.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? writeNewCommentUIState.submitCommentErrorMessage : null, (r18 & 16) != 0 ? writeNewCommentUIState.isLoading : false, (r18 & 32) != 0 ? writeNewCommentUIState.finish : null, (r18 & 64) != 0 ? writeNewCommentUIState.isVerifiedUser : false, (r18 & 128) != 0 ? writeNewCommentUIState.showVerifiedUserError : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    private final void onLocationEntered(String str) {
        WriteNewCommentUIState value;
        WriteNewCommentUIState copy;
        MutableStateFlow<WriteNewCommentUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            WriteNewCommentUIState writeNewCommentUIState = value;
            copy = writeNewCommentUIState.copy((r18 & 1) != 0 ? writeNewCommentUIState.data : !h.d0(str) ? str.length() > 40 ? WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), null, WriteNewCommentUIState.InputData.InputField.copy$default(writeNewCommentUIState.getData().getLocation(), new WriteNewCommentUIState.InputData.InputFieldError(null, Integer.valueOf(R.string.write_new_comment_screen_location_maximum_error_field), 40, 1, null), str, false, null, 8, null), null, null, false, 29, null) : WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), null, WriteNewCommentUIState.InputData.InputField.copy$default(writeNewCommentUIState.getData().getLocation(), null, str, true, null, 8, null), null, null, false, 29, null) : WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), null, WriteNewCommentUIState.InputData.InputField.copy$default(writeNewCommentUIState.getData().getLocation(), new WriteNewCommentUIState.InputData.InputFieldError(null, Integer.valueOf(R.string.write_new_comment_screen_location_minimum_error_field), null, 5, null), str, false, null, 8, null), null, null, false, 29, null), (r18 & 2) != 0 ? writeNewCommentUIState.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? writeNewCommentUIState.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? writeNewCommentUIState.submitCommentErrorMessage : null, (r18 & 16) != 0 ? writeNewCommentUIState.isLoading : false, (r18 & 32) != 0 ? writeNewCommentUIState.finish : null, (r18 & 64) != 0 ? writeNewCommentUIState.isVerifiedUser : false, (r18 & 128) != 0 ? writeNewCommentUIState.showVerifiedUserError : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    private final void onNameEntered(String str) {
        WriteNewCommentUIState value;
        WriteNewCommentUIState copy;
        MutableStateFlow<WriteNewCommentUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            WriteNewCommentUIState writeNewCommentUIState = value;
            copy = writeNewCommentUIState.copy((r18 & 1) != 0 ? writeNewCommentUIState.data : !h.d0(str) ? str.length() > 40 ? WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), WriteNewCommentUIState.InputData.InputField.copy$default(writeNewCommentUIState.getData().getName(), new WriteNewCommentUIState.InputData.InputFieldError(null, Integer.valueOf(R.string.write_new_comment_screen_name_maximum_error_field), 40, 1, null), str, false, null, 8, null), null, null, null, false, 30, null) : WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), WriteNewCommentUIState.InputData.InputField.copy$default(writeNewCommentUIState.getData().getName(), null, str, true, null, 8, null), null, null, null, false, 30, null) : WriteNewCommentUIState.InputData.copy$default(writeNewCommentUIState.getData(), WriteNewCommentUIState.InputData.InputField.copy$default(writeNewCommentUIState.getData().getName(), new WriteNewCommentUIState.InputData.InputFieldError(null, Integer.valueOf(R.string.write_new_comment_screen_name_minimum_error_field), null, 5, null), str, false, null, 8, null), null, null, null, false, 30, null), (r18 & 2) != 0 ? writeNewCommentUIState.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? writeNewCommentUIState.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? writeNewCommentUIState.submitCommentErrorMessage : null, (r18 & 16) != 0 ? writeNewCommentUIState.isLoading : false, (r18 & 32) != 0 ? writeNewCommentUIState.finish : null, (r18 & 64) != 0 ? writeNewCommentUIState.isVerifiedUser : false, (r18 & 128) != 0 ? writeNewCommentUIState.showVerifiedUserError : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNewCommentEvent() {
        String str = this.isReply ? "reply to comment" : "new comment";
        ET2PageScope.DefaultImpls.a(this.et2Scope, new e52.e(), new s42(str, str, null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object submitNewComment(by0<? super Flow<? extends SubmitNewCommentResult>> by0Var) {
        return this.writeNewCommentRepository.submitNewComment(this.articleUrl, this.state.getValue().getData().getComment().getValue(), this.state.getValue().getData().getName().getValue(), this.state.getValue().getData().getLocation().getValue(), this.state.getValue().getData().getSendEmailNotification(), this.parentCommentId, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object syncCommenterDetails(by0<? super ww8> by0Var) {
        Object collect = this.writeNewCommentRepository.getCommenterPreferences(this.articleUrl, this.parentCommentId).collect(new FlowCollector() { // from class: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$syncCommenterDetails$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var2) {
                return emit((CommenterDetails) obj, (by0<? super ww8>) by0Var2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(CommenterDetails commenterDetails, by0<? super ww8> by0Var2) {
                MutableStateFlow mutableStateFlow;
                Object value;
                WriteNewCommentUIState copy;
                String str;
                String commenterName = commenterDetails.getCommenterPreferences().getCommenterName();
                String commenterLocation = commenterDetails.getCommenterPreferences().getCommenterLocation();
                boolean sendEmailNotification = commenterDetails.getCommenterPreferences().getSendEmailNotification();
                boolean isVerifiedUser = commenterDetails.getCommenterPreferences().isVerifiedUser();
                String title = commenterDetails.getCommenterPreferences().getTitle();
                String draftComment = commenterDetails.getDraftComment();
                if (draftComment == null) {
                    if (WriteNewCommentViewModel.this.isReply()) {
                        str = WriteNewCommentViewModel.this.replyName;
                        draftComment = "@" + str + " ";
                    } else {
                        draftComment = "";
                    }
                }
                String str2 = draftComment;
                WriteNewCommentUIState.InputData inputData = new WriteNewCommentUIState.InputData(new WriteNewCommentUIState.InputData.InputField(null, commenterName, commenterName.length() > 0, null, 9, null), new WriteNewCommentUIState.InputData.InputField(null, commenterLocation, commenterLocation.length() > 0, null, 9, null), new WriteNewCommentUIState.InputData.InputField(null, str2, str2.length() > 0, null, 9, null), title, sendEmailNotification);
                mutableStateFlow = WriteNewCommentViewModel.this.mutableState;
                do {
                    value = mutableStateFlow.getValue();
                    copy = r13.copy((r18 & 1) != 0 ? r13.data : inputData, (r18 & 2) != 0 ? r13.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? r13.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? r13.submitCommentErrorMessage : null, (r18 & 16) != 0 ? r13.isLoading : false, (r18 & 32) != 0 ? r13.finish : null, (r18 & 64) != 0 ? r13.isVerifiedUser : isVerifiedUser, (r18 & 128) != 0 ? ((WriteNewCommentUIState) value).showVerifiedUserError : false);
                } while (!mutableStateFlow.compareAndSet(value, copy));
                return ww8.a;
            }
        }, by0Var);
        return collect == a.h() ? collect : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object tryDiscardDraftComment(by0<? super ww8> by0Var) {
        Object discardDraftComment = this.writeNewCommentRepository.discardDraftComment(this.articleUrl, this.parentCommentId, by0Var);
        return discardDraftComment == a.h() ? discardDraftComment : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trySaveDraftComment(by0<? super ww8> by0Var) {
        if (!this.state.getValue().getData().getComment().isValid()) {
            return ww8.a;
        }
        Object saveDraftComment = this.writeNewCommentRepository.saveDraftComment(this.articleUrl, this.parentCommentId, this.state.getValue().getData().getComment().getValue(), by0Var);
        return saveDraftComment == a.h() ? saveDraftComment : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCommenterPreferences() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new WriteNewCommentViewModel$updateCommenterPreferences$1(this, new CommenterPreferences(this.state.getValue().getData().getName().getValue(), this.state.getValue().getData().getLocation().getValue(), false, false, null, 28, null), null), 3, null);
    }

    public final String getArticleUrl() {
        return this.articleUrl;
    }

    public final StateFlow<WriteNewCommentUIState> getState() {
        return this.state;
    }

    public final void intent(WriteNewCommentIntent writeNewCommentIntent) {
        WriteNewCommentUIState value;
        WriteNewCommentUIState copy;
        WriteNewCommentUIState value2;
        WriteNewCommentUIState copy2;
        WriteNewCommentUIState value3;
        WriteNewCommentUIState copy3;
        WriteNewCommentUIState value4;
        WriteNewCommentUIState copy4;
        zq3.h(writeNewCommentIntent, "writeNewCommentIntent");
        if (zq3.c(writeNewCommentIntent, WriteNewCommentIntent.SubmitNewComment.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new WriteNewCommentViewModel$intent$1(this, null), 3, null);
            return;
        }
        if (zq3.c(writeNewCommentIntent, WriteNewCommentIntent.SaveDraftComment.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new WriteNewCommentViewModel$intent$2(this, null), 3, null);
            dismissUI();
            return;
        }
        if (zq3.c(writeNewCommentIntent, WriteNewCommentIntent.DismissSaveDraftCommentDialog.INSTANCE)) {
            MutableStateFlow<WriteNewCommentUIState> mutableStateFlow = this.mutableState;
            do {
                value4 = mutableStateFlow.getValue();
                copy4 = r1.copy((r18 & 1) != 0 ? r1.data : null, (r18 & 2) != 0 ? r1.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? r1.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? r1.submitCommentErrorMessage : null, (r18 & 16) != 0 ? r1.isLoading : false, (r18 & 32) != 0 ? r1.finish : null, (r18 & 64) != 0 ? r1.isVerifiedUser : false, (r18 & 128) != 0 ? value4.showVerifiedUserError : false);
            } while (!mutableStateFlow.compareAndSet(value4, copy4));
            return;
        }
        if (zq3.c(writeNewCommentIntent, WriteNewCommentIntent.DismissSubmitCommentErrorAlertDialog.INSTANCE)) {
            MutableStateFlow<WriteNewCommentUIState> mutableStateFlow2 = this.mutableState;
            do {
                value3 = mutableStateFlow2.getValue();
                copy3 = r1.copy((r18 & 1) != 0 ? r1.data : null, (r18 & 2) != 0 ? r1.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? r1.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? r1.submitCommentErrorMessage : null, (r18 & 16) != 0 ? r1.isLoading : false, (r18 & 32) != 0 ? r1.finish : null, (r18 & 64) != 0 ? r1.isVerifiedUser : false, (r18 & 128) != 0 ? value3.showVerifiedUserError : false);
            } while (!mutableStateFlow2.compareAndSet(value3, copy3));
            return;
        }
        if (zq3.c(writeNewCommentIntent, WriteNewCommentIntent.DiscardDraftComment.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new WriteNewCommentViewModel$intent$5(this, null), 3, null);
            dismissUI();
            return;
        }
        if (zq3.c(writeNewCommentIntent, WriteNewCommentIntent.NameClick.INSTANCE)) {
            MutableStateFlow<WriteNewCommentUIState> mutableStateFlow3 = this.mutableState;
            do {
                value2 = mutableStateFlow3.getValue();
                copy2 = r1.copy((r18 & 1) != 0 ? r1.data : null, (r18 & 2) != 0 ? r1.showSaveDraftCommentAlertDialog : false, (r18 & 4) != 0 ? r1.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? r1.submitCommentErrorMessage : null, (r18 & 16) != 0 ? r1.isLoading : false, (r18 & 32) != 0 ? r1.finish : null, (r18 & 64) != 0 ? r1.isVerifiedUser : false, (r18 & 128) != 0 ? value2.showVerifiedUserError : true);
            } while (!mutableStateFlow3.compareAndSet(value2, copy2));
            return;
        }
        if (writeNewCommentIntent instanceof WriteNewCommentIntent.CloseScreen) {
            if (!this.state.getValue().getData().getComment().isValid()) {
                dismissUI();
                return;
            }
            MutableStateFlow<WriteNewCommentUIState> mutableStateFlow4 = this.mutableState;
            do {
                value = mutableStateFlow4.getValue();
                copy = r0.copy((r18 & 1) != 0 ? r0.data : null, (r18 & 2) != 0 ? r0.showSaveDraftCommentAlertDialog : true, (r18 & 4) != 0 ? r0.showSubmitCommentErrorAlertDialog : false, (r18 & 8) != 0 ? r0.submitCommentErrorMessage : null, (r18 & 16) != 0 ? r0.isLoading : false, (r18 & 32) != 0 ? r0.finish : null, (r18 & 64) != 0 ? r0.isVerifiedUser : false, (r18 & 128) != 0 ? value.showVerifiedUserError : false);
            } while (!mutableStateFlow4.compareAndSet(value, copy));
            return;
        }
        if (writeNewCommentIntent instanceof WriteNewCommentIntent.OnNameEntered) {
            onNameEntered(((WriteNewCommentIntent.OnNameEntered) writeNewCommentIntent).getInput());
            return;
        }
        if (writeNewCommentIntent instanceof WriteNewCommentIntent.OnLocationEntered) {
            onLocationEntered(((WriteNewCommentIntent.OnLocationEntered) writeNewCommentIntent).getInput());
        } else if (writeNewCommentIntent instanceof WriteNewCommentIntent.OnEmailMeChecked) {
            onEmailMeChecked(((WriteNewCommentIntent.OnEmailMeChecked) writeNewCommentIntent).getChecked());
        } else if (writeNewCommentIntent instanceof WriteNewCommentIntent.OnCommentEntered) {
            onCommentEntered(((WriteNewCommentIntent.OnCommentEntered) writeNewCommentIntent).getInput());
        }
    }

    public final boolean isReply() {
        return this.isReply;
    }

    public final void setArticleUrl(String str) {
        zq3.h(str, "<set-?>");
        this.articleUrl = str;
    }

    public final void setReply(boolean z) {
        this.isReply = z;
    }
}
