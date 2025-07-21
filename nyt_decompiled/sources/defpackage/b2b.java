package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b2b {
    private static final Charset a = Charset.forName(Constants.DEFAULT_ENCODING);
    public static final y1b b = new a2b();
    public static final w1b c = new w1b() { // from class: z1b
        @Override // defpackage.w1b
        public final Object a(JSONObject jSONObject) {
            return b2b.a(jSONObject);
        }
    };

    static /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(a));
    }
}
