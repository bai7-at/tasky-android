package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fcd implements i9d {
    private final msc a;

    public fcd(msc mscVar) {
        this.a = mscVar;
    }

    @Override // defpackage.i9d
    public final j9d a(String str, JSONObject jSONObject) {
        return new j9d(this.a.c(str, jSONObject), new jbd(), str);
    }
}
