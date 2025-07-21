package kotlinx.coroutines.flow.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;

@fc1(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {BuildConfig.VERSION_CODE, 30}, m = "emit")
/* loaded from: classes5.dex */
final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CombineKt$combineInternal$2.AnonymousClass1.C04991<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.AnonymousClass1.C04991<? super T> c04991, by0<? super CombineKt$combineInternal$2$1$1$emit$1> by0Var) {
        super(by0Var);
        this.this$0 = c04991;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.emit(null, this);
    }
}
