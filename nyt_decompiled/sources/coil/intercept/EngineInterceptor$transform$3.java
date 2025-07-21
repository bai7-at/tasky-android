package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.intercept.EngineInterceptor;
import defpackage.by0;
import defpackage.d42;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.lh4;
import defpackage.uk5;
import defpackage.vg3;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@fc1(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class EngineInterceptor$transform$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ d42 $eventListener;
    final /* synthetic */ uk5 $options;
    final /* synthetic */ vg3 $request;
    final /* synthetic */ EngineInterceptor.b $result;
    final /* synthetic */ List<Object> $transformations;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$transform$3(EngineInterceptor engineInterceptor, EngineInterceptor.b bVar, uk5 uk5Var, List list, d42 d42Var, vg3 vg3Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = engineInterceptor;
        this.$result = bVar;
        this.$options = uk5Var;
        this.$transformations = list;
        this.$eventListener = d42Var;
        this.$request = vg3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.this$0, this.$result, this.$options, this.$transformations, this.$eventListener, this.$request, by0Var);
        engineInterceptor$transform$3.L$0 = obj;
        return engineInterceptor$transform$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Bitmap g;
        List<Object> list;
        uk5 uk5Var;
        int size;
        int i;
        a.h();
        int i2 = this.label;
        if (i2 == 0) {
            f.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            g = this.this$0.g(this.$result.e(), this.$options, this.$transformations);
            this.$eventListener.n(this.$request, g);
            list = this.$transformations;
            uk5Var = this.$options;
            size = list.size();
            i = 0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.I$1;
            int i3 = this.I$0;
            uk5Var = (uk5) this.L$2;
            list = (List) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            f.b(obj);
            g = (Bitmap) obj;
            CoroutineScopeKt.ensureActive(coroutineScope);
            i = i3 + 1;
        }
        if (i >= size) {
            this.$eventListener.l(this.$request, g);
            return EngineInterceptor.b.b(this.$result, new BitmapDrawable(this.$request.l().getResources(), g), false, null, null, 14, null);
        }
        lh4.a(list.get(i));
        uk5Var.o();
        this.L$0 = coroutineScope;
        this.L$1 = list;
        this.L$2 = uk5Var;
        this.I$0 = i;
        this.I$1 = size;
        this.label = 1;
        throw null;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((EngineInterceptor$transform$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
