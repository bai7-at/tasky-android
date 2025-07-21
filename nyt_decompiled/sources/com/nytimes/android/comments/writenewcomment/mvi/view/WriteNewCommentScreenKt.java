package com.nytimes.android.comments.writenewcomment.mvi.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentIntent;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel;
import com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Arrays;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class WriteNewCommentScreenKt {
    public static final void ShowSaveDraftCommentAlertDialog(final WriteNewCommentViewModel writeNewCommentViewModel, Composer composer, final int i) {
        zq3.h(writeNewCommentViewModel, "viewModel");
        Composer h = composer.h(672032986);
        if (b.G()) {
            b.S(672032986, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.ShowSaveDraftCommentAlertDialog (WriteNewCommentScreen.kt:273)");
        }
        SaveDraftCommentAlertDialogKt.SaveDraftCommentAlertDialog(new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$ShowSaveDraftCommentAlertDialog$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m304invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m304invoke() {
                WriteNewCommentViewModel.this.intent(WriteNewCommentIntent.DismissSaveDraftCommentDialog.INSTANCE);
            }
        }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$ShowSaveDraftCommentAlertDialog$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m305invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m305invoke() {
                WriteNewCommentViewModel.this.intent(WriteNewCommentIntent.SaveDraftComment.INSTANCE);
            }
        }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$ShowSaveDraftCommentAlertDialog$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m306invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m306invoke() {
                WriteNewCommentViewModel.this.intent(WriteNewCommentIntent.DiscardDraftComment.INSTANCE);
            }
        }, h, 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$ShowSaveDraftCommentAlertDialog$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    WriteNewCommentScreenKt.ShowSaveDraftCommentAlertDialog(WriteNewCommentViewModel.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void ShowSubmitCommentErrorAlertDialog(final WriteNewCommentViewModel writeNewCommentViewModel, final String str, Composer composer, final int i) {
        zq3.h(writeNewCommentViewModel, "viewModel");
        Composer h = composer.h(-2104766717);
        if (b.G()) {
            b.S(-2104766717, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.ShowSubmitCommentErrorAlertDialog (WriteNewCommentScreen.kt:291)");
        }
        SubmitCommentErrorAlertDialogKt.SubmitCommentErrorAlertDialog(new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$ShowSubmitCommentErrorAlertDialog$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m307invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m307invoke() {
                WriteNewCommentViewModel.this.intent(WriteNewCommentIntent.DismissSubmitCommentErrorAlertDialog.INSTANCE);
            }
        }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$ShowSubmitCommentErrorAlertDialog$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m308invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m308invoke() {
                WriteNewCommentViewModel.this.intent(WriteNewCommentIntent.DismissSubmitCommentErrorAlertDialog.INSTANCE);
            }
        }, str, h, (i << 3) & 896);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$ShowSubmitCommentErrorAlertDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    WriteNewCommentScreenKt.ShowSubmitCommentErrorAlertDialog(WriteNewCommentViewModel.this, str, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void WriteNewCommentScreen(final WriteNewCommentViewModel writeNewCommentViewModel, final ss2 ss2Var, final qs2 qs2Var, Composer composer, final int i) {
        Composer composer2;
        zq3.h(writeNewCommentViewModel, "viewModel");
        zq3.h(ss2Var, "finishWithResult");
        zq3.h(qs2Var, "finish");
        Composer h = composer.h(-985349729);
        if (b.G()) {
            b.S(-985349729, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreen (WriteNewCommentScreen.kt:42)");
        }
        x08 b = y.b(writeNewCommentViewModel.getState(), null, h, 8, 1);
        if (WriteNewCommentScreen$lambda$0(b).getFinish() != null) {
            WriteNewCommentUIState.Finish finish = WriteNewCommentScreen$lambda$0(b).getFinish();
            if (zq3.c(finish, WriteNewCommentUIState.Finish.SuccessVerified.INSTANCE)) {
                ss2Var.invoke(WriteNewCommentActivity.Result.SuccessVerified.INSTANCE);
            } else if (zq3.c(finish, WriteNewCommentUIState.Finish.SuccessUnverifiedWithEmail.INSTANCE)) {
                ss2Var.invoke(WriteNewCommentActivity.Result.SuccessUnverifiedWithEmail.INSTANCE);
            } else if (zq3.c(finish, WriteNewCommentUIState.Finish.SuccessUnverifiedWithoutEmail.INSTANCE)) {
                ss2Var.invoke(WriteNewCommentActivity.Result.SuccessUnverifiedWithoutEmail.INSTANCE);
            } else if (zq3.c(finish, WriteNewCommentUIState.Finish.Discard.INSTANCE)) {
                qs2Var.mo865invoke();
            } else {
                qs2Var.mo865invoke();
            }
            if (b.G()) {
                b.R();
            }
            cc7 k = h.k();
            if (k != null) {
                k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreen$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i2) {
                        WriteNewCommentScreenKt.WriteNewCommentScreen(WriteNewCommentViewModel.this, ss2Var, qs2Var, composer3, gt6.a(i | 1));
                    }
                });
                return;
            }
            return;
        }
        WriteNewCommentScreenContent(WriteNewCommentScreen$lambda$0(b).isVerifiedUser(), writeNewCommentViewModel.isReply(), WriteNewCommentScreen$lambda$0(b).isActionButtonEnabled(), WriteNewCommentScreen$lambda$0(b).isLoading(), WriteNewCommentScreen$lambda$0(b).getShowVerifiedUserError(), WriteNewCommentScreen$lambda$0(b).getData(), new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreen$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "input");
                WriteNewCommentViewModel.this.intent(new WriteNewCommentIntent.OnNameEntered(str));
            }
        }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreen$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m309invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m309invoke() {
                WriteNewCommentViewModel.this.intent(WriteNewCommentIntent.NameClick.INSTANCE);
            }
        }, new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreen$4
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "input");
                WriteNewCommentViewModel.this.intent(new WriteNewCommentIntent.OnLocationEntered(str));
            }
        }, new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreen$5
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                WriteNewCommentViewModel.this.intent(new WriteNewCommentIntent.OnEmailMeChecked(z));
            }
        }, new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreen$6
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "input");
                WriteNewCommentViewModel.this.intent(new WriteNewCommentIntent.OnCommentEntered(str));
            }
        }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreen$7
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m310invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m310invoke() {
                WriteNewCommentViewModel.this.intent(WriteNewCommentIntent.CloseScreen.INSTANCE);
            }
        }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreen$8
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m311invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m311invoke() {
                WriteNewCommentViewModel.this.intent(WriteNewCommentIntent.SubmitNewComment.INSTANCE);
            }
        }, h, 0, 0);
        if (WriteNewCommentScreen$lambda$0(b).getShowSaveDraftCommentAlertDialog()) {
            composer2 = h;
            composer2.z(-957173321);
            ShowSaveDraftCommentAlertDialog(writeNewCommentViewModel, composer2, 8);
            composer2.R();
        } else {
            composer2 = h;
            if (WriteNewCommentScreen$lambda$0(b).getShowSubmitCommentErrorAlertDialog()) {
                composer2.z(-957173190);
                ShowSubmitCommentErrorAlertDialog(writeNewCommentViewModel, WriteNewCommentScreen$lambda$0(b).getSubmitCommentErrorMessage(), composer2, 8);
                composer2.R();
            } else {
                composer2.z(-957173024);
                composer2.R();
            }
        }
        if (b.G()) {
            b.R();
        }
        cc7 k2 = composer2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreen$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i2) {
                    WriteNewCommentScreenKt.WriteNewCommentScreen(WriteNewCommentViewModel.this, ss2Var, qs2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    private static final WriteNewCommentUIState WriteNewCommentScreen$lambda$0(x08 x08Var) {
        return (WriteNewCommentUIState) x08Var.getValue();
    }

    public static final void WriteNewCommentScreenContent(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final WriteNewCommentUIState.InputData inputData, final ss2 ss2Var, final qs2 qs2Var, final ss2 ss2Var2, final ss2 ss2Var3, final ss2 ss2Var4, final qs2 qs2Var2, final qs2 qs2Var3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        zq3.h(inputData, "data");
        zq3.h(ss2Var, "onNameChange");
        zq3.h(qs2Var, "onNameClicked");
        zq3.h(ss2Var2, "onLocationChange");
        zq3.h(ss2Var3, "onEmailMeCheckedChange");
        zq3.h(ss2Var4, "onCommentChange");
        zq3.h(qs2Var2, "onCancel");
        zq3.h(qs2Var3, "onSubmit");
        Composer h = composer.h(847794621);
        if ((i & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.a(z2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= h.a(z3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= h.a(z4) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i & 57344) == 0) {
            i3 |= h.a(z5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= h.S(inputData) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= h.C(ss2Var) ? Constants.MB : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= h.C(qs2Var) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= h.C(ss2Var2) ? 67108864 : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= h.C(ss2Var3) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (h.C(ss2Var4) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.C(qs2Var2) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= h.C(qs2Var3) ? 256 : 128;
        }
        int i5 = i4;
        if ((i3 & 1533916891) == 306783378 && (i5 & 731) == 146 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(847794621, i3, i5, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenContent (WriteNewCommentScreen.kt:134)");
            }
            final ScrollState c = ScrollKt.c(0, h, 0, 1);
            h.z(773894976);
            h.z(-492369756);
            Object A = h.A();
            if (A == Composer.a.a()) {
                e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
                h.q(eVar);
                A = eVar;
            }
            h.R();
            CoroutineScope a = ((e) A).a();
            h.R();
            h.z(-943197520);
            if (c.a()) {
                py1.d(ww8.a, new WriteNewCommentScreenKt$WriteNewCommentScreenContent$1(a, c, null), h, 70);
            }
            h.R();
            composer2 = h;
            NytThemeKt.a(false, null, null, zr0.b(composer2, 1662400333, true, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(1662400333, i6, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenContent.<anonymous> (WriteNewCommentScreen.kt:148)");
                    }
                    final boolean z6 = z2;
                    final boolean z7 = z;
                    final boolean z8 = z3;
                    final qs2 qs2Var4 = qs2Var2;
                    final qs2 qs2Var5 = qs2Var3;
                    yr0 b = zr0.b(composer3, 1761443680, true, new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContent$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer4, int i7) {
                            String b2;
                            if ((i7 & 11) == 2 && composer4.i()) {
                                composer4.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(1761443680, i7, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenContent.<anonymous>.<anonymous> (WriteNewCommentScreen.kt:150)");
                            }
                            if (z6) {
                                composer4.z(609041420);
                                b2 = k48.b(R.string.write_reply_screen_title, composer4, 0);
                                composer4.R();
                            } else {
                                composer4.z(609041528);
                                b2 = k48.b(R.string.write_new_comment_screen_title, composer4, 0);
                                composer4.R();
                            }
                            WriteNewCommentTopAppBarKt.WriteNewCommentTopAppBar(null, b2, k48.b(R.string.write_new_comment_screen_back_button, composer4, 0), k48.b(z7 ? R.string.write_new_comment_screen_publish_action_button : R.string.write_new_comment_screen_submit_action_button, composer4, 0), z8, qs2Var4, qs2Var5, composer4, 0, 1);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    });
                    final boolean z9 = z4;
                    final ScrollState scrollState = c;
                    final WriteNewCommentUIState.InputData inputData2 = inputData;
                    final boolean z10 = z;
                    final boolean z11 = z5;
                    final qs2 qs2Var6 = qs2Var;
                    final ss2 ss2Var5 = ss2Var;
                    final ss2 ss2Var6 = ss2Var2;
                    final ss2 ss2Var7 = ss2Var3;
                    final ss2 ss2Var8 = ss2Var4;
                    NytScaffoldKt.a(null, b, null, 0.0f, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, null, null, zr0.b(composer3, 440523150, true, new it2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContent$2.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(ym5 ym5Var, Composer composer4, int i7) {
                            ss2 ss2Var9;
                            String errorMessage;
                            String str;
                            BoxScopeInstance boxScopeInstance;
                            String str2;
                            String str3;
                            String errorMessage2;
                            String str4;
                            String str5;
                            String str6;
                            String str7;
                            zq3.h(ym5Var, "it");
                            if ((i7 & 81) == 16 && composer4.i()) {
                                composer4.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(440523150, i7, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenContent.<anonymous>.<anonymous> (WriteNewCommentScreen.kt:174)");
                            }
                            Modifier.a aVar = Modifier.a;
                            Modifier h2 = SizeKt.h(aVar, 0.0f, 1, null);
                            boolean z12 = z9;
                            ScrollState scrollState2 = scrollState;
                            WriteNewCommentUIState.InputData inputData3 = inputData2;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            qs2 qs2Var7 = qs2Var6;
                            ss2 ss2Var10 = ss2Var5;
                            ss2 ss2Var11 = ss2Var6;
                            ss2 ss2Var12 = ss2Var7;
                            ss2 ss2Var13 = ss2Var8;
                            composer4.z(733328855);
                            Alignment.a aVar2 = Alignment.a;
                            rg4 g = BoxKt.g(aVar2.o(), false, composer4, 0);
                            composer4.z(-1323940314);
                            int a2 = cs0.a(composer4, 0);
                            et0 o = composer4.o();
                            ComposeUiNode.Companion companion = ComposeUiNode.F;
                            qs2 a3 = companion.a();
                            it2 c2 = LayoutKt.c(h2);
                            if (composer4.j() == null) {
                                cs0.c();
                            }
                            composer4.G();
                            if (composer4.f()) {
                                composer4.D(a3);
                            } else {
                                composer4.p();
                            }
                            Composer a4 = Updater.a(composer4);
                            Updater.c(a4, g, companion.e());
                            Updater.c(a4, o, companion.g());
                            gt2 b2 = companion.b();
                            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                                a4.q(Integer.valueOf(a2));
                                a4.v(Integer.valueOf(a2), b2);
                            }
                            c2.invoke(ju7.a(ju7.b(composer4)), composer4, 0);
                            composer4.z(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                            if (z12) {
                                composer4.z(-2123971134);
                                ProgressIndicatorKt.a(boxScopeInstance2.c(aVar, aVar2.e()), 0L, 0.0f, 0L, 0, composer4, 0, 30);
                                composer4.R();
                            } else {
                                composer4.z(-2123970960);
                                Modifier d = SizeKt.d(BackgroundKt.d(aVar, eb5.Companion.a(composer4, 8).a(), null, 2, null), 0.0f, 1, null);
                                float f = 14;
                                float g2 = bu1.g(f);
                                float g3 = bu1.g(f);
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.a;
                                Modifier f2 = ScrollKt.f(boxScopeInstance2.c(PaddingKt.m(d, g2, 0.0f, g3, textFieldDefaults.d(), 2, null), aVar2.m()), scrollState2, false, null, false, 14, null);
                                composer4.z(-483455358);
                                rg4 a5 = d.a(Arrangement.a.g(), aVar2.k(), composer4, 0);
                                composer4.z(-1323940314);
                                int a6 = cs0.a(composer4, 0);
                                et0 o2 = composer4.o();
                                qs2 a7 = companion.a();
                                it2 c3 = LayoutKt.c(f2);
                                if (composer4.j() == null) {
                                    cs0.c();
                                }
                                composer4.G();
                                if (composer4.f()) {
                                    composer4.D(a7);
                                } else {
                                    composer4.p();
                                }
                                Composer a8 = Updater.a(composer4);
                                Updater.c(a8, a5, companion.e());
                                Updater.c(a8, o2, companion.g());
                                gt2 b3 = companion.b();
                                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                                    a8.q(Integer.valueOf(a6));
                                    a8.v(Integer.valueOf(a6), b3);
                                }
                                c3.invoke(ju7.a(ju7.b(composer4)), composer4, 0);
                                composer4.z(2058660585);
                                ap0 ap0Var = ap0.a;
                                SpacerKt.a(SizeKt.i(aVar, bu1.g(24)), composer4, 6);
                                if (z13) {
                                    composer4.z(331867482);
                                    ss2Var9 = ss2Var13;
                                    WriteNewCommentTextKt.WriteNewCommentText(inputData3.getName().getValue(), inputData3.getTitle(), 0, z14, null, qs2Var7, composer4, 0, 20);
                                    composer4.R();
                                    str5 = "format(...)";
                                    boxScopeInstance = boxScopeInstance2;
                                    str2 = null;
                                } else {
                                    ss2Var9 = ss2Var13;
                                    composer4.z(331867828);
                                    String value = inputData3.getName().getValue();
                                    String b4 = k48.b(R.string.write_new_comment_screen_name_field_placeholder, composer4, 0);
                                    WriteNewCommentUIState.InputData.InputFieldError error = inputData3.getName().getError();
                                    composer4.z(331868226);
                                    if (error == null) {
                                        str = null;
                                    } else {
                                        composer4.z(331868277);
                                        if (error.getErrorId() != null) {
                                            errorMessage = String.format(k48.b(error.getErrorId().intValue(), composer4, 0), Arrays.copyOf(new Object[]{error.getLimit()}, 1));
                                            zq3.g(errorMessage, "format(...)");
                                        } else {
                                            errorMessage = error.getErrorMessage();
                                        }
                                        composer4.R();
                                        str = errorMessage;
                                    }
                                    composer4.R();
                                    boxScopeInstance = boxScopeInstance2;
                                    str2 = null;
                                    WriteNewCommentTextFieldKt.WriteNewCommentTextField(value, b4, "Name Field", 0, str, null, null, null, ss2Var10, composer4, 384, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL);
                                    String value2 = inputData3.getLocation().getValue();
                                    String b5 = k48.b(R.string.write_new_comment_screen_location_field_placeholder, composer4, 0);
                                    WriteNewCommentUIState.InputData.InputFieldError error2 = inputData3.getLocation().getError();
                                    composer4.z(331869112);
                                    if (error2 == null) {
                                        str4 = null;
                                        str3 = "format(...)";
                                    } else {
                                        composer4.z(331869163);
                                        if (error2.getErrorId() != null) {
                                            errorMessage2 = String.format(k48.b(error2.getErrorId().intValue(), composer4, 0), Arrays.copyOf(new Object[]{error2.getLimit()}, 1));
                                            str3 = "format(...)";
                                            zq3.g(errorMessage2, str3);
                                        } else {
                                            str3 = "format(...)";
                                            errorMessage2 = error2.getErrorMessage();
                                        }
                                        composer4.R();
                                        str4 = errorMessage2;
                                    }
                                    composer4.R();
                                    str5 = str3;
                                    WriteNewCommentTextFieldKt.WriteNewCommentTextField(value2, b5, "Location Field", 0, str4, null, null, null, ss2Var11, composer4, 384, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL);
                                    WriteNewCommentSwitchBoxKt.WriteNewCommentSwitchBox(null, k48.b(R.string.write_new_comment_screen_email_me_label, composer4, 0), inputData3.getSendEmailNotification(), ss2Var12, composer4, 0, 1);
                                    composer4.R();
                                }
                                WriteNewCommentTextAreaKt.WriteNewCommentTextArea(ModifierUtilsKt.d(aVar, "Share Your Thoughts Field"), inputData3.getComment().getValue(), k48.b(R.string.write_new_comment_screen_comment_field_placeholder, composer4, 0), ss2Var9, composer4, 0, 0);
                                composer4.R();
                                composer4.t();
                                composer4.R();
                                composer4.R();
                                Modifier c4 = boxScopeInstance.c(SizeKt.b(SizeKt.h(aVar, 0.0f, 1, str2), 0.0f, textFieldDefaults.d(), 1, str2), aVar2.b());
                                WriteNewCommentUIState.InputData.InputFieldError error3 = inputData3.getComment().getError();
                                composer4.z(-2123966902);
                                if (error3 == null) {
                                    str7 = str2;
                                } else {
                                    composer4.z(-2123966859);
                                    if (error3.getErrorId() != null) {
                                        str6 = String.format(k48.b(error3.getErrorId().intValue(), composer4, 0), Arrays.copyOf(new Object[]{error3.getLimit()}, 1));
                                        zq3.g(str6, str5);
                                    } else {
                                        str6 = str2;
                                    }
                                    composer4.R();
                                    str7 = str6;
                                }
                                composer4.R();
                                WriteNewCommentFooterKt.WriteNewCommentFooter(c4, str7, inputData3.getComment().getMessage(), composer4, 0, 0);
                                composer4.R();
                            }
                            composer4.R();
                            composer4.t();
                            composer4.R();
                            composer4.R();
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer3, 48, 0, 6, 1048573);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), composer2, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    WriteNewCommentScreenKt.WriteNewCommentScreenContent(z, z2, z3, z4, z5, inputData, ss2Var, qs2Var, ss2Var2, ss2Var3, ss2Var4, qs2Var2, qs2Var3, composer3, gt6.a(i | 1), gt6.a(i2));
                }
            });
        }
    }

    public static final void WriteNewCommentScreenContentPreview(Composer composer, final int i) {
        Composer h = composer.h(1257863277);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1257863277, i, -1, "com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenContentPreview (WriteNewCommentScreen.kt:306)");
            }
            WriteNewCommentScreenContent(false, false, false, true, false, new WriteNewCommentUIState.InputData(null, null, null, null, false, 31, null), new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContentPreview$1
                public final void invoke(String str) {
                    zq3.h(str, "it");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }
            }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContentPreview$2
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m312invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m312invoke();
                    return ww8.a;
                }
            }, new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContentPreview$3
                public final void invoke(String str) {
                    zq3.h(str, "it");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }
            }, new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContentPreview$4
                public final void invoke(boolean z) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }
            }, new ss2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContentPreview$5
                public final void invoke(String str) {
                    zq3.h(str, "it");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }
            }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContentPreview$6
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m313invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m313invoke();
                    return ww8.a;
                }
            }, new qs2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContentPreview$7
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m314invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m314invoke();
                    return ww8.a;
                }
            }, h, 920153526, 438);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentScreenKt$WriteNewCommentScreenContentPreview$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    WriteNewCommentScreenKt.WriteNewCommentScreenContentPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
