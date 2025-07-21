package io.embrace.android.embracesdk.comms.api;

import defpackage.gm0;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.compression.ConditionalGzipOutputStream;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import java.io.OutputStream;
import java.lang.reflect.ParameterizedType;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class EmbraceApiService$post$action$1 extends Lambda implements ss2 {
    final /* synthetic */ Object $payload;
    final /* synthetic */ ParameterizedType $type;
    final /* synthetic */ EmbraceApiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbraceApiService$post$action$1(EmbraceApiService embraceApiService, ParameterizedType parameterizedType, Object obj) {
        super(1);
        this.this$0 = embraceApiService;
        this.$type = parameterizedType;
        this.$payload = obj;
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((OutputStream) obj);
        return ww8.a;
    }

    public final void invoke(OutputStream outputStream) {
        EmbraceSerializer embraceSerializer;
        EmbraceSerializer embraceSerializer2;
        zq3.h(outputStream, "stream");
        ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
        try {
            if (this.$type != null) {
                embraceSerializer2 = this.this$0.serializer;
                embraceSerializer2.toJson((EmbraceSerializer) this.$payload, this.$type, (OutputStream) conditionalGzipOutputStream);
            } else {
                embraceSerializer = this.this$0.serializer;
                Object obj = this.$payload;
                zq3.n(4, "T");
                embraceSerializer.toJson((EmbraceSerializer) obj, (Class<EmbraceSerializer>) Object.class, (OutputStream) conditionalGzipOutputStream);
            }
            ww8 ww8Var = ww8.a;
            gm0.a(conditionalGzipOutputStream, null);
        } finally {
        }
    }
}
