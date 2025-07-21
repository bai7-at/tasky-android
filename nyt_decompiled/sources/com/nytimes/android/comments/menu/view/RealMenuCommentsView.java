package com.nytimes.android.comments.menu.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.comments.comments.data.store.CommentsStore;
import com.nytimes.android.comments.databinding.ViewActionCommentsBinding;
import com.nytimes.android.comments.menu.view.RealMenuCommentsView;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.d44;
import defpackage.ei1;
import defpackage.k99;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class RealMenuCommentsView extends FrameLayout implements MenuCommentsView, ei1 {
    private static final long ANIM_DURATION = 125;
    private static final int MAX_COMMENT_COUNT = 999;
    private final ViewActionCommentsBinding binding;
    public CommentsStore commentsStore;
    private final CompositeDisposable disposables;
    private String totalCommentsCountStr;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealMenuCommentsView(Context context) {
        this(context, null, 0, 6, null);
        zq3.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCommentCount(int i) {
        return i > 999 ? getRoundedCount(i) : String.valueOf(i);
    }

    private final String getRoundedCount(int i) {
        return (i / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) + InstructionFileId.DOT + Math.round((i % NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) / 100) + "K";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loadCommentCount$lambda$0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (String) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean loadCommentCount$lambda$1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return ((Boolean) ss2Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadCommentCount$lambda$2(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadCommentCount$lambda$3(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setText(final String str, boolean z) {
        if (z) {
            this.binding.btnCommentsAction.animate().alpha(0.0f).setDuration(125L).withEndAction(new Runnable() { // from class: dr6
                @Override // java.lang.Runnable
                public final void run() {
                    RealMenuCommentsView.setText$lambda$4(RealMenuCommentsView.this, str);
                }
            });
        } else {
            this.binding.btnCommentsAction.setAlpha(1.0f);
            this.binding.btnCommentsAction.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setText$lambda$4(RealMenuCommentsView realMenuCommentsView, String str) {
        zq3.h(realMenuCommentsView, "this$0");
        zq3.h(str, "$commentCount");
        realMenuCommentsView.binding.btnCommentsAction.setText(str);
        realMenuCommentsView.binding.btnCommentsAction.animate().alpha(1.0f);
    }

    @Override // com.nytimes.android.comments.menu.view.MenuCommentsView
    public void clearCommentCount() {
        this.binding.btnCommentsAction.setAlpha(1.0f);
        this.binding.btnCommentsAction.setText("");
    }

    public final CommentsStore getCommentsStore() {
        CommentsStore commentsStore = this.commentsStore;
        if (commentsStore != null) {
            return commentsStore;
        }
        zq3.z("commentsStore");
        return null;
    }

    @Override // com.nytimes.android.comments.menu.view.MenuCommentsView
    public String getTotalCommentsCount() {
        return this.totalCommentsCountStr;
    }

    @Override // com.nytimes.android.comments.menu.view.MenuCommentsView
    public View getView() {
        return this;
    }

    @Override // com.nytimes.android.comments.menu.view.MenuCommentsView
    public Object loadCommentCount(Asset asset, by0<? super ww8> by0Var) {
        final boolean O = k99.O(this);
        CompositeDisposable compositeDisposable = this.disposables;
        CommentsStore commentsStore = getCommentsStore();
        String url = asset.getUrl();
        if (url == null) {
            url = "";
        }
        Single<Integer> commentCountSingle = commentsStore.getCommentCountSingle(url);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.comments.menu.view.RealMenuCommentsView$loadCommentCount$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final String invoke(Integer num) {
                String commentCount;
                zq3.h(num, "commentCount");
                if (num.intValue() == 0) {
                    RealMenuCommentsView.this.totalCommentsCountStr = "";
                    return "+";
                }
                commentCount = RealMenuCommentsView.this.getCommentCount(num.intValue());
                RealMenuCommentsView.this.totalCommentsCountStr = commentCount;
                return commentCount;
            }
        };
        Single observeOn = commentCountSingle.map(new Function() { // from class: er6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String loadCommentCount$lambda$0;
                loadCommentCount$lambda$0 = RealMenuCommentsView.loadCommentCount$lambda$0(ss2.this, obj);
                return loadCommentCount$lambda$0;
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.comments.menu.view.RealMenuCommentsView$loadCommentCount$3
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Boolean invoke(String str) {
                ViewActionCommentsBinding viewActionCommentsBinding;
                zq3.h(str, "it");
                viewActionCommentsBinding = RealMenuCommentsView.this.binding;
                zq3.g(viewActionCommentsBinding.btnCommentsAction.getText(), "getText(...)");
                return Boolean.valueOf(!str.contentEquals(r1));
            }
        };
        Maybe filter = observeOn.filter(new Predicate() { // from class: fr6
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean loadCommentCount$lambda$1;
                loadCommentCount$lambda$1 = RealMenuCommentsView.loadCommentCount$lambda$1(ss2.this, obj);
                return loadCommentCount$lambda$1;
            }
        });
        final ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.comments.menu.view.RealMenuCommentsView$loadCommentCount$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                RealMenuCommentsView realMenuCommentsView = RealMenuCommentsView.this;
                zq3.e(str);
                realMenuCommentsView.setText(str, O);
            }
        };
        Consumer consumer = new Consumer() { // from class: gr6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RealMenuCommentsView.loadCommentCount$lambda$2(ss2.this, obj);
            }
        };
        final RealMenuCommentsView$loadCommentCount$5 realMenuCommentsView$loadCommentCount$5 = new ss2() { // from class: com.nytimes.android.comments.menu.view.RealMenuCommentsView$loadCommentCount$5
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.h(th);
            }
        };
        Disposable subscribe = filter.subscribe(consumer, new Consumer() { // from class: hr6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RealMenuCommentsView.loadCommentCount$lambda$3(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
        return ww8.a;
    }

    @Override // defpackage.ei1
    public /* bridge */ /* synthetic */ void onCreate(d44 d44Var) {
        super.onCreate(d44Var);
    }

    @Override // defpackage.ei1
    public /* bridge */ /* synthetic */ void onDestroy(d44 d44Var) {
        super.onDestroy(d44Var);
    }

    @Override // defpackage.ei1
    public /* bridge */ /* synthetic */ void onPause(d44 d44Var) {
        super.onPause(d44Var);
    }

    @Override // defpackage.ei1
    public /* bridge */ /* synthetic */ void onResume(d44 d44Var) {
        super.onResume(d44Var);
    }

    @Override // defpackage.ei1
    public /* bridge */ /* synthetic */ void onStart(d44 d44Var) {
        super.onStart(d44Var);
    }

    @Override // defpackage.ei1
    public /* bridge */ /* synthetic */ void onStop(d44 d44Var) {
        super.onStop(d44Var);
    }

    public final void setCommentsStore(CommentsStore commentsStore) {
        zq3.h(commentsStore, "<set-?>");
        this.commentsStore = commentsStore;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealMenuCommentsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    public /* synthetic */ RealMenuCommentsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealMenuCommentsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        ViewActionCommentsBinding inflate = ViewActionCommentsBinding.inflate(LayoutInflater.from(context), this);
        zq3.g(inflate, "inflate(...)");
        this.binding = inflate;
        this.disposables = new CompositeDisposable();
        this.totalCommentsCountStr = "";
        if (context instanceof d44) {
            ((d44) context).getLifecycle().a(this);
        }
    }
}
