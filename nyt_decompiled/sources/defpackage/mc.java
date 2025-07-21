package defpackage;

import com.nytimes.android.analytics.handler.FirebaseChannelHandler;
import io.reactivex.subjects.BehaviorSubject;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes2.dex */
public abstract class mc implements ba2 {
    public static FirebaseChannelHandler a(a19 a19Var, p86 p86Var, BehaviorSubject behaviorSubject, CoroutineDispatcher coroutineDispatcher) {
        return (FirebaseChannelHandler) g16.e(kc.a.b(a19Var, p86Var, behaviorSubject, coroutineDispatcher));
    }
}
