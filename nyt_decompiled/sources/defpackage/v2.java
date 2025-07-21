package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes.dex */
public final class v2 extends ClickableSpan {
    private final int a;
    private final h3 b;
    private final int c;

    public v2(int i, h3 h3Var, int i2) {
        this.a = i;
        this.b = h3Var;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.X(this.c, bundle);
    }
}
