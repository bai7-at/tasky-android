package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rxb implements v3f {
    private final l4f a;

    public rxb(l4f l4fVar) {
        this.a = l4fVar;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((l1c) this.a).a().A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
