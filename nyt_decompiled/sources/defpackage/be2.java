package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public class be2 extends ss {
    public be2(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.k91
    public Class a() {
        return ParcelFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ss
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ss
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
