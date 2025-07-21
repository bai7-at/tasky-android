package com.google.android.tv.ads.controls;

import android.R;
import android.os.Bundle;
import com.google.android.tv.ads.IconClickFallbackImage;
import com.google.android.tv.ads.IconClickFallbackImages;
import defpackage.g9;
import defpackage.jk;

/* loaded from: classes3.dex */
public final class FallbackImageActivity extends jk {
    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IconClickFallbackImages iconClickFallbackImages;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        boolean z = false;
        if (extras != null && extras.getBoolean("render_error_message")) {
            z = true;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null && (iconClickFallbackImages = (IconClickFallbackImages) extras2.getParcelable("icon_click_fallback_images")) != null) {
            for (IconClickFallbackImage iconClickFallbackImage : iconClickFallbackImages.b()) {
                if (!g9.b(iconClickFallbackImage)) {
                    break;
                }
            }
        }
        iconClickFallbackImage = null;
        if (z || iconClickFallbackImage == null) {
            getSupportFragmentManager().p().v(true).s(R.id.content, ErrorMessageFragment.class, null).h();
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("wta_uri", iconClickFallbackImage.e());
        bundle2.putString("wta_alt_text", iconClickFallbackImage.b());
        getSupportFragmentManager().p().v(true).s(R.id.content, WhyThisAdFragment.class, bundle2).h();
    }
}
