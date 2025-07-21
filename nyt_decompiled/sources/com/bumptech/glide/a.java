package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import defpackage.a07;
import defpackage.ae2;
import defpackage.af0;
import defpackage.cb6;
import defpackage.dz6;
import defpackage.ef0;
import defpackage.eg8;
import defpackage.ez8;
import defpackage.fb3;
import defpackage.ff0;
import defpackage.fl3;
import defpackage.gf0;
import defpackage.gh3;
import defpackage.gl3;
import defpackage.h48;
import defpackage.if0;
import defpackage.iz6;
import defpackage.jf0;
import defpackage.jv1;
import defpackage.k79;
import defpackage.ke2;
import defpackage.kf0;
import defpackage.kz2;
import defpackage.kz8;
import defpackage.lh4;
import defpackage.lz2;
import defpackage.m38;
import defpackage.me4;
import defpackage.mz2;
import defpackage.n80;
import defpackage.ny6;
import defpackage.nz2;
import defpackage.o38;
import defpackage.o80;
import defpackage.oa1;
import defpackage.ou0;
import defpackage.p80;
import defpackage.pp4;
import defpackage.py6;
import defpackage.q80;
import defpackage.r80;
import defpackage.ro5;
import defpackage.so4;
import defpackage.so5;
import defpackage.sz2;
import defpackage.to;
import defpackage.to4;
import defpackage.ua3;
import defpackage.vo4;
import defpackage.vz6;
import defpackage.w62;
import defpackage.w80;
import defpackage.x19;
import defpackage.xt;
import defpackage.xw8;
import defpackage.xy8;
import defpackage.yw8;
import defpackage.z03;
import defpackage.z06;
import defpackage.zw8;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a implements ComponentCallbacks2 {
    private static volatile a l;
    private static volatile boolean m;
    private final h a;
    private final w80 b;
    private final pp4 c;
    private final c d;
    private final Registry e;
    private final to f;
    private final ny6 g;
    private final ou0 h;
    private final InterfaceC0146a j;
    private final List i = new ArrayList();
    private MemoryCategory k = MemoryCategory.NORMAL;

    /* renamed from: com.bumptech.glide.a$a, reason: collision with other inner class name */
    public interface InterfaceC0146a {
        py6 build();
    }

    a(Context context, h hVar, pp4 pp4Var, w80 w80Var, to toVar, ny6 ny6Var, ou0 ou0Var, int i, InterfaceC0146a interfaceC0146a, Map map, List list, boolean z, boolean z2) {
        iz6 ef0Var;
        iz6 dVar;
        Registry registry;
        this.a = hVar;
        this.b = w80Var;
        this.f = toVar;
        this.c = pp4Var;
        this.g = ny6Var;
        this.h = ou0Var;
        this.j = interfaceC0146a;
        Resources resources = context.getResources();
        Registry registry2 = new Registry();
        this.e = registry2;
        registry2.p(new DefaultImageHeaderParser());
        registry2.p(new w62());
        List g = registry2.g();
        jf0 jf0Var = new jf0(context, g, w80Var, toVar);
        iz6 h = k79.h(w80Var);
        com.bumptech.glide.load.resource.bitmap.a aVar = new com.bumptech.glide.load.resource.bitmap.a(registry2.g(), resources.getDisplayMetrics(), w80Var, toVar);
        if (z2) {
            dVar = new fl3();
            ef0Var = new ff0();
        } else {
            ef0Var = new ef0(aVar);
            dVar = new com.bumptech.glide.load.resource.bitmap.d(aVar, toVar);
        }
        vz6 vz6Var = new vz6(context);
        a07.c cVar = new a07.c(resources);
        a07.d dVar2 = new a07.d(resources);
        a07.b bVar = new a07.b(resources);
        a07.a aVar2 = new a07.a(resources);
        r80 r80Var = new r80(toVar);
        n80 n80Var = new n80();
        mz2 mz2Var = new mz2();
        ContentResolver contentResolver = context.getContentResolver();
        registry2.a(ByteBuffer.class, new gf0()).a(InputStream.class, new m38(toVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, ef0Var).e("Bitmap", InputStream.class, Bitmap.class, dVar);
        if (so5.c()) {
            registry2.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new ro5(aVar));
        }
        registry2.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, k79.c(w80Var)).c(Bitmap.class, Bitmap.class, zw8.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new xw8()).b(Bitmap.class, r80Var).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new o80(resources, ef0Var)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new o80(resources, dVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new o80(resources, h)).b(BitmapDrawable.class, new p80(w80Var, r80Var)).e("Gif", InputStream.class, lz2.class, new o38(g, jf0Var, toVar)).e("Gif", ByteBuffer.class, lz2.class, jf0Var).b(lz2.class, new nz2()).c(kz2.class, kz2.class, zw8.a.a()).e("Bitmap", kz2.class, Bitmap.class, new sz2(w80Var)).d(Uri.class, Drawable.class, vz6Var).d(Uri.class, Bitmap.class, new dz6(vz6Var, w80Var)).o(new kf0.a()).c(File.class, ByteBuffer.class, new if0.b()).c(File.class, InputStream.class, new ke2.e()).d(File.class, File.class, new ae2()).c(File.class, ParcelFileDescriptor.class, new ke2.b()).c(File.class, File.class, zw8.a.a()).o(new gl3.a(toVar));
        if (so5.c()) {
            registry = registry2;
            registry.o(new so5.a());
        } else {
            registry = registry2;
        }
        Class cls = Integer.TYPE;
        registry.c(cls, InputStream.class, cVar).c(cls, ParcelFileDescriptor.class, bVar).c(Integer.class, InputStream.class, cVar).c(Integer.class, ParcelFileDescriptor.class, bVar).c(Integer.class, Uri.class, dVar2).c(cls, AssetFileDescriptor.class, aVar2).c(Integer.class, AssetFileDescriptor.class, aVar2).c(cls, Uri.class, dVar2).c(String.class, InputStream.class, new oa1.c()).c(Uri.class, InputStream.class, new oa1.c()).c(String.class, InputStream.class, new h48.c()).c(String.class, ParcelFileDescriptor.class, new h48.b()).c(String.class, AssetFileDescriptor.class, new h48.a()).c(Uri.class, InputStream.class, new fb3.a()).c(Uri.class, InputStream.class, new xt.c(context.getAssets())).c(Uri.class, ParcelFileDescriptor.class, new xt.b(context.getAssets())).c(Uri.class, InputStream.class, new to4.a(context)).c(Uri.class, InputStream.class, new vo4.a(context));
        registry.c(Uri.class, InputStream.class, new cb6.c(context));
        registry.c(Uri.class, ParcelFileDescriptor.class, new cb6.b(context));
        registry.c(Uri.class, InputStream.class, new xy8.d(contentResolver)).c(Uri.class, ParcelFileDescriptor.class, new xy8.b(contentResolver)).c(Uri.class, AssetFileDescriptor.class, new xy8.a(contentResolver)).c(Uri.class, InputStream.class, new kz8.a()).c(URL.class, InputStream.class, new ez8.a()).c(Uri.class, File.class, new so4.a(context)).c(z03.class, InputStream.class, new ua3.a()).c(byte[].class, ByteBuffer.class, new af0.a()).c(byte[].class, InputStream.class, new af0.d()).c(Uri.class, Uri.class, zw8.a.a()).c(Drawable.class, Drawable.class, zw8.a.a()).d(Drawable.class, Drawable.class, new yw8()).q(Bitmap.class, BitmapDrawable.class, new q80(resources)).q(Bitmap.class, byte[].class, n80Var).q(Drawable.class, byte[].class, new jv1(w80Var, n80Var, mz2Var)).q(lz2.class, byte[].class, mz2Var);
        iz6 d = k79.d(w80Var);
        registry.d(ByteBuffer.class, Bitmap.class, d);
        registry.d(ByteBuffer.class, BitmapDrawable.class, new o80(resources, d));
        this.d = new c(context, toVar, registry, new gh3(), interfaceC0146a, map, list, hVar, z, i);
    }

    private static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (m) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        m = true;
        m(context, generatedAppGlideModule);
        m = false;
    }

    public static a c(Context context) {
        if (l == null) {
            GeneratedAppGlideModule d = d(context.getApplicationContext());
            synchronized (a.class) {
                try {
                    if (l == null) {
                        a(context, d);
                    }
                } finally {
                }
            }
        }
        return l;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e) {
            q(e);
            return null;
        } catch (InstantiationException e2) {
            q(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            q(e3);
            return null;
        } catch (InvocationTargetException e4) {
            q(e4);
            return null;
        }
    }

    private static ny6 l(Context context) {
        z06.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new b(), generatedAppGlideModule);
    }

    private static void n(Context context, b bVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new me4(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            generatedAppGlideModule.d();
            Iterator it2 = emptyList.iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it3 = emptyList.iterator();
            if (it3.hasNext()) {
                lh4.a(it3.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        bVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it4 = emptyList.iterator();
        if (it4.hasNext()) {
            lh4.a(it4.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, bVar);
        }
        a a = bVar.a(applicationContext);
        Iterator it5 = emptyList.iterator();
        if (it5.hasNext()) {
            lh4.a(it5.next());
            try {
                Registry registry = a.e;
                throw null;
            } catch (AbstractMethodError unused) {
                new StringBuilder().append("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                throw null;
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, a, a.e);
        }
        applicationContext.registerComponentCallbacks(a);
        l = a;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static e t(Context context) {
        return l(context).e(context);
    }

    public static e u(Fragment fragment) {
        return l(fragment.getContext()).f(fragment);
    }

    public void b() {
        x19.a();
        this.c.clearMemory();
        this.b.clearMemory();
        this.f.clearMemory();
    }

    public to e() {
        return this.f;
    }

    public w80 f() {
        return this.b;
    }

    ou0 g() {
        return this.h;
    }

    public Context h() {
        return this.d.getBaseContext();
    }

    c i() {
        return this.d;
    }

    public Registry j() {
        return this.e;
    }

    public ny6 k() {
        return this.g;
    }

    void o(e eVar) {
        synchronized (this.i) {
            try {
                if (this.i.contains(eVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.i.add(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        r(i);
    }

    boolean p(eg8 eg8Var) {
        synchronized (this.i) {
            try {
                Iterator it2 = this.i.iterator();
                while (it2.hasNext()) {
                    if (((e) it2.next()).y(eg8Var)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i) {
        x19.a();
        Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).onTrimMemory(i);
        }
        this.c.a(i);
        this.b.a(i);
        this.f.a(i);
    }

    void s(e eVar) {
        synchronized (this.i) {
            try {
                if (!this.i.contains(eVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.i.remove(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
