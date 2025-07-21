package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.TzdbZoneRulesProvider;
import org.threeten.bp.zone.ZoneRulesInitializer;
import org.threeten.bp.zone.ZoneRulesProvider;

/* loaded from: classes3.dex */
final class bu extends ZoneRulesInitializer {
    private final Context a;
    private final String b;

    bu(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // org.threeten.bp.zone.ZoneRulesInitializer
    protected void initializeProviders() {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.a.getAssets().open(this.b);
                TzdbZoneRulesProvider tzdbZoneRulesProvider = new TzdbZoneRulesProvider(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                ZoneRulesProvider.registerProvider(tzdbZoneRulesProvider);
            } catch (IOException e) {
                throw new IllegalStateException(this.b + " missing from assets", e);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
