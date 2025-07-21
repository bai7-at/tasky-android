package defpackage;

import com.nytimes.android.subauth.core.purr.model.CurrentTCFNoticeData;
import com.nytimes.android.subauth.core.purr.model.TcfPreferenceData;
import com.nytimes.android.subauth.core.purr.model.UserTCFData;
import com.nytimes.android.subauth.core.purr.network.parsing.PurrResponseParserException;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.a36;
import defpackage.wf5;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class xe8 {
    private final i a;
    private final JsonAdapter b;

    public xe8() {
        i d = new i.b().d();
        this.a = d;
        this.b = d.d(j.j(Map.class, String.class, Object.class)).serializeNulls();
    }

    public final TcfPreferenceData a(a36.b bVar, wf5.a aVar) {
        zq3.h(bVar, "currentNotice");
        return new TcfPreferenceData(new CurrentTCFNoticeData(bVar.a(), bVar.c(), bVar.b()), aVar != null ? b(aVar) : null);
    }

    public final UserTCFData b(wf5.a aVar) {
        if (aVar == null || aVar.c().length() == 0 || aVar.a().length() == 0 || aVar.b().length() == 0) {
            return null;
        }
        try {
            Map map = (Map) this.b.fromJson(aVar.b());
            if (map == null) {
                map = t.i();
            } else {
                zq3.e(map);
            }
            if (map.isEmpty()) {
                return null;
            }
            return new UserTCFData(aVar.c(), aVar.a(), map);
        } catch (Exception unused) {
            throw new PurrResponseParserException("Can't parse unknown value=" + aVar.b());
        }
    }
}
