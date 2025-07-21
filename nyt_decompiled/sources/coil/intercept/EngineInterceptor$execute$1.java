package coil.intercept;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.internal.ws.WebSocketProtocol;

@fc1(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, WebSocketProtocol.PAYLOAD_SHORT, 144}, m = "execute")
/* loaded from: classes.dex */
final class EngineInterceptor$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$execute$1(EngineInterceptor engineInterceptor, by0 by0Var) {
        super(by0Var);
        this.this$0 = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        i = this.this$0.i(null, null, null, null, this);
        return i;
    }
}
