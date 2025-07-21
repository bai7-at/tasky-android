package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class q6b {
    private final wlb a;
    private final String b;

    public q6b(wlb wlbVar, String str) {
        this.a = wlbVar;
        this.b = str;
    }

    public final void b(int i, int i2, int i3, int i4) {
        try {
            this.a.k("onDefaultPositionReceived", new JSONObject().put(QueryKeys.SCROLL_POSITION_TOP, i).put(QueryKeys.CONTENT_HEIGHT, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            fgb.e("Error occurred while dispatching default position.", e);
        }
    }

    public final void c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.b);
            wlb wlbVar = this.a;
            if (wlbVar != null) {
                wlbVar.k("onError", put);
            }
        } catch (JSONException e) {
            fgb.e("Error occurred while dispatching error event.", e);
        }
    }

    public final void d(String str) {
        try {
            this.a.k("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            fgb.e("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.a.k("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            fgb.e("Error occurred while obtaining screen information.", e);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        try {
            this.a.k("onSizeChanged", new JSONObject().put(QueryKeys.SCROLL_POSITION_TOP, i).put(QueryKeys.CONTENT_HEIGHT, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            fgb.e("Error occurred while dispatching size change.", e);
        }
    }

    public final void g(String str) {
        try {
            this.a.k("onStateChanged", new JSONObject().put(TransferTable.COLUMN_STATE, str));
        } catch (JSONException e) {
            fgb.e("Error occurred while dispatching state change.", e);
        }
    }
}
