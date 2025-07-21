package defpackage;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import com.nytimes.android.internal.common.screenshot.FileObserverScreenshotProvider;
import io.reactivex.disposables.CompositeDisposable;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class t40 {
    public static final t40 a = new t40();

    private t40() {
    }

    public final CompositeDisposable a() {
        return new CompositeDisposable();
    }

    public final Intent b(Activity activity) {
        zq3.h(activity, "context");
        if (activity.getIntent() == null) {
            return new Intent();
        }
        Intent intent = activity.getIntent();
        zq3.g(intent, "getIntent(...)");
        return intent;
    }

    public final ec7 c(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "coroutineScope");
        return new FileObserverScreenshotProvider(coroutineScope);
    }

    public final FragmentManager d(f fVar) {
        zq3.h(fVar, "activity");
        FragmentManager supportFragmentManager = fVar.getSupportFragmentManager();
        zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
        return supportFragmentManager;
    }
}
