package defpackage;

import android.app.appsearch.GlobalSearchSession;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class tg0 {
    private final File a;

    public tg0(ue2 ue2Var) {
        this.a = ue2Var.d("com.crashlytics.settings.json");
    }

    private File a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        m94.f().b("Checking for cached settings...");
        GlobalSearchSession globalSearchSession = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a = a();
                if (a.exists()) {
                    fileInputStream = new FileInputStream(a);
                    try {
                        jSONObject = new JSONObject(CommonUtils.C(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        m94.f().e("Failed to fetch cached settings", e);
                        CommonUtils.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    m94.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                CommonUtils.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th) {
                th = th;
                globalSearchSession = "Checking for cached settings...";
                CommonUtils.e(globalSearchSession, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.e(globalSearchSession, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j, JSONObject jSONObject) {
        FileWriter fileWriter;
        m94.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                CommonUtils.e(fileWriter, "Failed to close settings writer.");
            } catch (Exception e2) {
                e = e2;
                fileWriter2 = fileWriter;
                m94.f().e("Failed to cache settings", e);
                CommonUtils.e(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                CommonUtils.e(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
