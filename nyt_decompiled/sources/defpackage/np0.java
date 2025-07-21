package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.utils.NetworkStatus;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class np0 implements ba2 {
    public static ex1 a(Application application, my3 my3Var, ly3 ly3Var, PublishSubject publishSubject, cd cdVar, NetworkStatus networkStatus, BehaviorSubject behaviorSubject, Subauth subauth, z58 z58Var, Resources resources, b04 b04Var, f98 f98Var, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope) {
        return (ex1) g16.e(mp0.a.a(application, my3Var, ly3Var, publishSubject, cdVar, networkStatus, behaviorSubject, subauth, z58Var, resources, b04Var, f98Var, coroutineDispatcher, coroutineScope));
    }
}
