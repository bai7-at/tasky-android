package co.datadome.sdk;

import androidx.annotation.Keep;
import defpackage.yn9;

@Keep
/* loaded from: classes.dex */
public abstract class DataDomeSDKListener implements yn9 {
    @Override // defpackage.yn9
    public void onCaptchaCancelled() {
    }

    @Override // defpackage.yn9
    public void onCaptchaDismissed() {
    }

    @Override // defpackage.yn9
    public void onCaptchaLoaded() {
    }

    @Override // defpackage.yn9
    public void onCaptchaSuccess() {
    }

    public void onDataDomeResponse(int i, String str) {
    }

    @Override // defpackage.yn9
    public abstract /* synthetic */ void onError(int i, String str);

    public void onHangOnRequest(int i) {
    }

    public void willDisplayCaptcha() {
    }
}
