package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class l38 extends ss {
    public l38(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.k91
    public Class a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ss
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ss
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
