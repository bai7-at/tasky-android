package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.internal.ads.zb;
import com.nytimes.android.api.cms.AssetConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ioc {
    private final Executor a;
    private final doc b;

    public ioc(Executor executor, doc docVar) {
        this.a = executor;
        this.b = docVar;
    }

    public final j64 a(JSONObject jSONObject, String str) {
        j64 h;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zb.h(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                h = zb.h(null);
            } else {
                final String optString = optJSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                if (optString == null) {
                    h = zb.h(null);
                } else {
                    String optString2 = optJSONObject.optString(TransferTable.COLUMN_TYPE);
                    h = "string".equals(optString2) ? zb.h(new hoc(optString, optJSONObject.optString("string_value"))) : AssetConstants.IMAGE_TYPE.equals(optString2) ? zb.m(this.b.e(optJSONObject, "image_value"), new gge() { // from class: foc
                        @Override // defpackage.gge
                        public final Object apply(Object obj) {
                            return new hoc(optString, (usa) obj);
                        }
                    }, this.a) : zb.h(null);
                }
            }
            arrayList.add(h);
        }
        return zb.m(zb.d(arrayList), new gge() { // from class: goc
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (hoc hocVar : (List) obj) {
                    if (hocVar != null) {
                        arrayList2.add(hocVar);
                    }
                }
                return arrayList2;
            }
        }, this.a);
    }
}
