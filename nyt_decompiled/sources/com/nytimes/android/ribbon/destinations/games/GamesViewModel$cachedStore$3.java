package com.nytimes.android.ribbon.destinations.games;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import com.nytimes.android.utils.MoshiFileSystemPersister;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.j91;
import defpackage.wv2;
import defpackage.ww8;
import io.reactivex.Single;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.rx2.RxAwaitKt;

@fc1(c = "com.nytimes.android.ribbon.destinations.games.GamesViewModel$cachedStore$3", f = "GamesViewModel.kt", l = {72, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GamesViewModel$cachedStore$3 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ GamesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesViewModel$cachedStore$3(GamesViewModel gamesViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = gamesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GamesViewModel$cachedStore$3(this.this$0, by0Var);
    }

    @Override // defpackage.gt2
    public final Object invoke(ww8 ww8Var, by0 by0Var) {
        return ((GamesViewModel$cachedStore$3) create(ww8Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DestinationAssetRepository destinationAssetRepository;
        MoshiFileSystemPersister moshiFileSystemPersister;
        List list;
        j91 j91Var;
        wv2 l;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            destinationAssetRepository = this.this$0.a;
            this.label = 1;
            obj = destinationAssetRepository.h(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                f.b(obj);
                j91Var = this.this$0.h;
                j91Var.b();
                l = this.this$0.l(list);
                return l;
            }
            f.b(obj);
        }
        List list2 = (List) obj;
        moshiFileSystemPersister = this.this$0.i;
        Single b = moshiFileSystemPersister.b(ww8.a, list2);
        this.L$0 = list2;
        this.label = 2;
        if (RxAwaitKt.await(b, this) == h) {
            return h;
        }
        list = list2;
        j91Var = this.this$0.h;
        j91Var.b();
        l = this.this$0.l(list);
        return l;
    }
}
