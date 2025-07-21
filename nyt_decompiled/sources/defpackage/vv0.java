package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class vv0 {
    private final Object a;
    private final View b;

    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    private static class b {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private static class c {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private vv0(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public static vv0 f(ContentCaptureSession contentCaptureSession, View view) {
        return new vv0(contentCaptureSession, view);
    }

    public AutofillId a(long j) {
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.a;
        q20 a2 = m99.a(this.b);
        Objects.requireNonNull(a2);
        return b.a(contentCaptureSession, a2.a(), j);
    }

    public kb9 b(AutofillId autofillId, long j) {
        return kb9.g(b.c((ContentCaptureSession) this.a, autofillId, j));
    }

    public void c(AutofillId autofillId, CharSequence charSequence) {
        b.e((ContentCaptureSession) this.a, autofillId, charSequence);
    }

    public void d(List list) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.a((ContentCaptureSession) this.a, list);
            return;
        }
        ViewStructure b2 = b.b((ContentCaptureSession) this.a, this.b);
        a.a(b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
        b.d((ContentCaptureSession) this.a, b2);
        for (int i = 0; i < list.size(); i++) {
            b.d((ContentCaptureSession) this.a, (ViewStructure) list.get(i));
        }
        ViewStructure b3 = b.b((ContentCaptureSession) this.a, this.b);
        a.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
        b.d((ContentCaptureSession) this.a, b3);
    }

    public void e(long[] jArr) {
        if (Build.VERSION.SDK_INT >= 34) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.a;
            q20 a2 = m99.a(this.b);
            Objects.requireNonNull(a2);
            b.f(contentCaptureSession, a2.a(), jArr);
            return;
        }
        ViewStructure b2 = b.b((ContentCaptureSession) this.a, this.b);
        a.a(b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
        b.d((ContentCaptureSession) this.a, b2);
        ContentCaptureSession contentCaptureSession2 = (ContentCaptureSession) this.a;
        q20 a3 = m99.a(this.b);
        Objects.requireNonNull(a3);
        b.f(contentCaptureSession2, a3.a(), jArr);
        ViewStructure b3 = b.b((ContentCaptureSession) this.a, this.b);
        a.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
        b.d((ContentCaptureSession) this.a, b3);
    }
}
