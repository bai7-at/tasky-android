package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import defpackage.cg0;

/* loaded from: classes4.dex */
public final class k implements cg0 {
    final LruCache a;

    class a extends LruCache {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.b;
        }
    }

    static final class b {
        final Bitmap a;
        final int b;

        b(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    public k(Context context) {
        this(w.b(context));
    }

    @Override // defpackage.cg0
    public int a() {
        return this.a.maxSize();
    }

    @Override // defpackage.cg0
    public void b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int j = w.j(bitmap);
        if (j > a()) {
            this.a.remove(str);
        } else {
            this.a.put(str, new b(bitmap, j));
        }
    }

    @Override // defpackage.cg0
    public Bitmap get(String str) {
        b bVar = (b) this.a.get(str);
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // defpackage.cg0
    public int size() {
        return this.a.size();
    }

    public k(int i) {
        this.a = new a(i);
    }
}
