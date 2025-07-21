package defpackage;

import android.text.format.DateUtils;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.api.cms.Asset;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes4.dex */
public abstract class c28 {
    public static final void a(CompositeDisposable compositeDisposable, Disposable disposable) {
        zq3.h(compositeDisposable, "<this>");
        zq3.h(disposable, "disposable");
        compositeDisposable.add(disposable);
    }

    public static final String b(z18 z18Var) {
        zq3.h(z18Var, "<this>");
        return DateUtils.getRelativeTimeSpanString(z18Var.i().toInstant().toEpochMilli()).toString();
    }

    public static final z18 c(Asset asset) {
        zq3.h(asset, "<this>");
        long assetId = asset.getAssetId();
        String title = asset.getTitle();
        if (title == null) {
            title = "";
        }
        String recentlyViewedImageUrl = asset.recentlyViewedImageUrl();
        String summary = asset.getSummary();
        if (summary == null) {
            summary = "";
        }
        String assetType = asset.getAssetType();
        if (assetType == null) {
            assetType = "";
        }
        String sectionDisplayName = asset.getSectionDisplayName();
        if (sectionDisplayName == null) {
            sectionDisplayName = "";
        }
        String extractKicker = asset.extractKicker();
        OffsetDateTime lastUpdated = asset.lastUpdated();
        OffsetDateTime now = OffsetDateTime.now();
        zq3.g(now, "now(...)");
        return new z18(assetId, title, recentlyViewedImageUrl, summary, assetType, sectionDisplayName, extractKicker, lastUpdated, now, 0, asset.getUrl(), asset.getSafeUri(), 0);
    }

    public static final z18 d(z18 z18Var, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i) {
        z18 a;
        zq3.h(z18Var, "<this>");
        zq3.h(offsetDateTime, "lastAccessed");
        zq3.h(offsetDateTime2, "lastUpdated");
        a = z18Var.a((r30 & 1) != 0 ? z18Var.a : 0L, (r30 & 2) != 0 ? z18Var.b : null, (r30 & 4) != 0 ? z18Var.c : null, (r30 & 8) != 0 ? z18Var.d : null, (r30 & 16) != 0 ? z18Var.e : null, (r30 & 32) != 0 ? z18Var.f : null, (r30 & 64) != 0 ? z18Var.g : null, (r30 & 128) != 0 ? z18Var.h : offsetDateTime2, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? z18Var.i : offsetDateTime, (r30 & 512) != 0 ? z18Var.j : 0, (r30 & 1024) != 0 ? z18Var.k : null, (r30 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? z18Var.l : null, (r30 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? z18Var.m : i);
        return a;
    }

    public static final z18 e(z18 z18Var, int i) {
        z18 a;
        zq3.h(z18Var, "<this>");
        a = z18Var.a((r30 & 1) != 0 ? z18Var.a : 0L, (r30 & 2) != 0 ? z18Var.b : null, (r30 & 4) != 0 ? z18Var.c : null, (r30 & 8) != 0 ? z18Var.d : null, (r30 & 16) != 0 ? z18Var.e : null, (r30 & 32) != 0 ? z18Var.f : null, (r30 & 64) != 0 ? z18Var.g : null, (r30 & 128) != 0 ? z18Var.h : null, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? z18Var.i : null, (r30 & 512) != 0 ? z18Var.j : i, (r30 & 1024) != 0 ? z18Var.k : null, (r30 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? z18Var.l : null, (r30 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? z18Var.m : 0);
        return a;
    }
}
