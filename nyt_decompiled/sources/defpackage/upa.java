package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.chartbeat.androidsdk.QueryKeys;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class upa {
    String d;
    Context e;
    String f;
    private AtomicBoolean h;
    private File i;
    final BlockingQueue a = new ArrayBlockingQueue(100);
    final LinkedHashMap b = new LinkedHashMap();
    final Map c = new HashMap();
    private final HashSet g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(upa upaVar) {
        while (true) {
            try {
                eqa eqaVar = (eqa) upaVar.a.take();
                dqa a = eqaVar.a();
                if (!TextUtils.isEmpty(a.b())) {
                    upaVar.g(upaVar.b(upaVar.b, eqaVar.b()), a);
                }
            } catch (InterruptedException e) {
                fgb.h("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void g(Map map, dqa dqaVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (dqaVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(dqaVar.b())) {
                sb.append("&it=");
                sb.append(dqaVar.b());
            }
            if (!TextUtils.isEmpty(dqaVar.a())) {
                sb.append("&blat=");
                sb.append(dqaVar.a());
            }
            uri = sb.toString();
        }
        if (!this.h.get()) {
            dyf.r();
            wxf.k(this.e, this.f, uri);
            return;
        }
        File file = this.i;
        if (file == null) {
            fgb.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                fgb.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            fgb.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    fgb.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    fgb.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                }
            }
            throw th;
        }
    }

    public final aqa a(String str) {
        aqa aqaVar = (aqa) this.c.get(str);
        return aqaVar != null ? aqaVar : aqa.a;
    }

    final Map b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, a(str).a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.e = context;
        this.f = str;
        this.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.h = atomicBoolean;
        atomicBoolean.set(((Boolean) lra.c.e()).booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.b.put((String) entry.getKey(), (String) entry.getValue());
        }
        pgb.a.execute(new Runnable() { // from class: tpa
            @Override // java.lang.Runnable
            public final void run() {
                upa.c(upa.this);
            }
        });
        Map map2 = this.c;
        aqa aqaVar = aqa.b;
        map2.put("action", aqaVar);
        this.c.put("ad_format", aqaVar);
        this.c.put(QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, aqa.c);
    }

    public final void e(String str) {
        if (this.g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f);
        linkedHashMap.put("ue", str);
        g(b(this.b, linkedHashMap), null);
    }

    public final boolean f(eqa eqaVar) {
        return this.a.offer(eqaVar);
    }
}
