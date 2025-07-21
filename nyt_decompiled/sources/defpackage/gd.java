package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public abstract class gd {
    public static final h90 a(Intent intent) {
        zq3.h(intent, "<this>");
        String stringExtra = intent.getStringExtra("com.nytimes.android.EXTRA_DATA_SOURCE");
        String stringExtra2 = intent.getStringExtra("com.nytimes.android.EXTRA_BLOCK_TITLE");
        String stringExtra3 = intent.getStringExtra("com.nytimes.android.EXTRA_BLOCK_DATA_ID");
        if (stringExtra == null || stringExtra2 == null || stringExtra3 == null) {
            return null;
        }
        return new h90(stringExtra, stringExtra2, stringExtra3, null, null, 24, null);
    }
}
