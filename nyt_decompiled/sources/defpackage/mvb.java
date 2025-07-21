package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
final class mvb implements pub {
    private final pdb a;

    mvb(pdb pdbVar) {
        this.a = pdbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [pdb] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.pub
    public final void a(JSONObject jSONObject) {
        this.a.b(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
