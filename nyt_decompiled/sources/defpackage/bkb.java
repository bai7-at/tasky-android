package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bkb implements uxa {
    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wib wibVar = (wib) obj;
        ymb zzq = wibVar.zzq();
        if (zzq == null) {
            try {
                ymb ymbVar = new ymb(wibVar, Float.parseFloat((String) map.get("duration")), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("customControlsAllowed")), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("clickToExpandAllowed")));
                wibVar.z(ymbVar);
                zzq = ymbVar;
            } catch (NullPointerException | NumberFormatException e) {
                fgb.e("Unable to parse videoMeta message.", e);
                dyf.q().w(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (fgb.j(3)) {
            fgb.b("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + parseInt + " , aspectRatio : " + str);
        }
        zzq.x6(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
