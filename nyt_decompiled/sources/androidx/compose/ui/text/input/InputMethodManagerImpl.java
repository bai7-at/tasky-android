package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import defpackage.al3;
import defpackage.c04;
import defpackage.gx7;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements al3 {
    private final View a;
    private final c04 b = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager mo865invoke() {
            View view;
            view = InputMethodManagerImpl.this.a;
            Object systemService = view.getContext().getSystemService("input_method");
            zq3.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    });
    private final gx7 c;

    public InputMethodManagerImpl(View view) {
        this.a = view;
        this.c = new gx7(view);
    }

    private final InputMethodManager h() {
        return (InputMethodManager) this.b.getValue();
    }

    @Override // defpackage.al3
    public void a(int i, ExtractedText extractedText) {
        h().updateExtractedText(this.a, i, extractedText);
    }

    @Override // defpackage.al3
    public void b() {
        this.c.b();
    }

    @Override // defpackage.al3
    public void c(int i, int i2, int i3, int i4) {
        h().updateSelection(this.a, i, i2, i3, i4);
    }

    @Override // defpackage.al3
    public void d() {
        h().restartInput(this.a);
    }

    @Override // defpackage.al3
    public void e() {
        this.c.a();
    }

    @Override // defpackage.al3
    public void f(CursorAnchorInfo cursorAnchorInfo) {
        h().updateCursorAnchorInfo(this.a, cursorAnchorInfo);
    }

    @Override // defpackage.al3
    public boolean isActive() {
        return h().isActive(this.a);
    }
}
