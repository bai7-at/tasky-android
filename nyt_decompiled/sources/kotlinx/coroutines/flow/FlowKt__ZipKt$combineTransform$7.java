package kotlinx.coroutines.flow;

import com.comscore.streaming.ContentFeedType;
import defpackage.bk3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.internal.CombineKt;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", l = {ContentFeedType.WEST_SD}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combineTransform$7 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow<T>[] $flowArray;
    final /* synthetic */ it2 $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements qs2 {
        final /* synthetic */ Flow<T>[] $flowArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow<T>[] flowArr) {
            super(0);
            this.$flowArray = flowArr;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T[], java.lang.Object[]] */
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final T[] mo865invoke() {
            int length = this.$flowArray.length;
            zq3.n(0, "T?");
            return new Object[length];
        }
    }

    @fc1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", l = {ContentFeedType.WEST_SD}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements it2 {
        final /* synthetic */ it2 $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(it2 it2Var, by0<? super AnonymousClass2> by0Var) {
            super(3, by0Var);
            this.$transform = it2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                it2 it2Var = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (it2Var.invoke(flowCollector, objArr, this) == h) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, by0<? super ww8> by0Var) {
            zq3.m();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, by0Var);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = tArr;
            return anonymousClass2.invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$7(Flow<T>[] flowArr, it2 it2Var, by0<? super FlowKt__ZipKt$combineTransform$7> by0Var) {
        super(2, by0Var);
        this.$flowArray = flowArr;
        this.$transform = it2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.$flowArray, this.$transform, by0Var);
        flowKt__ZipKt$combineTransform$7.L$0 = obj;
        return flowKt__ZipKt$combineTransform$7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T>[] flowArr = this.$flowArray;
            zq3.m();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flowArray);
            zq3.m();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, null);
            this.label = 1;
            if (CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, anonymousClass2, this) == h) {
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

    public final Object invokeSuspend$$forInline(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Flow<T>[] flowArr = this.$flowArray;
        zq3.m();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flowArray);
        zq3.m();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, null);
        bk3.c(0);
        CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, anonymousClass2, this);
        bk3.c(1);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector<? super R> flowCollector, by0<? super ww8> by0Var) {
        return ((FlowKt__ZipKt$combineTransform$7) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
