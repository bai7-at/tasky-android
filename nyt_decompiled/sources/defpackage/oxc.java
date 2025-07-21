package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oxc {
    private final Context a;
    private final ApplicationInfo b;
    private String e = "";
    private final int c = ((Integer) pla.c().a(mpa.a9)).intValue();
    private final int d = ((Integer) pla.c().a(mpa.b9)).intValue();

    public oxc(Context context) {
        this.a = context;
        this.b = context.getApplicationInfo();
    }

    public final JSONObject a() {
        String str;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.a;
            String str2 = this.b.packageName;
            cde cdeVar = wxf.l;
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, Wrappers.packageManager(context).getApplicationLabel(str2));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.b.packageName);
        dyf.r();
        Drawable drawable = null;
        try {
            str = wxf.R(this.a);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (this.e.isEmpty()) {
            try {
                drawable = (Drawable) Wrappers.packageManager(this.a).getApplicationLabelAndIcon(this.b.packageName).b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.c, this.d);
                Bitmap createBitmap = Bitmap.createBitmap(this.c, this.d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.e = encodeToString;
        }
        if (!this.e.isEmpty()) {
            jSONObject.put("icon", this.e);
            jSONObject.put("iconWidthPx", this.c);
            jSONObject.put("iconHeightPx", this.d);
        }
        return jSONObject;
    }
}
