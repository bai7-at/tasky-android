package defpackage;

import android.app.Application;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.remoteconfig.source.ResourceNames;
import io.reactivex.Completable;

/* loaded from: classes4.dex */
public final class d07 implements aw6 {
    private final Application a;

    public d07(Application application) {
        zq3.h(application, "context");
        this.a = application;
    }

    @Override // defpackage.aw6
    public Boolean a(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        try {
            return Boolean.valueOf(this.a.getResources().getBoolean(ResourceNames.valueOf(str).getResId()));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.aw6
    public Completable b() {
        Completable complete = Completable.complete();
        zq3.g(complete, "complete(...)");
        return complete;
    }

    @Override // defpackage.aw6
    public Number c(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        try {
            return Integer.valueOf(this.a.getResources().getInteger(ResourceNames.valueOf(str).getResId()));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.aw6
    public String d(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        try {
            return this.a.getResources().getString(ResourceNames.valueOf(str).getResId());
        } catch (Throwable unused) {
            return null;
        }
    }
}
