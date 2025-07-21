package defpackage;

import org.json.JSONException;

/* loaded from: classes3.dex */
final class wqa extends jb6 {
    final /* synthetic */ String a;
    final /* synthetic */ xqa b;

    wqa(xqa xqaVar, String str) {
        this.a = str;
        this.b = xqaVar;
    }

    @Override // defpackage.jb6
    public final void a(String str) {
        j51 j51Var;
        fgb.g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            xqa xqaVar = this.b;
            j51Var = xqaVar.d;
            j51Var.g(xqaVar.c(this.a, str).toString(), null);
        } catch (JSONException e) {
            fgb.e("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // defpackage.jb6
    public final void b(ib6 ib6Var) {
        j51 j51Var;
        String b = ib6Var.b();
        try {
            xqa xqaVar = this.b;
            j51Var = xqaVar.d;
            j51Var.g(xqaVar.d(this.a, b).toString(), null);
        } catch (JSONException e) {
            fgb.e("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
