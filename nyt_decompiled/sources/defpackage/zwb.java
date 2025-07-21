package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.AssetConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zwb implements x1b {
    private final Context a;
    private final ria b;
    private final PowerManager c;

    public zwb(Context context, ria riaVar) {
        this.a = context;
        this.b = riaVar;
        this.c = (PowerManager) context.getSystemService("power");
    }

    @Override // defpackage.x1b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(fxb fxbVar) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        uia uiaVar = fxbVar.f;
        if (uiaVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.b.d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = uiaVar.a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.b.b()).put("activeViewJSON", this.b.d()).put("timestamp", fxbVar.d).put("adFormat", this.b.a()).put("hashCode", this.b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", fxbVar.b).put("isNative", this.b.e()).put("isScreenOn", this.c.isInteractive()).put("appMuted", dyf.t().e()).put("appVolume", dyf.t().a()).put("deviceVolume", iu9.b(this.a.getApplicationContext()));
            if (((Boolean) pla.c().a(mpa.I5)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.a.getApplicationContext().getSystemService(AssetConstants.AUDIO_TYPE);
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", uiaVar.b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", uiaVar.c.top).put("bottom", uiaVar.c.bottom).put("left", uiaVar.c.left).put("right", uiaVar.c.right)).put("adBox", new JSONObject().put("top", uiaVar.d.top).put("bottom", uiaVar.d.bottom).put("left", uiaVar.d.left).put("right", uiaVar.d.right)).put("globalVisibleBox", new JSONObject().put("top", uiaVar.e.top).put("bottom", uiaVar.e.bottom).put("left", uiaVar.e.left).put("right", uiaVar.e.right)).put("globalVisibleBoxVisible", uiaVar.f).put("localVisibleBox", new JSONObject().put("top", uiaVar.g.top).put("bottom", uiaVar.g.bottom).put("left", uiaVar.g.left).put("right", uiaVar.g.right)).put("localVisibleBoxVisible", uiaVar.h).put("hitBox", new JSONObject().put("top", uiaVar.i.top).put("bottom", uiaVar.i.bottom).put("left", uiaVar.i.left).put("right", uiaVar.i.right)).put("screenDensity", this.a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", fxbVar.a);
            if (((Boolean) pla.c().a(mpa.p1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = uiaVar.k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(fxbVar.e)) {
                jSONObject3.put("doneReasonCode", QueryKeys.USER_ID);
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
