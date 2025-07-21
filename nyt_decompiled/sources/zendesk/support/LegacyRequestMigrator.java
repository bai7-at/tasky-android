package zendesk.support;

import android.content.SharedPreferences;
import com.zendesk.logger.Logger;
import defpackage.r48;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
class LegacyRequestMigrator implements RequestMigrator {
    private SharedPreferences legacyRequestStorage;

    LegacyRequestMigrator(SharedPreferences sharedPreferences) {
        this.legacyRequestStorage = sharedPreferences;
    }

    private String getCommentCountKey(String str) {
        return String.format(Locale.US, "%s-%s", "request-id-cc", str);
    }

    @Override // zendesk.support.RequestMigrator
    public void clearLegacyRequestStorage() {
        this.legacyRequestStorage.edit().clear().apply();
    }

    @Override // zendesk.support.RequestMigrator
    public List<RequestData> getLegacyRequests() {
        String string = this.legacyRequestStorage.getString("stored_requests", null);
        if (r48.d(string)) {
            return Collections.emptyList();
        }
        Logger.b("LegacyRequestMigrator", "Migrating legacy request IDs.", new Object[0]);
        List<String> a = r48.a(string);
        ArrayList arrayList = new ArrayList(a.size());
        for (String str : a) {
            int i = this.legacyRequestStorage.getInt(getCommentCountKey(str), -1);
            if (i > -1) {
                arrayList.add(RequestData.create(str, i, 0));
            } else {
                arrayList.add(RequestData.create(str, 0, 0));
            }
        }
        return arrayList;
    }
}
