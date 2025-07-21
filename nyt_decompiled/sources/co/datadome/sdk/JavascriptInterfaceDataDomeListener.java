package co.datadome.sdk;

import android.webkit.JavascriptInterface;

/* loaded from: classes.dex */
class JavascriptInterfaceDataDomeListener {
    private final DataDomeJavascriptInterfaceListener mListener;

    public interface DataDomeJavascriptInterfaceListener {
        void onAdditionalChallengeRedirection(int i);

        void onCaptchaSuccess(String str);
    }

    JavascriptInterfaceDataDomeListener(DataDomeJavascriptInterfaceListener dataDomeJavascriptInterfaceListener) {
        this.mListener = dataDomeJavascriptInterfaceListener;
    }

    @JavascriptInterface
    public void onAdditionalChallengeRedirection(int i) {
        DataDomeJavascriptInterfaceListener dataDomeJavascriptInterfaceListener = this.mListener;
        if (dataDomeJavascriptInterfaceListener != null) {
            dataDomeJavascriptInterfaceListener.onAdditionalChallengeRedirection(i);
        }
    }

    @JavascriptInterface
    public void onCaptchaSuccess(String str) {
        DataDomeJavascriptInterfaceListener dataDomeJavascriptInterfaceListener = this.mListener;
        if (dataDomeJavascriptInterfaceListener != null) {
            dataDomeJavascriptInterfaceListener.onCaptchaSuccess(str);
        }
    }
}
