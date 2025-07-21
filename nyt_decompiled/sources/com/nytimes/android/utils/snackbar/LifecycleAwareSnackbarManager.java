package com.nytimes.android.utils.snackbar;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.snackbar.LifecycleAwareSnackbarManager;
import defpackage.c04;
import defpackage.d44;
import defpackage.ei1;
import defpackage.qs2;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.Queue;
import kotlin.c;

/* loaded from: classes4.dex */
public final class LifecycleAwareSnackbarManager implements ei1 {
    private final Activity a;
    private final PublishSubject b;
    private final Queue c;
    private Disposable d;
    private final c04 e;

    public LifecycleAwareSnackbarManager(Activity activity, PublishSubject publishSubject, Queue queue) {
        zq3.h(activity, "activity");
        zq3.h(publishSubject, "snackbarSubject");
        zq3.h(queue, "snackbarOverflow");
        this.a = activity;
        this.b = publishSubject;
        this.c = queue;
        this.d = new CompositeDisposable();
        this.e = c.a(new qs2() { // from class: com.nytimes.android.utils.snackbar.LifecycleAwareSnackbarManager$snackbarUtil$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SnackbarUtil mo865invoke() {
                Activity activity2;
                activity2 = LifecycleAwareSnackbarManager.this.a;
                return new SnackbarUtil(activity2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Throwable th) {
        zq3.e(th);
        NYTLogger.i(th, "Error in LifecycleAwareSnackbarManager", new Object[0]);
    }

    private final SnackbarUtil f() {
        return (SnackbarUtil) this.e.getValue();
    }

    private final Consumer g(final Lifecycle lifecycle) {
        return new Consumer() { // from class: y34
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LifecycleAwareSnackbarManager.i(Lifecycle.this, this, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Lifecycle lifecycle, LifecycleAwareSnackbarManager lifecycleAwareSnackbarManager, String str) {
        zq3.h(lifecycle, "$lifecycle");
        zq3.h(lifecycleAwareSnackbarManager, "this$0");
        zq3.h(str, "message");
        if (lifecycle.b().isAtLeast(Lifecycle.State.RESUMED)) {
            lifecycleAwareSnackbarManager.c.clear();
            lifecycleAwareSnackbarManager.j(str);
            return;
        }
        String str2 = (String) lifecycleAwareSnackbarManager.c.peek();
        if (str2 == null || !zq3.c(str2, str)) {
            lifecycleAwareSnackbarManager.c.add(str);
        }
    }

    private final void j(String str) {
        SnackbarUtil.z(f(), str, 0, false, 6, null);
    }

    public final void d(Lifecycle lifecycle) {
        zq3.h(lifecycle, "lifecycle");
        lifecycle.a(this);
        Disposable subscribe = this.b.hide().subscribe(g(lifecycle), new Consumer() { // from class: x34
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LifecycleAwareSnackbarManager.e((Throwable) obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        this.d = subscribe;
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.d.dispose();
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        zq3.h(d44Var, "owner");
        for (String str : this.c) {
            zq3.e(str);
            j(str);
        }
        this.c.clear();
    }
}
