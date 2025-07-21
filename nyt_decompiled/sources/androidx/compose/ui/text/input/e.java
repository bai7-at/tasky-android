package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import defpackage.al3;
import defpackage.am1;
import defpackage.bm1;
import defpackage.el3;
import defpackage.fy1;
import defpackage.ji8;
import defpackage.kp0;
import defpackage.oh2;
import defpackage.vl7;
import defpackage.wk3;
import defpackage.wl7;
import defpackage.zl7;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class e implements InputConnection {
    private final wk3 a;
    private final boolean b;
    private int c;
    private TextFieldValue d;
    private int e;
    private boolean f;
    private final List g = new ArrayList();
    private boolean h = true;

    public e(TextFieldValue textFieldValue, wk3 wk3Var, boolean z) {
        this.a = wk3Var;
        this.b = z;
        this.d = textFieldValue;
    }

    private final void a(fy1 fy1Var) {
        b();
        try {
            this.g.add(fy1Var);
        } finally {
            c();
        }
    }

    private final boolean b() {
        this.c++;
        return true;
    }

    private final boolean c() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0 && !this.g.isEmpty()) {
            this.a.e(i.a1(this.g));
            this.g.clear();
        }
        return this.c > 0;
    }

    private final void d(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.h;
        return z ? b() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        this.a.b(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.h;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new kp0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new am1(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new bm1(i, i2));
        return true;
    }

    public final void e(TextFieldValue textFieldValue) {
        this.d = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    public final void f(TextFieldValue textFieldValue, al3 al3Var) {
        if (this.h) {
            e(textFieldValue);
            if (this.f) {
                al3Var.a(this.e, el3.a(textFieldValue));
            }
            androidx.compose.ui.text.i f = textFieldValue.f();
            int l = f != null ? androidx.compose.ui.text.i.l(f.r()) : -1;
            androidx.compose.ui.text.i f2 = textFieldValue.f();
            al3Var.c(androidx.compose.ui.text.i.l(textFieldValue.g()), androidx.compose.ui.text.i.k(textFieldValue.g()), l, f2 != null ? androidx.compose.ui.text.i.k(f2.r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new oh2());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.d.h(), androidx.compose.ui.text.i.l(this.d.g()), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f = z;
        if (z) {
            this.e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return el3.a(this.d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        if (androidx.compose.ui.text.i.h(this.d.g())) {
            return null;
        }
        return ji8.a(this.d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        return ji8.b(this.d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return ji8.c(this.d, i).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new zl7(0, this.d.h().length()));
                    break;
                case R.id.cut:
                    d(277);
                    break;
                case R.id.copy:
                    d(278);
                    break;
                case R.id.paste:
                    d(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int a;
        boolean z = this.h;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    a = a.b.c();
                    break;
                case 3:
                    a = a.b.g();
                    break;
                case 4:
                    a = a.b.h();
                    break;
                case 5:
                    a = a.b.d();
                    break;
                case 6:
                    a = a.b.b();
                    break;
                case 7:
                    a = a.b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                    a = a.b.a();
                    break;
            }
        } else {
            a = a.b.a();
        }
        this.a.d(a);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.h;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (i & 1) != 0;
        boolean z8 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            boolean z9 = (i & 16) != 0;
            boolean z10 = (i & 8) != 0;
            boolean z11 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z = z11;
                z4 = z10;
                z3 = z9;
            } else if (i2 >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z6;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.a.c(z7, z8, z3, z4, z, z2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        this.a.a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new vl7(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new wl7(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new zl7(i, i2));
        return true;
    }
}
