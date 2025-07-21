package com.nytimes.android.comments.menu.item;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.a;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivityKt;
import com.nytimes.android.comments.menu.item.CommentHandler;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.lk6;
import defpackage.qs2;
import defpackage.sm6;
import defpackage.vx0;
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes4.dex */
public final class CommentHandler {
    public static final int $stable = 8;
    private final Activity activity;
    private Asset asset;
    private final com.nytimes.android.entitlements.a eCommClient;
    private final CoroutineDispatcher ioDispatcher;
    private final CoroutineDispatcher mainDispatcher;
    private final NetworkStatus networkStatus;
    private final CoroutineScope scope;
    private final SnackbarUtil snackbarUtil;
    private String totalComments;

    public CommentHandler(Activity activity, NetworkStatus networkStatus, SnackbarUtil snackbarUtil, com.nytimes.android.entitlements.a aVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        zq3.h(activity, "activity");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(aVar, "eCommClient");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(coroutineDispatcher2, "mainDispatcher");
        this.activity = activity;
        this.networkStatus = networkStatus;
        this.snackbarUtil = snackbarUtil;
        this.eCommClient = aVar;
        this.ioDispatcher = coroutineDispatcher;
        this.mainDispatcher = coroutineDispatcher2;
        this.totalComments = "";
        this.scope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher2);
    }

    public static /* synthetic */ void handleCommentAction$default(CommentHandler commentHandler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        commentHandler.handleCommentAction(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object login(qs2 qs2Var, by0<? super ww8> by0Var) {
        Object withContext = BuildersKt.withContext(this.ioDispatcher, new CommentHandler$login$2(this, qs2Var, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    private final void showLoginDialog(final qs2 qs2Var) {
        new a.C0012a(new vx0(this.activity, sm6.AppTheme)).e(R.string.comments_login_dialog_title).setPositiveButton(lk6.login, new DialogInterface.OnClickListener() { // from class: hp0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CommentHandler.showLoginDialog$lambda$1(CommentHandler.this, qs2Var, dialogInterface, i);
            }
        }).setNegativeButton(lk6.cancel, new DialogInterface.OnClickListener() { // from class: ip0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CommentHandler.showLoginDialog$lambda$2(dialogInterface, i);
            }
        }).p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLoginDialog$lambda$1(CommentHandler commentHandler, qs2 qs2Var, DialogInterface dialogInterface, int i) {
        zq3.h(commentHandler, "this$0");
        zq3.h(qs2Var, "$onLoginSuccess");
        BuildersKt__Builders_commonKt.launch$default(commentHandler.scope, null, null, new CommentHandler$showLoginDialog$1$1(commentHandler, qs2Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLoginDialog$lambda$2(DialogInterface dialogInterface, int i) {
    }

    public final void handleCommentAction(String str) {
        String url;
        zq3.h(str, "totalCommentsCount");
        Asset asset = this.asset;
        if (asset == null || (url = asset.getUrl()) == null) {
            return;
        }
        openCommentsScreen(url, str);
    }

    public final void openCommentsScreen(final String str, final String str2) {
        zq3.h(str, "articleUrl");
        zq3.h(str2, "totalCommentsCount");
        if (!this.networkStatus.g()) {
            SnackbarUtil.p(this.snackbarUtil, false, 1, null);
            return;
        }
        this.totalComments = str2;
        if (this.eCommClient.q()) {
            ViewingCommentsActivityKt.startScreen$default(this.activity, null, str, str2, 1, null);
        } else {
            showLoginDialog(new qs2() { // from class: com.nytimes.android.comments.menu.item.CommentHandler$openCommentsScreen$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m282invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m282invoke() {
                    CommentHandler.this.openCommentsScreen(str, str2);
                }
            });
        }
    }

    public final void updateParams(Asset asset) {
        this.asset = asset;
    }
}
