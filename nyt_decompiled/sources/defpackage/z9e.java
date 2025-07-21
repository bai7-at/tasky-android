package defpackage;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z9e {
    private JSONObject a;
    private final iae b;

    public z9e(iae iaeVar) {
        this.b = iaeVar;
    }

    public final JSONObject a() {
        return this.a;
    }

    public final void b() {
        this.b.b(new jae(this));
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new kae(this, hashSet, jSONObject, j));
    }

    public final void d(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new lae(this, hashSet, jSONObject, j));
    }

    public final void e(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}
