package com.nytimes.android.comments.comments.mvi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.a;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity;
import com.nytimes.android.comments.comments.mvi.navigation.NavigationIntent;
import com.nytimes.android.comments.comments.mvi.navigation.Navigator;
import com.nytimes.android.comments.comments.mvi.navigation.ViewCommentsScreen;
import com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentActivity;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.ShareOrigin;
import com.nytimes.android.utils.snackbar.a;
import defpackage.at7;
import defpackage.c04;
import defpackage.d5;
import defpackage.gp0;
import defpackage.h90;
import defpackage.i5;
import defpackage.j5;
import defpackage.qs2;
import defpackage.t21;
import defpackage.tq0;
import defpackage.uq7;
import defpackage.xs5;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ViewingCommentsActivity extends Hilt_ViewingCommentsActivity implements a {
    private static final String ARG_SCREEN_ROUTE = "SCREEN_ROUTE";
    private static final String ARG_TOTAL_COMMENTS = "TOTAL_COMMENTS";
    private Navigator navigator;
    public uq7 sharingManager;
    public at7 singleArticleActivityNavigator;
    private final j5 startForResult;
    private final c04 viewModel$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent newIntent(Context context, ViewCommentsScreen viewCommentsScreen, String str, String str2, String str3, long j, boolean z) {
            zq3.h(context, "context");
            zq3.h(viewCommentsScreen, "screen");
            zq3.h(str, "articleUrl");
            zq3.h(str3, "totalComments");
            Intent putExtra = new Intent(context, (Class<?>) ViewingCommentsActivity.class).putExtra(ViewingCommentsActivity.ARG_SCREEN_ROUTE, viewCommentsScreen.getRoute()).putExtra("com.nytimes.android.extra.ASSET_URL", str).putExtra("com.nytimes.android.extra.ASSET_URI", str2).putExtra("com.nytimes.android.extra.COMMENT_ID", j).putExtra("com.nytimes.android.extra.STARTMAIN_ON_NAV_UP", z).putExtra(ViewingCommentsActivity.ARG_TOTAL_COMMENTS, str3);
            zq3.g(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    public ViewingCommentsActivity() {
        final qs2 qs2Var = null;
        this.viewModel$delegate = new s(zt6.b(CommentsViewModel.class), new qs2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                t21 t21Var;
                qs2 qs2Var2 = qs2.this;
                return (qs2Var2 == null || (t21Var = (t21) qs2Var2.mo865invoke()) == null) ? this.getDefaultViewModelCreationExtras() : t21Var;
            }
        });
        j5 registerForActivityResult = registerForActivityResult(new i5(), new d5() { // from class: bc9
            @Override // defpackage.d5
            public final void a(Object obj) {
                ViewingCommentsActivity.startForResult$lambda$0(ViewingCommentsActivity.this, (ActivityResult) obj);
            }
        });
        zq3.g(registerForActivityResult, "registerForActivityResult(...)");
        this.startForResult = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommentsViewModel getViewModel() {
        return (CommentsViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchShareWithUrl(long j) {
        uq7.n(getSharingManager(), this, gp0.a(getViewModel().getArticleUrlState().getValue(), j), null, null, ShareOrigin.ARTICLE_FRONT, new h90(null, null, null, null, "comments", 15, null), null, null, null, true, null, null, 3520, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToSingleArticleActivity() {
        if (isTaskRoot()) {
            String stringExtra = getIntent().getStringExtra("com.nytimes.android.extra.ASSET_URL");
            String stringExtra2 = getIntent().getStringExtra("com.nytimes.android.extra.ASSET_URI");
            if (stringExtra2 == null) {
                stringExtra2 = stringExtra;
            }
            if (stringExtra2 != null && stringExtra2.length() > 0) {
                at7 singleArticleActivityNavigator = getSingleArticleActivityNavigator();
                if (stringExtra == null) {
                    stringExtra = "";
                }
                startActivity(singleArticleActivityNavigator.b(this, stringExtra2, stringExtra));
            }
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openReplyScreen(String str, long j) {
        this.startForResult.a(ViewingCommentsActivityKt.openWriteNewCommentActivity(this, true, getViewModel().getArticleUrlState().getValue(), str, Long.valueOf(j)));
    }

    private final void showAlertDialog(int i, int i2) {
        new a.C0012a(this).o(i).e(i2).setPositiveButton(R.string.success_posting_comment_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: ac9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.dismiss();
            }
        }).p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startForResult$lambda$0(ViewingCommentsActivity viewingCommentsActivity, ActivityResult activityResult) {
        zq3.h(viewingCommentsActivity, "this$0");
        zq3.h(activityResult, "result");
        if (activityResult.b() == -1) {
            Intent a = activityResult.a();
            WriteNewCommentActivity.Result result = a != null ? (WriteNewCommentActivity.Result) a.getParcelableExtra(WriteNewCommentActivity.ALERT_TYPE_EXTRA) : null;
            if (zq3.c(result, WriteNewCommentActivity.Result.SuccessUnverifiedWithEmail.INSTANCE)) {
                viewingCommentsActivity.showAlertDialog(R.string.success_posting_comment_unverified_with_email_account_dialog_title, R.string.success_posting_comment_unverified_with_email_account_dialog_message);
                return;
            }
            if (zq3.c(result, WriteNewCommentActivity.Result.SuccessUnverifiedWithoutEmail.INSTANCE)) {
                viewingCommentsActivity.showAlertDialog(R.string.success_posting_comment_unverified_without_email_account_dialog_title, R.string.success_posting_comment_unverified_without_email_account_dialog_message);
            } else if (zq3.c(result, WriteNewCommentActivity.Result.SuccessVerified.INSTANCE)) {
                viewingCommentsActivity.showAlertDialog(R.string.success_posting_comment_verified_account_dialog_title, R.string.success_posting_comment_verified_account_dialog_message);
            } else if (result == null) {
                NYTLogger.g("Result from WriteNewCommentActivity is null!", new Object[0]);
            }
        }
    }

    @Override // defpackage.jk, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        zq3.h(context, "base");
        super.attachBaseContext(xs5.Companion.d(context));
    }

    public final uq7 getSharingManager() {
        uq7 uq7Var = this.sharingManager;
        if (uq7Var != null) {
            return uq7Var;
        }
        zq3.z("sharingManager");
        return null;
    }

    public final at7 getSingleArticleActivityNavigator() {
        at7 at7Var = this.singleArticleActivityNavigator;
        if (at7Var != null) {
            return at7Var;
        }
        zq3.z("singleArticleActivityNavigator");
        return null;
    }

    @Override // com.nytimes.android.utils.snackbar.a
    public boolean isUsingCompose() {
        return true;
    }

    @Override // com.nytimes.android.comments.comments.mvi.Hilt_ViewingCommentsActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.navigator = new Navigator(new NavigationIntent.NavigateTo(ViewCommentsScreen.Companion.from(getIntent().getStringExtra(ARG_SCREEN_ROUTE))));
        tq0.b(this, null, zr0.c(-1293589459, true, new ViewingCommentsActivity$onCreate$1(this)), 1, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        Navigator navigator = null;
        getViewModel().updateSavedStateHandle(intent != null ? intent.getStringExtra("com.nytimes.android.extra.ASSET_URL") : null, intent != null ? Long.valueOf(intent.getLongExtra("com.nytimes.android.extra.COMMENT_ID", 0L)) : null);
        ViewCommentsScreen from = ViewCommentsScreen.Companion.from(intent != null ? intent.getStringExtra(ARG_SCREEN_ROUTE) : null);
        Navigator navigator2 = this.navigator;
        if (navigator2 == null) {
            zq3.z("navigator");
        } else {
            navigator = navigator2;
        }
        navigator.navigate(new NavigationIntent.NavigateTo(from));
    }

    public final void setSharingManager(uq7 uq7Var) {
        zq3.h(uq7Var, "<set-?>");
        this.sharingManager = uq7Var;
    }

    public final void setSingleArticleActivityNavigator(at7 at7Var) {
        zq3.h(at7Var, "<set-?>");
        this.singleArticleActivityNavigator = at7Var;
    }
}
