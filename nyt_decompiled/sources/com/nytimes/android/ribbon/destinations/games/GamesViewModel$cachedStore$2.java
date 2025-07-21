package com.nytimes.android.ribbon.destinations.games;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.MoshiFileSystemPersister;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.wv2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Maybe;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.rx2.RxAwaitKt;

@fc1(c = "com.nytimes.android.ribbon.destinations.games.GamesViewModel$cachedStore$2", f = "GamesViewModel.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GamesViewModel$cachedStore$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ GamesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesViewModel$cachedStore$2(GamesViewModel gamesViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = gamesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GamesViewModel$cachedStore$2(this.this$0, by0Var);
    }

    @Override // defpackage.gt2
    public final Object invoke(ww8 ww8Var, by0 by0Var) {
        return ((GamesViewModel$cachedStore$2) create(ww8Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MoshiFileSystemPersister moshiFileSystemPersister;
        wv2 l;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                moshiFileSystemPersister = this.this$0.i;
                Maybe d = moshiFileSystemPersister.d(ww8.a);
                this.label = 1;
                obj = RxAwaitKt.awaitSingleOrNull(d, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            zq3.e(obj);
            l = this.this$0.l((List) obj);
            return l;
        } catch (FileNotFoundException e) {
            NYTLogger.h(e);
            return null;
        }
    }
}
