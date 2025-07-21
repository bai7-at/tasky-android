package defpackage;

import com.nytimes.android.BaseAppCompatActivity;
import com.nytimes.android.ScreenshotTracker;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: classes2.dex */
public abstract class y40 implements op4 {
    public static void a(BaseAppCompatActivity baseAppCompatActivity, CompositeDisposable compositeDisposable) {
        baseAppCompatActivity.compositeDisposable = compositeDisposable;
    }

    public static void b(BaseAppCompatActivity baseAppCompatActivity, s74 s74Var) {
        baseAppCompatActivity.localeUtils = s74Var;
    }

    public static void c(BaseAppCompatActivity baseAppCompatActivity, td4 td4Var) {
        baseAppCompatActivity.mainActivityNavigator = td4Var;
    }

    public static void d(BaseAppCompatActivity baseAppCompatActivity, oi4 oi4Var) {
        baseAppCompatActivity.mediaLifecycleObserver = oi4Var;
    }

    public static void e(BaseAppCompatActivity baseAppCompatActivity, ScreenshotTracker screenshotTracker) {
        baseAppCompatActivity.screenshotTracker = screenshotTracker;
    }

    public static void f(BaseAppCompatActivity baseAppCompatActivity, SnackbarUtil snackbarUtil) {
        baseAppCompatActivity.snackbarUtil = snackbarUtil;
    }

    public static void g(BaseAppCompatActivity baseAppCompatActivity, fx3 fx3Var) {
        baseAppCompatActivity.stamper = fx3Var;
    }
}
