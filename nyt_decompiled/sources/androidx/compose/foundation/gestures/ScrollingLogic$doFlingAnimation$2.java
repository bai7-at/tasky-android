package androidx.compose.foundation.gestures;

import defpackage.by0;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.g35;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.qk2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$LongRef;

@fc1(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {844}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    public static final class a implements qc7 {
        final /* synthetic */ ScrollingLogic a;
        final /* synthetic */ ss2 b;

        a(ScrollingLogic scrollingLogic, ss2 ss2Var) {
            this.a = scrollingLogic;
            this.b = ss2Var;
        }

        @Override // defpackage.qc7
        public float a(float f) {
            ScrollingLogic scrollingLogic = this.a;
            return scrollingLogic.p(((fd5) this.b.invoke(fd5.d(scrollingLogic.q(f)))).x());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = scrollingLogic;
        this.$result = ref$LongRef;
        this.$available = j;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qc7 qc7Var, by0 by0Var) {
        return ((ScrollingLogic$doFlingAnimation$2) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, by0Var);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        qk2 qk2Var;
        Ref$LongRef ref$LongRef;
        ScrollingLogic scrollingLogic2;
        long j;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final qc7 qc7Var = (qc7) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            a aVar = new a(this.this$0, new ss2() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final long b(long j2) {
                    ScrollingLogic scrollingLogic4 = ScrollingLogic.this;
                    return scrollingLogic4.k(scrollingLogic4.c(qc7Var, scrollingLogic4.k(j2), g35.a.b()));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return fd5.d(b(((fd5) obj2).x()));
                }
            });
            scrollingLogic = this.this$0;
            Ref$LongRef ref$LongRef2 = this.$result;
            long j2 = this.$available;
            qk2Var = scrollingLogic.e;
            long j3 = ref$LongRef2.element;
            float j4 = scrollingLogic.j(scrollingLogic.o(j2));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = ref$LongRef2;
            this.J$0 = j3;
            this.label = 1;
            obj = qk2Var.a(aVar, j4, this);
            if (obj == h) {
                return h;
            }
            ref$LongRef = ref$LongRef2;
            scrollingLogic2 = scrollingLogic;
            j = j3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            f.b(obj);
        }
        ref$LongRef.element = scrollingLogic.s(j, scrollingLogic2.j(((Number) obj).floatValue()));
        return ww8.a;
    }
}
