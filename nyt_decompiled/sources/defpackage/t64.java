package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t64 extends c6 {
    private final r07 e;

    public t64(int i, String str, String str2, c6 c6Var, r07 r07Var) {
        super(i, str, str2, c6Var);
        this.e = r07Var;
    }

    @Override // defpackage.c6
    public final JSONObject e() {
        JSONObject e = super.e();
        r07 f = f();
        if (f == null) {
            e.put("Response Info", Constants.NULL_VERSION_ID);
        } else {
            e.put("Response Info", f.g());
        }
        return e;
    }

    public r07 f() {
        return this.e;
    }

    @Override // defpackage.c6
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
