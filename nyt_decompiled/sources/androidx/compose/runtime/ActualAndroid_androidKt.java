package androidx.compose.runtime;

import android.os.Looper;
import android.util.Log;
import defpackage.c04;
import defpackage.cy4;
import defpackage.hy4;
import defpackage.qs2;
import defpackage.sw7;
import defpackage.tw7;
import defpackage.yx4;

/* loaded from: classes.dex */
public abstract class ActualAndroid_androidKt {
    private static final c04 a = kotlin.c.a(new qs2() { // from class: androidx.compose.runtime.ActualAndroid_androidKt$DefaultMonotonicFrameClock$2
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l mo865invoke() {
            return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.a : SdkStubsFallbackFrameClock.a;
        }
    });
    private static final long b;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        b = j;
    }

    public static final yx4 a(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    public static final cy4 b(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    public static final hy4 c(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    public static final sw7 d(Object obj, tw7 tw7Var) {
        return new ParcelableSnapshotMutableState(obj, tw7Var);
    }

    public static final long e() {
        return b;
    }

    public static final void f(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
