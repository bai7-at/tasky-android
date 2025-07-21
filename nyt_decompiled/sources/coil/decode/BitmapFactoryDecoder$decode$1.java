package coil.decode;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 46}, m = "decode")
/* loaded from: classes.dex */
final class BitmapFactoryDecoder$decode$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BitmapFactoryDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BitmapFactoryDecoder$decode$1(BitmapFactoryDecoder bitmapFactoryDecoder, by0 by0Var) {
        super(by0Var);
        this.this$0 = bitmapFactoryDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
