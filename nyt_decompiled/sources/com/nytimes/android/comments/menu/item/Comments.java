package com.nytimes.android.comments.menu.item;

import android.view.MenuItem;
import android.view.View;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetUtils;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.menu.item.Comments;
import com.nytimes.android.comments.menu.view.MenuCommentsView;
import com.nytimes.android.fragment.article.ArticleFragmentType;
import com.nytimes.android.menu.MenuData;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.by0;
import defpackage.cc0;
import defpackage.e44;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jk;
import defpackage.kq4;
import defpackage.qh6;
import defpackage.sn8;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zs5;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class Comments extends MenuData {
    public static final int $stable = 8;
    private final jk activity;
    private final CommentHandler commentsHandler;
    private final MenuCommentsView menuCommentsView;
    private final NetworkStatus networkStatus;

    /* renamed from: com.nytimes.android.comments.menu.item.Comments$1, reason: invalid class name */
    static final class AnonymousClass1 extends Lambda implements ss2 {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2$lambda$1$lambda$0(MenuItem menuItem, Comments comments, View view) {
            zq3.h(menuItem, "$menuItem");
            zq3.h(comments, "this$0");
            if (menuItem.isEnabled()) {
                comments.handleCommentAction();
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((kq4) obj);
            return ww8.a;
        }

        public final void invoke(kq4 kq4Var) {
            zq3.h(kq4Var, "param");
            final MenuItem findItem = kq4Var.c().findItem(Comments.this.getId());
            if (findItem != null) {
                final Comments comments = Comments.this;
                Asset b = kq4Var.b();
                if (b == null || !(kq4Var.a() == ArticleFragmentType.HYBRID || AssetUtils.isLegacyOrInteractiveCollectionWithComments(b))) {
                    findItem.setVisible(false);
                    comments.menuCommentsView.clearCommentCount();
                    return;
                }
                if (!b.isCommentsEnabled() || !comments.networkStatus.g()) {
                    comments.menuCommentsView.clearCommentCount();
                    return;
                }
                comments.commentsHandler.updateParams(b);
                BuildersKt__Builders_commonKt.launch$default(e44.a(comments.activity), null, null, new Comments$1$1$1(comments, b, null), 3, null);
                View view = comments.menuCommentsView.getView();
                view.setOnClickListener(new View.OnClickListener() { // from class: com.nytimes.android.comments.menu.item.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Comments.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(findItem, comments, view2);
                    }
                });
                sn8.a(view, zs5.a(comments.activity).getResources().getString(comments.getTitle()));
                findItem.setActionView(view);
                findItem.setVisible(true);
            }
        }
    }

    @fc1(c = "com.nytimes.android.comments.menu.item.Comments$2", f = "Comments.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.menu.item.Comments$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass2(by0<? super AnonymousClass2> by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            return Comments.this.new AnonymousClass2(by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(MenuItem menuItem, by0<? super Boolean> by0Var) {
            return ((AnonymousClass2) create(menuItem, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            CommentHandler.handleCommentAction$default(Comments.this.commentsHandler, null, 1, null);
            return cc0.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Comments(jk jkVar, NetworkStatus networkStatus, MenuCommentsView menuCommentsView, CommentHandler commentHandler) {
        super(R.string.comments, R.id.action_comments, 0, Integer.valueOf(qh6.menu_first_position_item), Boolean.FALSE, 2, null, null, true, null, null, 1728, null);
        zq3.h(jkVar, "activity");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(menuCommentsView, "menuCommentsView");
        zq3.h(commentHandler, "commentsHandler");
        this.activity = jkVar;
        this.networkStatus = networkStatus;
        this.menuCommentsView = menuCommentsView;
        this.commentsHandler = commentHandler;
        setPreparer(new AnonymousClass1());
        setHandler(new AnonymousClass2(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCommentAction() {
        this.commentsHandler.handleCommentAction(this.menuCommentsView.getTotalCommentsCount());
    }
}
