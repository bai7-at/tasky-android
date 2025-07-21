package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class vk3 {
    private final b a;

    private static final class a implements b {
        final InputContentInfo a;

        a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // vk3.b
        public Object a() {
            return this.a;
        }

        @Override // vk3.b
        public Uri b() {
            return this.a.getContentUri();
        }

        @Override // vk3.b
        public void c() {
            this.a.requestPermission();
        }

        @Override // vk3.b
        public Uri d() {
            return this.a.getLinkUri();
        }

        @Override // vk3.b
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }

    private interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    private vk3(b bVar) {
        this.a = bVar;
    }

    public static vk3 f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new vk3(new a(obj));
    }

    public Uri a() {
        return this.a.b();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.d();
    }

    public void d() {
        this.a.c();
    }

    public Object e() {
        return this.a.a();
    }
}
