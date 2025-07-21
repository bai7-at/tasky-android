package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class sg implements vy8 {
    private final Context a;

    public sg(Context context) {
        this.a = context;
    }

    @Override // defpackage.vy8
    public void a(String str) {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
