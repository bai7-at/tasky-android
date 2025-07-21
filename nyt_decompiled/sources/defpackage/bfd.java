package defpackage;

import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bfd implements i9d {
    private final igd a;
    private final msc b;

    bfd(igd igdVar, msc mscVar) {
        this.a = igdVar;
        this.b = mscVar;
    }

    @Override // defpackage.i9d
    public final j9d a(String str, JSONObject jSONObject) {
        o5b o5bVar;
        if (((Boolean) pla.c().a(mpa.E1)).booleanValue()) {
            try {
                o5bVar = this.b.b(str);
            } catch (RemoteException e) {
                fgb.e("Coundn't create RTB adapter: ", e);
                o5bVar = null;
            }
        } else {
            o5bVar = this.a.a(str);
        }
        if (o5bVar == null) {
            return null;
        }
        return new j9d(o5bVar, new jbd(), str);
    }
}
