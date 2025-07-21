package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.facebook.AccessToken;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.bq7;
import defpackage.d34;
import defpackage.dq1;
import defpackage.g92;
import defpackage.ik;
import defpackage.kq3;
import defpackage.qd9;
import defpackage.up7;
import defpackage.w15;
import defpackage.w92;
import defpackage.z15;
import defpackage.zp1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class ShareDialog extends g92 {
    public static final b j = new b(null);
    private static final String k;
    private static final int l;
    private boolean g;
    private boolean h;
    private final List i;

    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Mode[] valuesCustom() {
            Mode[] valuesCustom = values();
            return (Mode[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    private final class a extends g92.b {
        private Object c;
        final /* synthetic */ ShareDialog d;

        /* renamed from: com.facebook.share.widget.ShareDialog$a$a, reason: collision with other inner class name */
        public static final class C0173a implements dq1.a {
            final /* synthetic */ ik a;
            final /* synthetic */ ShareContent b;
            final /* synthetic */ boolean c;

            C0173a(ik ikVar, ShareContent shareContent, boolean z) {
                this.a = ikVar;
                this.b = shareContent;
                this.c = z;
            }

            @Override // dq1.a
            public Bundle a() {
                d34 d34Var = d34.a;
                return d34.c(this.a.c(), this.b, this.c);
            }

            @Override // dq1.a
            public Bundle getParameters() {
                z15 z15Var = z15.a;
                return z15.g(this.a.c(), this.b, this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ShareDialog shareDialog) {
            super(shareDialog);
            zq3.h(shareDialog, "this$0");
            this.d = shareDialog;
            this.c = Mode.NATIVE;
        }

        @Override // g92.b
        public Object c() {
            return this.c;
        }

        @Override // g92.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ShareContent shareContent, boolean z) {
            zq3.h(shareContent, "content");
            return (shareContent instanceof ShareCameraEffectContent) && ShareDialog.j.d(shareContent.getClass());
        }

        @Override // g92.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ik b(ShareContent shareContent) {
            zq3.h(shareContent, "content");
            up7.m(shareContent);
            ik c = this.d.c();
            boolean k = this.d.k();
            zp1 g = ShareDialog.j.g(shareContent.getClass());
            if (g == null) {
                return null;
            }
            dq1 dq1Var = dq1.a;
            dq1.i(c, new C0173a(c, shareContent, k), g);
            return c;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(Class cls) {
            zp1 g = g(cls);
            return g != null && dq1.b(g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean e(ShareContent shareContent) {
            return f(shareContent.getClass());
        }

        private final boolean f(Class cls) {
            return ShareLinkContent.class.isAssignableFrom(cls) || (SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.Companion.g());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final zp1 g(Class cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.SHARE_DIALOG;
            }
            if (SharePhotoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.PHOTOS;
            }
            if (ShareVideoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.VIDEO;
            }
            if (ShareMediaContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.MULTIMEDIA;
            }
            if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
                return CameraEffectFeature.SHARE_CAMERA_EFFECT;
            }
            if (ShareStoryContent.class.isAssignableFrom(cls)) {
                return ShareStoryFeature.SHARE_STORY_ASSET;
            }
            return null;
        }

        private b() {
        }
    }

    private final class c extends g92.b {
        private Object c;
        final /* synthetic */ ShareDialog d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ShareDialog shareDialog) {
            super(shareDialog);
            zq3.h(shareDialog, "this$0");
            this.d = shareDialog;
            this.c = Mode.FEED;
        }

        @Override // g92.b
        public Object c() {
            return this.c;
        }

        @Override // g92.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ShareContent shareContent, boolean z) {
            zq3.h(shareContent, "content");
            return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent);
        }

        @Override // g92.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ik b(ShareContent shareContent) {
            Bundle d;
            zq3.h(shareContent, "content");
            ShareDialog shareDialog = this.d;
            shareDialog.l(shareDialog.d(), shareContent, Mode.FEED);
            ik c = this.d.c();
            if (shareContent instanceof ShareLinkContent) {
                up7.o(shareContent);
                d = qd9.e((ShareLinkContent) shareContent);
            } else {
                if (!(shareContent instanceof ShareFeedContent)) {
                    return null;
                }
                d = qd9.d((ShareFeedContent) shareContent);
            }
            dq1.k(c, "feed", d);
            return c;
        }
    }

    private final class d extends g92.b {
        private Object c;
        final /* synthetic */ ShareDialog d;

        public static final class a implements dq1.a {
            final /* synthetic */ ik a;
            final /* synthetic */ ShareContent b;
            final /* synthetic */ boolean c;

            a(ik ikVar, ShareContent shareContent, boolean z) {
                this.a = ikVar;
                this.b = shareContent;
                this.c = z;
            }

            @Override // dq1.a
            public Bundle a() {
                d34 d34Var = d34.a;
                return d34.c(this.a.c(), this.b, this.c);
            }

            @Override // dq1.a
            public Bundle getParameters() {
                z15 z15Var = z15.a;
                return z15.g(this.a.c(), this.b, this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ShareDialog shareDialog) {
            super(shareDialog);
            zq3.h(shareDialog, "this$0");
            this.d = shareDialog;
            this.c = Mode.NATIVE;
        }

        @Override // g92.b
        public Object c() {
            return this.c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        
            if (defpackage.dq1.b(com.facebook.share.internal.ShareDialogFeature.LINK_SHARE_QUOTES) != false) goto L25;
         */
        @Override // g92.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(com.facebook.share.model.ShareContent r3, boolean r4) {
            /*
                r2 = this;
                java.lang.String r2 = "content"
                defpackage.zq3.h(r3, r2)
                boolean r2 = r3 instanceof com.facebook.share.model.ShareCameraEffectContent
                r0 = 0
                if (r2 != 0) goto L55
                boolean r2 = r3 instanceof com.facebook.share.model.ShareStoryContent
                if (r2 == 0) goto Lf
                goto L55
            Lf:
                r2 = 1
                if (r4 != 0) goto L45
                com.facebook.share.model.ShareHashtag r4 = r3.f()
                if (r4 == 0) goto L21
                dq1 r4 = defpackage.dq1.a
                com.facebook.share.internal.ShareDialogFeature r4 = com.facebook.share.internal.ShareDialogFeature.HASHTAG
                boolean r4 = defpackage.dq1.b(r4)
                goto L22
            L21:
                r4 = r2
            L22:
                boolean r1 = r3 instanceof com.facebook.share.model.ShareLinkContent
                if (r1 == 0) goto L46
                r1 = r3
                com.facebook.share.model.ShareLinkContent r1 = (com.facebook.share.model.ShareLinkContent) r1
                java.lang.String r1 = r1.h()
                if (r1 == 0) goto L46
                int r1 = r1.length()
                if (r1 != 0) goto L36
                goto L46
            L36:
                if (r4 == 0) goto L43
                dq1 r4 = defpackage.dq1.a
                com.facebook.share.internal.ShareDialogFeature r4 = com.facebook.share.internal.ShareDialogFeature.LINK_SHARE_QUOTES
                boolean r4 = defpackage.dq1.b(r4)
                if (r4 == 0) goto L43
                goto L45
            L43:
                r4 = r0
                goto L46
            L45:
                r4 = r2
            L46:
                if (r4 == 0) goto L55
                com.facebook.share.widget.ShareDialog$b r4 = com.facebook.share.widget.ShareDialog.j
                java.lang.Class r3 = r3.getClass()
                boolean r3 = com.facebook.share.widget.ShareDialog.b.a(r4, r3)
                if (r3 == 0) goto L55
                r0 = r2
            L55:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.ShareDialog.d.a(com.facebook.share.model.ShareContent, boolean):boolean");
        }

        @Override // g92.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ik b(ShareContent shareContent) {
            zq3.h(shareContent, "content");
            ShareDialog shareDialog = this.d;
            shareDialog.l(shareDialog.d(), shareContent, Mode.NATIVE);
            up7.m(shareContent);
            ik c = this.d.c();
            boolean k = this.d.k();
            zp1 g = ShareDialog.j.g(shareContent.getClass());
            if (g == null) {
                return null;
            }
            dq1 dq1Var = dq1.a;
            dq1.i(c, new a(c, shareContent, k), g);
            return c;
        }
    }

    private final class e extends g92.b {
        private Object c;
        final /* synthetic */ ShareDialog d;

        public static final class a implements dq1.a {
            final /* synthetic */ ik a;
            final /* synthetic */ ShareContent b;
            final /* synthetic */ boolean c;

            a(ik ikVar, ShareContent shareContent, boolean z) {
                this.a = ikVar;
                this.b = shareContent;
                this.c = z;
            }

            @Override // dq1.a
            public Bundle a() {
                d34 d34Var = d34.a;
                return d34.c(this.a.c(), this.b, this.c);
            }

            @Override // dq1.a
            public Bundle getParameters() {
                z15 z15Var = z15.a;
                return z15.g(this.a.c(), this.b, this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ShareDialog shareDialog) {
            super(shareDialog);
            zq3.h(shareDialog, "this$0");
            this.d = shareDialog;
            this.c = Mode.NATIVE;
        }

        @Override // g92.b
        public Object c() {
            return this.c;
        }

        @Override // g92.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ShareContent shareContent, boolean z) {
            zq3.h(shareContent, "content");
            return (shareContent instanceof ShareStoryContent) && ShareDialog.j.d(shareContent.getClass());
        }

        @Override // g92.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ik b(ShareContent shareContent) {
            zq3.h(shareContent, "content");
            up7.n(shareContent);
            ik c = this.d.c();
            boolean k = this.d.k();
            zp1 g = ShareDialog.j.g(shareContent.getClass());
            if (g == null) {
                return null;
            }
            dq1 dq1Var = dq1.a;
            dq1.i(c, new a(c, shareContent, k), g);
            return c;
        }
    }

    private final class f extends g92.b {
        private Object c;
        final /* synthetic */ ShareDialog d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ShareDialog shareDialog) {
            super(shareDialog);
            zq3.h(shareDialog, "this$0");
            this.d = shareDialog;
            this.c = Mode.WEB;
        }

        private final SharePhotoContent e(SharePhotoContent sharePhotoContent, UUID uuid) {
            SharePhotoContent.a r = new SharePhotoContent.a().r(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = sharePhotoContent.h().size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    SharePhoto sharePhoto = (SharePhoto) sharePhotoContent.h().get(i);
                    Bitmap c = sharePhoto.c();
                    if (c != null) {
                        w15.a d = w15.d(uuid, c);
                        sharePhoto = new SharePhoto.a().i(sharePhoto).m(Uri.parse(d.b())).k(null).d();
                        arrayList2.add(d);
                    }
                    arrayList.add(sharePhoto);
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            r.s(arrayList);
            w15.a(arrayList2);
            return r.p();
        }

        private final String g(ShareContent shareContent) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) {
                return "share";
            }
            return null;
        }

        @Override // g92.b
        public Object c() {
            return this.c;
        }

        @Override // g92.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ShareContent shareContent, boolean z) {
            zq3.h(shareContent, "content");
            return ShareDialog.j.e(shareContent);
        }

        @Override // g92.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public ik b(ShareContent shareContent) {
            Bundle b;
            zq3.h(shareContent, "content");
            ShareDialog shareDialog = this.d;
            shareDialog.l(shareDialog.d(), shareContent, Mode.WEB);
            ik c = this.d.c();
            up7.o(shareContent);
            if (shareContent instanceof ShareLinkContent) {
                b = qd9.a((ShareLinkContent) shareContent);
            } else {
                if (!(shareContent instanceof SharePhotoContent)) {
                    return null;
                }
                b = qd9.b(e((SharePhotoContent) shareContent, c.c()));
            }
            dq1 dq1Var = dq1.a;
            dq1.k(c, g(shareContent), b);
            return c;
        }
    }

    public /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Mode.valuesCustom().length];
            iArr[Mode.AUTOMATIC.ordinal()] = 1;
            iArr[Mode.WEB.ordinal()] = 2;
            iArr[Mode.NATIVE.ordinal()] = 3;
            a = iArr;
        }
    }

    static {
        String simpleName = ShareDialog.class.getSimpleName();
        zq3.g(simpleName, "ShareDialog::class.java.simpleName");
        k = simpleName;
        l = CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Activity activity) {
        this(activity, l);
        zq3.h(activity, "activity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Context context, ShareContent shareContent, Mode mode) {
        if (this.h) {
            mode = Mode.AUTOMATIC;
        }
        int i = g.a[mode.ordinal()];
        String str = DatasetUtils.UNKNOWN_IDENTITY_ID;
        String str2 = i != 1 ? i != 2 ? i != 3 ? DatasetUtils.UNKNOWN_IDENTITY_ID : "native" : "web" : "automatic";
        zp1 g2 = j.g(shareContent.getClass());
        if (g2 == ShareDialogFeature.SHARE_DIALOG) {
            str = "status";
        } else if (g2 == ShareDialogFeature.PHOTOS) {
            str = "photo";
        } else if (g2 == ShareDialogFeature.VIDEO) {
            str = AssetConstants.VIDEO_TYPE;
        }
        kq3 a2 = kq3.b.a(context, w92.m());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str2);
        bundle.putString("fb_share_dialog_content_type", str);
        a2.g("fb_share_dialog_show", bundle);
    }

    @Override // defpackage.g92
    protected ik c() {
        return new ik(f(), null, 2, null);
    }

    @Override // defpackage.g92
    protected List e() {
        return this.i;
    }

    public boolean k() {
        return this.g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Activity activity, int i) {
        super(activity, i);
        zq3.h(activity, "activity");
        this.h = true;
        this.i = i.h(new d(this), new c(this), new f(this), new a(this), new e(this));
        bq7.v(i);
    }
}
