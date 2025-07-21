package coil.compose;

import androidx.compose.runtime.y;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.lt2;
import defpackage.qs2;
import defpackage.st2;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.xg3;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {246}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AsyncImagePainter$onRemembered$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ AsyncImagePainter this$0;

    @fc1(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {245}, m = "invokeSuspend")
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        Object L$0;
        int label;
        final /* synthetic */ AsyncImagePainter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AsyncImagePainter asyncImagePainter, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = asyncImagePainter;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(vg3 vg3Var, by0 by0Var) {
            return ((AnonymousClass2) create(vg3Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vg3 P;
            AsyncImagePainter asyncImagePainter;
            AsyncImagePainter.b O;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                AsyncImagePainter asyncImagePainter2 = this.this$0;
                ImageLoader w = asyncImagePainter2.w();
                AsyncImagePainter asyncImagePainter3 = this.this$0;
                P = asyncImagePainter3.P(asyncImagePainter3.y());
                this.L$0 = asyncImagePainter2;
                this.label = 1;
                Object c = w.c(P, this);
                if (c == h) {
                    return h;
                }
                obj = c;
                asyncImagePainter = asyncImagePainter2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                asyncImagePainter = (AsyncImagePainter) this.L$0;
                f.b(obj);
            }
            O = asyncImagePainter.O((xg3) obj);
            return O;
        }
    }

    /* synthetic */ class a implements FlowCollector, st2 {
        final /* synthetic */ AsyncImagePainter a;

        a(AsyncImagePainter asyncImagePainter) {
            this.a = asyncImagePainter;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(AsyncImagePainter.b bVar, by0 by0Var) {
            Object c = AsyncImagePainter$onRemembered$1.c(this.a, bVar, by0Var);
            return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
        }

        @Override // defpackage.st2
        public final lt2 b() {
            return new AdaptedFunctionReference(2, this.a, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof st2)) {
                return zq3.c(b(), ((st2) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncImagePainter$onRemembered$1(AsyncImagePainter asyncImagePainter, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = asyncImagePainter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object c(AsyncImagePainter asyncImagePainter, AsyncImagePainter.b bVar, by0 by0Var) {
        asyncImagePainter.Q(bVar);
        return ww8.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AsyncImagePainter$onRemembered$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final AsyncImagePainter asyncImagePainter = this.this$0;
            Flow mapLatest = FlowKt.mapLatest(y.p(new qs2() { // from class: coil.compose.AsyncImagePainter$onRemembered$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final vg3 mo865invoke() {
                    return AsyncImagePainter.this.y();
                }
            }), new AnonymousClass2(this.this$0, null));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (mapLatest.collect(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AsyncImagePainter$onRemembered$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
