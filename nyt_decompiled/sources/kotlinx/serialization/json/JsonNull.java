package kotlinx.serialization.json;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.c04;
import defpackage.lk7;
import defpackage.qs2;
import defpackage.yt3;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlinx.serialization.KSerializer;

@lk7(with = yt3.class)
/* loaded from: classes5.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();
    private static final String a = Constants.NULL_VERSION_ID;
    private static final /* synthetic */ c04 b = c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: kotlinx.serialization.json.JsonNull.1
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final KSerializer mo865invoke() {
            return yt3.a;
        }
    });

    private JsonNull() {
        super(null);
    }

    private final /* synthetic */ KSerializer c() {
        return (KSerializer) b.getValue();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String a() {
        return a;
    }

    public final KSerializer serializer() {
        return c();
    }
}
