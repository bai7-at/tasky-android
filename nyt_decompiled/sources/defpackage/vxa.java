package defpackage;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vxa implements uxa {
    private final wxa a;

    public vxa(wxa wxaVar) {
        this.a = wxaVar;
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("transparentBackground"));
        boolean equals2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            fgb.e("Fail to parse float", e);
        }
        this.a.c(equals);
        this.a.b(equals2, f);
        wlbVar.M(equals);
    }
}
