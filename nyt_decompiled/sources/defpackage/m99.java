package defpackage;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes.dex */
public abstract class m99 {

    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    private static class c {
        static void a(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }

    public static q20 a(View view) {
        return q20.b(a.a(view));
    }

    public static vv0 b(View view) {
        ContentCaptureSession a2 = b.a(view);
        if (a2 == null) {
            return null;
        }
        return vv0.f(a2, view);
    }

    public static void c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i);
        }
    }
}
